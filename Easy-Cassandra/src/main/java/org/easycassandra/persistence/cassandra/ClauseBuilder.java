package org.easycassandra.persistence.cassandra;

public interface ClauseBuilder<CB, T> {
	/**
     * Creates an "equal" where clause stating the provided column must be
     * equal to the provided value.
     * @param name the column name
     * @param value the value
     * @return the corresponding where clause.
     */
    CB eq(String name, Object value);
    /**
     * Create an "in" where clause stating the provided column must be equal
     * to one of the provided values.
     *
     * @param name the column name
     * @param values the values
     * @return the corresponding where clause.
     */
    CB in(String name, Object... values);
    /**
     * Creates a "lesser than" where clause stating the provided column must be less than
     * the provided value.
     *
     * @param name the column name
     * @param value the value
     * @return the corresponding where clause.
     */
    CB lt(String name, Object value);

    /**
     * Creates a "lesser than or equal" where clause stating the provided column must
     * be lesser than or equal to the provided value.
     *
     * @param name the column name
     * @param value the value
     * @return the corresponding where clause.
     */
    CB lte(String name, Object value);

    /**
     * Creates a "greater than" where clause stating the provided column must
     * be greater to the provided value.
     *
     * @param name the column name
     * @param value the value
     * @return the corresponding where clause.
     */
    CB gt(String name, Object value);

    /**
     * Creates a "greater than or equal" where clause stating the provided
     * column must be greater than or equal to the provided value.
     *
     * @param name the column name
     * @param value the value
     * @return the corresponding where clause.
     */
    CB gte(String name, Object value);
    /**
     * add clause query between which value begin inclusive and value end and exclusive.
     * @param name the name of field
     * @param startValue the begin value inclusive
     * @param endValue the end value exclusive
     * @return this
     */
    CB between(String name, Object startValue, Object endValue);
    /**
     * add clause query between which value begin inclusive and value end and inclusive.
     * @param name the name of field
     * @param startValue the begin value inclusive
     * @param endValue the end value inclusive
     * @return this
     */
    CB betweenInclusive(String name, Object startValue, Object endValue);
    /**
     * add clause query between which value begin exclusive and value and exclusive.
     * @param name the name of field
     * @param startValue the begin value exclusive
     * @param endValue the end value exclusive
     * @return this
     */
    CB betweenExclusive(String name, Object startValue, Object endValue);
}
