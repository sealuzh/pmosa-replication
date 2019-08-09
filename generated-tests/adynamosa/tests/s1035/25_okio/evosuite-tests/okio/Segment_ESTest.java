/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 09:17:04 GMT 2019
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
      segment0.next = segment0;
      SegmentPool.next = segment0;
      segment0.writeTo(SegmentPool.next, 5290);
      SegmentPool.next.writeTo(segment0.next, 5290);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.next = segment0;
      Segment segment1 = new Segment();
      segment0.next.writeTo(segment0.next, 8192);
      segment1.writeTo(segment0.next, 8192);
      assertFalse(segment1.equals((Object)segment0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment0.next = segment0;
      Segment segment2 = segment0.push(segment1);
      segment1.writeTo(segment2, 3545);
      segment0.compact();
      assertNotSame(segment0, segment2);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment0.next = segment0;
      segment0.push(segment1);
      SegmentPool.next = segment1;
      segment0.next.limit = 8192;
      SegmentPool.next.compact();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment0.next = segment0;
      segment1.prev = segment0.next;
      SegmentPool.next = segment1;
      segment0.writeTo(SegmentPool.next, 8192);
      Segment segment2 = SegmentPool.next.split(8192);
      assertNotSame(segment2, segment1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Segment segment0 = new Segment(byteArray0, (-1308), 8192, false, true);
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
  public void test06()  throws Throwable  {
      Segment segment0 = new Segment();
      SegmentPool.next = segment0;
      segment0.writeTo(SegmentPool.next, 8192);
      // Undeclared exception!
      try { 
        SegmentPool.next.split(8192);
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
      Segment segment1 = new Segment();
      segment0.next = segment0;
      Segment segment2 = new Segment();
      segment0.push(segment2);
      segment0.push(segment1);
      segment0.next.compact();
      assertFalse(segment0.equals((Object)segment2));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Segment segment0 = new Segment(byteArray0, (-1), (-1), false, false);
      Segment segment1 = new Segment();
      segment0.next = segment1;
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
  public void test09()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.limit = 511;
      Segment segment1 = segment0.unsharedCopy();
      assertFalse(segment1.equals((Object)segment0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment0.next = segment0;
      segment0.push(segment1);
      segment0.next.compact();
      Segment segment2 = segment0.next.pop();
      assertNull(segment2);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      Segment segment0 = new Segment(byteArray0, 1024, (-3160), false, false);
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
  public void test13()  throws Throwable  {
      Segment segment0 = new Segment();
      // Undeclared exception!
      try { 
        segment0.writeTo((Segment) null, (-504));
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
      Segment segment0 = new Segment();
      SegmentPool.next = segment0;
      // Undeclared exception!
      try { 
        segment0.writeTo(SegmentPool.next, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Segment segment0 = new Segment(byteArray0, 0, (byte)107, false, false);
      // Undeclared exception!
      try { 
        segment0.split((byte)107);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Segment segment0 = new Segment();
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
  public void test17()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment1.writeTo(segment0, 1231);
      segment0.next = segment0;
      segment0.next.push(segment1);
      // Undeclared exception!
      try { 
        segment0.next.compact();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment0.next = segment0;
      Segment segment2 = segment0.push(segment1);
      Segment segment3 = segment0.pop();
      assertNotNull(segment3);
      assertSame(segment3, segment2);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.next = segment0;
      Segment segment1 = segment0.push(segment0);
      segment1.pos = 525;
      SegmentPool.next = segment0;
      segment0.next.limit = 8192;
      segment0.next.writeTo(SegmentPool.next, 525);
      assertSame(segment0, segment1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Segment segment0 = new Segment(byteArray0, 8192, 8192, true, true);
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

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.next = segment0;
      SegmentPool.next = segment0;
      segment0.next.limit = 8192;
      // Undeclared exception!
      try { 
        segment0.next.writeTo(SegmentPool.next, 525);
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
      segment0.next = segment0;
      Segment segment1 = segment0.next.sharedCopy();
      // Undeclared exception!
      try { 
        segment0.next.writeTo(segment1, 8192);
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
      Segment segment1 = new Segment();
      segment0.next = segment0;
      Segment segment2 = segment0.push(segment1);
      SegmentPool.next = segment1;
      segment1.writeTo(SegmentPool.next, 5311);
      Segment segment3 = new Segment();
      segment3.writeTo(segment0, 5822);
      SegmentPool.next.sharedCopy();
      segment0.compact();
      assertFalse(segment0.equals((Object)segment2));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment0.next = segment0;
      segment0.next.owner = false;
      Segment segment2 = segment0.push(segment1);
      segment2.compact();
      assertNotSame(segment2, segment0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment1.next = segment0;
      Segment segment2 = segment1.push(segment1);
      // Undeclared exception!
      try { 
        segment2.compact();
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
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment0.writeTo(segment1, 2493);
      // Undeclared exception!
      try { 
        segment1.split(107);
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
      Segment segment1 = new Segment();
      segment1.next = segment0;
      // Undeclared exception!
      try { 
        segment1.next.split((-168));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }
}
