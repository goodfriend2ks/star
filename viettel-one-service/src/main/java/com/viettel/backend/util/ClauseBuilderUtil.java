package com.viettel.backend.util;

import javax.persistence.criteria.Clause;
import javax.persistence.criteria.ClauseOp;

import org.easycassandra.persistence.cassandra.ClauseBuilder;

public class ClauseBuilderUtil {
	public static <CB extends ClauseBuilder<CB, T>, T> CB buildClause(CB clauseBuilder, Clause...clauses) {
		if (clauses == null || clauses.length == 0)
			return clauseBuilder;
		
		for (Clause clause : clauses) {
			build(clauseBuilder, clause);
		}
		
		return clauseBuilder;
	}
	
	private static <CB extends ClauseBuilder<CB, T>, T> CB build(CB clauseBuilder, Clause clause) {
		if (clause == null)
			return clauseBuilder;
		
		ClauseOp op = clause.getOp();
		if (ClauseOp.eq.equals(op))
			return clauseBuilder.eq(clause.getName(), clause.getFirstValue());
		
		if (ClauseOp.lt.equals(op))
			return clauseBuilder.lt(clause.getName(), clause.getFirstValue());
		
		if (ClauseOp.lte.equals(op))
			return clauseBuilder.lte(clause.getName(), clause.getFirstValue());
		
		if (ClauseOp.gt.equals(op))
			return clauseBuilder.gt(clause.getName(), clause.getFirstValue());
		
		if (ClauseOp.gte.equals(op))
			return clauseBuilder.gte(clause.getName(), clause.getFirstValue());
		
		if (ClauseOp.between.equals(op))
			return clauseBuilder.between(clause.getName(), clause.getFirstValue(), clause.getSecondValue());
		
		if (ClauseOp.betweenInclusive.equals(op))
			return clauseBuilder.betweenInclusive(clause.getName(), clause.getFirstValue(), clause.getSecondValue());
		
		if (ClauseOp.betweenExclusive.equals(op))
			return clauseBuilder.betweenExclusive(clause.getName(), clause.getFirstValue(), clause.getSecondValue());
		
		if (ClauseOp.in.equals(op)) {
			if (clause.getFirstValue() != null) {
				if (clause.getFirstValue() instanceof Object[])
					return clauseBuilder.in(clause.getName(), (Object[])clause.getFirstValue());
				else
					return clauseBuilder.in(clause.getName(), clause.getFirstValue(), clause.getSecondValue());
			}
		}
		
		return clauseBuilder;
	}
}
