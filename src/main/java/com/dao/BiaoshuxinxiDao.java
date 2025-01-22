package com.dao;

import com.entity.BiaoshuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BiaoshuxinxiVO;
import com.entity.view.BiaoshuxinxiView;


/**
 * 标书信息
 * 
 * @author 
 * @email 
 * @date 2022-04-26 17:57:38
 */
public interface BiaoshuxinxiDao extends BaseMapper<BiaoshuxinxiEntity> {
	
	List<BiaoshuxinxiVO> selectListVO(@Param("ew") Wrapper<BiaoshuxinxiEntity> wrapper);
	
	BiaoshuxinxiVO selectVO(@Param("ew") Wrapper<BiaoshuxinxiEntity> wrapper);
	
	List<BiaoshuxinxiView> selectListView(@Param("ew") Wrapper<BiaoshuxinxiEntity> wrapper);

	List<BiaoshuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<BiaoshuxinxiEntity> wrapper);
	
	BiaoshuxinxiView selectView(@Param("ew") Wrapper<BiaoshuxinxiEntity> wrapper);
	

}
