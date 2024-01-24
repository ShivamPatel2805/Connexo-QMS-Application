package com.example.InternalAuditDtos;

import com.example.InternalAuditEntity.EntityMain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class InternalAudDtos {
    private EntityMain entityMain;
}
