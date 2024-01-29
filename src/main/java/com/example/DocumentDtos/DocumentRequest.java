package com.example.DocumentDtos;


import com.example.DocumentEntity.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DocumentRequest {
	
	private Document document;

}
