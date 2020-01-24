package com.service.minimicroservice.objects;

public class FormRec {

public FormRec(){}
private final int FieldNumber_Dev=9;
private String company;
private String recruiter;
private String salary="Choose";
private String contract_years;
private String region;
private String advantages;
private String email;
private String position;
private String remote="No";
public String getRemote() {
	return remote;
}
public void setRemote(String remote) {
	this.remote = remote;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getRecruiter() {
	return recruiter;
}
public void setRecruiter(String recruiter) {
	this.recruiter = recruiter;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
public String getContract_years() {
	return contract_years;
}
public void setContract_years(String contract_years) {
	this.contract_years = contract_years;
}
public String getRegion() {
	return region;
}
public void setRegion(String region) {
	this.region = region;
}
public String getAdvantages() {
	return advantages;
}
public void setAdvantages(String advantages) {
	this.advantages = advantages;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}
public int getFieldNumber_Dev() {
	return FieldNumber_Dev;
}

}
