/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 12:37:16 GMT 2019
 */

package org.objectweb.asm.jip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.asm.jip.AnnotationVisitor;
import org.objectweb.asm.jip.Attribute;
import org.objectweb.asm.jip.ByteVector;
import org.objectweb.asm.jip.ClassWriter;
import org.objectweb.asm.jip.Label;
import org.objectweb.asm.jip.MethodWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MethodWriter_ESTest extends MethodWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 4096;
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 4096, 1);
      assertEquals((-8191), int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 10;
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, (-423), 2467);
      assertEquals(2900, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1749));
      String[] stringArray0 = new String[5];
      stringArray0[0] = "Exceptions";
      stringArray0[1] = ">C1Y4B#*_gezWN";
      stringArray0[2] = "=bsCbI^@ie4S:x";
      stringArray0[3] = ">C1Y4B#*_gezWN";
      stringArray0[4] = "P5b7";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "Exceptions", ">C1Y4B#*_gezWN", "Exceptions", stringArray0, false, false);
      methodWriter0.visitTypeInsn((-2545), "Vi)vyG");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(255);
      String[] stringArray0 = new String[4];
      stringArray0[0] = " )Z^J5xjoSF]&CZr.";
      stringArray0[1] = "q5a~FE";
      stringArray0[2] = "StackMap";
      stringArray0[3] = "q5a~FE";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "q5a~FE", "q5a~FE", "StackMap", stringArray0, false, false);
      methodWriter0.visitAnnotationDefault();
      int int0 = methodWriter0.getSize();
      assertEquals(38, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "}\"*";
      stringArray0[1] = "?)Ow&/}usZ?|}ws(";
      stringArray0[2] = "?)Ow&/}usZ?|}ws(";
      stringArray0[3] = "?)Ow&/}usZ?|}ws(";
      stringArray0[4] = "?)Ow&/}usZ?|}ws(";
      stringArray0[5] = "?)Ow&/}usZ?|}ws(";
      stringArray0[6] = "?)Ow&/}usZ?|}ws(";
      stringArray0[7] = "?)Ow&/}usZ?|}ws(";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1831, "?)Ow&/}usZ?|}ws(", "?)Ow&/}usZ?|}ws(", "?)Ow&/}usZ?|}ws(", stringArray0, false, false);
      methodWriter0.visitIntInsn(1, (-131));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(940);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "]@Wa5{[!djf";
      stringArray0[1] = "]@Wa5{[!djf";
      stringArray0[2] = "]@Wa5{[!djf";
      stringArray0[3] = "]@Wa5{[!djf";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-423), "]@Wa5{[!djf", "]@Wa5{[!djf", "]@Wa5{[!djf", stringArray0, false, false);
      Object[] objectArray0 = new Object[0];
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(1, 31, objectArray0, 946, objectArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1107);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "@JWVE-VSh@GG83g";
      stringArray0[1] = "@JWVE-VSh@GG83g";
      stringArray0[2] = "@JWVE-VSh@GG83g";
      stringArray0[3] = "@JWVE-VSh@GG83g";
      stringArray0[4] = "@JWVE-VSh@GG83g";
      stringArray0[5] = "@JWVE-VSh@GG83g";
      stringArray0[6] = "@JWVE-VSh@GG83g";
      stringArray0[7] = "@JWVE-VSh@GG83g";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1308), "@JWVE-VSh@GG83g", "@JWVE-VSh@GG83g", "@JWVE-VSh@GG83g", stringArray0, false, false);
      methodWriter0.visitFrame((-617), 2, stringArray0, (-617), stringArray0);
      assertEquals(8, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3767);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "d6 rbL%";
      stringArray0[1] = "d6 rbL%";
      stringArray0[2] = "d6 rbL%";
      stringArray0[3] = "d6 rbL%";
      stringArray0[4] = "d6 rbL%";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2010), "d6 rbL%", "d6 rbL%", "d6 rbL%", stringArray0, false, false);
      methodWriter0.visitFieldInsn((-2010), "Bf", "d6 rbL%", "pC2\"|#<{|-hQwJ6");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        MethodWriter.readUnsignedShort(byteArray0, (byte) (-87));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -87
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        MethodWriter.readInt(byteArray0, (byte) (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2507);
      String[] stringArray0 = new String[2];
      stringArray0[0] = ".s.IFJDCS";
      stringArray0[1] = ".s.IFJDCS";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 83, ".s.IFJDCS", ".s.IFJDCS", ".s.IFJDCS", stringArray0, false, false);
      Label[] labelArray0 = new Label[0];
      // Undeclared exception!
      try { 
        methodWriter0.visitTableSwitchInsn(220, 111, (Label) null, labelArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2896));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "#a_@OEs4p[)&^48w", "#a_@OEs4p[)&^48w", "#a_@OEs4p[)&^48w", (String[]) null, true, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitLabel((Label) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[8];
      int[] intArray1 = new int[3];
      // Undeclared exception!
      try { 
        MethodWriter.getNewOffset(intArray0, intArray1, (-423), 2467);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[3];
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter((ClassWriter) null, (-1298), "AnnotationDefault", "", (String) null, stringArray0, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[1];
      Label label0 = new Label();
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertEquals(1, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = (-2010);
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 1, (-128));
      assertEquals((-129), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[1] = 2;
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 1, (-128));
      assertEquals((-129), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(940);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "]@Wa5{[!djf";
      stringArray0[1] = "]@Wa5{[!djf";
      stringArray0[2] = "]@Wa5{[!djf";
      stringArray0[3] = "]@Wa5{[!djf";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-423), "]@Wa5{[!djf", "]@Wa5{[!djf", "]@Wa5{[!djf", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-125));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-125), "\"$W};O(c7E|wsDJ", "\"$W};O(c7E|wsDJ", "|C,o[kFWM:7]Z.Ag;G", (String[]) null, false, false);
      int int0 = methodWriter0.getSize();
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4030);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "org.objectweb.asm.jip.ClassReader";
      stringArray0[1] = "nF)]g";
      stringArray0[2] = "org.objectweb.asm.jip.ClassReader";
      stringArray0[3] = "nF)]g";
      stringArray0[4] = "org.objectweb.asm.jip.ClassReader";
      stringArray0[5] = "nF)]g";
      stringArray0[6] = "nF)]g";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "org.objectweb.asm.jip.ClassReader", "nF)]g", "nF)]g", stringArray0, true, true);
      methodWriter0.visitInsn(2);
      int int0 = methodWriter0.getSize();
      assertEquals(57, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1749));
      String[] stringArray0 = new String[5];
      stringArray0[0] = "Exceptions";
      stringArray0[1] = ">C1Y4B#*_gezWN";
      stringArray0[2] = "=bsCbI^@ie4S:x";
      stringArray0[3] = ">C1Y4B#*_gezWN";
      stringArray0[4] = "P5b7";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "Exceptions", ">C1Y4B#*_gezWN", "Exceptions", stringArray0, false, false);
      methodWriter0.visitMaxs(1, 2692);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-855));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "LocalVariableTypeTable", "LocalVariableTypeTable", "", (String[]) null, false, false);
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("LocalVariableTypeTable", "LocalVariableTypeTable", "8^wbk", label0, label0, 1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-952));
      String[] stringArray0 = new String[3];
      stringArray0[0] = "rMb`T'y";
      stringArray0[1] = "LVSkf8Cq,";
      stringArray0[2] = "double";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1000, "LVSkf8Cq,", "LVSkf8Cq,", "LVSkf8Cq,", stringArray0, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitLocalVariable("] )&<9", "LVSkf8Cq,", (String) null, (Label) null, (Label) null, (-2287));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(262);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "DzAbv]fU,@]";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3119), "DzAbv]fU,@]", "DzAbv]fU,@]", "4F[Ywm53y", stringArray0, false, false);
      methodWriter0.visitTryCatchBlock((Label) null, (Label) null, (Label) null, "DzAbv]fU,@]");
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-617));
      String[] stringArray0 = new String[7];
      stringArray0[0] = "2";
      stringArray0[1] = "2";
      stringArray0[2] = "O@Z@AmI";
      stringArray0[3] = "2";
      stringArray0[4] = "2";
      stringArray0[5] = "2";
      stringArray0[6] = "2";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-806), "2", "O@Z@AmI", "2", stringArray0, false, false);
      Label label0 = new Label();
      methodWriter0.visitTryCatchBlock(label0, label0, label0, (String) null);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(610);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "\u0006g)TTHBa1";
      stringArray0[1] = "o/^Y#uA/]kStKa1{j;8";
      stringArray0[2] = "Code";
      stringArray0[3] = "o/^Y#uA/]kStKa1{j;8";
      stringArray0[4] = "\u0006g)TTHBa1";
      stringArray0[5] = "o/^Y#uA/]kStKa1{j;8";
      stringArray0[6] = "Code";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Code", "\u0006g)TTHBa1", "o/^Y#uA/]kStKa1{j;8", stringArray0, true, false);
      methodWriter0.visitMultiANewArrayInsn(")Z", 2);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1874);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "Ntp/+?";
      stringArray0[1] = "!ubL[aR";
      stringArray0[2] = "Ntp/+?";
      stringArray0[3] = "Ntp/+?";
      stringArray0[4] = "Ntp/+?";
      stringArray0[5] = "Ntp/+?";
      stringArray0[6] = "Ntp/+?";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "Ntp/+?", "Ntp/+?", "Ntp/+?", stringArray0, false, false);
      methodWriter0.visitMultiANewArrayInsn("StackMap", 60);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1921));
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Xy_h5I.>!@j[E";
      stringArray0[1] = "!?/(Zi";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "!?/(Zi", "9S }jubAA8o#R%O*M", "Xy_h5I.>!@j[E", stringArray0, false, false);
      Label label0 = new Label();
      int[] intArray0 = new int[0];
      Label[] labelArray0 = new Label[7];
      // Undeclared exception!
      try { 
        methodWriter0.visitLookupSwitchInsn(label0, intArray0, labelArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-617));
      String[] stringArray0 = new String[7];
      stringArray0[0] = "2";
      stringArray0[1] = "2";
      stringArray0[2] = "O@Z@AmI";
      stringArray0[3] = "2";
      stringArray0[4] = "2";
      stringArray0[5] = "2";
      stringArray0[6] = "2";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-806), "2", "O@Z@AmI", "2", stringArray0, false, false);
      Label label0 = new Label();
      Label[] labelArray0 = new Label[9];
      labelArray0[0] = label0;
      labelArray0[1] = label0;
      labelArray0[2] = label0;
      labelArray0[3] = label0;
      labelArray0[4] = label0;
      labelArray0[5] = label0;
      labelArray0[6] = label0;
      labelArray0[7] = label0;
      labelArray0[8] = label0;
      methodWriter0.visitTableSwitchInsn(2, 1, label0, labelArray0);
      assertEquals(9, labelArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(262);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "DzAbv]fU,@]";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3119), "DzAbv]fU,@]", "DzAbv]fU,@]", "4F[Ywm53y", stringArray0, false, false);
      methodWriter0.visitIincInsn(2, (-1723));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(262);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "DzAbv]fU,@]";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3119), "DzAbv]fU,@]", "DzAbv]fU,@]", "4F[Ywm53y", stringArray0, false, false);
      methodWriter0.visitIincInsn(262, 2);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(610);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "\u0006g)TTHBa1";
      stringArray0[1] = "o/^Y#uA/]kStKa1{j;8";
      stringArray0[2] = "Code";
      stringArray0[3] = "o/^Y#uA/]kStKa1{j;8";
      stringArray0[4] = "\u0006g)TTHBa1";
      stringArray0[5] = "o/^Y#uA/]kStKa1{j;8";
      stringArray0[6] = "Code";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Code", "\u0006g)TTHBa1", "o/^Y#uA/]kStKa1{j;8", stringArray0, true, true);
      methodWriter0.visitIincInsn(2, 1269);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1107);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "@JWVE-VSh@GG83g";
      stringArray0[1] = "@JWVE-VSh@GG83g";
      stringArray0[2] = "@JWVE-VSh@GG83g";
      stringArray0[3] = "@JWVE-VSh@GG83g";
      stringArray0[4] = "@JWVE-VSh@GG83g";
      stringArray0[5] = "@JWVE-VSh@GG83g";
      stringArray0[6] = "@JWVE-VSh@GG83g";
      stringArray0[7] = "@JWVE-VSh@GG83g";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1308), "@JWVE-VSh@GG83g", "@JWVE-VSh@GG83g", "@JWVE-VSh@GG83g", stringArray0, false, false);
      methodWriter0.visitIincInsn(1, 4);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(91);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "xF~";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "xF~", "8GbkAZRefTQ:Oi[", "X~>ov1(3M&\"u[Zw[", stringArray0, false, false);
      methodWriter0.visitLdcInsn("xF~");
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-617));
      String[] stringArray0 = new String[7];
      stringArray0[0] = "2";
      stringArray0[1] = "2";
      stringArray0[2] = "O@Z@AmI";
      stringArray0[3] = "2";
      stringArray0[4] = "2";
      stringArray0[5] = "2";
      stringArray0[6] = "2";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-806), "2", "O@Z@AmI", "2", stringArray0, false, false);
      Label label0 = new Label();
      methodWriter0.visitLabel(label0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(11);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "rS5;'[q<fYT!Jx5yEd";
      stringArray0[1] = "MB!s5S4&Z";
      stringArray0[2] = "MB!s5S4&Z";
      stringArray0[3] = "MB!s5S4&Z";
      stringArray0[4] = "Signature";
      stringArray0[5] = "MB!s5S4&Z";
      stringArray0[6] = "MB!s5S4&Z";
      stringArray0[7] = "rS5;'[q<fYT!Jx5yEd";
      stringArray0[8] = "<init>";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 11, "rS5;'[q<fYT!Jx5yEd", "MB!s5S4&Z", "rS5;'[q<fYT!Jx5yEd", stringArray0, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitJumpInsn(11, (Label) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1107);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "@JWVE-VSh@GG83g";
      stringArray0[1] = "@JWVE-VSh@GG83g";
      stringArray0[2] = "@JWVE-VSh@GG83g";
      stringArray0[3] = "@JWVE-VSh@GG83g";
      stringArray0[4] = "@JWVE-VSh@GG83g";
      stringArray0[5] = "@JWVE-VSh@GG83g";
      stringArray0[6] = "@JWVE-VSh@GG83g";
      stringArray0[7] = "@JWVE-VSh@GG83g";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1308), "@JWVE-VSh@GG83g", "@JWVE-VSh@GG83g", "@JWVE-VSh@GG83g", stringArray0, false, false);
      methodWriter0.visitMethodInsn((-617), "pD7%:Sid=_", "org.objectweb.asm.jip.ClassAdapter", "@JWVE-VSh@GG83g");
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4030);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "org.objectweb.asm.jip.ClassReader";
      stringArray0[1] = "nF)]g";
      stringArray0[2] = "org.objectweb.asm.jip.ClassReader";
      stringArray0[3] = "nF)]g";
      stringArray0[4] = "org.objectweb.asm.jip.ClassReader";
      stringArray0[5] = "nF)]g";
      stringArray0[6] = "nF)]g";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "org.objectweb.asm.jip.ClassReader", "nF)]g", "nF)]g", stringArray0, true, true);
      methodWriter0.visitFieldInsn(4030, "nF)]g", "Qi", "JRXb/gK5XW%");
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(610);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "\u0006g)TTHBa1";
      stringArray0[1] = "o/^Y#uA/]kStKa1{j;8";
      stringArray0[2] = "Code";
      stringArray0[3] = "o/^Y#uA/]kStKa1{j;8";
      stringArray0[4] = "\u0006g)TTHBa1";
      stringArray0[5] = "o/^Y#uA/]kStKa1{j;8";
      stringArray0[6] = "Code";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Code", "\u0006g)TTHBa1", "o/^Y#uA/]kStKa1{j;8", stringArray0, true, true);
      methodWriter0.visitTypeInsn(2, "o/^Y#uA/]kStKa1{j;8");
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(610);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "\u0006g)TTHBa1";
      stringArray0[1] = "o/^Y#uA/]kStKa1{j;8";
      stringArray0[2] = "Code";
      stringArray0[3] = "o/^Y#uA/]kStKa1{j;8";
      stringArray0[4] = "\u0006g)TTHBa1";
      stringArray0[5] = "o/^Y#uA/]kStKa1{j;8";
      stringArray0[6] = "Code";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Code", "\u0006g)TTHBa1", "o/^Y#uA/]kStKa1{j;8", stringArray0, true, false);
      methodWriter0.visitTypeInsn(2, "o/^Y#uA/]kStKa1{j;8");
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1636167418));
      String[] stringArray0 = new String[7];
      stringArray0[0] = "org.objectweb.asm.jip.MethodWriter";
      stringArray0[1] = "]/h%>u7] M";
      stringArray0[2] = "org.objectweb.asm.jip.MethodWriter";
      stringArray0[3] = "org.objectweb.asm.jip.MethodWriter";
      stringArray0[4] = "]/h%>u7] M";
      stringArray0[5] = "org.objectweb.asm.jip.MethodWriter";
      stringArray0[6] = "org.objectweb.asm.jip.MethodWriter";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1636167418), "]/h%>u7] M", "K[Ke+", "org.objectweb.asm.jip.MethodWriter", stringArray0, false, false);
      methodWriter0.visitVarInsn(1, 24);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2507);
      String[] stringArray0 = new String[2];
      stringArray0[0] = ".s.IFJDCS";
      stringArray0[1] = ".s.IFJDCS";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 83, ".s.IFJDCS", ".s.IFJDCS", ".s.IFJDCS", stringArray0, false, false);
      methodWriter0.visitVarInsn(2, 2);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2896));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "#a_@OEs4p[)&^48w", "#a_@OEs4p[)&^48w", "#a_@OEs4p[)&^48w", (String[]) null, true, false);
      methodWriter0.visitVarInsn(132, 2);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1621);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "i,P\u0002}";
      stringArray0[1] = "i,P\u0002}";
      stringArray0[2] = "i,P\u0002}";
      stringArray0[3] = "i,P\u0002}";
      stringArray0[4] = "i,P\u0002}";
      stringArray0[5] = "i,P\u0002}";
      stringArray0[6] = "i,P\u0002}";
      stringArray0[7] = "i,P\u0002}";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "i,P\u0002}", "i,P\u0002}", "i,P\u0002}", stringArray0, false, false);
      methodWriter0.visitVarInsn(31, 1339);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(255);
      String[] stringArray0 = new String[4];
      stringArray0[0] = " )Z^J5xjoSF]&CZr.";
      stringArray0[1] = "q5a~FE";
      stringArray0[2] = "StackMap";
      stringArray0[3] = "q5a~FE";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "q5a~FE", "q5a~FE", "StackMap", stringArray0, false, false);
      classWriter0.lastMethod.visitIntInsn(255, 1014);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-259));
      String[] stringArray0 = new String[7];
      stringArray0[0] = "eC)*y_YENOh3y\"";
      stringArray0[1] = "eC)*y_YENOh3y\"";
      stringArray0[2] = "eC)*y_YENOh3y\"";
      stringArray0[3] = "eC)*y_YENOh3y\"";
      stringArray0[4] = "eC)*y_YENOh3y\"";
      stringArray0[5] = "eC)*y_YENOh3y\"";
      stringArray0[6] = "eC)*y_YENOh3y\"";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 16777220, "eC)*y_YENOh3y\"", "eC)*y_YENOh3y\"", "eC)*y_YENOh3y\"", stringArray0, true, true);
      methodWriter0.visitInsn(2);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(940);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "]@Wa5{[!djf";
      stringArray0[1] = "]@Wa5{[!djf";
      stringArray0[2] = "]@Wa5{[!djf";
      stringArray0[3] = "]@Wa5{[!djf";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-423), "]@Wa5{[!djf", "]@Wa5{[!djf", "]@Wa5{[!djf", stringArray0, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(1, 31, stringArray0, 946, stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1749));
      String[] stringArray0 = new String[5];
      stringArray0[0] = "Exceptions";
      stringArray0[1] = ">C1Y4B#*_gezWN";
      stringArray0[2] = "=bsCbI^@ie4S:x";
      stringArray0[3] = ">C1Y4B#*_gezWN";
      stringArray0[4] = "P5b7";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "Exceptions", ">C1Y4B#*_gezWN", "Exceptions", stringArray0, false, false);
      Attribute attribute0 = new Attribute("Vi)vyG");
      methodWriter0.visitAttribute(attribute0);
      assertTrue(attribute0.isUnknown());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "tzf#T9";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 15, "org.objectweb.asm.jip.AnnotationWriter", "tzf#T9", "org.objectweb.asm.jip.AnnotationWriter", stringArray0, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitParameterAnnotation(26, "tzf#T9", false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.objectweb.asm.jip.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2609));
      String[] stringArray0 = new String[5];
      stringArray0[0] = "aQ1)90| ~fV?5RMu";
      stringArray0[1] = "aQ1)90| ~fV?5RMu";
      stringArray0[2] = "bg";
      stringArray0[3] = "aQ1)90| ~fV?5RMu";
      stringArray0[4] = "bg";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "aQ1)90| ~fV?5RMu", "bg", "aQ1)90| ~fV?5RMu", stringArray0, false, false);
      AnnotationVisitor annotationVisitor0 = methodWriter0.visitAnnotation(")V", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(54);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 54, "AF$XzyGp?", "AF$XzyGp?", "AF$XzyGp?", stringArray0, false, false);
      AnnotationVisitor annotationVisitor0 = methodWriter0.visitAnnotation("AF$XzyGp?", false);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(91);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "*:)]++f02ADX";
      stringArray0[1] = "s|U!2+";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-309), "s|U!2+", "*:)]++f02ADX", "*:)]++f02ADX", stringArray0, true, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitParameterAnnotation(91, "org.objectweb.asm.jip.ClassReader", true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 12
         //
         verifyException("org.objectweb.asm.jip.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1981);
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 1324, "<init>", "<init>", "<init>", (String[]) null, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(713);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "fQcu&";
      stringArray0[1] = "fQcu&";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 2, "fQcu&", "fQcu&", "fQcu&", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1107);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1107, "org.objectweb.asm.jip.MethodWriter", "Z%'f[", ";R", stringArray0, false, false);
      methodWriter0.visitInsn((-5718));
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-259));
      String[] stringArray0 = new String[7];
      stringArray0[0] = "eC)*y_YENOh3y\"";
      stringArray0[1] = "eC)*y_YENOh3y\"";
      stringArray0[2] = "eC)*y_YENOh3y\"";
      stringArray0[3] = "eC)*y_YENOh3y\"";
      stringArray0[4] = "eC)*y_YENOh3y\"";
      stringArray0[5] = "eC)*y_YENOh3y\"";
      stringArray0[6] = "eC)*y_YENOh3y\"";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 16777220, "eC)*y_YENOh3y\"", "eC)*y_YENOh3y\"", "eC)*y_YENOh3y\"", stringArray0, true, true);
      methodWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        MethodWriter.readInt(byteArray0, (byte)22);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 22
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        MethodWriter.readShort(byteArray0, (-781));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -781
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        MethodWriter.writeShort(byteArray0, 2051, 262144);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2051
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(185);
      String[] stringArray0 = new String[9];
      stringArray0[0] = ";";
      stringArray0[1] = ";";
      stringArray0[2] = ";";
      stringArray0[3] = ";";
      stringArray0[4] = "Signature";
      stringArray0[5] = ";";
      stringArray0[6] = "dk#QS>G2";
      stringArray0[7] = ";";
      stringArray0[8] = ";";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 342, ";", "Signature", "", stringArray0, false, false);
      methodWriter0.visitCode();
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        MethodWriter.readUnsignedShort(byteArray0, (byte)115);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 115
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }
}
