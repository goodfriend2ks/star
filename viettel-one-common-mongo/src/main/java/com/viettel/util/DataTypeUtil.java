package com.viettel.util;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.fasterxml.uuid.Generators;
import com.fasterxml.uuid.UUIDComparator;
import com.fasterxml.uuid.impl.TimeBasedGenerator;

public class DataTypeUtil
{
	private static TimeBasedGenerator timeUuid = Generators.timeBasedGenerator();
	
	public static String[] DATE_PATTERNS = new String[] {
		"d/MM/yyyy", "dd/MM/yyyy", "dd/MM/yy", "d/MM/yy",
		"d/M/yyyy", "dd/M/yyyy", "dd/M/yy", "d/M/yy",
		"d.MM.yyyy", "dd.MM.yyyy", "dd.MM.yy", "d.MM.yy",
		"d.M.yyyy", "dd.M.yyyy", "dd.M.yy", "d.M.yy"
	};
	
	private static List<SimpleDateFormat> dateFormats = DataTypeUtil.getDateFormats();
	
	private static List<SimpleDateFormat> getDateFormats() {
		List<SimpleDateFormat> formats = new ArrayList<>();
		
		for (String pattern : DATE_PATTERNS) {
			formats.add(new SimpleDateFormat(pattern));
		}
		
		return formats;
	}
	
