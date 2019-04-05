/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 19:34:53 GMT 2019
 */

package net.kencochrane.a4j.DAO;

import org.junit.Test;
import static org.junit.Assert.*;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.beans.FullProduct;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Product_ESTest extends Product_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Product product0 = new Product();
      FullProduct fullProduct0 = product0.getProduct("N/#3Q(*o2^]*]^", ">CVuB*X=]vHpM#{`]MF", (String) null);
      assertNull(fullProduct0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Product product0 = new Product();
      FullProduct fullProduct0 = product0.getProduct("i$4WqRwQMV=~A`@Z*", "", "");
      assertNull(fullProduct0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Product product0 = new Product();
      FullProduct fullProduct0 = product0.getProduct((String) null, (String) null, ">CVuB*X=]vHpM#{`]MF");
      assertNull(fullProduct0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Product product0 = new Product();
      FullProduct fullProduct0 = product0.getProduct("", "M.nN", "M.nN");
      assertNull(fullProduct0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Product product0 = new Product();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/OPE?$M_II JN,`!*GT^:I_HEAVY_OPE?$M.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "_'@|H{mHB/>@33");
      FullProduct fullProduct0 = product0.getProduct("ope?$M", "ii jN,`!*gT^:i", "ope?$M");
      assertNotNull(fullProduct0);
  }
}