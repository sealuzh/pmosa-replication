/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 20:46:03 GMT 2019
 */

package com.google.gson.internal.bind;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.InstanceCreator;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReflectiveTypeAdapterFactory_ESTest extends ReflectiveTypeAdapterFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<String, ReflectiveTypeAdapterFactory.BoundField> hashMap0 = new HashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
      ReflectiveTypeAdapterFactory.Adapter<String> reflectiveTypeAdapterFactory_Adapter0 = new ReflectiveTypeAdapterFactory.Adapter<String>((ObjectConstructor<String>) null, hashMap0);
      MockFile mockFile0 = new MockFile("com.google.gson.Gson$4");
      MockFileWriter mockFileWriter0 = new MockFileWriter(mockFile0);
      JsonWriter jsonWriter0 = new JsonWriter(mockFileWriter0);
      reflectiveTypeAdapterFactory_Adapter0.write(jsonWriter0, "");
      assertFalse(jsonWriter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<String, ReflectiveTypeAdapterFactory.BoundField> hashMap0 = new HashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
      ReflectiveTypeAdapterFactory.Adapter<Object> reflectiveTypeAdapterFactory_Adapter0 = new ReflectiveTypeAdapterFactory.Adapter<Object>((ObjectConstructor<Object>) null, hashMap0);
      // Undeclared exception!
      try { 
        reflectiveTypeAdapterFactory_Adapter0.read((JsonReader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
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
  public void test03()  throws Throwable  {
      FieldNamingPolicy fieldNamingPolicy0 = FieldNamingPolicy.UPPER_CAMEL_CASE;
      Excluder excluder0 = Excluder.DEFAULT;
      JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0 = new JsonAdapterAnnotationTypeAdapterFactory((ConstructorConstructor) null);
      ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory0 = new ReflectiveTypeAdapterFactory((ConstructorConstructor) null, fieldNamingPolicy0, excluder0, jsonAdapterAnnotationTypeAdapterFactory0);
      // Undeclared exception!
      try { 
        reflectiveTypeAdapterFactory0.excludeField((Field) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FieldNamingPolicy fieldNamingPolicy0 = FieldNamingPolicy.UPPER_CAMEL_CASE;
      Excluder excluder0 = new Excluder();
      Class<Integer> class0 = Integer.class;
      TypeToken<Integer> typeToken0 = TypeToken.get(class0);
      ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory0 = new ReflectiveTypeAdapterFactory((ConstructorConstructor) null, fieldNamingPolicy0, excluder0, (JsonAdapterAnnotationTypeAdapterFactory) null);
      // Undeclared exception!
      try { 
        reflectiveTypeAdapterFactory0.create((Gson) null, typeToken0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        ReflectiveTypeAdapterFactory.excludeField((Field) null, true, (Excluder) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FieldNamingPolicy fieldNamingPolicy0 = FieldNamingPolicy.LOWER_CASE_WITH_DASHES;
      Excluder excluder0 = Excluder.DEFAULT;
      JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0 = new JsonAdapterAnnotationTypeAdapterFactory((ConstructorConstructor) null);
      ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory0 = new ReflectiveTypeAdapterFactory((ConstructorConstructor) null, fieldNamingPolicy0, excluder0, jsonAdapterAnnotationTypeAdapterFactory0);
      Gson gson0 = new Gson();
      // Undeclared exception!
      try { 
        reflectiveTypeAdapterFactory0.create(gson0, (TypeToken<InstanceCreator<ReflectiveTypeAdapterFactory.BoundField>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FieldNamingPolicy fieldNamingPolicy0 = FieldNamingPolicy.UPPER_CAMEL_CASE;
      Excluder excluder0 = Excluder.DEFAULT;
      JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0 = new JsonAdapterAnnotationTypeAdapterFactory((ConstructorConstructor) null);
      ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory0 = new ReflectiveTypeAdapterFactory((ConstructorConstructor) null, fieldNamingPolicy0, excluder0, jsonAdapterAnnotationTypeAdapterFactory0);
      // Undeclared exception!
      try { 
        reflectiveTypeAdapterFactory0.excludeField((Field) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, ReflectiveTypeAdapterFactory.BoundField> hashMap0 = new HashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
      ReflectiveTypeAdapterFactory.Adapter<Object> reflectiveTypeAdapterFactory_Adapter0 = new ReflectiveTypeAdapterFactory.Adapter<Object>((ObjectConstructor<Object>) null, hashMap0);
      String string0 = reflectiveTypeAdapterFactory_Adapter0.toJson((Object) null);
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<String, ReflectiveTypeAdapterFactory.BoundField> hashMap0 = new HashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
      ReflectiveTypeAdapterFactory.Adapter<Object> reflectiveTypeAdapterFactory_Adapter0 = new ReflectiveTypeAdapterFactory.Adapter<Object>((ObjectConstructor<Object>) null, hashMap0);
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Object object0 = reflectiveTypeAdapterFactory_Adapter0.fromJsonTree(jsonNull0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<String, ReflectiveTypeAdapterFactory.BoundField> hashMap0 = new HashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
      ReflectiveTypeAdapterFactory.Adapter<Object> reflectiveTypeAdapterFactory_Adapter0 = new ReflectiveTypeAdapterFactory.Adapter<Object>((ObjectConstructor<Object>) null, hashMap0);
      // Undeclared exception!
      try { 
        reflectiveTypeAdapterFactory_Adapter0.fromJson("6");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Gson gson0 = new Gson();
      FieldNamingStrategy fieldNamingStrategy0 = gson0.fieldNamingStrategy();
      JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0 = new JsonAdapterAnnotationTypeAdapterFactory((ConstructorConstructor) null);
      ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory0 = new ReflectiveTypeAdapterFactory((ConstructorConstructor) null, fieldNamingStrategy0, (Excluder) null, jsonAdapterAnnotationTypeAdapterFactory0);
      Class<Integer> class0 = Integer.TYPE;
      TypeToken<Integer> typeToken0 = TypeToken.get(class0);
      TypeAdapter<Integer> typeAdapter0 = reflectiveTypeAdapterFactory0.create(gson0, typeToken0);
      assertNull(typeAdapter0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<String> class0 = String.class;
      TypeToken<String> typeToken0 = TypeToken.get(class0);
      Gson gson0 = new Gson();
      TypeAdapter<String> typeAdapter0 = gson0.getDelegateAdapter((TypeAdapterFactory) null, typeToken0);
      JsonElement jsonElement0 = gson0.toJsonTree((Object) typeAdapter0);
      assertTrue(jsonElement0.isJsonObject());
  }
}