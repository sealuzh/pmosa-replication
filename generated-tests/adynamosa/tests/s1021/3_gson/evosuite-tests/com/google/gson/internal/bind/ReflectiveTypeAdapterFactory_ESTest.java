/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 09:04:53 GMT 2019
 */

package com.google.gson.internal.bind;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReflectiveTypeAdapterFactory_ESTest extends ReflectiveTypeAdapterFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<String, ReflectiveTypeAdapterFactory.BoundField> hashMap0 = new HashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
      ReflectiveTypeAdapterFactory.Adapter<Object> reflectiveTypeAdapterFactory_Adapter0 = new ReflectiveTypeAdapterFactory.Adapter<Object>((ObjectConstructor<Object>) null, hashMap0);
      StringReader stringReader0 = new StringReader("I_|wCIH");
      JsonReader jsonReader0 = new JsonReader(stringReader0);
      try { 
        reflectiveTypeAdapterFactory_Adapter0.read(jsonReader0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $
         //
         verifyException("com.google.gson.stream.JsonReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Excluder excluder0 = Excluder.DEFAULT;
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
  public void test02()  throws Throwable  {
      Gson gson0 = new Gson();
      FieldNamingStrategy fieldNamingStrategy0 = gson0.fieldNamingStrategy();
      Excluder excluder0 = Excluder.DEFAULT;
      JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0 = new JsonAdapterAnnotationTypeAdapterFactory((ConstructorConstructor) null);
      ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory0 = new ReflectiveTypeAdapterFactory((ConstructorConstructor) null, fieldNamingStrategy0, excluder0, jsonAdapterAnnotationTypeAdapterFactory0);
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
  public void test03()  throws Throwable  {
      FieldNamingPolicy fieldNamingPolicy0 = FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES;
      Excluder excluder0 = Excluder.DEFAULT;
      JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0 = new JsonAdapterAnnotationTypeAdapterFactory((ConstructorConstructor) null);
      ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory0 = new ReflectiveTypeAdapterFactory((ConstructorConstructor) null, fieldNamingPolicy0, excluder0, jsonAdapterAnnotationTypeAdapterFactory0);
      Gson gson0 = new Gson();
      // Undeclared exception!
      try { 
        reflectiveTypeAdapterFactory0.create(gson0, (TypeToken<ReflectiveTypeAdapterFactory.BoundField>) null);
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
      FieldNamingPolicy fieldNamingPolicy0 = FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES;
      Excluder excluder0 = new Excluder();
      JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0 = new JsonAdapterAnnotationTypeAdapterFactory((ConstructorConstructor) null);
      ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory0 = new ReflectiveTypeAdapterFactory((ConstructorConstructor) null, fieldNamingPolicy0, excluder0, jsonAdapterAnnotationTypeAdapterFactory0);
      Class<String> class0 = String.class;
      TypeToken<String> typeToken0 = TypeToken.get(class0);
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
      HashMap<String, ReflectiveTypeAdapterFactory.BoundField> hashMap0 = new HashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
      ReflectiveTypeAdapterFactory.Adapter<Object> reflectiveTypeAdapterFactory_Adapter0 = new ReflectiveTypeAdapterFactory.Adapter<Object>((ObjectConstructor<Object>) null, hashMap0);
      Gson gson0 = new Gson();
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = gson0.newJsonWriter(stringWriter0);
      reflectiveTypeAdapterFactory_Adapter0.write(jsonWriter0, (Object) null);
      assertEquals("null", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FieldNamingPolicy fieldNamingPolicy0 = FieldNamingPolicy.UPPER_CAMEL_CASE;
      Excluder excluder0 = new Excluder();
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
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<ReflectiveTypeAdapterFactory.BoundField> class0 = ReflectiveTypeAdapterFactory.BoundField.class;
      ReflectiveTypeAdapterFactory.BoundField reflectiveTypeAdapterFactory_BoundField0 = gson0.fromJson((JsonElement) jsonNull0, class0);
      assertNull(reflectiveTypeAdapterFactory_BoundField0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Type> class0 = Type.class;
      // Undeclared exception!
      try { 
        gson0.fromJson("key == null", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to invoke no-args constructor for interface java.lang.reflect.Type. Register an InstanceCreator with Gson for this type may fix this problem.
         //
         verifyException("com.google.gson.internal.ConstructorConstructor$14", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0 = new JsonAdapterAnnotationTypeAdapterFactory((ConstructorConstructor) null);
      Gson gson0 = new Gson();
      String string0 = gson0.toJson((Object) jsonAdapterAnnotationTypeAdapterFactory0);
      assertEquals("{}", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FieldNamingPolicy fieldNamingPolicy0 = FieldNamingPolicy.LOWER_CASE_WITH_DASHES;
      Gson gson0 = new Gson();
      Excluder excluder0 = gson0.excluder();
      JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0 = new JsonAdapterAnnotationTypeAdapterFactory((ConstructorConstructor) null);
      ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory0 = new ReflectiveTypeAdapterFactory((ConstructorConstructor) null, fieldNamingPolicy0, excluder0, jsonAdapterAnnotationTypeAdapterFactory0);
      Class<Integer> class0 = Integer.TYPE;
      TypeToken<Integer> typeToken0 = TypeToken.get(class0);
      TypeAdapter<Integer> typeAdapter0 = reflectiveTypeAdapterFactory0.create(gson0, typeToken0);
      assertNull(typeAdapter0);
  }
}
