/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 07:31:20 GMT 2019
 */

package com.google.gson.internal.bind;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReflectiveTypeAdapterFactory_ESTest extends ReflectiveTypeAdapterFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Excluder excluder0 = new Excluder();
      // Undeclared exception!
      try { 
        ReflectiveTypeAdapterFactory.excludeField((Field) null, false, excluder0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FieldNamingPolicy fieldNamingPolicy0 = FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES;
      Excluder excluder0 = new Excluder();
      JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0 = new JsonAdapterAnnotationTypeAdapterFactory((ConstructorConstructor) null);
      ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory0 = new ReflectiveTypeAdapterFactory((ConstructorConstructor) null, fieldNamingPolicy0, excluder0, jsonAdapterAnnotationTypeAdapterFactory0);
      Gson gson0 = new Gson();
      Class<ReflectiveTypeAdapterFactory.BoundField> class0 = ReflectiveTypeAdapterFactory.BoundField.class;
      TypeToken<ReflectiveTypeAdapterFactory.BoundField> typeToken0 = TypeToken.get(class0);
      // Undeclared exception!
      try { 
        reflectiveTypeAdapterFactory0.create(gson0, typeToken0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashMap<String, ReflectiveTypeAdapterFactory.BoundField> hashMap0 = new HashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
      ReflectiveTypeAdapterFactory.Adapter<ReflectiveTypeAdapterFactory.BoundField> reflectiveTypeAdapterFactory_Adapter0 = new ReflectiveTypeAdapterFactory.Adapter<ReflectiveTypeAdapterFactory.BoundField>((ObjectConstructor<ReflectiveTypeAdapterFactory.BoundField>) null, hashMap0);
      Gson gson0 = new Gson();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("\"");
      JsonWriter jsonWriter0 = gson0.newJsonWriter(mockPrintWriter0);
      reflectiveTypeAdapterFactory_Adapter0.write(jsonWriter0, (ReflectiveTypeAdapterFactory.BoundField) null);
      assertFalse(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HashMap<String, ReflectiveTypeAdapterFactory.BoundField> hashMap0 = new HashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
      ReflectiveTypeAdapterFactory.Adapter<Object> reflectiveTypeAdapterFactory_Adapter0 = new ReflectiveTypeAdapterFactory.Adapter<Object>((ObjectConstructor<Object>) null, hashMap0);
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null);
      Object object0 = reflectiveTypeAdapterFactory_Adapter0.fromJsonTree(jsonElement0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HashMap<String, ReflectiveTypeAdapterFactory.BoundField> hashMap0 = new HashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
      ReflectiveTypeAdapterFactory.Adapter<Integer> reflectiveTypeAdapterFactory_Adapter0 = new ReflectiveTypeAdapterFactory.Adapter<Integer>((ObjectConstructor<Integer>) null, hashMap0);
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        reflectiveTypeAdapterFactory_Adapter0.fromJsonTree(jsonArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HashMap<String, ReflectiveTypeAdapterFactory.BoundField> hashMap0 = new HashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
      ReflectiveTypeAdapterFactory.Adapter<ReflectiveTypeAdapterFactory.BoundField> reflectiveTypeAdapterFactory_Adapter0 = new ReflectiveTypeAdapterFactory.Adapter<ReflectiveTypeAdapterFactory.BoundField>((ObjectConstructor<ReflectiveTypeAdapterFactory.BoundField>) null, hashMap0);
      Gson gson0 = new Gson();
      String string0 = gson0.toJson((Object) reflectiveTypeAdapterFactory_Adapter0);
      assertEquals("{\"boundFields\":{}}", string0);
  }
}