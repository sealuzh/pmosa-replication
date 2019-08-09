/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 05 19:19:51 GMT 2019
 */

package org.apache.commons.imaging.common.itu_t4;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.imaging.common.itu_t4.T4AndT6Compression;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class T4AndT6Compression_ESTest extends T4AndT6Compression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[20];
      try { 
        T4AndT6Compression.compressModifiedHuffman(byteArray0, 158, 158);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, (byte)8, (byte) (-74));
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 3182, (-2));
      assertEquals(3, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_2D(byteArray0, (byte)0, (byte) (-15), false);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, (byte)18, (-545), false, 115);
      assertArrayEquals(new byte[] {(byte)0, (byte)16}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)20;
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte)20, 1, false);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, (byte)20, 55, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, (byte)2, (byte)2, true, (byte)2);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, (byte)2, 1567, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 1, 1, false);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 251, 12, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (-3461), 2560, true);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_1D(byteArray0, (byte)0, (byte)0, false);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte) (-2), 20);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, 0, 0);
      byte[] byteArray2 = T4AndT6Compression.decompressModifiedHuffman(byteArray1, (byte)0, (byte)0);
      assertArrayEquals(new byte[] {}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      try { 
        T4AndT6Compression.compressT6(byteArray0, (byte)31, (byte)31);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 8, 4, false, (byte)0);
      assertEquals(9, byteArray1.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)28, (byte) (-64), (byte)5, (byte)0, (byte)20, (byte)0, (byte)80, (byte)1}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, (byte)0, (byte)0, false, (byte) (-64));
      assertArrayEquals(new byte[] {(byte)0, (byte)16}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, 0, 1792);
      // Undeclared exception!
      T4AndT6Compression.compressT4_2D(byteArray1, 0, 1856, true, 1856);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[19];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte)83, (byte)0, false);
      assertArrayEquals(new byte[] {(byte)0, (byte)16}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-2946), (-2946), true);
      assertArrayEquals(new byte[] {(byte)0, (byte)1}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte)0, 1, true);
      assertArrayEquals(new byte[] {(byte)0, (byte)1, (byte)53, (byte)0, (byte)1}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)0, (-1658));
      try { 
        T4AndT6Compression.compressT4_1D(byteArray1, 24, 1513, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, (-2636), (-2636));
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 0, (byte)0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, 0, 1792);
      byte[] byteArray2 = T4AndT6Compression.compressModifiedHuffman(byteArray1, 1792, 0);
      assertFalse(byteArray2.equals((Object)byteArray1));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 6, 6);
      // Undeclared exception!
      T4AndT6Compression.decompressT6(byteArray1, 2925, 6);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6((byte[]) null, (byte)70, (byte)70);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (-1), (-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D((byte[]) null, 1772, 1772, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_1D((byte[]) null, 1655, 1655, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressModifiedHuffman((byte[]) null, 17, 17);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      T4AndT6Compression.compressT6(byteArray0, 0, 4403);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT6((byte[]) null, 2191, 2191);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT6(byteArray0, (byte) (-93), (byte) (-93));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT4_2D((byte[]) null, 1, 1, false, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte) (-2), (byte) (-2), false, (byte) (-2));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      T4AndT6Compression.compressT4_1D(byteArray0, (byte) (-2), 2102, true);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT4_1D((byte[]) null, (byte)35, (byte)35, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      T4AndT6Compression.compressModifiedHuffman(byteArray0, (-644), 1280);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressModifiedHuffman((byte[]) null, 25, 25);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)29;
      byteArray0[2] = (byte) (-30);
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)29, (byte)29);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, 64, (byte)102, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[40];
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, 256, 256, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[13];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 6, 6);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray1, 6, 6);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)16;
      byteArray0[1] = (byte) (-36);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, 1792, 1792);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)51;
      byteArray0[1] = (byte) (-82);
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)51, (byte)51);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)10;
      byteArray0[1] = (byte)10;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)10, (byte)10);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)90;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)90, (byte)90);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, (byte)10, 1);
      try { 
        T4AndT6Compression.decompressT6(byteArray1, (byte)10, (byte)10);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unknown T.6 control code 000000000001
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 2, 2);
      byte[] byteArray2 = T4AndT6Compression.decompressT6(byteArray1, 2, 2);
      assertArrayEquals(new byte[] {(byte) (-64), (byte)4, (byte)0, (byte)64}, byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 2, 2);
      byte[] byteArray2 = T4AndT6Compression.compressT6(byteArray1, 2, 2);
      assertArrayEquals(new byte[] {(byte)10, (byte)24, (byte)0, (byte) (-128), (byte)8}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[13];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 6, 6, false);
      try { 
        T4AndT6Compression.compressT6(byteArray1, 6, 1234);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[3] = (byte)105;
      try { 
        T4AndT6Compression.compressT6(byteArray0, 8, 13);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte)31;
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 7, 6);
      assertArrayEquals(new byte[] {(byte) (-52), (byte)51, (byte) (-31), (byte) (-66), (byte)0, (byte)32, (byte)2}, byteArray1);
      assertEquals(7, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      byte[] byteArray0 = new byte[12];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 30, 1, false);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 1, 30, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-2209), 192, true);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 192, 192, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 46, 1, true);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 1, 46, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-63);
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, (byte)2, (byte)2, true, (byte)2);
      byte[] byteArray2 = T4AndT6Compression.decompressT4_2D(byteArray1, (byte)2, (byte)2, true);
      assertArrayEquals(new byte[] {(byte) (-64), (byte)0}, byteArray2);
      assertArrayEquals(new byte[] {(byte)0, (byte)1, (byte) (-102), (byte) (-32), (byte)1, (byte)6, (byte)0, (byte)1}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-52);
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, (byte)4, (byte)4, true, (byte)4);
      byte[] byteArray2 = T4AndT6Compression.decompressT4_2D(byteArray1, (byte)4, (byte)4, true);
      assertArrayEquals(new byte[] {(byte) (-64), (byte)0, (byte)0, (byte)0}, byteArray2);
      assertEquals(13, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 2, 2, true);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 2, 2, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)8;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)0, 3, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_2D(byteArray0, 2, (byte)0, false);
      byte[] byteArray2 = T4AndT6Compression.decompressT4_1D(byteArray1, (byte)41, (-990), false);
      assertNotSame(byteArray0, byteArray2);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-81);
      byteArray0[1] = (byte) (-33);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 8, (byte)64, false, (byte) (-59));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[4] = (byte) (-59);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 8, (byte)64, false, (byte) (-59));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 0, 0);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, (-3114), 1408, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)20;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)20, (byte)20, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, 41, 1408, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      T4AndT6Compression.compressT4_1D(byteArray0, (-2320), 369, true);
      byte[] byteArray1 = new byte[7];
      byteArray1[0] = (byte)29;
      byteArray1[2] = (byte) (-30);
      // Undeclared exception!
      T4AndT6Compression.decompressModifiedHuffman(byteArray1, (byte)29, (byte)29);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)52;
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)57, (byte)1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 6, 6);
      byte[] byteArray2 = T4AndT6Compression.decompressModifiedHuffman(byteArray1, 6, 6);
      assertArrayEquals(new byte[] {(byte) (-32), (byte) (-32), (byte) (-32), (byte) (-32), (byte) (-32), (byte) (-32)}, byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray2);
      assertEquals(6, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 2, 2);
      byte[] byteArray2 = T4AndT6Compression.compressT4_2D(byteArray1, 2, 2, true, 2);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray2, 27, 27, true, 27);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      byte[] byteArray0 = new byte[13];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 6, 6, false);
      assertEquals(14, byteArray1.length);
      
      byte[] byteArray2 = T4AndT6Compression.decompressT4_1D(byteArray1, 6, 6, false);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray2);
  }
}
