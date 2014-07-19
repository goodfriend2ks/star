package javax.persistence.criteria;

import java.util.Collection;
import java.util.regex.Pattern;

public interface GenericCriteria {
	
	public String getKey();
	
	/**
	 * Static factory method to create a GenericCriteria using the provided key
	 * 
	 * @return
	 */
	public GenericCriteria and(String key);
	
	/**
	 * Creates a criterion using equality
	 * 
	 * @param o
	 * @return
	 */
	public GenericCriteria is(Object o);
	
	/**
	 * Creates a criterion using the {@literal $ne} operator.
	 * 
	 * @param o
	 * @return
	 */
	public GenericCriteria ne(Object o);
	
	/**
	 * Creates a criterion using the {@literal $lt} operator.
	 * 
	 * @param o
	 * @return
	 */
	public GenericCriteria lt(Object o);
	
	/**
	 * Creates a criterion using the {@literal $lte} operator.
	 * 
	 * @param o
	 * @return
	 */
	public GenericCriteria lte(Object o);
	
	/**
	 * Creates a criterion using the {@literal $gt} operator.
	 * 
	 * @param o
	 * @return
	 */
	public GenericCriteria gt(Object o);
	
	/**
	 * Creates a criterion using the {@literal $gte} operator.
	 * 
	 * @param o
	 * @return
	 */
	public GenericCriteria gte(Object o);
	
	/**
	 * Creates a criterion using the {@literal $in} operator.
	 * 
	 * @param o the values to match against
	 * @return
	 */
	public GenericCriteria in(Object... o);
	
	/**
	 * Creates a criterion using the {@literal $in} operator.
	 * 
	 * @param c the collection containing the values to match against
	 * @return
	 */
	public GenericCriteria in(Collection<?> c);
	
	/**
	 * Creates a criterion using the {@literal $nin} operator.
	 * 
	 * @param o
	 * @return
	 */
	public GenericCriteria nin(Object... o);
	
	/**
	 * Creates a criterion using the {@literal $nin} operator.
	 * 
	 * @param o
	 * @return
	 */
	public GenericCriteria nin(Collection<?> o);
	
	/**
	 * Creates a criterion using the {@literal $mod} operator.
	 * 
	 * @param value
	 * @param remainder
	 * @return
	 */
	public GenericCriteria mod(Number value, Number remainder);
	
	/**
	 * Creates a criterion using the {@literal $all} operator.
	 * 
	 * @param o
	 * @return
	 */
	public GenericCriteria all(Object... o);
	
	/**
	 * Creates a criterion using the {@literal $all} operator.
	 * 
	 * @param o
	 * @return
	 */
	public GenericCriteria all(Collection<?> o);
	
	/**
	 * Creates a criterion using the {@literal $size} operator.
	 * 
	 * @param s
	 * @return
	 */
	public GenericCriteria size(int s);
	
	/**
	 * Creates a criterion using the {@literal $exists} operator.
	 * 
	 * @param b
	 * @return
	 */
	public GenericCriteria exists(boolean b);
	
	/**
	 * Creates a criterion using the {@literal $type} operator.
	 * 
	 * @param t
	 * @return
	 */
	public GenericCriteria type(int t);
	
	/**
	 * Creates a criterion using the {@literal $not} meta operator which affects the clause directly following
	 * 
	 * @return
	 */
	public GenericCriteria not();
	
	/**
	 * Creates a criterion using the {@literal $not} operator.
	 * 
	 * @param value
	 * @return
	 */
	public GenericCriteria not(Object value);
	
	/**
	 * Creates a criterion using a {@literal $regex} operator.
	 * 
	 * @param re
	 * @return
	 */
	public GenericCriteria regex(String re);
	
	/**
	 * Creates a criterion using a {@literal $regex} and {@literal $options} operator.
	 * 
	 * @param re
	 * @param options
	 * @return
	 */
	public GenericCriteria regex(String re, String options);
	
	/**
	 * Syntactical sugar for {@link #is(Object)} making obvious that we create a regex predicate.
	 * 
	 * @param pattern
	 * @return
	 */
	public GenericCriteria regex(Pattern pattern);
	
	/**
	 * Creates an 'or' GenericCriteria using the $or operator for all of the provided criteria
	 * <p>
	 * Note that mongodb doesn't support an $or operator to be wrapped in a $not operator.
	 * <p>
	 * 
	 * @throws IllegalArgumentException if {@link #orOperator(GenericCriteria...)} follows a not() call directly.
	 * @param criteria
	 */
	public GenericCriteria orOperator(GenericCriteria... criteria);
	
	/**
	 * Creates a 'nor' GenericCriteria using the $nor operator for all of the provided criteria.
	 * <p>
	 * Note that mongodb doesn't support an $nor operator to be wrapped in a $not operator.
	 * <p>
	 * 
	 * @throws IllegalArgumentException if {@link #norOperator(GenericCriteria...)} follows a not() call directly.
	 * @param criteria
	 */
	public GenericCriteria norOperator(GenericCriteria... criteria);
	
	/**
	 * Creates an 'and' GenericCriteria using the $and operator for all of the provided criteria.
	 * <p>
	 * Note that mongodb doesn't support an $and operator to be wrapped in a $not operator.
	 * <p>
	 * 
	 * @throws IllegalArgumentException if {@link #andOperator(GenericCriteria...)} follows a not() call directly.
	 * @param criteria
	 */
	public GenericCriteria andOperator(GenericCriteria... criteria);
}
