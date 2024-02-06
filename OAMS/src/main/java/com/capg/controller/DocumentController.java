package com.capg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.entity.Document;
import com.capg.service.DocumentService;


//@CrossOrigin(origins="http://localhost:3000")
@RestController
public class DocumentController {
	
	@Autowired
	private DocumentService documentService;
	
	@PostMapping("/documents")
	public Document saveDocument(@RequestBody Document document) {
		return documentService.saveDocument(document);
	}
	
	@GetMapping("/documents")
	public List<Document> fetchDocumentList(){
		return documentService.fetchDocumentList();
		
	}
	
	@GetMapping("/documents/{id}")
	public Document fetchDocumentById(@PathVariable("id") Integer documentId) {
		return documentService.fetchDocumentById(documentId);
		
	}	
	
	@DeleteMapping("/documents/{id}")
	public String deleteDocumentById(@PathVariable("id") Integer documentId) {
		documentService.deleteDocumentById(documentId);
		return "Document deleted";
	}
	
	@PutMapping("/documents/{id}")
	public Document updateDocument(@PathVariable("id") Integer documentId, @RequestBody Document document) {
		return documentService.updateDocument(documentId,document);
	}
 
}
