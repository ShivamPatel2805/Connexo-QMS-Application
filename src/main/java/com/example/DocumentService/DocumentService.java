package com.example.DocumentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DocumentEntity.Document;
import com.example.DocumentRepository.DocumentRepo;



@Service
public class DocumentService {
	
	
	@Autowired
	private DocumentRepo documentRepo;
	
	public Document SaveDocument(Document document) {
        return documentRepo.save(document); // Use the inherited save method.
    }
    
    public List<Document> getAllEntities() {
        return documentRepo.findAll();
    }

    public Document getDocumentById(long id) {
        return documentRepo.findById(id).get();
    }
	
    public Document updateDocument(long id, Document document) {
    	Document existingDeatils = documentRepo.findById(id).get();
		existingDeatils.setDocumentInfo( document.getDocumentInfo());
		return documentRepo.save(existingDeatils);
		
	}



}
