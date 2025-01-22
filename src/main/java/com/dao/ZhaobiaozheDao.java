package com.dao;

import com.entity.ZhaobiaozheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhaobiaozheVO;
import com.entity.view.ZhaobiaozheView;


/**
 * 招标者
 * 
 * @author 
 * @email 
 * @date 2022-04-26 17:57:38
 */
public interface ZhaobiaozheDao extends BaseMapper<ZhaobiaozheEntity> {
	
	List<ZhaobiaozheVO> selectListVO(@Param("ew") Wrapper<ZhaobiaozheEntity> wrapper);
	
	ZhaobiaozheVO selectVO(@Param("ew") Wrapper<ZhaobiaozheEntity> wrapper);
	
	List<ZhaobiaozheView> selectListView(@Param("ew") Wrapper<ZhaobiaozheEntity> wrapper);

	List<ZhaobiaozheView> selectListView(Pagination page,@Param("ew") Wrapper<ZhaobiaozheEntity> wrapper);
	
	ZhaobiaozheView selectView(@Param("ew") Wrapper<ZhaobiaozheEntity> wrapper);
	

}
