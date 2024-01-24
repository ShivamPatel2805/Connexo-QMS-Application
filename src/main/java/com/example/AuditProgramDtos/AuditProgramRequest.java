package com.example.AuditProgramDtos;


import com.example.AuditProgramEntity.AuditProgram;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AuditProgramRequest {
	
	private AuditProgram auditProgram;

}
