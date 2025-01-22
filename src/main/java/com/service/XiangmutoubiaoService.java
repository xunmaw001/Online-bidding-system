package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiangmutoubiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiangmutoubiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiangmutoubiaoView;


/**
 * 项目投标
 *
 * @author 
 * @email 
 * @date 2022-04-26 17:57:38
 */
public interface XiangmutoubiaoService extends IService<XiangmutoubiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiangmutoubiaoVO> selectListVO(Wrapper<XiangmutoubiaoEntity> wrapper);
   	
   	XiangmutoubiaoVO selectVO(@Param("ew") Wrapper<XiangmutoubiaoEntity> wrapper);
   	
   	List<XiangmutoubiaoView> selectListView(Wrapper<XiangmutoubiaoEntity> wrapper);
   	
   	XiangmutoubiaoView selectView(@Param("ew") Wrapper<XiangmutoubiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiangmutoubiaoEntity> wrapper);
   	

}

