/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 13:40:37 GMT 2019
 */

package org.firebirdsql.encodings;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.firebirdsql.encodings.Encoding;
import org.firebirdsql.encodings.EncodingFactory;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EncodingFactory_ESTest extends EncodingFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1253", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = EncodingFactory.getCharacterSetSize(60);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      EncodingFactory.getTranslator((String) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      EncodingFactory.getTranslator("");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = EncodingFactory.getJavaEncodingForAlias("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = EncodingFactory.getJavaEncoding("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = EncodingFactory.getIscEncodingSize("");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = EncodingFactory.getIscEncoding("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.getEncoding("", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      EncodingFactory.getEncoding("z", "");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      EncodingFactory.getEncoding((String) null, "#6%`\"*VXNj,J4$;");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      EncodingFactory.getEncoding("", "N`");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = EncodingFactory.getCharacterSetSize(0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.createEncoding((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      EncodingFactory.getTranslator("Cp858");
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_3");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp860");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp437");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1257");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1255");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1254");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EncodingFactory.getIscEncoding("KSC_5601");
      String string0 = EncodingFactory.getJavaEncodingForAlias("ad i%q4tom%DyoBy{");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = EncodingFactory.getJavaEncodingForAlias((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = EncodingFactory.getJavaEncoding("DOS857");
      assertEquals("Cp857", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = EncodingFactory.getJavaEncoding((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EncodingFactory.getIscEncodingSize("N]+x'PJo|");
      int int0 = EncodingFactory.getIscEncodingSize("% u&J\"^er");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int int0 = EncodingFactory.getIscEncodingSize((String) null);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = EncodingFactory.getIscEncodingSize("DOS737");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      EncodingFactory.getIscEncoding("^-Vw'{ogjZjPj6+;");
      String string0 = EncodingFactory.getIscEncoding("Cp437");
      assertEquals("DOS437", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = EncodingFactory.getIscEncoding((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      EncodingFactory.getIscEncoding("d(C:'}trc|8r");
      String string0 = EncodingFactory.getJavaEncoding("Cp858");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      char[] charArray0 = new char[5];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_13", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_9", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_8", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_7", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      char[] charArray0 = new char[13];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_6", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_5", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_4", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_3", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_2", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      char[] charArray0 = new char[8];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_1", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp869", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp866", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp865", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp864", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp863", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      char[] charArray0 = new char[5];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp862", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      char[] charArray0 = new char[8];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp861", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp860", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.getEncoding("Cp858", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp857", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.getEncoding("Cp852", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp850", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      char[] charArray0 = new char[8];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp775", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp737", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.getEncoding("Cp437", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1257", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1256", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1255", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1254", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1252", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      char[] charArray0 = new char[13];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1251", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      char[] charArray0 = new char[13];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1250", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("utf8");
      Encoding encoding0 = EncodingFactory.getEncoding("utf8", (char[]) null);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      char[] charArray0 = new char[1];
      Encoding encoding0 = EncodingFactory.getEncoding("NONE", charArray0);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding((String) null, (char[]) null);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding((String) null);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      int int0 = EncodingFactory.getCharacterSetSize((-2945));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_13");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_9");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_8");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_7");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_6");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_5");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_4");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("ISO8859_3");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_2");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_1");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp869");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp866");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp865");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp864");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp862");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp861");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp858");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp857");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp852");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp850");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp775");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp737");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("Cp1257", (String) null);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1256");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1253");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1252");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test96()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1251");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test97()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1250");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test98()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias(",OL~nx2Pe+lYB-AX");
      Encoding encoding0 = EncodingFactory.createEncoding("cp863");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test99()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("NONE");
      assertNotNull(encoding0);
  }
}
