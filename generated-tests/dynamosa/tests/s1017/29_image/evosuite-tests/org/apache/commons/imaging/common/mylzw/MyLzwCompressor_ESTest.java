/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 04 02:04:47 GMT 2019
 */

package org.apache.commons.imaging.common.mylzw;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.nio.ByteOrder;
import org.apache.commons.imaging.common.mylzw.MyLzwCompressor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MyLzwCompressor_ESTest extends MyLzwCompressor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(0, (ByteOrder) null, true, (MyLzwCompressor.Listener) null);
      assertNotNull(myLzwCompressor0);
      
      byte[] byteArray0 = null;
      byte[] byteArray1 = new byte[2];
      byte byte0 = (byte)0;
      byteArray1[0] = (byte)0;
      byte byte1 = (byte)29;
      // Undeclared exception!
      try { 
        myLzwCompressor0.compress((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(0, (ByteOrder) null, false, myLzwCompressor_Listener0);
      assertNotNull(myLzwCompressor0);
      
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      assertNotNull(byteOrder0);
      assertEquals("LITTLE_ENDIAN", byteOrder0.toString());
      
      byte[] byteArray1 = myLzwCompressor0.compress(byteArray0);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte)5}, byteArray1);
      assertEquals(4, byteArray0.length);
      assertEquals(1, byteArray1.length);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      assertNotNull(byteOrder0);
      assertEquals("LITTLE_ENDIAN", byteOrder0.toString());
      
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor((-2234), byteOrder0, true, myLzwCompressor_Listener0);
      assertNotNull(myLzwCompressor0);
      assertEquals("LITTLE_ENDIAN", byteOrder0.toString());
      
      byte[] byteArray0 = new byte[0];
      try { 
        myLzwCompressor0.compress(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // CodeFromString
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      assertNotNull(byteOrder0);
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(1, byteOrder0, true);
      assertNotNull(myLzwCompressor0);
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      assertNotNull(byteOrder0);
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      
      ByteOrder byteOrder1 = ByteOrder.nativeOrder();
      assertNotSame(byteOrder1, byteOrder0);
      assertFalse(byteOrder1.equals((Object)byteOrder0));
      assertNotNull(byteOrder1);
      assertEquals("LITTLE_ENDIAN", byteOrder1.toString());
      
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(0, byteOrder0, true, myLzwCompressor_Listener0);
      assertFalse(byteOrder0.equals((Object)byteOrder1));
      assertNotNull(myLzwCompressor0);
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      
      // Undeclared exception!
      try { 
        myLzwCompressor0.compress((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      assertNotNull(byteOrder0);
      assertEquals("LITTLE_ENDIAN", byteOrder0.toString());
      
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(40, byteOrder0, false);
      assertNotNull(myLzwCompressor0);
      assertEquals("LITTLE_ENDIAN", byteOrder0.toString());
      
      byte[] byteArray0 = new byte[0];
      try { 
        myLzwCompressor0.compress(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // CodeFromString
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      assertNotNull(byteOrder0);
      assertEquals("LITTLE_ENDIAN", byteOrder0.toString());
      
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(0, byteOrder0, true);
      assertNotNull(myLzwCompressor0);
      assertEquals("LITTLE_ENDIAN", byteOrder0.toString());
      
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-11);
      byteArray0[1] = (byte)68;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)103;
      byteArray0[4] = (byte) (-80);
      byteArray0[5] = (byte)2;
      byteArray0[6] = (byte)107;
      try { 
        myLzwCompressor0.compress(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // CodeFromString
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      assertNotNull(byteOrder0);
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(0, byteOrder0, false, myLzwCompressor_Listener0);
      assertNotNull(myLzwCompressor0);
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)18;
      byteArray0[2] = (byte)23;
      byteArray0[3] = (byte)12;
      byteArray0[4] = (byte)117;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte) (-115);
      byteArray0[7] = (byte) (-1);
      try { 
        myLzwCompressor0.compress(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // CodeFromString
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      assertNotNull(byteOrder0);
      assertEquals("LITTLE_ENDIAN", byteOrder0.toString());
      
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor((-4191), byteOrder0, false, myLzwCompressor_Listener0);
      assertNotNull(myLzwCompressor0);
      assertEquals("LITTLE_ENDIAN", byteOrder0.toString());
      
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-128);
      byteArray0[2] = (byte) (-102);
      byteArray0[3] = (byte) (-1);
      byteArray0[4] = (byte)0;
      try { 
        myLzwCompressor0.compress(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // CodeFromString
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      assertNotNull(byteOrder0);
      assertEquals("LITTLE_ENDIAN", byteOrder0.toString());
      
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(992, byteOrder0, true);
      assertNotNull(myLzwCompressor0);
      assertEquals("LITTLE_ENDIAN", byteOrder0.toString());
      
      byte[] byteArray0 = new byte[6];
      byte byte0 = (byte)49;
      byteArray0[0] = (byte)49;
      byte byte1 = (byte) (-53);
      byteArray0[1] = (byte) (-53);
      try { 
        myLzwCompressor0.compress(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // CodeFromString
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      assertNotNull(byteOrder0);
      assertEquals("LITTLE_ENDIAN", byteOrder0.toString());
      
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor((-1756), byteOrder0, true, myLzwCompressor_Listener0);
      assertNotNull(myLzwCompressor0);
      assertEquals("LITTLE_ENDIAN", byteOrder0.toString());
      
      byte[] byteArray0 = new byte[0];
      try { 
        myLzwCompressor0.compress(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // CodeFromString
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      assertNotNull(byteOrder0);
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor((-2807), byteOrder0, false);
      assertNotNull(myLzwCompressor0);
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ByteOrder.nativeOrder();
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteOrder byteOrder1 = ByteOrder.nativeOrder();
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(8, byteOrder1, true);
      ByteOrder.nativeOrder();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byte[] byteArray1 = myLzwCompressor0.compress(byteArray0);
      ByteOrder.nativeOrder();
      myLzwCompressor0.compress(byteArray1);
      myLzwCompressor0.compress(byteArray1);
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor1 = new MyLzwCompressor(241, byteOrder0, false, myLzwCompressor_Listener0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(1507, byteOrder0, true, myLzwCompressor_Listener0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor((byte)8, byteOrder0, true);
      byte[] byteArray0 = new byte[2];
      myLzwCompressor0.compress(byteArray0);
      byteArray0[0] = (byte)2;
      byteArray0[1] = (byte)8;
      byte[] byteArray1 = myLzwCompressor0.compress(byteArray0);
      myLzwCompressor0.compress(byteArray1);
      byte[] byteArray2 = myLzwCompressor0.compress(byteArray1);
      myLzwCompressor0.compress(byteArray0);
      // Undeclared exception!
      myLzwCompressor0.compress(byteArray2);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor((-6365), byteOrder0, true, myLzwCompressor_Listener0);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)0;
      myLzwCompressor0.compress(byteArray0);
      byte[] byteArray1 = myLzwCompressor0.compress(byteArray0);
      ByteOrder.nativeOrder();
      try { 
        myLzwCompressor0.compress(byteArray1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // CodeFromString
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor((-1756), byteOrder0, true, myLzwCompressor_Listener0);
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = myLzwCompressor0.compress(byteArray0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(903, byteOrder0, false);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)0;
      myLzwCompressor0.compress(byteArray0);
      byteArray0[1] = (byte)0;
      ByteOrder.nativeOrder();
      byteArray0[2] = (byte)99;
      myLzwCompressor0.compress(byteArray0);
      byte[] byteArray1 = myLzwCompressor0.compress(byteArray0);
      myLzwCompressor0.compress(byteArray0);
      try { 
        myLzwCompressor0.compress(byteArray1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // CodeFromString
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(0, (ByteOrder) null, false, myLzwCompressor_Listener0);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-49);
      byteArray0[3] = (byte)0;
      try { 
        myLzwCompressor0.compress(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // CodeFromString
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(1, byteOrder0, false);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-1);
      try { 
        myLzwCompressor0.compress(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // CodeFromString
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(0, byteOrder0, true, myLzwCompressor_Listener0);
      byte[] byteArray0 = new byte[7];
      byte byte0 = (byte) (-13);
      myLzwCompressor0.compress(byteArray0);
      ByteOrder.nativeOrder();
      byteArray0[0] = (byte) (-13);
      byte byte1 = (byte) (-61);
      byteArray0[1] = (byte) (-61);
      byteArray0[2] = (byte)77;
      byte byte2 = (byte) (-93);
      byteArray0[3] = (byte) (-93);
      byte byte3 = (byte)0;
      byteArray0[4] = (byte)0;
      byte byte4 = (byte)0;
      ByteOrder.nativeOrder();
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte) (-60);
      try { 
        myLzwCompressor0.compress(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // CodeFromString
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(0, byteOrder0, true, myLzwCompressor_Listener0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor((-1), byteOrder0, true, myLzwCompressor_Listener0);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)44;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)122;
      byteArray0[5] = (byte)81;
      byteArray0[6] = (byte) (-113);
      byteArray0[7] = (byte) (-1);
      try { 
        myLzwCompressor0.compress(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // CodeFromString
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwCompressor", e);
      }
  }
}
