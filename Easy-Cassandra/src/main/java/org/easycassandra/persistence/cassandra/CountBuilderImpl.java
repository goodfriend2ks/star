package org.easycassandra.persistence.cassandra;

import org.easycassandra.ClassInformation;
import org.easycassandra.ClassInformation.KeySpaceInformation;

import com.datastax.driver.core.ConsistencyLevel;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.ResultSetFuture;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.policies.RetryPolicy;
import com.datastax.driver.core.querybuilder.QueryBuilder;
import com.datastax.driver.core.querybuilder.Select;

/**
 * count builder, it is easy way to make query with parameters.
 * @author otaviojava
 * @param <T> the kind of class
 */
public class CountBuilderImpl<T> implements CountBuilder<T> {

    private Select select;

    private Session session;

    private ClassInformation classBean;

    /**
     * Constructor.
     * @param session the session
     * @param classBean the class
     * @param keySpace the keySpace
     */
    public CountBuilderImpl(Session session, ClassInformation classBean,
            String keySpace) {
        this.session = session;

        this.classBean = classBean;

        KeySpaceInformation keySpaceInformation = classBean.getKeySpace(keySpace);
        select = QueryBuilder.select().countAll()
        			.from(keySpaceInformation.getKeySpace(), keySpaceInformation.getColumnFamily());
    }

    @Override
    public CountBuilder<T> eq(String name, Object value) {
        select.where(QueryBuilder.eq(classBean.toColumn(name), value));
        return this;
    }

    @Override
    public CountBuilder<T> in(String name, Object... values) {
        select.where(QueryBuilder.in(classBean.toColumn(name), values));
        return this;
    }

    @Override
    public CountBuilder<T> lt(String name, Object value) {

        select.where(QueryBuilder.lt(classBean.toColumn(name), value));
        return this;
    }

    @Override
    public CountBuilder<T> lte(String name, Object value) {
        select.where(QueryBuilder.lte(classBean.toColumn(name), value));
        return this;
    }

    @Override
    public CountBuilder<T> gt(String name, Object value) {
        select.where(QueryBuilder.gt(classBean.toColumn(name), value));
        return this;
    }

    @Override
    public CountBuilder<T> gte(String name, Object value) {
        select.where(QueryBuilder.gte(classBean.toColumn(name), value));
        return this;
    }

    @Override
    public CountBuilder<T> between(String name, Object startValue,
            Object endValue) {
        return lte(name, startValue).gt(name, endValue);
    }

    @Override
    public CountBuilder<T> betweenInclusive(String name, Object startValue,
            Object endValue) {
        return lte(name, startValue).gte(name, endValue);
    }

    @Override
    public CountBuilder<T> betweenExclusive(String name, Object startValue,
            Object endValue) {
        return lt(name, startValue).gt(name, endValue);
    }

    @Override
    public CountBuilder<T> asc(String name) {
        select.orderBy(QueryBuilder.asc(classBean.toColumn(name)));
        return this;
    }

    @Override
    public CountBuilder<T> desc(String name) {
        select.orderBy(QueryBuilder.desc(classBean.toColumn(name)));
        return this;
    }

    @Override
    public CountBuilder<T> withConsistencyLevel(ConsistencyLevel consistency) {
        select.setConsistencyLevel(consistency);
        return this;
    }

    @Override
    public CountBuilder<T> withTracing(boolean tracing) {
        if (tracing) {
            select.enableTracing();
        } else {
            select.disableTracing();
        }
        return this;
    }
    @Override
    public CountBuilder<T> allowFiltering() {
        select.allowFiltering();
        return this;
    }

	@Override
    public CountBuilder<T> withLimit(int limit) {
        select.limit(limit);
        return this;
    }

    @Override
    public CountBuilder<T> withFetchSize(int fetchSize) {
        select.setFetchSize(fetchSize);
        return this;
    }

    @Override
    public CountBuilder<T> withRetryPolicy(RetryPolicy policy) {
        select.setRetryPolicy(policy);
        return this;
    }

    @Override
    public Long execute() {
        ResultSet resultSet = session.execute(select);
        return resultSet.all().get(0).getLong(0);
    }
    @Override
    public void executeAsync(ResultAsyncCallBack<Long> resultCallBack) {
        ResultSetFuture resultSet = session.executeAsync(select);
        AsyncResult.INSTANCE.runCount(resultCallBack, resultSet);
    }
    @Override
    public String toString() {
        return select.toString();
    }
}
