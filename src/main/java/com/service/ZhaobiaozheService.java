package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhaobiaozheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhaobiaozheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhaobiaozheView;


/**
 * 招标者
 *
 * @author 
 * @email 
 * @date 2022-04-26 17:57:38
 */
public interface ZhaobiaozheService extends IService<ZhaobiaozheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhaobiaozheVO> selectListVO(Wrapper<ZhaobiaozheEntity> wrapper);
   	
   	ZhaobiaozheVO selectVO(@Param("ew") Wrapper<ZhaobiaozheEntity> wrapper);
   	
   	List<ZhaobiaozheView> selectListView(Wrapper<ZhaobiaozheEntity> wrapper);
   	
   	ZhaobiaozheView selectView(@Param("ew") Wrapper<ZhaobiaozheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhaobiaozheEntity> wrapper);
   	

}

