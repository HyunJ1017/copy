package edu.kh.daemoim.groupManage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.kh.daemoim.groupManage.dto.Category;
import edu.kh.daemoim.groupManage.dto.CategoryList;

@Mapper
public interface GroupManageMapper {

	int groupNameCheck(String inputName);
	
	// 카테고리 리스트 검색
	List<CategoryList> getCategoryList(int categoryNo);

	// 카테고리 검색
	List<Category> getCategoryArr();

}
