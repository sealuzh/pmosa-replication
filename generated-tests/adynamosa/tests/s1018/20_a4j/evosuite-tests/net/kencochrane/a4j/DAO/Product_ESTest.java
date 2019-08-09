/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 03:57:03 GMT 2019
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
      FullProduct fullProduct0 = product0.getProduct("Icd_CYts5N;Kc]PM9", "", "");
      assertNull(fullProduct0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Product product0 = new Product();
      FullProduct fullProduct0 = product0.getProduct("# of items - ", "# of Actors = ", "=!7=uh_$H");
      assertNull(fullProduct0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Product product0 = new Product();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/NULL_NULL_HEAVY_NULL.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "Ciw0m");
      FullProduct fullProduct0 = product0.getProduct((String) null, (String) null, (String) null);
      assertNotNull(fullProduct0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Product product0 = new Product();
      FullProduct fullProduct0 = product0.getProduct("", "uXm", "net.kencochrane.a4j.DAO.Product");
      assertNull(fullProduct0);
  }
}
