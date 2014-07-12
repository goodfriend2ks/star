package com.viettel.api.mvc;

import java.util.ArrayList;
import java.util.List;

import com.viettel.backend.common.EO;

public class ResultSet<T extends EO<?, ?>> {
	
	private long total;
    private List<T> rows;

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	
	public void addRow(T row) {
		if (rows != null) {
			rows = new ArrayList<T>();
		}
		
		rows.add(row);
	}
}
