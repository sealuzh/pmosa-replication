/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 04:08:02 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import okio.Segment;
import okio.SegmentPool;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Segment_ESTest extends Segment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.limit = 972;
      segment0.writeTo(segment0, 4235);
      segment0.writeTo(segment0, 4235);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment0.writeTo(segment1, 4206);
      segment1.writeTo(segment0, 355);
      // Undeclared exception!
      try { 
        segment0.writeTo(segment1, 4206);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Segment segment0 = new Segment();
      Segment segment1 = new Segment(byteArray0, 8131, 692, false, true);
      // Undeclared exception!
      try { 
        segment0.writeTo(segment1, 8131);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment0.prev = segment1;
      segment0.prev.limit = 2289;
      segment0.pos = (int) (byte)1;
      segment0.limit = 5904;
      // Undeclared exception!
      try { 
        segment0.compact();
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
      Segment segment1 = new Segment();
      segment0.prev = segment1;
      segment0.pos = (-102);
      // Undeclared exception!
      try { 
        segment0.compact();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment0.prev = segment1;
      segment0.limit = 6442;
      segment0.prev.next = segment1;
      Segment segment2 = segment0.split(1024);
      assertNotNull(segment2);
      assertNotSame(segment2, segment0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment0.writeTo(segment1, 4182);
      // Undeclared exception!
      try { 
        segment1.split(4182);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Segment segment0 = new Segment(byteArray0, 680, 8192, true, true);
      Segment segment1 = segment0.unsharedCopy();
      assertNotSame(segment0, segment1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.next = segment0;
      Segment segment1 = new Segment();
      segment0.push(segment1);
      segment1.compact();
      assertFalse(segment1.equals((Object)segment0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment0.prev = segment1;
      segment1.next = segment0;
      segment0.limit = 6442;
      Segment segment2 = segment0.split(2250);
      assertFalse(segment2.equals((Object)segment0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.next = segment0;
      segment0.next.push(segment0);
      Segment segment1 = segment0.pop();
      assertNull(segment1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Segment segment0 = new Segment();
      byte[] byteArray0 = new byte[2];
      segment0.next = segment0;
      Segment segment1 = new Segment(byteArray0, (byte)0, (byte) (-69), true, true);
      Segment segment2 = segment0.push(segment1);
      Segment segment3 = segment2.pop();
      assertNotNull(segment3);
      assertNotSame(segment3, segment1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Segment segment0 = new Segment();
      // Undeclared exception!
      try { 
        segment0.writeTo(segment0.next, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Segment segment0 = new Segment();
      // Undeclared exception!
      try { 
        segment0.writeTo(segment0, (-102));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Segment segment0 = new Segment(byteArray0, (byte) (-18), 1472, false, false);
      // Undeclared exception!
      try { 
        segment0.split((-2616));
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
      byte[] byteArray0 = new byte[1];
      Segment segment0 = new Segment();
      Segment segment1 = new Segment(byteArray0, 8131, 8192, false, true);
      // Undeclared exception!
      try { 
        segment0.writeTo(segment1, 8131);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Segment segment0 = new Segment(byteArray0, (-3767), (byte)0, true, true);
      // Undeclared exception!
      try { 
        segment0.split(225);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
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
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Segment segment0 = new Segment(byteArray0, 680, 8192, true, true);
      segment0.shared = false;
      // Undeclared exception!
      try { 
        segment0.writeTo(segment0, 8192);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Segment segment0 = new Segment(byteArray0, 692, 8192, true, true);
      // Undeclared exception!
      try { 
        segment0.writeTo(segment0, 8192);
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
      Segment segment1 = new Segment();
      segment0.prev = segment1;
      segment0.prev.limit = 2250;
      segment0.limit = 6442;
      segment0.compact();
      assertFalse(segment0.equals((Object)segment1));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Segment segment0 = new Segment(byteArray0, (byte)0, 4721, false, true);
      Segment segment1 = new Segment();
      segment0.prev = segment1;
      segment0.prev.shared = true;
      // Undeclared exception!
      try { 
        segment0.compact();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment0.prev = segment1;
      segment0.prev.owner = false;
      segment0.compact();
      assertFalse(segment0.equals((Object)segment1));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Segment segment0 = new Segment(byteArray0, (byte)0, 4721, false, true);
      segment0.prev = segment0;
      // Undeclared exception!
      try { 
        segment0.compact();
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
      // Undeclared exception!
      try { 
        segment0.split(1024);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Segment segment0 = new Segment((byte[]) null, 343, 343, true, false);
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
  public void test26()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.prev = segment0;
      Segment segment1 = segment0.prev.unsharedCopy();
      assertFalse(segment1.equals((Object)segment0));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Segment segment0 = new Segment();
      // Undeclared exception!
      try { 
        segment0.push(segment0.prev);
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
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment0.prev = segment1;
      segment1.prev = segment0.prev;
      SegmentPool.next = segment1.prev;
      Segment segment2 = SegmentPool.next.sharedCopy();
      assertFalse(segment2.equals((Object)segment1));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Segment segment0 = new Segment(byteArray0, 448, 2289, true, false);
      // Undeclared exception!
      try { 
        segment0.writeTo(segment0, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }
}