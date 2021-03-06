/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 00:10:20 GMT 2019
 */

package weka.classifiers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedReader;
import java.io.StringReader;
import java.util.Arrays;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.classifiers.AbstractClassifier;
import weka.classifiers.CheckClassifier;
import weka.classifiers.Classifier;
import weka.classifiers.CostMatrix;
import weka.classifiers.Evaluation;
import weka.classifiers.functions.SMO;
import weka.classifiers.lazy.IBk;
import weka.classifiers.lazy.LWL;
import weka.classifiers.meta.CostSensitiveClassifier;
import weka.classifiers.meta.RandomCommittee;
import weka.classifiers.trees.M5P;
import weka.clusterers.SimpleKMeans;
import weka.core.Instances;
import weka.core.TestInstances;
import weka.core.Utils;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CheckClassifier_ESTest extends CheckClassifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      RandomCommittee randomCommittee0 = new RandomCommittee();
      randomCommittee0.setSeed(31);
      checkClassifier0.setClassifier(randomCommittee0);
      checkClassifier0.getRevision();
      Utils.SMALL = (double) 31;
      System.setCurrentTimeMillis(1L);
      // Undeclared exception!
      try { 
        checkClassifier0.doTests();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Loop has been executed more times than the allowed 10000
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      int int0 = 1;
      checkClassifier0.setNumDate(1);
      boolean boolean0 = true;
      checkClassifier0.setDebug(true);
      checkClassifier0.setDebug(true);
      Utils.SMALL = (-38801.631513463784);
      checkClassifier0.listOptions();
      checkClassifier0.declaresSerialVersionUID();
      checkClassifier0.getClassifier();
      boolean boolean1 = true;
      boolean boolean2 = false;
      boolean boolean3 = false;
      boolean boolean4 = true;
      checkClassifier0.correctBuildInitialisation(true, false, false, true, false, false, 1);
      int int1 = (-2911);
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleZeroTraining(true, false, false, false, false, false, (-2911));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-2911' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      IBk iBk0 = new IBk();
      iBk0.getTechnicalInformation();
      iBk0.setWindowSize(2213);
      checkClassifier0.setClassifier(iBk0);
      Random.setNextRandom(1);
      // Undeclared exception!
      try { 
        checkClassifier0.doTests();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Problem determining ZeroR performance: Loop has been executed more times than the allowed 10000
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, true);
      checkClassifier0.updateableClassifier();
      checkClassifier0.setClassifier((Classifier) null);
      checkClassifier0.doTests();
      boolean boolean0 = false;
      checkClassifier0.getRevision();
      checkClassifier0.getOptions();
      boolean boolean1 = false;
      // Undeclared exception!
      try { 
        checkClassifier0.declaresSerialVersionUID();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, (String) null);
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.setClassifier((Classifier) null);
      int int0 = 2329;
      checkClassifier0.getRevision();
      checkClassifier0.setNumNominal(2329);
      System.setCurrentTimeMillis(0L);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "8034";
      stringArray0[1] = "8034";
      stringArray0[2] = "8034";
      CheckClassifier.main(stringArray0);
      checkClassifier0.updateableClassifier();
      checkClassifier0.testToString();
      checkClassifier0.printAttributeSummary(false, false, false, false, true, false, 2329);
      checkClassifier0.updateableClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.updatingEquality(false, false, true, true, false, false, 2329);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '2329' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.updatingEquality(true, false, false, false, true, false, 1);
      // Undeclared exception!
      try { 
        checkClassifier0.testsPerClassType(1, true, true, false);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Problem determining ZeroR performance: Loop has been executed more times than the allowed 10000
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      Classifier classifier0 = null;
      checkClassifier0.updateableClassifier();
      checkClassifier0.setClassifier((Classifier) null);
      checkClassifier0.doTests();
      checkClassifier0.getRevision();
      checkClassifier0.canTakeOptions();
      checkClassifier0.canTakeOptions();
      checkClassifier0.listOptions();
      checkClassifier0.weightedInstancesHandler();
      TestInstances testInstances0 = new TestInstances();
      testInstances0.generate();
      StringReader stringReader0 = new StringReader(".arff");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
      BufferedReader bufferedReader1 = null;
      try {
        bufferedReader1 = new BufferedReader(bufferedReader0, (-2));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Buffer size <= 0
         //
         verifyException("java.io.BufferedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      Classifier classifier0 = null;
      checkClassifier0.updateableClassifier();
      checkClassifier0.setClassifier((Classifier) null);
      checkClassifier0.doTests();
      checkClassifier0.getRevision();
      boolean boolean0 = false;
      checkClassifier0.canTakeOptions();
      int int0 = 2;
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleNClasses(false, false, true, true, true, false, 2);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: No model classifier set
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      Classifier classifier0 = null;
      checkClassifier0.updateableClassifier();
      checkClassifier0.setClassifier((Classifier) null);
      checkClassifier0.doTests();
      boolean boolean0 = false;
      checkClassifier0.getRevision();
      boolean boolean1 = false;
      // Undeclared exception!
      try { 
        checkClassifier0.canPredict(false, false, false, true, false, false, 18);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '18' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      int int0 = 2;
      checkClassifier0.correctBuildInitialisation(false, false, true, false, false, false, 2);
      checkClassifier0.makeTestDataset(2, 2, 2, 2, 2, 84, 2084, 2, (-589), false);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Random.setNextRandom(2);
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.testToString();
      checkClassifier0.testsPerClassType(2, true, true, false);
      boolean[] booleanArray0 = checkClassifier0.canHandleClassAsNthAttribute(true, false, false, false, true, false, 2, 2);
      assertEquals(2, booleanArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.multiInstanceHandler();
      int int0 = (-1);
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleClassAsNthAttribute(false, false, false, false, true, true, (-1), (-1));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-1' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      IBk iBk0 = new IBk((-1347));
      checkClassifier0.setClassifier(iBk0);
      iBk0.setWindowSize(29);
      iBk0.enumerateMeasures();
      checkClassifier0.canHandleZeroTraining(false, false, false, false, true, true, 2);
      checkClassifier0.testToString();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "_d{H9ez7U";
      stringArray0[1] = "(test weights all 1.0\n";
      stringArray0[2] = ", comparing results from builds of dataset 1";
      stringArray0[3] = "*aA^3)t5L`*CSH";
      stringArray0[4] = "weka.classifiers.meta.MultiClassClassifier$StandardCode";
      stringArray0[5] = "]BK4TNm,5:&RZj";
      stringArray0[6] = "-uFi";
      CheckClassifier.main(stringArray0);
      // Undeclared exception!
      try { 
        checkClassifier0.doTests();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Loop has been executed more times than the allowed 10000
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "Invalid NearestNeighbourSearch algorithm specification string.");
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean boolean0 = true;
      checkClassifier0.getRevision();
      boolean boolean1 = false;
      checkClassifier0.correctBuildInitialisation(false, false, false, true, false, false, 3);
      checkClassifier0.setNumDate(3);
      checkClassifier0.getClassifier();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Invalid NearestNeighbourSearch algorithm specification string.";
      checkClassifier0.setNumNumeric((-497));
      CheckClassifier.main(stringArray0);
      checkClassifier0.canHandleOnlyClass(false, true, false, true, false, 3);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)11;
      byteArray0[1] = (byte) (-80);
      byteArray0[2] = (byte)5;
      byteArray0[3] = (byte) (-112);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      int int0 = 3315;
      try { 
        checkClassifier0.makeTestDataset(0, 3, 1754, 3315, (-2661), (-497), 0, (-1176), (-1390), true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Attribute type '-1390' unknown!
         //
         verifyException("weka.core.TestInstances", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.getClassifier();
      checkClassifier0.instanceWeights(false, false, false, false, false, false, 3);
      boolean boolean0 = false;
      checkClassifier0.printAttributeSummary(false, false, false, true, true, false, 48);
      boolean boolean1 = false;
      boolean boolean2 = false;
      boolean boolean3 = true;
      boolean boolean4 = false;
      // Undeclared exception!
      try { 
        checkClassifier0.correctBuildInitialisation(false, true, true, false, true, false, 10000);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '10000' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      CheckClassifier checkClassifier0 = new CheckClassifier();
      Utils.SMALL = 0.0;
      EvoSuiteFile evoSuiteFile0 = null;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      LWL lWL0 = new LWL();
      lWL0.setKNN(2);
      checkClassifier0.setClassifier(lWL0);
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        checkClassifier0.doesntUseTestClassVal(false, false, true, true, true, false, 0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: weka.classifiers.trees.DecisionStump: Cannot handle string attributes!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean boolean0 = false;
      boolean boolean1 = false;
      boolean boolean2 = false;
      int int0 = 0;
      int int1 = (-1839);
      checkClassifier0.setNumInstancesRelational((-1839));
      // Undeclared exception!
      try { 
        checkClassifier0.testsPerClassType(0, false, false, true);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Problem determining ZeroR performance: Loop has been executed more times than the allowed 10000
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "Y.H. Dai and Y. Yuan");
      int int0 = 59;
      checkClassifier0.getOptions();
      checkClassifier0.canHandleNClasses(false, false, false, true, true, false, 59);
      CostSensitiveClassifier costSensitiveClassifier0 = new CostSensitiveClassifier();
      String[] stringArray0 = new String[3];
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      stringArray0[0] = "f<5XoM#y*B+h#";
      stringArray0[1] = "h<iDvjY_wkJ9";
      stringArray0[2] = "Y.H. Dai and Y. Yuan";
      int int1 = 2744;
      checkClassifier0.setNumDate(2744);
      AbstractClassifier.runClassifier(costSensitiveClassifier0, stringArray0);
      checkClassifier0.setClassifier(costSensitiveClassifier0);
      checkClassifier0.datasetIntegrity(false, false, false, false, false, false, 2, false, false);
      // Undeclared exception!
      try { 
        checkClassifier0.doTests();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Loop has been executed more times than the allowed 10000
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      CostSensitiveClassifier costSensitiveClassifier0 = new CostSensitiveClassifier();
      checkClassifier0.setClassifier(costSensitiveClassifier0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      boolean boolean0 = false;
      checkClassifier0.getOptions();
      checkClassifier0.weightedInstancesHandler();
      int int0 = 22;
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleZeroTraining(false, true, false, false, false, true, 22);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '22' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean boolean0 = true;
      boolean boolean1 = false;
      checkClassifier0.setDebug(false);
      boolean boolean2 = true;
      boolean boolean3 = true;
      int int0 = 3;
      // Undeclared exception!
      try { 
        checkClassifier0.updatingEquality(false, false, false, true, true, true, 3);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Loop has been executed more times than the allowed 10000
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      M5P m5P0 = new M5P();
      checkClassifier0.setClassifier(m5P0);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)20;
      byteArray0[1] = (byte)6;
      byteArray0[2] = (byte) (-91);
      byteArray0[3] = (byte)26;
      byteArray0[4] = (byte)20;
      byteArray0[5] = (byte)36;
      byteArray0[6] = (byte)35;
      byteArray0[7] = (byte)23;
      byteArray0[8] = (byte)39;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      checkClassifier0.getOptions();
      SimpleKMeans simpleKMeans0 = new SimpleKMeans();
      simpleKMeans0.getClusterStandardDevs();
      Evaluation evaluation0 = null;
      try {
        evaluation0 = new Evaluation((Instances) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean boolean0 = false;
      boolean boolean1 = false;
      // Undeclared exception!
      try { 
        checkClassifier0.instanceWeights(false, false, false, false, false, false, 1734);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '1734' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.setDebug(true);
      checkClassifier0.weightedInstancesHandler();
      checkClassifier0.getClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.updatingEquality(true, true, true, true, true, true, (-1767));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-1767' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.listOptions();
      checkClassifier0.declaresSerialVersionUID();
      boolean boolean0 = false;
      boolean boolean1 = false;
      boolean boolean2 = false;
      // Undeclared exception!
      try { 
        checkClassifier0.instanceWeights(false, true, true, false, false, false, 4058);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '4058' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.printAttributeSummary(true, false, true, true, true, true, (-265));
      boolean[] booleanArray0 = checkClassifier0.updatingEquality(false, false, true, true, false, true, 1);
      assertTrue(Arrays.equals(new boolean[] {false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.weightedInstancesHandler();
      checkClassifier0.setWordSeparators("Y%p=4AT");
      int int0 = (-1);
      // Undeclared exception!
      try { 
        checkClassifier0.correctBuildInitialisation(false, false, false, false, false, false, (-1));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-1' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean boolean0 = true;
      boolean boolean1 = true;
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      checkClassifier0.setSilent(true);
      // Undeclared exception!
      try { 
        checkClassifier0.doesntUseTestClassVal(true, true, true, true, false, false, 2);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: weka.classifiers.rules.ZeroR: Cannot handle string class!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.testToString();
      boolean boolean0 = false;
      int int0 = (-241);
      // Undeclared exception!
      try { 
        checkClassifier0.correctBuildInitialisation(true, false, false, false, false, false, (-241));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-241' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.getRevision();
      checkClassifier0.declaresSerialVersionUID();
      // Undeclared exception!
      try { 
        checkClassifier0.doesntUseTestClassVal(false, false, false, true, true, false, 24);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '24' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "sjh`po%Qf1]s*+n<3cN";
      stringArray0[1] = "numeric";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "\nEmpty dataset:\n";
      stringArray0[5] = "j";
      CheckClassifier.main(stringArray0);
      System.setCurrentTimeMillis(0L);
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.datasetIntegrity(false, false, false, false, false, false, 48, true, false);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '48' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.declaresSerialVersionUID();
      boolean boolean0 = true;
      boolean boolean1 = false;
      boolean boolean2 = true;
      int int0 = (-2533);
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleMissing(true, true, true, true, false, false, (-672), true, true, (-2533));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-672' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      int int0 = (-2841);
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        checkClassifier0.testsPerClassType((-2841), true, true, true);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-2841' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.getOptions();
      // Undeclared exception!
      try { 
        checkClassifier0.doTests();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Loop has been executed more times than the allowed 10000
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleClassAsNthAttribute(false, true, true, false, true, false, (-555), (-555));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-555' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      String[] stringArray0 = new String[2];
      String string0 = "";
      checkClassifier0.setNumNominal(1852);
      CheckClassifier.main(stringArray0);
      Classifier classifier0 = null;
      Instances instances0 = null;
      try { 
        CostMatrix.parseMatlab("");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      int int0 = 1411;
      boolean boolean0 = true;
      boolean boolean1 = false;
      boolean boolean2 = false;
      boolean boolean3 = false;
      // Undeclared exception!
      try { 
        checkClassifier0.updatingEquality(true, false, false, false, false, false, 1411);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '1411' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      System.setCurrentTimeMillis((-2167L));
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      CheckClassifier checkClassifier0 = new CheckClassifier();
      SMO sMO0 = new SMO();
      checkClassifier0.m_Classifier = (Classifier) sMO0;
      checkClassifier0.listOptions();
      checkClassifier0.declaresSerialVersionUID();
      boolean boolean0 = false;
      boolean boolean1 = true;
      // Undeclared exception!
      try { 
        checkClassifier0.doTests();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Loop has been executed more times than the allowed 10000
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean boolean0 = true;
      boolean boolean1 = false;
      boolean boolean2 = true;
      // Undeclared exception!
      try { 
        checkClassifier0.setWords("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // At least 2 words must be provided!
         //
         verifyException("weka.core.CheckScheme", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "Invalid NearestNeighbourSearch algorithm specification string.");
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean boolean0 = true;
      checkClassifier0.getRevision();
      boolean boolean1 = false;
      checkClassifier0.datasetIntegrity(false, true, true, true, false, false, 3, true, true);
      checkClassifier0.setNumDate(3);
      checkClassifier0.getClassifier();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Invalid NearestNeighbourSearch algorithm specification string.";
      checkClassifier0.setNumNumeric((-497));
      CheckClassifier.main(stringArray0);
      checkClassifier0.canHandleOnlyClass(false, true, false, true, false, 3);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)11;
      byteArray0[1] = (byte) (-80);
      byteArray0[2] = (byte)5;
      byteArray0[3] = (byte) (-112);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, true);
      int int0 = 3315;
      try { 
        checkClassifier0.makeTestDataset(0, 3, 1754, 3315, (-2661), (-497), 0, (-1176), (-1390), true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Attribute type '-1390' unknown!
         //
         verifyException("weka.core.TestInstances", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean boolean0 = false;
      boolean boolean1 = false;
      boolean boolean2 = true;
      int int0 = 778;
      // Undeclared exception!
      try { 
        checkClassifier0.canPredict(true, false, false, true, true, true, (-3217));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-3217' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean boolean0 = true;
      boolean boolean1 = false;
      boolean boolean2 = true;
      int int0 = (-839);
      int int1 = 653;
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      // Undeclared exception!
      try { 
        checkClassifier0.doTests();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Loop has been executed more times than the allowed 10000
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)112;
      byteArray0[1] = (byte)15;
      byteArray0[2] = (byte)19;
      byteArray0[3] = (byte)100;
      byteArray0[4] = (byte) (-115);
      byteArray0[5] = (byte)67;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.updatingEquality(true, true, true, true, false, true, 255);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '255' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      System.setCurrentTimeMillis((-2167L));
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      CheckClassifier checkClassifier0 = new CheckClassifier();
      SMO sMO0 = new SMO();
      checkClassifier0.setDebug(true);
      checkClassifier0.m_Classifier = (Classifier) sMO0;
      checkClassifier0.listOptions();
      checkClassifier0.declaresSerialVersionUID();
      boolean boolean0 = false;
      boolean boolean1 = true;
      // Undeclared exception!
      try { 
        checkClassifier0.doTests();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Loop has been executed more times than the allowed 10000
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      CheckClassifier checkClassifier0 = new CheckClassifier();
      String[] stringArray0 = checkClassifier0.getOptions();
      FileSystemHandling.shouldAllThrowIOExceptions();
      checkClassifier0.testToString();
      checkClassifier0.testToString();
      checkClassifier0.getRevision();
      // Undeclared exception!
      try { 
        CheckClassifier.main(stringArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Loop has been executed more times than the allowed 10000
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.setNumRelational((-2129));
      checkClassifier0.getRevision();
      boolean boolean0 = true;
      boolean boolean1 = true;
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleOnlyClass(true, true, true, true, true, 500);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '500' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean boolean0 = true;
      int int0 = 4;
      checkClassifier0.canPredict(true, false, false, false, false, false, 4);
      checkClassifier0.setSilent(false);
      boolean boolean1 = true;
      // Undeclared exception!
      try { 
        checkClassifier0.updatingEquality(false, true, true, false, false, false, 4);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: weka.classifiers.rules.ZeroR: Cannot handle relational class!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }
}
