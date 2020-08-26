package com.kairos.ovni.business.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Teste {
	
	public static void main(String[] args) {
		
		String tagName = "DadosDiploma";
		String file = "C:/Users/Diogo/Desktop/diploma.xml";
		String file2 = "C:/Users/Diogo/Desktop/assinatura.xml";
		
		try {

			File f = new File(file);
			FileInputStream fis;
			fis = new FileInputStream(f);		
			Document docXml = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(fis);

			NodeList nodeList = docXml.getElementsByTagName("infDiploma");	
			Node nodeInfDiploma = nodeList.item(0);
			
			File f2 = new File(file2);
			FileInputStream fis2 = new FileInputStream(f2);
			Document docXml2 = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(fis2);
			
			NodeList list2 = docXml2.getChildNodes();
			Node nodeSignature = list2.item(0).getLastChild();
			
			Node nodeDadosDiploma = docXml.getElementsByTagName(tagName).item(0);			
			Node nodeImported = docXml.importNode(nodeSignature, true);
			
			
			nodeInfDiploma.insertBefore(nodeImported, nodeDadosDiploma);
			
			System.out.println(converterNodeToString(nodeInfDiploma.getFirstChild()));

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Converte um node em uma string
	 * @param document
	 * @return
	 * @throws TransformerException
	 */
    public static String converterNodeToString(Node document) throws TransformerException {
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        StreamResult result = new StreamResult(new StringWriter());
        DOMSource source = new DOMSource(document);
        transformer.transform(source, result);
        String xmlString = result.getWriter().toString();
        return xmlString;
    }

	public static void main1(String[] args) {
		String tagName = "<DadosDiploma id=\"Dip12740759441001589315948267559936485636267328\">";
		tagName = tagName.replace("<", "</").replace(" ", ">");
		int index = tagName.indexOf(">");
		tagName = tagName.substring(0, ++index);
		System.out.println(tagName);
	}
}
