package com.entity.vo;

import com.entity.XiangmutoubiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 项目投标
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-26 17:57:38
 */
public class XiangmutoubiaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 项目名称
	 */
	
	private String xiangmumingcheng;
		
	/**
	 * 投标文件
	 */
	
	private String toubiaowenjian;
		
	/**
	 * 招标金额
	 */
	
	private Integer zhaobiaojine;
		
	/**
	 * 投标金额
	 */
	
	private Integer toubiaojine;
		
	/**
	 * 投标内容
	 */
	
	private String toubiaoneirong;
		
	/**
	 * 投标日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date toubiaoriqi;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 招标账号
	 */
	
	private String zhaobiaozhanghao;
		
	/**
	 * 招标姓名
	 */
	
	private String zhaobiaoxingming;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：项目名称
	 */
	 
	public void setXiangmumingcheng(String xiangmumingcheng) {
		this.xiangmumingcheng = xiangmumingcheng;
	}
	
	/**
	 * 获取：项目名称
	 */
	public String getXiangmumingcheng() {
		return xiangmumingcheng;
	}
				
	
	/**
	 * 设置：投标文件
	 */
	 
	public void setToubiaowenjian(String toubiaowenjian) {
		this.toubiaowenjian = toubiaowenjian;
	}
	
	/**
	 * 获取：投标文件
	 */
	public String getToubiaowenjian() {
		return toubiaowenjian;
	}
				
	
	/**
	 * 设置：招标金额
	 */
	 
	public void setZhaobiaojine(Integer zhaobiaojine) {
		this.zhaobiaojine = zhaobiaojine;
	}
	
	/**
	 * 获取：招标金额
	 */
	public Integer getZhaobiaojine() {
		return zhaobiaojine;
	}
				
	
	/**
	 * 设置：投标金额
	 */
	 
	public void setToubiaojine(Integer toubiaojine) {
		this.toubiaojine = toubiaojine;
	}
	
	/**
	 * 获取：投标金额
	 */
	public Integer getToubiaojine() {
		return toubiaojine;
	}
				
	
	/**
	 * 设置：投标内容
	 */
	 
	public void setToubiaoneirong(String toubiaoneirong) {
		this.toubiaoneirong = toubiaoneirong;
	}
	
	/**
	 * 获取：投标内容
	 */
	public String getToubiaoneirong() {
		return toubiaoneirong;
	}
				
	
	/**
	 * 设置：投标日期
	 */
	 
	public void setToubiaoriqi(Date toubiaoriqi) {
		this.toubiaoriqi = toubiaoriqi;
	}
	
	/**
	 * 获取：投标日期
	 */
	public Date getToubiaoriqi() {
		return toubiaoriqi;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：招标账号
	 */
	 
	public void setZhaobiaozhanghao(String zhaobiaozhanghao) {
		this.zhaobiaozhanghao = zhaobiaozhanghao;
	}
	
	/**
	 * 获取：招标账号
	 */
	public String getZhaobiaozhanghao() {
		return zhaobiaozhanghao;
	}
				
	
	/**
	 * 设置：招标姓名
	 */
	 
	public void setZhaobiaoxingming(String zhaobiaoxingming) {
		this.zhaobiaoxingming = zhaobiaoxingming;
	}
	
	/**
	 * 获取：招标姓名
	 */
	public String getZhaobiaoxingming() {
		return zhaobiaoxingming;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
