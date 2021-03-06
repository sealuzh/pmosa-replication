/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 10:09:34 GMT 2019
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
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.FCMPL;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.PUSH;
import org.apache.bcel.generic.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConstantPoolGen_ESTest extends ConstantPoolGen_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantNameAndType constantNameAndType0 = new ConstantNameAndType(1, (-1760));
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantNameAndType0, constantPoolGen1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1760
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      ConstantClass constantClass0 = new ConstantClass(86);
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen();
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
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.adjustSize();
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      ConstantClass constantClass0 = new ConstantClass(86);
      constantPoolGen0.setConstant(86, constantClass0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.size = 2;
      int int0 = constantPoolGen0.addString("SlC q");
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantInteger constantInteger0 = new ConstantInteger(3);
      // Undeclared exception!
      try { 
        constantPoolGen0.setConstant(1690, constantInteger0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1690
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupMethodref("\n", "gF0^>", "LocalVariableTable");
      assertEquals((-1), int0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      int int0 = constantPoolGen0.lookupLong(199);
      assertEquals((-1), int0);
      assertEquals(2, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupInterfaceMethodref((String) null, ">z8^Ucrt}J gFCmjRp", (String) null);
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupInterfaceMethodref("gNkU\").bv", "gNkU\").bv", "gNkU\").bv");
      assertEquals((-1), int0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupFieldref("Illegally nested brackets:", (String) null, "Illegally nested brackets:");
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupDouble((-846.58978446742));
      assertEquals((-1), int0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.getConstant(0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.getConstant(203);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.addUtf8("org.apache.bcel.generic.ConstantPoolGen");
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.addNameAndType("SlC q", "SlC q");
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.addNameAndType("Illegally nested brackets:", "");
      assertEquals(4, constantPoolGen0.getSize());
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      int int0 = constantPoolGen0.addMethodref("&", "The wildcard list must not be null", "The wildcard list must not be null");
      assertEquals(7, constantPoolGen0.getSize());
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.addLong((-1910L));
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.addInteger(0);
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.addFloat(2.0F);
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.addDouble(0.0);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
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
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        constantPoolGen0.getConstant((-1610612734));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1610612734
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      Constant[] constantArray0 = new Constant[4];
      constantPoolGen0.constants = constantArray0;
      ObjectType objectType0 = Type.THROWABLE;
      constantPoolGen0.addClass(objectType0);
      // Undeclared exception!
      try { 
        constantPoolGen0.addNameAndType("", "");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      Constant[] constantArray0 = new Constant[5];
      constantPoolGen0.constants = constantArray0;
      // Undeclared exception!
      try { 
        constantPoolGen0.addInterfaceMethodref("i2b", "", "k1W");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      Constant[] constantArray0 = new Constant[1];
      constantPoolGen0.constants = constantArray0;
      // Undeclared exception!
      try { 
        constantPoolGen0.addClass("");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupFieldref("Unexpected constant type: ", "<UNINITIALIZED OBJECT OF TYPE 'java.lang.Object'>", (String) null);
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupInterfaceMethodref("", "", "");
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupMethodref("Illegally nested brackets:", "", "a7N`");
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupNameAndType("a7N`", "a7N`");
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      int int0 = constantPoolGen0.lookupDouble(11);
      assertEquals((-1), int0);
      assertEquals(2, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.lookupUtf8("gF0^>");
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      constantPoolGen0.addLong(4652177189706793995L);
      int int0 = constantPoolGen0.lookupInteger((-577));
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupClass("8&k|;w");
      assertEquals((-1), int0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupString("r7?[Z|/h/J,HQ3dq%");
      assertEquals((-1), int0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantMethodHandle constantMethodHandle0 = new ConstantMethodHandle(3324, (-2147483647));
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantMethodHandle0, constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unknown constant type CONSTANT_MethodHandle[15](reference_kind = 3324, reference_index = -2147483647)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantInterfaceMethodref constantInterfaceMethodref0 = new ConstantInterfaceMethodref(64, (-1));
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantInterfaceMethodref0, constantPoolGen0);
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
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantMethodref constantMethodref0 = new ConstantMethodref(29, 1);
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantMethodref0, constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantFieldref constantFieldref0 = new ConstantFieldref((-270), 250);
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantFieldref0, constantPoolGen0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -270
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ObjectType objectType0 = Type.CLASS;
      String[] stringArray0 = new String[0];
      PUSH pUSH0 = new PUSH(constantPoolGen0, 4654792944233572936L);
      InstructionList instructionList0 = pUSH0.getInstructionList();
      MethodGen methodGen0 = new MethodGen(1, objectType0, objectType0.NO_ARGS, stringArray0, "@IT%HO`o$4LC[=oDe9", "^P=l", instructionList0, constantPoolGen0);
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen();
      methodGen0.copy("org.pache.bcel.geeric.BEAKPOINT", constantPoolGen1);
      assertEquals(9, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantFloat constantFloat0 = new ConstantFloat(1171.0192F);
      int int0 = constantPoolGen0.addConstant(constantFloat0, constantPoolGen0);
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantUtf8 constantUtf8_0 = ConstantUtf8.getInstance("Operand of LDC or LDC_W must be one of CONSTANT_Integer, CONSTANT_Float or CONSTANT_String, but is '");
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      int int0 = constantPoolGen0.addConstant(constantUtf8_0, constantPoolGen0);
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addClass("Unknown constant type ");
      constantPoolGen0.toString();
      assertEquals(3, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = constantPoolGen0.toString();
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addMethodref("", "", "");
      int int0 = constantPoolGen0.lookupMethodref("", "", "");
      assertEquals(5, constantPoolGen0.getSize());
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addFieldref("", "", "");
      int int0 = constantPoolGen0.lookupNameAndType("", "");
      assertEquals(5, constantPoolGen0.getSize());
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addDouble((-1.0));
      int int0 = constantPoolGen0.addDouble(1609.380157611);
      assertEquals(5, constantPoolGen0.getSize());
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantDouble constantDouble0 = new ConstantDouble(1.0);
      constantArray0[1] = (Constant) constantDouble0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      int int0 = constantPoolGen0.addConstant(constantArray0[1], constantPoolGen0);
      assertEquals(1, int0);
      assertEquals(2, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addLong(4654792944233572936L);
      PUSH pUSH0 = new PUSH(constantPoolGen0, 4654792944233572936L);
      assertEquals(3, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      constantPoolGen0.addLong(4652177189706793995L);
      int int0 = constantPoolGen0.lookupLong((-1641L));
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addDouble(3205.90595236);
      int int0 = constantPoolGen0.lookupLong(0L);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.addFloat(0.0F);
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantFloat constantFloat0 = new ConstantFloat(0.0F);
      constantArray0[1] = (Constant) constantFloat0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      int int0 = constantPoolGen0.addFloat(0.0F);
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Constant[] constantArray0 = new Constant[3];
      ConstantFloat constantFloat0 = new ConstantFloat((-1217.0F));
      constantArray0[1] = (Constant) constantFloat0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      int int0 = constantPoolGen0.lookupFloat(0.0F);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addDouble(3205.90595236);
      int int0 = constantPoolGen0.lookupFloat(1);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      constantPoolGen0.addInteger(1);
      int int0 = constantPoolGen0.lookupInteger((-577));
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantInteger constantInteger0 = new ConstantInteger(64);
      constantArray0[1] = (Constant) constantInteger0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      int int0 = constantPoolGen0.addConstant(constantInteger0, constantPoolGen0);
      assertEquals(1, int0);
      assertEquals(2, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      constantPoolGen0.addInterfaceMethodref("c-!2<v!W9z`dTO", "c-!2<v!W9z`dTO", "' occurs more than once.");
      int int0 = constantPoolGen0.addClass("c-!2<v!W9z`dTO");
      assertEquals(7, constantPoolGen0.getSize());
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addString("org.apache.bcel.generic.ConstantPoolGen");
      int int0 = constantPoolGen0.addString("org.apache.bcel.generic.ConstantPoolGen");
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addString("SlC q");
      int int0 = constantPoolGen0.lookupString("SlC q");
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.size = (-1);
      // Undeclared exception!
      try { 
        constantPoolGen0.addClass("#");
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ConstantMethodHandle constantMethodHandle0 = new ConstantMethodHandle(3324, (-2147483647));
      Constant[] constantArray0 = new Constant[9];
      constantArray0[1] = (Constant) constantMethodHandle0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      assertEquals(9, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Constant[] constantArray0 = new Constant[8];
      ConstantMethodType constantMethodType0 = new ConstantMethodType(226);
      constantArray0[1] = (Constant) constantMethodType0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      assertEquals(8, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Constant[] constantArray0 = new Constant[3];
      ConstantLong constantLong0 = new ConstantLong(256);
      constantArray0[1] = (Constant) constantLong0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      assertEquals(3, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addDouble(3205.90595236);
      ConstantPool constantPool0 = constantPoolGen0.getConstantPool();
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantPool0);
      assertEquals(3, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Constant[] constantArray0 = new Constant[3];
      ConstantInvokeDynamic constantInvokeDynamic0 = new ConstantInvokeDynamic(256, 256);
      constantArray0[2] = (Constant) constantInvokeDynamic0;
      ConstantPoolGen constantPoolGen0 = null;
      try {
        constantPoolGen0 = new ConstantPoolGen(constantArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 256
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Constant[] constantArray0 = new Constant[9];
      ConstantUtf8 constantUtf8_0 = ConstantUtf8.getInstance("(tw`]$v?R");
      constantArray0[2] = (Constant) constantUtf8_0;
      constantArray0[3] = (Constant) constantUtf8_0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      assertEquals(9, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantPool constantPool0 = constantPoolGen0.getConstantPool();
      constantPoolGen0.addFieldref("]'Y4'3pq9 %tik}5", "c-!2<v!W9z`dTO", ")/XO7* 'XWqwq5]L#*)");
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantPool0);
      assertEquals(7, constantPoolGen0.getSize());
      assertEquals(256, constantPool0.getLength());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Constant[] constantArray0 = new Constant[8];
      ConstantString constantString0 = new ConstantString(3302);
      constantArray0[2] = (Constant) constantString0;
      ConstantPoolGen constantPoolGen0 = null;
      try {
        constantPoolGen0 = new ConstantPoolGen(constantArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3302
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
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
  public void test72()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ObjectType objectType0 = Type.CLASS;
      String[] stringArray0 = new String[0];
      PUSH pUSH0 = new PUSH(constantPoolGen0, "@IT%HO`o$4LC[=oDe9");
      InstructionList instructionList0 = pUSH0.getInstructionList();
      MethodGen methodGen0 = new MethodGen(1, objectType0, objectType0.NO_ARGS, stringArray0, "@IT%HO`o$4LC[=oDe9", "^P=l", instructionList0, constantPoolGen0);
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen();
      methodGen0.copy("org.apache.bcel.generic.BREAKPOINT", constantPoolGen1);
      assertEquals(8, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ObjectType objectType0 = Type.CLASS;
      String[] stringArray0 = new String[0];
      PUSH pUSH0 = new PUSH(constantPoolGen0, "@IT%HO`o$4LC[=oDe9");
      InstructionList instructionList0 = pUSH0.getInstructionList();
      MethodGen methodGen0 = new MethodGen(1, objectType0, objectType0.NO_ARGS, stringArray0, "@IT%HO`o$4LC[=oDe9", "^P=l", instructionList0, constantPoolGen0);
      int int0 = constantPoolGen0.lookupMethodref(methodGen0);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.getSize();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ArrayType arrayType0 = new ArrayType("!+,nx{;6qh8QLr!#Q", 1);
      int int0 = constantPoolGen0.addArrayClass(arrayType0);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantFloat constantFloat0 = new ConstantFloat(1171.0192F);
      // Undeclared exception!
      try { 
        constantPoolGen0.setConstant((-1), constantFloat0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
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
  public void test78()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      FCMPL fCMPL0 = new FCMPL();
      Type type0 = fCMPL0.getType(constantPoolGen0);
      byte[] byteArray0 = new byte[3];
      InstructionList instructionList0 = new InstructionList(byteArray0);
      MethodGen methodGen0 = new MethodGen((-1247), type0, type0.NO_ARGS, (String[]) null, "Nv9O]M&MQy[bXC", "2O~8\"nSnbK<|C:=sC7", instructionList0, constantPoolGen0);
      int int0 = constantPoolGen0.addInterfaceMethodref(methodGen0);
      assertEquals(7, constantPoolGen0.getSize());
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantPool constantPool0 = constantPoolGen0.getFinalConstantPool();
      assertEquals(1, constantPool0.getLength());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        constantPoolGen0.lookupInterfaceMethodref((MethodGen) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }
}
