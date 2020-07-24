package PojoFromTableGen.pojos.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import PojoFromTableGen.pojos.dos.EsbQueueEventsDo;

public class EsbQueueEventsDao {

	//TODO add where conditions accordingly
	private static final String selectQuery = "SELECT SERVICE_TYPE_ID,ACCOUNT_ID,PROFILE_ID,SERVICE_CODE,SERVICE_NAME,RISK_CATEGORY,EMAIL_NOTIFICATION,NOTIFICATION_EMAIL_ID,SMS_NOTIFICATION,SMS_NUMBERS,CONNECTION_TYPE,SERVICE_FLAG,PRODUCT_CODE,SERVICE_ID,ACTIVATION_DATE,REGISTRATION_DATE,SIM_NUMBER,IMSI_NUMBER,CREDIT_LIMIT,DEPOSIT_AMOUNT,TITLE,FIRST_NAME,MIDDLE_NAME,LAST_NAME,INDIVIDUAL_FLAG,CONTRACT_START_DATE,CONTRACT_END_DATE,LANGUAGE_ID,ENTITY_ID,STATUS,ITEMIZED_REQUIRED,PAYMENT_PRIORITY,OUTSTANDING_AMOUNT,DUNNING_ENABLED,BILLED_AMOUNT,BILL_DUE_DATE,FROM_BILL_DATE,TO_BILL_DATE,LAST_BILL_RUN,BILL_CYCLE_ID,BILLTRIGGER_STATUS,BILLTRIGER_RETRY_COUNT,BILL_ID,CREDIT_CLASS,PENDING_PAYMENT_FEE,PREVIOUS_BALANCE,COMMENTS,POS_ID,CREDIT_AMOUNT,SERVICE_CHANGE_DATE,STATUS_CHANGE_DATE,RATE_PLAN_ID,RATE_PLAN_NAME,POS_NAME,USER_ID,SA_FORM_ID,CREATE_USER,SLA_LEVEL,CONTRACTID,SUSPENSION_REASON,IS_PARENT,PARENT_SEQ_ID,CREATE_DATE,INFRASTRUCTURE_TYPE,RESTORE_STATUS,ICC_ID,LINE_TYPE,DUNNING_REQUIRED,LAST_DUNNING_ACTION,INSTANCE_ID,REMARKS,TERMINATION_DATE,RESTORATION_DATE,SALES_REP_ID,SALES_REP_NAME,RESELLER_FLAG,HLR_PROFILE,HLR_ACCESS,BILL_CYCLE_DAY,PROFILE_FIRST_NAME,PROFILE_LAST_NAME,ACCOUNT_FIRST_NAME,ACCOUNT_LAST_NAME,OP_PARAM_1,OP_PARAM_2,OP_PARAM_3,OP_PARAM_4,OP_PARAM_5,OP_PARAM_6,OP_PARAM_7,OP_PARAM_8,OP_PARAM_9,OP_PARAM_10,NETWORK_ACTIVATION_DATE,SHORT_PLAN_DESC,SERVICE_NAME_OL,MIDDLE_NAME_OL,LAST_NAME_OL,MIGRATED_SUBSCRIBER_ID,OLDER_VALIDITY_DATE,MEMBER_ID,UPDATE_DATE,EXPIRY_STATUS,EXPIRY_DATE,PRODUCT_TYPE,GIS_INDICATOR,TAX_APPLICABLE,CREDIT_LIMIT_CHANGE_DATE,CREDIT_LIMIT_CHANGED,UNLIMITED_CREDIT_LIMIT_CHANGE_DATE,MODIFY_USER,MODIFY_DATE,ORDER_TYPE,NICK_NAME,INVENTORY_PRODUCT_ID,IS_MIGRATED_SERVICE,FLEET_ID,MIGRATION_OWNER,BILLING_GROUP,INVOICE_TYPE,SPEND_LIMIT,ITEMIZED_DISPATCH,PERMANENT_CREDIT_LIMIT,TEMP_CREDIT_LIMIT,CONNECTION_MIGRATION_DATE,CONNECTION_MIGRATION_FLAG,VVIP_CUSTOMER,CTC_VALUE,CTC_FACTOR,DATE_OF_BIRTH,TOLL_FREE_NUMBER,OP_PARAM_11,COLLECTION_TYPE,M2M_STATUS,APN_IP,VOLTE_ENABLED "
			+ "FROM ESB_QUEUE_EVENTS WHERE SERVICE_TYPE_ID = ?";

