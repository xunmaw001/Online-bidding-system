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


import com.dao.XiangmutoubiaoDao;
import com.entity.XiangmutoubiaoEntity;
import com.service.XiangmutoubiaoService;
import com.entity.vo.XiangmutoubiaoVO;
import com.entity.view.XiangmutoubiaoView;

@Service("xiangmutoubiaoService")
public class XiangmutoubiaoServiceImpl extends ServiceImpl<XiangmutoubiaoDao, XiangmutoubiaoEntity> implements XiangmutoubiaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiangmutoubiaoEntity> page = this.selectPage(
                new Query<XiangmutoubiaoEntity>(params).getPage(),
                new EntityWrapper<XiangmutoubiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiangmutoubiaoEntity> wrapper) {
		  Page<XiangmutoubiaoView> page =new Query<XiangmutoubiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiangmutoubiaoVO> selectListVO(Wrapper<XiangmutoubiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiangmutoubiaoVO selectVO(Wrapper<XiangmutoubiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiangmutoubiaoView> selectListView(Wrapper<XiangmutoubiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiangmutoubiaoView selectView(Wrapper<XiangmutoubiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
