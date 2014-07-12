package viettel.one.test;

import com.viettel.backend.domain.common.MAttributeType;

public class AttributeTest {

	public static void main(String[] args) {
		for (MAttributeType type : MAttributeType.values()) {
			System.out.println(type.ordinal() + "=" + type.getCode() + "=" + type.getClazz() + "=" + type.toString());
		}
	}

}
