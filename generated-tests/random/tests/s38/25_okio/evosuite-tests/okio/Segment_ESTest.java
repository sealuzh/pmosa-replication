/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 22:59:37 GMT 2019
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
  public void test01()  throws Throwable  {
      Segment segment0 = new Segment();
      byte[] byteArray0 = new byte[1];
      Segment segment1 = new Segment(byteArray0, (-707), (-836), true, true);
      segment0.next = segment1;
      Segment segment2 = segment0.push(segment0.next);
      assertSame(segment2, segment1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Segment segment0 = new Segment(byteArray0, (byte)32, 8192, false, false);
      Segment segment1 = new Segment(byteArray0, 8192, (-864), false, true);
      // Undeclared exception!
      try { 
        segment0.writeTo(segment1, (-668));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.next = segment0;
      segment0.next.writeTo(segment0.next, 968);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment((byte[]) null, 2593, 8192, false, true);
      // Undeclared exception!
      try { 
        segment0.writeTo(segment1, 2593);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment1.sharedCopy();
      segment1.next = segment0;
      segment1.next.next = segment0;
      segment0.push(segment1);
      // Undeclared exception!
      try { 
        segment1.next.next.writeTo(segment1.next.next, 10785);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
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
      segment1.next = segment0;
      segment1.next.next = segment0;
      // Undeclared exception!
      try { 
        segment1.writeTo(segment1.next.next, 10785);
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
      byte[] byteArray0 = new byte[0];
      Segment segment0 = new Segment(byteArray0, 1, 1, false, false);
      // Undeclared exception!
      try { 
        segment0.writeTo(segment0, (-1));
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
      byte[] byteArray0 = new byte[4];
      Segment segment0 = new Segment(byteArray0, (byte)0, (byte)1, true, true);
      Segment segment1 = new Segment(byteArray0, (-2722), (byte)0, true, true);
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
  public void test09()  throws Throwable  {
      Segment segment0 = new Segment();
      byte[] byteArray0 = new byte[1];
      segment0.next = segment0;
      Segment segment1 = new Segment(byteArray0, (byte) (-53), 8192, true, true);
      segment0.sharedCopy();
      Segment segment2 = segment0.push(segment1);
      segment2.compact();
      assertNotSame(segment2, segment0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Segment segment0 = new Segment();
      byte[] byteArray0 = new byte[7];
      Segment segment1 = new Segment(byteArray0, (byte)31, (byte) (-2), false, false);
      segment0.prev = segment1;
      segment0.compact();
      assertNotSame(segment0, segment1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Segment segment0 = new Segment();
      byte[] byteArray0 = new byte[1];
      segment0.next = segment0;
      Segment segment1 = new Segment(byteArray0, (byte) (-53), 8192, true, true);
      Segment segment2 = segment0.push(segment1);
      segment2.compact();
      assertSame(segment2, segment1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Segment segment0 = new Segment();
      byte[] byteArray0 = new byte[1];
      segment0.next = segment0;
      Segment segment1 = new Segment(byteArray0, (byte) (-53), 8192, true, true);
      segment0.push(segment1);
      segment1.pop();
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
  public void test13()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.limit = 2932;
      // Undeclared exception!
      try { 
        segment0.split(1249);
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
        segment0.split(1014);
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
      byte[] byteArray0 = new byte[6];
      Segment segment0 = new Segment(byteArray0, (-893), (byte) (-76), false, false);
      // Undeclared exception!
      try { 
        segment0.split(800);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Segment segment0 = new Segment(byteArray0, 0, (byte)53, false, false);
      // Undeclared exception!
      try { 
        segment0.split((-1));
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
      Segment segment0 = new Segment();
      SegmentPool.next = segment0;
      SegmentPool.next.next = segment0;
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
      Segment segment0 = new Segment();
      Segment segment1 = segment0.unsharedCopy();
      assertNotSame(segment0, segment1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
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
}
