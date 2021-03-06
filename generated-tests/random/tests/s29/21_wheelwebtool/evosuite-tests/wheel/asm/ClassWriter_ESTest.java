/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 14:28:04 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;
import wheel.asm.AnnotationVisitor;
import wheel.asm.Attribute;
import wheel.asm.ClassReader;
import wheel.asm.ClassWriter;
import wheel.asm.FieldVisitor;
import wheel.asm.FieldWriter;
import wheel.asm.Item;
import wheel.asm.MethodVisitor;
import wheel.asm.MethodWriter;
import wheel.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassWriter_ESTest extends ClassWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777222);
      classWriter0.index = (-2079);
      Long long0 = new Long(16777222);
      int int0 = classWriter0.newConst(long0);
      assertEquals((-2079), int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777222);
      classWriter0.index = (-2079);
      int int0 = classWriter0.newClass("0#");
      assertEquals((-2078), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(46);
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        classWriter0.visitMethod((-1905), "int", ";~TQI&P%G}_g:", "", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      MethodVisitor methodVisitor0 = classWriter0.visitMethod(5437, "", "", ".s.IFJDCS", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(171);
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        classWriter0.visitMethod(2, (String) null, "imT~~Hi$uuuIg_O?n}r", "Signature", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      int int0 = classWriter0.newUTF8("value ");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-958));
      int int0 = classWriter0.newUTF8("");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      int int0 = classWriter0.newNameType("", "");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-381));
      int int0 = classWriter0.newNameType("", "The array of prefixes must not be null");
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      Item item0 = classWriter0.newMethodItem("wheel.asm.ClassAdapter", "wheel.asm.ClassAdapter", "", false);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(35);
      Item item0 = classWriter0.newMethodItem("", "", "wheel.asm.Attribute", true);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1237));
      Item item0 = classWriter0.newLong(0L);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(192);
      Item item0 = classWriter0.newLong(192);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-958));
      Item item0 = classWriter0.newLong((-958));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1663));
      Item item0 = classWriter0.newInteger(43);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1663));
      Item item0 = classWriter0.newInteger((-2481));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-803));
      Item item0 = classWriter0.newFloat(0.0F);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-381));
      Item item0 = classWriter0.newDouble(0.0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4);
      Item item0 = classWriter0.newDouble((-1259.7118256374));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(24);
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
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      Item item0 = classWriter0.newClassItem("");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-803));
      int int0 = classWriter0.newClass("xtQMaq]z[(U9");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-381));
      int int0 = classWriter0.newClass("");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-817));
      // Undeclared exception!
      try { 
        classWriter0.getCommonSuperClass("", (String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.ClassNotFoundException: 
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(171);
      int int0 = classWriter0.addUninitializedType("", (-3289));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(171);
      int int0 = classWriter0.addType("");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2323));
      String[] stringArray0 = new String[6];
      stringArray0[0] = "aK]&7";
      stringArray0[1] = "org.apache.commons.io.filefilter.PrefixFileFilter";
      stringArray0[2] = "org.apache.commons.io.filefilter.PrefixFileFilter";
      stringArray0[3] = "e.X|*";
      stringArray0[4] = "a$VlfQ7*";
      stringArray0[5] = "org.apache.commons.io.filefilter.PrefixFileFilter";
      // Undeclared exception!
      try { 
        classWriter0.visitMethod(10, "wheel.asm.FieldWriter", "aK]&7", "q~Yx8-qnR", stringArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      // Undeclared exception!
      try { 
        classWriter0.visitField(1, "4viR#oP:|#mU~", (String) null, (String) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2953));
      Attribute attribute0 = new Attribute("7SuHVO;ky");
      classWriter0.visitAttribute(attribute0);
      classWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      classWriter0.toByteArray();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1064);
      // Undeclared exception!
      try { 
        classWriter0.newMethodItem("YW+lCf}wHs?L~nP4,-", "W-XdsDD5q57TYd(", (String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1237));
      // Undeclared exception!
      try { 
        classWriter0.newMethod((String) null, "idZ", "RuntimeVisibleAnnotations", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(42);
      // Undeclared exception!
      try { 
        classWriter0.newField(" ]3or<;T)^ }*", "Yf`Ci'!", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-803));
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
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(201);
      // Undeclared exception!
      try { 
        classWriter0.getCommonSuperClass("V", "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.ClassNotFoundException: Class 'V.class' should be in target project, but could not be found!
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(38);
      Item[] itemArray0 = new Item[0];
      classWriter0.typeTable = itemArray0;
      // Undeclared exception!
      try { 
        classWriter0.addUninitializedType("7*$`^?DC3", (-2821));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = null;
      try {
        classWriter0 = new ClassWriter((ClassReader) null, 47);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(512);
      int int0 = classWriter0.newNameType("EnclosingMethod", "EnclosingMethod");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2337);
      classWriter0.index = 2337;
      Item item0 = classWriter0.newClassItem("SourceFile");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-381));
      String string0 = classWriter0.getCommonSuperClass("java/lang/Class", "java/lang/Class");
      assertEquals("java/lang/Class", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-606));
      String string0 = classWriter0.getCommonSuperClass("java/lang/String", "org.apache.commons.io.FilenameUtils");
      assertEquals("java/lang/Object", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-32768));
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(5, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(19);
      Item[] itemArray0 = new Item[1];
      classWriter0.typeTable = itemArray0;
      int int0 = classWriter0.addType("H'j9*s_/_r$Gl%>a ");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-803));
      classWriter0.addUninitializedType("xtQMaq]z[(U9", 1632);
      int int0 = classWriter0.addUninitializedType("6[ntl`fWYgqv", 3);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(31);
      int int0 = classWriter0.addType("y,>'\"x^aNHg");
      assertEquals(1, int0);
      
      int int1 = classWriter0.addType("y,>'\"x^aNHg");
      assertEquals(1, int1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(35);
      classWriter0.visitOuterClass("", "", "");
      Item item0 = classWriter0.newFieldItem("EnclosingMethod", "", "");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-32768));
      Item item0 = classWriter0.newConstItem("");
      assertNotNull(item0);
      
      int int0 = classWriter0.newConst("");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(26);
      Item item0 = classWriter0.newDouble(1006.882217925374);
      Item item1 = classWriter0.newDouble(1006.882217925374);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(512);
      Long long0 = new Long(0L);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 11, "EBd(o", "EBd(o", "EBd(o", long0);
      int int0 = classWriter0.newConst(long0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(171);
      Item item0 = classWriter0.newFloat(171);
      Item item1 = classWriter0.newFloat(171);
      assertNotNull(item1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-817));
      int int0 = classWriter0.newMethod("", "", "", false);
      assertEquals(4, int0);
      
      int int1 = classWriter0.newMethod("", "", "", false);
      assertEquals(4, int1);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2953));
      int int0 = classWriter0.newMethod("InnerClasses", "InnerClasses", ")=)$U-s(;G\"pQs", true);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2665);
      classWriter0.newField("", "", "");
      Item item0 = classWriter0.newFieldItem("", "", "");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2198));
      Class<Object> class0 = Object.class;
      Type type0 = Type.getType(class0);
      Item item0 = classWriter0.newConstItem(type0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      Type type0 = Type.LONG_TYPE;
      Item item0 = classWriter0.newConstItem(type0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4);
      Double double0 = new Double(4);
      int int0 = classWriter0.newConst(double0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      Float float0 = new Float((double) 2);
      Item item0 = classWriter0.newConstItem(float0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777222);
      Boolean boolean0 = Boolean.TRUE;
      Item item0 = classWriter0.newConstItem(boolean0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(9);
      Boolean boolean0 = Boolean.FALSE;
      Item item0 = classWriter0.newConstItem(boolean0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1237));
      Short short0 = new Short((short)115);
      Item item0 = classWriter0.newConstItem(short0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2323));
      Character character0 = new Character('?');
      FieldVisitor fieldVisitor0 = classWriter0.visitField(3258, "e.X|*", "wheel.asm.FieldWriter", "org.apache.commons.io.filefilter.PrefixFileFilter", character0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(38);
      Byte byte0 = new Byte((byte)64);
      Item item0 = classWriter0.newConstItem(byte0);
      Item item1 = classWriter0.newConstItem(byte0);
      assertNotNull(item1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(13);
      Item item0 = classWriter0.newConstItem(classWriter0.COMPUTE_MAXS);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16);
      classWriter0.invalidFrames = true;
      // Undeclared exception!
      try { 
        classWriter0.toByteArray();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2953));
      byte[] byteArray0 = classWriter0.toByteArray();
      Attribute attribute0 = new Attribute("7SuHVO;ky");
      classWriter0.visitAttribute(attribute0);
      attribute0.value = byteArray0;
      byte[] byteArray1 = classWriter0.toByteArray();
      assertEquals(66, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2953));
      Attribute attribute0 = new Attribute("7SuHVO;ky");
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
  public void test66()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2337);
      classWriter0.visitAnnotation("SourceFile", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(79, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(17);
      classWriter0.visitInnerClass("", "", "", 17);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(61, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1024);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "java/lang/Object";
      stringArray0[1] = "java/lang/Object";
      stringArray0[2] = "";
      stringArray0[3] = "java/lang/Object";
      stringArray0[4] = ";nfBs8}(N@";
      stringArray0[5] = "java/lang/Object";
      classWriter0.visit(1024, (-828), "java/lang/Object", "", "", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(120, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-803));
      classWriter0.visitOuterClass("xtQMaq]z[(U9", "xtQMaq]z[(U9", ")t3[CY7q");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(86, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(26);
      classWriter0.visitSource("", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(77, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(9);
      String[] stringArray0 = new String[1];
      stringArray0[0] = ";lkbr0\"L6Z;:HW2";
      classWriter0.visit(9, (-2722), "wheel.asm.ClassWriter", "/>.(P]1TLlc~cXV5", "LAn}6", stringArray0);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newFieldItem("<init>", "\";(XV#J>d!5BE r", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "SourceDebugExtension";
      stringArray0[1] = "RuntimeInvisibleAnnotations";
      stringArray0[2] = "SourceDebugExtension";
      stringArray0[3] = "Deprecated";
      stringArray0[4] = "Deprecated";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 20, "SourceDebugExtension", "Deprecated", "RuntimeInvisibleAnnotations", stringArray0, false, false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(158, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2953));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "6#uek;:", "6#uek;:", "InnerClasses", "6#uek;:");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(104, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      classWriter0.visitInnerClass("wheel.asm.Attribute", "wheel.asm.Attribute", (String) null, (-2931));
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1064);
      classWriter0.visitInnerClass((String) null, (String) null, "YW+lCf}wHs?L~nP4,-", 21);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(201);
      classWriter0.visitInnerClass("wheel.asm.Type", "", "", 201);
      classWriter0.visitInnerClass("V", "", "CCLkT;Z", (-1033));
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(26);
      classWriter0.visitAnnotation("value ", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(73, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-45));
      classWriter0.visitOuterClass("}m{H@2", "}m{H@2", (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(24);
      classWriter0.visitOuterClass("RwVINp/2k9, *", (String) null, "InnerClasses");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2337);
      classWriter0.visitSource("Pg.o88x*UOo;", (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-958));
      classWriter0.visitSource((String) null, "byte");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2953));
      String[] stringArray0 = new String[3];
      stringArray0[0] = ")=)$U-s(;G\"pQs";
      stringArray0[1] = "InnerClasses";
      stringArray0[2] = "InnerClasses";
      classWriter0.visit((-2953), (-1851), ")=)$U-s(;G\"pQs", ")=)$U-s(;G\"pQs", "InnerClasses", stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1663));
      String[] stringArray0 = new String[0];
      classWriter0.visit(43, 2922, "", "", "org.apache.commons.io.filefilter.CanWriteFileFilter", stringArray0);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visit(303, 2219, "EnclosingMethod", "!>KUza3~@+<@-!Z@", "", (String[]) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      String[] stringArray0 = new String[8];
      // Undeclared exception!
      try { 
        classWriter0.visit(6, (-184), "wheel.asm.Attribute", (String) null, (String) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(192);
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
  public void test87()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(31);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        classWriter0.newConst(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@27cfbf01
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2953));
      classWriter0.visitEnd();
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1663));
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        classWriter0.visitMethod((-2481), "", (String) null, "E!L'tc%>{x^9", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassWriter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 1);
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(1, (-1302));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1663));
      int int0 = classWriter0.newField("org.apache.commons.io.filefilter.EmptyFileFilter", "StackMapTable", "org.apache.commons.io.filefilter.EmptyFileFilter");
      assertEquals(5, int0);
  }
}
