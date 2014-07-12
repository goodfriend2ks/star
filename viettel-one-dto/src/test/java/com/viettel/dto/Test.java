package com.viettel.dto;

import java.util.Date;
import java.util.UUID;

import com.viettel.backend.domain.MOrg;
import com.viettel.backend.domain.MUser;
import com.viettel.backend.domain.common.MLanguage;
import com.viettel.mapper.MUserMapper;

public class Test {

	public static void main(String[] args) {
		MUser user = new MUser("Pham Quang Phat", "phatpq", "123456", new Date(), "phatpq@viettel.com.vn");
		
		MOrg org = new MOrg();
		org.setID(UUID.randomUUID());
		org.setCode("HN");
		org.setName("Ha Noi");
		
		MLanguage lang = new MLanguage();
		lang.setID(UUID.randomUUID());
		lang.setCode("vi-VN");
		lang.setName("Tieng Viet");
		
		user.setAd_Org_ID(org.getID());
		user.setC_Language_ID(lang.getID());
		
		MUserDto dto = MUserMapper.INSTANCE.userToDto(user, org, lang);
		System.out.println(dto.getEmail() + "=" + dto.getOrgName() + "=" + dto.getLanguageName());
	}

}
