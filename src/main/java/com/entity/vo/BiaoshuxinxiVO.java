package com.entity.vo;

import com.entity.BiaoshuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 标书信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-26 17:57:38
 */
public class BiaoshuxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 标书名称
	 */
	
	private String biaoshumingcheng;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 标书文件
	 */
	
	private String biaoshuwenjian;
		
	/**
	 * 标书内容
	 */
	
	private String biaoshuneirong;
		
	/**
	 * 上传日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shangchuanriqi;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：标书名称
	 */
	 
	public void setBiaoshumingcheng(String biaoshumingcheng) {
		this.biaoshumingcheng = biaoshumingcheng;
	}
	
	/**
	 * 获取：标书名称
	 */
	public String getBiaoshumingcheng() {
		return biaoshumingcheng;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：标书文件
	 */
	 
	public void setBiaoshuwenjian(String biaoshuwenjian) {
		this.biaoshuwenjian = biaoshuwenjian;
	}
	
	/**
	 * 获取：标书文件
	 */
	public String getBiaoshuwenjian() {
		return biaoshuwenjian;
	}
				
	
	/**
	 * 设置：标书内容
	 */
	 
	public void setBiaoshuneirong(String biaoshuneirong) {
		this.biaoshuneirong = biaoshuneirong;
	}
	
	/**
	 * 获取：标书内容
	 */
	public String getBiaoshuneirong() {
		return biaoshuneirong;
	}
				
	
	/**
	 * 设置：上传日期
	 */
	 
	public void setShangchuanriqi(Date shangchuanriqi) {
		this.shangchuanriqi = shangchuanriqi;
	}
	
	/**
	 * 获取：上传日期
	 */
	public Date getShangchuanriqi() {
		return shangchuanriqi;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
