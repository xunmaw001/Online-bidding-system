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


import com.dao.BiaoshuxinxiDao;
import com.entity.BiaoshuxinxiEntity;
import com.service.BiaoshuxinxiService;
import com.entity.vo.BiaoshuxinxiVO;
import com.entity.view.BiaoshuxinxiView;

@Service("biaoshuxinxiService")
public class BiaoshuxinxiServiceImpl extends ServiceImpl<BiaoshuxinxiDao, BiaoshuxinxiEntity> implements BiaoshuxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BiaoshuxinxiEntity> page = this.selectPage(
                new Query<BiaoshuxinxiEntity>(params).getPage(),
                new EntityWrapper<BiaoshuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BiaoshuxinxiEntity> wrapper) {
		  Page<BiaoshuxinxiView> page =new Query<BiaoshuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BiaoshuxinxiVO> selectListVO(Wrapper<BiaoshuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BiaoshuxinxiVO selectVO(Wrapper<BiaoshuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BiaoshuxinxiView> selectListView(Wrapper<BiaoshuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BiaoshuxinxiView selectView(Wrapper<BiaoshuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
