/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 04:51:20 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import wheel.asm.Attribute;
import wheel.asm.ClassReader;
import wheel.asm.ClassVisitor;
import wheel.asm.ClassWriter;
import wheel.asm.FieldVisitor;
import wheel.asm.Item;
import wheel.asm.MethodVisitor;
import wheel.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassWriter_ESTest extends ClassWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      classWriter0.threshold = 3;
      FieldVisitor fieldVisitor0 = classWriter0.visitField(3, "9ac79:'.w(=`", "9ac79:'.w(=`", "9ac79:'.w(=`", "9ac79:'.w(=`");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.visitEnd();
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-5134));
      classWriter0.visitSource("b/>g>fS{lLzTmop,g", "");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.visitOuterClass("", ";S6)<c8e?", ";S6)<c8e?");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16);
      MethodVisitor methodVisitor0 = classWriter0.visitMethod(25, "nqO1qi9 ", "value ", "wheel.asm.ClassWriter", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      String[] stringArray0 = new String[3];
      // Undeclared exception!
      try { 
        classWriter0.visitMethod(211, "I*vDaDvi|Q", "I*vDaDvi|Q", "", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3339);
      String[] stringArray0 = new String[9];
      // Undeclared exception!
      try { 
        classWriter0.visitMethod((-1249), "*aj.I59 &`[isG);a", "*aj.I59 &`[isG);a", "E/FaeP&dQBz>2+X7S-J", stringArray0);
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
      Double double0 = new Double(2);
      FieldVisitor fieldVisitor0 = classWriter0.visitField((-2293), "&+m W^\"_Ivax", "&+m W^\"_Ivax", "", double0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-527));
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        classWriter0.visit(28, 0, "", "DeHbB+u{`7[<d8<P{FC", "M @thT1b0SYPy", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(196);
      String[] stringArray0 = new String[6];
      // Undeclared exception!
      try { 
        classWriter0.visit((-2831), (-2831), "", "", "", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      int int0 = classWriter0.newUTF8("");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      int int0 = classWriter0.newNameType("6-3^E~cgeyT", "6-3^E~cgeyT");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2788));
      int int0 = classWriter0.newNameType("StackMap", "");
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(46);
      Item item0 = classWriter0.newMethodItem("wheel.asm.ByteVector", "", "", true);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(13);
      int int0 = classWriter0.newMethod("Z=3^n{p{4T3{", "", "RuntimeVisibleAnnotations", true);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1945));
      int int0 = classWriter0.newMethod("", "value ", "SourceDebugExtension", true);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      Item item0 = classWriter0.newLong(0L);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1080));
      Item item0 = classWriter0.newLong((-1080));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-552));
      Item item0 = classWriter0.newInteger(65535);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      Item item0 = classWriter0.newFloat(0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(32);
      Item item0 = classWriter0.newFieldItem("RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations", "");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1728));
      Item item0 = classWriter0.newFieldItem("wG4", "wheel.asm.Type", "wG4");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      int int0 = classWriter0.newField("@x", "i1R 4u2.O", "/sEyWK2y");
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-552));
      Item item0 = classWriter0.newDouble((-1762.4229865833));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131072);
      Item item0 = classWriter0.newClassItem("");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1945));
      int int0 = classWriter0.newClass(".Cw}b[ok.`.Q&*pGg=");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(183, 183);
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
      ClassWriter classWriter0 = new ClassWriter(46);
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
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      int int0 = classWriter0.addUninitializedType("", 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-527));
      int int0 = classWriter0.addUninitializedType("", 35);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1728));
      int int0 = classWriter0.addUninitializedType("wG4", (-1728));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1728));
      int int0 = classWriter0.addType("wG4");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131072);
      int int0 = classWriter0.addType("");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1945));
      String[] stringArray0 = new String[3];
      stringArray0[0] = "bb#(h^:g$'QZ`)dd";
      stringArray0[1] = "bb#(h^:g$'QZ`)dd";
      stringArray0[2] = "FmD>~\"JH1]`.j";
      // Undeclared exception!
      try { 
        classWriter0.visitMethod(8, "", "", (String) null, stringArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(25);
      Item item0 = classWriter0.newFloat(25);
      // Undeclared exception!
      try { 
        classWriter0.visitField(0, "", "#dhGbubmX6R%';jDU", "k>rsb", item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.Item@6
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777218);
      // Undeclared exception!
      try { 
        classWriter0.visitAnnotation((String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1728));
      // Undeclared exception!
      try { 
        classWriter0.newFieldItem("", (String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      // Undeclared exception!
      try { 
        classWriter0.getCommonSuperClass("System", "wheel.asm.ClassWriter");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.ClassNotFoundException: Class 'System.class' should be in target project, but could not be found!
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-527));
      int int0 = classWriter0.newUTF8("0TV");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(13);
      classWriter0.newClassItem("j^5gNq'kDibYt");
      int int0 = classWriter0.newUTF8("j^5gNq'kDibYt");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1586);
      int int0 = classWriter0.newClass("");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3339);
      String string0 = classWriter0.getCommonSuperClass("java/lang/Object", "java/lang/Object");
      assertEquals("java/lang/Object", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(0, 14);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      int int0 = classWriter0.addUninitializedType("", (-622));
      assertEquals(1, int0);
      
      int int1 = classWriter0.addUninitializedType("", (-622));
      assertEquals(1, int1);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      int int0 = classWriter0.newNameType("", "");
      assertEquals(2, int0);
      
      int int1 = classWriter0.newField("", "", "");
      assertEquals(4, int1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1109));
      classWriter0.newConst("=0)FJ$!.#");
      Item item0 = classWriter0.newConstItem("=0)FJ$!.#");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4563);
      Item item0 = classWriter0.newDouble(4563);
      Item item1 = classWriter0.newDouble(4563);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(32);
      Item item0 = classWriter0.newLong(32);
      Item item1 = classWriter0.newLong(32);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1109));
      Item item0 = classWriter0.newFloat(844.0086F);
      Item item1 = classWriter0.newFloat(844.0086F);
      assertSame(item1, item0);
      assertNotNull(item1);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1728));
      Item item0 = classWriter0.newMethodItem("wG4", "wG4", "wheel.asm.Type", true);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      classWriter0.newField("", "", "");
      int int0 = classWriter0.newField("", "", "");
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(29);
      Class<Type> class0 = Type.class;
      Type type0 = Type.getType(class0);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(192, "#vIl/:mg<", "", "#vIl/:mg<", type0);
      // Undeclared exception!
      try { 
        classWriter0.newConst(fieldVisitor0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.FieldWriter@b
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-5134));
      Type type0 = Type.BYTE_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-527));
      Item item0 = classWriter0.newMethodItem("DeHbB+u{`7[<d8<P{FC", "GCFvt/<M", "GCFvt/<M", false);
      // Undeclared exception!
      try { 
        classWriter0.newConstItem(item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.Item@a
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1889));
      Float float0 = new Float((float) (-1889));
      Item item0 = classWriter0.newConstItem(float0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(46);
      Boolean boolean0 = Boolean.valueOf(true);
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-527));
      Boolean boolean0 = Boolean.FALSE;
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      Short short0 = new Short((short)990);
      int int0 = classWriter0.newConst(short0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(41);
      Character character0 = Character.valueOf('Q');
      int int0 = classWriter0.newConst(character0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131072);
      Byte byte0 = new Byte((byte) (-37));
      Item item0 = classWriter0.newConstItem(byte0);
      Item item1 = classWriter0.newInteger((byte) (-37));
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2678);
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
  public void test61()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1109));
      Attribute attribute0 = new Attribute("=0)FJ$!.#");
      byte[] byteArray0 = new byte[1];
      attribute0.value = byteArray0;
      classWriter0.visitAttribute(attribute0);
      byte[] byteArray1 = classWriter0.toByteArray();
      assertEquals(43, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(701);
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(69, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4563);
      classWriter0.visitInnerClass("/O", "/O", "Signature", 15);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(75, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1586);
      classWriter0.visitOuterClass(".BHSot)^3^(i[F{", "V(", ".BHSot)^3^(i[F{");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(83, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1586);
      classWriter0.visitSource("y_Y!ey5x0z", "y_Y!ey5x0z");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(99, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4563);
      String[] stringArray0 = new String[0];
      classWriter0.visit(4563, 4563, "Signature", "JSR/RET are not supported with computeFrames option", "Signature", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(101, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "'|KH8mu[0";
      stringArray0[2] = "";
      classWriter0.visitMethod(12, "", "", "'|KH8mu[0", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(100, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(701);
      classWriter0.visitField(65, "wheel.asm.FieldWriter", "wheel.asm.FieldWriter", "wheel.asm.FieldWriter", "wheel.asm.FieldWriter");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(103, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1945));
      classWriter0.visitInnerClass("h2GsV@:>(k-Ct", (String) null, (String) null, 19);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(14);
      classWriter0.visitInnerClass((String) null, (String) null, "&)GU~=hTktkL/bf8`8", 1512);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4563);
      classWriter0.visitInnerClass("/O", "/O", "Signature", 15);
      classWriter0.visitInnerClass("", "", "", 15);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      classWriter0.visitAnnotation(" h~V", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(71, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(31);
      classWriter0.visitOuterClass(")M}]B[#zij+m|`z", "", (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(46);
      classWriter0.visitOuterClass("BJ ", (String) null, (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(32);
      classWriter0.visitSource("", "!#-nt6f\"");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777218);
      classWriter0.visitSource((String) null, (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2788));
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "StackMap";
      stringArray0[2] = "StackMap";
      stringArray0[3] = "";
      classWriter0.visit(11, 11, "", "", "StackMap", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(72, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16);
      classWriter0.visit(16, (-3245), "JSR/RET are not supported with computeFrames option", "`'m", "s6^", (String[]) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter((-717));
      classReader0.accept((ClassVisitor) classWriter0, 2);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(701);
      int int0 = classWriter0.newMethod("TXPWq+9MjgcZ=MWD)", "TXPWq+9MjgcZ=MWD)", "wheel.asm.FieldWriter", false);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 32);
      Item item0 = classWriter0.newConstItem("java/lang/Object");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2788));
      Long long0 = new Long(1L);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(6, "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "", "", long0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
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
}
