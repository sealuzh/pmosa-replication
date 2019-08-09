/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 00:08:52 GMT 2019
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
      Segment segment1 = new Segment();
      segment0.next = segment1;
      Segment segment2 = segment0.push(segment0);
      segment2.writeTo(segment0, 2150);
      segment1.writeTo(segment2, 3996);
      segment0.next.writeTo(segment0.next, 2240);
      assertFalse(segment0.equals((Object)segment1));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.writeTo(segment0, 1439);
      Segment segment1 = new Segment();
      segment1.writeTo(segment0, 8168);
      assertFalse(segment0.equals((Object)segment1));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.writeTo(segment0, 1439);
      SegmentPool.next = segment0;
      segment0.writeTo(SegmentPool.next, 8192);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment1.writeTo(segment0, 1460);
      // Undeclared exception!
      try { 
        segment1.writeTo(segment0, 8168);
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
      SegmentPool.next = segment0;
      SegmentPool.next.writeTo(SegmentPool.next, 8192);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.pos = (-204);
      Segment segment1 = new Segment();
      segment0.next = segment1;
      Segment segment2 = new Segment();
      Segment segment3 = segment0.push(segment2);
      segment1.writeTo(segment3, 3994);
      segment0.limit = 3994;
      segment2.compact();
      assertFalse(segment2.equals((Object)segment0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.pos = (-204);
      segment0.next = segment0;
      Segment segment1 = new Segment();
      Segment segment2 = segment0.push(segment1);
      segment1.compact();
      assertSame(segment1, segment2);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.next = segment0;
      Segment segment1 = new Segment();
      Segment segment2 = segment0.push(segment1);
      segment2.writeTo(segment1, 2119);
      segment2.pos = (-2943);
      segment0.next.prev = segment2;
      Segment segment3 = segment0.next.split(3602);
      assertNotSame(segment3, segment1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.next = segment0;
      Segment segment1 = new Segment();
      Segment segment2 = segment0.push(segment1);
      segment2.writeTo(segment1, 2119);
      segment2.pos = (-2943);
      Segment segment3 = segment0.next.split(3602);
      assertNotSame(segment3, segment2);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.prev = segment0;
      segment0.writeTo(segment0, 1989);
      segment0.pos = (-34);
      // Undeclared exception!
      try { 
        segment0.split(1108);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.writeTo(segment0, 5715);
      segment0.pos = 5;
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
  public void test11()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.pos = (-193);
      segment0.next = segment0;
      Segment segment1 = segment0.next.unsharedCopy();
      assertFalse(segment1.equals((Object)segment0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Segment segment0 = new Segment();
      SegmentPool.next = segment0;
      SegmentPool.next.next = segment0;
      SegmentPool.next.next.prev = segment0;
      Segment segment1 = SegmentPool.next.next.pop();
      assertNull(segment1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.next = segment0;
      Segment segment1 = new Segment();
      Segment segment2 = segment0.push(segment1);
      Segment segment3 = segment0.next.pop();
      assertNotSame(segment3, segment2);
      assertNotNull(segment3);
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
      byte[] byteArray0 = new byte[8];
      Segment segment0 = new Segment(byteArray0, (byte) (-63), 786, false, false);
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
        segment0.writeTo((Segment) null, (-1));
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
      segment0.pos = (-204);
      segment0.next = segment0;
      segment0.push(segment0);
      // Undeclared exception!
      try { 
        segment0.next.writeTo(segment0.prev, 1439);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment0.writeTo(segment1, 1439);
      // Undeclared exception!
      try { 
        segment1.split(1439);
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
  public void test21()  throws Throwable  {
      Segment segment0 = new Segment();
      byte[] byteArray0 = new byte[4];
      Segment segment1 = new Segment(byteArray0, (-3), (-17), false, false);
      segment0.next = segment1;
      Segment segment2 = new Segment();
      Segment segment3 = segment0.push(segment2);
      segment3.compact();
      // Undeclared exception!
      try { 
        segment0.next.compact();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment0.next = segment1;
      // Undeclared exception!
      try { 
        segment0.next.pop();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
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
      Segment segment1 = segment0.sharedCopy();
      // Undeclared exception!
      try { 
        segment0.next.writeTo(segment1, 1024);
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
      Segment segment0 = new Segment();
      segment0.next = segment0;
      Segment segment1 = new Segment();
      Segment segment2 = new Segment();
      Segment segment3 = segment0.push(segment2);
      segment3.writeTo(segment2, 2135);
      segment3.pos = (-2964);
      segment1.writeTo(segment3, 3978);
      segment3.compact();
      assertSame(segment3, segment2);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.next = segment0;
      Segment segment1 = new Segment();
      Segment segment2 = segment0.push(segment1);
      segment1.sharedCopy();
      segment0.compact();
      assertFalse(segment0.equals((Object)segment2));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.owner = false;
      segment0.next = segment0;
      Segment segment1 = segment0.next.unsharedCopy();
      Segment segment2 = segment0.push(segment1);
      segment2.compact();
      assertNotSame(segment2, segment0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.next = segment0;
      segment0.push(segment0.next);
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
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      Segment segment0 = new Segment(byteArray0, (byte)120, 3212, false, false);
      // Undeclared exception!
      try { 
        segment0.split(340);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.next = segment0;
      // Undeclared exception!
      try { 
        segment0.next.split(3602);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Segment segment0 = new Segment();
      // Undeclared exception!
      try { 
        segment0.split((-34));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = segment0.sharedCopy();
      segment1.writeTo(segment0, 1460);
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
}