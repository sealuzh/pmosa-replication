/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 21 23:12:25 GMT 2019
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
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)120;
      byteArray0[1] = (byte) (-46);
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, 825, (byte)24);
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
      byte[] byteArray0 = new byte[67];
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, 415, 255, true);
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
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 7, (-1838));
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_2D(byteArray0, 0, (-3692), false);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte)63;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, 905, 31, true);
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
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 4, 5, true);
      assertEquals(12, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)19;
      byteArray0[1] = (byte)68;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)51, 783);
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
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 884, (-2714), true);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 884, 8, true);
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
      byte[] byteArray0 = new byte[3];
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (-2524), 2017, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, (-4330), 305);
      byte[] byteArray2 = T4AndT6Compression.decompressModifiedHuffman(byteArray1, 64, 24);
      assertEquals(192, byteArray2.length);
      assertEquals(305, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, 0, (-1369));
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)0, 2280);
      byte[] byteArray2 = T4AndT6Compression.decompressT6(byteArray1, (byte)23, 0);
      assertFalse(byteArray2.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, 0, 0);
      byte[] byteArray2 = T4AndT6Compression.decompressT4_1D(byteArray1, 52, 0, true);
      assertEquals(0, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, (-403), (-3));
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_1D(byteArray0, (byte) (-3), (byte) (-81), false);
      byte[] byteArray2 = T4AndT6Compression.decompressModifiedHuffman(byteArray1, 0, 1584);
      assertNotSame(byteArray0, byteArray2);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, (byte)0, (byte)0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, (byte)64, (-3692), false, (byte)0);
      assertArrayEquals(new byte[] {(byte)0, (byte)16}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 1, 0, false, (-8103));
      assertArrayEquals(new byte[] {(byte)0, (byte)16}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 941, 0, false);
      T4AndT6Compression.decompressT4_2D(byteArray1, 0, 0, false);
      assertArrayEquals(new byte[] {(byte)0, (byte)16}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 3740, 0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 0, (byte) (-8));
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, (-1879), 8);
      assertArrayEquals(new byte[] {(byte)53, (byte)53, (byte)53, (byte)53, (byte)53, (byte)53, (byte)53, (byte)53}, byteArray1);
      assertEquals(8, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6((byte[]) null, 577, 51);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (-1350), 1369);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D((byte[]) null, 64, 3, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (-2), (-2), true);
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
        T4AndT6Compression.decompressT4_1D((byte[]) null, (-1961), (-1961), false);
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
        T4AndT6Compression.decompressModifiedHuffman((byte[]) null, 8, 8);
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
        T4AndT6Compression.compressT6((byte[]) null, (-254), (-254));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT6(byteArray0, (byte) (-108), (-2503));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT4_2D((byte[]) null, (-1586), 1, false, (-1586));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 941, 0);
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT4_2D(byteArray1, (-1838), 0, true, 0);
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
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      T4AndT6Compression.compressT4_1D(byteArray0, (-2843), 2221, true);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT4_1D((byte[]) null, 4, (-207), true);
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
      T4AndT6Compression.compressModifiedHuffman(byteArray0, (byte) (-128), 2304);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressModifiedHuffman((byte[]) null, 54, 54);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-86);
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)1, 530);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      try { 
        T4AndT6Compression.compressModifiedHuffman(byteArray0, 64, 64);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte)63;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 50, 4, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte) (-66);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 64, 62, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte)7;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)7, 4, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte)76;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 2825, 6, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)7;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)60, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 1216, (byte)0, false);
      try { 
        T4AndT6Compression.decompressT6(byteArray1, (byte)64, 1216);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unknown T.6 control code 000000000001
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)64;
      byteArray0[1] = (byte) (-81);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)12, 1188);
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
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 7, 2);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray1, 2, 657);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 7, 2);
      byte[] byteArray2 = T4AndT6Compression.decompressT6(byteArray1, 657, 2);
      assertEquals(166, byteArray2.length);
      assertArrayEquals(new byte[] {(byte) (-16), (byte) (-16)}, byteArray1);
      assertEquals(2, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)8;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)8, (byte)19);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)98;
      byteArray0[1] = (byte)31;
      try { 
        T4AndT6Compression.compressT6(byteArray0, 8, 63);
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
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 3, 3);
      byte[] byteArray2 = T4AndT6Compression.compressT6(byteArray1, 3, 3);
      assertArrayEquals(new byte[] {(byte)5, (byte)7, (byte)0, (byte)16, (byte)1}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)98;
      try { 
        T4AndT6Compression.compressT6(byteArray0, 8, 63);
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
      byte[] byteArray0 = new byte[17];
      byteArray0[1] = (byte)17;
      byteArray0[2] = (byte)55;
      byteArray0[3] = (byte)65;
      byteArray0[4] = (byte) (-121);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 1732, 6, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      byte[] byteArray0 = new byte[17];
      byteArray0[1] = (byte)17;
      byteArray0[2] = (byte)84;
      byteArray0[3] = (byte)65;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 2835, 6, true);
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
      byte[] byteArray0 = new byte[17];
      byteArray0[1] = (byte)17;
      byteArray0[2] = (byte)84;
      byteArray0[3] = (byte)17;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 2835, 6, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      byte[] byteArray0 = new byte[17];
      byteArray0[1] = (byte)17;
      byteArray0[2] = (byte)59;
      byteArray0[3] = (byte)17;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 1711, 6, true);
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
      byte[] byteArray0 = new byte[17];
      byteArray0[2] = (byte)84;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 2835, 6, true);
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
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte) (-39);
      byteArray0[2] = (byte) (-26);
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, (byte)24, (byte)1);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray1, 30, 2790, false, (byte)60);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[4] = (byte) (-65);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)7, 2841, true, (byte)64);
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
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)24;
      byteArray0[1] = (byte) (-39);
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, (byte)24, (byte)1);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray1, 30, 2790, false, (byte)60);
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
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 0, 0, true, 0);
      assertArrayEquals(new byte[] {(byte)0, (byte)1}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte)11;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (-2), 1197, true);
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
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-128);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, 0, 448, true);
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
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 1, 3, false);
      assertArrayEquals(new byte[] {(byte)0, (byte)17, (byte) (-64), (byte)4, (byte)112, (byte)1, (byte)28, (byte)0, (byte)64}, byteArray1);
      assertEquals(9, byteArray1.length);
      
      byte[] byteArray2 = T4AndT6Compression.decompressT4_1D(byteArray1, 1, 3, false);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      byte[] byteArray0 = new byte[73];
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, 256, 439, true);
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
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte)0, (byte)42, true);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 53, 64, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)7;
      byteArray0[1] = (byte) (-15);
      byteArray0[2] = (byte)60;
      byteArray0[3] = (byte)2;
      byteArray0[4] = (byte) (-116);
      byteArray0[5] = (byte)64;
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, 1216, (byte)60);
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
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, 0, (byte)63);
      byte[] byteArray2 = T4AndT6Compression.decompressT4_2D(byteArray1, (byte)63, 0, true);
      assertNotSame(byteArray0, byteArray2);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 3, 3);
      byte[] byteArray2 = T4AndT6Compression.compressT4_2D(byteArray1, 3, 3, false, 3);
      byte[] byteArray3 = T4AndT6Compression.decompressT4_2D(byteArray2, 3, 3, true);
      assertEquals(9, byteArray2.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)25, (byte) (-84), (byte)0, (byte)32, (byte)96, (byte)2, (byte) (-128), (byte)8}, byteArray2);
      assertArrayEquals(new byte[] {(byte) (-32), (byte)2, (byte)0, (byte)32}, byteArray1);
      assertArrayEquals(new byte[] {(byte) (-32), (byte)0, (byte)0}, byteArray3);
  }
}
