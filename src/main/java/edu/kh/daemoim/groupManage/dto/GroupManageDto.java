package edu.kh.daemoim.groupManage.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class GroupManageDto {
	private int groupNo;
	private String groupName;
	private String groupDate;
	private String groupIntroduce;
	private int CategoryListNo;
	private int CategoryNo;
	
	//--------------------
	
	private int groupAdminNo;			// 모임 생성자 멤버넘버
	
	private int groupImgNo;				// 모임 대표이미지 넘버
	private String groupMainImgPath;	// 모임 대표이미지 요청경로
	private String groupMainOriginal;	// 모임 대표이미지 원본명
	private String groupMainRename;		// 모임 대표이미지 변경명
	
	
}
