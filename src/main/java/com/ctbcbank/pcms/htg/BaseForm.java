package com.ctbcbank.pcms.htg;

import java.io.Serializable;

public class BaseForm implements Serializable,Cloneable {

	/**
	 * 序列化版本
	 */
	private static final long serialVersionUID = 1L;

    /**
     * 獲取agent
     */
    Agent agent = null;
    
    private String rspCode;
    private String trnNum;
    private String remitStatusDescr;
    private String jnlno;
    

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public BaseForm clone()
	{
		try {
			return (BaseForm)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void finalize(){
		try {
			super.finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	public String getJnlno() {
		return jnlno;
	}

	public void setJnlno(String jnlno) {
		this.jnlno = jnlno;
	}

	public String getRspCode() {
		return rspCode;
	}

	public void setRspCode(String rspCode) {
		this.rspCode = rspCode;
	}

	public String getTrnNum() {
		return trnNum;
	}

	public void setTrnNum(String trnNum) {
		this.trnNum = trnNum;
	}

	public String getRemitStatusDescr() {
		return remitStatusDescr;
	}

	public void setRemitStatusDescr(String remitStatusDescr) {
		this.remitStatusDescr = remitStatusDescr;
	}

}
