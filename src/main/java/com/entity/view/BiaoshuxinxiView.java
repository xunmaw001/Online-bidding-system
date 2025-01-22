package com.entity.view;

import com.entity.BiaoshuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 标书信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-26 17:57:38
 */
@TableName("biaoshuxinxi")
public class BiaoshuxinxiView  extends BiaoshuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BiaoshuxinxiView(){
	}
 
 	public BiaoshuxinxiView(BiaoshuxinxiEntity biaoshuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, biaoshuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
