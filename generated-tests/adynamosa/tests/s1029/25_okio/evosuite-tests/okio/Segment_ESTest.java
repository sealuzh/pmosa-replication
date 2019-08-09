/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 21:57:50 GMT 2019
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
      SegmentPool.next.writeTo(segment0, 8192);
      SegmentPool.next.writeTo(segment0, 8192);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      Segment segment0 = new Segment(byteArray0, (-5127), (byte) (-1), true, true);
      segment0.prev = segment0;
      Segment segment1 = new Segment();
      segment0.prev.limit = 1748;
      segment1.shared = true;
      segment0.prev.prev = segment1;
      segment1.writeTo(segment0.prev, 1317);
      // Undeclared exception!
      try { 
        segment0.compact();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Segment segment0 = new Segment(byteArray0, (-2190), (byte)9, false, false);
      segment0.prev = segment0;
      Segment segment1 = new Segment();
      segment0.prev.prev = segment1;
      segment1.next = segment0.prev;
      Segment segment2 = segment0.split(1353);
      assertNotSame(segment2, segment1);
      assertNotNull(segment2);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Segment segment0 = new Segment((byte[]) null, (-9), 1369, false, false);
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
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[16];
      Segment segment0 = new Segment(byteArray0, 0, 8272, true, true);
      // Undeclared exception!
      try { 
        segment0.split(8272);
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
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
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
      byte[] byteArray0 = new byte[3];
      Segment segment0 = new Segment(byteArray0, (-2190), (byte)9, false, false);
      Segment segment1 = new Segment();
      segment0.prev = segment1;
      Segment segment2 = new Segment();
      segment0.prev.prev = segment2;
      segment2.next = segment0.prev;
      segment2.writeTo(segment0.prev, 1368);
      Segment segment3 = segment0.prev.split(1344);
      assertFalse(segment3.equals((Object)segment2));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = segment0.sharedCopy();
      assertNotSame(segment0, segment1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Segment segment0 = new Segment();
      SegmentPool.next = segment0;
      SegmentPool.next.prev = segment0;
      SegmentPool.next.prev.next = segment0;
      byte[] byteArray0 = new byte[8];
      Segment segment1 = new Segment(byteArray0, (-1), 1, true, true);
      SegmentPool.next.prev.next.prev = segment1;
      Segment segment2 = segment0.push(SegmentPool.next.prev);
      Segment segment3 = segment0.pop();
      assertNotNull(segment3);
      assertSame(segment3, segment2);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Segment segment0 = new Segment();
      // Undeclared exception!
      try { 
        segment0.writeTo(segment0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      Segment segment0 = new Segment((byte[]) null, 2098, 2098, true, true);
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
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      Segment segment0 = new Segment(byteArray0, (-451), 8176, false, false);
      // Undeclared exception!
      try { 
        segment0.split((byte)1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Segment segment0 = new Segment();
      SegmentPool.next = segment0;
      SegmentPool.next.writeTo(segment0, 1488);
      segment0.writeTo(segment0, 8168);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
      Segment segment0 = new Segment((byte[]) null, (-286), 1024, true, true);
      Segment segment1 = new Segment((byte[]) null, 0, 8192, false, true);
      // Undeclared exception!
      try { 
        segment0.writeTo(segment1, 3538);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Segment segment0 = new Segment(byteArray0, (-2032), (byte)80, true, true);
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
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      Segment segment0 = new Segment(byteArray0, (-5245), (byte)9, false, false);
      Segment segment1 = new Segment();
      segment0.prev = segment1;
      segment0.prev.limit = 1916;
      segment1.writeTo(segment0.prev, 1399);
      // Undeclared exception!
      try { 
        segment0.compact();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Segment segment0 = new Segment();
      byte[] byteArray0 = new byte[4];
      Segment segment1 = new Segment(byteArray0, 0, (byte)9, false, false);
      // Undeclared exception!
      try { 
        segment0.writeTo(segment1, (byte)22);
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
      byte[] byteArray0 = new byte[6];
      Segment segment0 = new Segment(byteArray0, (-5245), (byte)9, false, false);
      Segment segment1 = new Segment();
      segment0.prev = segment1;
      Segment segment2 = new Segment();
      segment0.prev.limit = 1916;
      segment2.writeTo(segment0.prev, 1399);
      segment0.compact();
      assertFalse(segment0.equals((Object)segment2));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Segment segment0 = new Segment(byteArray0, (-2190), (byte)9, false, false);
      segment0.prev = segment0;
      Segment segment1 = new Segment();
      segment0.prev.prev = segment1;
      segment1.next = segment0.prev;
      Segment segment2 = segment1.push(segment0);
      segment0.prev.compact();
      assertSame(segment0, segment2);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Segment segment0 = new Segment();
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
  public void test23()  throws Throwable  {
      Segment segment0 = new Segment();
      // Undeclared exception!
      try { 
        segment0.split(779);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Segment segment0 = new Segment(byteArray0, (-2190), (byte)9, false, false);
      segment0.prev = segment0;
      // Undeclared exception!
      try { 
        segment0.prev.split((byte) (-103));
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
      byte[] byteArray0 = new byte[6];
      Segment segment0 = new Segment(byteArray0, (-2190), (byte)9, false, false);
      Segment segment1 = new Segment();
      segment0.prev = segment0;
      Segment segment2 = new Segment();
      segment0.prev.prev = segment2;
      segment2.next = segment0.prev;
      Segment segment3 = segment2.push(segment1);
      segment0.prev.prev.compact();
      assertFalse(segment0.equals((Object)segment3));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Segment segment0 = new Segment((byte[]) null, 2098, 2098, true, true);
      SegmentPool.next = segment0;
      SegmentPool.next.prev = segment0;
      SegmentPool.next.prev.next = segment0;
      Segment segment1 = SegmentPool.next.prev.next.pop();
      assertNull(segment1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Segment segment0 = new Segment(byteArray0, (-2190), (byte)9, false, false);
      segment0.prev = segment0;
      Segment segment1 = new Segment();
      segment1.next = segment0.prev;
      Segment segment2 = segment1.next.unsharedCopy();
      assertNotSame(segment1, segment2);
  }
}