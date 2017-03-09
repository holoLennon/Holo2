package com.holo.study;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
/**
 * 这里主要是配置文件获取的配置，通常配置，每个项目/模式都要变的
 * @author Administrator
 *
 */
@Component
@ConfigurationProperties(prefix="prop.sys",locations = "classpath:application.yml")
public class PropSys {

    /**项目名*/
    String sysname;
    /**根目录名，通常是项目名，偶尔有意外 ex./bbb or "" 根目录用空格不要用/ 通常给FTL页面用 */
    String base;   
    /**域名 ex.http://aaa.com */
    String website;
	/**网站根域名 ex.xxx.com*/
	private String rootdomain;
	/**网站域名 ex.http://www.xxx.com*/
	private String domain;
	/**网站英文名*/
	private String webnamee;
	/**网站中文名*/
	private String webnamec;
	/**资源管理器验证码*/
	private String zresmd5pwd;
    /**开发模式，0/-1表示非开发，大于0表示为开发者userId*/
    int devmode=0;
	public String getSysname() {
		return sysname;
	}
	public void setSysname(String sysname) {
		this.sysname = sysname;
	}
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getRootdomain() {
		return rootdomain;
	}
	public void setRootdomain(String rootdomain) {
		this.rootdomain = rootdomain;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getWebnamee() {
		return webnamee;
	}
	public void setWebnamee(String webnamee) {
		this.webnamee = webnamee;
	}
	public String getWebnamec() {
		return webnamec;
	}
	public void setWebnamec(String webnamec) {
		this.webnamec = webnamec;
	}
	public String getZresmd5pwd() {
		return zresmd5pwd;
	}
	public void setZresmd5pwd(String zresmd5pwd) {
		this.zresmd5pwd = zresmd5pwd;
	}
	public int getDevmode() {
		return devmode;
	}
	public void setDevmode(int devmode) {
		this.devmode = devmode;
	}
	@Override
	public String toString() {
		return "PropSys [sysname=" + sysname + ", base=" + base + ", website="
				+ website + ", rootdomain=" + rootdomain + ", domain=" + domain
				+ ", webnamee=" + webnamee + ", webnamec=" + webnamec
				+ ", zresmd5pwd=" + zresmd5pwd + ", devmode=" + devmode + "]";
	}
    
}
