package com.viettel.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BeanUtil {
	/**
	   * Return a list of all fields (whatever access status, and on whatever
	   * superclass they were defined) that can be found on this class.
	   * This is like a union of {@link Class#getDeclaredFields()} which
	   * ignores and super-classes, and {@link Class#getFields()} which ignored
	   * non-public fields
	   * @param clazz The class to introspect
	   * @return The complete map of fields with name
	   */
	public static Map<String, Field> getAllFieldAsMap(Class<?> clazz) {
		Field[] fields = getAllFields(clazz);
		Map<String, Field> results = new HashMap<String, Field>();
		for (Field field : fields)
			results.put(field.getName(), field);
		
		return results;
	}
	
	/**
	   * Return a list of all fields (whatever access status, and on whatever
	   * superclass they were defined) that can be found on this class.
	   * This is like a union of {@link Class#getDeclaredFields()} which
	   * ignores and super-classes, and {@link Class#getFields()} which ignored
	   * non-public fields
	   * @param clazz The class to introspect
	   * @return The complete list of fields
	   */
	  public static Field[] getAllFields(Class<?> clazz)
	  {
	      List<Class<?>> classes = getAllSuperclasses(clazz);
	      classes.add(clazz);
	      return getAllFields(classes);
	  }
	  /**
	   * As {@link #getAllFields(Class)} but acts on a list of {@link Class}s and
	   * uses only {@link Class#getDeclaredFields()}.
	   * @param classes The list of classes to reflect on
	   * @return The complete list of fields
	   */
	  private static Field[] getAllFields(List<Class<?>> classes)
	  {
	      Set<Field> fields = new HashSet<>();
	      for (Class<?> clazz : classes)
	      {
	          fields.addAll(Arrays.asList(clazz.getDeclaredFields()));
	      }

	      return fields.toArray(new Field[fields.size()]);
	  }
	  /**
	   * Return a List of super-classes for the given class.
	   * @param clazz the class to look up
	   * @return the List of super-classes in order going up from this one
	   */
	  public static List<Class<?>> getAllSuperclasses(Class<?> clazz)
	  {
	      List<Class<?>> classes = new ArrayList<Class<?>>();

	      Class<?> superclass = clazz.getSuperclass();
	      while (superclass != null)
	      {
	          classes.add(superclass);
	          superclass = superclass.getSuperclass();
	      }

	      return classes;
	  }
}
