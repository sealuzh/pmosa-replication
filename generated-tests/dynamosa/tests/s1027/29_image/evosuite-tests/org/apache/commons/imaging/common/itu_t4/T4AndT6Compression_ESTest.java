/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 04 19:30:19 GMT 2019
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
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-127);
      byteArray0[1] = (byte)13;
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, 448, (byte)39);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[32];
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, 256, 6, false);
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
      byte[] byteArray0 = new byte[8];
      try { 
        T4AndT6Compression.compressModifiedHuffman(byteArray0, (byte)64, (byte)64);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, (byte)69, (byte) (-65));
      assertEquals(3, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, (byte)63, (-2838), true, 1600);
      assertArrayEquals(new byte[] {(byte)0, (byte)1}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)8;
      byteArray0[1] = (byte)56;
      byteArray0[2] = (byte)23;
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, (byte)23, 61, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, (byte)8, (byte)8, true, (byte)69);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, (byte)8, 740, true);
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
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, (byte) (-99), (byte)100);
      byte[] byteArray2 = T4AndT6Compression.decompressModifiedHuffman(byteArray1, (byte)100, 1);
      assertEquals(100, byteArray1.length);
      assertEquals(13, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, (byte)41, (byte)0);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, (byte)0, 63);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, (-978), (-1795));
      T4AndT6Compression.decompressT6(byteArray1, (byte)55, (-1795));
      assertEquals(0, byteArray1.length);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[19];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_2D(byteArray0, 0, 0, true);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_2D(byteArray0, 902, 0, true);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (-3241), 739, true);
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
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_2D(byteArray0, (byte)64, (byte) (-93), false);
      byte[] byteArray2 = T4AndT6Compression.decompressModifiedHuffman(byteArray1, 2534, (byte)0);
      assertNotSame(byteArray2, byteArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, (byte)0, (byte)0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 28, 0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 0, 0, false, 0);
      assertArrayEquals(new byte[] {(byte)0, (byte)16}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_1D(byteArray0, 0, 0, false);
      // Undeclared exception!
      T4AndT6Compression.compressT4_2D(byteArray1, 0, 1718, false, 1718);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-2632), (-2632), false);
      assertArrayEquals(new byte[] {(byte)0, (byte)16}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte)0, (byte)37, true);
      assertEquals(113, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, (byte)0, (byte)0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte) (-49), (byte) (-49));
      byte[] byteArray2 = T4AndT6Compression.compressModifiedHuffman(byteArray1, (byte) (-49), (byte)37);
      assertEquals(37, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-9);
      // Undeclared exception!
      T4AndT6Compression.decompressT6(byteArray0, 2176, 2176);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6((byte[]) null, 1692, 1692);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (-2779), (-2779));
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
        T4AndT6Compression.decompressT4_2D((byte[]) null, (-2346), 111, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (-734), (-734), false);
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
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 1, 1, false);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 1, 1, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_1D((byte[]) null, 10, 10, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, (byte)0, 576);
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray1, 3449, (byte)58);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressModifiedHuffman((byte[]) null, 111, 111);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[19];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, (-2526), 573);
      // Undeclared exception!
      T4AndT6Compression.compressT6(byteArray1, 425, 44);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT6((byte[]) null, (-1849), (-1849));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT6(byteArray0, (-512), (-512));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT4_2D((byte[]) null, 53, 53, true, 53);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte) (-29), (byte) (-29), false, (byte) (-29));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      T4AndT6Compression.compressT4_1D(byteArray0, (byte) (-27), 597, false);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT4_1D((byte[]) null, 49, 49, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      T4AndT6Compression.compressModifiedHuffman(byteArray0, (byte) (-16), 3592);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressModifiedHuffman((byte[]) null, (-853), (-853));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)99;
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)99, (byte)99);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte) (-13);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 1856, 63, true);
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
      byte[] byteArray0 = new byte[9];
      byteArray0[3] = (byte)69;
      byteArray0[4] = (byte) (-16);
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, (byte)8, (byte)8, true, (byte)69);
      byte[] byteArray2 = T4AndT6Compression.decompressT4_2D(byteArray1, (byte)8, (byte)8, true);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)69, (byte) (-16), (byte)0, (byte)0, (byte)0}, byteArray2);
      assertEquals(26, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[3] = (byte)55;
      byteArray0[4] = (byte) (-11);
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, (byte)8, (byte)8, true, (byte)55);
      byte[] byteArray2 = T4AndT6Compression.decompressT4_2D(byteArray1, (byte)8, (byte)8, true);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)55, (byte) (-11), (byte)0, (byte)0, (byte)0}, byteArray2);
      assertEquals(24, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte)64;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)64, 1263);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unknown T.6 control code 000000000000000001
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 6, 6);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray1, 44, 44);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, (byte)7, (byte)7);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray1, (byte)7, (byte)7);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)80;
      byteArray0[1] = (byte)80;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)80, 53);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)8;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, 1, 27);
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
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, (byte)8, (byte)8);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray1, (byte)8, (byte)8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 1, 1);
      byte[] byteArray2 = T4AndT6Compression.decompressT6(byteArray1, 1, 1);
      assertArrayEquals(new byte[] {(byte)28}, byteArray1);
      assertArrayEquals(new byte[] {(byte)0}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte) (-50);
      try { 
        T4AndT6Compression.compressT6(byteArray0, (byte)10, (byte)37);
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
      byte[] byteArray0 = new byte[9];
      byteArray0[3] = (byte)69;
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, (byte)8, (byte)8);
      assertEquals(9, byteArray1.length);
      assertArrayEquals(new byte[] {(byte) (-28), (byte)116, (byte)8, (byte)37, (byte)17, (byte)124, (byte)0, (byte)64, (byte)4}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-3);
      byteArray0[1] = (byte)8;
      try { 
        T4AndT6Compression.compressT6(byteArray0, (byte)8, 142);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 2, 2, false);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 2, 2, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)8, (byte)8, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_2D(byteArray0, (byte)64, (byte) (-93), false);
      byte[] byteArray2 = T4AndT6Compression.compressT4_1D(byteArray1, (byte)64, 0, false);
      assertArrayEquals(new byte[] {(byte)0, (byte)16}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[3] = (byte)69;
      byteArray0[4] = (byte) (-11);
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, (byte)8, (byte)8, true, (byte)69);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray1, (byte)8, 2515, false, (byte)69);
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
      byte[] byteArray0 = new byte[9];
      byteArray0[4] = (byte) (-1);
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, (byte)8, (byte)8, true, (byte) (-1));
      assertEquals(23, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-789), 64, true);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, (-789), 64, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)64;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)64, (byte)64, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_1D(byteArray0, (byte)0, (-2192), false);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      byte[] byteArray0 = new byte[36];
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, 142, 192, false);
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
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte)8;
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte)8, (byte)8, true);
      byte[] byteArray2 = T4AndT6Compression.decompressT4_1D(byteArray1, (byte)8, (byte)8, true);
      assertEquals(26, byteArray1.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)8, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte)8, (byte)8, true);
      byte[] byteArray2 = T4AndT6Compression.compressT4_2D(byteArray1, (byte)8, (byte)8, true, (byte)8);
      byte[] byteArray3 = T4AndT6Compression.decompressT4_2D(byteArray2, (byte)8, (byte)8, true);
      assertEquals(26, byteArray1.length);
      assertEquals(30, byteArray2.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)1, (byte) (-104), (byte)0, (byte)1, (byte) (-104), (byte)0, (byte)1}, byteArray3);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, 0, 2482);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      byte[] byteArray0 = new byte[36];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, (byte)8, (byte)8, true, (byte)8);
      byte[] byteArray2 = T4AndT6Compression.compressModifiedHuffman(byteArray1, (byte)8, (byte)8);
      byte[] byteArray3 = T4AndT6Compression.compressT6(byteArray2, (byte)8, (byte)8);
      assertEquals(19, byteArray1.length);
      assertEquals(12, byteArray2.length);
      assertEquals(24, byteArray3.length);
  }
}
