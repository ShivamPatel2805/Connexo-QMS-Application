package com.example.ManagementReviewDtos;



import com.example.ManagementReviewEntity.ManagementReview;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ManagementReviewRequest {
	
	private ManagementReview managementReview;

}
