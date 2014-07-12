package com.viettel.util;

import java.util.ArrayList;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.persistence.criteria.Clause;
import javax.persistence.criteria.ClauseOp;

public class ClauseUtil {
	private static final String GROUP_PATTERN = "(\\w+)\\s*([=<>]+)(((?!\\bAND\\b).)+)";
	private static final String SPLIT_PATTERN = "(?<=\\G(\\w+(?!\\w+)|=|<=|>=|\\+|/|\\*|-|(<|>)(?!=)))\\s*";
	
	private static final Pattern regex = Pattern.compile(GROUP_PATTERN);
	
	public static ArrayList<Clause> split(String clause) {
		ArrayList<Clause> clauses = new ArrayList<>();
		
		Matcher regexMatcher = regex.matcher(clause);
		while (regexMatcher.find()) {
			String groupClause = regexMatcher.group();
			if (groupClause != null) {
				groupClause = groupClause.trim();
				if (!"".equals(groupClause)) {
					String[] groupClauses = groupClause.split(SPLIT_PATTERN);
					if (groupClauses.length == 3) {
						ClauseOp clauseOp = null;
						
						String op = groupClauses[1].trim();
						if ("=".equals(op) || "==".equals(op)) {
							clauseOp = ClauseOp.eq;
						} else if ("<".equals(op)) {
							clauseOp = ClauseOp.lt;
						} else if ("<=".equals(op)) {
							clauseOp = ClauseOp.lte;
						} else if (">".equals(op)) {
							clauseOp = ClauseOp.gt;
						} else if (">=".equals(op)) {
							clauseOp = ClauseOp.gte;
						}
						
						if (clauseOp != null) {
							String clauseName = groupClauses[0].trim();
							Object clauseValue = null;
							
							String value = groupClauses[2].trim();
							if (value.startsWith("#")) {
								clauseValue = value;
							} else if (value.startsWith("{") && value.endsWith("}")) {
								clauseValue = value;
							} else if ("true".equalsIgnoreCase(value)) {
								clauseValue = true;
							} else if ("false".equalsIgnoreCase(value)) {
								clauseValue = false;
							} else if (value.startsWith("'") && value.endsWith("'")) {
								clauseValue = value.substring(1, value.length() - 1);
							} else {
								clauseValue = DataTypeUtil.fromObject(UUID.class, value);
								if (clauseValue == null) {
									clauseValue = DataTypeUtil.fromObject(Double.class, value);
								}
							}
							
							clauses.add(new Clause(clauseName, clauseOp, clauseValue));
						}
					}
				}
			}
		}
		
		return clauses;
	}
}
