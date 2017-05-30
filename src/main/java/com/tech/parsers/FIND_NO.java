package com.tech.parsers;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@XmlAccessorType(XmlAccessType.FIELD)
public class FIND_NO {
	
	@XmlElement(name = "ID")
	private String Id;
	
	@XmlElement(name = "DESCRIPTION")
	private String description;
	
	@XmlElementWrapper(name ="OPTIONS")
	@XmlElement(name = "OPTION")
	private List<Option> option;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Option> getOption() {
		return option;
	}

	public void setOption(List<Option> option) {
		this.option = option;
	}
	
	
}
