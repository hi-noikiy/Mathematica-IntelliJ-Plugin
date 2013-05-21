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

/* The following code was generated by JFlex 1.4.3 on 5/4/13 5:06 AM */

package de.halirutan.mathematica.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import de.halirutan.mathematica.parsing.MathematicaElementTypes;

import java.util.LinkedList;


/**
 * This class is a scanner generated by <a href="http://www.jflex.de/">JFlex</a> 1.4.3 on 5/4/13 5:06 AM from the
 * specification file <tt>Mathematica.flex</tt>
 */
class _MathematicaLexer implements FlexLexer {
  /**
   * initial size of the lookahead buffer
   */
  private static final int ZZ_BUFFERSIZE = 16384;

  /**
   * lexical states
   */
  public static final int IN_STRING = 4;
  public static final int YYINITIAL = 0;
  public static final int IN_COMMENT = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l ZZ_LEXSTATE[l+1] is the state in the DFA for the
   * lexical state l at the beginning of a line l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
      0, 0, 1, 1, 2, 2
  };

  /**
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED =
      "\11\0\1\3\1\1\1\0\1\3\1\2\22\0\1\3\1\43\1\30" +
          "\1\26\1\7\1\27\1\51\1\52\1\4\1\6\1\5\1\44\1\46" +
          "\1\25\1\23\1\34\1\10\1\22\1\16\1\17\1\20\1\20\1\20" +
          "\1\21\1\21\1\21\1\35\1\40\1\41\1\36\1\37\1\47\1\33" +
          "\32\15\1\13\1\12\1\14\1\24\1\42\1\11\32\15\1\31\1\50" +
          "\1\32\1\45\uff81\0";

  /**
   * Translates characters to character classes
   */
  private static final char[] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int[] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
      "\1\0\1\1\1\0\1\2\1\3\1\4\1\5\1\6" +
          "\1\7\1\10\1\11\1\12\1\2\1\13\1\14\4\11" +
          "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24" +
          "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34" +
          "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44" +
          "\4\1\2\45\1\46\1\47\1\50\1\51\1\10\1\0" +
          "\2\11\1\52\2\4\2\0\1\53\1\0\1\54\1\55" +
          "\1\56\1\57\1\20\1\60\1\61\1\62\1\63\1\64" +
          "\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74" +
          "\1\0\1\75\1\76\1\77\1\100\1\101\1\102\1\103" +
          "\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113" +
          "\2\45\1\0\1\11\4\0\1\114\1\115\1\116\1\117" +
          "\1\120\1\121\1\122\1\123\1\124\1\11\1\0\1\11" +
          "\1\10\2\11";

  private static int[] zzUnpackAction() {
    int[] result = new int[121];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int[] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int[] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
      "\0\0\0\53\0\126\0\201\0\254\0\327\0\u0102\0\u012d" +
          "\0\201\0\u0158\0\u0183\0\u01ae\0\u01d9\0\201\0\201\0\u0204" +
          "\0\u022f\0\u025a\0\u0285\0\u02b0\0\u02db\0\u0306\0\u0331\0\u035c" +
          "\0\201\0\201\0\201\0\u0387\0\u03b2\0\u03dd\0\u0408\0\u0433" +
          "\0\u045e\0\u0489\0\u04b4\0\u04df\0\u050a\0\u0535\0\201\0\201" +
          "\0\u0560\0\u058b\0\201\0\u05b6\0\u0102\0\u05e1\0\201\0\u060c" +
          "\0\u0637\0\201\0\201\0\201\0\201\0\u0662\0\u068d\0\u06b8" +
          "\0\u06e3\0\201\0\201\0\u070e\0\u0739\0\u0764\0\u078f\0\u07ba" +
          "\0\201\0\201\0\201\0\201\0\u07e5\0\u0810\0\u083b\0\201" +
          "\0\201\0\u0866\0\201\0\201\0\201\0\201\0\201\0\201" +
          "\0\201\0\u0891\0\u08bc\0\201\0\u08e7\0\201\0\201\0\201" +
          "\0\201\0\201\0\u0912\0\201\0\201\0\201\0\201\0\201" +
          "\0\201\0\201\0\201\0\u093d\0\u0968\0\u0993\0\u09be\0\u09e9" +
          "\0\u0a14\0\u0a3f\0\201\0\201\0\201\0\201\0\201\0\201" +
          "\0\201\0\201\0\201\0\u0a6a\0\u0a6a\0\u0a95\0\201\0\u0ac0" +
          "\0\u0aeb";

  private static int[] zzUnpackRowMap() {
    int[] result = new int[121];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int[] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int[] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
      "\1\4\2\5\1\6\1\7\1\10\1\11\1\12\1\13" +
          "\1\14\1\15\1\16\1\17\1\12\1\20\1\21\2\22" +
          "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32" +
          "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42" +
          "\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52" +
          "\1\53\4\54\1\55\1\56\1\57\44\54\12\60\1\61" +
          "\15\60\1\62\22\60\54\0\2\5\53\0\1\6\54\0" +
          "\1\63\52\0\1\64\30\0\1\65\23\0\2\12\1\66" +
          "\3\0\6\12\35\0\1\67\2\0\1\13\1\70\4\0" +
          "\5\13\1\71\36\0\1\12\1\0\1\72\3\0\1\12" +
          "\36\0\1\73\1\74\10\0\1\75\44\0\1\67\2\0" +
          "\1\22\1\70\4\0\5\22\1\71\1\76\33\0\1\67" +
          "\2\0\1\22\1\70\4\0\3\22\1\13\1\22\1\71" +
          "\1\76\33\0\1\67\2\0\1\13\1\70\4\0\5\13" +
          "\1\71\1\76\33\0\1\67\2\0\1\22\1\70\4\0" +
          "\5\22\1\71\37\0\1\71\5\0\5\71\1\77\64\0" +
          "\1\100\1\101\41\0\1\102\10\0\1\103\1\104\23\0" +
          "\1\105\5\0\5\105\3\0\1\106\53\0\1\30\56\0" +
          "\1\107\42\0\1\110\7\0\1\111\1\112\1\113\1\114" +
          "\1\0\1\115\47\0\1\116\1\117\1\120\36\0\1\121" +
          "\12\0\1\122\4\0\1\123\45\0\1\124\1\125\53\0" +
          "\1\126\50\0\1\127\1\130\1\0\1\131\34\0\1\132" +
          "\16\0\1\133\46\0\1\134\52\0\1\135\5\0\1\136" +
          "\53\0\1\137\55\0\1\140\53\0\1\141\1\0\4\54" +
          "\3\0\44\54\6\0\1\142\44\0\12\60\1\0\15\60" +
          "\1\0\22\60\1\0\1\143\1\144\7\0\1\143\15\0" +
          "\1\143\31\0\1\12\5\0\1\12\61\0\1\145\33\0" +
          "\1\67\2\0\1\146\1\147\4\0\5\146\1\150\34\0" +
          "\1\67\2\0\1\71\1\70\4\0\5\71\31\0\1\73" +
          "\60\0\1\151\5\0\1\151\61\0\1\152\51\0\1\153" +
          "\65\0\1\154\24\0\1\105\5\0\5\105\40\0\1\106" +
          "\5\0\5\106\63\0\1\155\42\0\1\156\7\0\1\157" +
          "\55\0\1\160\52\0\1\161\53\0\1\162\55\0\1\163" +
          "\11\0\1\143\61\0\1\164\5\0\5\164\2\0\1\165" +
          "\32\0\1\67\2\0\1\146\5\0\5\146\1\166\37\0" +
          "\1\146\5\0\5\146\1\150\37\0\1\166\5\0\5\166" +
          "\37\0\2\151\3\0\1\167\6\151\40\0\1\170\4\0" +
          "\6\170\40\0\1\164\5\0\5\164\35\0\1\67\2\0" +
          "\1\166\5\0\5\166\40\0\1\170\1\70\3\0\6\170" +
          "\1\171\37\0\1\171\1\70\3\0\6\171\30\0";

  private static int[] zzUnpackTrans() {
    int[] result = new int[2838];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int[] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
      "Unkown internal scanner error",
      "Error: could not match input",
      "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int[] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
      "\1\0\1\1\1\0\1\11\4\1\1\11\4\1\2\11" +
          "\11\1\3\11\13\1\2\11\2\1\1\11\3\1\1\11" +
          "\2\1\4\11\1\1\1\0\2\1\2\11\1\1\2\0" +
          "\1\1\1\0\4\11\3\1\2\11\1\1\7\11\1\1" +
          "\1\0\1\11\1\1\5\11\1\1\10\11\1\1\1\0" +
          "\1\1\4\0\11\11\1\1\1\0\1\1\1\11\2\1";

  private static int[] zzUnpackAttribute() {
    int[] result = new int[121];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int[] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * the current state of the DFA
   */
  private int zzState;

  /**
   * the current lexical state
   */
  private int zzLexicalState = YYINITIAL;

  /**
   * this buffer contains the current text to be matched and is the source of the yytext() string
   */
  private CharSequence zzBuffer = "";

  /**
   * this buffer may contains the current text array to be matched when it is cheap to acquire it
   */
  private char[] zzBufferArray;

  /**
   * the textposition at the last accepting state
   */
  private int zzMarkedPos;

  /**
   * the textposition at the last state to be included in yytext
   */
  private int zzPushbackPos;

  /**
   * the current text position in the buffer
   */
  private int zzCurrentPos;

  /**
   * startRead marks the beginning of the yytext() string in the buffer
   */
  private int zzStartRead;

  /**
   * endRead marks the last character in the buffer, that has been read from input
   */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /**
   * zzAtEOF == true <=> the scanner is at the EOF
   */
  private boolean zzAtEOF;

  /**
   * denotes if the user-EOF-code has already been executed
   */
  private boolean zzEOFDone;

  /* user code: */
  // This adds support for nested states. I'm no JFlex pro, so maybe this is overkill, but it works quite well.
  private final LinkedList<Integer> states = new LinkedList();

  private void yypushstate(int state) {
    states.addFirst(yystate());
    yybegin(state);
  }

  private void yypopstate() {
    final int state = states.removeFirst();
    yybegin(state);
  }


  _MathematicaLexer(java.io.Reader in) {
    zzReader = in;
  }

  /**
   * Creates a new scanner. There is also java.io.Reader version of this constructor.
   *
   * @param in the java.io.Inputstream to read input from.
   */
  _MathematicaLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /**
   * Unpacks the compressed character translation table.
   *
   * @param packed the packed character translation table
   * @return the unpacked character translation table
   */
  private static char[] zzUnpackCMap(String packed) {
    char[] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 106) {
      int count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return <code>false</code>, iff there was new input.
   * @throws java.io.IOException if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the matched text.
   * <p/>
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. A value from 0 to yylength()-1.
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead + pos] : zzBuffer.charAt(zzStartRead + pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos - zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   * <p/>
   * In a wellformed scanner (no or only correct usage of yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen". If this method is called, something is seriously
   * wrong (e.g. a JFlex bug producing a faulty scanner etc.).
   * <p/>
   * Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   * <p/>
   * They will be read again by then next call of the scanning method
   *
   * @param number the number of characters to be read again. This number must not be greater than yylength()!
   */
  public void yypushback(int number) {
    if (number > yylength())
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once, when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;

    }
  }


  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered or an I/O-Error
   * occurs.
   *
   * @return the next token
   * @throws java.io.IOException if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char[] zzCMapL = ZZ_CMAP;

    int[] zzTransL = ZZ_TRANS;
    int[] zzRowMapL = ZZ_ROWMAP;
    int[] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction:
      {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL.charAt(zzCurrentPosL++);
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          } else {
            // store back cached positions
            zzCurrentPos = zzCurrentPosL;
            zzMarkedPos = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL = zzCurrentPos;
            zzMarkedPosL = zzMarkedPos;
            zzBufferL = zzBuffer;
            zzEndReadL = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            } else {
              zzInput = zzBufferL.charAt(zzCurrentPosL++);
            }
          }
          int zzNext = zzTransL[zzRowMapL[zzState] + zzCMapL[zzInput]];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ((zzAttributes & 1) == 1) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ((zzAttributes & 8) == 8) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 6: {
          return MathematicaElementTypes.TIMES;
        }
        case 85:
          break;
        case 4: {
          return MathematicaElementTypes.WHITE_SPACE;
        }
        case 86:
          break;
        case 22: {
          return MathematicaElementTypes.DIVIDE;
        }
        case 87:
          break;
        case 11: {
          return MathematicaElementTypes.LEFT_BRACKET;
        }
        case 88:
          break;
        case 69: {
          return MathematicaElementTypes.UNEQUAL;
        }
        case 89:
          break;
        case 83: {
          return MathematicaElementTypes.PUT_APPEND;
        }
        case 90:
          break;
        case 68: {
          return MathematicaElementTypes.BLANK_SEQUENCE;
        }
        case 91:
          break;
        case 53: {
          return MathematicaElementTypes.TAG_SET;
        }
        case 92:
          break;
        case 73: {
          return MathematicaElementTypes.OR;
        }
        case 93:
          break;
        case 31: {
          return MathematicaElementTypes.INFIX_CALL;
        }
        case 94:
          break;
        case 59: {
          return MathematicaElementTypes.UNSET;
        }
        case 95:
          break;
        case 58: {
          return MathematicaElementTypes.RULE_DELAYED;
        }
        case 96:
          break;
        case 44: {
          return MathematicaElementTypes.UP_SET;
        }
        case 97:
          break;
        case 72: {
          return MathematicaElementTypes.STRING_EXPRESSION;
        }
        case 98:
          break;
        case 17: {
          return MathematicaElementTypes.OUT;
        }
        case 99:
          break;
        case 5: {
          return MathematicaElementTypes.LEFT_PAR;
        }
        case 100:
          break;
        case 75: {
          yypopstate();
          return MathematicaElementTypes.COMMENT;
        }
        case 101:
          break;
        case 48: {
          return MathematicaElementTypes.SLOT_SEQUENCE;
        }
        case 102:
          break;
        case 62: {
          return MathematicaElementTypes.PUT;
        }
        case 103:
          break;
        case 18: {
          yypushstate(IN_STRING);
          return MathematicaElementTypes.STRING_LITERAL_BEGIN;
        }
        case 104:
          break;
        case 64: {
          return MathematicaElementTypes.LESS_EQUAL;
        }
        case 105:
          break;
        case 28: {
          return MathematicaElementTypes.BLANK;
        }
        case 106:
          break;
        case 34: {
          return MathematicaElementTypes.ALTERNATIVE;
        }
        case 107:
          break;
        case 50: {
          return MathematicaElementTypes.REPLACE_ALL;
        }
        case 108:
          break;
        case 39: {
          yypushstate(IN_COMMENT);
          return MathematicaElementTypes.COMMENT;
        }
        case 109:
          break;
        case 47: {
          return MathematicaElementTypes.RULE;
        }
        case 110:
          break;
        case 76: {
          return MathematicaElementTypes.REPEATED_NULL;
        }
        case 111:
          break;
        case 26: {
          return MathematicaElementTypes.SEMICOLON;
        }
        case 112:
          break;
        case 1: {
          return MathematicaElementTypes.COMMENT;
        }
        case 113:
          break;
        case 16: {
          return MathematicaElementTypes.SLOT;
        }
        case 114:
          break;
        case 29: {
          return MathematicaElementTypes.EXCLAMATION_MARK;
        }
        case 115:
          break;
        case 15: {
          return MathematicaElementTypes.MINUS;
        }
        case 116:
          break;
        case 9: {
          return MathematicaElementTypes.NUMBER;
        }
        case 117:
          break;
        case 61: {
          return MathematicaElementTypes.GREATER_EQUAL;
        }
        case 118:
          break;
        case 78: {
          return MathematicaElementTypes.APPLY1;
        }
        case 119:
          break;
        case 12: {
          return MathematicaElementTypes.RIGHT_BRACKET;
        }
        case 120:
          break;
        case 51: {
          return MathematicaElementTypes.MAP;
        }
        case 121:
          break;
        case 33: {
          return MathematicaElementTypes.QUESTION_MARK;
        }
        case 122:
          break;
        case 20: {
          return MathematicaElementTypes.RIGHT_BRACE;
        }
        case 123:
          break;
        case 57: {
          return MathematicaElementTypes.SET_DELAYED;
        }
        case 124:
          break;
        case 56: {
          return MathematicaElementTypes.DOUBLE_COLON;
        }
        case 125:
          break;
        case 19: {
          return MathematicaElementTypes.LEFT_BRACE;
        }
        case 126:
          break;
        case 67: {
          return MathematicaElementTypes.DEFAULT;
        }
        case 127:
          break;
        case 77: {
          return MathematicaElementTypes.UP_SET_DELAYED;
        }
        case 128:
          break;
        case 36: {
          return MathematicaElementTypes.DERIVATIVE;
        }
        case 129:
          break;
        case 66: {
          return MathematicaElementTypes.GET;
        }
        case 130:
          break;
        case 3: {
          return MathematicaElementTypes.LINE_BREAK;
        }
        case 131:
          break;
        case 49: {
          return MathematicaElementTypes.APPLY;
        }
        case 132:
          break;
        case 27: {
          return MathematicaElementTypes.LESS;
        }
        case 133:
          break;
        case 7: {
          return MathematicaElementTypes.RIGHT_PAR;
        }
        case 134:
          break;
        case 71: {
          return MathematicaElementTypes.INCREMENT;
        }
        case 135:
          break;
        case 54: {
          return MathematicaElementTypes.DIVIDE_BY;
        }
        case 136:
          break;
        case 60: {
          return MathematicaElementTypes.EQUAL;
        }
        case 137:
          break;
        case 21: {
          return MathematicaElementTypes.PREFIX_CALL;
        }
        case 138:
          break;
        case 2: {
          return MathematicaElementTypes.BAD_CHARACTER;
        }
        case 139:
          break;
        case 70: {
          return MathematicaElementTypes.ADD_TO;
        }
        case 140:
          break;
        case 14: {
          return MathematicaElementTypes.POWER;
        }
        case 141:
          break;
        case 23: {
          return MathematicaElementTypes.COLON;
        }
        case 142:
          break;
        case 52: {
          return MathematicaElementTypes.POSTFIX;
        }
        case 143:
          break;
        case 10: {
          return MathematicaElementTypes.BACK_TICK;
        }
        case 144:
          break;
        case 65: {
          return MathematicaElementTypes.STRING_JOIN;
        }
        case 145:
          break;
        case 13: {
          return MathematicaElementTypes.POINT;
        }
        case 146:
          break;
        case 79: {
          return MathematicaElementTypes.REPLACE_REPEATED;
        }
        case 147:
          break;
        case 84: {
          return MathematicaElementTypes.BLANK_NULL_SEQUENCE;
        }
        case 148:
          break;
        case 74: {
          return MathematicaElementTypes.AND;
        }
        case 149:
          break;
        case 40: {
          return MathematicaElementTypes.NON_COMMUTATIVE_MULTIPLY;
        }
        case 150:
          break;
        case 45: {
          return MathematicaElementTypes.DECREMENT;
        }
        case 151:
          break;
        case 38: {
          yypopstate();
          return MathematicaElementTypes.STRING_LITERAL_END;
        }
        case 152:
          break;
        case 42: {
          return MathematicaElementTypes.ACCURACY;
        }
        case 153:
          break;
        case 25: {
          return MathematicaElementTypes.GREATER;
        }
        case 154:
          break;
        case 41: {
          return MathematicaElementTypes.TIMES_BY;
        }
        case 155:
          break;
        case 82: {
          return MathematicaElementTypes.UNSAME_Q;
        }
        case 156:
          break;
        case 37: {
          return MathematicaElementTypes.STRING_LITERAL;
        }
        case 157:
          break;
        case 43: {
          return MathematicaElementTypes.REPEATED;
        }
        case 158:
          break;
        case 55: {
          return MathematicaElementTypes.CONDITION;
        }
        case 159:
          break;
        case 32: {
          return MathematicaElementTypes.COMMA;
        }
        case 160:
          break;
        case 24: {
          return MathematicaElementTypes.SET;
        }
        case 161:
          break;
        case 46: {
          return MathematicaElementTypes.SUBTRACT_FROM;
        }
        case 162:
          break;
        case 63: {
          return MathematicaElementTypes.SPAN;
        }
        case 163:
          break;
        case 8: {
          return MathematicaElementTypes.IDENTIFIER;
        }
        case 164:
          break;
        case 80: {
          return MathematicaElementTypes.MAP_ALL;
        }
        case 165:
          break;
        case 81: {
          return MathematicaElementTypes.SAME_Q;
        }
        case 166:
          break;
        case 30: {
          return MathematicaElementTypes.PLUS;
        }
        case 167:
          break;
        case 35: {
          return MathematicaElementTypes.FUNCTION;
        }
        case 168:
          break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          } else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
