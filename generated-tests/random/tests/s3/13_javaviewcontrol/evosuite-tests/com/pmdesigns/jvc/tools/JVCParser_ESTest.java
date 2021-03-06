/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 11:34:38 GMT 2019
 */

package com.pmdesigns.jvc.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.pmdesigns.jvc.tools.JVCParser;
import com.pmdesigns.jvc.tools.JVCParserTokenManager;
import com.pmdesigns.jvc.tools.SimpleCharStream;
import com.pmdesigns.jvc.tools.Token;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.Reader;
import java.io.StringReader;
import java.nio.CharBuffer;
import java.util.Locale;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JVCParser_ESTest extends JVCParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader("setCachedBlock(\"");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      String string0 = jVCParser0.parse();
      assertEquals("_sb.append(\"setCachedBlock(\\\"\");", string0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("`uY*4");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      Token token0 = jVCParser0.getToken(40);
      assertEquals(5, token0.endColumn);
      
      jVCParser0.generateParseException();
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("`d;wIlnIlt");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      Token token0 = jVCParser0.getToken((-2942));
      assertNotNull(token0);
      assertEquals(100, jVCParser0.debugColumn);
      assertEquals(0, token0.endColumn);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JVCParser jVCParser0 = new JVCParser((Reader) null);
      jVCParser0.ReInit((Reader) null);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "[[";
      try { 
        JVCParser.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null);
      JVCParser jVCParser0 = new JVCParser(jVCParserTokenManager0);
      StringReader stringReader0 = new StringReader(" ");
      // Undeclared exception!
      try { 
        jVCParser0.ReInit((Reader) stringReader0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("`uY*4");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      PipedInputStream pipedInputStream0 = new PipedInputStream(96);
      // Undeclared exception!
      try { 
        jVCParser0.ReInit((InputStream) pipedInputStream0, "(0))9a38dBHC,b");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.UnsupportedEncodingException: (0))9a38dBHC,b
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      JVCParser jVCParser0 = null;
      try {
        jVCParser0 = new JVCParser("~=f8Yv'?`h", set0, true);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(360);
      JVCParser jVCParser0 = null;
      try {
        jVCParser0 = new JVCParser(pipedInputStream0, "d");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.UnsupportedEncodingException: d
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JVCParser jVCParser0 = new JVCParser(byteArrayInputStream0, (String) null);
      jVCParser0.ReInit((InputStream) byteArrayInputStream0, (String) null);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("`uY*4");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      // Undeclared exception!
      try { 
        jVCParser0.generateParseException();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.ParseException", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("jVquCA_?p");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      Token token0 = jVCParser0.getToken(1429);
      Token token1 = jVCParser0.getToken(374);
      assertNotSame(token1, token0);
      assertEquals(100, jVCParser0.debugColumn);
      assertEquals(9, token1.endColumn);
      assertEquals(1, token1.beginLine);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 9, 9);
      JVCParser jVCParser0 = new JVCParser(byteArrayInputStream0, (String) null);
      Token token0 = jVCParser0.getToken(9);
      assertNotNull(token0);
      
      Token token1 = jVCParser0.getNextToken();
      assertEquals(100, jVCParser0.debugColumn);
      assertNotSame(token1, token0);
      assertNotNull(token1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<IMPORT>");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      Token token0 = jVCParser0.getToken(7);
      token0.kind = 100;
      // Undeclared exception!
      try { 
        jVCParser0.parse();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 100
         //
         verifyException("com.pmdesigns.jvc.tools.ParseException", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("`uY*4");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      jVCParser0.ReInit(jVCParser0.token_source);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader(",<N7HM~$|~e)");
      CharBuffer charBuffer0 = CharBuffer.allocate(1254);
      stringReader0.read(charBuffer0);
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      jVCParser0.parse();
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"[[!\"");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      jVCParser0.getNextToken();
      try { 
        jVCParser0.parse();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unbalanced tag at end of null
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"[[!\"");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      try { 
        jVCParser0.parse();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unbalanced tag at end of null
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        JVCParser.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[3];
      JVCParser.main(stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[0];
      JVCParser.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-14), (byte)75);
      JVCParser jVCParser0 = new JVCParser(byteArrayInputStream0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      JVCParser jVCParser0 = null;
      try {
        jVCParser0 = new JVCParser("", set0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 9, 9);
      JVCParser jVCParser0 = new JVCParser(byteArrayInputStream0, (String) null);
      jVCParser0.ReInit((InputStream) byteArrayInputStream0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null);
      JVCParser jVCParser0 = new JVCParser(jVCParserTokenManager0);
      jVCParser0.enable_tracing();
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader(",<N7HM~$|~e)");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      jVCParser0.disable_tracing();
      assertEquals(100, jVCParser0.debugColumn);
  }
}
