package viettel.one.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SQLSplit {
//	private static final String PATTERN = "(?<=^|\\A|AND)\\s*(\\w+)\\s*([=<>]+)\\s*((?:[^']|'(?:[^']|'{2})+')*?)\\s*(?=AND|$|\\Z)";
	private static final String PATTERN = "(\\w+)\\s*([=<>]+)(((?!\\bAND\\b).)+)";
	
	public static void main(String[] args) {
		String s = "String='57846' AND Number=1 AND Date=#1/1/2008# AND Time=#1:34 PM# AND DATETIMED = #1/1/2008 1:34:25 PM# AND GTOE>=100 AND SpecialString='With Aposts And Spaces ''4''' AND GTOE>=100";
		Pattern regex = Pattern.compile(PATTERN);
//		String[] ss = regex.split(s);
		
		Matcher regexMatcher = regex.matcher(s);
		while (regexMatcher.find()) {
			System.out.println(regexMatcher.group());
			
			String[] ss = regexMatcher.group().trim().split("(?<=\\G(\\w+(?!\\w+)|=|<=|>=|\\+|/|\\*|-|(<|>)(?!=)))\\s*");
			for (int i=0; i<ss.length; i++) {
				System.out.println(i + ":A" + ss[i] + "B");
			}
			
			System.out.println();
		}
		
//		String[] ss = s.split("(\\w+)\\s*([=<>]+)(((?!\\bAND\\b).)+)");
//		for (int i=0; i<ss.length; i++) {
//			System.out.println(i + ": " + ss[i]);
//		}
	}

}
