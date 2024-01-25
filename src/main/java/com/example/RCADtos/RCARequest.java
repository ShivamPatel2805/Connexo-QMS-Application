package com.example.RCADtos;


import com.example.RCAEntity.RCAmain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RCARequest {
    private RCAmain rcAmain;
}
