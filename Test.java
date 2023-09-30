package com.pdf;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.multipdf.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;



public class Test {

	public static void main(String[] args) throws IOException {
	
	File oldFile = new File("C:/Project/DBE.pdf");
	
	PDDocument document = Loader.loadPDF(oldFile);
	
	Splitter splitter = new Splitter();
	
	List<PDDocument> splitPages = splitter.split(document);
	
	int num=1;
	for(PDDocument mydoc: splitPages){
		String outputFile = "C:/Project/project" +num+ ".pdf";
		
		
		mydoc.save(outputFile);
		num++;
		mydoc.close();
	}
	
	document.close();
	System.out.println("Split Done");
	}
	

}
