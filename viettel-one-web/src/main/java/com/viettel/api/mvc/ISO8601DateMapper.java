package com.viettel.api.mvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;

public class ISO8601DateMapper extends ObjectMapper {
	
	public ISO8601DateMapper() {
        setDateFormat(new ISO8601DateFormat());
    }
}
