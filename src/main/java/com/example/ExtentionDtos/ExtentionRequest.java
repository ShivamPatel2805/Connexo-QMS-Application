package com.example.ExtentionDtos;


import com.example.ExtentionEntity.Extention;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ExtentionRequest {
	
	private Extention extention;

}
