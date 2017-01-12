package com.team4.bigTower.file.service;

public class Files {
	private int fNo;
	private String fTitle;
	private String fName;
	private String fAuth;
	private String fPath;
	private String extention;
	private int bNo;
	
	public Files() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Files [fNo=" + fNo + ", fTitle=" + fTitle + ", fName=" + fName + ", fAuth=" + fAuth + ", fPath=" + fPath
				+ ", extention=" + extention + ", bNo=" + bNo + "]";
	}
	public int getfNo() {
		return fNo;
	}
	public void setfNo(int fNo) {
		this.fNo = fNo;
	}
	public String getfTitle() {
		return fTitle;
	}
	public void setfTitle(String fTitle) {
		this.fTitle = fTitle;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getfAuth() {
		return fAuth;
	}
	public void setfAuth(String fAuth) {
		this.fAuth = fAuth;
	}
	public String getfPath() {
		return fPath;
	}
	public void setfPath(String fPath) {
		this.fPath = fPath;
	}
	public String getExtention() {
		return extention;
	}
	public void setExtention(String extention) {
		this.extention = extention;
	}
	public int getbNo() {
		return bNo;
	}
	public void setbNo(int bNo) {
		this.bNo = bNo;
	}
	
	
}
