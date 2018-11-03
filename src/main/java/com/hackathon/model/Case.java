package com.hackathon.model;

import java.io.Serializable;

public class Case implements Serializable {
	Integer casenumber;
	String defendant;
	String plaintiff;
	String defendantRep;
	String plaintiffRep;
	String discipline;
	String juristiction;
	Integer value;
	String caseHandler;
	String contactPerson;

	public Case() {
	}

	public Case(Integer casenumber, String defendant, String plaintiff, String defendantRep, String plaintiffRep, String discipline, String juristiction, Integer value, String caseHandler, String contactPerson) {
		this.casenumber = casenumber;
		this.defendant = defendant;
		this.plaintiff = plaintiff;
		this.defendantRep = defendantRep;
		this.plaintiffRep = plaintiffRep;
		this.discipline = discipline;
		this.juristiction = juristiction;
		this.value = value;
		this.caseHandler = caseHandler;
		this.contactPerson = contactPerson;
	}

	public Case(String defendant, String plaintiff, String defendantRep, String plaintiffRep, String discipline, String juristiction, Integer value, String caseHandler, String contactPerson) {
		this.defendant = defendant;
		this.plaintiff = plaintiff;
		this.defendantRep = defendantRep;
		this.plaintiffRep = plaintiffRep;
		this.discipline = discipline;
		this.juristiction = juristiction;
		this.value = value;
		this.caseHandler = caseHandler;
		this.contactPerson = contactPerson;
	}

	public Integer getCasenumber() {
		return casenumber;
	}

	public void setCasenumber(Integer casenumber) {
		this.casenumber = casenumber;
	}

	public String getDefendant() {
		return defendant;
	}

	public void setDefendant(String defendant) {
		this.defendant = defendant;
	}

	public String getPlaintiff() {
		return plaintiff;
	}

	public void setPlaintiff(String plaintiff) {
		this.plaintiff = plaintiff;
	}

	public String getDefendantRep() {
		return defendantRep;
	}

	public void setDefendantRep(String defendantRep) {
		this.defendantRep = defendantRep;
	}

	public String getPlaintiffRep() {
		return plaintiffRep;
	}

	public void setPlaintiffRep(String plaintiffRep) {
		this.plaintiffRep = plaintiffRep;
	}

	public String getDiscipline() {
		return discipline;
	}

	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}

	public String getJuristiction() {
		return juristiction;
	}

	public void setJuristiction(String juristiction) {
		this.juristiction = juristiction;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public String getCaseHandler() {
		return caseHandler;
	}

	public void setCaseHandler(String caseHandler) {
		this.caseHandler = caseHandler;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	@Override
	public String toString() {
		return "Case{" +
				"casenumber=" + casenumber +
				", defendant='" + defendant + '\'' +
				", plaintiff='" + plaintiff + '\'' +
				", defendantRep='" + defendantRep + '\'' +
				", plaintiffRep='" + plaintiffRep + '\'' +
				", discipline='" + discipline + '\'' +
				", juristiction='" + juristiction + '\'' +
				", value=" + value +
				", caseHandler='" + caseHandler + '\'' +
				", contactPerson='" + contactPerson + '\'' +
				'}';
	}
}
