/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 04 05:00:11 GMT 2019
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
      Segment segment1 = new Segment();
      segment0.next = segment0;
      Segment segment2 = segment0.push(segment1);
      segment0.writeTo(segment1, 8192);
      segment2.split(744);
      // Undeclared exception!
      try { 
        segment0.writeTo(segment2, 744);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.writeTo(segment0, 1657);
      Segment segment1 = new Segment();
      segment0.writeTo(segment1, 1657);
      // Undeclared exception!
      try { 
        segment0.writeTo(segment0, 8171);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.writeTo(segment0, 1924);
      segment0.writeTo(segment0, 8171);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Segment segment0 = new Segment();
      // Undeclared exception!
      try { 
        segment0.writeTo(segment0, 8213);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment1.writeTo(segment1, 8192);
      segment0.writeTo(segment1, 8189);
      assertNotSame(segment0, segment1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Segment segment0 = new Segment();
      byte[] byteArray0 = new byte[3];
      Segment segment1 = new Segment(byteArray0, 246, (-3261), false, true);
      segment0.prev = segment1;
      // Undeclared exception!
      try { 
        segment0.compact();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment0.next = segment0;
      Segment segment2 = segment0.push(segment1);
      segment0.writeTo(segment1, 8192);
      Segment segment3 = segment2.split(744);
      segment2.compact();
      assertNotSame(segment2, segment3);
      assertNotSame(segment0, segment3);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.limit = 520;
      segment0.next = segment0;
      Segment segment1 = new Segment();
      Segment segment2 = segment0.push(segment1);
      segment0.push(segment1);
      Segment segment3 = segment0.split(520);
      assertNotSame(segment3, segment0);
      assertNotSame(segment3, segment2);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      Segment segment0 = new Segment(byteArray0, (-5883), (byte)0, false, false);
      segment0.next = segment0;
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
  public void test09()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment0.next = segment0;
      Segment segment2 = segment0.push(segment1);
      segment0.writeTo(segment2, 3533);
      assertNotSame(segment2, segment0);
      
      Segment segment3 = segment0.next.split(1158);
      assertNotSame(segment3, segment0);
      assertNotSame(segment3, segment2);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment0.next = segment0;
      Segment segment2 = segment0.push(segment1);
      segment1.pos = 8192;
      segment0.next.unsharedCopy();
      assertNotSame(segment0, segment2);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = segment0.unsharedCopy();
      assertNotSame(segment1, segment0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.next = segment0;
      Segment segment1 = segment0.push(segment0);
      Segment segment2 = segment1.pop();
      assertNull(segment2);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.next = segment0;
      Segment segment1 = new Segment();
      Segment segment2 = segment0.next.push(segment1);
      Segment segment3 = segment2.pop();
      assertNotNull(segment3);
      assertSame(segment3, segment0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.writeTo(segment0, 0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Segment segment0 = new Segment();
      // Undeclared exception!
      try { 
        segment0.split((-1332));
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
      // Undeclared exception!
      try { 
        segment0.push((Segment) null);
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
        segment0.writeTo((Segment) null, (-388));
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
  public void test19()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.writeTo(segment0, 1662);
      segment0.sharedCopy();
      // Undeclared exception!
      try { 
        segment0.writeTo(segment0, 8171);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = segment0.sharedCopy();
      // Undeclared exception!
      try { 
        segment0.writeTo(segment1, 1924);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment0.next = segment0;
      Segment segment2 = segment0.push(segment1);
      Segment segment3 = segment2.push(segment1);
      segment0.writeTo(segment1, 8192);
      Segment segment4 = segment3.split(8192);
      segment4.compact();
      assertNotSame(segment3, segment4);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment0.next = segment0;
      Segment segment2 = segment0.push(segment1);
      Segment segment3 = segment2.push(segment0.next);
      segment0.writeTo(segment1, 8192);
      segment1.split(8192);
      segment0.next.compact();
      assertNotSame(segment0, segment2);
      assertNotSame(segment0, segment3);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.next = segment0;
      segment0.push(segment0);
      // Undeclared exception!
      try { 
        segment0.next.compact();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.pos = (-12400);
      // Undeclared exception!
      try { 
        segment0.split(905);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Segment segment0 = new Segment();
      // Undeclared exception!
      try { 
        segment0.split(620);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Segment segment0 = new Segment();
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
  public void test27()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = segment0.sharedCopy();
      segment1.prev = segment0;
      // Undeclared exception!
      try { 
        segment1.compact();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Segment segment0 = new Segment((byte[]) null, 48, 48, false, false);
      // Undeclared exception!
      try { 
        segment0.unsharedCopy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }
}
