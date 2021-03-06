/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 20:55:10 GMT 2019
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
      Segment segment1 = new Segment();
      segment1.writeTo(segment0, 8157);
      Segment segment2 = new Segment();
      Segment segment3 = segment0.push(segment2);
      segment0.compact();
      Segment segment4 = segment3.split(50);
      segment0.compact();
      assertSame(segment0, segment4);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.next = segment0;
      segment0.writeTo(segment0, 8157);
      segment0.writeTo(segment0.next, 987);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.next = segment0;
      segment0.writeTo(segment0.next, 8192);
      Segment segment1 = new Segment();
      segment1.writeTo(segment0, 8192);
      assertFalse(segment0.equals((Object)segment1));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment((byte[]) null, 0, 0, true, true);
      segment0.prev = segment1;
      // Undeclared exception!
      try { 
        segment0.compact();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment((byte[]) null, 0, 0, false, false);
      segment0.prev = segment1;
      segment0.compact();
      assertFalse(segment0.equals((Object)segment1));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.next = segment0;
      Segment segment1 = new Segment();
      segment1.writeTo(segment0, 8162);
      Segment segment2 = new Segment();
      Segment segment3 = segment0.push(segment2);
      segment0.compact();
      segment3.split(499);
      segment2.push(segment0);
      Segment segment4 = segment2.split(3199);
      assertFalse(segment4.equals((Object)segment1));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.next = segment0;
      Segment segment1 = new Segment();
      segment1.writeTo(segment0, 8162);
      Segment segment2 = new Segment();
      Segment segment3 = segment0.push(segment2);
      segment0.compact();
      segment3.split(499);
      Segment segment4 = segment2.split(3199);
      assertFalse(segment4.equals((Object)segment3));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.next = segment0;
      Segment segment1 = segment0.push(segment0.next);
      Segment segment2 = segment0.unsharedCopy();
      segment2.writeTo(segment0, 8157);
      Segment segment3 = segment1.split(1240);
      Segment segment4 = segment1.push(segment2);
      assertNotSame(segment4, segment3);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.next = segment0;
      Segment segment1 = segment0.push(segment0.next);
      segment1.limit = 8211;
      Segment segment2 = segment0.next.unsharedCopy();
      assertFalse(segment2.equals((Object)segment1));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = segment0.sharedCopy();
      assertNotSame(segment0, segment1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.next = segment0;
      Segment segment1 = segment0.push(segment0.next);
      Segment segment2 = segment1.pop();
      assertNull(segment2);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Segment segment0 = new Segment();
      // Undeclared exception!
      try { 
        segment0.writeTo(segment0, (-15));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Segment segment0 = new Segment(byteArray0, (byte)0, (byte)0, true, true);
      // Undeclared exception!
      try { 
        segment0.split((byte) (-1));
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
      Segment segment0 = new Segment();
      // Undeclared exception!
      try { 
        segment0.writeTo((Segment) null, 2682);
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
      Segment segment0 = new Segment((byte[]) null, 8192, 8192, false, false);
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

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.limit = 1528;
      // Undeclared exception!
      try { 
        segment0.split(1528);
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
      byte[] byteArray0 = new byte[4];
      Segment segment0 = new Segment(byteArray0, (-1502), 1162, true, true);
      SegmentPool.next = segment0;
      // Undeclared exception!
      try { 
        SegmentPool.next.split(293);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.next = segment0;
      Segment segment1 = new Segment();
      segment1.writeTo(segment0, 8192);
      Segment segment2 = segment0.next.push(segment0);
      Segment segment3 = new Segment();
      Segment segment4 = segment0.push(segment3);
      segment2.compact();
      segment4.split(21);
      Segment segment5 = segment0.next.pop();
      assertSame(segment0, segment5);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Segment segment0 = new Segment();
      // Undeclared exception!
      try { 
        segment0.writeTo(segment0, 8211);
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
      segment0.next.shared = true;
      // Undeclared exception!
      try { 
        segment0.writeTo(segment0.next, 8211);
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
      segment0.next = segment0;
      Segment segment1 = new Segment();
      segment1.writeTo(segment0, 8169);
      Segment segment2 = new Segment();
      Segment segment3 = segment0.push(segment2);
      segment0.compact();
      segment0.pos = 8169;
      segment3.split(26);
      // Undeclared exception!
      try { 
        segment0.next.compact();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Segment segment0 = new Segment();
      byte[] byteArray0 = new byte[2];
      Segment segment1 = new Segment(byteArray0, (byte) (-1), 5788, false, false);
      // Undeclared exception!
      try { 
        segment0.writeTo(segment1, 1025);
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
      Segment segment0 = new Segment();
      segment0.next = segment0;
      Segment segment1 = new Segment();
      segment1.writeTo(segment0, 8192);
      Segment segment2 = segment0.next.push(segment0);
      Segment segment3 = new Segment();
      Segment segment4 = segment0.push(segment3);
      segment2.compact();
      segment4.shared = true;
      segment4.split(21);
      segment0.compact();
      assertFalse(segment0.equals((Object)segment1));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Segment segment0 = new Segment();
      // Undeclared exception!
      try { 
        segment0.split(8211);
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
      segment0.next = segment0;
      // Undeclared exception!
      try { 
        segment0.next.split((byte)0);
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
      segment0.next = segment0;
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
  public void test29()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = segment0.unsharedCopy();
      segment1.next = segment0;
      segment0.writeTo(segment1, 2600);
      // Undeclared exception!
      try { 
        segment1.split(1240);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.next = segment0;
      Segment segment1 = new Segment();
      segment1.writeTo(segment0, 8169);
      Segment segment2 = new Segment();
      Segment segment3 = segment0.push(segment2);
      segment0.compact();
      Segment segment4 = segment3.split(1024);
      assertNotSame(segment4, segment0);
  }
}
