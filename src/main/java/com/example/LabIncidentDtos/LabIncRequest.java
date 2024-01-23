package com.example.LabIncidentDtos;


import com.example.LabIncidentEntity.Labincident;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LabIncRequest {
    private Labincident labincident;
}
