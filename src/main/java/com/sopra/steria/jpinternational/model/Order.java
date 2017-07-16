package com.sopra.steria.jpinternational.model;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


public class Order implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonDeserialize(using=StringEmptyToNull.class)
	private String usid;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String loisOrderId;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String operationCode;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String orderReference;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String legacyOrderReference;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String orderType;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String customerOrderReference;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String customerDefinedCode;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String sellingEntityReference;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String projectId;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String orderStatus;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String userId;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String serviceProcurementActionId;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String legacyServiceTypeId;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String prodId;
	@JsonDeserialize(using=StringEmptyToNull.class)	
	private String subprodId;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String supplementryServiceId;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String serviceSpeedId;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String circuitRequested;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String configurationRequested;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String customerCode;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String customerName;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String userName;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String address1;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String address2;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String address3;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String address4;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String floorNumber;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String room;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String cityName;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String zipCode;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String countryState;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String countryCode;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String contact1Name;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String contact1Position;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String contact1AreaCode;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String contact1Phone;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String contact1Fax;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String contact1CellularPhone;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String contact1Email;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String contact1Comment;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String contact2Name;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String contact2Position;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String contact2AreaCode;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String contact2Phone;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String contact2Fax;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String contact2CellularPhone;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String contact2Email;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String contact2Comment;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String orderDate;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String custReqDeliveryDate;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String validationDate;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String revisedValidationDate;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String gad;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String cdd;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String cav;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String configurationDate;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String mav;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String rfsDate;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String cutDate;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String networkParam0;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String networkParam1;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String networkParam2;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String networkParam3;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String networkParam4;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String networkParam5;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String networkParam6;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String networkParam7;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String networkParam8;
	@JsonDeserialize(using=StringEmptyToNull.class)	
	private String networkParam9;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String networkParam10;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String networkParam11;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String networkParam12;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String networkParam13;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String networkParam14;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String networkParam15;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String networkParam16;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String networkParam17;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String networkParam18;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String networkParam19;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String networkParam20;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String orderComment;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String rejectReason;	
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String cityCode;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String custProjCode;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String aendAddress1;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String aendAddress2;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String aendAddress3;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String aendAddress4;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String aendFloor;
	@JsonDeserialize(using=StringEmptyToNull.class)	
	private String aendRoom;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String aendCityIataCode;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String aendCityName;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String aendZipCode;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String aendCountryState;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String aendCountryCode;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String aendContact1Name;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String aendContact1Position;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String aendContact1PhoneAreaCode;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String aendContact1Phone;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String aendContact1FaxAreaCode;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String aendContact1Fax;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String aendContact1CellAreaCode;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String aendContact1CellularPhone;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String aendContact1Email;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String aendContact2Name;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String aendContact2Position;
	@JsonDeserialize(using=StringEmptyToNull.class)	
	private String aendContact2PhoneAreaCode;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String aendContact2Phone;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String aendContact2FaxAreaCode;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String aendContact2Fax;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String aendContact2CellAreaCode;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String aendContact2CellularPhone;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String aendContact2Email;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String srfDate;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String originatorOrdRef;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String requestorName;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String requestorEmail;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String requestorPhoneArea;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String requestorPhone;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String requestorFaxArea;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String requestorFax;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String bOption;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String disruptTest;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String cctSpeed;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String oldCctSpeed;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String partnerId;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String foreignUsid;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String parentUsid;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String serviceParam1;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String serviceParam2;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String serviceParam3;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String serviceParam4;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String serviceParam5;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String serviceParam6;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String serviceParam7;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String serviceParam8;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String serviceParam9;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String serviceParam10;
	@JsonDeserialize(using=StringEmptyToNull.class)	
	private String serviceParam11;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String serviceParam12;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String serviceParam13;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String serviceParam14;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String serviceParam15;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String serviceParam16;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String serviceParam17;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String serviceParam18;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String serviceParam19;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String serviceParam20;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String aendUserName;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String bendUserName;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String orangeServiceName;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String coresiteId;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String coreaddressId;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String btlvsDate;
	@JsonDeserialize(using=StringEmptyToNull.class)
	private String sourceTool;
	
	public String getUsid() {
		return usid;
	}
	public void setUsid(String usid) {
		this.usid = usid;
	}
	public String getLoisOrderId() {
		return loisOrderId;
	}
	public void setLoisOrderId(String loisOrderId) {
		this.loisOrderId = loisOrderId;
	}
	public String getOperationCode() {
		return operationCode;
	}
	public void setOperationCode(String operationCode) {
		this.operationCode = operationCode;
	}
	public String getOrderReference() {
		return orderReference;
	}
	public void setOrderReference(String orderReference) {
		this.orderReference = orderReference;
	}
	public String getLegacyOrderReference() {
		return legacyOrderReference;
	}
	public void setLegacyOrderReference(String legacyOrderReference) {
		this.legacyOrderReference = legacyOrderReference;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getCustomerOrderReference() {
		return customerOrderReference;
	}
	public void setCustomerOrderReference(String customerOrderReference) {
		this.customerOrderReference = customerOrderReference;
	}
	public String getCustomerDefinedCode() {
		return customerDefinedCode;
	}
	public void setCustomerDefinedCode(String customerDefinedCode) {
		this.customerDefinedCode = customerDefinedCode;
	}
	public String getSellingEntityReference() {
		return sellingEntityReference;
	}
	public void setSellingEntityReference(String sellingEntityReference) {
		this.sellingEntityReference = sellingEntityReference;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getServiceProcurementActionId() {
		return serviceProcurementActionId;
	}
	public void setServiceProcurementActionId(String serviceProcurementActionId) {
		this.serviceProcurementActionId = serviceProcurementActionId;
	}
	public String getLegacyServiceTypeId() {
		return legacyServiceTypeId;
	}
	public void setLegacyServiceTypeId(String legacyServiceTypeId) {
		this.legacyServiceTypeId = legacyServiceTypeId;
	}
	public String getProdId() {
		return prodId;
	}
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	public String getSubprodId() {
		return subprodId;
	}
	public void setSubprodId(String subprodId) {
		this.subprodId = subprodId;
	}
	public String getSupplementryServiceId() {
		return supplementryServiceId;
	}
	public void setSupplementryServiceId(String supplementryServiceId) {
		this.supplementryServiceId = supplementryServiceId;
	}
	public String getServiceSpeedId() {
		return serviceSpeedId;
	}
	public void setServiceSpeedId(String serviceSpeedId) {
		this.serviceSpeedId = serviceSpeedId;
	}
	public String getCircuitRequested() {
		return circuitRequested;
	}
	public void setCircuitRequested(String circuitRequested) {
		this.circuitRequested = circuitRequested;
	}
	public String getConfigurationRequested() {
		return configurationRequested;
	}
	public void setConfigurationRequested(String configurationRequested) {
		this.configurationRequested = configurationRequested;
	}
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getAddress3() {
		return address3;
	}
	public void setAddress3(String address3) {
		this.address3 = address3;
	}
	public String getAddress4() {
		return address4;
	}
	public void setAddress4(String address4) {
		this.address4 = address4;
	}
	public String getFloorNumber() {
		return floorNumber;
	}
	public void setFloorNumber(String floorNumber) {
		this.floorNumber = floorNumber;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCountryState() {
		return countryState;
	}
	public void setCountryState(String countryState) {
		this.countryState = countryState;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getContact1Name() {
		return contact1Name;
	}
	public void setContact1Name(String contact1Name) {
		this.contact1Name = contact1Name;
	}
	public String getContact1Position() {
		return contact1Position;
	}
	public void setContact1Position(String contact1Position) {
		this.contact1Position = contact1Position;
	}
	public String getContact1AreaCode() {
		return contact1AreaCode;
	}
	public void setContact1AreaCode(String contact1AreaCode) {
		this.contact1AreaCode = contact1AreaCode;
	}
	public String getContact1Phone() {
		return contact1Phone;
	}
	public void setContact1Phone(String contact1Phone) {
		this.contact1Phone = contact1Phone;
	}
	public String getContact1Fax() {
		return contact1Fax;
	}
	public void setContact1Fax(String contact1Fax) {
		this.contact1Fax = contact1Fax;
	}
	public String getContact1CellularPhone() {
		return contact1CellularPhone;
	}
	public void setContact1CellularPhone(String contact1CellularPhone) {
		this.contact1CellularPhone = contact1CellularPhone;
	}
	public String getContact1Email() {
		return contact1Email;
	}
	public void setContact1Email(String contact1Email) {
		this.contact1Email = contact1Email;
	}
	public String getContact1Comment() {
		return contact1Comment;
	}
	public void setContact1Comment(String contact1Comment) {
		this.contact1Comment = contact1Comment;
	}
	public String getContact2Name() {
		return contact2Name;
	}
	public void setContact2Name(String contact2Name) {
		this.contact2Name = contact2Name;
	}
	public String getContact2Position() {
		return contact2Position;
	}
	public void setContact2Position(String contact2Position) {
		this.contact2Position = contact2Position;
	}
	public String getContact2AreaCode() {
		return contact2AreaCode;
	}
	public void setContact2AreaCode(String contact2AreaCode) {
		this.contact2AreaCode = contact2AreaCode;
	}
	public String getContact2Phone() {
		return contact2Phone;
	}
	public void setContact2Phone(String contact2Phone) {
		this.contact2Phone = contact2Phone;
	}
	public String getContact2Fax() {
		return contact2Fax;
	}
	public void setContact2Fax(String contact2Fax) {
		this.contact2Fax = contact2Fax;
	}
	public String getContact2CellularPhone() {
		return contact2CellularPhone;
	}
	public void setContact2CellularPhone(String contact2CellularPhone) {
		this.contact2CellularPhone = contact2CellularPhone;
	}
	public String getContact2Email() {
		return contact2Email;
	}
	public void setContact2Email(String contact2Email) {
		this.contact2Email = contact2Email;
	}
	public String getContact2Comment() {
		return contact2Comment;
	}
	public void setContact2Comment(String contact2Comment) {
		this.contact2Comment = contact2Comment;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getCustReqDeliveryDate() {
		return custReqDeliveryDate;
	}
	public void setCustReqDeliveryDate(String custReqDeliveryDate) {
		this.custReqDeliveryDate = custReqDeliveryDate;
	}
	public String getValidationDate() {
		return validationDate;
	}
	public void setValidationDate(String validationDate) {
		this.validationDate = validationDate;
	}
	public String getRevisedValidationDate() {
		return revisedValidationDate;
	}
	public void setRevisedValidationDate(String revisedValidationDate) {
		this.revisedValidationDate = revisedValidationDate;
	}
	public String getGad() {
		return gad;
	}
	public void setGad(String gad) {
		this.gad = gad;
	}
	public String getCdd() {
		return cdd;
	}
	public void setCdd(String cdd) {
		this.cdd = cdd;
	}
	public String getCav() {
		return cav;
	}
	public void setCav(String cav) {
		this.cav = cav;
	}
	public String getConfigurationDate() {
		return configurationDate;
	}
	public void setConfigurationDate(String configurationDate) {
		this.configurationDate = configurationDate;
	}
	public String getMav() {
		return mav;
	}
	public void setMav(String mav) {
		this.mav = mav;
	}
	public String getRfsDate() {
		return rfsDate;
	}
	public void setRfsDate(String rfsDate) {
		this.rfsDate = rfsDate;
	}
	public String getCutDate() {
		return cutDate;
	}
	public void setCutDate(String cutDate) {
		this.cutDate = cutDate;
	}
	public String getNetworkParam0() {
		return networkParam0;
	}
	public void setNetworkParam0(String networkParam0) {
		this.networkParam0 = networkParam0;
	}
	public String getNetworkParam1() {
		return networkParam1;
	}
	public void setNetworkParam1(String networkParam1) {
		this.networkParam1 = networkParam1;
	}
	public String getNetworkParam2() {
		return networkParam2;
	}
	public void setNetworkParam2(String networkParam2) {
		this.networkParam2 = networkParam2;
	}
	public String getNetworkParam3() {
		return networkParam3;
	}
	public void setNetworkParam3(String networkParam3) {
		this.networkParam3 = networkParam3;
	}
	public String getNetworkParam4() {
		return networkParam4;
	}
	public void setNetworkParam4(String networkParam4) {
		this.networkParam4 = networkParam4;
	}
	public String getNetworkParam5() {
		return networkParam5;
	}
	public void setNetworkParam5(String networkParam5) {
		this.networkParam5 = networkParam5;
	}
	public String getNetworkParam6() {
		return networkParam6;
	}
	public void setNetworkParam6(String networkParam6) {
		this.networkParam6 = networkParam6;
	}
	public String getNetworkParam7() {
		return networkParam7;
	}
	public void setNetworkParam7(String networkParam7) {
		this.networkParam7 = networkParam7;
	}
	public String getNetworkParam8() {
		return networkParam8;
	}
	public void setNetworkParam8(String networkParam8) {
		this.networkParam8 = networkParam8;
	}
	public String getNetworkParam9() {
		return networkParam9;
	}
	public void setNetworkParam9(String networkParam9) {
		this.networkParam9 = networkParam9;
	}
	public String getNetworkParam10() {
		return networkParam10;
	}
	public void setNetworkParam10(String networkParam10) {
		this.networkParam10 = networkParam10;
	}
	public String getNetworkParam11() {
		return networkParam11;
	}
	public void setNetworkParam11(String networkParam11) {
		this.networkParam11 = networkParam11;
	}
	public String getNetworkParam12() {
		return networkParam12;
	}
	public void setNetworkParam12(String networkParam12) {
		this.networkParam12 = networkParam12;
	}
	public String getNetworkParam13() {
		return networkParam13;
	}
	public void setNetworkParam13(String networkParam13) {
		this.networkParam13 = networkParam13;
	}
	public String getNetworkParam14() {
		return networkParam14;
	}
	public void setNetworkParam14(String networkParam14) {
		this.networkParam14 = networkParam14;
	}
	public String getNetworkParam15() {
		return networkParam15;
	}
	public void setNetworkParam15(String networkParam15) {
		this.networkParam15 = networkParam15;
	}
	public String getNetworkParam16() {
		return networkParam16;
	}
	public void setNetworkParam16(String networkParam16) {
		this.networkParam16 = networkParam16;
	}
	public String getNetworkParam17() {
		return networkParam17;
	}
	public void setNetworkParam17(String networkParam17) {
		this.networkParam17 = networkParam17;
	}
	public String getNetworkParam18() {
		return networkParam18;
	}
	public void setNetworkParam18(String networkParam18) {
		this.networkParam18 = networkParam18;
	}
	public String getNetworkParam19() {
		return networkParam19;
	}
	public void setNetworkParam19(String networkParam19) {
		this.networkParam19 = networkParam19;
	}
	public String getNetworkParam20() {
		return networkParam20;
	}
	public void setNetworkParam20(String networkParam20) {
		this.networkParam20 = networkParam20;
	}
	public String getOrderComment() {
		return orderComment;
	}
	public void setOrderComment(String orderComment) {
		this.orderComment = orderComment;
	}
	public String getRejectReason() {
		return rejectReason;
	}
	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}
	
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCustProjCode() {
		return custProjCode;
	}
	public void setCustProjCode(String custProjCode) {
		this.custProjCode = custProjCode;
	}
	public String getAendAddress1() {
		return aendAddress1;
	}
	public void setAendAddress1(String aendAddress1) {
		this.aendAddress1 = aendAddress1;
	}
	public String getAendAddress2() {
		return aendAddress2;
	}
	public void setAendAddress2(String aendAddress2) {
		this.aendAddress2 = aendAddress2;
	}
	public String getAendAddress3() {
		return aendAddress3;
	}
	public void setAendAddress3(String aendAddress3) {
		this.aendAddress3 = aendAddress3;
	}
	public String getAendAddress4() {
		return aendAddress4;
	}
	public void setAendAddress4(String aendAddress4) {
		this.aendAddress4 = aendAddress4;
	}
	public String getAendFloor() {
		return aendFloor;
	}
	public void setAendFloor(String aendFloor) {
		this.aendFloor = aendFloor;
	}
	public String getAendRoom() {
		return aendRoom;
	}
	public void setAendRoom(String aendRoom) {
		this.aendRoom = aendRoom;
	}
	public String getAendCityIataCode() {
		return aendCityIataCode;
	}
	public void setAendCityIataCode(String aendCityIataCode) {
		this.aendCityIataCode = aendCityIataCode;
	}
	public String getAendCityName() {
		return aendCityName;
	}
	public void setAendCityName(String aendCityName) {
		this.aendCityName = aendCityName;
	}
	public String getAendZipCode() {
		return aendZipCode;
	}
	public void setAendZipCode(String aendZipCode) {
		this.aendZipCode = aendZipCode;
	}
	public String getAendCountryState() {
		return aendCountryState;
	}
	public void setAendCountryState(String aendCountryState) {
		this.aendCountryState = aendCountryState;
	}
	public String getAendCountryCode() {
		return aendCountryCode;
	}
	public void setAendCountryCode(String aendCountryCode) {
		this.aendCountryCode = aendCountryCode;
	}
	public String getAendContact1Name() {
		return aendContact1Name;
	}
	public void setAendContact1Name(String aendContact1Name) {
		this.aendContact1Name = aendContact1Name;
	}
	public String getAendContact1Position() {
		return aendContact1Position;
	}
	public void setAendContact1Position(String aendContact1Position) {
		this.aendContact1Position = aendContact1Position;
	}
	public String getAendContact1PhoneAreaCode() {
		return aendContact1PhoneAreaCode;
	}
	public void setAendContact1PhoneAreaCode(String aendContact1PhoneAreaCode) {
		this.aendContact1PhoneAreaCode = aendContact1PhoneAreaCode;
	}
	public String getAendContact1Phone() {
		return aendContact1Phone;
	}
	public void setAendContact1Phone(String aendContact1Phone) {
		this.aendContact1Phone = aendContact1Phone;
	}
	public String getAendContact1FaxAreaCode() {
		return aendContact1FaxAreaCode;
	}
	public void setAendContact1FaxAreaCode(String aendContact1FaxAreaCode) {
		this.aendContact1FaxAreaCode = aendContact1FaxAreaCode;
	}
	public String getAendContact1Fax() {
		return aendContact1Fax;
	}
	public void setAendContact1Fax(String aendContact1Fax) {
		this.aendContact1Fax = aendContact1Fax;
	}
	public String getAendContact1CellAreaCode() {
		return aendContact1CellAreaCode;
	}
	public void setAendContact1CellAreaCode(String aendContact1CellAreaCode) {
		this.aendContact1CellAreaCode = aendContact1CellAreaCode;
	}
	public String getAendContact1CellularPhone() {
		return aendContact1CellularPhone;
	}
	public void setAendContact1CellularPhone(String aendContact1CellularPhone) {
		this.aendContact1CellularPhone = aendContact1CellularPhone;
	}
	public String getAendContact1Email() {
		return aendContact1Email;
	}
	public void setAendContact1Email(String aendContact1Email) {
		this.aendContact1Email = aendContact1Email;
	}
	public String getAendContact2Name() {
		return aendContact2Name;
	}
	public void setAendContact2Name(String aendContact2Name) {
		this.aendContact2Name = aendContact2Name;
	}
	public String getAendContact2Position() {
		return aendContact2Position;
	}
	public void setAendContact2Position(String aendContact2Position) {
		this.aendContact2Position = aendContact2Position;
	}
	public String getAendContact2PhoneAreaCode() {
		return aendContact2PhoneAreaCode;
	}
	public void setAendContact2PhoneAreaCode(String aendContact2PhoneAreaCode) {
		this.aendContact2PhoneAreaCode = aendContact2PhoneAreaCode;
	}
	public String getAendContact2Phone() {
		return aendContact2Phone;
	}
	public void setAendContact2Phone(String aendContact2Phone) {
		this.aendContact2Phone = aendContact2Phone;
	}
	public String getAendContact2FaxAreaCode() {
		return aendContact2FaxAreaCode;
	}
	public void setAendContact2FaxAreaCode(String aendContact2FaxAreaCode) {
		this.aendContact2FaxAreaCode = aendContact2FaxAreaCode;
	}
	public String getAendContact2Fax() {
		return aendContact2Fax;
	}
	public void setAendContact2Fax(String aendContact2Fax) {
		this.aendContact2Fax = aendContact2Fax;
	}
	public String getAendContact2CellAreaCode() {
		return aendContact2CellAreaCode;
	}
	public void setAendContact2CellAreaCode(String aendContact2CellAreaCode) {
		this.aendContact2CellAreaCode = aendContact2CellAreaCode;
	}
	public String getAendContact2CellularPhone() {
		return aendContact2CellularPhone;
	}
	public void setAendContact2CellularPhone(String aendContact2CellularPhone) {
		this.aendContact2CellularPhone = aendContact2CellularPhone;
	}
	public String getAendContact2Email() {
		return aendContact2Email;
	}
	public void setAendContact2Email(String aendContact2Email) {
		this.aendContact2Email = aendContact2Email;
	}
	public String getSrfDate() {
		return srfDate;
	}
	public void setSrfDate(String srfDate) {
		this.srfDate = srfDate;
	}
	public String getOriginatorOrdRef() {
		return originatorOrdRef;
	}
	public void setOriginatorOrdRef(String originatorOrdRef) {
		this.originatorOrdRef = originatorOrdRef;
	}
	public String getRequestorName() {
		return requestorName;
	}
	public void setRequestorName(String requestorName) {
		this.requestorName = requestorName;
	}
	public String getRequestorEmail() {
		return requestorEmail;
	}
	public void setRequestorEmail(String requestorEmail) {
		this.requestorEmail = requestorEmail;
	}
	public String getRequestorPhoneArea() {
		return requestorPhoneArea;
	}
	public void setRequestorPhoneArea(String requestorPhoneArea) {
		this.requestorPhoneArea = requestorPhoneArea;
	}
	public String getRequestorPhone() {
		return requestorPhone;
	}
	public void setRequestorPhone(String requestorPhone) {
		this.requestorPhone = requestorPhone;
	}
	public String getRequestorFaxArea() {
		return requestorFaxArea;
	}
	public void setRequestorFaxArea(String requestorFaxArea) {
		this.requestorFaxArea = requestorFaxArea;
	}
	public String getRequestorFax() {
		return requestorFax;
	}
	public void setRequestorFax(String requestorFax) {
		this.requestorFax = requestorFax;
	}
	public String getbOption() {
		return bOption;
	}
	public void setbOption(String bOption) {
		this.bOption = bOption;
	}
	public String getDisruptTest() {
		return disruptTest;
	}
	public void setDisruptTest(String disruptTest) {
		this.disruptTest = disruptTest;
	}
	public String getCctSpeed() {
		return cctSpeed;
	}
	public void setCctSpeed(String cctSpeed) {
		this.cctSpeed = cctSpeed;
	}
	public String getOldCctSpeed() {
		return oldCctSpeed;
	}
	public void setOldCctSpeed(String oldCctSpeed) {
		this.oldCctSpeed = oldCctSpeed;
	}
	public String getPartnerId() {
		return partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getForeignUsid() {
		return foreignUsid;
	}
	public void setForeignUsid(String foreignUsid) {
		this.foreignUsid = foreignUsid;
	}
	public String getParentUsid() {
		return parentUsid;
	}
	public void setParentUsid(String parentUsid) {
		this.parentUsid = parentUsid;
	}
	public String getServiceParam1() {
		return serviceParam1;
	}
	public void setServiceParam1(String serviceParam1) {
		this.serviceParam1 = serviceParam1;
	}
	public String getServiceParam2() {
		return serviceParam2;
	}
	public void setServiceParam2(String serviceParam2) {
		this.serviceParam2 = serviceParam2;
	}
	public String getServiceParam3() {
		return serviceParam3;
	}
	public void setServiceParam3(String serviceParam3) {
		this.serviceParam3 = serviceParam3;
	}
	public String getServiceParam4() {
		return serviceParam4;
	}
	public void setServiceParam4(String serviceParam4) {
		this.serviceParam4 = serviceParam4;
	}
	public String getServiceParam5() {
		return serviceParam5;
	}
	public void setServiceParam5(String serviceParam5) {
		this.serviceParam5 = serviceParam5;
	}
	public String getServiceParam6() {
		return serviceParam6;
	}
	public void setServiceParam6(String serviceParam6) {
		this.serviceParam6 = serviceParam6;
	}
	public String getServiceParam7() {
		return serviceParam7;
	}
	public void setServiceParam7(String serviceParam7) {
		this.serviceParam7 = serviceParam7;
	}
	public String getServiceParam8() {
		return serviceParam8;
	}
	public void setServiceParam8(String serviceParam8) {
		this.serviceParam8 = serviceParam8;
	}
	public String getServiceParam9() {
		return serviceParam9;
	}
	public void setServiceParam9(String serviceParam9) {
		this.serviceParam9 = serviceParam9;
	}
	public String getServiceParam10() {
		return serviceParam10;
	}
	public void setServiceParam10(String serviceParam10) {
		this.serviceParam10 = serviceParam10;
	}
	public String getServiceParam11() {
		return serviceParam11;
	}
	public void setServiceParam11(String serviceParam11) {
		this.serviceParam11 = serviceParam11;
	}
	public String getServiceParam12() {
		return serviceParam12;
	}
	public void setServiceParam12(String serviceParam12) {
		this.serviceParam12 = serviceParam12;
	}
	public String getServiceParam13() {
		return serviceParam13;
	}
	public void setServiceParam13(String serviceParam13) {
		this.serviceParam13 = serviceParam13;
	}
	public String getServiceParam14() {
		return serviceParam14;
	}
	public void setServiceParam14(String serviceParam14) {
		this.serviceParam14 = serviceParam14;
	}
	public String getServiceParam15() {
		return serviceParam15;
	}
	public void setServiceParam15(String serviceParam15) {
		this.serviceParam15 = serviceParam15;
	}
	public String getServiceParam16() {
		return serviceParam16;
	}
	public void setServiceParam16(String serviceParam16) {
		this.serviceParam16 = serviceParam16;
	}
	public String getServiceParam17() {
		return serviceParam17;
	}
	public void setServiceParam17(String serviceParam17) {
		this.serviceParam17 = serviceParam17;
	}
	public String getServiceParam18() {
		return serviceParam18;
	}
	public void setServiceParam18(String serviceParam18) {
		this.serviceParam18 = serviceParam18;
	}
	public String getServiceParam19() {
		return serviceParam19;
	}
	public void setServiceParam19(String serviceParam19) {
		this.serviceParam19 = serviceParam19;
	}
	public String getServiceParam20() {
		return serviceParam20;
	}
	public void setServiceParam20(String serviceParam20) {
		this.serviceParam20 = serviceParam20;
	}
	public String getAendUserName() {
		return aendUserName;
	}
	public void setAendUserName(String aendUserName) {
		this.aendUserName = aendUserName;
	}
	public String getBendUserName() {
		return bendUserName;
	}
	public void setBendUserName(String bendUserName) {
		this.bendUserName = bendUserName;
	}
	public String getOrangeServiceName() {
		return orangeServiceName;
	}
	public void setOrangeServiceName(String orangeServiceName) {
		this.orangeServiceName = orangeServiceName;
	}
	public String getCoresiteId() {
		return coresiteId;
	}
	public void setCoresiteId(String coresiteId) {
		this.coresiteId = coresiteId;
	}
	public String getCoreaddressId() {
		return coreaddressId;
	}
	public void setCoreaddressId(String coreaddressId) {
		this.coreaddressId = coreaddressId;
	}
	public String getBtlvsDate() {
		return btlvsDate;
	}
	public void setBtlvsDate(String btlvsDate) {
		this.btlvsDate = btlvsDate;
	}
	public String getSourceTool() {
		return sourceTool;
	}
	public void setSourceTool(String sourceTool) {
		this.sourceTool = sourceTool;
	}
	
	


}
