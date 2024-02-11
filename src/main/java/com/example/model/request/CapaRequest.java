package com.example.model.request;

import com.example.database.capaEntity.CapaClosure;
import com.example.database.capaEntity.CapaDetails;
import com.example.database.entity.EntityMain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CapaRequest {

    private EntityMain entityMain;

    private CapaDetails capaDetails;

    private CapaClosure capaClosure;

}