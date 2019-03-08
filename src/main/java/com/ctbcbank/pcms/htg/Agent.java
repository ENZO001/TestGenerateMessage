/**
 * agent 保存登入用戶的訊息
 */
package com.ctbcbank.pcms.htg;

public class Agent extends BaseForm {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 登錄用戶的Id
	 */
	private String agentId;
	/**
	 * 登錄用戶的密碼
	 */
	private String agentPassword;

	/**
	 * 登錄用戶的racf Id
	 */
	private String agentRacfId;

	/**
	 * 登錄用戶的racf 密碼
	 */
	private String agentRacfPassword;
	
	/**
	 * 登錄用戶的session id
	 */
	private String sessionId="";
	
	/**
	 * 分行別
	 */
	private String branchCode = null;
	/**
	 * 分機號
	 */
	private String fms_ext_no = null;
	private String fms_parm = null;
	// password expired
	private boolean fms_password_expired = false;
	private String aprt = "";
	
	public String getAprt() {
		return aprt;
	}

	public void setAprt(String aprt) {
		this.aprt = aprt;
	}

	public boolean isFms_password_expired() {
		return fms_password_expired;
	}

	public void setFms_password_expired(boolean fms_password_expired) {
		this.fms_password_expired = fms_password_expired;
	}

	public String getAgentPassword() {
		return agentPassword;
	}

	public void setAgentPassword(String agentPassword) {
		this.agentPassword = agentPassword;
	}

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgentRacfId() {
		return agentRacfId;
	}

	public void setAgentRacfId(String agentRacfId) {
		this.agentRacfId = agentRacfId;
	}

	public String getAgentRacfPassword() {
		return agentRacfPassword;
	}

	public void setAgentRacfPassword(String agentRacfPassword) {
		this.agentRacfPassword = agentRacfPassword;
	}

	public String getFms_parm() {
		return fms_parm;
	}

	public void setFms_parm(String fms_parm) {
		this.fms_parm = fms_parm;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getFms_ext_no() {
		return fms_ext_no;
	}

	public void setFms_ext_no(String fms_ext_no) {
		this.fms_ext_no = fms_ext_no;
	}
}
