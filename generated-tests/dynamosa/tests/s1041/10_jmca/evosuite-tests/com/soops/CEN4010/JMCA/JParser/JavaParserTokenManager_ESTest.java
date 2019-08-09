/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 05 18:20:29 GMT 2019
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JavaCharStream;
import com.soops.CEN4010.JMCA.JParser.JavaParserConstants;
import com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager;
import com.soops.CEN4010.JMCA.JParser.Token;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JavaParserTokenManager_ESTest extends JavaParserTokenManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(ds6!e=.D;9Oed8s");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, (-2477), (-1357), 97);
      javaCharStream0.bufpos = (-2477);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.getNextToken();
      javaCharStream0.readChar();
      javaParserTokenManager0.getNextToken();
      Token token0 = javaParserTokenManager0.getNextToken();
      assertEquals(1, javaCharStream0.bufpos);
      assertEquals(87, token0.kind);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("4:V^");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 102, 1027, 50);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.getNextToken();
       //  fail("Expecting exception: ArrayIndexOutOfBoundsException");
       // Unstable assertion
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2147483646
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("h.jYW-,{1ef");
      StringReader stringReader1 = new StringReader("h.jYW-,{1ef");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 31, 5, 531);
      javaCharStream0.ReadByte();
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.SkipLexicalActions(token0);
      assertEquals(0, javaCharStream0.bufpos);
      assertEquals(85, token0.kind);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("4:V^");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, (-242), (-242), 101);
      javaCharStream0.ReadByte();
      stringReader0.reset();
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      JavaParserTokenManager javaParserTokenManager1 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      assertEquals((-242), javaCharStream0.getBeginColumn());
      assertEquals(92, token0.kind);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = JavaParserConstants.LPAREN;
      StringReader stringReader0 = new StringReader("<HETTER>");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 16, 77, 89);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.MoreLexicalActions();
      assertEquals(0, javaCharStream0.bufpos);
      assertEquals(77, javaCharStream0.getEndColumn());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      StringReader stringReader0 = new StringReader("double");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 2145388542, 949, 949);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.getNextToken();
      Token token0 = javaParserTokenManager0.getNextToken();
      assertEquals(0, javaCharStream0.bufpos);
      assertEquals(0, token0.kind);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("final");
      StringReader stringReader1 = new StringReader("?:V^");
      stringReader0.read();
      stringReader1.ready();
      StringReader stringReader2 = new StringReader(";Ni#'%U]");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader2, 1017, 102, 3067);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      stringReader2.read();
      javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.jjFillToken();
      // Undeclared exception!
      try { 
        javaParserTokenManager0.getNextToken();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Lexical error at line 1017, column 104.  Encountered: \"#\" (35), after : \"\"
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("bJ+9s((@]OU]`K%6c");
      StringReader stringReader1 = new StringReader("^<mp%;~9");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader1);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      stringReader1.read();
      javaParserTokenManager0.getNextToken();
      Token.GTToken token_GTToken0 = new Token.GTToken();
      Token token0 = token_GTToken0.next;
      javaParserTokenManager0.SkipLexicalActions((Token) null);
      assertEquals(0, javaCharStream0.bufpos);
      assertEquals(1, javaCharStream0.getColumn());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("v");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 10, 10, 10);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      assertEquals("v", token0.toString());
      assertEquals(74, token0.kind);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"^\"");
      StringReader stringReader1 = new StringReader("\"continue\"");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      int int0 = JavaParserConstants.INTEGER_LITERAL;
      javaParserTokenManager0.getNextToken();
      assertEquals(2, javaCharStream0.bufpos);
      assertEquals(3, javaCharStream0.getColumn());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{*v4/?M");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, (-2483), (-2483), 97);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.getNextToken();
      Token token0 = javaParserTokenManager0.getNextToken();
      assertEquals((-2477), javaCharStream0.getBeginColumn());
      assertEquals(74, token0.kind);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("}DVZLf+yQvmY?M-&.y");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 308, 308);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      char[] charArray0 = new char[5];
      charArray0[1] = ' ';
      charArray0[2] = 'h';
      charArray0[3] = 'j';
      charArray0[4] = ' ';
      stringReader0.read(charArray0);
      javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.getNextToken();
      assertEquals(1, javaCharStream0.bufpos);
      assertEquals(309, javaCharStream0.getColumn());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("h.jYW-,{1ef");
      StringReader stringReader1 = new StringReader("h.jYW-,{1ef");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 31, 5, 531);
      javaCharStream0.ReadByte();
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.getNextToken();
      Token token0 = javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.SkipLexicalActions(token0);
      assertEquals(6, javaCharStream0.getBeginColumn());
      assertEquals("jYW", token0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("@$%C0sQQK89UK:");
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)53;
      byteArray0[1] = (byte)106;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "\"`\"},2Xe[g]=FA");
      JavaCharStream javaCharStream1 = new JavaCharStream(byteArrayInputStream0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream1);
      MockPrintStream mockPrintStream0 = new MockPrintStream(javaParserTokenManager0.debugStream);
      PrintStream printStream0 = mockPrintStream0.printf("", (Object[]) javaParserTokenManager0.jjstrLiteralImages);
      javaParserTokenManager0.debugStream = printStream0;
      // Undeclared exception!
      try { 
        javaParserTokenManager0.getNextToken();
       //  fail("Expecting exception: ArrayIndexOutOfBoundsException");
       // Unstable assertion
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2147483646
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)39;
      byteArray0[1] = (byte)101;
      byteArray0[2] = (byte)24;
      byteArray0[3] = (byte)101;
      byteArray0[5] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.getNextToken();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Lexical error at line 1, column 3.  Encountered: \"\\u0018\" (24), after : \"\\'e\"
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("cF)*");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 16, 16, 16);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      assertEquals(1, javaCharStream0.bufpos);
      assertEquals("cF", token0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      int int0 = 65;
      JavaCharStream javaCharStream0 = new JavaCharStream(sequenceInputStream0, 65, 0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      sequenceInputStream0.mark(65);
      StringBuffer stringBuffer0 = new StringBuffer("Y|c");
      sequenceInputStream0.markSupported();
      javaParserTokenManager0.image = stringBuffer0;
      javaParserTokenManager0.MoreLexicalActions();
      // Undeclared exception!
      try { 
        javaParserTokenManager0.ReInit(javaCharStream0, (-1676));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -1676. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Token.GTToken token_GTToken0 = new Token.GTToken();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      StringReader stringReader0 = new StringReader("wU>+(L(");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 20, 0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      JavaParserTokenManager javaParserTokenManager1 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.MoreLexicalActions();
      Token token0 = javaParserTokenManager1.getNextToken();
      assertEquals(0, javaCharStream0.bufpos);
      assertEquals("w", token0.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringReader stringReader0 = new StringReader("i@6v");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, (-2872), (-2872));
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.getNextToken();
      Token.newToken((-2872));
      // Undeclared exception!
      try { 
        javaParserTokenManager0.getNextToken();
       //  fail("Expecting exception: ArrayIndexOutOfBoundsException");
       // Unstable assertion
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2147483646
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("h.jYW-,{1ef");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, (-2088), (-1737), 4103);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.TokenLexicalActions(token0);
      assertEquals(0, javaCharStream0.bufpos);
      assertEquals("h", token0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("7PL[ ~=%%wZ}/3!vgP");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      stringReader0.read();
      Token token0 = javaParserTokenManager0.getNextToken();
      assertEquals(1, javaCharStream0.bufpos);
      assertEquals("PL", token0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Token.GTToken token_GTToken0 = new Token.GTToken();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)19;
      byteArray0[1] = (byte) (-96);
      byteArray0[2] = (byte)116;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      StringReader stringReader0 = new StringReader("prXvat3");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 0, 0, 0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      JavaParserTokenManager javaParserTokenManager1 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager1.getNextToken();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JavaCharStream javaCharStream1 = new JavaCharStream(pipedInputStream0);
      JavaCharStream javaCharStream2 = new JavaCharStream(stringReader0, 0, 0);
      JavaParserTokenManager javaParserTokenManager2 = new JavaParserTokenManager(javaCharStream2);
      javaParserTokenManager1.getNextToken();
      assertEquals(0, javaCharStream0.bufpos);
      assertEquals(6, javaCharStream0.getColumn());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("SQs^.>Sy$RU'1~`");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, (-1357), 125, 125);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.SkipLexicalActions(token0);
      javaCharStream0.prevCharIsCR = true;
      Token token1 = javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.jjFillToken();
      javaParserTokenManager0.TokenLexicalActions(token1);
      Token token2 = javaParserTokenManager0.getNextToken();
      assertEquals(5, javaCharStream0.bufpos);
      assertEquals(">", token2.toString());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("bJ+9s((@]OU]`K%6c");
      StringReader stringReader1 = new StringReader("{*v4/?M");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader1, (-2483), (-2483), 97);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.getNextToken();
      JavaParserTokenManager javaParserTokenManager1 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager1.getNextToken();
      javaParserTokenManager0.jjFillToken();
      javaParserTokenManager1.getNextToken();
      javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.getNextToken();
      assertEquals(4, javaCharStream0.bufpos);
      assertEquals((-2478), javaCharStream0.getColumn());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("fnal");
      StringReader stringReader1 = new StringReader("?:V^");
      stringReader0.read();
      stringReader1.ready();
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 102, (-1089), 994);
      javaCharStream0.ReadByte();
      stringReader0.reset();
      StringReader stringReader2 = new StringReader("fnal");
      JavaCharStream javaCharStream1 = new JavaCharStream((Reader) null, (-2846), 994, 11);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      stringReader1.read();
      Token token0 = javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.TokenLexicalActions(token0);
      assertEquals(5, javaCharStream0.bufpos);
      assertEquals((-1084), javaCharStream0.getEndColumn());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("bJ+9s((@]OU]`K%6c");
      StringReader stringReader1 = new StringReader("bJ+9s((@]OU]`K%6c");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 3, 125, 901);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      char[] charArray0 = new char[3];
      charArray0[0] = 't';
      charArray0[1] = 'E';
      charArray0[2] = '8';
      stringReader1.read(charArray0);
      stringReader0.read(charArray0);
      JavaCharStream javaCharStream1 = new JavaCharStream(stringReader1, 1377, 36, 24);
      JavaCharStream javaCharStream2 = new JavaCharStream(stringReader0, 3, 36, 3);
      JavaParserTokenManager javaParserTokenManager1 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = Token.newToken(121);
      javaParserTokenManager1.SkipLexicalActions(token0);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.getNextToken();
       //  fail("Expecting exception: ArrayIndexOutOfBoundsException");
       // Unstable assertion
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2147483646
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("l");
      StringReader stringReader1 = new StringReader("l");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 0, 0, 48);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.SkipLexicalActions(token0);
      assertEquals(74, token0.kind);
      assertEquals("l", token0.toString());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringReader stringReader0 = new StringReader("f0na");
      char[] charArray0 = new char[6];
      charArray0[0] = '7';
      charArray0[1] = '7';
      charArray0[2] = '\"';
      charArray0[3] = ' ';
      charArray0[4] = '7';
      charArray0[5] = '7';
      stringReader0.read(charArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 4, 4, 4);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      JavaParserTokenManager javaParserTokenManager1 = new JavaParserTokenManager(javaCharStream0);
      JavaParserTokenManager javaParserTokenManager2 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager2.getNextToken();
      javaParserTokenManager0.getNextToken();
      javaParserTokenManager2.getNextToken();
      Token.GTToken token_GTToken0 = new Token.GTToken();
      Token token0 = token_GTToken0.next;
      javaParserTokenManager1.TokenLexicalActions((Token) null);
      javaParserTokenManager0.getNextToken();
      JavaParserTokenManager javaParserTokenManager3 = null;
      try {
        javaParserTokenManager3 = new JavaParserTokenManager(javaCharStream0, 4);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 4. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringReader stringReader0 = new StringReader("abstracit");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 125, (-2088), 61);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.TokenLexicalActions(token0);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.ReInit(javaCharStream0, 125);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 125. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("}DVZLf+yQvmY?M-&.y");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      JavaParserTokenManager javaParserTokenManager1 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.getNextToken();
      JavaParserTokenManager javaParserTokenManager2 = new JavaParserTokenManager(javaCharStream0, 1);
      // Undeclared exception!
      try { 
        javaParserTokenManager2.getNextToken();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Lexical error at line 1, column 3.  Encountered: \"V\" (86), after : \"\"
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringReader stringReader0 = new StringReader("SQs^.>Sy$RU'1~`");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 125, 125, 49);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      JavaParserTokenManager javaParserTokenManager1 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager1.getNextToken();
      javaParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        javaParserTokenManager1.ReInit(javaCharStream0, 66);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 66. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "f0na");
      StringReader stringReader0 = new StringReader("f0na");
      stringReader0.read();
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 102, (-17), 51);
      javaCharStream0.ReadByte();
      stringReader0.reset();
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = new Token();
      javaParserTokenManager0.TokenLexicalActions(token0);
      javaParserTokenManager0.getNextToken();
      assertEquals(5, javaCharStream0.bufpos);
      assertEquals((-12), javaCharStream0.getColumn());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringReader stringReader0 = new StringReader("@$%C0sQQK89UK:");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 1322, 1322, 48);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaCharStream0.backup(1322);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.getNextToken();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("f0na");
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)55;
      byteArray0[1] = (byte)55;
      byteArray0[2] = (byte)55;
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, (byte)55, 2329, (byte)55);
      JavaCharStream javaCharStream1 = new JavaCharStream(stringReader0);
      javaCharStream1.ReadByte();
      StringReader stringReader1 = new StringReader("+3Ts06A7");
      stringReader1.reset();
      JavaCharStream javaCharStream2 = new JavaCharStream(stringReader1);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream2);
      javaParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        javaParserTokenManager0.getNextToken();
       //  fail("Expecting exception: ArrayIndexOutOfBoundsException");
       // Unstable assertion
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2147483646
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Token.GTToken token_GTToken0 = new Token.GTToken();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      StringReader stringReader0 = new StringReader("/");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 0, 684);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.ReInit(javaCharStream0);
      JavaParserTokenManager javaParserTokenManager1 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager1.jjnewStateCnt = 4753;
      JavaParserTokenManager javaParserTokenManager2 = new JavaParserTokenManager(javaCharStream0, 0);
      javaParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        javaParserTokenManager0.ReInit(javaCharStream0, 40);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 40. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringReader stringReader0 = new StringReader("7PL[ ~=%%wZ}/3!vgP");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, (-2477), (-1357), 97);
      StringReader stringReader1 = new StringReader("");
      StringReader stringReader2 = new StringReader("");
      char[] charArray0 = new char[8];
      charArray0[0] = 'u';
      charArray0[1] = 'b';
      charArray0[2] = 'h';
      charArray0[3] = '\"';
      stringReader2.read();
      charArray0[4] = '%';
      charArray0[5] = ':';
      charArray0[6] = 'v';
      charArray0[7] = 'o';
      stringReader2.read(charArray0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.curLexState = (-1615);
      javaParserTokenManager0.getNextToken();
      JavaParserTokenManager javaParserTokenManager1 = new JavaParserTokenManager(javaCharStream0);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.getNextToken();
       //  fail("Expecting exception: Error");
       // Unstable assertion
      } catch(Error e) {
         //
         // Lexical error at line -2477, column -1355.  Encountered: \"L\" (76), after : \"\"
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringReader stringReader0 = new StringReader("}DVZLf+yQvmY?M-&.y");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 308, 308);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      char[] charArray0 = new char[5];
      charArray0[0] = '7';
      charArray0[1] = ' ';
      charArray0[2] = 'h';
      charArray0[3] = '^';
      charArray0[4] = '7';
      stringReader0.read(charArray0);
      JavaParserTokenManager javaParserTokenManager1 = new JavaParserTokenManager(javaCharStream0);
      JavaParserTokenManager javaParserTokenManager2 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.jjmatchedPos = 109;
      javaParserTokenManager1.getNextToken();
      javaParserTokenManager2.TokenLexicalActions(token0);
      javaParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        javaParserTokenManager0.SwitchTo(308);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 308. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringReader stringReader0 = new StringReader("4:V^");
      StringReader stringReader1 = new StringReader("zvOw'dG.jg)/bl");
      stringReader1.read();
      stringReader1.ready();
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader1, 122, 661, 48);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.SkipLexicalActions(token0);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.getNextToken();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Lexical error at line 122, column 666.  Encountered: \"G\" (71), after : \"\\'d\"
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = "";
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = null;
      try {
        javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0, (-1));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -1. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StringReader stringReader0 = new StringReader("}DVZLf+yQvmY?M-&.y");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, (-1201), 335);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.ReInit(javaCharStream0);
      javaParserTokenManager0.jjround = 0;
      javaParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        javaParserTokenManager0.SwitchTo(335);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 335. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StringReader stringReader0 = new StringReader("nTC}LH~{&FBU#y/8C");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.getNextToken();
      assertEquals(2, javaCharStream0.bufpos);
      assertEquals(3, javaCharStream0.getColumn());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null, 5038);
      JavaCharStream javaCharStream0 = new JavaCharStream(bufferedInputStream0, 5038, 5038);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token.GTToken token_GTToken0 = new Token.GTToken();
      Token token0 = token_GTToken0.specialToken;
      javaParserTokenManager0.SkipLexicalActions((Token) null);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StringReader stringReader0 = new StringReader("7QL[ ~=%%wZ}/3!vgP");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.getNextToken();
       //  fail("Expecting exception: ArrayIndexOutOfBoundsException");
       // Unstable assertion
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2147483646
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.jjFillToken();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StringReader stringReader0 = new StringReader("4:V^");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.getNextToken();
       //  fail("Expecting exception: ArrayIndexOutOfBoundsException");
       // Unstable assertion
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2147483646
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }
}
