package com.example.InternalAuditDtos;

import com.example.InternalAuditEntity.InternalEntityMain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class InternalAudDtos {
    private InternalEntityMain entityMain;
}
