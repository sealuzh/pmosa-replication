/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 00:40:45 GMT 2019
 */

package com.alibaba.fastjson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.PascalNameFilter;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import com.alibaba.fastjson.util.UTF8Decoder;
import java.io.FileNotFoundException;
import java.io.PipedInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.math.RoundingMode;
import java.nio.charset.CharsetDecoder;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONArray_ESTest extends JSONArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      JSONArray jSONArray0 = new JSONArray(0);
      JSONArray jSONArray1 = jSONArray0.fluentSet(521, (Object) null);
      jSONArray1.getBoolean(377);
      // Undeclared exception!
      try { 
        jSONArray1.getFloatValue((-173));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, (String) null);
      JSONArray jSONArray0 = new JSONArray(947);
      Iterator<Object> iterator0 = jSONArray0.iterator();
      jSONArray0.add((Object) iterator0);
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        jSONArray0.toJavaList(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to int, value : java.util.ArrayList$Itr@63fcf90
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)50;
      Feature[] featureArray0 = new Feature[7];
      Feature feature0 = Feature.OrderedField;
      featureArray0[0] = feature0;
      Feature feature1 = Feature.UseBigDecimal;
      featureArray0[1] = feature1;
      Feature feature2 = Feature.UseObjectArray;
      featureArray0[2] = feature2;
      Feature feature3 = Feature.SupportArrayToBean;
      featureArray0[3] = feature3;
      Feature feature4 = Feature.DisableCircularReferenceDetect;
      featureArray0[4] = feature4;
      Feature feature5 = Feature.IgnoreNotMatch;
      featureArray0[5] = feature5;
      Feature feature6 = Feature.DisableFieldSmartMatch;
      featureArray0[6] = feature6;
      JSON.parse(byteArray0, featureArray0);
      LinkedHashSet<PipedInputStream> linkedHashSet0 = new LinkedHashSet<PipedInputStream>();
      jSONArray0.containsAll(linkedHashSet0);
      Field[] fieldArray0 = new Field[3];
      ConcurrentHashMap<String, Field> concurrentHashMap0 = new ConcurrentHashMap<String, Field>();
      ParserConfig.getFieldFromCache("1.2.46", concurrentHashMap0);
      fieldArray0[0] = null;
      ParserConfig.getFieldFromCache("yyyy-MM-dd HH:mm:ss", concurrentHashMap0);
      fieldArray0[1] = null;
      // Undeclared exception!
      try { 
        ParserConfig.getFieldFromCache("", concurrentHashMap0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      RoundingMode roundingMode0 = RoundingMode.DOWN;
      RoundingMode.values();
      jSONArray0.contains(roundingMode0);
      MockFileInputStream mockFileInputStream0 = null;
      try {
        mockFileInputStream0 = new MockFileInputStream("'*qet(=>,kd)%k? i?");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(1205);
      int int0 = 1241;
      EvoSuiteFile evoSuiteFile0 = null;
      Class<JSONObject> class0 = JSONObject.class;
      // Undeclared exception!
      try { 
        jSONArray0.getObject((-1167), class0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = null;
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "[float");
      JSONArray jSONArray0 = new JSONArray();
      int int0 = 3004;
      // Undeclared exception!
      try { 
        jSONArray0.getBigInteger(3004);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3004, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JSONArray jSONArray0 = new JSONArray(1467);
      JSONArray jSONArray1 = jSONArray0.fluentSet(1467, "1.2.46");
      JSONArray jSONArray2 = jSONArray1.fluentRemove(1467);
      // Undeclared exception!
      try { 
        jSONArray2.fluentAddAll(3089, (Collection<?>) jSONArray1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3089, Size: 1467
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      boolean boolean0 = jSONArray0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentClear();
      JSONArray jSONArray2 = new JSONArray(jSONArray1);
      jSONArray1.retainAll(jSONArray2);
      JSONArray jSONArray3 = jSONArray2.fluentAddAll((Collection<?>) jSONArray1);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      SerializeConfig serializeConfig0 = SerializeConfig.getGlobalInstance();
      SerializeFilter[] serializeFilterArray0 = new SerializeFilter[3];
      PascalNameFilter pascalNameFilter0 = new PascalNameFilter();
      serializeFilterArray0[0] = (SerializeFilter) pascalNameFilter0;
      Class<String> class0 = String.class;
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "1.2.46";
      stringArray0[2] = "yyyy-MM-dd HH:mm:ss";
      stringArray0[3] = "";
      stringArray0[4] = "yyyy-MM-dd HH:mm:ss";
      SimplePropertyPreFilter simplePropertyPreFilter0 = new SimplePropertyPreFilter(class0, stringArray0);
      serializeFilterArray0[1] = (SerializeFilter) simplePropertyPreFilter0;
      Class<String> class1 = String.class;
      SimplePropertyPreFilter simplePropertyPreFilter1 = new SimplePropertyPreFilter(class1, stringArray0);
      serializeFilterArray0[2] = (SerializeFilter) simplePropertyPreFilter1;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[1];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteBigDecimalAsPlain;
      serializerFeatureArray0[0] = serializerFeature0;
      JSON.toJSONBytes((Object) null, serializeConfig0, serializeFilterArray0, 3089, serializerFeatureArray0);
      JSONArray jSONArray4 = jSONArray3.fluentClear();
      JSONArray jSONArray5 = jSONArray4.fluentSet(3089, jSONArray3);
      boolean boolean0 = jSONArray5.isEmpty();
      assertEquals(3090, jSONArray4.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(793);
      FileSystemHandling.shouldAllThrowIOExceptions();
      jSONArray0.indexOf((Object) null);
      jSONArray0.clone();
      Class<Integer> class0 = Integer.class;
      List<Integer> list0 = jSONArray0.toJavaList(class0);
      // Undeclared exception!
      try { 
        jSONArray0.addAll(793, (Collection<?>) list0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 793, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      JSONArray jSONArray0 = new JSONArray();
      LinkedHashSet<JSONArray> linkedHashSet0 = new LinkedHashSet<JSONArray>();
      linkedHashSet0.clear();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      linkedHashSet0.add(jSONArray0);
      jSONArray0.fluentRetainAll(linkedHashSet0);
      TreeMap<String, Field> treeMap0 = new TreeMap<String, Field>();
      // Undeclared exception!
      try { 
        ParserConfig.getFieldFromCache("", treeMap0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.getJSONArray("QS=BZnBcVuw1d");
      JSONArray jSONArray1 = jSONArray0.fluentRemove((Object) null);
      jSONArray1.fluentClear();
      jSONArray0.getRelatedArray();
      jSONArray0.fluentSet(2733, (Object) null);
      assertEquals(2734, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte)63;
      byteArray0[2] = (byte) (-88);
      byteArray0[3] = (byte) (-122);
      Feature[] featureArray0 = new Feature[4];
      Feature feature0 = Feature.OrderedField;
      featureArray0[0] = feature0;
      Feature feature1 = Feature.AllowComment;
      featureArray0[1] = feature1;
      Feature feature2 = Feature.AllowArbitraryCommas;
      featureArray0[2] = feature2;
      Feature feature3 = Feature.SupportArrayToBean;
      featureArray0[3] = feature3;
      JSON.parse(byteArray0, featureArray0);
      JSONArray jSONArray1 = jSONArray0.fluentSet((-1), (Object) null);
      // Undeclared exception!
      try { 
        jSONArray0.fluentAddAll((-1), (Collection<?>) jSONArray1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = null;
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, true);
      List<Object> list0 = null;
      JSONArray jSONArray0 = new JSONArray((List<Object>) null);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)49;
      byteArray0[1] = (byte) (-28);
      byteArray0[2] = (byte)1;
      byteArray0[3] = (byte) (-40);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      jSONArray0.setRelatedArray("");
      // Undeclared exception!
      try { 
        jSONArray0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = null;
      // Undeclared exception!
      try { 
        jSONArray0.fluentSet((-1089), (Object) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSON.parseArray("");
      JSONArray jSONArray1 = jSONArray0.fluentAdd((Object) null);
      jSONArray1.listIterator();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "yyyy-MM-dd HH:mm:ss");
      int int0 = (-2051);
      // Undeclared exception!
      try { 
        jSONArray0.get((-2051));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedList<JSONObject> linkedList0 = new LinkedList<JSONObject>();
      JSONArray jSONArray1 = jSONArray0.fluentRemoveAll(linkedList0);
      JSONArray jSONArray2 = jSONArray1.fluentRetainAll(linkedList0);
      ConcurrentSkipListMap<String, Object> concurrentSkipListMap0 = new ConcurrentSkipListMap<String, Object>();
      JSONObject jSONObject0 = new JSONObject(concurrentSkipListMap0);
      JSONObject jSONObject1 = jSONObject0.fluentPutAll(concurrentSkipListMap0);
      JSONObject jSONObject2 = jSONObject1.fluentClear();
      JSONArray jSONArray3 = jSONArray2.fluentRemove((Object) jSONObject2);
      JSONArray jSONArray4 = jSONArray3.fluentClear();
      JSONArray jSONArray5 = jSONArray4.fluentAddAll((Collection<?>) jSONArray1);
      jSONArray5.setRelatedArray((Object) null);
      assertSame(jSONArray1, jSONArray5);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      JSONArray jSONArray0 = new JSONArray(188);
      int int0 = 2389;
      // Undeclared exception!
      try { 
        jSONArray0.add(2389, (Object) "writeDirect");
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2389, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(3191);
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      JSONArray jSONArray2 = jSONArray1.fluentClear();
      JSONArray jSONArray3 = jSONArray2.fluentSet(37, (Object) null);
      // Undeclared exception!
      try { 
        jSONArray3.fluentRemove((-2005));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      JSONArray jSONArray2 = jSONArray0.fluentRemoveAll(jSONArray1);
      jSONArray2.fluentRemoveAll(jSONArray0);
      Feature[] featureArray0 = new Feature[3];
      Feature feature0 = Feature.DisableASM;
      featureArray0[0] = feature0;
      Feature feature1 = Feature.DisableFieldSmartMatch;
      JSON.DEFAULT_TYPE_KEY = "";
      featureArray0[1] = feature1;
      Feature feature2 = Feature.DisableSpecialKeyDetect;
      // Undeclared exception!
      try { 
        jSONArray2.listIterator(3555);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3555
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "yyyy-MM-dd HH:mm:ss";
      SimplePropertyPreFilter simplePropertyPreFilter0 = new SimplePropertyPreFilter(stringArray0);
      simplePropertyPreFilter0.getClazz();
      jSONArray0.setComponentType((Type) null);
      stringArray0[1] = "1.2.46";
      stringArray0[2] = "yyyy-MM-dd HH:mm:ss";
      stringArray0[3] = "";
      stringArray0[4] = "yyyy-MM-dd HH:mm:ss";
      jSONArray0.toArray(stringArray0);
      // Undeclared exception!
      try { 
        jSONArray0.getLongValue((-910));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentRemove((Object) null);
      // Undeclared exception!
      try { 
        jSONArray1.getByte(37);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 37, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)50;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-26);
      byteArray0[3] = (byte)99;
      byteArray0[4] = (byte)49;
      byteArray0[5] = (byte) (-26);
      byteArray0[6] = (byte)37;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      JSONArray jSONArray0 = new JSONArray();
      JSON.DEFAULT_GENERATE_FEATURE = (int) (byte)37;
      // Undeclared exception!
      try { 
        jSONArray0.getSqlDate((-1954));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getDate((-3325));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      ParserConfig parserConfig0 = new ParserConfig();
      JSONArray jSONArray1 = (JSONArray)JSON.toJSON((Object) jSONArray0, parserConfig0);
      JSONArray jSONArray2 = jSONArray0.fluentSet(4379, jSONArray1);
      JSONArray jSONArray3 = jSONArray2.fluentAddAll(3588, (Collection<?>) jSONArray0);
      Integer integer0 = new Integer(3089);
      JSONArray jSONArray4 = jSONArray3.fluentAdd(3588, (Object) integer0);
      JSONArray jSONArray5 = jSONArray4.fluentAddAll((Collection<?>) jSONArray3);
      jSONArray5.getInteger(3588);
      assertEquals(17522, jSONArray1.size());
      assertEquals(17522, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, (String) null);
      JSONArray jSONArray0 = new JSONArray(1213);
      Class<JSONArray> class0 = JSONArray.class;
      List<JSONArray> list0 = jSONArray0.toJavaList(class0);
      JSONArray jSONArray1 = jSONArray0.fluentRemoveAll(list0);
      // Undeclared exception!
      try { 
        jSONArray1.getByteValue((-632));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentSet(2467, (Object) null);
      JSONArray jSONArray2 = new JSONArray(jSONArray1);
      jSONArray2.fluentSet(3588, jSONArray0);
      // Undeclared exception!
      try { 
        MockURI.URI((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URI$Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      int int0 = 2;
      JSONArray jSONArray0 = new JSONArray(2);
      // Undeclared exception!
      try { 
        jSONArray0.getTimestamp(2);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(1814);
      JSONArray jSONArray1 = jSONArray0.fluentClear();
      JSONArray jSONArray2 = new JSONArray(jSONArray1);
      jSONArray2.fluentRemoveAll(jSONArray0);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-122);
      byteArray0[1] = (byte)36;
      byteArray0[2] = (byte) (-108);
      byteArray0[3] = (byte)26;
      byteArray0[4] = (byte)15;
      byteArray0[5] = (byte)23;
      byteArray0[6] = (byte)1;
      byteArray0[7] = (byte) (-21);
      byteArray0[8] = (byte)17;
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      // Undeclared exception!
      try { 
        JSON.parse(byteArray0, 1232, (-3407), (CharsetDecoder) uTF8Decoder0, (-181));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = 180;
      JSONArray jSONArray0 = new JSONArray(180);
      JSONArray jSONArray1 = jSONArray0.fluentClear();
      jSONArray1.fluentAddAll((Collection<?>) jSONArray0);
      String string0 = "";
      ParserConfig.getGlobalInstance();
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        JSON.parseObject("yyyy-MM-dd HH:mm:ss", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect {, actual error, pos 0, fastjson-version 1.2.46
         //
         verifyException("com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "yyyy-MM-dd HH:mm:ss";
      stringArray0[1] = "1.2.46";
      stringArray0[2] = "yyyy-MM-dd HH:mm:ss";
      stringArray0[3] = "";
      stringArray0[4] = "yyyy-MM-dd HH:mm:ss";
      String[] stringArray1 = jSONArray0.toArray(stringArray0);
      assertSame(stringArray1, stringArray0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int int0 = 18;
      JSONArray jSONArray0 = new JSONArray(18);
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      linkedHashSet0.add((Integer) 3089);
      linkedHashSet0.add((Integer) 3089);
      // Undeclared exception!
      try { 
        jSONArray0.addAll(18, (Collection<?>) linkedHashSet0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 18, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      int int0 = 24180;
      // Undeclared exception!
      try { 
        jSONArray0.fluentRemove(24180);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 24180, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(1223);
      jSONArray0.clone();
      // Undeclared exception!
      try { 
        jSONArray0.getLong(1223);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1223, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int int0 = 3588;
      JSONArray jSONArray0 = new JSONArray(3588);
      JSONArray jSONArray1 = jSONArray0.fluentClear();
      jSONArray1.fluentRetainAll(jSONArray0);
      JSONArray jSONArray2 = jSONArray1.fluentClear();
      JSON.DEFAULT_GENERATE_FEATURE = 3588;
      SerializeConfig serializeConfig0 = new SerializeConfig();
      // Undeclared exception!
      try { 
        JSON.toJSONBytes((Object) jSONArray2, serializeConfig0, 32, (SerializerFeature[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.SerializeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      int int0 = (-747);
      // Undeclared exception!
      try { 
        jSONArray0.subList(1, 3160);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // toIndex = 3160
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray((List<Object>) null);
      JSONArray jSONArray1 = new JSONArray();
      jSONArray1.retainAll(jSONArray0);
      Class<String> class0 = String.class;
      String string0 = JSON.toJavaObject((JSON) jSONArray1, class0);
      // Undeclared exception!
      try { 
        jSONArray0.fluentAdd((Object) string0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.clear();
      int int0 = (-891);
      jSONArray0.getComponentType();
      // Undeclared exception!
      try { 
        JSON.parseObject("6AVFa2)(jPb_H/8w", (Type) null, 3089, (Feature[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSON", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      JSONArray jSONArray1 = jSONArray0.fluentSet(1249, "u6O");
      // Undeclared exception!
      try { 
        jSONArray1.getShort(3089);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3089, Size: 1250
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(2472);
      JSONScanner jSONScanner0 = new JSONScanner("yyyy-MM-dd HH:mm:ss");
      Class<Object> class0 = Object.class;
      Collection<String> collection0 = jSONScanner0.newCollectionByType(class0);
      JSONArray jSONArray1 = jSONArray0.fluentRetainAll(collection0);
      // Undeclared exception!
      try { 
        jSONArray1.getJSONArray((-841));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      int int0 = 991;
      jSONArray0.iterator();
      jSONArray0.clear();
      // Undeclared exception!
      try { 
        jSONArray0.getDouble(991);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 991, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      int int0 = 233;
      JSONArray jSONArray0 = new JSONArray(233);
      jSONArray0.clone();
      // Undeclared exception!
      try { 
        jSONArray0.getBigDecimal(233);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 233, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      int int0 = 0;
      JSONArray jSONArray0 = new JSONArray(0);
      // Undeclared exception!
      try { 
        jSONArray0.getFloat(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(2796);
      assertEquals(989, JSON.DEFAULT_PARSER_FEATURE);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSONArray jSONArray0 = null;
      try {
        jSONArray0 = new JSONArray((-959));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -959
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Class<Object> class0 = Object.class;
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "\",V(";
      stringArray0[3] = "7y#x,ZF";
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0, stringArray0);
      List<Object> list0 = javaBeanSerializer0.getFieldValues("");
      JSONArray jSONArray0 = new JSONArray(list0);
      int int0 = 478;
      // Undeclared exception!
      try { 
        jSONArray0.fluentAddAll(478, (Collection<?>) list0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 478, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      JSONArray jSONArray0 = new JSONArray();
      Integer integer0 = new Integer(1);
      JSONArray jSONArray1 = jSONArray0.fluentAdd((Object) integer0);
      JSONArray jSONArray2 = jSONArray1.fluentSet(3089, integer0);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "1.2.46");
      jSONArray1.getByteValue(1);
      Feature[] featureArray0 = new Feature[6];
      Feature feature0 = Feature.AutoCloseSource;
      featureArray0[0] = feature0;
      Feature feature1 = Feature.AllowArbitraryCommas;
      featureArray0[1] = feature1;
      Feature feature2 = Feature.CustomMapDeserializer;
      featureArray0[2] = feature2;
      Feature feature3 = Feature.AllowArbitraryCommas;
      featureArray0[3] = feature3;
      Feature feature4 = Feature.AllowSingleQuotes;
      featureArray0[4] = feature4;
      Feature feature5 = Feature.AllowISO8601DateFormat;
      featureArray0[5] = feature5;
      jSONArray2.getBooleanValue(3089);
      JSONArray jSONArray3 = jSONArray0.fluentAddAll(37, (Collection<?>) jSONArray2);
      jSONArray1.getString(37);
      JSONArray jSONArray4 = jSONArray0.fluentRemove((Object) jSONArray2);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)2;
      byteArray0[2] = (byte)0;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      jSONArray4.getShortValue(3585);
      jSONArray1.addAll((Collection<?>) jSONArray3);
      jSONArray1.getDouble(3089);
      // Undeclared exception!
      jSONArray1.fluentRemoveAll(jSONArray2);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      // Undeclared exception!
      try { 
        jSONArray0.fluentAdd(1, (Object) linkedList0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      int int0 = (-2748);
      JSONArray jSONArray0 = null;
      try {
        jSONArray0 = new JSONArray((-2748));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -2748
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String string0 = "r|";
      // Undeclared exception!
      try { 
        JSON.parseArray("r|");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect [, actual error, pos 0, fieldName null
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }
}
