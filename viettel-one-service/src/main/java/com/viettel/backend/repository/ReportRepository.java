package com.viettel.backend.repository;

import java.util.List;
import java.util.UUID;

import com.viettel.backend.domain.MReport;
import com.viettel.backend.domain.MReportPara;
import com.viettel.backend.domain.key.MReportKey;

public interface ReportRepository extends GenericRepository<MReport, MReportKey, UUID> {
	
	public List<MReport> getList(int firstResult, int maxResults, String txt);
	
	public long getCount(String txt);
	
	public long getParaCount(UUID AD_Report_ID, String txt);
	
	public List<MReportPara> getParameters(UUID AD_Report_ID);
}
