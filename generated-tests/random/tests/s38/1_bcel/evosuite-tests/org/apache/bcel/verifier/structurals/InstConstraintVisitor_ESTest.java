/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 23:10:46 GMT 2019
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
import org.apache.bcel.generic.BIPUSH;
import org.apache.bcel.generic.BREAKPOINT;
import org.apache.bcel.generic.CALOAD;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.D2L;
import org.apache.bcel.generic.DASTORE;
import org.apache.bcel.generic.DCONST;
import org.apache.bcel.generic.DDIV;
import org.apache.bcel.generic.DLOAD;
import org.apache.bcel.generic.DREM;
import org.apache.bcel.generic.DSTORE;
import org.apache.bcel.generic.DUP2_X1;
import org.apache.bcel.generic.DUP_X2;
import org.apache.bcel.generic.F2D;
import org.apache.bcel.generic.FADD;
import org.apache.bcel.generic.FCMPL;
import org.apache.bcel.generic.FCONST;
import org.apache.bcel.generic.FLOAD;
import org.apache.bcel.generic.FSTORE;
import org.apache.bcel.generic.GETSTATIC;
import org.apache.bcel.generic.GOTO;
import org.apache.bcel.generic.GOTO_W;
import org.apache.bcel.generic.ICONST;
import org.apache.bcel.generic.IFEQ;
import org.apache.bcel.generic.IINC;
import org.apache.bcel.generic.ILOAD;
import org.apache.bcel.generic.IMPDEP1;
import org.apache.bcel.generic.IMPDEP2;
import org.apache.bcel.generic.INVOKEDYNAMIC;
import org.apache.bcel.generic.INVOKEINTERFACE;
import org.apache.bcel.generic.INVOKESPECIAL;
import org.apache.bcel.generic.ISHL;
import org.apache.bcel.generic.ISTORE;
import org.apache.bcel.generic.IXOR;
import org.apache.bcel.generic.Instruction;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.JSR;
import org.apache.bcel.generic.JSR_W;
import org.apache.bcel.generic.L2F;
import org.apache.bcel.generic.LCONST;
import org.apache.bcel.generic.LLOAD;
import org.apache.bcel.generic.LRETURN;
import org.apache.bcel.generic.LSTORE;
import org.apache.bcel.generic.MULTIANEWARRAY;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.NOP;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.PUSH;
import org.apache.bcel.generic.SIPUSH;
import org.apache.bcel.generic.StoreInstruction;
import org.apache.bcel.generic.TABLESWITCH;
import org.apache.bcel.generic.Type;
import org.apache.bcel.util.ByteSequence;
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
      instConstraintVisitor0.visitLSTORE((LSTORE) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-67);
      byteArray0[1] = (byte) (-114);
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      ANEWARRAY aNEWARRAY0 = (ANEWARRAY)Instruction.readInstruction(byteSequence0);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitANEWARRAY(aNEWARRAY0);
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
      ALOAD aLOAD0 = (ALOAD)InstructionConstants.ALOAD_0;
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitLocalVariableInstruction(aLOAD0);
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
      L2F l2F0 = new L2F();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitL2F(l2F0);
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
  public void test05()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      FADD fADD0 = new FADD();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitFADD(fADD0);
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
      F2D f2D0 = new F2D();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitF2D(f2D0);
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
      DUP2_X1 dUP2_X1_0 = new DUP2_X1();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitDUP2_X1(dUP2_X1_0);
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
      DREM dREM0 = new DREM();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitDREM(dREM0);
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
      DDIV dDIV0 = new DDIV();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitDDIV(dDIV0);
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
      DASTORE dASTORE0 = new DASTORE();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitDASTORE(dASTORE0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      D2L d2L0 = new D2L();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitD2L(d2L0);
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
  public void test13()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-67);
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      ANEWARRAY aNEWARRAY0 = (ANEWARRAY)Instruction.readInstruction(byteSequence0);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitANEWARRAY(aNEWARRAY0);
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
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY(1974, (short)1);
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
  public void test15()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LocalVariables localVariables0 = new LocalVariables(273);
      ObjectType objectType0 = Type.STRINGBUFFER;
      OperandStack operandStack0 = new OperandStack(273, objectType0);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      instConstraintVisitor0.setFrame(frame0);
      LRETURN lRETURN0 = new LRETURN();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitLRETURN(lRETURN0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction LRETURN constraint violated: The value at the stack top is not of type 'long', but of type 'java.lang.StringBuffer'.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      INVOKEINTERFACE iNVOKEINTERFACE0 = new INVOKEINTERFACE(0, 445);
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
  public void test17()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LocalVariables localVariables0 = new LocalVariables(1473);
      ObjectType objectType0 = new ObjectType(", but {");
      OperandStack operandStack0 = new OperandStack(1473, objectType0);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      instConstraintVisitor0.setFrame(frame0);
      IFEQ iFEQ0 = new IFEQ((InstructionHandle) null);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitIFEQ(iFEQ0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction IFEQ constraint violated: The value at the stack top is not of type 'int', but of type ', but {'.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LocalVariables localVariables0 = new LocalVariables(2);
      ObjectType objectType0 = Type.STRING;
      OperandStack operandStack0 = new OperandStack(2, objectType0);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      instConstraintVisitor0.setFrame(frame0);
      FCMPL fCMPL0 = new FCMPL();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitFCMPL(fCMPL0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction FCMPL constraint violated: The value at the stack top is not of type 'float', but of type 'java.lang.String'.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LocalVariables localVariables0 = new LocalVariables(1473);
      ObjectType objectType0 = new ObjectType(", but {");
      OperandStack operandStack0 = new OperandStack(1473, objectType0);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      instConstraintVisitor0.setFrame(frame0);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitDUP_X2((DUP_X2) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LocalVariables localVariables0 = new LocalVariables(12);
      OperandStack operandStack0 = new OperandStack((-1924));
      Frame frame0 = new Frame(localVariables0, operandStack0);
      instConstraintVisitor0.setFrame(frame0);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitStoreInstruction((StoreInstruction) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      INVOKEDYNAMIC iNVOKEDYNAMIC0 = new INVOKEDYNAMIC(4);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitCPInstruction(iNVOKEDYNAMIC0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LocalVariables localVariables0 = new LocalVariables(1473);
      ObjectType objectType0 = new ObjectType(", but {");
      OperandStack operandStack0 = new OperandStack(1473, objectType0);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      instConstraintVisitor0.setFrame(frame0);
      GETSTATIC gETSTATIC0 = new GETSTATIC(1473);
      // Undeclared exception!
      try { 
        gETSTATIC0.accept(instConstraintVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LLOAD lLOAD0 = new LLOAD(0);
      instConstraintVisitor0.visitLLOAD(lLOAD0);
      assertEquals((short)30, lLOAD0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LocalVariables localVariables0 = new LocalVariables(46);
      ObjectType objectType0 = Type.CLASS;
      OperandStack operandStack0 = new OperandStack(1000, objectType0);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      instConstraintVisitor0.setFrame(frame0);
      IXOR iXOR0 = new IXOR();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitIXOR(iXOR0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction IXOR constraint violated: The value at the stack top is not of type 'int', but of type 'java.lang.Class'.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      FSTORE fSTORE0 = new FSTORE(4712);
      instConstraintVisitor0.visitFSTORE(fSTORE0);
      assertEquals((short)56, fSTORE0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
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
  public void test27()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      instConstraintVisitor0.visitISTORE((ISTORE) null);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      ACONST_NULL aCONST_NULL0 = new ACONST_NULL();
      instConstraintVisitor0.visitACONST_NULL(aCONST_NULL0);
      assertEquals((short)1, aCONST_NULL0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      NOP nOP0 = new NOP();
      instConstraintVisitor0.visitNOP(nOP0);
      assertEquals(1, nOP0.getLength());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      BIPUSH bIPUSH0 = new BIPUSH((byte)66);
      instConstraintVisitor0.visitBIPUSH(bIPUSH0);
      assertEquals(2, bIPUSH0.getLength());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      Frame frame0 = new Frame(0, 0);
      instConstraintVisitor0.setFrame(frame0);
      DSTORE dSTORE0 = new DSTORE(445);
      // Undeclared exception!
      try { 
        dSTORE0.accept(instConstraintVisitor0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction DSTORE constraint violated: Cannot consume 2 stack slots: only 0 slot(s) left on stack!
         // Stack:
         // Slots used: 0 MaxStack: 0.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      InstructionList instructionList0 = new InstructionList();
      InstructionHandle instructionHandle0 = instructionList0.insert(instructionList0);
      JSR_W jSR_W0 = new JSR_W(instructionHandle0);
      instConstraintVisitor0.visitJSR_W(jSR_W0);
      assertEquals((short)201, jSR_W0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      GETSTATIC gETSTATIC0 = new GETSTATIC(97);
      instConstraintVisitor0.visitGETSTATIC(gETSTATIC0);
      assertEquals("getstatic", gETSTATIC0.getName());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      DLOAD dLOAD0 = new DLOAD(169);
      instConstraintVisitor0.visitDLOAD(dLOAD0);
      assertEquals(169, dLOAD0.getIndex());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LSTORE lSTORE0 = new LSTORE(46);
      instConstraintVisitor0.visitLSTORE(lSTORE0);
      assertEquals((short)55, lSTORE0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
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
  public void test37()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      FLOAD fLOAD0 = new FLOAD(820);
      instConstraintVisitor0.visitFLOAD(fLOAD0);
      assertEquals(4, fLOAD0.getLength());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      instConstraintVisitor0.setConstantPoolGen(constantPoolGen0);
      INVOKEDYNAMIC iNVOKEDYNAMIC0 = new INVOKEDYNAMIC(4);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitCPInstruction(iNVOKEDYNAMIC0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL ERROR: Huh?! Constant pool index of instruction 'invokedynamic[186](3) 4' illegal? Pass 3a should have checked this!
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      ILOAD iLOAD0 = new ILOAD(46);
      instConstraintVisitor0.visitILOAD(iLOAD0);
      assertEquals(2, iLOAD0.getLength());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
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
  public void test41()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      instConstraintVisitor0.visitJSR((JSR) null);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      SIPUSH sIPUSH0 = new SIPUSH((short)1);
      instConstraintVisitor0.visitSIPUSH(sIPUSH0);
      assertEquals(3, sIPUSH0.getLength());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      instConstraintVisitor0.visitGOTO((GOTO) null);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
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
  public void test45()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      GOTO_W gOTO_W0 = new GOTO_W((InstructionHandle) null);
      instConstraintVisitor0.visitGOTO_W(gOTO_W0);
      assertEquals(5, gOTO_W0.getLength());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      ALOAD aLOAD0 = new ALOAD(445);
      instConstraintVisitor0.visitALOAD(aLOAD0);
      assertEquals(4, aLOAD0.getLength());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      instConstraintVisitor0.visitICONST((ICONST) null);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LCONST lCONST0 = new LCONST(0L);
      instConstraintVisitor0.visitLCONST(lCONST0);
      assertEquals("lconst_0", lCONST0.getName());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitIINC((IINC) null);
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
      DUP_X2 dUP_X2_0 = (DUP_X2)InstructionConstants.DUP_X2;
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitStackInstruction(dUP_X2_0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitINVOKEDYNAMIC((INVOKEDYNAMIC) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INVOKEDYNAMIC instruction is not supported at this time
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      ARETURN aRETURN0 = new ARETURN();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      Type type0 = aRETURN0.getType(constantPoolGen0);
      PUSH pUSH0 = new PUSH(constantPoolGen0, (-36));
      InstructionList instructionList0 = pUSH0.getInstructionList();
      MethodGen methodGen0 = new MethodGen(445, type0, type0.NO_ARGS, (String[]) null, (String) null, (String) null, instructionList0, constantPoolGen0);
      instConstraintVisitor0.setMethodGen(methodGen0);
      assertTrue(methodGen0.isNative());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      DSTORE dSTORE0 = new DSTORE(96);
      instConstraintVisitor0.visitDSTORE(dSTORE0);
      assertEquals("dstore", dSTORE0.getName());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      DCONST dCONST0 = new DCONST(0.0);
      instConstraintVisitor0.visitDCONST(dCONST0);
      assertEquals("dconst_0", dCONST0.getName());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
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
  public void test56()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      FCONST fCONST0 = new FCONST(0.0F);
      instConstraintVisitor0.visitFCONST(fCONST0);
      assertEquals((short)11, fCONST0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
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
  public void test58()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      INVOKESPECIAL iNVOKESPECIAL0 = new INVOKESPECIAL(647);
      instConstraintVisitor0.visitInvokeInstruction(iNVOKESPECIAL0);
      assertEquals(647, iNVOKESPECIAL0.getIndex());
  }
}