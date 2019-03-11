package com.ctbcbank.pcms.rtn;

import org.dom4j.Document;
import org.dom4j.Element;
import org.springframework.stereotype.Service;

import com.ctbcbank.pcms.form.Form067311;
import com.ctbcbank.pcms.htg.BaseForm;

@Service
public class Rtn067311 extends RtnBase {

	@Override
	public boolean msgParser(Document document, BaseForm form) throws Exception {

		Element elementValue;

		Form067311 fm = (Form067311) form;

		String temp = document.valueOf("hostgateway/line[@no='1']/msgBody/data[@id='outputCode']/@value");
		int j = 0;
		if (!temp.equals("03")) {
			j = 2;
		} else {
			j = 1;
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='ID']");
		if (elementValue != null) {
			fm.setId(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='ID']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='NAME']");
		if (elementValue != null) {
			fm.setName(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='NAME']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='BIRTH_DATE']");
		if (elementValue != null) {
			fm.setBirthDate(
					document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='BIRTH_DATE']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='KIND_A']");
		if (elementValue != null) {
			fm.setKindA(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='KIND_A']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='KIND_B']");
		if (elementValue != null) {
			fm.setKindB(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='KIND_B']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='KIND_C']");
		if (elementValue != null) {
			fm.setKindC(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='KIND_C']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='DOCU_STATUS']");
		if (elementValue != null) {
			fm.setDocuStatus(
					document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='DOCU_STATUS']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='INFORM_DT']");
		if (elementValue != null) {
			fm.setInformDt(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='INFORM_DT']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='RECEIVE_DT']");
		if (elementValue != null) {
			fm.setReceiveDt(
					document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='RECEIVE_DT']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='RECALCITRANT_DT']");
		if (elementValue != null) {
			fm.setRecalcitrantDt(
					document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='RECALCITRANT_DT']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='DOCU_BRCH']");
		if (elementValue != null) {
			fm.setDocuBrch(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='DOCU_BRCH']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='FATCA_TELLER']");
		if (elementValue != null) {
			fm.setFatcaTeller(
					document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='FATCA_TELLER']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='FATCA_DOCU']");
		if (elementValue != null) {
			fm.setFatcaDocu(
					document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='FATCA_DOCU']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='FATCA_DOCU_KIND']");
		if (elementValue != null) {
			fm.setFatcaDocuKind(
					document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='FATCA_DOCU_KIND']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='FATCA_IDENTITY']");
		if (elementValue != null) {
			fm.setFatcaIdentity(
					document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='FATCA_IDENTITY']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='TAX_NO']");
		if (elementValue != null) {
			fm.setTaxNo(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='TAX_NO']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='NAME1']");
		if (elementValue != null) {
			fm.setName1(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='NAME1']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='STREET1']");
		if (elementValue != null) {
			fm.setStreet1(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='STREET1']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='STREET2']");
		if (elementValue != null) {
			fm.setStreet2(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='STREET2']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='CITY']");
		if (elementValue != null) {
			fm.setCity(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='CITY']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='STATE']");
		if (elementValue != null) {
			fm.setState(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='STATE']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='COUNTRY']");
		if (elementValue != null) {
			fm.setCountry(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='COUNTRY']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='POSTCODE']");
		if (elementValue != null) {
			fm.setPostcode(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='POSTCODE']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='GIIN']");
		if (elementValue != null) {
			fm.setGiin(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='GIIN']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='EIN']");
		if (elementValue != null) {
			fm.setEin(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='EIN']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='RECALCITRANT_TYPE']");
		if (elementValue != null) {
			fm.setRecalcitrantType(
					document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='RECALCITRANT_TYPE']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='FATCA_SOURCE']");
		if (elementValue != null) {
			fm.setFatcaSource(
					document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='FATCA_SOURCE']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='CUST_NO']");
		if (elementValue != null) {
			fm.setCustNo(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='CUST_NO']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='SOURC_ETYPE']");
		if (elementValue != null) {
			fm.setSourcEtype(
					document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='SOURC_ETYPE']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='W_TYPE']");
		if (elementValue != null) {
			fm.setWType(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='W_TYPE']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='EXEMPTION_CODE']");
		if (elementValue != null) {
			fm.setExemptionCode(
					document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='EXEMPTION_CODE']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='ACTION_CODE']");
		if (elementValue != null) {
			fm.setActionCode(
					document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='ACTION_CODE']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='TAX_NO_NONUSA']");
		if (elementValue != null) {
			fm.setTaxNoNonusa(
					document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='TAX_NO_NONUSA']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='TAX_NO_COUNTRY']");
		if (elementValue != null) {
			fm.setTaxNoCountry(
					document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='TAX_NO_COUNTRY']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='CRS_DOCU_TYPE']");
		if (elementValue != null) {
			fm.setCrsDocuType(
					document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='CRS_DOCU_TYPE']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='CRS_RECEIVE_DT']");
		if (elementValue != null) {
			fm.setCrsReceiveDt(
					document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='CRS_RECEIVE_DT']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='CRS_DOCU_BRCH']");
		if (elementValue != null) {
			fm.setCrsDocuBrch(
					document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='CRS_DOCU_BRCH']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='CRS_DOCU_TELLER']");
		if (elementValue != null) {
			fm.setCrsDocuTeller(
					document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='CRS_DOCU_TELLER']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='TAX_RESIDENT']");
		if (elementValue != null) {
			fm.setTaxResident(
					document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='TAX_RESIDENT']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='COUNTRY1']");
		if (elementValue != null) {
			fm.setCountry1(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='COUNTRY1']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='TIN1']");
		if (elementValue != null) {
			fm.setTin1(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='TIN1']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='NO_TIN_REASON1']");
		if (elementValue != null) {
			fm.setNoTinReason1(
					document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='NO_TIN_REASON1']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='ID_TYPE1']");
		if (elementValue != null) {
			fm.setIdType1(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='ID_TYPE1']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='COUNTRY2']");
		if (elementValue != null) {
			fm.setCountry2(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='COUNTRY2']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='TIN2']");
		if (elementValue != null) {
			fm.setTin2(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='TIN2']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='NO_TIN_REASON2']");
		if (elementValue != null) {
			fm.setNoTinReason2(
					document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='NO_TIN_REASON2']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='ID_TYPE2']");
		if (elementValue != null) {
			fm.setIdType2(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='ID_TYPE2']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='COUNTRY3']");
		if (elementValue != null) {
			fm.setCountry3(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='COUNTRY3']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='TIN3']");
		if (elementValue != null) {
			fm.setTin3(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='TIN3']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='NO_TIN_REASON3']");
		if (elementValue != null) {
			fm.setNoTinReason3(
					document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='NO_TIN_REASON3']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='ID_TYPE3']");
		if (elementValue != null) {
			fm.setIdType3(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='ID_TYPE3']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='COUNTRY4']");
		if (elementValue != null) {
			fm.setCountry4(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='COUNTRY4']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='TIN4']");
		if (elementValue != null) {
			fm.setTin4(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='TIN4']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='NO_TIN_REASON4']");
		if (elementValue != null) {
			fm.setNoTinReason4(
					document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='NO_TIN_REASON4']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='ID_TYPE4']");
		if (elementValue != null) {
			fm.setIdType4(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='ID_TYPE4']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='COUNTRY5']");
		if (elementValue != null) {
			fm.setCountry5(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='COUNTRY5']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='TIN5']");
		if (elementValue != null) {
			fm.setTin5(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='TIN5']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='NO_TIN_REASON5']");
		if (elementValue != null) {
			fm.setNoTinReason5(
					document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='NO_TIN_REASON5']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='ID_TYPE5']");
		if (elementValue != null) {
			fm.setIdType5(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='ID_TYPE5']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='CRS_SOURCE']");
		if (elementValue != null) {
			fm.setCrsSource(
					document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='CRS_SOURCE']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='MANAGE_DT']");
		if (elementValue != null) {
			fm.setManageDt(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='MANAGE_DT']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='MANAGE_DOCU_BRCH']");
		if (elementValue != null) {
			fm.setManageDocuBrch(
					document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='MANAGE_DOCU_BRCH']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='MANAGE_DOCU_TELLER']");
		if (elementValue != null) {
			fm.setManageDocuTeller(document
					.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='MANAGE_DOCU_TELLER']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='ABAND_DOCU']");
		if (elementValue != null) {
			fm.setAbandDocu(
					document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='ABAND_DOCU']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='BIRTH_COUNTRY']");
		if (elementValue != null) {
			fm.setBirthCountry(
					document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='BIRTH_COUNTRY']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='BIRTH_CITY']");
		if (elementValue != null) {
			fm.setBirthCity(
					document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='BIRTH_CITY']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='COMM_ADD1']");
		if (elementValue != null) {
			fm.setCommAdd1(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='COMM_ADD1']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='COMM_ADD2']");
		if (elementValue != null) {
			fm.setCommAdd2(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='COMM_ADD2']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='COMM_ADD3']");
		if (elementValue != null) {
			fm.setCommAdd3(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='COMM_ADD3']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='COMM_ADD4']");
		if (elementValue != null) {
			fm.setCommAdd4(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='COMM_ADD4']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='COMM_ADD5']");
		if (elementValue != null) {
			fm.setCommAdd5(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='COMM_ADD5']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='COMM_POSTCODE']");
		if (elementValue != null) {
			fm.setCommPostcode(
					document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='COMM_POSTCODE']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='ENTITY_TYPE']");
		if (elementValue != null) {
			fm.setEntityType(
					document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='ENTITY_TYPE']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='IDEN_CONTROLLER']");
		if (elementValue != null) {
			fm.setIdenController(
					document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='IDEN_CONTROLLER']/@value"));
		}

		elementValue = (Element) document.selectSingleNode("hostgateway/line/msgBody/data[@id='PCMS_FLAG']");
		if (elementValue != null) {
			fm.setPcmsFlag(document.valueOf("hostgateway/line[@no='" + j + "']/msgBody/data[@id='PCMS_FLAG']/@value"));
		}

		return true;
	}
}
