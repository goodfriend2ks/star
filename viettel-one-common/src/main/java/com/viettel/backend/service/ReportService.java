package com.viettel.backend.service;


import java.util.List;
import java.util.UUID;

import com.viettel.backend.domain.MReport;
import com.viettel.backend.domain.MReportPara;
import com.viettel.backend.domain.key.MReportKey;

/**
 * @author      VUONGBD
 * @version     
 * @since       26-03-2014   
 * @update		11-04-2014  
 */

public interface ReportService extends GenericService<MReport, MReportKey, UUID> 
{
	public UUID createReport(String name, String process, String jasperFile);
	
	public List<MReport> getList(int firstResult, int maxResults, String txt);
	
	public long getCount(String txt);
	
	public long getParaCount(UUID AD_Report_ID, String txt);
	
	public List<MReportPara> getParameters(UUID AD_Report_ID);
	
	public UUID createPara(String name, String label, String type, boolean madatory,
			boolean hidden, int sequence, boolean newLine, MReport report);
}
