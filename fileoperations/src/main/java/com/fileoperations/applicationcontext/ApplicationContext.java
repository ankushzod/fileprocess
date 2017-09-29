package com.fileoperations.applicationcontext;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.fileoperations.applicationcontext.model.XmlReader;

public class ApplicationContext {
	List<XmlReader> fileNames = new ArrayList<XmlReader>();
	{
	
	try {
		File fXmlFile = new File("D:/Ankush Zod/Project/fileoperations/resources/filerecords.xml");
		DocumentBuilderFactory dbfactory =DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbfactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		
		doc.getDocumentElement().normalize();
		
		NodeList nName= doc.getElementsByTagName("input-file");
		HashMap<String,String> fileNames = new HashMap<String,String>();
		for(int i = 0; i < nName.getLength(); i++){
			Node nNode = nName.item(i);
			if(nNode.getNodeType() == Node.ELEMENT_NODE) {
				XmlReader xmlReader = new XmlReader();
				Element eElement = (Element) nNode;
				System.out.println("name: " +eElement.getAttribute("name") );
				System.out.println("time: " +eElement.getAttribute("time") );
				fileNames.put(eElement.getAttribute("name"), eElement.getAttribute("time"));
			}
		}
		NodeList nDate = doc.getElementsByTagName("date");
		for(int i = 0; i < nDate.getLength(); i++){
			Node nNode = nDate.item(i);
		}
	}
	
	catch (Exception e){
		e.printStackTrace();
	}
	

	}
}
