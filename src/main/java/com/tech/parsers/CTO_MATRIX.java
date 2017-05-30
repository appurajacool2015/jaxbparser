package com.tech.parsers;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="CTO_MATRIX")
@XmlAccessorType(XmlAccessType.FIELD)
public class CTO_MATRIX {

    @XmlElementWrapper(name="KMATS")
    @XmlElement(name="KMAT")
	private List<KMAT> kmat;

	public List<KMAT> getKmat() {
		return kmat;
	}

	public void setKmat(List<KMAT> kmat) {
		this.kmat = kmat;
	}
	
}
