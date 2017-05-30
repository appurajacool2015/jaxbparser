package com.tech.parsers;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@XmlAccessorType(XmlAccessType.FIELD)
public class KMAT {
	
	@XmlElement(name="ID")
	private String ID;
	
	@XmlElement(name="MPN")
	private String MPN;
	
	@XmlElement(name="MPN_DESC")
	private String MPN_DESC;
	
	@XmlElement(name="OPTION_COUNT")
	private String OPTION_COUNT;
	
	@XmlElement(name="OPTIONS_ADDED")
	private String OPTIONS_ADDED;
	
	@XmlElement(name="OPTIONS_DELETES")
	private String OPTIONS_DELETES;
	
	@XmlElementWrapper(name="FIND_NOS")
	@XmlElement(name="FIND_NO")
	private List<FIND_NO> find_nos;

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getMPN() {
		return MPN;
	}

	public void setMPN(String mPN) {
		MPN = mPN;
	}

	public String getMPN_DESC() {
		return MPN_DESC;
	}

	public void setMPN_DESC(String mPN_DESC) {
		MPN_DESC = mPN_DESC;
	}

	public String getOPTION_COUNT() {
		return OPTION_COUNT;
	}

	public void setOPTION_COUNT(String oPTION_COUNT) {
		OPTION_COUNT = oPTION_COUNT;
	}

	public String getOPTIONS_ADDED() {
		return OPTIONS_ADDED;
	}

	public void setOPTIONS_ADDED(String oPTIONS_ADDED) {
		OPTIONS_ADDED = oPTIONS_ADDED;
	}

	public String getOPTIONS_DELETES() {
		return OPTIONS_DELETES;
	}

	public void setOPTIONS_DELETES(String oPTIONS_DELETES) {
		OPTIONS_DELETES = oPTIONS_DELETES;
	}

	public List<FIND_NO> getFind_nos() {
		return find_nos;
	}

	public void setFind_nos(List<FIND_NO> find_nos) {
		this.find_nos = find_nos;
	}

}
