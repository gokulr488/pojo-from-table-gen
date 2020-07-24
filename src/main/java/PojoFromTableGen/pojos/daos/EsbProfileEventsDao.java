package PojoFromTableGen.pojos.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import PojoFromTableGen.pojos.dos.EsbProfileEventsDo;

public class EsbProfileEventsDao {

	//TODO add where conditions accordingly
	private static final String selectQuery = "SELECT PROFILE_ID,PROFILE_TYPE,SUBSCRIBER_CATEGORY,SUBSCRIBER_SUB_CATEGORY,RISK_CATEGORY,PARENT_PROFILE_ID,APPLICATION_MODE,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,GENDER,OCCUPATION,LANGUAGE_ID,NATIONALITY,ORGANISATION,BUSINESS_TYPE,COMPANY_REGISTRATION_ID,EMPLOYED_DATE,EMAIL_NOTIFICATION,NOTIFICATION_EMAIL_ID,SMS_NOTIFICATION,SMS_NUMBERS,CONTACT_NUMBER_1,CONTACT_NUMBER_2,FAX,CONTACT_EMAIL_ID,BILL_CURRENCY,PREFERRED_CURRENCY,STATEMENT_ENABLED,TAX_CODE,BILL_CYCLE_ID,CREATE_USER,MODIFY_USER,CREATE_DATE,TITLE,MODIFY_DATE,ENTITY_ID,VAT_NO,COMMENTS,CUSTOMER_TYPE,POSID,TEAMID,THIRD_PARTY_LOGIN,CONTRACTID,OWNER_GROUP_ID,SECURE_CUSTOMER,WHOLESALE_CUSTOMER,BRANCH,COMPANY_NAME,COMPANY_ID,OP_PARAM_1,OP_PARAM_2,OP_PARAM_3,OP_PARAM_4,OP_PARAM_5,OP_PARAM_6,OP_PARAM_7,OP_PARAM_8,OP_PARAM_9,OP_PARAM_10,LAST_NAME_OL,MIDDLE_NAME_OL,FIRST_NAME_OL,COMPANY_NAME_OL,OPERATOR_CONTACT_ID1,OPERATOR_CONTACT_ID2,MIDDLE_NAME,UPDATE_DATE,STATUS,DEACTIVATION_DATE,SHORT_NAME,MIGRATION_OWNER,BUSINESS_LICENCE_NUMBER,SALUTATION,TIN_NO,VRN,M2M_STATUS "
			+ "FROM ESB_PROFILE_EVENTS WHERE PROFILE_ID = ?";

