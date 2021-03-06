/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 17:06:29 GMT 2019
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
      segment0.prev = segment0;
      segment0.prev.next = segment0;
      segment0.prev.writeTo(segment0, 8191);
      segment0.pos = 1409;
      segment0.prev.next.writeTo(segment0.prev, 316);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.writeTo(segment0, 2161);
      Segment segment1 = segment0.unsharedCopy();
      // Undeclared exception!
      try { 
        segment1.writeTo(segment0, 8136);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Segment segment0 = new Segment(byteArray0, (-745), (byte)0, true, true);
      // Undeclared exception!
      try { 
        segment0.writeTo(segment0, 8192);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment0.prev = segment1;
      segment1.limit = 3405;
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
      byte[] byteArray0 = new byte[1];
      Segment segment0 = new Segment();
      segment0.next = segment0;
      Segment segment1 = new Segment(byteArray0, (-3799), (byte)56, true, true);
      Segment segment2 = segment0.push(segment1);
      Segment segment3 = segment1.push(segment2);
      segment1.next = segment0;
      Segment segment4 = segment1.split(1360);
      assertSame(segment1, segment2);
      assertNotSame(segment4, segment3);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.limit = 2161;
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
      Segment segment1 = new Segment();
      segment1.writeTo(segment0, 2537);
      // Undeclared exception!
      try { 
        segment0.split(2537);
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
      byte[] byteArray0 = new byte[8];
      Segment segment0 = new Segment(byteArray0, (-745), (byte)0, true, true);
      Segment segment1 = segment0.unsharedCopy();
      assertNotSame(segment0, segment1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.next = segment0;
      Segment segment1 = new Segment();
      Segment segment2 = segment0.push(segment1);
      segment2.compact();
      assertSame(segment2, segment1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.next = segment0;
      Segment segment1 = segment0.push(segment0);
      Segment segment2 = segment1.pop();
      assertNull(segment2);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.writeTo(segment0, (byte)0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Segment segment0 = new Segment();
      // Undeclared exception!
      try { 
        segment0.writeTo(segment0, (-1001));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      Segment segment0 = new Segment();
      // Undeclared exception!
      try { 
        segment0.writeTo((Segment) null, 1842);
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
      byte[] byteArray0 = new byte[1];
      Segment segment1 = new Segment(byteArray0, 8187, 8192, false, true);
      // Undeclared exception!
      try { 
        segment0.writeTo(segment1, 8187);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Segment segment0 = new Segment(byteArray0, (-2617), (byte)1, false, true);
      // Undeclared exception!
      try { 
        segment0.split(755);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment1.writeTo(segment0, 8178);
      // Undeclared exception!
      try { 
        segment0.writeTo(segment0, 2151);
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
      byte[] byteArray0 = new byte[0];
      Segment segment0 = new Segment(byteArray0, (byte)0, 2151, true, true);
      // Undeclared exception!
      try { 
        segment0.writeTo(segment0, 8178);
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
      byte[] byteArray0 = new byte[16];
      Segment segment0 = new Segment();
      segment0.pos = 1;
      segment0.next = segment0;
      Segment segment1 = new Segment(byteArray0, 0, 8193, false, true);
      Segment segment2 = segment0.next.push(segment1);
      // Undeclared exception!
      try { 
        segment2.compact();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Segment segment0 = new Segment();
      Segment segment1 = new Segment(byteArray0, (byte)1, (-3785), false, false);
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
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Segment segment0 = new Segment();
      segment0.next = segment0;
      Segment segment1 = new Segment(byteArray0, (byte)1, (-3785), false, false);
      segment0.shared = true;
      Segment segment2 = segment0.push(segment1);
      // Undeclared exception!
      try { 
        segment2.compact();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      Segment segment0 = new Segment(byteArray0, (byte)0, (byte)120, false, false);
      Segment segment1 = new Segment();
      segment1.prev = segment0;
      segment1.compact();
      assertFalse(segment1.equals((Object)segment0));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[16];
      Segment segment0 = new Segment();
      segment0.next = segment0;
      Segment segment1 = new Segment(byteArray0, 0, 8193, false, true);
      Segment segment2 = segment0.next.push(segment1);
      segment2.compact();
      assertSame(segment2, segment1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.next = segment0;
      segment0.push(segment0.next);
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
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Segment segment0 = new Segment();
      segment0.next = segment0;
      Segment segment1 = new Segment(byteArray0, (-3799), (byte)56, true, true);
      segment0.push(segment1);
      Segment segment2 = segment0.next.split(1324);
      assertNotSame(segment2, segment0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Segment segment0 = new Segment();
      // Undeclared exception!
      try { 
        segment0.split(440);
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
      Segment segment0 = new Segment((byte[]) null, (-1531), (-3517), true, true);
      // Undeclared exception!
      try { 
        segment0.split((-1531));
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
      segment0.prev = segment0;
      segment0.prev.next = segment0;
      segment0.prev.writeTo(segment0, 8191);
      segment0.pos = 1409;
      Segment segment1 = segment0.split(316);
      Segment segment2 = segment0.prev.pop();
      assertNotNull(segment2);
      assertNotSame(segment2, segment1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
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
  public void test30()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = segment0.sharedCopy();
      assertFalse(segment1.equals((Object)segment0));
  }
}
