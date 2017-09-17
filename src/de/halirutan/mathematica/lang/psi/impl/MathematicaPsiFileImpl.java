/*
 * Copyright (c) 2013 Patrick Scheibe
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

package de.halirutan.mathematica.lang.psi.impl;

import com.google.common.collect.Sets;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.ResolveState;
import com.intellij.psi.scope.PsiScopeProcessor;
import de.halirutan.mathematica.lang.MathematicaLanguage;
import de.halirutan.mathematica.file.MathematicaFileType;
import de.halirutan.mathematica.lang.psi.api.MathematicaPsiFile;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA. User: patrick Date: 1/3/13 Time: 12:09 PM Purpose:
 */
public class MathematicaPsiFileImpl extends PsiFileBase implements MathematicaPsiFile {

  private final Set<String> myFileDefintions = Sets.newHashSet();
  private boolean myRecacheDefinitions = false;

  public MathematicaPsiFileImpl(@NotNull FileViewProvider viewProvider) {
    super(viewProvider, MathematicaLanguage.INSTANCE);
  }

  @Override
  public void cacheDefinition(@NotNull final String name) {
    if (myRecacheDefinitions) {
      myFileDefintions.clear();
      myRecacheDefinitions = false;
    }
    myFileDefintions.add(name);
  }

  @Override
  public void subtreeChanged() {
    super.subtreeChanged();
    myRecacheDefinitions = true;
  }

  @Override
  public Set<String> getCachedDefinitions() {
    return myFileDefintions;
  }

  @NotNull
  @Override
  public FileType getFileType() {
    return MathematicaFileType.INSTANCE;
  }

  @Override
  public boolean processDeclarations(@NotNull PsiScopeProcessor processor, @NotNull ResolveState state, PsiElement lastParent, @NotNull PsiElement place) {
//    PsiElement children[] = getChildren();
//    for (PsiElement child : children) {
//      if (child.equals(lastParent)) {
//        continue;
//      }
//      if (!child.processDeclarations(processor, state, this, place)) return false;
//    }
    return true;
  }

  @Override
  public boolean headMatches(final Class clazz) {
    return clazz.isInstance(this);
  }
}