	public List<EsbProfileEventsDo> findBy(long profileId, Connection conn) {
		try (PreparedStatement stmt = conn.prepareStatement(selectQuery)) {
			stmt.setLong(1, profileId);

			List<EsbProfileEventsDo> dos = new ArrayList<EsbProfileEventsDo>();

			ResultSet res = stmt.executeQuery();
			while (res.next()) {
				EsbProfileEventsDo eventsDo = new EsbProfileEventsDo();
				eventsDo.setProfileId(res.getLong("PROFILE_ID"));
				eventsDo.setProfileType(res.getLong("PROFILE_TYPE"));
				eventsDo.setSubscriberCategory(res.getLong("SUBSCRIBER_CATEGORY"));
				eventsDo.setSubscriberSubCategory(res.getLong("SUBSCRIBER_SUB_CATEGORY"));
				eventsDo.setRiskCategory(res.getLong("RISK_CATEGORY"));
				eventsDo.setParentProfileId(res.getLong("PARENT_PROFILE_ID"));
				eventsDo.setApplicationMode(res.getString("APPLICATION_MODE"));
				eventsDo.setFirstName(res.getString("FIRST_NAME"));
				eventsDo.setLastName(res.getString("LAST_NAME"));
				eventsDo.setDateOfBirth(res.getDate("DATE_OF_BIRTH"));
				eventsDo.setGender(res.getLong("GENDER"));
				eventsDo.setOccupation(res.getString("OCCUPATION"));
				eventsDo.setLanguageId(res.getLong("LANGUAGE_ID"));
				eventsDo.setNationality(res.getString("NATIONALITY"));
				eventsDo.setOrganisation(res.getString("ORGANISATION"));
				eventsDo.setBusinessType(res.getString("BUSINESS_TYPE"));
				eventsDo.setCompanyRegistrationId(res.getString("COMPANY_REGISTRATION_ID"));
				eventsDo.setEmployedDate(res.getString("EMPLOYED_DATE"));
				eventsDo.setEmailNotification(res.getLong("EMAIL_NOTIFICATION"));
				eventsDo.setNotificationEmailId(res.getString("NOTIFICATION_EMAIL_ID"));
				eventsDo.setSmsNotification(res.getLong("SMS_NOTIFICATION"));
				eventsDo.setSmsNumbers(res.getString("SMS_NUMBERS"));
				eventsDo.setContactNumber1(res.getString("CONTACT_NUMBER_1"));
				eventsDo.setContactNumber2(res.getString("CONTACT_NUMBER_2"));
				eventsDo.setFax(res.getString("FAX"));
				eventsDo.setContactEmailId(res.getString("CONTACT_EMAIL_ID"));
				eventsDo.setBillCurrency(res.getString("BILL_CURRENCY"));
				eventsDo.setPreferredCurrency(res.getString("PREFERRED_CURRENCY"));
				eventsDo.setStatementEnabled(res.getLong("STATEMENT_ENABLED"));
				eventsDo.setTaxCode(res.getLong("TAX_CODE"));
				eventsDo.setBillCycleId(res.getLong("BILL_CYCLE_ID"));
				eventsDo.setCreateUser(res.getString("CREATE_USER"));
				eventsDo.setModifyUser(res.getString("MODIFY_USER"));
				eventsDo.setCreateDate(res.getDate("CREATE_DATE"));
				eventsDo.setTitle(res.getString("TITLE"));
				eventsDo.setModifyDate(res.getDate("MODIFY_DATE"));
				eventsDo.setEntityId(res.getLong("ENTITY_ID"));
				eventsDo.setVatNo(res.getString("VAT_NO"));
				eventsDo.setComments(res.getString("COMMENTS"));
				eventsDo.setCustomerType(res.getString("CUSTOMER_TYPE"));
				eventsDo.setPosid(res.getString("POSID"));
				eventsDo.setTeamid(res.getString("TEAMID"));
				eventsDo.setThirdPartyLogin(res.getString("THIRD_PARTY_LOGIN"));
				eventsDo.setContractid(res.getString("CONTRACTID"));
				eventsDo.setOwnerGroupId(res.getString("OWNER_GROUP_ID"));
				eventsDo.setSecureCustomer(res.getString("SECURE_CUSTOMER"));
				eventsDo.setWholesaleCustomer(res.getString("WHOLESALE_CUSTOMER"));
				eventsDo.setBranch(res.getString("BRANCH"));
				eventsDo.setCompanyName(res.getString("COMPANY_NAME"));
				eventsDo.setCompanyId(res.getString("COMPANY_ID"));
				eventsDo.setOpParam1(res.getString("OP_PARAM_1"));
				eventsDo.setOpParam2(res.getString("OP_PARAM_2"));
				eventsDo.setOpParam3(res.getString("OP_PARAM_3"));
				eventsDo.setOpParam4(res.getString("OP_PARAM_4"));
				eventsDo.setOpParam5(res.getString("OP_PARAM_5"));
				eventsDo.setOpParam6(res.getString("OP_PARAM_6"));
				eventsDo.setOpParam7(res.getString("OP_PARAM_7"));
				eventsDo.setOpParam8(res.getString("OP_PARAM_8"));
				eventsDo.setOpParam9(res.getString("OP_PARAM_9"));
				eventsDo.setOpParam10(res.getString("OP_PARAM_10"));
				eventsDo.setLastNameOl(res.getString("LAST_NAME_OL"));
				eventsDo.setMiddleNameOl(res.getString("MIDDLE_NAME_OL"));
				eventsDo.setFirstNameOl(res.getString("FIRST_NAME_OL"));
				eventsDo.setCompanyNameOl(res.getString("COMPANY_NAME_OL"));
				eventsDo.setOperatorContactId1(res.getString("OPERATOR_CONTACT_ID1"));
				eventsDo.setOperatorContactId2(res.getString("OPERATOR_CONTACT_ID2"));
				eventsDo.setMiddleName(res.getString("MIDDLE_NAME"));
				eventsDo.setUpdateDate(res.getTimestamp("UPDATE_DATE"));
				eventsDo.setStatus(res.getLong("STATUS"));
				eventsDo.setDeactivationDate(res.getDate("DEACTIVATION_DATE"));
				eventsDo.setShortName(res.getString("SHORT_NAME"));
				eventsDo.setMigrationOwner(res.getString("MIGRATION_OWNER"));
				eventsDo.setBusinessLicenceNumber(res.getString("BUSINESS_LICENCE_NUMBER"));
				eventsDo.setSalutation(res.getString("SALUTATION"));
				eventsDo.setTinNo(res.getString("TIN_NO"));
				eventsDo.setVrn(res.getString("VRN"));
				eventsDo.setM2mStatus(res.getLong("M2M_STATUS"));

				dos.add(eventsDo);
			}

			return dos;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
