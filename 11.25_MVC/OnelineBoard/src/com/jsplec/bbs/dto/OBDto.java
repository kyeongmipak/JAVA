package com.jsplec.bbs.dto;

import java.sql.Timestamp;

public class OBDto {
	// field
	int bNo;
	String bName;
	String bTitle;
	Timestamp bDate;
	
	
	public OBDto() {
		
	}


	public OBDto(int bNo, String bName, String bTitle, Timestamp bDate) {
		super();
		this.bNo = bNo;
		this.bName = bName;
		this.bTitle = bTitle;
		this.bDate = bDate;
	}


	public int getbNo() {
		return bNo;
	}


	public void setbNo(int bNo) {
		this.bNo = bNo;
	}


	public String getbName() {
		return bName;
	}


	public void setbName(String bName) {
		this.bName = bName;
	}


	public String getbTitle() {
		return bTitle;
	}


	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}


	public Timestamp getbDate() {
		return bDate;
	}


	public void setbDate(Timestamp bDate) {
		this.bDate = bDate;
	}



	
	
}
