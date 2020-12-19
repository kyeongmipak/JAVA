package com.jsplec.bbs.dto;

import java.sql.Timestamp;

public class BDto {
	
	// field
	int bId;
	String bName;
	String bTitle;
	String bContent;
	// sql에서 사용하므로 com.sql 을 선택한다.
	Timestamp bDate;
	
	// constructor
	public BDto() {
		// TODO Auto-generated constructor stub
	}
	
	// source -> using field 선택
	public BDto(int bId, String bName, String bTitle, String bContent, Timestamp bDate) {
		super();
		this.bId = bId;
		this.bName = bName;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.bDate = bDate;
	}

	
	// source -> getter/setter 선택
	// bean에 set으로 저장, get으로 가져오기
	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
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

	public String getbContent() {
		return bContent;
	}

	public void setbContent(String bContent) {
		this.bContent = bContent;
	}

	public Timestamp getbDate() {
		return bDate;
	}

	public void setbDate(Timestamp bDate) {
		this.bDate = bDate;
	}
	
	
	
	
}
