package com.viettel.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.viettel.backend.domain.MOrg;
import com.viettel.backend.domain.MUser;
import com.viettel.backend.domain.common.MLanguage;
import com.viettel.dto.MUserDto;

@Mapper
public interface MUserMapper {
	
	MUserMapper INSTANCE = Mappers.getMapper( MUserMapper.class );
	
	@Mappings({
		@Mapping(source = "user.ad_Org_ID", target = "ad_Org_ID"),
		@Mapping(source = "org.name", target = "orgName"),
		@Mapping(source = "user.isActive", target = "isActive"),
		@Mapping(source = "user.created", target = "created"),
		@Mapping(source = "user.updated", target = "updated"),
		@Mapping(source = "user.version", target = "version"),
		@Mapping(source = "user.name", target = "name"),
		@Mapping(source = "user.userName", target = "userName"),
		@Mapping(source = "user.dob", target = "dob"),
		@Mapping(source = "user.email", target = "email"),
		@Mapping(source = "user.c_Language_ID", target = "c_Language_ID"),
		@Mapping(source = "lang.name", target = "languageName"),
		@Mapping(source = "user.isAccountNonExpired", target = "isAccountNonExpired"),
		@Mapping(source = "user.isCredentialsNonExpired", target = "isCredentialsNonExpired"),
		@Mapping(source = "user.isAccountNonLocked", target = "isAccountNonLocked")
	})
	public MUserDto userToDto(MUser user, MOrg org, MLanguage lang);
	
//	public MUserDto userToDto(MUser user, List<MOrg> orgs, List<MLanguage> languages);
	
	void updateFromDto(MUserDto userDto, @MappingTarget MUser user);
}
