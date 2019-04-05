/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 06:06:30 GMT 2019
 */

package org.apache.bcel.verifier.structurals;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.generic.ACONST_NULL;
import org.apache.bcel.generic.ALOAD;
import org.apache.bcel.generic.ANEWARRAY;
import org.apache.bcel.generic.ARETURN;
import org.apache.bcel.generic.ARRAYLENGTH;
import org.apache.bcel.generic.ASTORE;
import org.apache.bcel.generic.BIPUSH;
import org.apache.bcel.generic.BREAKPOINT;
import org.apache.bcel.generic.BasicType;
import org.apache.bcel.generic.CALOAD;
import org.apache.bcel.generic.CompoundInstruction;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.DADD;
import org.apache.bcel.generic.DCMPG;
import org.apache.bcel.generic.DCONST;
import org.apache.bcel.generic.DLOAD;
import org.apache.bcel.generic.DREM;
import org.apache.bcel.generic.DSTORE;
import org.apache.bcel.generic.DUP;
import org.apache.bcel.generic.DUP_X1;
import org.apache.bcel.generic.F2I;
import org.apache.bcel.generic.FCMPG;
import org.apache.bcel.generic.FCONST;
import org.apache.bcel.generic.FLOAD;
import org.apache.bcel.generic.FREM;
import org.apache.bcel.generic.FSTORE;
import org.apache.bcel.generic.GETSTATIC;
import org.apache.bcel.generic.GOTO;
import org.apache.bcel.generic.GOTO_W;
import org.apache.bcel.generic.I2C;
import org.apache.bcel.generic.I2S;
import org.apache.bcel.generic.IASTORE;
import org.apache.bcel.generic.ICONST;
import org.apache.bcel.generic.IDIV;
import org.apache.bcel.generic.IFLT;
import org.apache.bcel.generic.IINC;
import org.apache.bcel.generic.ILOAD;
import org.apache.bcel.generic.IMPDEP1;
import org.apache.bcel.generic.IMPDEP2;
import org.apache.bcel.generic.INVOKEDYNAMIC;
import org.apache.bcel.generic.INVOKEINTERFACE;
import org.apache.bcel.generic.INVOKESPECIAL;
import org.apache.bcel.generic.INVOKEVIRTUAL;
import org.apache.bcel.generic.IOR;
import org.apache.bcel.generic.IRETURN;
import org.apache.bcel.generic.ISHL;
import org.apache.bcel.generic.ISTORE;
import org.apache.bcel.generic.Instruction;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.JSR;
import org.apache.bcel.generic.JSR_W;
import org.apache.bcel.generic.LCONST;
import org.apache.bcel.generic.LDC_W;
import org.apache.bcel.generic.LLOAD;
import org.apache.bcel.generic.LNEG;
import org.apache.bcel.generic.LRETURN;
import org.apache.bcel.generic.LSHR;
import org.apache.bcel.generic.LSTORE;
import org.apache.bcel.generic.LXOR;
import org.apache.bcel.generic.MULTIANEWARRAY;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.NEW;
import org.apache.bcel.generic.NEWARRAY;
import org.apache.bcel.generic.NOP;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.POP2;
import org.apache.bcel.generic.PUSH;
import org.apache.bcel.generic.RET;
import org.apache.bcel.generic.SIPUSH;
import org.apache.bcel.generic.SWAP;
import org.apache.bcel.generic.TABLESWITCH;
import org.apache.bcel.generic.Type;
import org.apache.bcel.verifier.structurals.Frame;
import org.apache.bcel.verifier.structurals.InstConstraintVisitor;
import org.apache.bcel.verifier.structurals.LocalVariables;
import org.apache.bcel.verifier.structurals.OperandStack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InstConstraintVisitor_ESTest extends InstConstraintVisitor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      instConstraintVisitor0.visitNOP((NOP) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      SWAP sWAP0 = new SWAP();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitSWAP(sWAP0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      IRETURN iRETURN0 = (IRETURN)InstructionConstants.IRETURN;
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitReturnInstruction(iRETURN0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      BasicType basicType0 = Type.SHORT;
      NEWARRAY nEWARRAY0 = new NEWARRAY(basicType0);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitNEWARRAY(nEWARRAY0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      NEW nEW0 = new NEW(2950);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitNEW(nEW0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.CPInstruction", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitLXOR((LXOR) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LSHR lSHR0 = new LSHR();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitLSHR(lSHR0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LRETURN lRETURN0 = new LRETURN();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitLRETURN(lRETURN0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LNEG lNEG0 = new LNEG();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitLNEG(lNEG0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      ISHL iSHL0 = new ISHL();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitISHL(iSHL0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      INVOKEVIRTUAL iNVOKEVIRTUAL0 = new INVOKEVIRTUAL(1);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitINVOKEVIRTUAL(iNVOKEVIRTUAL0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      IDIV iDIV0 = new IDIV();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitIDIV(iDIV0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      IASTORE iASTORE0 = new IASTORE();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitIASTORE(iASTORE0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      I2S i2S0 = new I2S();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitI2S(i2S0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      I2C i2C0 = new I2C();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitI2C(i2C0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      F2I f2I0 = new F2I();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitF2I(f2I0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      DUP dUP0 = new DUP();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitDUP(dUP0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      ARETURN aRETURN0 = new ARETURN();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitARETURN(aRETURN0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LocalVariables localVariables0 = new LocalVariables(3514);
      ObjectType objectType0 = Type.CLASS;
      OperandStack operandStack0 = new OperandStack(5, objectType0);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      instConstraintVisitor0.setFrame(frame0);
      SWAP sWAP0 = new SWAP();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitSWAP(sWAP0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY(1086, (short)1584);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitMULTIANEWARRAY(mULTIANEWARRAY0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LocalVariables localVariables0 = new LocalVariables(1496);
      ObjectType objectType0 = ObjectType.getInstance("Be$usn)@<N6j");
      OperandStack operandStack0 = new OperandStack(1496, objectType0);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      instConstraintVisitor0.setFrame(frame0);
      IOR iOR0 = new IOR();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitIOR(iOR0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid signature: LBe$usn)@<N6j;
         //
         verifyException("org.apache.bcel.classfile.Utility", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      INVOKEINTERFACE iNVOKEINTERFACE0 = new INVOKEINTERFACE(2, 1);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitINVOKEINTERFACE(iNVOKEINTERFACE0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      IINC iINC0 = new IINC(749, 5);
      Frame frame0 = new Frame(5, 5);
      instConstraintVisitor0.setFrame(frame0);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitIINC(iINC0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction IINC constraint violated: The 'index' is not a valid index into the local variable array.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LocalVariables localVariables0 = new LocalVariables(1496);
      ObjectType objectType0 = ObjectType.getInstance("Be$usn)@<N6j");
      OperandStack operandStack0 = new OperandStack(1496, objectType0);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      instConstraintVisitor0.setFrame(frame0);
      FREM fREM0 = new FREM();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitFREM(fREM0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid signature: LBe$usn)@<N6j;
         //
         verifyException("org.apache.bcel.classfile.Utility", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LocalVariables localVariables0 = new LocalVariables(189);
      ObjectType objectType0 = Type.STRINGBUFFER;
      OperandStack operandStack0 = new OperandStack(189, objectType0);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      instConstraintVisitor0.setFrame(frame0);
      FCMPG fCMPG0 = new FCMPG();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitFCMPG(fCMPG0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction FCMPG constraint violated: The value at the stack top is not of type 'float', but of type 'java.lang.StringBuffer'.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LocalVariables localVariables0 = new LocalVariables(3514);
      ObjectType objectType0 = Type.THROWABLE;
      OperandStack operandStack0 = new OperandStack(58, objectType0);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      instConstraintVisitor0.setFrame(frame0);
      DUP_X1 dUP_X1_0 = new DUP_X1();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitDUP_X1(dUP_X1_0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LocalVariables localVariables0 = new LocalVariables(3514);
      ObjectType objectType0 = Type.CLASS;
      OperandStack operandStack0 = new OperandStack(5, objectType0);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      instConstraintVisitor0.setFrame(frame0);
      DREM dREM0 = new DREM();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitDREM(dREM0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction DREM constraint violated: The value at the stack top is not of type 'double', but of type 'java.lang.Class'.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LocalVariables localVariables0 = new LocalVariables(250);
      ObjectType objectType0 = Type.CLASS;
      OperandStack operandStack0 = new OperandStack(250, objectType0);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      instConstraintVisitor0.setFrame(frame0);
      DADD dADD0 = new DADD();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitDADD(dADD0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction DADD constraint violated: The value at the stack top is not of type 'double', but of type 'java.lang.Class'.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LocalVariables localVariables0 = new LocalVariables(3514);
      ObjectType objectType0 = Type.CLASS;
      OperandStack operandStack0 = new OperandStack(5, objectType0);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      instConstraintVisitor0.setFrame(frame0);
      ASTORE aSTORE0 = new ASTORE(5);
      instConstraintVisitor0.visitASTORE(aSTORE0);
      assertEquals(2, aSTORE0.getLength());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      Frame frame0 = new Frame(3, 3);
      instConstraintVisitor0.setFrame(frame0);
      DSTORE dSTORE0 = new DSTORE(3);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitLocalVariableInstruction(dSTORE0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction DSTORE constraint violated: The 'index' is not a valid index into the local variable array.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      ANEWARRAY aNEWARRAY0 = new ANEWARRAY(0);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitCPInstruction(aNEWARRAY0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      Frame frame0 = new Frame(2575, 253);
      instConstraintVisitor0.setFrame(frame0);
      POP2 pOP2_0 = new POP2();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitStackInstruction(pOP2_0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction POP2 constraint violated: Cannot consume 2 stack slots: only 0 slot(s) left on stack!
         // Stack:
         // Slots used: 0 MaxStack: 253.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LLOAD lLOAD0 = new LLOAD(3);
      instConstraintVisitor0.visitLLOAD(lLOAD0);
      assertEquals((short)33, lLOAD0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      FSTORE fSTORE0 = new FSTORE(79);
      instConstraintVisitor0.visitFSTORE(fSTORE0);
      assertEquals("fstore", fSTORE0.getName());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      CALOAD cALOAD0 = new CALOAD();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitCALOAD(cALOAD0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      instConstraintVisitor0.visitISTORE((ISTORE) null);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      ACONST_NULL aCONST_NULL0 = new ACONST_NULL();
      instConstraintVisitor0.visitACONST_NULL(aCONST_NULL0);
      assertEquals(1, aCONST_NULL0.getLength());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      NOP nOP0 = new NOP();
      instConstraintVisitor0.visitNOP(nOP0);
      assertEquals("nop", nOP0.getName());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      BIPUSH bIPUSH0 = new BIPUSH((byte)89);
      instConstraintVisitor0.visitBIPUSH(bIPUSH0);
      assertEquals("bipush", bIPUSH0.getName());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LocalVariables localVariables0 = new LocalVariables(76);
      ObjectType objectType0 = Type.OBJECT;
      OperandStack operandStack0 = new OperandStack(76, objectType0);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      instConstraintVisitor0.setFrame(frame0);
      DCMPG dCMPG0 = new DCMPG();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitDCMPG(dCMPG0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction DCMPG constraint violated: The value at the stack top is not of type 'double', but of type 'java.lang.Object'.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      instConstraintVisitor0.visitJSR_W((JSR_W) null);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      GETSTATIC gETSTATIC0 = new GETSTATIC(5);
      instConstraintVisitor0.visitGETSTATIC(gETSTATIC0);
      assertEquals((short)178, gETSTATIC0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      DLOAD dLOAD0 = new DLOAD(2981);
      instConstraintVisitor0.visitDLOAD(dLOAD0);
      assertEquals((short)24, dLOAD0.getCanonicalTag());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LSTORE lSTORE0 = new LSTORE(2);
      instConstraintVisitor0.visitLSTORE(lSTORE0);
      assertEquals("lstore_2", lSTORE0.getName());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      ARRAYLENGTH aRRAYLENGTH0 = new ARRAYLENGTH();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitARRAYLENGTH(aRRAYLENGTH0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      FLOAD fLOAD0 = new FLOAD(253);
      instConstraintVisitor0.visitFLOAD(fLOAD0);
      assertEquals(2, fLOAD0.getLength());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      instConstraintVisitor0.setConstantPoolGen(constantPoolGen0);
      LDC_W lDC_W0 = new LDC_W(1);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitLDC_W(lDC_W0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction LDC_W constraint violated: Referenced constant should be a CONSTANT_Integer, a CONSTANT_Float, a CONSTANT_String or a CONSTANT_Class, but is 'null'.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      ILOAD iLOAD0 = new ILOAD(147);
      instConstraintVisitor0.visitILOAD(iLOAD0);
      assertEquals("iload", iLOAD0.getName());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      DLOAD dLOAD0 = new DLOAD(2981);
      // Undeclared exception!
      try { 
        dLOAD0.accept(instConstraintVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitTABLESWITCH((TABLESWITCH) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      InstructionList instructionList0 = new InstructionList();
      Integer integer0 = new Integer((-612));
      PUSH pUSH0 = new PUSH(constantPoolGen0, (Number) integer0);
      InstructionHandle instructionHandle0 = instructionList0.insert((CompoundInstruction) pUSH0);
      JSR jSR0 = new JSR(instructionHandle0);
      instConstraintVisitor0.visitJSR(jSR0);
      assertEquals("jsr", jSR0.getName());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      SIPUSH sIPUSH0 = new SIPUSH((short)365);
      instConstraintVisitor0.visitSIPUSH(sIPUSH0);
      assertEquals("sipush", sIPUSH0.getName());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      DUP dUP0 = (DUP)InstructionConstants.DUP;
      InstructionList instructionList0 = new InstructionList(dUP0);
      InstructionHandle instructionHandle0 = instructionList0.append((Instruction) dUP0, (Instruction) dUP0);
      GOTO gOTO0 = new GOTO(instructionHandle0);
      instConstraintVisitor0.visitGOTO(gOTO0);
      assertEquals("goto", gOTO0.getName());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      IMPDEP2 iMPDEP2_0 = new IMPDEP2();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitIMPDEP2(iMPDEP2_0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL ERROR: In this JustIce verification pass there should not occur an illegal instruction such as IMPDEP2.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      GOTO_W gOTO_W0 = new GOTO_W((InstructionHandle) null);
      instConstraintVisitor0.visitGOTO_W(gOTO_W0);
      assertEquals(5, gOTO_W0.getLength());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      instConstraintVisitor0.visitALOAD((ALOAD) null);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      IFLT iFLT0 = new IFLT((InstructionHandle) null);
      // Undeclared exception!
      try { 
        iFLT0.accept(instConstraintVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      ICONST iCONST0 = new ICONST(0);
      instConstraintVisitor0.visitICONST(iCONST0);
      assertEquals("iconst_0", iCONST0.getName());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LCONST lCONST0 = new LCONST(1L);
      instConstraintVisitor0.visitLCONST(lCONST0);
      assertEquals(1, lCONST0.getLength());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitRET((RET) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      INVOKEDYNAMIC iNVOKEDYNAMIC0 = new INVOKEDYNAMIC(11);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitINVOKEDYNAMIC(iNVOKEDYNAMIC0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INVOKEDYNAMIC instruction is not supported at this time
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      instConstraintVisitor0.setMethodGen((MethodGen) null);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      DSTORE dSTORE0 = new DSTORE((byte)39);
      instConstraintVisitor0.visitDSTORE(dSTORE0);
      assertEquals(39, dSTORE0.getIndex());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      DCONST dCONST0 = new DCONST(0.0);
      instConstraintVisitor0.visitDCONST(dCONST0);
      assertEquals("dconst_0", dCONST0.getName());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      IMPDEP1 iMPDEP1_0 = new IMPDEP1();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitIMPDEP1(iMPDEP1_0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL ERROR: In this JustIce verification pass there should not occur an illegal instruction such as IMPDEP1.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      FCONST fCONST0 = new FCONST(0.0F);
      instConstraintVisitor0.visitFCONST(fCONST0);
      assertEquals(1, fCONST0.getLength());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      BREAKPOINT bREAKPOINT0 = new BREAKPOINT();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitBREAKPOINT(bREAKPOINT0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL ERROR: In this JustIce verification pass there should not occur an illegal instruction such as BREAKPOINT.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      INVOKESPECIAL iNVOKESPECIAL0 = new INVOKESPECIAL(58);
      instConstraintVisitor0.visitInvokeInstruction(iNVOKESPECIAL0);
      assertEquals(58, iNVOKESPECIAL0.getIndex());
  }
}