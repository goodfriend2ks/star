package com.viettel.web.api.mvc;

import java.util.ArrayList;
import java.util.List;

public class ResultSet<T> {
	
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
		if (rows != null) {
			this.total = rows.size();
		}
	}
	
	public void addRow(T row) {
		if (rows != null) {
			rows = new ArrayList<T>();
		}
		
		rows.add(row);
	}
}
