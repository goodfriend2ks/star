package com.viettel.backend.repository.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.viettel.backend.domain.MReport;
import com.viettel.backend.domain.MReportPara;
import com.viettel.backend.domain.key.MReportKey;
import com.viettel.backend.repository.ReportRepository;

@Repository
public class ReportRepositoryImpl
	extends GenericRepositoryImpl<MReport, MReportKey, UUID> 
	implements ReportRepository {

	/**
	 * 
	 */
	private static final long serialVersionUID = -707491859202566299L;

	@Override
	public List<MReport> getList(int firstResult, int maxResults, String txt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getCount(String txt) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getParaCount(UUID AD_Report_ID, String txt) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<MReportPara> getParameters(UUID AD_Report_ID) {
		// TODO Auto-generated method stub
		return null;
	}

}
