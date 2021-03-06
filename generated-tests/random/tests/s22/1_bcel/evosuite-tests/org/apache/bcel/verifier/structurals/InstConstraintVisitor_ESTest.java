/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 06:59:19 GMT 2019
 */

package org.apache.bcel.verifier.structurals;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.generic.ACONST_NULL;
import org.apache.bcel.generic.ALOAD;
import org.apache.bcel.generic.ARRAYLENGTH;
import org.apache.bcel.generic.BASTORE;
import org.apache.bcel.generic.BIPUSH;
import org.apache.bcel.generic.BREAKPOINT;
import org.apache.bcel.generic.BasicType;
import org.apache.bcel.generic.CALOAD;
import org.apache.bcel.generic.CASTORE;
import org.apache.bcel.generic.CompoundInstruction;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.DADD;
import org.apache.bcel.generic.DASTORE;
import org.apache.bcel.generic.DCONST;
import org.apache.bcel.generic.DDIV;
import org.apache.bcel.generic.DLOAD;
import org.apache.bcel.generic.DREM;
import org.apache.bcel.generic.DSTORE;
import org.apache.bcel.generic.DUP2;
import org.apache.bcel.generic.F2I;
import org.apache.bcel.generic.FALOAD;
import org.apache.bcel.generic.FCMPL;
import org.apache.bcel.generic.FCONST;
import org.apache.bcel.generic.FLOAD;
import org.apache.bcel.generic.FREM;
import org.apache.bcel.generic.FRETURN;
import org.apache.bcel.generic.FSTORE;
import org.apache.bcel.generic.GETSTATIC;
import org.apache.bcel.generic.GOTO;
import org.apache.bcel.generic.GOTO_W;
import org.apache.bcel.generic.I2C;
import org.apache.bcel.generic.ICONST;
import org.apache.bcel.generic.IINC;
import org.apache.bcel.generic.ILOAD;
import org.apache.bcel.generic.IMPDEP1;
import org.apache.bcel.generic.IMPDEP2;
import org.apache.bcel.generic.INVOKEDYNAMIC;
import org.apache.bcel.generic.INVOKEINTERFACE;
import org.apache.bcel.generic.INVOKEVIRTUAL;
import org.apache.bcel.generic.ISTORE;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.JSR;
import org.apache.bcel.generic.JSR_W;
import org.apache.bcel.generic.L2I;
import org.apache.bcel.generic.LCMP;
import org.apache.bcel.generic.LCONST;
import org.apache.bcel.generic.LDC_W;
import org.apache.bcel.generic.LLOAD;
import org.apache.bcel.generic.LOR;
import org.apache.bcel.generic.LRETURN;
import org.apache.bcel.generic.LSTORE;
import org.apache.bcel.generic.LUSHR;
import org.apache.bcel.generic.MULTIANEWARRAY;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.NOP;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.PUSH;
import org.apache.bcel.generic.PUTFIELD;
import org.apache.bcel.generic.PUTSTATIC;
import org.apache.bcel.generic.SALOAD;
import org.apache.bcel.generic.SASTORE;
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
      IINC iINC0 = new IINC(0, 0);
      // Undeclared exception!
      try { 
        iINC0.accept(instConstraintVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
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
      SASTORE sASTORE0 = new SASTORE();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitSASTORE(sASTORE0);
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
      SALOAD sALOAD0 = new SALOAD();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitSALOAD(sALOAD0);
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
      PUTSTATIC pUTSTATIC0 = new PUTSTATIC(1515);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitPUTSTATIC(pUTSTATIC0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
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
  public void test06()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LOR lOR0 = new LOR();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitLOR(lOR0);
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
      LCMP lCMP0 = new LCMP();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitLCMP(lCMP0);
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
      L2I l2I0 = new L2I();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitL2I(l2I0);
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
      FREM fREM0 = new FREM();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitFREM(fREM0);
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
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitFALOAD((FALOAD) null);
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
  public void test12()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitDDIV((DDIV) null);
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
      CASTORE cASTORE0 = new CASTORE();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitCASTORE(cASTORE0);
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
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitBASTORE((BASTORE) null);
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
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY(60, (short)204);
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
  public void test16()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LocalVariables localVariables0 = new LocalVariables(3171);
      ObjectType objectType0 = Type.THROWABLE;
      OperandStack operandStack0 = new OperandStack(3171, objectType0);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      instConstraintVisitor0.setFrame(frame0);
      LUSHR lUSHR0 = new LUSHR();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitLUSHR(lUSHR0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction LUSHR constraint violated: The value at the stack top is not of type 'int', but of type 'java.lang.Throwable'.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      INVOKEINTERFACE iNVOKEINTERFACE0 = new INVOKEINTERFACE(3, 3);
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
  public void test18()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LocalVariables localVariables0 = new LocalVariables(1093);
      ObjectType objectType0 = ObjectType.getInstance("Ab_");
      OperandStack operandStack0 = new OperandStack(77, objectType0);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      instConstraintVisitor0.setFrame(frame0);
      FRETURN fRETURN0 = new FRETURN();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitFRETURN(fRETURN0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction FRETURN constraint violated: The value at the stack top is not of type 'float', but of type 'Ab_'.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LocalVariables localVariables0 = new LocalVariables(97);
      OperandStack operandStack0 = new OperandStack(1);
      DADD dADD0 = new DADD();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      Type type0 = dADD0.getType(constantPoolGen0);
      operandStack0.push(type0);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      instConstraintVisitor0.setFrame(frame0);
      FCMPL fCMPL0 = new FCMPL();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitFCMPL(fCMPL0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction FCMPL constraint violated: The value at the stack top is not of type 'float', but of type 'double'.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LocalVariables localVariables0 = new LocalVariables(97);
      OperandStack operandStack0 = new OperandStack(97);
      DADD dADD0 = new DADD();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      Type type0 = dADD0.getType(constantPoolGen0);
      operandStack0.push(type0);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      instConstraintVisitor0.setFrame(frame0);
      DASTORE dASTORE0 = new DASTORE();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitDASTORE(dASTORE0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      DADD dADD0 = new DADD();
      BasicType basicType0 = Type.CHAR;
      String[] stringArray0 = new String[8];
      InstructionList instructionList0 = new InstructionList(dADD0);
      MethodGen methodGen0 = new MethodGen(0, basicType0, (Type[]) null, stringArray0, "FQB/}Q4DV/{cP", "", instructionList0, (ConstantPoolGen) null);
      instConstraintVisitor0.setMethodGen(methodGen0);
      LRETURN lRETURN0 = new LRETURN();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitReturnInstruction(lRETURN0);
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
      PUTFIELD pUTFIELD0 = new PUTFIELD(902);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitCPInstruction(pUTFIELD0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      Frame frame0 = new Frame(2824, 2824);
      instConstraintVisitor0.setFrame(frame0);
      IINC iINC0 = new IINC(169, 2824);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitIINC(iINC0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction IINC constraint violated: The 'index' is not of type int but of type <unknown object>.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LLOAD lLOAD0 = new LLOAD(24);
      instConstraintVisitor0.visitLLOAD(lLOAD0);
      assertEquals(2, lLOAD0.getLength());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      FSTORE fSTORE0 = new FSTORE(406);
      instConstraintVisitor0.visitFSTORE(fSTORE0);
      assertEquals("fstore", fSTORE0.getName());
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
      ISTORE iSTORE0 = new ISTORE(255);
      instConstraintVisitor0.visitISTORE(iSTORE0);
      assertEquals((short)54, iSTORE0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      instConstraintVisitor0.visitACONST_NULL((ACONST_NULL) null);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      NOP nOP0 = new NOP();
      instConstraintVisitor0.visitNOP(nOP0);
      assertEquals((short)0, nOP0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      BIPUSH bIPUSH0 = new BIPUSH((byte) (-36));
      instConstraintVisitor0.visitBIPUSH(bIPUSH0);
      assertEquals((short)16, bIPUSH0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      Frame frame0 = new Frame(3360, 3360);
      instConstraintVisitor0.setFrame(frame0);
      I2C i2C0 = (I2C)InstructionConstants.I2C;
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitStackProducer(i2C0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction I2C constraint violated: Cannot consume 1 stack slots: only 0 slot(s) left on stack!
         // Stack:
         // Slots used: 0 MaxStack: 3360.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      JSR_W jSR_W0 = new JSR_W((InstructionHandle) null);
      instConstraintVisitor0.visitJSR_W(jSR_W0);
      assertEquals(5, jSR_W0.getLength());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      GETSTATIC gETSTATIC0 = new GETSTATIC(0);
      instConstraintVisitor0.visitGETSTATIC(gETSTATIC0);
      assertEquals("getstatic", gETSTATIC0.getName());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      DLOAD dLOAD0 = new DLOAD(0);
      instConstraintVisitor0.visitDLOAD(dLOAD0);
      assertEquals(0, dLOAD0.getIndex());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LSTORE lSTORE0 = new LSTORE(237);
      instConstraintVisitor0.visitLSTORE(lSTORE0);
      assertEquals((short)55, lSTORE0.getCanonicalTag());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitARRAYLENGTH((ARRAYLENGTH) null);
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
      FLOAD fLOAD0 = new FLOAD(808);
      instConstraintVisitor0.visitFLOAD(fLOAD0);
      assertEquals(4, fLOAD0.getLength());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
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
  public void test39()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      ILOAD iLOAD0 = new ILOAD(1202);
      instConstraintVisitor0.visitILOAD(iLOAD0);
      assertEquals(1202, iLOAD0.getIndex());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      int[] intArray0 = new int[3];
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[3];
      DREM dREM0 = (DREM)InstructionConstants.DREM;
      InstructionList instructionList0 = new InstructionList(dREM0);
      PUSH pUSH0 = new PUSH((ConstantPoolGen) null, 349);
      InstructionHandle instructionHandle0 = instructionList0.insert((CompoundInstruction) pUSH0);
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH(intArray0, instructionHandleArray0, instructionHandle0);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitTABLESWITCH(tABLESWITCH0);
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
      SIPUSH sIPUSH0 = new SIPUSH((short) (-424));
      instConstraintVisitor0.visitSIPUSH(sIPUSH0);
      assertEquals(3, sIPUSH0.getLength());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      GOTO gOTO0 = new GOTO((InstructionHandle) null);
      instConstraintVisitor0.visitGOTO(gOTO0);
      assertEquals(3, gOTO0.getLength());
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
      assertEquals(0, gOTO_W0.getIndex());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      ALOAD aLOAD0 = new ALOAD(53);
      instConstraintVisitor0.visitALOAD(aLOAD0);
      assertEquals(2, aLOAD0.getLength());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      FRETURN fRETURN0 = new FRETURN();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitStackConsumer(fRETURN0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      ICONST iCONST0 = new ICONST(3);
      instConstraintVisitor0.visitICONST(iCONST0);
      assertEquals((short)6, iCONST0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LCONST lCONST0 = new LCONST(0L);
      instConstraintVisitor0.visitLCONST(lCONST0);
      assertEquals((short)9, lCONST0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      DUP2 dUP2_0 = (DUP2)InstructionConstants.DUP2;
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitStackInstruction(dUP2_0);
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
      INVOKEDYNAMIC iNVOKEDYNAMIC0 = new INVOKEDYNAMIC(1143);
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
  public void test52()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      DADD dADD0 = new DADD();
      Type type0 = dADD0.getType((ConstantPoolGen) null);
      String[] stringArray0 = new String[8];
      InstructionList instructionList0 = new InstructionList(dADD0);
      MethodGen methodGen0 = new MethodGen(0, type0, (Type[]) null, stringArray0, "The Constant at 'index' is not a ConstantClass, but '", "", instructionList0, (ConstantPoolGen) null);
      instConstraintVisitor0.setMethodGen(methodGen0);
      LRETURN lRETURN0 = new LRETURN();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitReturnInstruction(lRETURN0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      DSTORE dSTORE0 = new DSTORE(0);
      instConstraintVisitor0.visitDSTORE(dSTORE0);
      assertEquals("dstore_0", dSTORE0.getName());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      instConstraintVisitor0.visitDCONST((DCONST) null);
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
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitBREAKPOINT((BREAKPOINT) null);
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
      INVOKEVIRTUAL iNVOKEVIRTUAL0 = new INVOKEVIRTUAL(95);
      instConstraintVisitor0.visitInvokeInstruction(iNVOKEVIRTUAL0);
      assertEquals(3, iNVOKEVIRTUAL0.getLength());
  }
}
