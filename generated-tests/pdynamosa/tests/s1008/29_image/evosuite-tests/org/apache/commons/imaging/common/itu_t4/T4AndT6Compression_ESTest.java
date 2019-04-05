/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 02:11:51 GMT 2019
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
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 1, (-2414));
      assertEquals(3, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, (byte)0, (byte) (-17), true, (-529));
      assertArrayEquals(new byte[] {(byte)0, (byte)1}, byteArray1);
      assertEquals(2, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte)98;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, 64, 2561, true);
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
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)17;
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, 2691, (byte)116);
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
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-103);
      byteArray0[1] = (byte)31;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, 336, 459);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte)84, 0, true);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 0, 34, true);
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
      byte[] byteArray0 = new byte[5];
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, 1651, 1651, true);
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
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, (byte)100, (byte) (-79));
      byte[] byteArray2 = T4AndT6Compression.decompressT4_2D(byteArray1, 255, (-1), true);
      assertFalse(byteArray2.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 2, (byte) (-64));
      T4AndT6Compression.decompressT4_1D(byteArray1, 0, 0, false);
      assertEquals(0, byteArray1.length);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, 1401, 0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)0, (byte)36);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte) (-84), 4783);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_2D(byteArray0, 255, (-1), true);
      byte[] byteArray2 = T4AndT6Compression.decompressModifiedHuffman(byteArray1, 1861, (-1));
      assertArrayEquals(new byte[] {}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 0, 0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_1D(byteArray0, 0, 0, false);
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT6(byteArray1, (-1189), 22);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_1D(byteArray0, 0, (byte) (-84), false);
      byte[] byteArray2 = T4AndT6Compression.compressT4_2D(byteArray1, 0, (byte)0, false, 0);
      assertArrayEquals(new byte[] {(byte)0, (byte)16}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 1792, (byte) (-64));
      try { 
        T4AndT6Compression.decompressT6(byteArray1, 740, 34);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, (byte)0, 0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_2D(byteArray0, (byte)0, (-127), false);
      byte[] byteArray2 = T4AndT6Compression.compressModifiedHuffman(byteArray1, (-127), (byte)0);
      assertEquals(0, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6((byte[]) null, 0, (-2698));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (-120), (byte)0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D((byte[]) null, 1026, 0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte) (-32), 900, false);
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
        T4AndT6Compression.decompressT4_1D((byte[]) null, 2298, 2298, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressModifiedHuffman((byte[]) null, 1600, (byte)120);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT6((byte[]) null, 2114, (-1008));
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
        T4AndT6Compression.compressT4_2D((byte[]) null, (byte)0, 5054, false, 5054);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (-597), (byte) (-31), false, (-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      T4AndT6Compression.compressT4_1D(byteArray0, 0, 1255, false);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT4_1D((byte[]) null, 1, 1, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressModifiedHuffman((byte[]) null, (-2434), 745);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[2] = (byte)45;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (-292), 2279, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)2;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)26, 2247, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte)7;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)7, (byte)7, true);
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
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-64);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)5, 2524, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-29);
      byteArray0[1] = (byte)7;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, 20, 64);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)30;
      byteArray0[1] = (byte)30;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, 1408, (byte)30);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)65;
      byteArray0[1] = (byte)2;
      byteArray0[2] = (byte) (-90);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)65, 2716);
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
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, (byte)3, (byte)3);
      try { 
        T4AndT6Compression.decompressT6(byteArray1, 706, 706);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unknown T.6 control code 000000000001
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, (byte)3, (byte)3);
      byte[] byteArray2 = T4AndT6Compression.decompressT6(byteArray1, (byte)3, (byte)3);
      assertArrayEquals(new byte[] {(byte) (-32), (byte)2, (byte)0, (byte)32}, byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[11];
      byteArray0[3] = (byte)15;
      try { 
        T4AndT6Compression.compressT6(byteArray0, (byte)15, 13);
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
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)35;
      byteArray0[1] = (byte)26;
      try { 
        T4AndT6Compression.compressT6(byteArray0, 8, 1504);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[5] = (byte) (-1);
      try { 
        T4AndT6Compression.compressT6(byteArray0, 8, 1504);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)35;
      try { 
        T4AndT6Compression.compressT6(byteArray0, 8, 1504);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte) (-87), (byte)53, true);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, (byte)39, (byte)53, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte)98;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)0, (byte)98, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-12);
      byteArray0[1] = (byte)79;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)8, 1792, true, (-4398));
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
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-24);
      byteArray0[1] = (byte)79;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)8, 1792, true, (-4398));
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
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)34;
      byteArray0[4] = (byte)20;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)17, 841, true, (-4625));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)79;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)8, 1792, true, (-4398));
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
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)28;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, 3, (byte)28, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte)98;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)0, 50, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      byte[] byteArray0 = new byte[11];
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, 64, 192, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      byte[] byteArray0 = new byte[18];
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, 115, 115, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte) (-97), (byte) (-97), false);
      assertArrayEquals(new byte[] {(byte)0, (byte)16}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, (byte)3, (byte)3);
      byte[] byteArray2 = T4AndT6Compression.decompressModifiedHuffman(byteArray1, (byte)3, (byte)3);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0}, byteArray2);
      assertEquals(3, byteArray1.length);
      assertArrayEquals(new byte[] {(byte) (-128), (byte) (-128), (byte) (-128)}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)52;
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)52, (byte)6);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      try { 
        T4AndT6Compression.compressModifiedHuffman(byteArray0, 40, 795);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, (byte)3, (byte)3);
      byte[] byteArray2 = T4AndT6Compression.compressT6(byteArray1, (byte)3, (byte)3);
      byte[] byteArray3 = T4AndT6Compression.decompressT6(byteArray2, (byte)3, (byte)3);
      assertArrayEquals(new byte[] {(byte)4, (byte)23, (byte) (-16), (byte)1, (byte)0, (byte)16}, byteArray2);
      assertEquals(3, byteArray1.length);
      assertArrayEquals(new byte[] {(byte) (-128), (byte) (-128), (byte) (-128)}, byteArray3);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      byte[] byteArray0 = new byte[21];
      byteArray0[1] = (byte)21;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)98, (byte)21, false, 1772);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, (byte)3, (byte)3, false, (byte)3);
      byte[] byteArray2 = T4AndT6Compression.decompressT4_2D(byteArray1, (byte)3, 2, true);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray2);
      assertArrayEquals(new byte[] {(byte)0, (byte)28, (byte)0, (byte)10, (byte)0, (byte)40, (byte)0, (byte) (-128)}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 4, 4, true);
      byte[] byteArray2 = T4AndT6Compression.decompressT4_1D(byteArray1, 4, 4, true);
      assertEquals(10, byteArray1.length);
      assertEquals(4, byteArray2.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)1, (byte) (-80), (byte)1, (byte) (-80), (byte)1, (byte) (-80), (byte)1, (byte) (-80), (byte)1}, byteArray1);
  }
}