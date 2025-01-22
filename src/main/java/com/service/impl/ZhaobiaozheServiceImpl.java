package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZhaobiaozheDao;
import com.entity.ZhaobiaozheEntity;
import com.service.ZhaobiaozheService;
import com.entity.vo.ZhaobiaozheVO;
import com.entity.view.ZhaobiaozheView;

@Service("zhaobiaozheService")
public class ZhaobiaozheServiceImpl extends ServiceImpl<ZhaobiaozheDao, ZhaobiaozheEntity> implements ZhaobiaozheService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhaobiaozheEntity> page = this.selectPage(
                new Query<ZhaobiaozheEntity>(params).getPage(),
                new EntityWrapper<ZhaobiaozheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhaobiaozheEntity> wrapper) {
		  Page<ZhaobiaozheView> page =new Query<ZhaobiaozheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhaobiaozheVO> selectListVO(Wrapper<ZhaobiaozheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhaobiaozheVO selectVO(Wrapper<ZhaobiaozheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhaobiaozheView> selectListView(Wrapper<ZhaobiaozheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhaobiaozheView selectView(Wrapper<ZhaobiaozheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
