package PojoFromTableGen.pojos.dos;

import java.sql.Date;

public class TSubDtlDo {

	private long subDtlId;
	private String titleId;
	private String surname;
	private String firstName;
	private String initials;
	private String langCode;
	private Date birthDate;
	private String listedYn;
	private String gender;
	private long subDtlListId;


	public long getSubDtlId() {
		return subDtlId;
	}

	public void setSubDtlId(long subDtlId) {
		this.subDtlId = subDtlId;
	}
		
	public String getTitleId() {
		return titleId;
	}

	public void setTitleId(String titleId) {
		this.titleId = titleId;
	}
		
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
		
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
		
	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}
		
	public String getLangCode() {
		return langCode;
	}

	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}
		
	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
		
	public String getListedYn() {
		return listedYn;
	}

	public void setListedYn(String listedYn) {
		this.listedYn = listedYn;
	}
		
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
		
	public long getSubDtlListId() {
		return subDtlListId;
	}

	public void setSubDtlListId(long subDtlListId) {
		this.subDtlListId = subDtlListId;
	}
		


}
