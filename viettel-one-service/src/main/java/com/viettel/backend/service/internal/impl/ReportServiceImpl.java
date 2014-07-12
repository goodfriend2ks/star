package com.viettel.backend.service.internal.impl;


import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viettel.backend.domain.MReport;
import com.viettel.backend.domain.MReportPara;
import com.viettel.backend.domain.key.MReportKey;
import com.viettel.backend.domain.key.MReportParaKey;
import com.viettel.backend.repository.ReportRepository;
import com.viettel.backend.service.ReportService;

/**
 * @author      VUONGBD
 * @version     
 * @since       26-03-2014     
 */

@Service(value="reportService")
public class ReportServiceImpl extends DaoBaseService<MReport, MReportKey, UUID> implements ReportService {

	private ReportRepository reportRepo;

	   
    @Autowired
    public ReportServiceImpl(ReportRepository reportRepo) {
        super(reportRepo);
        this.reportRepo = reportRepo;
    }

	@Override
	public UUID createReport(String name, String process, String jasperfile) {
		MReport repp = new MReport();
		repp.setName(name);
		repp.setProcess(process);
		repp.setJasperFile(jasperfile);		
		return reportRepo.save(repp, true); 
	}

	@Override
	public List<MReport> getList(int firstResult, int maxResults, String txt) {
		return reportRepo.getList(firstResult, maxResults, txt);
	}

	@Override
	public long getCount(String txt) {
		return reportRepo.getCount(txt);
	}

	@Override
	public List<MReportPara> getParameters(UUID reportId) {
		return reportRepo.getParameters(reportId);
	}

	@Override
	public long getParaCount(UUID AD_Report_ID, String txt) {
		return reportRepo.getParaCount(AD_Report_ID, txt);
	}

	@Override
	public UUID createPara(String name, String label, String type,
			boolean madatory, boolean hidden, int sequence, boolean newLine, MReport report) {
		
		MReportPara reportPara = new MReportPara();
		reportPara.setName(name);
		reportPara.setLabel(label);
		reportPara.setType(type);
		reportPara.setMadatory(madatory);
		reportPara.setHidden(hidden);
		reportPara.setSeqNo(sequence);
		reportPara.setNewLine(newLine);
		reportPara.setAd_Report_ID(report.getID());
		return reportRepo.save(MReportPara.class, MReportParaKey.class, UUID.class, reportPara, true);
	}
}
