package com.ctbcbank.pcms.req;

import org.dom4j.Document;
import org.dom4j.Element;
import org.springframework.stereotype.Service;

import com.ctbcbank.pcms.form.Form067311;
import com.ctbcbank.pcms.htg.BaseForm;

@Service
public final class Req067311 extends ReqBase {

	@Override
	public Document fillxmlValue(Document document, BaseForm form, String sessionId) throws Exception {

		Element element;

		if (form instanceof Form067311) {
			Form067311 fm = (Form067311) form;

// set session id
			element = (Element) document.selectSingleNode("hostgateway/header/data[@id='sessionId']");
			element.addAttribute("value", sessionId);

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='ID']");
			element.addAttribute("value", fm.getId());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='NAME']");
			element.addAttribute("value", fm.getName());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='BIRTH_DATE']");
			element.addAttribute("value", fm.getBirthDate());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='KIND_A']");
			element.addAttribute("value", fm.getKindA());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='KIND_B']");
			element.addAttribute("value", fm.getKindB());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='KIND_C']");
			element.addAttribute("value", fm.getKindC());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='DOCU_STATUS']");
			element.addAttribute("value", fm.getDocuStatus());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='INFORM_DT']");
			element.addAttribute("value", fm.getInformDt());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='RECEIVE_DT']");
			element.addAttribute("value", fm.getReceiveDt());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='RECALCITRANT_DT']");
			element.addAttribute("value", fm.getRecalcitrantDt());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='DOCU_BRCH']");
			element.addAttribute("value", fm.getDocuBrch());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='FATCA_TELLER']");
			element.addAttribute("value", fm.getFatcaTeller());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='FATCA_DOCU']");
			element.addAttribute("value", fm.getFatcaDocu());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='FATCA_DOCU_KIND']");
			element.addAttribute("value", fm.getFatcaDocuKind());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='FATCA_IDENTITY']");
			element.addAttribute("value", fm.getFatcaIdentity());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='TAX_NO']");
			element.addAttribute("value", fm.getTaxNo());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='NAME1']");
			element.addAttribute("value", fm.getName1());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='STREET1']");
			element.addAttribute("value", fm.getStreet1());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='STREET2']");
			element.addAttribute("value", fm.getStreet2());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='CITY']");
			element.addAttribute("value", fm.getCity());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='STATE']");
			element.addAttribute("value", fm.getState());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='COUNTRY']");
			element.addAttribute("value", fm.getCountry());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='POSTCODE']");
			element.addAttribute("value", fm.getPostcode());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='GIIN']");
			element.addAttribute("value", fm.getGiin());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='EIN']");
			element.addAttribute("value", fm.getEin());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='RECALCITRANT_TYPE']");
			element.addAttribute("value", fm.getRecalcitrantType());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='FATCA_SOURCE']");
			element.addAttribute("value", fm.getFatcaSource());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='CUST_NO']");
			element.addAttribute("value", fm.getCustNo());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='SOURC_ETYPE']");
			element.addAttribute("value", fm.getSourcEtype());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='W_TYPE']");
			element.addAttribute("value", fm.getWType());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='EXEMPTION_CODE']");
			element.addAttribute("value", fm.getExemptionCode());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='ACTION_CODE']");
			element.addAttribute("value", fm.getActionCode());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='TAX_NO_NONUSA']");
			element.addAttribute("value", fm.getTaxNoNonusa());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='TAX_NO_COUNTRY']");
			element.addAttribute("value", fm.getTaxNoCountry());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='CRS_DOCU_TYPE']");
			element.addAttribute("value", fm.getCrsDocuType());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='CRS_RECEIVE_DT']");
			element.addAttribute("value", fm.getCrsReceiveDt());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='CRS_DOCU_BRCH']");
			element.addAttribute("value", fm.getCrsDocuBrch());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='CRS_DOCU_TELLER']");
			element.addAttribute("value", fm.getCrsDocuTeller());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='TAX_RESIDENT']");
			element.addAttribute("value", fm.getTaxResident());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='COUNTRY1']");
			element.addAttribute("value", fm.getCountry1());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='TIN1']");
			element.addAttribute("value", fm.getTin1());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='NO_TIN_REASON1']");
			element.addAttribute("value", fm.getNoTinReason1());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='ID_TYPE1']");
			element.addAttribute("value", fm.getIdType1());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='COUNTRY2']");
			element.addAttribute("value", fm.getCountry2());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='TIN2']");
			element.addAttribute("value", fm.getTin2());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='NO_TIN_REASON2']");
			element.addAttribute("value", fm.getNoTinReason2());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='ID_TYPE2']");
			element.addAttribute("value", fm.getIdType2());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='COUNTRY3']");
			element.addAttribute("value", fm.getCountry3());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='TIN3']");
			element.addAttribute("value", fm.getTin3());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='NO_TIN_REASON3']");
			element.addAttribute("value", fm.getNoTinReason3());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='ID_TYPE3']");
			element.addAttribute("value", fm.getIdType3());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='COUNTRY4']");
			element.addAttribute("value", fm.getCountry4());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='TIN4']");
			element.addAttribute("value", fm.getTin4());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='NO_TIN_REASON4']");
			element.addAttribute("value", fm.getNoTinReason4());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='ID_TYPE4']");
			element.addAttribute("value", fm.getIdType4());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='COUNTRY5']");
			element.addAttribute("value", fm.getCountry5());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='TIN5']");
			element.addAttribute("value", fm.getTin5());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='NO_TIN_REASON5']");
			element.addAttribute("value", fm.getNoTinReason5());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='ID_TYPE5']");
			element.addAttribute("value", fm.getIdType5());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='CRS_SOURCE']");
			element.addAttribute("value", fm.getCrsSource());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='MANAGE_DT']");
			element.addAttribute("value", fm.getManageDt());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='MANAGE_DOCU_BRCH']");
			element.addAttribute("value", fm.getManageDocuBrch());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='MANAGE_DOCU_TELLER']");
			element.addAttribute("value", fm.getManageDocuTeller());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='ABAND_DOCU']");
			element.addAttribute("value", fm.getAbandDocu());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='BIRTH_COUNTRY']");
			element.addAttribute("value", fm.getBirthCountry());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='BIRTH_CITY']");
			element.addAttribute("value", fm.getBirthCity());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='COMM_ADD1']");
			element.addAttribute("value", fm.getCommAdd1());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='COMM_ADD2']");
			element.addAttribute("value", fm.getCommAdd2());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='COMM_ADD3']");
			element.addAttribute("value", fm.getCommAdd3());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='COMM_ADD4']");
			element.addAttribute("value", fm.getCommAdd4());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='COMM_ADD5']");
			element.addAttribute("value", fm.getCommAdd5());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='COMM_POSTCODE']");
			element.addAttribute("value", fm.getCommPostcode());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='ENTITY_TYPE']");
			element.addAttribute("value", fm.getEntityType());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='IDEN_CONTROLLER']");
			element.addAttribute("value", fm.getIdenController());

			element = (Element) document.selectSingleNode("hostgateway/body/data[@id='PCMS_FLAG']");
			element.addAttribute("value", fm.getPcmsFlag());

		}
		return document;
	}
}
