package com.example.DocumentController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DocumentDtos.DocumentRequest;
import com.example.DocumentEntity.Document;
import com.example.DocumentRepository.DocumentRepo;
import com.example.DocumentService.DocumentService;


@RestController
@CrossOrigin("http://Localhost:5173")
@RequestMapping("/document/api")
public class DocumentController {
	
	  @Autowired
	    private DocumentRepo documentRepo;
	    
	    @Autowired
	    private DocumentService documentService;
	    
	    @PostMapping("/create")
	    public Document createDocument(@RequestBody DocumentRequest documentRequest){
	        return documentRepo.save(documentRequest.getDocument());
	    }
	    
	    @GetMapping("/findAllDivision")   
	    public List<Document> findAllDivision(){
	        return documentRepo.findAll();
	    }

	    @GetMapping("/GetBy/{id}")
	    public Document getDocumentById(@PathVariable Long id) {
	        return documentService.getDocumentById(id);
	    }
	    @PutMapping("/update/{id}")
	    public Document updateDocument(@PathVariable long id, @RequestBody Document document) {
	    	return documentService.updateDocument(id, document);
	 	   
	    }

}
