package com.viettel.api.converter;

import java.util.Date;

import org.apache.commons.beanutils.converters.DateTimeConverter;

import com.viettel.util.DataTypeUtil;

public class DateConverter extends DateTimeConverter {
	/**
     * Construct a <b>java.util.Date</b> <i>Converter</i> that throws
     * a <code>ConversionException</code> if an error occurs.
     */
    public DateConverter() {
        super();
        
        this.setUseLocaleFormat(true);
        this.setPatterns(DataTypeUtil.DATE_PATTERNS);
    }

    /**
     * Construct a <b>java.util.Date</b> <i>Converter</i> that returns
     * a default value if an error occurs.
     *
     * @param defaultValue The default value to be returned
     * if the value to be converted is missing or an error
     * occurs converting the value.
     */
    public DateConverter(Object defaultValue) {
        super(defaultValue);
        
        this.setUseLocaleFormat(true);
        this.setPatterns(DataTypeUtil.DATE_PATTERNS);
    }

    /**
     * Return the default type this <code>Converter</code> handles.
     *
     * @return The default type this <code>Converter</code> handles.
     */
    @Override
    protected Class<?> getDefaultType() {
        return Date.class;
    }
}
