package com.dao;

import com.entity.XiangmutoubiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiangmutoubiaoVO;
import com.entity.view.XiangmutoubiaoView;


/**
 * 项目投标
 * 
 * @author 
 * @email 
 * @date 2022-04-26 17:57:38
 */
public interface XiangmutoubiaoDao extends BaseMapper<XiangmutoubiaoEntity> {
	
	List<XiangmutoubiaoVO> selectListVO(@Param("ew") Wrapper<XiangmutoubiaoEntity> wrapper);
	
	XiangmutoubiaoVO selectVO(@Param("ew") Wrapper<XiangmutoubiaoEntity> wrapper);
	
	List<XiangmutoubiaoView> selectListView(@Param("ew") Wrapper<XiangmutoubiaoEntity> wrapper);

	List<XiangmutoubiaoView> selectListView(Pagination page,@Param("ew") Wrapper<XiangmutoubiaoEntity> wrapper);
	
	XiangmutoubiaoView selectView(@Param("ew") Wrapper<XiangmutoubiaoEntity> wrapper);
	

}
