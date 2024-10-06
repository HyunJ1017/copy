package edu.kh.daemoim.groupManage.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import edu.kh.daemoim.groupManage.dto.Category;
import edu.kh.daemoim.groupManage.dto.CategoryList;
import edu.kh.daemoim.groupManage.dto.GroupManageDto;
import edu.kh.daemoim.groupManage.mapper.GroupManageMapper;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Transactional
@Service
public class GroupManageServiceImpl implements GroupManageService {
	
	private final GroupManageMapper mapper;

	// 모임이름 중복검사
	@Override
	public int groupNameCheck(String inputName) {
		return mapper.groupNameCheck(inputName);
	}

	// 카테고리 리스트 검색
	@Override
	public List<CategoryList> getCategoryList(int categoryNo) {
		return mapper.getCategoryList(categoryNo);
	}
	
	// 카테고리 검색
	@Override
	public List<Category> getCategoryArr() {
		return mapper.getCategoryArr();
	}
	
	// 그룹 생성
	@Override
	public int createGroup(GroupManageDto inputGroup, MultipartFile groupImg) {
		return 0;
	}

}
