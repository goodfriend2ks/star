package javax.persistence.criteria;

import java.io.Serializable;
import java.util.List;

public interface GenericQuery extends Serializable {
	
	/**
	 * Adds the given {@link GenericCriteria} to the current {@link GenericQuery}.
	 * 
	 * @param criteria must not be {@literal null}.
	 * @return
	 */
	public GenericQuery addCriteria(GenericCriteria criteria);
	
	/**
	 * Set number of documents to skip before returning results.
	 * 
	 * @param skip
	 * @return
	 */
	public GenericQuery skip(int skip);
	
	/**
	 * Limit the number of returned documents to {@code limit}.
	 * 
	 * @param limit
	 * @return
	 */
	public GenericQuery limit(int limit);
	
	/**
	 * Configures the query to use the given hint when being executed.
	 * 
	 * @param name must not be {@literal null} or empty.
	 * @return
	 */
	public GenericQuery withHint(String name);
	
	/**
	 * Get the number of documents to skip.
	 * 
	 * @return
	 */
	public int getSkip();
	
	/**
	 * Get the maximum number of documents to be return.
	 * 
	 * @return
	 */
	public int getLimit();
	
	/**
	 * @return
	 */
	public String getHint();
	
	public List<GenericCriteria> getCriteria();
}
