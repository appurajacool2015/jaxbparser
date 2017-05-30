package com.tech.parsers;

import javax.xml.bind.annotation.XmlElement;

public class SALES_ORG {

	@XmlElement(name = "ID")
	private String Id;
	
	@XmlElement(name = "EXTENSION")
	private String Extension;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getExtension() {
		return Extension;
	}

	public void setExtension(String extension) {
		Extension = extension;
	}
}
