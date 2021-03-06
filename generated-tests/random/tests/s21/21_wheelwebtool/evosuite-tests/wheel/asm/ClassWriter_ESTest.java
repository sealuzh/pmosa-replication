/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 05:25:04 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import wheel.asm.AnnotationVisitor;
import wheel.asm.Attribute;
import wheel.asm.ClassReader;
import wheel.asm.ClassWriter;
import wheel.asm.FieldVisitor;
import wheel.asm.FieldWriter;
import wheel.asm.Item;
import wheel.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassWriter_ESTest extends ClassWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1024);
      classWriter0.visitSource("", "");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-589));
      // Undeclared exception!
      try { 
        classWriter0.visitMethod(12, "", "", "", (String[]) null);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(17);
      classWriter0.visitInnerClass("", "", "", 10);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1027));
      String[] stringArray0 = new String[5];
      // Undeclared exception!
      try { 
        classWriter0.visit((-1027), (-288), "", "", "", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-792));
      int int0 = classWriter0.newUTF8("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      int int0 = classWriter0.newUTF8("");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1760));
      Item item0 = classWriter0.newMethodItem("VgvI56=!l9S'", "", "^EQ3=d1{6", true);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      Item item0 = classWriter0.newLong(1);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1760));
      Item item0 = classWriter0.newLong((-1760));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      Item item0 = classWriter0.newInteger((-1));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1024);
      Item item0 = classWriter0.newFloat(0.0F);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-128));
      Item item0 = classWriter0.newFloat((-128));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-939));
      // Undeclared exception!
      try { 
        classWriter0.newFieldItem("", (String) null, "sV");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1082));
      Item item0 = classWriter0.newFieldItem("p:]b:C\"PR:D?c$I0J#", "+%G;>ouC6F+", "");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1082));
      Item item0 = classWriter0.newFieldItem("", "", ";Jp,LVax`r^R.hbC1 ");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1126);
      Item item0 = classWriter0.newDouble(0.0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(473);
      Item item0 = classWriter0.newDouble(473);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
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
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1760));
      Item item0 = classWriter0.newClassItem("RuntimeInvisibleAnnotations");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(17);
      Item item0 = classWriter0.newClassItem("");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      int int0 = classWriter0.newClass("Deprecated");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(17);
      int int0 = classWriter0.newClass("");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      // Undeclared exception!
      try { 
        classWriter0.getMergedType((-3257), 10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(17);
      int int0 = classWriter0.addUninitializedType("", (-66));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "iL/27v%0Y87|";
      stringArray0[2] = "";
      stringArray0[3] = "Synthetic";
      stringArray0[4] = "Synthetic";
      stringArray0[5] = "iL/27v%0Y87|";
      stringArray0[6] = "iL/27v%0Y87|";
      // Undeclared exception!
      try { 
        classWriter0.visitMethod(2621, "Synthetic", "", "iL/27v%0Y87|", stringArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2135);
      // Undeclared exception!
      try { 
        classWriter0.visitField(2135, (String) null, "Ft&r,z~", "ConstantValue", "ConstantValue");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(188);
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
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3135));
      // Undeclared exception!
      try { 
        classWriter0.newMethodItem("", (String) null, "", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(13);
      // Undeclared exception!
      try { 
        classWriter0.newMethod((String) null, "u:>If9S*jK", "NTL?g(6\"}", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-128));
      // Undeclared exception!
      try { 
        classWriter0.newFieldItem((String) null, "", "RuntimeInvisibleAnnotations");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(282);
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
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1760));
      classWriter0.addType("^EQ3=d1{6");
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(1, (-588));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -588
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1027));
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
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2007);
      classWriter0.index = 2007;
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1126);
      int int0 = classWriter0.newNameType("B;q?pTA_+RxA9Tw.:", "mLj)*f\"V.lOjMD");
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-537));
      Type type0 = Type.CHAR_TYPE;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "8.nVtxUtRuM", "SourceFile", "8.nVtxUtRuM", type0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(14);
      // Undeclared exception!
      try { 
        classWriter0.newClass((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      classWriter0.threshold = 16;
      classWriter0.newField("hbtRQQ4mn;I1v", "", "");
      classWriter0.threshold = 5;
      classWriter0.visitSource("Sensitive", "The FileFilter must not be null");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(473);
      String string0 = classWriter0.getCommonSuperClass("java/lang/Object", "java/lang/Object");
      assertEquals("java/lang/Object", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4);
      Item[] itemArray0 = new Item[1];
      classWriter0.typeTable = itemArray0;
      int int0 = classWriter0.addType("");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(30);
      int int0 = classWriter0.addUninitializedType("LocalVariableTable", 30);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(17);
      int int0 = classWriter0.addType("");
      assertEquals(1, int0);
      
      int int1 = classWriter0.addType("");
      assertEquals(1, int1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      Item item0 = classWriter0.newMethodItem("uLES1YDR", "uLES1YDR", "uLES1YDR", true);
      Item item1 = classWriter0.newMethodItem("Pw,CQ\"MfmuXl-5Q7$", "uLES1YDR", "uLES1YDR", false);
      assertNotSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(11);
      classWriter0.visitField(11, "4yk[mJpa6(?", "4yk[mJpa6(?", "", "");
      Item item0 = classWriter0.newConstItem("");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2550);
      Item item0 = classWriter0.newDouble((-1.0));
      Item item1 = classWriter0.newDouble((-1.0));
      assertSame(item1, item0);
      assertNotNull(item1);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(14);
      Item item0 = classWriter0.newLong(0L);
      Item item1 = classWriter0.newLong(0L);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1126);
      Item item0 = classWriter0.newFloat(1126);
      Item item1 = classWriter0.newFloat(1126);
      assertSame(item1, item0);
      assertNotNull(item1);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2007);
      Item item0 = classWriter0.newInteger(2007);
      Item item1 = classWriter0.newInteger(2007);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(41);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        classWriter0.newConst(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@2c4e21cd
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2007);
      Double double0 = new Double((-2719.6195149));
      Item item0 = classWriter0.newConstItem(double0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2550);
      Long long0 = new Long(2);
      int int0 = classWriter0.newConst(long0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(7);
      Float float0 = new Float((float) 247);
      Item item0 = classWriter0.newConstItem(float0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1808));
      Boolean boolean0 = Boolean.valueOf(false);
      Item item0 = classWriter0.newConstItem(boolean0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(14);
      Boolean boolean0 = Boolean.TRUE;
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1024);
      Short short0 = new Short((short)31);
      Item item0 = classWriter0.newConstItem(short0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-852));
      Character character0 = Character.valueOf('1');
      int int0 = classWriter0.newConst(character0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1835);
      Byte byte0 = new Byte((byte)3);
      int int0 = classWriter0.newConst(byte0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-939));
      Item item0 = classWriter0.newConstItem(classWriter0.COMPUTE_MAXS);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(30);
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
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(30);
      Attribute attribute0 = new Attribute("Synthetic");
      byte[] byteArray0 = new byte[6];
      attribute0.value = byteArray0;
      classWriter0.visitAttribute(attribute0);
      byte[] byteArray1 = classWriter0.toByteArray();
      assertEquals(48, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      classWriter0.visitAnnotation("The FileFilter must not be null", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(98, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      classWriter0.visitInnerClass("java/lang/String", "P.]aD`", "-p#{,6/A+\"l'57@zwb", (-1346));
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(111, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1126);
      classWriter0.visitSource("", "UC=l");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(81, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "java/lang/String";
      stringArray0[1] = "wheel.asm.AnnotationWriter";
      stringArray0[2] = "wheel.asm.AnnotationWriter";
      stringArray0[3] = "wheel.asm.AnnotationWriter";
      stringArray0[4] = "wheel.asm.AnnotationWriter";
      stringArray0[5] = ";4!Mon[Y>IIUt";
      classWriter0.visit((-6), (-1346), "java/lang/String", "java/lang/String", "wheel.asm.AnnotationWriter", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(148, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      String[] stringArray0 = new String[0];
      classWriter0.visitMethod(3725, "{Gg-Fe\":{", "{Gg-Fe\":{", "{Gg-Fe\":{", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(64, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16);
      Type type0 = Type.getObjectType("LL./rs%([<Dt6rwOqs");
      classWriter0.visitField(16, "0*]]", "j(h*MXyVy^LX", "0*]]", type0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(122, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-128));
      classWriter0.visitInnerClass((String) null, "The list of prefixes must not be null", (String) null, (-217));
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(282);
      classWriter0.visitInnerClass("E(a", (String) null, "9Fb,_Z$pB2~'1UgOuB", 282);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      classWriter0.visitInnerClass("java/lang/String", "P.]aD`", "-p#{,6/A+\"l'57@zwb", (-1346));
      classWriter0.visitInnerClass("RuntimeVisibleParameterAnnotations", "wheel.asm.AnnotationWriter", "", 1199);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(7);
      classWriter0.visitAnnotation("wheel.asm.AnnotationWriter", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(95, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(188);
      String string0 = "C=";
      classWriter0.visitOuterClass("C=", string0, "");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      classWriter0.visitOuterClass("wheel.asm.AnnotationWriter", "wheel.asm.AnnotationWriter", (String) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(84, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1835);
      classWriter0.visitOuterClass("", (String) null, "java/lang/String");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1126);
      classWriter0.visitSource("mLj)*f\"V.lOjMD", (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-792));
      classWriter0.visitSource((String) null, "%s");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "0*]]";
      stringArray0[1] = "0*]]";
      stringArray0[2] = "0*]]";
      stringArray0[3] = "0*]]";
      stringArray0[4] = "dF6@H^ZY$_&SoK4-\"";
      classWriter0.visit(16, 16, "0*]]", "0*]]", "0*]]", stringArray0);
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2007);
      classWriter0.visit(2007, 2007, "|b\"@y*duik-A", "", (String) null, (String[]) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(41);
      String[] stringArray0 = new String[0];
      classWriter0.visit(682, 47, "InnerClasses", "gT@", "Signature", stringArray0);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4884));
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        classWriter0.visit((-2725), Integer.MAX_VALUE, "X,a+[TR=MP", (String) null, (String) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2548);
      classWriter0.visitEnd();
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2548);
      int int0 = classWriter0.newMethod("wheel.asm.ClassWriter", "/[rH)%! L?", "r_Jh;vF", true);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      ClassWriter classWriter0 = null;
      try {
        classWriter0 = new ClassWriter((ClassReader) null, 59);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(188);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(188, "C=", "", "r0M9dkCh", "C=");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2548);
      Attribute attribute0 = new Attribute("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII");
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

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-128));
      int int0 = classWriter0.newField("qJf#I:+:`s<|O&%?_ ", "1wk*bme$Lb", "qJf#I:+:`s<|O&%?_ ");
      assertEquals(5, int0);
  }
}
