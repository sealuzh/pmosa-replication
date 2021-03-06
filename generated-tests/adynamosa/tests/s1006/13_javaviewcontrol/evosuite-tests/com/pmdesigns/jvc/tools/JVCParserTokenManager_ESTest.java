/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 07:31:36 GMT 2019
 */

package com.pmdesigns.jvc.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.pmdesigns.jvc.tools.JVCParserTokenManager;
import com.pmdesigns.jvc.tools.SimpleCharStream;
import com.pmdesigns.jvc.tools.Token;
import java.io.ByteArrayInputStream;
import java.io.PipedInputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JVCParserTokenManager_ESTest extends JVCParserTokenManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "\\u";
      StringReader stringReader0 = new StringReader(string0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 6, 6);
      JVCParserTokenManager jVCParserTokenManager0 = null;
      try {
        jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 6);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 6. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[0DNU5:bN?I<Dg=");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.inBuf = 39;
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, token0.endColumn);
      assertEquals(0, token0.beginLine);
      assertEquals(0, token0.beginColumn);
      assertEquals(16, token0.kind);
      assertEquals(0, token0.endLine);
      assertEquals("\u0000", token0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[0DNU5:bN?I<Dg=");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.inBuf = 39;
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, token0.endLine);
      assertEquals(0, token0.endColumn);
      assertEquals("\u0000", token0.toString());
      assertEquals(0, token0.beginLine);
      assertEquals(0, token0.beginColumn);
      assertEquals(16, token0.kind);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[0_NU5:t@bN?<Dn=");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      char[] charArray0 = new char[7];
      stringReader0.read(charArray0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(16, token0.kind);
      assertEquals(1, token0.endColumn);
      assertEquals(1, token0.beginColumn);
      
      Token token1 = jVCParserTokenManager0.getNextToken();
      assertEquals(2, token1.endColumn);
      assertEquals(1, token1.beginLine);
      assertEquals(1, token1.endLine);
      assertEquals("@", token1.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[0_NU5:bN?(<Dg=");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      StringReader stringReader1 = new StringReader("[");
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(stringReader1);
      jVCParserTokenManager0.ReInit(simpleCharStream1);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, token0.endColumn);
      assertEquals(1, token0.beginColumn);
      assertEquals(1, token0.endLine);
      assertEquals(1, token0.beginLine);
      assertEquals(16, token0.kind);
      assertEquals("[", token0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader(";.U6$M<`[dl}aF");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.setDebugStream(jVCParserTokenManager0.debugStream);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(2545);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.SwitchTo(0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(2545);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit(simpleCharStream0, (-195));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -195. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null, 0);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit((SimpleCharStream) null, 104);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 104. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(2545);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0, 0);
      assertEquals(0, simpleCharStream0.getLine());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("V%a=TpoR,C[");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 10, 10, 32);
      simpleCharStream0.ReInit((Reader) stringReader0, (-994), 11, 32);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit(simpleCharStream0, 12);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 12. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("V%a=TpoR,C[");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 10, 10, 32);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit(simpleCharStream0, 12);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 12. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[+");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 11, 11, 11);
      simpleCharStream0.ReInit((Reader) stringReader0, 11, (-994), 11);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit(simpleCharStream0, 92);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 92. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[0DNU5:bN?I<Dg=");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.ReInit((SimpleCharStream) null);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(2545);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginLine());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 11, (-117));
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0);
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals((-116), simpleCharStream0.getEndColumn());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader(";.U6$M<`[dl}aF");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, simpleCharStream0.getBeginColumn());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("wQo!$Gw");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
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
  public void test18()  throws Throwable  {
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.SwitchTo(654);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 654. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.SwitchTo((-678));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -678. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[0DNU5:bN?I<Dg=");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.ReInit(simpleCharStream0, 0);
      simpleCharStream0.bufpos = (int) (byte)115;
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, token0.endColumn);
      assertEquals(16, token0.kind);
      assertEquals(1, token0.beginColumn);
      assertEquals(1, token0.beginLine);
      assertEquals(1, token0.endLine);
      assertEquals("\u0000", token0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringReader stringReader0 = new StringReader(";.U6$M<`[dl}aF");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      JVCParserTokenManager jVCParserTokenManager1 = new JVCParserTokenManager(simpleCharStream0, 2);
      jVCParserTokenManager1.getNextToken();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager1.getNextToken();
      jVCParserTokenManager0.getNextToken();
      Token token0 = jVCParserTokenManager1.getNextToken();
      assertEquals(8, simpleCharStream0.bufpos);
      assertEquals(9, token0.beginColumn);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[0DNU5:bN?I<Dg=");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.curLexState = (-1);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, token0.endLine);
      assertEquals(0, token0.kind);
      assertEquals(1, token0.beginLine);
      assertEquals("", token0.toString());
      assertEquals(1, token0.beginColumn);
      assertEquals(1, token0.endColumn);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[DNU5:b?I<g=");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.ReInit(simpleCharStream0, 0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, token0.endColumn);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("wQo!$Gw");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.SwitchTo(3);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals(2, token0.beginColumn);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("*_M[0DNU5:bN?I<Dg=");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.SwitchTo(1);
      jVCParserTokenManager0.getNextToken();
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(3, simpleCharStream0.bufpos);
      assertEquals(4, token0.beginColumn);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[0DNU5:bN?I<Dg=");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.SwitchTo(4);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(2, simpleCharStream0.bufpos);
      assertEquals("D", token0.toString());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringReader stringReader0 = new StringReader("]wCl");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-15);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, token0.endColumn);
      assertEquals(1, token0.endLine);
      assertEquals(16, token0.kind);
      assertEquals(1, token0.beginLine);
      assertEquals(1, token0.beginColumn);
      assertEquals("\uFFFD", token0.toString());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[!");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"[[\"");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, (-894));
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(2, simpleCharStream0.bufpos);
      assertEquals("[[", token0.toString());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[0DNU5:bN?I<Dg=");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.ReInit(simpleCharStream0, 0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals("D", token0.toString());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringReader stringReader0 = new StringReader(";.U6$M<`[dl}aF");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      JVCParserTokenManager jVCParserTokenManager1 = new JVCParserTokenManager(simpleCharStream0, 2);
      jVCParserTokenManager1.getNextToken();
      jVCParserTokenManager1.getNextToken();
      jVCParserTokenManager1.getNextToken();
      jVCParserTokenManager0.getNextToken();
      Token token0 = jVCParserTokenManager1.getNextToken();
      assertEquals(8, simpleCharStream0.bufpos);
      assertEquals(1, token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[0DNU5:bN?I<Dg=");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.SwitchTo(4);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals(1, token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[+");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 11, 11, 11);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      Token token0 = jVCParserTokenManager0.jjFillToken();
      assertEquals(2, simpleCharStream0.bufpos);
      assertEquals(13, token0.endColumn);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[0DNU5:bN?I<Dg=");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringReader stringReader0 = new StringReader(";.U6$M<`[dl}aF");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.SwitchTo(1);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      assertEquals(9, simpleCharStream0.getBeginColumn());
      assertEquals(9, simpleCharStream0.getEndColumn());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(2545);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.setDebugStream((PrintStream) null);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[0DNU5:bN?I<Dg=");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.ReInit(simpleCharStream0, 3);
      jVCParserTokenManager0.getNextToken();
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals(2, token0.beginColumn);
  }
}
