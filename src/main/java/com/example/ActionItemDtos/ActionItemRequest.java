package com.example.ActionItemDtos;

import com.example.ActionItemEntity.ActionItem;
import com.example.ChangeControlDtos.ChangeControlRequest;
import com.example.ChangeControlEntity.ChangeControl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ActionItemRequest {

	private ActionItem actionItem;

}