	public List<EsbQueueEventsDo> findBy(long serviceTypeId, Connection conn) {
		try (PreparedStatement stmt = conn.prepareStatement(selectQuery)) {
			stmt.setLong(1, serviceTypeId);

			List<EsbQueueEventsDo> dos = new ArrayList<EsbQueueEventsDo>();

			ResultSet res = stmt.executeQuery();
			while (res.next()) {
				EsbQueueEventsDo eventsDo = new EsbQueueEventsDo();
				eventsDo.setServiceTypeId(res.getLong("SERVICE_TYPE_ID"));
				eventsDo.setAccountId(res.getString("ACCOUNT_ID"));
				eventsDo.setProfileId(res.getLong("PROFILE_ID"));
				eventsDo.setServiceCode(res.getLong("SERVICE_CODE"));
				eventsDo.setServiceName(res.getString("SERVICE_NAME"));
				eventsDo.setRiskCategory(res.getLong("RISK_CATEGORY"));
				eventsDo.setEmailNotification(res.getLong("EMAIL_NOTIFICATION"));
				eventsDo.setNotificationEmailId(res.getString("NOTIFICATION_EMAIL_ID"));
				eventsDo.setSmsNotification(res.getLong("SMS_NOTIFICATION"));
				eventsDo.setSmsNumbers(res.getString("SMS_NUMBERS"));
				eventsDo.setConnectionType(res.getLong("CONNECTION_TYPE"));
				eventsDo.setServiceFlag(res.getLong("SERVICE_FLAG"));
				eventsDo.setProductCode(res.getString("PRODUCT_CODE"));
				eventsDo.setServiceId(res.getString("SERVICE_ID"));
				eventsDo.setActivationDate(res.getDate("ACTIVATION_DATE"));
				eventsDo.setRegistrationDate(res.getDate("REGISTRATION_DATE"));
				eventsDo.setSimNumber(res.getString("SIM_NUMBER"));
				eventsDo.setImsiNumber(res.getString("IMSI_NUMBER"));
				eventsDo.setCreditLimit(res.getString("CREDIT_LIMIT"));
				eventsDo.setDepositAmount(res.getFloat("DEPOSIT_AMOUNT"));
				eventsDo.setTitle(res.getString("TITLE"));
				eventsDo.setFirstName(res.getString("FIRST_NAME"));
				eventsDo.setMiddleName(res.getString("MIDDLE_NAME"));
				eventsDo.setLastName(res.getString("LAST_NAME"));
				eventsDo.setIndividualFlag(res.getLong("INDIVIDUAL_FLAG"));
				eventsDo.setContractStartDate(res.getDate("CONTRACT_START_DATE"));
				eventsDo.setContractEndDate(res.getDate("CONTRACT_END_DATE"));
				eventsDo.setLanguageId(res.getLong("LANGUAGE_ID"));
				eventsDo.setEntityId(res.getLong("ENTITY_ID"));
				eventsDo.setStatus(res.getLong("STATUS"));
				eventsDo.setItemizedRequired(res.getLong("ITEMIZED_REQUIRED"));
				eventsDo.setPaymentPriority(res.getLong("PAYMENT_PRIORITY"));
				eventsDo.setOutstandingAmount(res.getFloat("OUTSTANDING_AMOUNT"));
				eventsDo.setDunningEnabled(res.getLong("DUNNING_ENABLED"));
				eventsDo.setBilledAmount(res.getFloat("BILLED_AMOUNT"));
				eventsDo.setBillDueDate(res.getString("BILL_DUE_DATE"));
				eventsDo.setFromBillDate(res.getString("FROM_BILL_DATE"));
				eventsDo.setToBillDate(res.getString("TO_BILL_DATE"));
				eventsDo.setLastBillRun(res.getString("LAST_BILL_RUN"));
				eventsDo.setBillCycleId(res.getLong("BILL_CYCLE_ID"));
				eventsDo.setBilltriggerStatus(res.getString("BILLTRIGGER_STATUS"));
				eventsDo.setBilltrigerRetryCount(res.getLong("BILLTRIGER_RETRY_COUNT"));
				eventsDo.setBillId(res.getString("BILL_ID"));
				eventsDo.setCreditClass(res.getString("CREDIT_CLASS"));
				eventsDo.setPendingPaymentFee(res.getFloat("PENDING_PAYMENT_FEE"));
				eventsDo.setPreviousBalance(res.getLong("PREVIOUS_BALANCE"));
				eventsDo.setComments(res.getString("COMMENTS"));
				eventsDo.setPosId(res.getString("POS_ID"));
				eventsDo.setCreditAmount(res.getFloat("CREDIT_AMOUNT"));
				eventsDo.setServiceChangeDate(res.getDate("SERVICE_CHANGE_DATE"));
				eventsDo.setStatusChangeDate(res.getDate("STATUS_CHANGE_DATE"));
				eventsDo.setRatePlanId(res.getString("RATE_PLAN_ID"));
				eventsDo.setRatePlanName(res.getString("RATE_PLAN_NAME"));
				eventsDo.setPosName(res.getString("POS_NAME"));
				eventsDo.setUserId(res.getLong("USER_ID"));
				eventsDo.setSaFormId(res.getLong("SA_FORM_ID"));
				eventsDo.setCreateUser(res.getLong("CREATE_USER"));
				eventsDo.setSlaLevel(res.getLong("SLA_LEVEL"));
				eventsDo.setContractid(res.getString("CONTRACTID"));
				eventsDo.setSuspensionReason(res.getString("SUSPENSION_REASON"));
				eventsDo.setIsParent(res.getLong("IS_PARENT"));
				eventsDo.setParentSeqId(res.getString("PARENT_SEQ_ID"));
				eventsDo.setCreateDate(res.getDate("CREATE_DATE"));
				eventsDo.setInfrastructureType(res.getLong("INFRASTRUCTURE_TYPE"));
				eventsDo.setRestoreStatus(res.getLong("RESTORE_STATUS"));
				eventsDo.setIccId(res.getString("ICC_ID"));
				eventsDo.setLineType(res.getLong("LINE_TYPE"));
				eventsDo.setDunningRequired(res.getLong("DUNNING_REQUIRED"));
				eventsDo.setLastDunningAction(res.getLong("LAST_DUNNING_ACTION"));
				eventsDo.setInstanceId(res.getString("INSTANCE_ID"));
				eventsDo.setRemarks(res.getString("REMARKS"));
				eventsDo.setTerminationDate(res.getDate("TERMINATION_DATE"));
				eventsDo.setRestorationDate(res.getDate("RESTORATION_DATE"));
				eventsDo.setSalesRepId(res.getString("SALES_REP_ID"));
				eventsDo.setSalesRepName(res.getString("SALES_REP_NAME"));
				eventsDo.setResellerFlag(res.getString("RESELLER_FLAG"));
				eventsDo.setHlrProfile(res.getString("HLR_PROFILE"));
				eventsDo.setHlrAccess(res.getString("HLR_ACCESS"));
				eventsDo.setBillCycleDay(res.getLong("BILL_CYCLE_DAY"));
				eventsDo.setProfileFirstName(res.getString("PROFILE_FIRST_NAME"));
				eventsDo.setProfileLastName(res.getString("PROFILE_LAST_NAME"));
				eventsDo.setAccountFirstName(res.getString("ACCOUNT_FIRST_NAME"));
				eventsDo.setAccountLastName(res.getString("ACCOUNT_LAST_NAME"));
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
				eventsDo.setNetworkActivationDate(res.getDate("NETWORK_ACTIVATION_DATE"));
				eventsDo.setShortPlanDesc(res.getString("SHORT_PLAN_DESC"));
				eventsDo.setServiceNameOl(res.getString("SERVICE_NAME_OL"));
				eventsDo.setMiddleNameOl(res.getString("MIDDLE_NAME_OL"));
				eventsDo.setLastNameOl(res.getString("LAST_NAME_OL"));
				eventsDo.setMigratedSubscriberId(res.getString("MIGRATED_SUBSCRIBER_ID"));
				eventsDo.setOlderValidityDate(res.getDate("OLDER_VALIDITY_DATE"));
				eventsDo.setMemberId(res.getString("MEMBER_ID"));
				eventsDo.setUpdateDate(res.getTimestamp("UPDATE_DATE"));
				eventsDo.setExpiryStatus(res.getLong("EXPIRY_STATUS"));
				eventsDo.setExpiryDate(res.getDate("EXPIRY_DATE"));
				eventsDo.setProductType(res.getString("PRODUCT_TYPE"));
				eventsDo.setGisIndicator(res.getString("GIS_INDICATOR"));
				eventsDo.setTaxApplicable(res.getString("TAX_APPLICABLE"));
				eventsDo.setCreditLimitChangeDate(res.getDate("CREDIT_LIMIT_CHANGE_DATE"));
				eventsDo.setCreditLimitChanged(res.getLong("CREDIT_LIMIT_CHANGED"));
				eventsDo.setUnlimitedCreditLimitChangeDate(res.getDate("UNLIMITED_CREDIT_LIMIT_CHANGE_DATE"));
				eventsDo.setModifyUser(res.getString("MODIFY_USER"));
				eventsDo.setModifyDate(res.getDate("MODIFY_DATE"));
				eventsDo.setOrderType(res.getString("ORDER_TYPE"));
				eventsDo.setNickName(res.getString("NICK_NAME"));
				eventsDo.setInventoryProductId(res.getString("INVENTORY_PRODUCT_ID"));
				eventsDo.setIsMigratedService(res.getLong("IS_MIGRATED_SERVICE"));
				eventsDo.setFleetId(res.getString("FLEET_ID"));
				eventsDo.setMigrationOwner(res.getString("MIGRATION_OWNER"));
				eventsDo.setBillingGroup(res.getString("BILLING_GROUP"));
				eventsDo.setInvoiceType(res.getLong("INVOICE_TYPE"));
				eventsDo.setSpendLimit(res.getFloat("SPEND_LIMIT"));
				eventsDo.setItemizedDispatch(res.getString("ITEMIZED_DISPATCH"));
				eventsDo.setPermanentCreditLimit(res.getFloat("PERMANENT_CREDIT_LIMIT"));
				eventsDo.setTempCreditLimit(res.getFloat("TEMP_CREDIT_LIMIT"));
				eventsDo.setConnectionMigrationDate(res.getDate("CONNECTION_MIGRATION_DATE"));
				eventsDo.setConnectionMigrationFlag(res.getLong("CONNECTION_MIGRATION_FLAG"));
				eventsDo.setVvipCustomer(res.getLong("VVIP_CUSTOMER"));
				eventsDo.setCtcValue(res.getString("CTC_VALUE"));
				eventsDo.setCtcFactor(res.getFloat("CTC_FACTOR"));
				eventsDo.setDateOfBirth(res.getDate("DATE_OF_BIRTH"));
				eventsDo.setTollFreeNumber(res.getString("TOLL_FREE_NUMBER"));
				eventsDo.setOpParam11(res.getString("OP_PARAM_11"));
				eventsDo.setCollectionType(res.getString("COLLECTION_TYPE"));
				eventsDo.setM2mStatus(res.getLong("M2M_STATUS"));
				eventsDo.setApnIp(res.getString("APN_IP"));
				eventsDo.setVolteEnabled(res.getLong("VOLTE_ENABLED"));

				dos.add(eventsDo);
			}

			return dos;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
