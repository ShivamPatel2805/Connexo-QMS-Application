package com.example.ExternalAuditDtos;

import com.example.ExternalAuditEntity.ExternalAuditMain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ExternalAuditRequest {
    private ExternalAuditMain externalAuditMain;
}
