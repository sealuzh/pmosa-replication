/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 17:39:54 GMT 2019
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
  public void test0()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(0, byteOrder0, false);
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = myLzwCompressor0.compress(byteArray0);
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
  public void test1()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(481, byteOrder0, false, myLzwCompressor_Listener0);
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = myLzwCompressor0.compress(byteArray0);
      assertEquals(422, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor((-1), byteOrder0, true);
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
  public void test3()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(0, byteOrder0, true, myLzwCompressor_Listener0);
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
  public void test4()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor((-1023), byteOrder0, true, myLzwCompressor_Listener0);
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = myLzwCompressor0.compress(byteArray0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(0, byteOrder0, false, myLzwCompressor_Listener0);
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte)1;
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
  public void test6()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(0, byteOrder0, false, myLzwCompressor_Listener0);
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = myLzwCompressor0.compress(byteArray0);
      assertArrayEquals(new byte[] {(byte) (-96)}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      byte[] byteArray0 = new byte[4];
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(1, byteOrder0, false);
      byte[] byteArray1 = myLzwCompressor0.compress(byteArray0);
      assertArrayEquals(new byte[] {(byte) (-120), (byte)24}, byteArray1);
  }
}
