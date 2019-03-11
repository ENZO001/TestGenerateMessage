package com.ctbcbank.pcms.rtn;


//import org.apache.commons.lang.StringUtils;
import org.dom4j.Document;



import com.ctbcbank.pcms.htg.BaseForm;
//import com.ctbcbank.pcms.htg.Constants;
//import com.ctbcbank.pcms.htg.HTGException;
//import com.ctbcbank.pcms.htg.SessionTimeoutException;

public abstract class RtnBase {
	
//	public void validate(Document document) throws HTGException {
//		
//		String rcValue = document.valueOf("hostgateway/header/rc/@value");
//		String msgType = document.valueOf("hostgateway/body/data[@id='MSGTYPE_OC01']/@value");
//		String msgValue = document.valueOf("hostgateway/body/msg/@value");
//		String errCause = document.valueOf("hostgateway/body/data[@id='HG_EXCEPTION_MSG']/@value");
//		
//		if (Constants.SESSION_TIMEOUT.equals(rcValue)) {
//			
//			throw new SessionTimeoutException(rcValue, "", msgValue, errCause);
//		}
//		
//		if (StringUtils.isEmpty(rcValue) == false) {
//			
//			throw new HTGException(rcValue, msgType, msgValue, errCause);
//		}
//	}
//	
//	public void headerParser(Document document, BaseForm form, int no) throws Exception{
//		String jnlno = document.valueOf("hostgateway/line[@no='" + no + "']/msgHeader/data[@id='JNLNO']/@value");
//		form.setJnlno(jnlno);
//	}
//	
	public abstract boolean msgParser(Document document, BaseForm form) throws Exception;
	
}
