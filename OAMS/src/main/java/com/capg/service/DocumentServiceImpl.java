package com.capg.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.entity.Document;
import com.capg.repository.DocumentRepository;

@Service
public class DocumentServiceImpl implements DocumentService{
	
	@Autowired
	private DocumentRepository documentRepository;

	@Override
	public Document saveDocument(Document document) {
		
		return documentRepository.save(document);
	}

	

	@Override
	public List<Document> fetchDocumentList() {
		
		return documentRepository.findAll();
	}
	
	@Override
	public Document fetchDocumentById(Integer documentId) {
		
		return documentRepository.findById(documentId).get();
	}



	@Override
	public void deleteDocumentById(Integer documentId) {
		
		documentRepository.deleteById(documentId);
		
	}



	@Override
	public Document updateDocument(Integer documentId, Document document) {
		
		Document docDB = documentRepository.findById(documentId).get();
		
		if(Objects.nonNull(document.getDocumentName()) &&
		        !"".equalsIgnoreCase(document.getDocumentName())) {
		            docDB.setDocumentName(document.getDocumentName());
		        }
		if(Objects.nonNull(document.getDocumentUrl()) &&
		        !"".equalsIgnoreCase(document.getDocumentUrl())) {
		            docDB.setDocumentUrl(document.getDocumentUrl());
		        }
		
		
		
		
		
		return documentRepository.save(docDB);
	}



	
	
	

	
}