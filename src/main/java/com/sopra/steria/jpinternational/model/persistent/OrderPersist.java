package com.sopra.steria.jpinternational.model.persistent;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "lois_orders_input")

public class OrderPersist {

	@Id
	@Column(name="orderid")
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer id;

	@Column(name = "usid")
	private String usId;
	
	@Column(name = "loisorderid")
	private String  loisOrderId;
	
	@Column(name = "operationcode")
	private String  operationCode;
	
	@Column(name = "orderreference")
	private String  orderReference;
	
	@Column(name = "legacyorderreference")
	private String  legacyOrderReference;
	
	@Column(name = "ordertype")
	private String  orderType;
	
	@Column(name = "customerorderreference")
	private String  customerOrderReference;
	
	@Column(name = "customerdefinedcode")
    private String  customerDefinedCode;
	
	@Column(name = "sellingentityreference")
	private String  sellingEntityReference;
	
	@Column(name = "projectid")
	private String  projectId;
	
	@Column(name = "orderstatus")
	private String  orderStatus;
	
	@Column(name = "userid")
	private String  userId;
	
	@Column(name = "serviceprocurementactionid")
	private String  serviceProcurementActionId;
	
	@Column(name = "legacyservicetypeid")
	private String  legacyServiceTypeId;
	
	@Column(name = "prodid")
	private String    prodId;
	
	@Column(name = "subprodid")
	private String  subprodId;
	
	@Column(name = "supplementaryserviceid")
	private String supplementryServiceId;
	
	@Column(name = "servicespeedid")
	private String serviceSpeedId;
	
	@Column(name = "circuit_requested")
	private String circuitRequested;
		
	@Column(name = "configuration_requested")
	private String configurationRequested;
	
	@Column(name = "customercode")
	private String customerCode;
	
	@Column(name = "customername")
	private String customerName;
	
	@Column(name = "username")
	private String userName;
	
	@Column(name = "address1")
	private String address1;
	
	@Column(name = "address2")
	private String address2;
	
	@Column(name = "address3")
	private String address3;
	
	@Column(name = "address4")
	private String address4;
	
	@Column(name = "floornumber")
	private String floorNumber;
	
	@Column(name = "room")
	private String room;
	
	@Column(name = "cityname")
	private String cityName;
	
	@Column(name = "zipcode")
	private String zipCode;
	
	@Column(name = "country_state")
	private String countryState;
	
	@Column(name = "countrycode")
	private String countryCode;
	
	@Column(name = "contact1name")
	private String contact1Name;
	
	@Column(name = "contact1position")
	private String contact1Position;
	
	@Column(name = "contact1areacode")
	private String contact1AreaCode;
	
	@Column(name = "contact1phone")
	private String contact1Phone;
	
	@Column(name = "contact1fax")
	private String contact1Fax;
	
	@Column(name = "contact1cellularphone")
	private String contact1CellularPhone;
	
	@Column(name = "contact1email")
	private String contact1Email;
	
	@Column(name = "contact1comment")
	private String contact1Comment;
	
	@Column(name = "contact2name")
	private String contact2Name;
	
	@Column(name = "contact2position")
	private String contact2Position;
	
	@Column(name = "contact2areacode")
	private String contact2AreaCode;
	
	@Column(name = "contact2phone")
	private String contact2Phone;
	
	@Column(name = "contact2fax")
	private String contact2Fax;
	
	@Column(name = "contact2cellularphone")
	private String contact2CellularPhone;
	
	@Column(name = "contact2email")
	private String contact2Email;
	
	@Column(name = "contact2comment")
	private String contact2Comment;
	
	@Column(name = "orderdate")
	private Date orderDate;
	
	@Column(name = "custreqdeliverydate")
	private Date  custReqDeliveryDate;
	
	@Column(name = "validationdate")
	private Date validationDate;
	
	@Column(name = "revisedvalidationdate")
	private Date revisedValidationDate;
	
	@Column(name = "gad")
	private Date gad;
	
	@Column(name = "cdd")
	private Date cdd;
	
	@Column(name = "cav")
	private Date cav;
	
	@Column(name = "configurationdate")
	private Date configurationDate;
	
	@Column(name = "mav")
	private Date mav;
	
	@Column(name = "rfsdate")
	private Date rfsDate;
	
	@Column(name = "cutdate")
	private Date cutDate;
	
	@Column(name = "networkparam0")
	private String networkParam0;
	
	@Column(name = "networkparam1")
	private String networkParam1;
	
	@Column(name = "networkparam2")
	private String networkParam2;
	
