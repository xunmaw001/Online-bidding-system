package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BiaoshuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BiaoshuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BiaoshuxinxiView;


/**
 * 标书信息
 *
 * @author 
 * @email 
 * @date 2022-04-26 17:57:38
 */
public interface BiaoshuxinxiService extends IService<BiaoshuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BiaoshuxinxiVO> selectListVO(Wrapper<BiaoshuxinxiEntity> wrapper);
   	
   	BiaoshuxinxiVO selectVO(@Param("ew") Wrapper<BiaoshuxinxiEntity> wrapper);
   	
   	List<BiaoshuxinxiView> selectListView(Wrapper<BiaoshuxinxiEntity> wrapper);
   	
   	BiaoshuxinxiView selectView(@Param("ew") Wrapper<BiaoshuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BiaoshuxinxiEntity> wrapper);
   	

}

