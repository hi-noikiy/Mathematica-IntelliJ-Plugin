/*
 * Copyright (c) 2014 Patrick Scheibe
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package de.halirutan.mathematica.parsing.psi.util;

import com.intellij.psi.PsiElement;
import com.intellij.psi.search.PsiElementProcessor;
import de.halirutan.mathematica.parsing.psi.api.Symbol;
import de.halirutan.mathematica.parsing.psi.api.assignment.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author patrick (1/6/14)
 */
public class MathematicaGlobalSymbolProcessor implements PsiElementProcessor {
  public static final int MAX_UPWARD_STEPS = 3;
  private final Symbol myStartElement;
  private PsiElement myReferringSymbol;

  public MathematicaGlobalSymbolProcessor(Symbol startElement) {
    this.myStartElement = startElement;
    this.myReferringSymbol = null;
  }

  @Override
  public boolean execute(@NotNull PsiElement element) {
    if (element instanceof Set || element instanceof SetDelayed
        || element instanceof TagSet || element instanceof TagSetDelayed
        || element instanceof UpSet || element instanceof UpSetDelayed) {
      MathematicaPatternVisitor patternVisitor = new MathematicaPatternVisitor();
      element.accept(patternVisitor);
      java.util.Set<Symbol> assignmentSymbols = patternVisitor.getUnboundSymbols();

      if (assignmentSymbols != null) {

        if ((element instanceof Set || element instanceof SetDelayed || element instanceof TagSet || element instanceof TagSetDelayed) && assignmentSymbols.size() > 0) {
          Symbol symbol = assignmentSymbols.iterator().next();
          if (symbol.getSymbolName().equals(myStartElement.getSymbolName())) {
            myReferringSymbol = symbol;
            return false;
          }
        } else if ((element instanceof UpSet || element instanceof UpSetDelayed) && assignmentSymbols.size() > 0) {
          for (Symbol symbol : assignmentSymbols) {
            if (symbol.getSymbolName().equals(myStartElement.getSymbolName())) {
              myReferringSymbol = symbol;
              return false;
            }
          }
        }
      }
    }
    return true;
  }

  @Nullable
  public PsiElement getMyReferringSymbol() {
    return myReferringSymbol;
  }

}