	@Column(name = "networkparam3")
	private String networkParam3;
	
	@Column(name = "networkparam4")
	private String networkParam4;
	
	@Column(name = "networkparam5")
	private String networkParam5;
	
	@Column(name = "networkparam6")
	private String networkParam6;
	
	@Column(name = "networkparam7")
	private String networkParam7;
	
	@Column(name = "networkparam8")
	private String networkParam8;
	
	@Column(name = "networkparam9")
	private String networkParam9;
	
	@Column(name = "networkparam10")
	private String networkParam10;
	
	@Column(name = "networkparam11")
	private String networkParam11;
	
	@Column(name = "networkparam12")
	private String networkParam12;
	
	@Column(name = "networkparam13")
	private String networkParam13;
	
	@Column(name = "networkparam14")
	private String networkParam14;
	
	@Column(name = "networkparam15")
	private String networkParam15;
	
	@Column(name = "networkparam16")
	private String networkParam16;
	
	@Column(name = "networkparam17")
	private String networkParam17;
	
	@Column(name = "networkparam18")
	private String networkParam18;
	
	@Column(name = "networkparam19")
	private String networkParam19;
	
	@Column(name = "networkparam20")
	private String networkParam20;
	
	@Column(name = "ordercomment")
	private String orderComment;
	
	@Column(name = "rejectreason")
	private String rejectReason;
	
	@Column(name = "creationdate")
	private Date creationDate;
	
	@Column(name = "citycode")
	private String cityCode;
	
	@Column(name = "custprojcode")
	private String custProjCode;
	
	@Column(name = "aend_address1")
	private String aendAddress1;
	
	@Column(name = "aend_address2")
	private String aendAddress2;
	
	@Column(name = "aend_address3")
	private String aendAddress3;
	
	@Column(name = "aend_address4")
	private String aendAddress4;
	
	@Column(name = "aend_floor")
	private String aendFloor;
	
	@Column(name = "aend_room")
	private String aendRoom;
	
	@Column(name = "aend_cityiatacode")
	private String aendCityIataCode;
	
	@Column(name = "aend_cityname")
	private String aendCityName;
	
	@Column(name = "aend_zipcode")
	private String aendZipCode;
	
	@Column(name = "aend_countrystate")
	private String aendCountryState;
	
	@Column(name = "aend_countrycode")
	private String aendCountryCode;
	
	@Column(name = "aend_contact1name")
	private String aendContact1Name;
	
	@Column(name = "aend_contact1position")
	private String aendContact1Position;
	
	@Column(name = "aend_contact1phoneareacode")
	private String aendContact1PhoneAreaCode;
	
	@Column(name = "aend_contact1phone")
	private String aendContact1Phone;
	
	@Column(name = "aend_contact1faxareacode")
	private String aendContact1FaxAreaCode;
	
	@Column(name = "aend_contact1fax")
	private String aendContact1Fax;
	
	@Column(name = "aend_contact1cellareacode")
	private String aendContact1CellAreaCode;
	
	@Column(name = "aend_contact1cellularphone")
	private String aendContact1CellularPhone;
	
	@Column(name = "aend_contact1email")
	private String aendContact1Email;
	
	@Column(name = "aend_contact2name")
	private String aendContact2Name;
	
	@Column(name = "aend_contact2position")
	private String aendContact2Position;
	
	@Column(name = "aend_contact2phoneareacode")
	private String aendContact2PhoneAreaCode;
	
	@Column(name = "aend_contact2phone")
	private String aendContact2Phone;
	
	@Column(name = "aend_contact2faxareacode")
	private String aendContact2FaxAreaCode;
	
	@Column(name = "aend_contact2fax")
	private String aendContact2Fax;
	
	@Column(name = "aend_contact2cellareacode")
	private String aendContact2CellAreaCode;
	
	@Column(name = "aend_contact2cellularphone")
	private String aendContact2CellularPhone;
	
	@Column(name = "aend_contact2email")
	private String aendContact2Email;
	
	@Column(name = "srfdate")
	private Date srfDate;
	
	@Column(name = "originatorordref")
	private String originatorOrdRef;
	
	@Column(name = "requestorname")
	private String requestorName;
	
	@Column(name = "requestoremail")
	private String requestorEmail;
	
	@Column(name = "requestorphonearea")
	private String requestorPhoneArea;
	
	@Column(name = "requestorphone")
	private String requestorPhone;
	
	@Column(name = "requestorfaxarea")
	private String requestorFaxArea;
	
	@Column(name = "requestorfax")
	private String requestorFax;
	
	@Column(name = "b_option")
	private String bOption;
	
