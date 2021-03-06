/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 08:43:29 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataInputStream;
import java.io.InputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import wheel.asm.AnnotationVisitor;
import wheel.asm.Attribute;
import wheel.asm.ClassReader;
import wheel.asm.ClassWriter;
import wheel.asm.FieldVisitor;
import wheel.asm.Item;
import wheel.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassWriter_ESTest extends ClassWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      classWriter0.visitSource("", "");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(50);
      classWriter0.visitOuterClass("<fT\">c~^s\u0000/S$c", "", "");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      String[] stringArray0 = new String[6];
      // Undeclared exception!
      try { 
        classWriter0.visitMethod(4, ":$*ya6LU]_M'w", "SourceDebugExtension", ":$*ya6LU]_M'w", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4310));
      classWriter0.visitInnerClass("", "", "", 20);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(10, "", "", "#CBm[y,/<bHxAE", (Object) null);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4310));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2274);
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        classWriter0.visit(21, 2274, (String) null, (String) null, (String) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      int int0 = classWriter0.newUTF8("");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4);
      int int0 = classWriter0.newNameType("-RGBQT+*n:H9$?-", "");
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      // Undeclared exception!
      try { 
        classWriter0.newMethodItem("F6g&uk';OHf", (String) null, "", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3241);
      Item item0 = classWriter0.newMethodItem("EnclosingMethod", "", "EnclosingMethod", false);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3117));
      Item item0 = classWriter0.newMethodItem("", ";ruqj_P[!e", "''UxIR6NH< ", true);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(68);
      // Undeclared exception!
      try { 
        classWriter0.newMethod("CHX>7c,f\"p|@N5[<ju", (String) null, "q3)IDRq;;B/2KHx", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1024);
      Item item0 = classWriter0.newLong((-3258L));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4);
      Item item0 = classWriter0.newInteger(0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4310));
      Item item0 = classWriter0.newInteger((-4310));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(9);
      Item item0 = classWriter0.newFloat(0.0F);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1085));
      Item item0 = classWriter0.newFloat((-260.0F));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3301);
      // Undeclared exception!
      try { 
        classWriter0.newFieldItem("Synthetic", (String) null, "\"z@shJ<t*N6p_");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3117));
      Item item0 = classWriter0.newFieldItem("SourceDebugExtension", "InnerClasses", "''UxIR6NH< ");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1271);
      int int0 = classWriter0.newField("F4P+bCB56n9AtJ>", "StackMapTable", "StackMapTable");
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      int int0 = classWriter0.newField("", "", "");
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2808);
      // Undeclared exception!
      try { 
        classWriter0.newConstItem((Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(31);
      // Undeclared exception!
      try { 
        classWriter0.newConst((Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(31);
      int int0 = classWriter0.newClass("");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1085));
      // Undeclared exception!
      try { 
        classWriter0.getMergedType((-1085), (-1085));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(26);
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(26, 26);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(768);
      // Undeclared exception!
      try { 
        classWriter0.getCommonSuperClass((String) null, "9Fn?'jW${!X");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NullPointerException
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(40);
      // Undeclared exception!
      try { 
        classWriter0.getCommonSuperClass("", "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.ClassNotFoundException: 
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3117));
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "$";
      stringArray0[2] = "";
      stringArray0[3] = "";
      // Undeclared exception!
      try { 
        classWriter0.visitMethod((-3117), "", ";ruqj_P[!e", "IvOl)[kYetAd).z`", stringArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(45);
      // Undeclared exception!
      try { 
        classWriter0.visitAttribute((Attribute) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(181);
      // Undeclared exception!
      try { 
        classWriter0.newMethodItem("java/lang/Object", "java/lang/Object", (String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      // Undeclared exception!
      try { 
        classWriter0.newMethod((String) null, "RuntimeInvisibleAnnotations", (String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1939);
      // Undeclared exception!
      try { 
        classWriter0.newFieldItem((String) null, ".rN-Zb", "o8Tv4_Te|@_R8K");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1125);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        classWriter0.newConstItem(dataInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.io.DataInputStream@3f07846a
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1271);
      Item item0 = classWriter0.newDouble(1271);
      // Undeclared exception!
      try { 
        classWriter0.newConst(item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.Item@6
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      // Undeclared exception!
      try { 
        classWriter0.getCommonSuperClass("ya)", "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.ClassNotFoundException: Class 'ya).class' should be in target project, but could not be found!
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3117));
      int int0 = classWriter0.newNameType("$", "$");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1125);
      int int0 = classWriter0.newUTF8("<=+<x7V{#v!&.");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "w[=";
      stringArray0[1] = "w[=";
      stringArray0[2] = "xLa}gE_6;z4/";
      stringArray0[3] = "w[=";
      classWriter0.visit(756, (-3366), "Signature", "xLa}gE_6;z4/", "Signature", stringArray0);
      int int0 = classWriter0.newUTF8("xLa}gE_6;z4/");
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2787);
      int int0 = classWriter0.newClass("Signature");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4);
      classWriter0.newClassItem("?zM{lYA^i+t$@(");
      classWriter0.index = 2803;
      int int0 = classWriter0.addType("J-7>Q");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5);
      classWriter0.threshold = (-3162);
      classWriter0.visitInnerClass("", "", (String) null, (-2932));
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2787);
      int int0 = classWriter0.newMethod("", "Signature", "LocalVariableTypeTable", false);
      assertEquals(6, int0);
      
      Long long0 = new Long(2);
      int int1 = classWriter0.newConst(long0);
      assertEquals(7, int1);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1571));
      String string0 = classWriter0.getCommonSuperClass("java/lang/Throwable", "java/lang/Throwable");
      assertEquals("java/lang/Throwable", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(768);
      Item[] itemArray0 = new Item[1];
      classWriter0.typeTable = itemArray0;
      classWriter0.addType("-&fN4AY23`E1Np`<");
      int int0 = classWriter0.addType("");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1271);
      classWriter0.addType("StackMapTable");
      int int0 = classWriter0.addUninitializedType("F4P+bCB56n9AtJ>", 168);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      int int0 = classWriter0.addType("");
      assertEquals(1, int0);
      
      int int1 = classWriter0.addType("");
      assertEquals(1, int1);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(68);
      Item item0 = classWriter0.newDouble(0.0);
      Item item1 = classWriter0.newDouble(0.0);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3301);
      Item item0 = classWriter0.newLong(3301);
      Item item1 = classWriter0.newLong(3301);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      Item item0 = classWriter0.newFloat(18);
      Item item1 = classWriter0.newFloat(18);
      assertNotNull(item1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(50);
      Item item0 = classWriter0.newInteger(50);
      Item item1 = classWriter0.newInteger(50);
      assertSame(item1, item0);
      assertNotNull(item1);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      Item item0 = classWriter0.newMethodItem("?oJsfr4XZ", "?oJsfr4XZ", "?oJsfr4XZ", false);
      Item item1 = classWriter0.newMethodItem("?oJsfr4XZ", "?oJsfr4XZ", "?oJsfr4XZ", false);
      assertSame(item1, item0);
      assertNotNull(item1);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(31);
      Item item0 = classWriter0.newFieldItem("", "", "");
      Item item1 = classWriter0.newFieldItem("", "", "");
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2274);
      Type type0 = Type.BOOLEAN_TYPE;
      Item item0 = classWriter0.newConstItem(type0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-498));
      Class<Double> class0 = Double.class;
      Type type0 = Type.getType(class0);
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.newConst("jo@l_3`T)}I]");
      int int0 = classWriter0.newConst("jo@l_3`T)}I]");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2787);
      Double double0 = new Double((-208.0776357155));
      FieldVisitor fieldVisitor0 = classWriter0.visitField(6, "Signature", "\"F)!", "", double0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3241);
      Float float0 = new Float((float) 1);
      int int0 = classWriter0.newConst(float0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(9);
      Boolean boolean0 = new Boolean(true);
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(385);
      Boolean boolean0 = Boolean.valueOf("3'&HaQ");
      Item item0 = classWriter0.newConstItem(boolean0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(40);
      Short short0 = new Short((short)192);
      int int0 = classWriter0.newConst(short0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1271);
      Character character0 = Character.valueOf('V');
      int int0 = classWriter0.newConst(character0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1125);
      Byte byte0 = new Byte((byte)36);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(25165824, "<=+<x7V{#v!&.", "", "<=+<x7V{#v!&.", byte0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      Item item0 = classWriter0.newConstItem(classWriter0.COMPUTE_FRAMES);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(590);
      classWriter0.invalidFrames = true;
      // Undeclared exception!
      try { 
        classWriter0.toByteArray();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 51966
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3117));
      classWriter0.visitAnnotation("$", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(70, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.visitInnerClass("java/lang/Throwable", "kXm/d*$M-i=Tt{^9", "EnclosingMethod", 823);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(121, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "w[=";
      stringArray0[1] = "w[=";
      stringArray0[2] = "xLa}gE_6;z4/";
      stringArray0[3] = "w[=";
      classWriter0.visit(756, (-3366), "Signature", "xLa}gE_6;z4/", "Signature", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(101, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1939);
      classWriter0.visitOuterClass("LocalVariableTable", ".rN-Zb", (String) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(76, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      classWriter0.visitMethod(0, "jo@l_3`T)}I]", "", "", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(96, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3117));
      classWriter0.visitField(2140, "$", "", "", (Object) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(59, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1571));
      classWriter0.visitInnerClass("9q_Z", (String) null, ";P6)|L6V2)lDS~Yfb_", (-1571));
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3140);
      classWriter0.visitInnerClass((String) null, "", (String) null, 22);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.visitInnerClass("java/lang/Throwable", "kXm/d*$M-i=Tt{^9", "EnclosingMethod", 823);
      classWriter0.visitInnerClass("75R]Vo;~]REG", "", "+L6", 216);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5);
      classWriter0.visitAnnotation("EnclosingMethod", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(82, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      classWriter0.visitOuterClass("", "", (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.visitOuterClass("jo@l_3`T)}I]", "jo@l_3`T)}I]", "jo@l_3`T)}I]");
      int int0 = classWriter0.newNameType("jo@l_3`T)}I]", "jo@l_3`T)}I]");
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(385);
      classWriter0.visitOuterClass("StackMap", (String) null, "wpA[@r<98`beRep7d");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.visitSource("jo@l_3`T)}I]", "jo@l_3`T)}I]");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(101, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777225);
      classWriter0.visitSource((String) null, (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "ppK,k.'a{?75'";
      stringArray0[1] = "ppK,k.'a{?75'";
      stringArray0[2] = "vv~(pYONx ";
      stringArray0[3] = "ppK,k.'a{?75'";
      stringArray0[4] = "ppK,k.'a{?75'";
      stringArray0[5] = "jo@l_3`T)}I]";
      stringArray0[6] = "RuntimeInvisibleAnnotations";
      classWriter0.visit(0, 1320, "XJ1NF`D40LQM4vxUc[", "ppK,k.'a{?75'", "vv~(pYONx ", stringArray0);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2808);
      String[] stringArray0 = new String[0];
      classWriter0.visit((-928), (-928), "O^Uw9{su2", "", "", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(68);
      classWriter0.visit(68, (-305), "CHX>7c,f\"p|@N5[<ju", "", "", (String[]) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1878));
      String[] stringArray0 = new String[6];
      // Undeclared exception!
      try { 
        classWriter0.visit((-1878), 32, "WZI[Od.F0Cj<*f-5", "", (String) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1483);
      String[] stringArray0 = new String[5];
      // Undeclared exception!
      try { 
        classWriter0.visit(4, 2810, "wheel.asm.ByteVector", (String) null, "+8*%90 6W", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3117));
      classWriter0.visitEnd();
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      ClassWriter classWriter0 = null;
      try {
        classWriter0 = new ClassWriter((ClassReader) null, (-3130));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(9);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        classWriter0.visitField(11, "aZQ#. v5{xSb", "aZQ#. v5{xSb", "Y8mXl{)`V{?L9JHVB", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@1a15025b
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1024);
      Attribute attribute0 = new Attribute("t';WXXY{Mxv");
      classWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      try { 
        classWriter0.toByteArray();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Attribute", e);
      }
  }
}
