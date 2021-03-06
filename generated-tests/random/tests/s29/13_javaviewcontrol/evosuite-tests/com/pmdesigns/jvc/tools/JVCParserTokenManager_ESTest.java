/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 13:52:38 GMT 2019
 */

package com.pmdesigns.jvc.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.pmdesigns.jvc.tools.JVCParserTokenManager;
import com.pmdesigns.jvc.tools.SimpleCharStream;
import com.pmdesigns.jvc.tools.Token;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JVCParserTokenManager_ESTest extends JVCParserTokenManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader("O");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit(simpleCharStream0, (-823));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -823. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("j,!t");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 41, 41);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.jjFillToken();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0, 0, 0);
      JVCParserTokenManager jVCParserTokenManager0 = null;
      try {
        jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, (-1));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -1. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte)126, (byte)126);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, (byte)0);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.SwitchTo((byte)126);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 126. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, 92, (byte) (-1), 46);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.SwitchTo((-1242));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -1242. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("O");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.ReInit(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{.hKByWMa");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 406, 406);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 1);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit(simpleCharStream0, 16);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 16. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte)126, (byte)126);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, (byte)0);
      simpleCharStream0.readChar();
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(127, token0.beginColumn);
      assertEquals(6, token0.kind);
      assertEquals(127, token0.endColumn);
      assertEquals(126, token0.beginLine);
      assertEquals("\n", token0.toString());
      assertEquals(126, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)126;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte)126, (byte)126);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, (byte)0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals("~", token0.toString());
      assertEquals(126, token0.endColumn);
      assertEquals(16, token0.kind);
      assertEquals(126, token0.beginColumn);
      assertEquals(126, token0.beginLine);
      assertEquals(126, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<EOF> ");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, token0.beginColumn);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{.hKByWMa");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 406, 406);
      simpleCharStream0.BeginToken();
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 1);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals(407, token0.beginColumn);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-111);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, 62, (-497));
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(62, token0.endLine);
      assertEquals("\uFFFD", token0.toString());
      assertEquals(16, token0.kind);
      assertEquals((-497), token0.endColumn);
      assertEquals((-497), token0.beginColumn);
      assertEquals(62, token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, 62, (-497));
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(16, token0.kind);
      assertEquals(62, token0.beginLine);
      assertEquals(62, token0.endLine);
      assertEquals((-497), token0.endColumn);
      assertEquals((-497), token0.beginColumn);
      assertEquals("\u0000", token0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("]cJLH");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 20, 20);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(20, token0.endColumn);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-1);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, 92, (byte) (-1), 46);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals((-1), token0.endColumn);
      assertEquals((-1), token0.beginColumn);
      assertEquals(92, token0.beginLine);
      assertEquals(92, token0.endLine);
      assertEquals(16, token0.kind);
      assertEquals("\uFFFD", token0.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("O");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0);
      assertEquals(1, simpleCharStream0.getEndLine());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 95, 101);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.bufpos);
      
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, token0.kind);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{.hKByWMa");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 406, 406);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 1);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(16, token0.kind);
      assertEquals(406, token0.endColumn);
      assertEquals(406, token0.beginLine);
      assertEquals("{", token0.toString());
      assertEquals(406, token0.beginColumn);
      assertEquals(406, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[\"");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 95, 56);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(56, token0.endColumn);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"[[!\"");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 95, 101);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(102, simpleCharStream0.getBeginColumn());
      assertEquals(95, token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0, (-237), 38);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(jVCParserTokenManager0.debugStream, false);
      jVCParserTokenManager0.setDebugStream(mockPrintStream0);
  }
}
