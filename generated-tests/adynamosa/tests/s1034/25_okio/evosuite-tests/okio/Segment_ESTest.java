/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 07:26:39 GMT 2019
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
      segment0.pos = 2798;
      SegmentPool.next = segment0;
      SegmentPool.next.next = segment0;
      SegmentPool.next.next.writeTo(SegmentPool.next, 0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment0.writeTo(segment1, 8147);
      segment1.writeTo(segment0, 1912);
      // Undeclared exception!
      try { 
        segment0.writeTo(segment1, 1231);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Segment segment0 = new Segment();
      SegmentPool.next = segment0;
      SegmentPool.next.prev = segment0;
      SegmentPool.next.prev.writeTo(segment0, 8192);
      SegmentPool.next.next = segment0;
      SegmentPool.next.next.writeTo(SegmentPool.next.prev, 8192);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.prev = segment0;
      segment0.prev.writeTo(segment0, 8163);
      Segment segment1 = new Segment();
      segment1.writeTo(segment0.prev, 258);
      assertNotSame(segment1, segment0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Segment segment0 = new Segment();
      SegmentPool.next = segment0;
      SegmentPool.next.prev = segment0;
      SegmentPool.next.prev.writeTo(segment0, 8192);
      SegmentPool.next.next = segment0;
      Segment segment1 = SegmentPool.next.prev.sharedCopy();
      Segment segment2 = SegmentPool.next.prev.push(segment1);
      segment1.compact();
      assertSame(segment1, segment2);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment1.pos = 3243;
      segment0.prev = segment1;
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
  public void test06()  throws Throwable  {
      Segment segment0 = new Segment();
      SegmentPool.next = segment0;
      SegmentPool.next.prev = SegmentPool.next;
      SegmentPool.next.prev.next = segment0;
      SegmentPool.next.prev.limit = 8435;
      Segment segment1 = SegmentPool.next.split(8435);
      assertNotSame(segment1, segment0);
      
      Segment segment2 = SegmentPool.next.prev.split(2170);
      assertNotSame(segment2, segment0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Segment segment0 = new Segment();
      SegmentPool.next = segment0;
      SegmentPool.next.prev = segment0;
      SegmentPool.next.prev.limit = 1286;
      // Undeclared exception!
      try { 
        SegmentPool.next.split(1024);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Segment segment0 = new Segment();
      SegmentPool.next = segment0;
      SegmentPool.next.writeTo(segment0, 244);
      // Undeclared exception!
      try { 
        SegmentPool.next.split(244);
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
      Segment segment0 = new Segment();
      // Undeclared exception!
      try { 
        segment0.split((-1284));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Segment segment0 = new Segment();
      SegmentPool.next = segment0;
      segment0.limit = 122;
      SegmentPool.next.prev = segment0;
      Segment segment1 = SegmentPool.next.prev.unsharedCopy();
      assertNotSame(segment1, segment0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.prev = segment0;
      byte[] byteArray0 = new byte[7];
      Segment segment1 = new Segment(byteArray0, 2036, 2036, true, false);
      segment0.prev.next = segment1;
      Segment segment2 = segment0.pop();
      assertSame(segment2, segment1);
      assertNotNull(segment2);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      Segment segment0 = new Segment();
      // Undeclared exception!
      try { 
        segment0.writeTo((Segment) null, 0);
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
      // Undeclared exception!
      try { 
        segment0.writeTo(segment0, (byte) (-72));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      Segment segment0 = new Segment(byteArray0, 0, 408, true, true);
      // Undeclared exception!
      try { 
        segment0.split(328);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment0.prev = segment1;
      segment0.pos = (-2832);
      // Undeclared exception!
      try { 
        segment0.compact();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Segment segment0 = new Segment();
      SegmentPool.next = segment0;
      SegmentPool.next.prev = segment0;
      SegmentPool.next.prev.next = segment0;
      Segment segment1 = SegmentPool.next.prev.next.pop();
      assertNull(segment1);
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
      SegmentPool.next = segment0;
      SegmentPool.next.prev = SegmentPool.next;
      SegmentPool.next.prev.next = segment0;
      SegmentPool.next.prev.next.sharedCopy();
      // Undeclared exception!
      try { 
        segment0.writeTo(segment0, 8435);
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
      SegmentPool.next = segment0;
      // Undeclared exception!
      try { 
        SegmentPool.next.writeTo(SegmentPool.next, 8435);
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
      SegmentPool.next = segment0;
      SegmentPool.next.prev = SegmentPool.next;
      SegmentPool.next.prev.next = segment0;
      SegmentPool.next.prev.limit = 8435;
      Segment segment1 = SegmentPool.next.prev.split(8421);
      // Undeclared exception!
      try { 
        SegmentPool.next.prev.writeTo(segment1, 8421);
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
      Segment segment1 = new Segment();
      segment0.next = segment1;
      SegmentPool.next = segment0;
      SegmentPool.next.prev = SegmentPool.next;
      SegmentPool.next.prev.limit = 8435;
      SegmentPool.next.split(8435);
      SegmentPool.next.prev.next.compact();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Segment segment0 = new Segment();
      SegmentPool.next = segment0;
      SegmentPool.next.prev = SegmentPool.next;
      SegmentPool.next.prev.next = segment0;
      SegmentPool.next.prev.limit = 8435;
      Segment segment1 = SegmentPool.next.split(8435);
      segment0.compact();
      assertNotSame(segment0, segment1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Segment segment0 = new Segment();
      SegmentPool.next = segment0;
      SegmentPool.next.prev = segment0;
      // Undeclared exception!
      try { 
        SegmentPool.next.prev.compact();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Segment segment0 = new Segment();
      SegmentPool.next = segment0;
      // Undeclared exception!
      try { 
        SegmentPool.next.split(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }
}