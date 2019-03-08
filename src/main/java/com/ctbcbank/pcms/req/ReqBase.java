/*
 * IR_SYS_12/30/2006 add
 * $Id: ReqBase3.java
 *
 */

package com.ctbcbank.pcms.req;

import org.dom4j.Document;

import com.ctbcbank.pcms.htg.BaseForm;


public abstract class ReqBase {
	public abstract Document fillxmlValue(Document document, BaseForm form, String sessionId) throws Exception;

}