	public static <T> boolean isEmpty(Class<T> clazz, Object value)
	{
		if (value == null)
			return true;
		
		if (Integer.class.isAssignableFrom(clazz))
		{
			Integer newId = fromObject(Integer.class, value);
			return newId == null || newId.intValue() == 0;
		}
		
		if (Long.class.isAssignableFrom(clazz))
		{
			Long newId = fromObject(Long.class, value);
			return newId == null || newId.longValue() == 0;
		}
		
		if (Double.class.isAssignableFrom(clazz))
		{
			Double newId = fromObject(Double.class, value);
			return newId == null || newId.doubleValue() == 0d;
		}
		
		if (Float.class.isAssignableFrom(clazz))
		{
			Float newId = fromObject(Float.class, value);
			return newId == null || newId.floatValue() == 0f;
		}
		
		if (BigDecimal.class.isAssignableFrom(clazz))
		{
			BigDecimal newId = fromObject(BigDecimal.class, value);
			return newId == null || newId.signum() == 0 || newId.longValue() == 0;
		}
		
		if (String.class.isAssignableFrom(clazz))
		{
			String newId = fromObject(String.class, value);
			return newId == null || newId.length() == 0;
		}
		
		if (UUID.class.isAssignableFrom(clazz))
		{
			UUID newId = fromObject(UUID.class, value);
			return newId == null; // || UUIDComparator.staticCompare(newId, EO.ROOT_ID_VALUE) == 0;
		}
		
		if (Date.class.isAssignableFrom(clazz))
		{
			Date newId = fromObject(Date.class, value);
			return newId == null;
		}
		
		return value == null;
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T newValue(Class<T> clazz)
	{
		if (Integer.class.isAssignableFrom(clazz))
			return (T)(new Integer(0));
		
		if (Long.class.isAssignableFrom(clazz))
			return (T)(new Long(0));
		
		if (Double.class.isAssignableFrom(clazz))
			return (T)(new Double(0d));
		
		if (Float.class.isAssignableFrom(clazz))
			return (T)(new Float(0f));
		
		if (BigDecimal.class.isAssignableFrom(clazz))
			return (T)(new BigDecimal(0));
		
		if (UUID.class.isAssignableFrom(clazz))
			return (T)timeUuid.generate();
			//return (PK)UUID.randomUUID();
		
		return null;
	}
	
	public static <T> T fromObject(Class<T> clazz, Object value) {
		return fromObject(clazz, value, null);
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T fromObject(Class<T> clazz, Object value, T defaultValue) {
		if (value == null)
			return defaultValue;
		
		if (String.class.isAssignableFrom(clazz))
		{
			return (T)(value.toString());
		}
		
		if (Boolean.class.isAssignableFrom(clazz)) {
			Boolean newValue = false;
			if (value instanceof Integer)
				newValue = ((Integer)value).intValue() != 0;
			else
			{
				String sValue = value.toString();
				newValue = sValue.equalsIgnoreCase("y") || sValue.equalsIgnoreCase("true");
			}
			
			return (T)newValue;
		}
		
		if (Integer.class.isAssignableFrom(clazz))
		{
			Integer newValue = 0;
			if (value instanceof Integer)
				newValue = ((Integer)value);
			else if (value instanceof Long)
				newValue = ((Long)value).intValue();
			else if (value instanceof Double)
				newValue = ((Double)value).intValue();
			else if (value instanceof Float)
				newValue = ((Float)value).intValue();
			else if (value instanceof BigDecimal)
				newValue = ((BigDecimal)value).intValue();
			else
			{
				try {
					newValue = Integer.parseInt(value.toString());
				} catch (Exception e) {
					return defaultValue;
				}
			}
			
			return (T)newValue;
		}
		
		if (Long.class.isAssignableFrom(clazz))
		{
			Long newValue = 0l;
			if (value instanceof Integer)
				newValue = ((Integer)value).longValue();
			else if (value instanceof Long)
				newValue = ((Long)value);
			else if (value instanceof Double)
				newValue = ((Double)value).longValue();
			else if (value instanceof Float)
				newValue = ((Float)value).longValue();
			else if (value instanceof BigDecimal)
				newValue = ((BigDecimal)value).longValue();
			else
			{
				try {
					newValue = Long.parseLong(value.toString());
				} catch (Exception e) {
					return defaultValue;
				}
			}
			
			return (T)newValue;
		}
		
		if (Double.class.isAssignableFrom(clazz))
		{
			Double newValue = 0d;
			if (value instanceof Integer)
				newValue = ((Integer)value).doubleValue();
			else if (value instanceof Long)
				newValue = ((Long)value).doubleValue();
			else if (value instanceof Double)
				newValue = ((Double)value);
			else if (value instanceof Float)
				newValue = ((Float)value).doubleValue();
			else if (value instanceof BigDecimal)
				newValue = ((BigDecimal)value).doubleValue();
			else
			{
				try {
					newValue = Double.parseDouble(value.toString());
				} catch (Exception e) {
					return defaultValue;
				}
			}
			
			return (T)newValue;
		}
		
		if (Float.class.isAssignableFrom(clazz))
		{
			Float newValue = 0f;
			if (value instanceof Integer)
				newValue = ((Integer)value).floatValue();
			else if (value instanceof Long)
				newValue = ((Long)value).floatValue();
			else if (value instanceof Double)
				newValue = ((Double)value).floatValue();
			else if (value instanceof Float)
				newValue = ((Float)value);
			else if (value instanceof BigDecimal)
				newValue = ((BigDecimal)value).floatValue();
			else
			{
				try {
					newValue = Float.parseFloat(value.toString());
				} catch (Exception e) {
					return defaultValue;
				}
			}
			
			return (T)newValue;
		}
		
		if (BigDecimal.class.isAssignableFrom(clazz))
		{
			BigDecimal newValue = null;
			if (value instanceof Integer)
				newValue = new BigDecimal((Integer)value);
			else if (value instanceof Long)
				newValue = new BigDecimal((Long)value);
			else if (value instanceof Double)
				newValue = new BigDecimal((Double)value);
			else if (value instanceof Float)
				newValue = new BigDecimal((Float)value);
			else if (value instanceof BigDecimal)
				newValue = (BigDecimal)value;
			else
			{
				try {
					newValue = new BigDecimal(value.toString());
				} catch (Exception e) {
					return defaultValue;
				}
			}
			
			return (T)newValue;
		}
		
		if (UUID.class.isAssignableFrom(clazz))
		{
			UUID newValue = null;
			if (value instanceof UUID) {
				newValue = (UUID)value;
			} else {
				try {
					newValue = UUID.fromString(value.toString());
				} catch (Exception e) {
					return defaultValue;
				}
			}
			
			return (T)newValue;
		}
		
		if (Date.class.isAssignableFrom(clazz))
		{
			Date newValue = null;
			if (value instanceof Date)
				newValue = (Date)value;
			if (value instanceof Integer)
				newValue = new Date(((Integer)value).longValue());
			else if (value instanceof Long)
				newValue = new Date(((Long)value).longValue());
			else if (value instanceof Double)
				newValue = new Date(((Double)value).longValue());
			else if (value instanceof Float)
				newValue = new Date(((Float)value).longValue());
			else if (value instanceof BigDecimal)
				newValue = new Date(((BigDecimal)value).longValue());
			else {
				String sValue = value.toString().trim();
				for (SimpleDateFormat sdf : dateFormats) {
					try {
						newValue = sdf.parse(sValue);
						if (newValue != null)
							break;
					} catch (ParseException e) {}
				}
				
				if (newValue == null) {
					return defaultValue;
				}
			}
			
			return (T)newValue;
		}
		
		return null;
	}
	
	public static <T> int compare(Class<T> clazz, T firstId, T secondId)
	{
		if (firstId == null && secondId == null)
			return 0;
		if (firstId == null && secondId != null)
			return -1;
		if (firstId != null && secondId == null)
			return 1;
		
		if (Integer.class.isAssignableFrom(clazz))
		{
			Integer newFirstId = (Integer)firstId;
			Integer newSecondId = (Integer)secondId;
			return newFirstId.compareTo(newSecondId);
		}
		
		if (Long.class.isAssignableFrom(clazz))
		{
			Long newFirstId = (Long)firstId;
			Long newSecondId = (Long)secondId;
			return newFirstId.compareTo(newSecondId);
		}
		
		if (Double.class.isAssignableFrom(clazz))
		{
			Double newFirstId = (Double)firstId;
			Double newSecondId = (Double)secondId;
			return newFirstId.compareTo(newSecondId);
		}
		
		if (Float.class.isAssignableFrom(clazz))
		{
			Float newFirstId = (Float)firstId;
			Float newSecondId = (Float)secondId;
			return newFirstId.compareTo(newSecondId);
		}
		
		if (clazz.isAssignableFrom(BigDecimal.class))
		{
			BigDecimal newFirstId = (BigDecimal)firstId;
			BigDecimal newSecondId = (BigDecimal)secondId;
			
			return newFirstId.compareTo(newSecondId);
		}
		
		if (clazz.isAssignableFrom(String.class))
		{
			String newFirstId = (String)firstId;
			String newSecondId = (String)secondId;
			
			return newFirstId.compareTo(newSecondId);
		}
		
		if (clazz.isAssignableFrom(UUID.class))
		{
			UUID newFirstId = (UUID)firstId;
			UUID newSecondId = (UUID)secondId;
			
			//return newFirstId.compareTo(newSecondId);
			return UUIDComparator.staticCompare(newFirstId, newSecondId);
		}
		
		return 0;
	}
	
	public static <T> int genericCompare(Class<T> clazz, Object firstId, Object secondId) {
		T firstValue = fromObject(clazz, firstId);
		T secondValue = fromObject(clazz, secondId);
		return compare(clazz, firstValue, secondValue);
	}
}
