/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 16:46:18 GMT 2019
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
      byte[] byteArray1 = T4AndT6Compression.decompressT4_1D(byteArray0, 0, 0, true);
      byte[] byteArray2 = T4AndT6Compression.decompressT4_2D(byteArray1, (byte)0, (byte)0, false);
      assertFalse(byteArray2.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, 5124, 14, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, (byte)106, (byte)0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 925, (byte)0, true, (byte)0);
      assertArrayEquals(new byte[] {(byte)0, (byte)1}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 2432, (-1408), true, (byte) (-88));
      assertArrayEquals(new byte[] {(byte)0, (byte)1}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, (byte)0, 678, false, 0);
      assertEquals(1105, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-386), (byte)0, true);
      assertArrayEquals(new byte[] {(byte)0, (byte)1}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 0, 0);
      try { 
        T4AndT6Compression.compressT6(byteArray1, 39, 1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (-1283), 0, true);
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
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (-1879), (byte)4, true, 45);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      T4AndT6Compression.compressModifiedHuffman(byteArray0, (-3783), 3984);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-63);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, 1, 86);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte)36;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, 2379, 507, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[2] = (byte) (-6);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (-3269), (byte)2, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)6;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, 1570, (byte)6, true);
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
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte)12;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 5, 13, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)35;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)126, 462, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)36;
      byteArray0[1] = (byte)6;
      byteArray0[2] = (byte)63;
      byteArray0[3] = (byte)6;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)36, (byte)6);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)36;
      byteArray0[1] = (byte)6;
      byteArray0[2] = (byte)63;
      byteArray0[3] = (byte)81;
      byteArray0[4] = (byte) (-121);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)36, (byte)6);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)104;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)104, (byte)104);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)64;
      byteArray0[1] = (byte) (-79);
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)19, (byte)26);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)11;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, 462, 5);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)6;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)36, (byte)6);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unknown T.6 control code 00000000000001
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, 995, (byte) (-31));
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte) (-1);
      try { 
        T4AndT6Compression.compressT6(byteArray0, (byte)2, (byte)38);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)18;
      byteArray0[0] = (byte) (-5);
      try { 
        T4AndT6Compression.compressT6(byteArray0, 4, 64);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)18;
      try { 
        T4AndT6Compression.compressT6(byteArray0, 4, 64);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[4] = (byte) (-11);
      try { 
        T4AndT6Compression.compressT6(byteArray0, 4, 64);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)64;
      try { 
        T4AndT6Compression.compressT6(byteArray0, 4, 64);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, (byte)33, (-2415));
      assertEquals(3, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)30;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 4355, 672, false);
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
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)30;
      byte[] byteArray1 = T4AndT6Compression.decompressT4_2D(byteArray0, (byte)0, 1, false);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)22;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 8, (byte)22, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte)0, 64, false);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, (byte)23, 64, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, (byte)0, (byte)4, true, 45);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 45, (byte)63, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 45, (byte)63, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_2D(byteArray0, (byte)90, (-3305), true);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      T4AndT6Compression.compressT4_2D(byteArray0, (byte)0, 2016, true, 186);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[5] = (byte) (-45);
      byteArray0[6] = (byte)52;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 7, (byte)52, false, 61);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[4] = (byte)46;
      byteArray0[5] = (byte) (-45);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 7, (byte)52, false, 61);
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
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte)79;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 7, (byte)52, false, 61);
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
      byteArray0[4] = (byte) (-122);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 4, (byte)28, true, 33);
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
      byteArray0[0] = (byte) (-19);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 4, (byte)28, true, 33);
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
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)2;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (-3269), (byte)2, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 0, (byte)53, true, (byte) (-105));
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, 1791, 35, true);
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
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)26;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)0, 10, true);
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
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte)75, (byte) (-63), false);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, (byte)75, 3143, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_1D(byteArray0, (byte) (-97), (byte) (-39), true);
      byte[] byteArray2 = T4AndT6Compression.compressModifiedHuffman(byteArray1, (byte)0, 12);
      assertEquals(12, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-312), (byte)4, true);
      assertEquals(14, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, (byte)61, (byte)32, false);
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
      byteArray0[0] = (byte)63;
      byteArray0[1] = (byte)13;
      byteArray0[2] = (byte)71;
      byteArray0[3] = (byte)63;
      byteArray0[4] = (byte)126;
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)126, (byte)71);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte) (-81), 25);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, 39, (byte) (-3));
      byte[] byteArray2 = T4AndT6Compression.decompressT6(byteArray1, 995, (byte) (-31));
      assertFalse(byteArray2.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      try { 
        T4AndT6Compression.compressModifiedHuffman(byteArray0, (byte)60, (byte)12);
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
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 0, (-1854));
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-9);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)4, (byte)47, true, 247);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, 1, (byte)63, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }
}
