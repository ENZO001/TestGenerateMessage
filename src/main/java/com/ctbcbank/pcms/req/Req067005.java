package com.ctbcbank.pcms.req;

import org.dom4j.Document;
import org.dom4j.Element;
import org.springframework.stereotype.Service;

import com.ctbcbank.pcms.form.Form067005;
import com.ctbcbank.pcms.htg.BaseForm;

@Service
public final class Req067005 extends ReqBase {

	@Override
	public Document fillxmlValue(Document document, BaseForm form, String sessionId) throws Exception {

		Element element;

		if (form instanceof Form067005) {
			Form067005 fm = (Form067005) form;

			// set session id
			element = (Element) document.selectSingleNode("hostgateway/header/data[@id='sessionId']");
			element.addAttribute("value", sessionId);

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='CIF_NO']");
			element.addAttribute("value", fm.getCifNo());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='CUST_ID_NO']");
			element.addAttribute("value", fm.getCustIdNo());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='CUST_ID_TYP']");
			element.addAttribute("value", fm.getCustIdTyp());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='CUSTOMER_NAME']");
			element.addAttribute("value", fm.getCustomerName());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='DAYTEL_NO']");
			element.addAttribute("value", fm.getDaytelNo());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='DAYTEL_TXT']");
			element.addAttribute("value", fm.getDaytelTxt());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='DAYTEL_ERR_DATE']");
			element.addAttribute("value", fm.getDaytelErrDate());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='NIGTEL_NO']");
			element.addAttribute("value", fm.getNigtelNo());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='NIGTEL_EXT']");
			element.addAttribute("value", fm.getNigtelExt());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='NIGTEL_ERR_DATE']");
			element.addAttribute("value", fm.getNigtelErrDate());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='MOBIL_NO']");
			element.addAttribute("value", fm.getMobilNo());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='MOBIL_NO_EXT']");
			element.addAttribute("value", fm.getMobilNoExt());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='MOBIL_ERR_DATE']");
			element.addAttribute("value", fm.getMobilErrDate());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='POST_CODE']");
			element.addAttribute("value", fm.getPostCode());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='ADDR_ERR_DATE']");
			element.addAttribute("value", fm.getAddrErrDate());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='COMM_ADDR1']");
			element.addAttribute("value", fm.getCommAddr1());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='COMM_ADDR2']");
			element.addAttribute("value", fm.getCommAddr2());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='COMM_ADDR3']");
			element.addAttribute("value", fm.getCommAddr3());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='COMM_ADDR4']");
			element.addAttribute("value", fm.getCommAddr4());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='ZIP_CODE']");
			element.addAttribute("value", fm.getZipCode());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='ERR_DAT']");
			element.addAttribute("value", fm.getErrDat());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='CUST_ADD1']");
			element.addAttribute("value", fm.getCustAdd1());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='CUST_ADD2']");
			element.addAttribute("value", fm.getCustAdd2());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='CUST_ADD3']");
			element.addAttribute("value", fm.getCustAdd3());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='CUST_ADD4']");
			element.addAttribute("value", fm.getCustAdd4());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='EMAIL_ERR_DATE']");
			element.addAttribute("value", fm.getEmailErrDate());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='EMAIL_ADDR']");
			element.addAttribute("value", fm.getEmailAddr());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='PAGER_NO']");
			element.addAttribute("value", fm.getPagerNo());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='PAGER_NO_EXT']");
			element.addAttribute("value", fm.getPagerNoExt());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='PAGER_ERR_DATE']");
			element.addAttribute("value", fm.getPagerErrDate());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='OTHER_PERSON']");
			element.addAttribute("value", fm.getOtherPerson());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='MAIL_IND']");
			element.addAttribute("value", fm.getMailInd());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='FILLER6']");
			element.addAttribute("value", fm.getFiller6());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='DAYTEL_UPD_STS']");
			element.addAttribute("value", fm.getDaytelUpdSts());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='NIGTEL_UPD_STS']");
			element.addAttribute("value", fm.getNigtelUpdSts());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='MOBIL_UPD_STS']");
			element.addAttribute("value", fm.getMobilUpdSts());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='COMM_ADDR_UPD_STS']");
			element.addAttribute("value", fm.getCommAddrUpdSts());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='CUST_ADDR_UPD_STS']");
			element.addAttribute("value", fm.getCustAddrUpdSts());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='EMAIL_UPD_STS']");
			element.addAttribute("value", fm.getEmailUpdSts());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='PAGER_UPD_STS']");
			element.addAttribute("value", fm.getPagerUpdSts());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='REGTEL_NO']");
			element.addAttribute("value", fm.getRegtelNo());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='REGTEL_NO_EXT']");
			element.addAttribute("value", fm.getRegtelNoExt());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='REGTEL_UPD_STS']");
			element.addAttribute("value", fm.getRegtelUpdSts());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='REGTEL_UPD_DATE']");
			element.addAttribute("value", fm.getRegtelUpdDate());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='FUND_CIF']");
			element.addAttribute("value", fm.getFundCif());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='CONFIRM_DATA_DATE']");
			element.addAttribute("value", fm.getConfirmDataDate());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='CONF_FLAG']");
			element.addAttribute("value", fm.getConfFlag());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='DATE_OF_BIRTH']");
			element.addAttribute("value", fm.getDateOfBirth());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='BILL_TYPE']");
			element.addAttribute("value", fm.getBillType());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='ID_UPD_STS']");
			element.addAttribute("value", fm.getIdUpdSts());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='ID_UPD_DATE']");
			element.addAttribute("value", fm.getIdUpdDate());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='CUSTOMER_TYPE']");
			element.addAttribute("value", fm.getCustomerType());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='FUND']");
			element.addAttribute("value", fm.getFund());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='AUDIO_CODE']");
			element.addAttribute("value", fm.getAudioCode());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='VIP_DEGREE']");
			element.addAttribute("value", fm.getVipDegree());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='SEGMENT_CODE']");
			element.addAttribute("value", fm.getSegmentCode());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='UCODE']");
			element.addAttribute("value", fm.getUcode());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='COMM_NAT_CODE']");
			element.addAttribute("value", fm.getCommNatCode());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='REG_NAT_CODE']");
			element.addAttribute("value", fm.getRegNatCode());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='AML_REGISTRATION_NATION']");
			element.addAttribute("value", fm.getAmlRegistrationNation());

		}
		return document;
	}
}
