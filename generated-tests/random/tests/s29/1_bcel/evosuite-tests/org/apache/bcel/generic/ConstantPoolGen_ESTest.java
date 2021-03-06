/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 14:17:49 GMT 2019
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantClass;
import org.apache.bcel.classfile.ConstantDouble;
import org.apache.bcel.classfile.ConstantFieldref;
import org.apache.bcel.classfile.ConstantFloat;
import org.apache.bcel.classfile.ConstantInteger;
import org.apache.bcel.classfile.ConstantInterfaceMethodref;
import org.apache.bcel.classfile.ConstantInvokeDynamic;
import org.apache.bcel.classfile.ConstantLong;
import org.apache.bcel.classfile.ConstantMethodHandle;
import org.apache.bcel.classfile.ConstantMethodType;
import org.apache.bcel.classfile.ConstantMethodref;
import org.apache.bcel.classfile.ConstantNameAndType;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.ConstantString;
import org.apache.bcel.classfile.ConstantUtf8;
import org.apache.bcel.generic.ArrayType;
import org.apache.bcel.generic.BIPUSH;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.PUSH;
import org.apache.bcel.generic.Type;
import org.apache.bcel.util.ByteSequence;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConstantPoolGen_ESTest extends ConstantPoolGen_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantNameAndType constantNameAndType0 = new ConstantNameAndType(2, 240);
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantNameAndType0, constantPoolGen1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantClass constantClass0 = new ConstantClass(9);
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantClass0, constantPoolGen1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantString constantString0 = new ConstantString((-932));
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantString0, constantPoolGen1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -932
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.addFieldref("N_[}zza;QW%J=#!(l?+", "", "");
      assertEquals(6, constantPoolGen0.getSize());
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addLong((-4561318268785810358L));
      int int0 = constantPoolGen0.addLong((-877L));
      assertEquals(5, constantPoolGen0.getSize());
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addFloat(1376.4F);
      int int0 = constantPoolGen0.addFloat((-953.2F));
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      constantPoolGen0.addInteger(1094);
      int int0 = constantPoolGen0.addInteger(1);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.adjustSize();
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      int int0 = constantPoolGen0.lookupNameAndType("ldc[18](2) 2 (PUSH)", (String) null);
      assertEquals((-1), int0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      int int0 = constantPoolGen0.lookupMethodref("HZ6BKLUuk;", (String) null, "java/lang/Throwable");
      assertEquals((-1), int0);
      assertEquals(2, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupMethodref("\n", "", "\n");
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      int int0 = constantPoolGen0.lookupLong(0L);
      assertEquals((-1), int0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupLong(1151L);
      assertEquals((-1), int0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      ObjectType objectType0 = Type.CLASS;
      String[] stringArray0 = new String[0];
      PUSH pUSH0 = new PUSH(constantPoolGen0, "\"i\n^$1?|P'KEmQ!");
      InstructionList instructionList0 = new InstructionList(pUSH0);
      MethodGen methodGen0 = new MethodGen((-1), objectType0, objectType0.NO_ARGS, stringArray0, "\"i\n^$1?|P'KEmQ!", "Referenced field '", instructionList0, constantPoolGen0);
      int int0 = constantPoolGen0.lookupInterfaceMethodref(methodGen0);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupInterfaceMethodref("t", "t", (String) null);
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupInterfaceMethodref("N_[}zza;QW%J=#!(l?+", "    InstructionHandle ih_", "");
      assertEquals((-1), int0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupInterfaceMethodref((String) null, (String) null, "T2igNX,?(4F`<pJEWCE");
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupFloat(0.0F);
      assertEquals((-1), int0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.getConstant(26);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.addMethodref("#HZ6BKLUuk;#HZ6BKLUuk;", "#HZ6BKLUuk;#HZ6BKLUuk;", "");
      assertEquals(6, constantPoolGen0.getSize());
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.addMethodref("", "", "l9)Gsf52bEv+'6");
      assertEquals(6, constantPoolGen0.getSize());
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.addLong(0L);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.addFloat(0.0F);
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.addFieldref("\n", "\n", "(class_index = ");
      assertEquals(6, constantPoolGen0.getSize());
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant((Constant) null, (ConstantPoolGen) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.addClass("");
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = null;
      try {
        constantPoolGen0 = new ConstantPoolGen((Constant[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Constant[] constantArray0 = new Constant[5];
      ConstantString constantString0 = new ConstantString(2179);
      constantArray0[2] = (Constant) constantString0;
      ConstantPoolGen constantPoolGen0 = null;
      try {
        constantPoolGen0 = new ConstantPoolGen(constantArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2179
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = null;
      try {
        constantPoolGen0 = new ConstantPoolGen((ConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupMethodref("C", "uEBd(oumt!2(h", "{uw<},");
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupNameAndType("uEBd(oumt!2(h", "{uw<},");
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.addUtf8(";X");
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addClass("?k]$;");
      int int0 = constantPoolGen0.addUtf8("?k]$;");
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupUtf8("\n");
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupClass(":");
      assertEquals((-1), int0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      int int0 = constantPoolGen0.lookupString(")");
      assertEquals((-1), int0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantMethodHandle constantMethodHandle0 = new ConstantMethodHandle((-1811), (-1811));
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantMethodHandle0, constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unknown constant type CONSTANT_MethodHandle[15](reference_kind = -1811, reference_index = -1811)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantInterfaceMethodref constantInterfaceMethodref0 = new ConstantInterfaceMethodref(3, (-2994));
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantInterfaceMethodref0, constantPoolGen0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2994
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      ConstantMethodref constantMethodref0 = new ConstantMethodref((-1), (-1144));
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantMethodref0, constantPoolGen0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      ConstantDouble constantDouble0 = new ConstantDouble(1580.8);
      int int0 = constantPoolGen0.addConstant(constantDouble0, constantPoolGen0);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      ConstantLong constantLong0 = new ConstantLong(2011L);
      int int0 = constantPoolGen0.addConstant(constantLong0, constantPoolGen0);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantFloat constantFloat0 = new ConstantFloat(0.0F);
      constantArray0[0] = (Constant) constantFloat0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      int int0 = constantPoolGen0.addConstant(constantArray0[0], constantPoolGen0);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantInteger constantInteger0 = new ConstantInteger((-492));
      constantPoolGen0.addConstant(constantInteger0, constantPoolGen0);
      int int0 = constantPoolGen0.lookupFloat(683.2F);
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantFieldref constantFieldref0 = new ConstantFieldref(256, 170);
      constantArray0[0] = (Constant) constantFieldref0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantArray0[0], constantPoolGen0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 256
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantUtf8 constantUtf8_0 = ConstantUtf8.getInstance("l9)Gsf52bEv+'6");
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      int int0 = constantPoolGen0.addConstant(constantUtf8_0, constantPoolGen0);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addInteger((-3037));
      constantPoolGen0.toString();
      assertEquals(2, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      String string0 = constantPoolGen0.toString();
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addFieldref("", "", "");
      int int0 = constantPoolGen0.lookupClass("");
      assertEquals(5, constantPoolGen0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupFieldref(":n}TJGz#~\"Q8p#/A!", "uEBd(oumt!2(h", "org.apache.bcel.generic.ConstantPoolGen$Index");
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      int int0 = constantPoolGen0.addMethodref("CV}", "5Si", "CV}");
      assertEquals(7, constantPoolGen0.getSize());
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addNameAndType("C", "C");
      int int0 = constantPoolGen0.addInterfaceMethodref("C", "C", "C");
      assertEquals(5, constantPoolGen0.getSize());
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addDouble((-3244.3577954680663));
      int int0 = constantPoolGen0.addDouble((-3244.3577954680663));
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      constantPoolGen0.addDouble((-1));
      int int0 = constantPoolGen0.addDouble(2011L);
      assertEquals(5, constantPoolGen0.getSize());
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantLong constantLong0 = new ConstantLong(256);
      constantArray0[1] = (Constant) constantLong0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      int int0 = constantPoolGen0.addLong(256);
      assertEquals(1, int0);
      assertEquals(2, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addLong((-4561318268785810358L));
      int int0 = constantPoolGen0.lookupLong((-4570037969322581688L));
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addFloat((-953.2F));
      int int0 = constantPoolGen0.addFloat((-953.2F));
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addFloat((-1.0F));
      int int0 = constantPoolGen0.addFloat(1);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      constantPoolGen0.addInteger((-1731));
      int int0 = constantPoolGen0.addInteger((-1731));
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      constantPoolGen0.addNameAndType("OKx5", ")");
      int int0 = constantPoolGen0.lookupInteger((-1));
      assertEquals(4, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      constantPoolGen0.addInteger((-1730));
      int int0 = constantPoolGen0.lookupInteger((-1));
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addInterfaceMethodref("", "#fapvTeX%s$Y<$3&EQoK[chkt/eW", "#fapvTeX%s$Y<$3&EQoK[chkt/eW");
      int int0 = constantPoolGen0.addInterfaceMethodref("", "", "WM");
      assertEquals(9, constantPoolGen0.getSize());
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addString("P1ToFs_pf|TE0>d|");
      int int0 = constantPoolGen0.lookupString("P1ToFs_pf|TE0>d|");
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ConstantMethodHandle constantMethodHandle0 = new ConstantMethodHandle((-1811), (-1811));
      Constant[] constantArray0 = new Constant[5];
      constantArray0[1] = (Constant) constantMethodHandle0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      assertEquals(5, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Constant[] constantArray0 = new Constant[7];
      ConstantMethodType constantMethodType0 = new ConstantMethodType((-2034458190));
      constantArray0[1] = (Constant) constantMethodType0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      assertEquals(7, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Constant[] constantArray0 = new Constant[7];
      ConstantFloat constantFloat0 = new ConstantFloat(171);
      constantArray0[1] = (Constant) constantFloat0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      assertEquals(7, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addDouble((-1955.656));
      ConstantPool constantPool0 = constantPoolGen0.getConstantPool();
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantPool0);
      assertEquals(3, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addInteger((-3037));
      ConstantPool constantPool0 = constantPoolGen0.getConstantPool();
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantPool0);
      assertEquals(2, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addLong(1720L);
      ConstantPool constantPool0 = constantPoolGen0.getFinalConstantPool();
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantPool0);
      assertEquals(3, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Constant[] constantArray0 = new Constant[4];
      ConstantInvokeDynamic constantInvokeDynamic0 = new ConstantInvokeDynamic((-764), (-764));
      constantArray0[1] = (Constant) constantInvokeDynamic0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = null;
      try {
        constantPoolGen0 = new ConstantPoolGen(constantPool0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -764
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Constant[] constantArray0 = new Constant[7];
      ConstantUtf8 constantUtf8_0 = new ConstantUtf8("7uG3~d7tP{Fi%2");
      constantArray0[2] = (Constant) constantUtf8_0;
      constantArray0[3] = (Constant) constantUtf8_0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      assertEquals(7, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addInterfaceMethodref("", "#fapvTeX%s$Y<$3&EQoK[chkt/eW", "#fapvTeX%s$Y<$3&EQoK[chkt/eW");
      ConstantPool constantPool0 = constantPoolGen0.getFinalConstantPool();
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantPool0);
      assertEquals(6, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addString(":n}TJGz#~\"Q8p#/A!");
      ConstantPool constantPool0 = constantPoolGen0.getConstantPool();
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantPool0);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(256, constantPool0.getLength());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      constantPoolGen0.size = (-1);
      // Undeclared exception!
      try { 
        constantPoolGen0.addInteger(1);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        constantPoolGen0.addMethodref((MethodGen) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        constantPoolGen0.getConstant((-1952257860));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1952257860
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        constantPoolGen0.lookupMethodref((MethodGen) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ObjectType objectType0 = Type.STRINGBUFFER;
      int int0 = constantPoolGen0.addClass(objectType0);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.getSize();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        constantPoolGen0.addArrayClass((ArrayType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)10;
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      Constant constant0 = Constant.readConstant(byteSequence0);
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      constantPoolGen0.setConstant(152, constant0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        constantPoolGen0.addInterfaceMethodref((MethodGen) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      BIPUSH bIPUSH0 = new BIPUSH((byte)96);
      Type type0 = bIPUSH0.getType(constantPoolGen0);
      Character character0 = Character.valueOf('H');
      PUSH pUSH0 = new PUSH(constantPoolGen0, character0);
      InstructionList instructionList0 = new InstructionList(pUSH0);
      MethodGen methodGen0 = new MethodGen(471, type0, type0.NO_ARGS, (String[]) null, "u(5N9&\n&u(5N9", "' is static which it shouldn't be.", instructionList0, constantPoolGen0);
      int int0 = constantPoolGen0.lookupInterfaceMethodref(methodGen0);
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }
}
