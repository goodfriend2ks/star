package com.viettel.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.viettel.backend.common.EO;
import com.viettel.backend.common.IValuePair;
import com.viettel.backend.common.ValuePair;

public class ValuePairUtil {
	
	public static <T extends EO<PK>, PK extends Serializable> List<IValuePair<PK>> fromEOs(List<T> eos) {
		List<IValuePair<PK>> results = new ArrayList<>();
		
		for (EO<PK> eo : eos) {
			results.add(new ValuePair<>(eo));
		}
		
		return results;
	}
}
