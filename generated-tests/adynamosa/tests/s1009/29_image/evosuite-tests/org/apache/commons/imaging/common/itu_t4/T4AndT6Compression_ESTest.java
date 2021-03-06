/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 12:20:10 GMT 2019
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
      byte[] byteArray0 = new byte[32];
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 128, (byte)119, true, (-870));
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
      byte[] byteArray0 = new byte[2];
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, 4, 64, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[19];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte)59, (-1179), true);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 15, 1920, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)17;
      byteArray0[2] = (byte)17;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 511, (byte)17, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-18);
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, 2, 2);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)7;
      byteArray0[1] = (byte)1;
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)54, (byte)1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)3, (byte) (-128), (byte)0, (byte)0, (byte)0}, byteArray1);
      assertEquals(7, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 242, 0);
      byte[] byteArray2 = T4AndT6Compression.compressModifiedHuffman(byteArray1, (-3998), 11);
      assertEquals(11, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte) (-123), 0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, (byte)0, (byte)40);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 0, 0, true);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 0, 26, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, 2953, (byte)0);
      byte[] byteArray2 = T4AndT6Compression.decompressT4_2D(byteArray1, 727, (-3), true);
      assertNotSame(byteArray2, byteArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_1D(byteArray0, 2457, 0, false);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_1D(byteArray0, 0, (byte) (-62), true);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (-127), 2, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, (byte)7, (-2));
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, (byte)127, (byte)127, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, (-2447), (-2447));
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 1, (-1335));
      assertEquals(3, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 1, (byte)0, true, (-233));
      assertArrayEquals(new byte[] {(byte)0, (byte)1}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)77, (-1130));
      byte[] byteArray2 = T4AndT6Compression.compressT4_2D(byteArray1, 0, (-371), true, 0);
      assertArrayEquals(new byte[] {(byte)0, (byte)1}, byteArray2);
      assertEquals(2, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-3998), (-1400), true);
      byte[] byteArray2 = T4AndT6Compression.compressModifiedHuffman(byteArray1, (-3998), 0);
      assertEquals(0, byteArray2.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)1}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_2D(byteArray0, 727, (-3), true);
      try { 
        T4AndT6Compression.compressModifiedHuffman(byteArray1, 4, (byte)47);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6((byte[]) null, (-3765), 2061);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (-247), (-1235));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D((byte[]) null, (-1400), 0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte) (-18), (-2808), false);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_1D((byte[]) null, 40, 40, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressModifiedHuffman((byte[]) null, (-3178), (-3178));
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
        T4AndT6Compression.compressT6((byte[]) null, 2111, 2111);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT6(byteArray0, (-1691), 2);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT4_2D((byte[]) null, (-2116), 2, true, (byte)18);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte) (-5), (byte) (-5), false, (byte)3);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT4_1D((byte[]) null, (-970), 0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressModifiedHuffman((byte[]) null, (byte)0, (byte) (-80));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte)44;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, 2889, (byte)4, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[32];
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 137, (byte)119, true, (-857));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)1;
      byteArray0[3] = (byte)3;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, 0, (byte)21, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 1637, (byte)0, false);
      try { 
        T4AndT6Compression.decompressT6(byteArray1, 17, 1637);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unknown T.6 control code 000000000001
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)12;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, 2239, (byte)12);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)7;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)51, (byte)7);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-18);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)51, (byte)7);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)9;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)1, (byte)14);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)5;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)1, (byte)1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)74;
      byteArray0[1] = (byte)49;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)8, 20);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)63;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, 10, (byte)2);
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
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, 280, (-5857));
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)12;
      try { 
        T4AndT6Compression.compressT6(byteArray0, 6, 1735);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)63;
      byteArray0[2] = (byte)5;
      try { 
        T4AndT6Compression.compressT6(byteArray0, (byte)7, (byte)7);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte)5;
      byteArray0[3] = (byte)63;
      try { 
        T4AndT6Compression.compressT6(byteArray0, (byte)7, (byte)7);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 0, 0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byteArray0[1] = (byte)15;
      byteArray0[2] = (byte)15;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)15, (byte)15, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)4;
      byteArray0[2] = (byte)44;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)44, (byte)44, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      byte[] byteArray0 = new byte[13];
      byteArray0[1] = (byte)1;
      byteArray0[3] = (byte)14;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 47, (byte)9, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unknown T.4 control code 000000000001
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)8;
      byteArray0[2] = (byte)17;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)8, (byte)17, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byteArray0[2] = (byte)44;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)44, (byte)44, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byteArray0[1] = (byte)18;
      byteArray0[2] = (byte)18;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)18, (byte)18, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte)0, 43, true);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 15, 43, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_2D(byteArray0, 17, (byte)0, true);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte)24;
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, (byte)5, 3, true, (-943));
      assertEquals(11, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte) (-89);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 1, 1792, false, (-233));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)63;
      byteArray0[2] = (byte)5;
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, (byte)7, (byte)5, true, (-3));
      assertEquals(16, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte) (-10), 43, true);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray1, 7, 3191, false, 17);
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
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)63;
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, (byte)7, (byte)5, true, (-3));
      assertEquals(16, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)4;
      byteArray0[2] = (byte)30;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)4, (byte)43, true);
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
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)3;
      byteArray0[3] = (byte)64;
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, 52, 64, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-2823), 62, false);
      assertEquals(157, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)52;
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, 58, 7);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)0, 43);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte) (-10), 43, true);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray1, 50, 3191, false, 17);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      try { 
        T4AndT6Compression.compressModifiedHuffman(byteArray0, 64, 1357);
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
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, (byte)1, (byte)5, false, (-3));
      byte[] byteArray2 = T4AndT6Compression.decompressT4_1D(byteArray1, (byte)5, (byte)1, false);
      assertEquals(11, byteArray1.length);
      assertArrayEquals(new byte[] {(byte)24}, byteArray2);
  }
}
