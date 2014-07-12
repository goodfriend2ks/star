package javax.persistence.criteria;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

public class Clause implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6425013456639379645L;
	
	private String name;
	private ClauseOp op;
	private Object firstValue;
	private Object secondValue;
	
	public Clause(String name, ClauseOp op, Object value) {
		this(name, op, value, null);
	}
	
	public Clause(String name, ClauseOp op, Object startValue, Object endValue) {
		this.name = name;
		this.op = op;
		this.firstValue = startValue;
		this.secondValue = endValue;
	}
	
	public Clause(String name, Object... values) {
		this(name, ClauseOp.in, values);
	}
	
	public Clause(String name, Collection<?> values) {
		Object[] arrayValues = new Object[values.size()];
		
		int i = 0;
		Iterator<?> iterator = values.iterator();
		while (iterator.hasNext()) {
			arrayValues[i] = iterator.next();
			i++;
		}
		
		this.name = name;
		this.op = ClauseOp.in;
		this.firstValue = arrayValues;
		this.secondValue = null;
	}
	
	public String getName() {
		return name;
	}

	public ClauseOp getOp() {
		return op;
	}

	public Object getFirstValue() {
		return firstValue;
	}

	public Object getSecondValue() {
		return secondValue;
	}
}
