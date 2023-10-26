package com.hrm;




import org.springframework.data.mongodb.core.mapping.Document;

@Document("jobitems")
public class JobItems {


	
	private String id;
	private String email;
	private String title;
	private String company_name;
	private String description;
	private String location;
	private String job_types;
	private String age;
	private String Date;
	private String url;
	private String imageUrl;
	private String posted_on;
	private String salary;
	private String experience;
	private String Requirements;
	private String Shift_and_schedule;
	private String degree;
	private String benefits_perks;
	private String posted_by;
	private String task;
	private String openings;
	private String langauge;
	private String skills;
	private String key_responsibility;
	private String phone;
	
	
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getJob_types() {
		return job_types;
	}
	public void setJob_types(String job_types) {
		this.job_types = job_types;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getPosted_on() {
		return posted_on;
	}
	public void setPosted_on(String posted_on) {
		this.posted_on = posted_on;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getRequirements() {
		return Requirements;
	}
	public void setRequirements(String requirements) {
		Requirements = requirements;
	}
	public String getShift_and_schedule() {
		return Shift_and_schedule;
	}
	public void setShift_and_schedule(String shift_and_schedule) {
		Shift_and_schedule = shift_and_schedule;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getBenefits_perks() {
		return benefits_perks;
	}
	public void setBenefits_perks(String benefits_perks) {
		this.benefits_perks = benefits_perks;
	}
	public String getPosted_by() {
		return posted_by;
	}
	public void setPosted_by(String posted_by) {
		this.posted_by = posted_by;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public String getOpenings() {
		return openings;
	}
	public void setOpenings(String openings) {
		this.openings = openings;
	}
	public String getLangauge() {
		return langauge;
	}
	public void setLangauge(String langauge) {
		this.langauge = langauge;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getKey_responsibility() {
		return key_responsibility;
	}
	public void setKey_responsibility(String key_responsibility) {
		this.key_responsibility = key_responsibility;
	}
	public  String getDate() {
		return Date;
	}
	public void setDate(String Date) {
		this.Date = Date;
	}
	

}