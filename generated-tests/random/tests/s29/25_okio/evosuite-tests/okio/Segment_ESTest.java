/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 13:57:06 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import okio.Segment;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Segment_ESTest extends Segment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = segment0.unsharedCopy();
      segment0.next = segment1;
      segment0.writeTo(segment1, 3734);
      segment0.push(segment1);
      Segment segment2 = segment1.split(950);
      segment2.split(950);
      segment1.compact();
      assertFalse(segment1.equals((Object)segment2));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.limit = 8187;
      Segment segment1 = segment0.unsharedCopy();
      assertFalse(segment1.equals((Object)segment0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Segment segment0 = new Segment(byteArray0, (-1), (byte)127, false, false);
      // Undeclared exception!
      try { 
        segment0.split((byte)127);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Segment segment0 = new Segment(byteArray0, (byte) (-7), (byte) (-7), true, true);
      Segment segment1 = new Segment();
      segment0.prev = segment1;
      // Undeclared exception!
      try { 
        segment0.prev.compact();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Segment segment0 = new Segment();
      // Undeclared exception!
      try { 
        segment0.pop();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Segment segment0 = new Segment(byteArray0, 10371, 10371, true, true);
      Segment segment1 = segment0.unsharedCopy();
      // Undeclared exception!
      try { 
        segment0.writeTo(segment1, (byte) (-93));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.shared = true;
      segment0.limit = 8187;
      // Undeclared exception!
      try { 
        segment0.writeTo(segment0, 8187);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.limit = 8187;
      // Undeclared exception!
      try { 
        segment0.writeTo(segment0, 8187);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.owner = false;
      // Undeclared exception!
      try { 
        segment0.writeTo(segment0, (-2590));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      Segment segment0 = new Segment(byteArray0, 10, 8192, false, true);
      Segment segment1 = new Segment(byteArray0, (byte) (-101), (byte) (-1), false, true);
      segment0.prev = segment1;
      segment0.compact();
      assertFalse(segment0.equals((Object)segment1));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Segment segment0 = new Segment(byteArray0, 8192, (-648), true, true);
      Segment segment1 = new Segment(byteArray0, 1, 8192, true, true);
      segment0.prev = segment1;
      // Undeclared exception!
      try { 
        segment0.compact();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Segment segment0 = new Segment();
      byte[] byteArray0 = new byte[5];
      Segment segment1 = new Segment(byteArray0, 0, 1912, false, false);
      segment0.prev = segment1;
      segment0.compact();
      assertFalse(segment0.equals((Object)segment1));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.next = segment0;
      Segment segment1 = segment0.push(segment0);
      // Undeclared exception!
      try { 
        segment1.compact();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Segment segment0 = new Segment(byteArray0, (byte)43, 1873, true, true);
      // Undeclared exception!
      try { 
        segment0.split(1024);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      Segment segment0 = new Segment(byteArray0, 61, (-363), true, true);
      // Undeclared exception!
      try { 
        segment0.split(486);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Segment segment0 = new Segment((byte[]) null, 0, 0, true, true);
      // Undeclared exception!
      try { 
        segment0.split(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment1.prev = segment0;
      segment1.prev.next = segment0;
      // Undeclared exception!
      try { 
        segment1.prev.pop();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Segment segment0 = new Segment();
      // Undeclared exception!
      try { 
        segment0.push(segment0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = segment0.sharedCopy();
      assertFalse(segment1.equals((Object)segment0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = segment0.unsharedCopy();
      segment0.next = segment1;
      segment0.writeTo(segment1, 3734);
      Segment segment2 = segment0.push(segment1);
      Segment segment3 = segment1.split(950);
      segment1.compact();
      segment0.writeTo(segment1, 3734);
      assertSame(segment1, segment2);
      assertNotSame(segment1, segment3);
  }
}