/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 14:14:01 GMT 2019
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
      SegmentPool.next = segment0;
      segment0.writeTo(SegmentPool.next, 2493);
      Segment segment1 = new Segment();
      segment1.writeTo(segment0, 2493);
      segment0.writeTo(SegmentPool.next, 4060);
      assertFalse(segment0.equals((Object)segment1));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Segment segment0 = new Segment();
      SegmentPool.next = segment0;
      Segment segment1 = SegmentPool.next.unsharedCopy();
      segment0.writeTo(SegmentPool.next, 8192);
      segment1.writeTo(segment0, (byte)118);
      assertFalse(segment1.equals((Object)segment0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Segment segment0 = new Segment();
      SegmentPool.next = segment0;
      SegmentPool.next.writeTo(segment0, 118);
      segment0.writeTo(SegmentPool.next, 8192);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Segment segment0 = new Segment();
      SegmentPool.next = segment0;
      Segment segment1 = SegmentPool.next.unsharedCopy();
      segment0.next = segment1;
      segment0.writeTo(SegmentPool.next, 8192);
      SegmentPool.next.sharedCopy();
      SegmentPool.next.push(segment0);
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
  public void test04()  throws Throwable  {
      Segment segment0 = new Segment();
      byte[] byteArray0 = new byte[4];
      segment0.pos = (int) (byte) (-1);
      Segment segment1 = new Segment(byteArray0, (byte)0, 1024, true, true);
      segment1.prev = segment0;
      // Undeclared exception!
      try { 
        segment1.compact();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      Segment segment0 = new Segment(byteArray0, (byte)108, 1, false, true);
      SegmentPool.next = segment0;
      SegmentPool.next.limit = 4828;
      // Undeclared exception!
      try { 
        SegmentPool.next.split(2809);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment0.next = segment1;
      Segment segment2 = segment0.push(segment1);
      assertNotNull(segment2);
      assertNotSame(segment2, segment0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.pos = (-510);
      Segment segment1 = segment0.unsharedCopy();
      assertNotSame(segment0, segment1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment0.next = segment0;
      Segment segment2 = segment0.push(segment1);
      segment0.compact();
      assertFalse(segment0.equals((Object)segment2));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Segment segment0 = new Segment();
      byte[] byteArray0 = new byte[4];
      Segment segment1 = new Segment(byteArray0, (byte) (-15), 1024, false, false);
      segment1.prev = segment0;
      SegmentPool.next = segment0;
      SegmentPool.next.next = segment0;
      Segment segment2 = segment1.split(1024);
      assertNotNull(segment2);
      assertNotSame(segment2, segment0);
      assertNotSame(segment2, segment1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.next = segment0;
      segment0.push(segment0);
      Segment segment1 = segment0.pop();
      assertNull(segment1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment0.next = segment0;
      Segment segment2 = segment0.push(segment1);
      Segment segment3 = segment1.pop();
      assertNotSame(segment3, segment2);
      assertNotNull(segment3);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.writeTo(segment0, 0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Segment segment0 = new Segment(byteArray0, (byte)66, (byte) (-121), true, false);
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
  public void test14()  throws Throwable  {
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
  public void test15()  throws Throwable  {
      Segment segment0 = new Segment();
      // Undeclared exception!
      try { 
        segment0.writeTo((Segment) null, (-991));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Segment segment0 = new Segment();
      SegmentPool.next = segment0;
      SegmentPool.next.next = segment0;
      // Undeclared exception!
      try { 
        segment0.writeTo(SegmentPool.next.next, (-416));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      Segment segment0 = new Segment(byteArray0, (-4172), 1, false, true);
      // Undeclared exception!
      try { 
        segment0.split((byte)108);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Segment segment0 = new Segment();
      byte[] byteArray0 = new byte[4];
      Segment segment1 = new Segment(byteArray0, (byte) (-15), 1024, false, true);
      segment1.prev = segment0;
      // Undeclared exception!
      try { 
        segment1.compact();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Segment segment0 = new Segment(byteArray0, 0, 1, true, true);
      Segment segment1 = new Segment(byteArray0, (-3206), 8192, false, true);
      // Undeclared exception!
      try { 
        segment0.writeTo(segment1, 605);
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
      byte[] byteArray0 = new byte[2];
      Segment segment0 = new Segment(byteArray0, 0, 1, true, true);
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
  public void test22()  throws Throwable  {
      Segment segment0 = new Segment();
      byte[] byteArray0 = new byte[0];
      Segment segment1 = new Segment(byteArray0, (-1), 1024, true, false);
      // Undeclared exception!
      try { 
        segment0.writeTo(segment1, 8192);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Segment segment0 = new Segment();
      SegmentPool.next = segment0;
      Segment segment1 = SegmentPool.next.unsharedCopy();
      segment0.next = segment1;
      segment0.writeTo(SegmentPool.next, 8192);
      segment0.next.limit = 8192;
      SegmentPool.next.sharedCopy();
      SegmentPool.next.push(segment0);
      segment1.compact();
      assertFalse(segment1.equals((Object)segment0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Segment segment0 = new Segment();
      byte[] byteArray0 = new byte[4];
      segment0.owner = false;
      Segment segment1 = new Segment(byteArray0, (byte) (-15), 1024, false, false);
      segment1.prev = segment0;
      segment1.compact();
      assertFalse(segment1.equals((Object)segment0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Segment segment0 = new Segment(byteArray0, (byte)0, 1024, true, true);
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
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      Segment segment0 = new Segment(byteArray0, 0, 1, false, true);
      // Undeclared exception!
      try { 
        segment0.split(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
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
  public void test28()  throws Throwable  {
      Segment segment0 = new Segment();
      // Undeclared exception!
      try { 
        segment0.split((byte) (-15));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }
}
