package com.vinod;

public class Company {
	private String companyId;
	private String companyName;
	private String companyHouseNo;
	private String cStreetName;
	private Project project;
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyHouseNo() {
		return companyHouseNo;
	}
	public void setCompanyHouseNo(String companyHouseNo) {
		this.companyHouseNo = companyHouseNo;
	}
	public String getcStreetName() {
		return cStreetName;
	}
	public void setcStreetName(String streetName) {
		cStreetName = streetName;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName="
				+ companyName + ", companyHouseNo=" + companyHouseNo
				+ ", StreetName=" + cStreetName + ", project=" + project + "]";
	}
	
	
}
