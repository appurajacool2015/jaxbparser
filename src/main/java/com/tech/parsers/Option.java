package com.tech.parsers;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@XmlAccessorType(XmlAccessType.FIELD)
public class Option {

	@XmlElement(name = "ID")
	private String id;

	@XmlElement(name ="PUBLISHED_DESCRIPTION" )
	private String publishedDescription;
	
	@XmlElementWrapper(name = "SALES_ORGS")
	@XmlElement(name = "SALES_ORG")
	private List<SALES_ORG> salesOrg;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPublishedDescription() {
		return publishedDescription;
	}

	public void setPublishedDescription(String publishedDescription) {
		this.publishedDescription = publishedDescription;
	}

	public List<SALES_ORG> getSalesOrg() {
		return salesOrg;
	}

	public void setSalesOrg(List<SALES_ORG> salesOrg) {
		this.salesOrg = salesOrg;
	}
	
}