	@Column(name = "disrupt_test")
	private String disruptTest;
	
	@Column(name = "cctspeed")
	private String cctSpeed;
	
	@Column(name = "oldcctspeed")
	private String oldCctSpeed;
	
	@Column(name = "partnerid")
	private String partnerId;
	
	@Column(name = "foreignusid")
	private String foreignUsid;
	
	@Column(name = "parentusid")
	private String parentUsid;
	
	@Column(name = "serviceparam1")
	private String serviceParam1;
	
	@Column(name = "serviceparam2")
	private String serviceParam2;
	
	@Column(name = "serviceparam3")
	private String serviceParam3;
	
	@Column(name = "serviceparam4")
	private String serviceParam4;
	
	@Column(name = "serviceparam5")
	private String serviceParam5;
	
	@Column(name = "serviceparam6")
	private String serviceParam6;
	
	@Column(name = "serviceparam7")
	private String serviceParam7;
	
	@Column(name = "serviceparam8")
	private String serviceParam8;
	
	@Column(name = "serviceparam9")
	private String serviceParam9;
	
	@Column(name = "serviceparam10")
	private String serviceParam10;
	
	@Column(name = "serviceparam11")
	private String serviceParam11;
	
	@Column(name = "serviceparam12")
	private String serviceParam12;
	
	@Column(name = "serviceparam13")
	private String serviceParam13;
	
	@Column(name = "serviceparam14")
	private String serviceParam14;
	
	@Column(name = "serviceparam15")
	private String serviceParam15;
	
	@Column(name = "serviceparam16")
	private String serviceParam16;
	
	@Column(name = "serviceparam17")
	private String serviceParam17;
	
	@Column(name = "serviceparam18")
	private String serviceParam18;

	@Column(name = "serviceparam19")
	private String serviceParam19;

	@Column(name = "serviceparam20")
	private String serviceParam20;
	
	@Column(name = "aend_username")
	private String aendUserName;
	
	@Column(name = "bend_username")
	private String bendUserName;
	
	@Column(name = "orangeservicename")
	private String orangeServiceName;
	
	@Column(name = "coresiteid")
	private String coresiteId;
	
	@Column(name = "coreaddressid")
	private String coreaddressId;
	
	@Column(name = "btlvs_date")
	private Date btlvsDate;
	
	@Column(name = "sourcetool")
	private String sourceTool;

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getCustReqDeliveryDate() {
		return custReqDeliveryDate;
	}

	public void setCustReqDeliveryDate(Date custReqDeliveryDate) {
		this.custReqDeliveryDate = custReqDeliveryDate;
	}

	public Date getValidationDate() {
		return validationDate;
	}

	public void setValidationDate(Date validationDate) {
		this.validationDate = validationDate;
	}

	public Date getRevisedValidationDate() {
		return revisedValidationDate;
	}

	public void setRevisedValidationDate(Date revisedValidationDate) {
		this.revisedValidationDate = revisedValidationDate;
	}

	public Date getGad() {
		return gad;
	}

	public void setGad(Date gad) {
		this.gad = gad;
	}

	public Date getCdd() {
		return cdd;
	}

	public void setCdd(Date cdd) {
		this.cdd = cdd;
	}

	public Date getCav() {
		return cav;
	}

	public void setCav(Date cav) {
		this.cav = cav;
	}

	public Date getConfigurationDate() {
		return configurationDate;
	}

	public void setConfigurationDate(Date configurationDate) {
		this.configurationDate = configurationDate;
	}

	public Date getMav() {
		return mav;
	}

	public void setMav(Date mav) {
		this.mav = mav;
	}

	public Date getRfsDate() {
		return rfsDate;
	}

	public void setRfsDate(Date rfsDate) {
		this.rfsDate = rfsDate;
	}

	public Date getCutDate() {
		return cutDate;
	}

	public void setCutDate(Date cutDate) {
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

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
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

	public Date getSrfDate() {
		return srfDate;
	}

	public void setSrfDate(Date srfDate) {
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

	public void setForeignusId(String foreignUsid) {
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

	public Date getBtlvsDate() {
		return btlvsDate;
	}

	public void setBtlvsDate(Date btlvsDate) {
		this.btlvsDate = btlvsDate;
	}

	public String getSourceTool() {
		return sourceTool;
	}

	public void setSourceTool(String sourceTool) {
		this.sourceTool = sourceTool;
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

	
	public String getUsId() {
        return usId;
    }

    public void setUsId(String usId) {
        this.usId = usId;
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderPersist other = (OrderPersist) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
