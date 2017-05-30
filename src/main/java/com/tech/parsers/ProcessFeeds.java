package com.tech.parsers;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ProcessFeeds {

	public static void main(String[] args) {

		try {

			ClassLoader classLoader = ProcessFeeds.class.getClassLoader();
			File file = new File(classLoader.getResource("file.xml").getFile());
//			File file = new File(
//					"/Users/AN298112/Documents/workspace-sts-3.8.3.RELEASE/jaxbparser/src/main/java/com/tech/parser/file.xml");

			
			JAXBContext jaxbContext = JAXBContext.newInstance(CTO_MATRIX.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			CTO_MATRIX feedProcess = (CTO_MATRIX) jaxbUnmarshaller.unmarshal(file);

			System.out.println(feedProcess.getKmat().get(1).getMPN());

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
