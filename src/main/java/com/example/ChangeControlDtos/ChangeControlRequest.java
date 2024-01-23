package com.example.ChangeControlDtos;

import com.example.ChangeControlEntity.ChangeControl;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ChangeControlRequest {
    private ChangeControl changeControl;
}