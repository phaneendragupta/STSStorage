package com.capg.service;

import java.util.List;

import com.capg.entity.Document;

public interface DocumentService {

	public Document saveDocument(Document document);
	public List<Document> fetchDocumentList();
	public Document fetchDocumentById(Integer documentId);
	public void deleteDocumentById(Integer documentId);
	public Document updateDocument(Integer documentId, Document document);
	
	
	

}
