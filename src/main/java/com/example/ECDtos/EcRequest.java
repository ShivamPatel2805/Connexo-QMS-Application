package com.example.ECDtos;

import com.example.ECEntity.ECmain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EcRequest {
    private ECmain eCmain;
}
