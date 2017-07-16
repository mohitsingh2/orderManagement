package com.sopra.steria.jpinternational.business.formatter;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.sopra.steria.jpinternational.model.Order;
import com.sopra.steria.jpinternational.model.persistent.OrderPersist;

@Component
public class DataFormatter {

    private static final Logger LOGGER = LoggerFactory.getLogger(DataFormatter.class);

    public OrderPersist format(Order order) {
        OrderPersist formatordervalue = new OrderPersist();
        SimpleDateFormat datetimeformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");

        LOGGER.info("Enter in Data Formatting class to format request values");
       
        try {
            formatordervalue.setUsId(order.getUsid());

            if (order.getLoisOrderId() != null) {
                if (order.getLoisOrderId().length() >= 8) {
                    formatordervalue.setLoisOrderId(order.getLoisOrderId().substring(0, 8));
                } 	else {
                    formatordervalue.setLoisOrderId(order.getLoisOrderId());
                }
            }

            if (order.getOperationCode() != null) {
                if (order.getOperationCode().length() >= 20) {
                    formatordervalue.setOperationCode(order.getOperationCode().substring(0, 20));
                } else {
                    formatordervalue.setOperationCode(order.getOperationCode());
                }
            }

            if (order.getOrderReference() != null) {
                if (order.getOrderReference().length() >= 20) 
                    formatordervalue.setOrderReference(order.getOrderReference().substring(0, 20));
                 else 
                    formatordervalue.setOrderReference(order.getOrderReference());
                }

            if (order.getLegacyOrderReference() != null) {
                if (order.getLegacyOrderReference().length() >= 20) {
                    formatordervalue.setLegacyOrderReference(order.getLegacyOrderReference().substring(0, 20));
                } else {
                    formatordervalue.setLegacyOrderReference(order.getLegacyOrderReference());
                }
            }

            if (order.getOrderType() != null) {
                if (order.getOrderType().length() >= 20) {
                    formatordervalue.setOrderType(order.getOrderType().substring(0, 20));
                } else {
                    formatordervalue.setOrderType(order.getOrderType());
                }

            }

            if (order.getCustomerOrderReference() != null) {
                if (order.getCustomerOrderReference().length() >= 25) {
                    formatordervalue.setCustomerOrderReference(order.getCustomerOrderReference().substring(0, 25));
                } else {
                    formatordervalue.setCustomerOrderReference(order.getCustomerOrderReference());
                }

            }

            if (order.getCustomerDefinedCode() != null) {
                if (order.getCustomerDefinedCode().length() >= 25) {
                    formatordervalue.setCustomerDefinedCode(order.getCustomerDefinedCode().substring(0, 25));
                } else {
                    formatordervalue.setCustomerDefinedCode(order.getCustomerDefinedCode());
                }

            }

            if (order.getSellingEntityReference() != null) {
                if (order.getSellingEntityReference().length() >= 25) {
                    formatordervalue.setSellingEntityReference(order.getSellingEntityReference().substring(0, 25));
                } else {
                    formatordervalue.setSellingEntityReference(order.getSellingEntityReference());
                }

            }

            if (order.getProjectId() != null) {
                if (order.getProjectId().length() >= 15) {
                    formatordervalue.setProjectId(order.getProjectId().substring(0, 15));
                } else {
                    formatordervalue.setProjectId(order.getProjectId());
                }

            }

            if (order.getOrderStatus() != null) {
                if (order.getOrderStatus().length() >= 50) {
                    formatordervalue.setOrderStatus(order.getOrderStatus().substring(0, 50));
                } else {
                    formatordervalue.setOrderStatus(order.getOrderStatus());
                }

            }

            if (order.getUserId() != null) {
                if (order.getUserId().length() >= 8) {
                    formatordervalue.setUserId(order.getUserId().substring(0, 8));
                } else {
                    formatordervalue.setUserId(order.getUserId());
                }

            }

            if (order.getServiceProcurementActionId() != null) {
                if (order.getServiceProcurementActionId().length() >= 8) {
                    formatordervalue.setServiceProcurementActionId(order.getServiceProcurementActionId()
                            .substring(0, 8));
                } else {
                    formatordervalue.setServiceProcurementActionId(order.getServiceProcurementActionId());
                }

            }

            if (order.getLegacyServiceTypeId() != null) {
                if (order.getLegacyServiceTypeId().length() >= 50) {
                    formatordervalue.setLegacyServiceTypeId(order.getLegacyServiceTypeId().substring(0, 50));
                } else {
                    formatordervalue.setLegacyServiceTypeId(order.getLegacyServiceTypeId());
                }

            }

            if (order.getProdId() != null) {
                if (order.getProdId().length() >= 8) {
                    formatordervalue.setProdId(order.getProdId().substring(0, 8));
                } else {
                    formatordervalue.setProdId(order.getProdId());
                }

            }

            if (order.getSubprodId() != null) {
                if (order.getSubprodId().length() >= 8) {
                    formatordervalue.setSubprodId(order.getSubprodId().substring(0, 8));
                } else {
                    formatordervalue.setSubprodId(order.getSubprodId());
                }

            }

            if (order.getSupplementryServiceId() != null) {
                if (order.getSupplementryServiceId().length() >= 8) {
                    formatordervalue.setSupplementryServiceId(order.getSupplementryServiceId().substring(0, 8));
                } else {
                    formatordervalue.setSupplementryServiceId(order.getSupplementryServiceId());
                }

            }

            if (order.getServiceSpeedId() != null) {
                if (order.getServiceSpeedId().length() >= 10) {
                    formatordervalue.setServiceSpeedId(order.getServiceSpeedId().substring(0, 10));
                } else {
                    formatordervalue.setServiceSpeedId(order.getServiceSpeedId());
                }
            }

            if (order.getCircuitRequested() != null) {
                if (order.getCircuitRequested().length() >= 1) {
                    formatordervalue.setCircuitRequested(order.getCircuitRequested().substring(0, 0));
                } else {
                    formatordervalue.setCircuitRequested(order.getCircuitRequested());
                }

            }

            if (order.getConfigurationRequested() != null) {
                if (order.getConfigurationRequested().length() >= 1) {
                    formatordervalue.setConfigurationRequested(order.getConfigurationRequested().substring(0, 1));
                } else {
                    formatordervalue.setConfigurationRequested(order.getConfigurationRequested());
                }

            }

            if (order.getCustomerCode() != null) {
                if (order.getCustomerCode().length() >= 14) {
                    formatordervalue.setCustomerCode(order.getCustomerCode().substring(0, 14));
                } else {
                    formatordervalue.setCustomerCode(order.getCustomerCode());
                }

            }

            if (order.getCustomerName() != null) {
                if (order.getCustomerName().length() >= 35) {
                    formatordervalue.setCustomerName(order.getCustomerName().substring(0, 35));
                } else {
                    formatordervalue.setCustomerName(order.getCustomerName());
                }

            }

            if (order.getUserName() != null) {
                if (order.getUserName().length() >= 50) {
                    formatordervalue.setUserName(order.getUserName().substring(0, 50));
                } else {
                    formatordervalue.setUserName(order.getUserName());
                }

            }

            if (order.getAddress1() != null) {
                if (order.getAddress1().length() >= 50) {
                    formatordervalue.setAddress1(order.getAddress1().substring(0, 50));
                } else {
                    formatordervalue.setAddress1(order.getAddress1());
                }

            }

            if (order.getAddress2() != null) {
                if (order.getAddress2().length() >= 50) {
                    formatordervalue.setAddress2(order.getAddress2().substring(0, 50));
                } else {
                    formatordervalue.setAddress2(order.getAddress2());
                }

            }

            if (order.getAddress3() != null) {
                if (order.getAddress3().length() >= 50) {
                    formatordervalue.setAddress3(order.getAddress3().substring(0, 50));
                } else {
                    formatordervalue.setAddress3(order.getAddress3());
                }

            }

            if (order.getAddress4() != null) {
                if (order.getAddress4().length() >= 50) {
                    formatordervalue.setAddress4(order.getAddress4().substring(0, 50));
                } else {
                    formatordervalue.setAddress4(order.getAddress4());
                }

            }

            if (order.getFloorNumber() != null) {
                if (order.getFloorNumber().length() >= 20) {
                    formatordervalue.setFloorNumber(order.getFloorNumber().substring(0, 20));
                } else {
                    formatordervalue.setFloorNumber(order.getFloorNumber());
                }

            }

            if (order.getRoom() != null) {
                if (order.getRoom().length() >= 20) {
                    formatordervalue.setRoom(order.getRoom().substring(0, 20));
                } else {
                    formatordervalue.setRoom(order.getRoom());
                }

            }

            if (order.getCityName() != null) {
                if (order.getCityName().length() >= 50) {
                    formatordervalue.setCityName(order.getCityName().substring(0, 50));
                } else {
                    formatordervalue.setCityName(order.getCityName());
                }

            }

            if (order.getZipCode() != null) {
                if (order.getZipCode().length() >= 10) {
                    formatordervalue.setZipCode(order.getZipCode().substring(0, 10));
                } else {
                    formatordervalue.setZipCode(order.getZipCode());
                }

            }

            if (order.getCountryState() != null) {
                if (order.getCountryState().length() >= 50) {
                    formatordervalue.setCountryState(order.getCountryState().substring(0, 50));
                } else {
                    formatordervalue.setCountryState(order.getCountryState());
                }

            }

            if (order.getCountryCode() != null) {
                if (order.getCountryCode().length() >= 2) {
                    formatordervalue.setCountryCode(order.getCountryCode().substring(0, 2));
                } else {
                    formatordervalue.setCountryCode(order.getCountryCode());
                }

            }

            if (order.getContact1Name() != null) {
                if (order.getContact1Name().length() >= 50) {
                    formatordervalue.setContact1Name(order.getContact1Name().substring(0, 50));
                } else {
                    formatordervalue.setContact1Name(order.getContact1Name());
                }

            }

            if (order.getContact1Position() != null) {
                if (order.getContact1Position().length() >= 50) {
                    formatordervalue.setContact1Position(order.getContact1Position().substring(0, 50));
                } else {
                    formatordervalue.setContact1Position(order.getContact1Position());
                }

            }

            if (order.getContact1AreaCode() != null) {
                if (order.getContact1AreaCode().length() >= 4) {
                    formatordervalue.setContact1AreaCode(order.getContact1AreaCode().substring(0, 4));
                } else {
                    formatordervalue.setContact1AreaCode(order.getContact1AreaCode());
                }

            }

            if (order.getContact1Phone() != null) {
                if (order.getContact1Phone().length() >= 30) {
                    formatordervalue.setContact1Phone(order.getContact1Phone().substring(0, 30));
                } else {
                    formatordervalue.setContact1Phone(order.getContact1Phone());
                }

            }

            if (order.getContact1Fax() != null) {
                if (order.getContact1Fax().length() >= 30) {
                    formatordervalue.setContact1Fax(order.getContact1Fax().substring(0, 30));
                } else {
                    formatordervalue.setContact1Fax(order.getContact1Fax());
                }
            }

            if (order.getContact1CellularPhone() != null) {
                if (order.getContact1CellularPhone().length() >= 30) {
                    formatordervalue.setContact1CellularPhone(order.getContact1CellularPhone().substring(0, 30));
                } else {
                    formatordervalue.setContact1CellularPhone(order.getContact1CellularPhone());
                }
            }

            if (order.getContact1Email() != null) {
                if (order.getContact1Email().length() >= 80) {
                    formatordervalue.setContact1Email(order.getContact1Email().substring(0, 80));
                } else {
                    formatordervalue.setContact1Email(order.getContact1Email());
                }

            }

            if (order.getContact1Comment() != null) {
                if (order.getContact1Comment().length() >= 255) {
                    formatordervalue.setContact1Comment(order.getContact1Comment().substring(0, 255));
                } else {
                    formatordervalue.setContact1Comment(order.getContact1Comment());
                }

            }

            if (order.getContact2Name() != null) {
                if (order.getContact2Name().length() >= 50) {
                    formatordervalue.setContact2Name(order.getContact2Name().substring(0, 50));
                } else {
                    formatordervalue.setContact2Name(order.getContact2Name());
                }

            }

            if (order.getContact2Position() != null) {
                if (order.getContact2Position().length() >= 50) {
                    formatordervalue.setContact2Position(order.getContact2Position().substring(0, 50));
                } else {
                    formatordervalue.setContact2Position(order.getContact2Position());
                }

            }

            if (order.getContact2AreaCode() != null) {
                if (order.getContact2AreaCode().length() >= 4) {
                    formatordervalue.setContact2AreaCode(order.getContact2AreaCode().substring(0, 4));
                } else {
                    formatordervalue.setContact2AreaCode(order.getContact2AreaCode());
                }

            }

            if (order.getContact2Phone() != null) {
                if (order.getContact2Phone().length() >= 30) {
                    formatordervalue.setContact2Phone(order.getContact2Phone().substring(0, 30));
                } else {
                    formatordervalue.setContact2Phone(order.getContact2Phone());
                }

            }

            if (order.getContact2Fax() != null) {
                if (order.getContact2Fax().length() >= 30) {
                    formatordervalue.setContact2Fax(order.getContact2Fax().substring(0, 30));
                } else {
                    formatordervalue.setContact2Fax(order.getContact2Fax());
                }

            }

            if (order.getContact2CellularPhone() != null) {
                if (order.getContact2CellularPhone().length() >= 30) {
                    formatordervalue.setContact2CellularPhone(order.getContact2CellularPhone().substring(0, 30));
                } else {
                    formatordervalue.setContact2CellularPhone(order.getContact2CellularPhone());
                }

            }

            if (order.getContact2Email() != null) {
                if (order.getContact2Email().length() >= 80) {
                    formatordervalue.setContact2Email(order.getContact2Email().substring(0, 80));
                } else {
                    formatordervalue.setContact2Email(order.getContact2Email());
                }

            }

            if (order.getContact2Comment() != null) {
                if (order.getContact2Comment().length() >= 255) {
                    formatordervalue.setContact2Comment(order.getContact2Comment().substring(0, 255));
                } else {
                    formatordervalue.setContact2Comment(order.getContact2Comment());
                }
            }

             if (order.getOrderDate() != null) {                 
                 if(order.getOrderDate().contains("T")){
                     formatordervalue.setOrderDate(datetimeformat.parse(datetimeformat.format(datetimeformat.parse(order.getOrderDate()))));
                 }
                 else{                                        
                     formatordervalue.setOrderDate(dateformat.parse(dateformat.format(dateformat.parse(order.getOrderDate()))));                                       
                 }
             }
             
            
             if (order.getCustReqDeliveryDate() != null ){
                 if(order.getCustReqDeliveryDate().contains("T")){
                     formatordervalue.setCustReqDeliveryDate(datetimeformat.parse(datetimeformat.format(datetimeformat.parse(order.getCustReqDeliveryDate()))));
                 }
                 else{
                     formatordervalue.setCustReqDeliveryDate(dateformat.parse(dateformat.format(dateformat.parse(order.getCustReqDeliveryDate()))));  
                 }
             }
            
             if (order.getValidationDate() != null) {
                 if (order.getValidationDate().contains("T")){
                     formatordervalue.setValidationDate(datetimeformat.parse(datetimeformat.format(datetimeformat.parse(order.getValidationDate()))));
                 }
                 else{
                     formatordervalue.setValidationDate(dateformat.parse(dateformat.format(dateformat.parse(order.getValidationDate()))));
                 }
             }            
            
             if (order.getRevisedValidationDate() != null){
                 if(order.getRevisedValidationDate().contains("T")) {             
                     formatordervalue.setRevisedValidationDate(datetimeformat.parse(datetimeformat.format(datetimeformat.parse(order.getRevisedValidationDate()))));
                 }
                 else{
                     formatordervalue.setRevisedValidationDate(dateformat.parse(dateformat.format(dateformat.parse(order.getRevisedValidationDate()))));
                 }
             }
            
             if (order.getGad() != null){
                 if(order.getGad().contains("T")){
                     formatordervalue.setGad(datetimeformat.parse(datetimeformat.format(datetimeformat.parse(order.getGad()))));
                 }
                 else {
                     formatordervalue.setGad(dateformat.parse(dateformat.format(dateformat.parse(order.getRevisedValidationDate()))));
                 }
             }
            
             if (order.getCdd() != null) {
                 if(order.getCdd().contains("T")) {
                     formatordervalue.setCdd(datetimeformat.parse(datetimeformat.format(datetimeformat.parse(order.getCdd()))));
                 }
                 else {
                     formatordervalue.setCdd(dateformat.parse(dateformat.format(dateformat.parse(order.getCdd()))));
                 }
             }
            
             if (order.getCav() != null) {
                 if(order.getCav().contains("T")){
                     formatordervalue.setCav(datetimeformat.parse(datetimeformat.format(datetimeformat.parse(order.getCav()))));
                 }
                 else {
                     formatordervalue.setCav(dateformat.parse(dateformat.format(dateformat.parse(order.getCav()))));
                 }
             }
            
             if (order.getConfigurationDate() != null) {
                 if(order.getConfigurationDate().contains("T")) {
                     formatordervalue.setConfigurationDate(datetimeformat.parse(datetimeformat.format(datetimeformat.parse(order.getConfigurationDate()))));
                 }
                 else {
                     formatordervalue.setConfigurationDate(dateformat.parse(dateformat.format(dateformat.parse(order.getConfigurationDate()))));
                 }
             }
            
             if (order.getMav() != null) {
                 if(order.getMav().contains("T")){
                     formatordervalue.setMav(datetimeformat.parse(datetimeformat.format(datetimeformat.parse(order.getMav()))));
                 }
                 else{
                     formatordervalue.setMav(dateformat.parse(dateformat.format(dateformat.parse(order.getMav())))); 
                 }
             }
            
             if (order.getRfsDate() != null){
                 if(order.getRfsDate().contains("T")){
                     formatordervalue.setRfsDate(datetimeformat.parse(datetimeformat.format(datetimeformat.parse(order.getRfsDate())))); 
                 }
                 else{
                     formatordervalue.setRfsDate(dateformat.parse(dateformat.format(dateformat.parse(order.getRfsDate()))));
                 }
            
             }
            
             if (order.getCutDate() != null){
                 if(order.getCutDate().contains("T")){
                     formatordervalue.setCutDate(datetimeformat.parse(datetimeformat.format(datetimeformat.parse(order.getCutDate()))));
                 }
                 else{
                     formatordervalue.setCutDate(dateformat.parse(dateformat.format(dateformat.parse(order.getCutDate()))));
                 }
             }

            if (order.getNetworkParam0() != null) {
                if (order.getNetworkParam0().length() >= 255) {
                    formatordervalue.setNetworkParam0(order.getNetworkParam0().substring(0, 255));
                } else {
                    formatordervalue.setNetworkParam0(order.getNetworkParam0());
                }
            }

            if (order.getNetworkParam1() != null) {
                if (order.getNetworkParam1().length() >= 255) {
                    formatordervalue.setNetworkParam1(order.getNetworkParam1().substring(0, 255));
                } else {
                    formatordervalue.setNetworkParam1(order.getNetworkParam1());
                }
            }

            if (order.getNetworkParam2() != null) {
                if (order.getNetworkParam2().length() >= 255) {
                    formatordervalue.setNetworkParam2(order.getNetworkParam2().substring(0, 255));
                } else {
                    formatordervalue.setNetworkParam2(order.getNetworkParam2());
                }

            }

            if (order.getNetworkParam3() != null) {
                if (order.getNetworkParam3().length() >= 255) {
                    formatordervalue.setNetworkParam3(order.getNetworkParam3().substring(0, 255));
                } else {
                    formatordervalue.setNetworkParam3(order.getNetworkParam3());
                }

            }

            if (order.getNetworkParam4() != null) {
                if (order.getNetworkParam4().length() >= 255) {
                    formatordervalue.setNetworkParam4(order.getNetworkParam4().substring(0, 255));
                } else {
                    formatordervalue.setNetworkParam4(order.getNetworkParam4());
                }

            }

            if (order.getNetworkParam5() != null) {
                if (order.getNetworkParam5().length() >= 255) {
                    formatordervalue.setNetworkParam5(order.getNetworkParam5().substring(0, 255));
                } else {
                    formatordervalue.setNetworkParam5(order.getNetworkParam5());
                }

            }

            if (order.getNetworkParam6() != null) {
                if (order.getNetworkParam6().length() >= 255) {
                    formatordervalue.setNetworkParam6(order.getNetworkParam6().substring(0, 255));
                } else {
                    formatordervalue.setNetworkParam6(order.getNetworkParam6());
                }

            }

            if (order.getNetworkParam7() != null) {
                if (order.getNetworkParam7().length() >= 255) {
                    formatordervalue.setNetworkParam7(order.getNetworkParam7().substring(0, 255));
                } else {
                    formatordervalue.setNetworkParam7(order.getNetworkParam7());
                }

            }

            if (order.getNetworkParam8() != null) {
                if (order.getNetworkParam8().length() >= 255) {
                    formatordervalue.setNetworkParam8(order.getNetworkParam8().substring(0, 255));
                } else {
                    formatordervalue.setNetworkParam8(order.getNetworkParam8());
                }

            }

            if (order.getNetworkParam9() != null) {
                if (order.getNetworkParam9().length() >= 255) {
                    formatordervalue.setNetworkParam9(order.getNetworkParam9().substring(0, 255));
                } else {
                    formatordervalue.setNetworkParam9(order.getNetworkParam9());
                }

            }

            if (order.getNetworkParam10() != null) {
                if (order.getNetworkParam10().length() >= 255) {
                    formatordervalue.setNetworkParam10(order.getNetworkParam10().substring(0, 255));
                } else {
                    formatordervalue.setNetworkParam10(order.getNetworkParam10());
                }

            }

            if (order.getNetworkParam11() != null) {
                if (order.getNetworkParam11().length() >= 255) {
                    formatordervalue.setNetworkParam11(order.getNetworkParam11().substring(0, 255));
                } else {
                    formatordervalue.setNetworkParam11(order.getNetworkParam11());
                }

            }

            if (order.getNetworkParam12() != null) {
                if (order.getNetworkParam12().length() >= 255) {
                    formatordervalue.setNetworkParam12(order.getNetworkParam12().substring(0, 255));
                } else {
                    formatordervalue.setNetworkParam12(order.getNetworkParam12());
                }

            }

            if (order.getNetworkParam13() != null) {
                if (order.getNetworkParam13().length() >= 255) {
                    formatordervalue.setNetworkParam13(order.getNetworkParam13().substring(0, 255));
                } else {
                    formatordervalue.setNetworkParam13(order.getNetworkParam13());
                }

            }

            if (order.getNetworkParam14() != null) {
                if (order.getNetworkParam14().length() >= 255) {
                    formatordervalue.setNetworkParam14(order.getNetworkParam14().substring(0, 255));
                } else {
                    formatordervalue.setNetworkParam14(order.getNetworkParam14());
                }

            }

            if (order.getNetworkParam15() != null) {
                if (order.getNetworkParam15().length() >= 255) {
                    formatordervalue.setNetworkParam15(order.getNetworkParam15().substring(0, 255));
                } else {
                    formatordervalue.setNetworkParam15(order.getNetworkParam15());
                }

            }

            if (order.getNetworkParam16() != null) {
                if (order.getNetworkParam16().length() >= 255) {
                    formatordervalue.setNetworkParam16(order.getNetworkParam16().substring(0, 255));
                } else {
                    formatordervalue.setNetworkParam16(order.getNetworkParam16());
                }

            }

            if (order.getNetworkParam17() != null) {
                if (order.getNetworkParam17().length() >= 255) {
                    formatordervalue.setNetworkParam17(order.getNetworkParam17().substring(0, 255));
                } else {
                    formatordervalue.setNetworkParam17(order.getNetworkParam17());
                }

            }

            if (order.getNetworkParam18() != null) {
                if (order.getNetworkParam18().length() >= 255) {
                    formatordervalue.setNetworkParam18(order.getNetworkParam18().substring(0, 255));
                } else {
                    formatordervalue.setNetworkParam18(order.getNetworkParam18());
                }

            }

            if (order.getNetworkParam19() != null) {
                if (order.getNetworkParam19().length() >= 255) {
                    formatordervalue.setNetworkParam19(order.getNetworkParam19().substring(0, 255));
                } else {
                    formatordervalue.setNetworkParam19(order.getNetworkParam19());
                }

            }

            if (order.getNetworkParam20() != null) {
                if (order.getNetworkParam20().length() >= 255) {
                    formatordervalue.setNetworkParam20(order.getNetworkParam20().substring(0, 255));
                } else {
                    formatordervalue.setNetworkParam20(order.getNetworkParam20());
                }

            }

            if (order.getOrderComment() != null) {
                if (order.getOrderComment().length() >= 255) {
                    formatordervalue.setOrderComment(order.getOrderComment().substring(0, 255));
                } else {
                    formatordervalue.setOrderComment(order.getOrderComment());
                }

            }

            if (order.getRejectReason() != null) {
                if (order.getRejectReason().length() >= 10) {
                    formatordervalue.setRejectReason(order.getRejectReason().substring(0, 10));
                } else {
                    formatordervalue.setRejectReason(order.getRejectReason());
                }

            }

            Date v_creationdate = new Date();
            formatordervalue.setCreationDate(datetimeformat.parse(datetimeformat.format(v_creationdate)));

            if (order.getCityCode() != null) {
                if (order.getCityCode().length() >= 5) {
                    formatordervalue.setCityCode(order.getCityCode().substring(0, 5));
                } else {
                    formatordervalue.setCityCode(order.getCityCode());
                }

            }

            if (order.getCustProjCode() != null) {
                if (order.getCustProjCode().length() >= 20) {
                    formatordervalue.setCustProjCode(order.getCustProjCode().substring(0, 20));
                } else {
                    formatordervalue.setCustProjCode(order.getCustProjCode());
                }

            }

            if (order.getAendAddress1() != null) {
                if (order.getAendAddress1().length() >= 50) {
                    formatordervalue.setAendAddress1(order.getAendAddress1().substring(0, 50));
                } else {
                    formatordervalue.setAendAddress1(order.getAendAddress1());
                }

            }

            if (order.getAendAddress2() != null) {
                if (order.getAendAddress2().length() >= 50) {
                    formatordervalue.setAendAddress2(order.getAendAddress2().substring(0, 50));
                } else {
                    formatordervalue.setAendAddress2(order.getAendAddress2());
                }

            }

            if (order.getAendAddress3() != null) {
                if (order.getAendAddress3().length() >= 50) {
                    formatordervalue.setAendAddress3(order.getAendAddress3().substring(0, 50));
                } else {
                    formatordervalue.setAendAddress3(order.getAendAddress3());
                }

            }

            if (order.getAendAddress4() != null) {
                if (order.getAendAddress4().length() >= 50) {
                    formatordervalue.setAendAddress4(order.getAendAddress4().substring(0, 50));
                } else {
                    formatordervalue.setAendAddress4(order.getAendAddress4());
                }

            }

            if (order.getAendFloor() != null) {
                if (order.getAendFloor().length() >= 20) {
                    formatordervalue.setAendFloor(order.getAendFloor().substring(0, 20));
                } else {
                    formatordervalue.setAendFloor(order.getAendFloor());
                }

            }

            if (order.getAendRoom() != null) {
                if (order.getAendRoom().length() >= 20) {
                    formatordervalue.setAendRoom(order.getAendRoom().substring(0, 20));
                } else {
                    formatordervalue.setAendRoom(order.getAendRoom());
                }

            }

            if (order.getAendCityIataCode() != null) {
                if (order.getAendCityIataCode().length() >= 5) {
                    formatordervalue.setAendCityIataCode(order.getAendCityIataCode().substring(0, 5));
                } else {
                    formatordervalue.setAendCityIataCode(order.getAendCityIataCode());
                }

            }

            if (order.getAendCityName() != null) {
                if (order.getAendCityName().length() >= 50) {
                    formatordervalue.setAendCityName(order.getAendCityName().substring(0, 50));
                } else {
                    formatordervalue.setAendCityName(order.getAendCityName());
                }

            }

            if (order.getAendZipCode() != null) {
                if (order.getAendZipCode().length() >= 15) {
                    formatordervalue.setAendZipCode(order.getAendZipCode().substring(0, 15));
                } else {
                    formatordervalue.setAendZipCode(order.getAendZipCode());
                }

            }

            if (order.getAendCountryState() != null) {
                if (order.getAendCountryState().length() >= 50) {
                    formatordervalue.setAendCountryState(order.getAendCountryState().substring(0, 50));
                } else {
                    formatordervalue.setAendCountryState(order.getAendCountryState());
                }

            }

            if (order.getAendCountryCode() != null) {
                if (order.getAendCountryCode().length() >= 4) {
                    formatordervalue.setAendCountryCode(order.getAendCountryCode().substring(0, 4));
                } else {
                    formatordervalue.setAendCountryCode(order.getAendCountryCode());
                }

            }

            if (order.getAendContact1Name() != null) {
                if (order.getAendContact1Name().length() >= 50) {
                    formatordervalue.setAendContact1Name(order.getAendContact1Name().substring(0, 50));
                } else {
                    formatordervalue.setAendContact1Name(order.getAendContact1Name());
                }

            }

            if (order.getAendContact1Position() != null) {
                if (order.getAendContact1Position().length() >= 50) {
                    formatordervalue.setAendContact1Position(order.getAendContact1Position().substring(0, 50));
                } else {
                    formatordervalue.setAendContact1Position(order.getAendContact1Position());
                }

            }

            if (order.getAendContact1PhoneAreaCode() != null) {
                if (order.getAendContact1PhoneAreaCode().length() >= 4) {
                    formatordervalue.setAendContact1PhoneAreaCode(order.getAendContact1PhoneAreaCode().substring(0, 4));
                } else {
                    formatordervalue.setAendContact1PhoneAreaCode(order.getAendContact1PhoneAreaCode());
                }

            }

            if (order.getAendContact1Phone() != null) {
                if (order.getAendContact1Phone().length() >= 30) {
                    formatordervalue.setAendContact1Phone(order.getAendContact1Phone().substring(0, 30));
                } else {
                    formatordervalue.setAendContact1Phone(order.getAendContact1Phone());
                }

            }

            if (order.getAendContact1FaxAreaCode() != null) {
                if (order.getAendContact1FaxAreaCode().length() >= 4) {
                    formatordervalue.setAendContact1FaxAreaCode(order.getAendContact1FaxAreaCode().substring(0, 4));
                } else {
                    formatordervalue.setAendContact1FaxAreaCode(order.getAendContact1FaxAreaCode());
                }

            }

            if (order.getAendContact1Fax() != null) {
                if (order.getAendContact1Fax().length() >= 30) {
                    formatordervalue.setAendContact1Fax(order.getAendContact1Fax().substring(0, 30));
                } else {
                    formatordervalue.setAendContact1Fax(order.getAendContact1Fax());
                }

            }

            if (order.getAendContact1CellAreaCode() != null) {
                if (order.getAendContact1CellAreaCode().length() >= 4) {
                    formatordervalue.setAendContact1CellAreaCode(order.getAendContact1CellAreaCode().substring(0, 4));
                } else {
                    formatordervalue.setAendContact1CellAreaCode(order.getAendContact1CellAreaCode());
                }

            }

            if (order.getAendContact1CellularPhone() != null) {
                if (order.getAendContact1CellularPhone().length() >= 30) {
                    formatordervalue
                            .setAendContact1CellularPhone(order.getAendContact1CellularPhone().substring(0, 30));
                } else {
                    formatordervalue.setAendContact1CellularPhone(order.getAendContact1CellularPhone());
                }

            }

            if (order.getAendContact1Email() != null) {
                if (order.getAendContact1Email().length() >= 80) {
                    formatordervalue.setAendContact1Email(order.getAendContact1Email().substring(0, 80));
                } else {
                    formatordervalue.setAendContact1Email(order.getAendContact1Email());
                }

            }

            if (order.getAendContact2Name() != null) {
                if (order.getAendContact2Name().length() >= 50) {
                    formatordervalue.setAendContact2Name(order.getAendContact2Name().substring(0, 50));
                } else {
                    formatordervalue.setAendContact2Name(order.getAendContact2Name());
                }

            }

            if (order.getAendContact2Position() != null) {
                if (order.getAendContact2Position().length() >= 50) {
                    formatordervalue.setAendContact2Position(order.getAendContact2Position().substring(0, 50));
                } else {
                    formatordervalue.setAendContact2Position(order.getAendContact2Position());
                }

            }

            if (order.getAendContact2PhoneAreaCode() != null) {
                if (order.getAendContact2PhoneAreaCode().length() >= 4) {
                    formatordervalue.setAendContact2PhoneAreaCode(order.getAendContact2PhoneAreaCode().substring(0, 4));
                } else {
                    formatordervalue.setAendContact2PhoneAreaCode(order.getAendContact2PhoneAreaCode());
                }

            }

            if (order.getAendContact2Phone() != null) {
                if (order.getAendContact2Phone().length() >= 30) {
                    formatordervalue.setAendContact2Phone(order.getAendContact2Phone().substring(0, 30));
                } else {
                    formatordervalue.setAendContact2Phone(order.getAendContact2Phone());
                }

            }

            if (order.getAendContact2FaxAreaCode() != null) {
                if (order.getAendContact2FaxAreaCode().length() >= 4) {
                    formatordervalue.setAendContact2FaxAreaCode(order.getAendContact2FaxAreaCode().substring(0, 4));
                } else {
                    formatordervalue.setAendContact2FaxAreaCode(order.getAendContact2FaxAreaCode());
                }

            }

            if (order.getAendContact2Fax() != null) {
                if (order.getAendContact2Fax().length() >= 30) {
                    formatordervalue.setAendContact2Fax(order.getAendContact2Fax().substring(0, 30));
                } else {
                    formatordervalue.setAendContact2Fax(order.getAendContact2Fax());
                }

            }

            if (order.getAendContact2CellAreaCode() != null) {
                if (order.getAendContact2CellAreaCode().length() >= 4) {
                    formatordervalue.setAendContact2CellAreaCode(order.getAendContact2CellAreaCode().substring(0, 4));
                } else {
                    formatordervalue.setAendContact2CellAreaCode(order.getAendContact2CellAreaCode());
                }

            }

            if (order.getAendContact2CellularPhone() != null) {
                if (order.getAendContact2CellularPhone().length() >= 30) {
                    formatordervalue
                            .setAendContact2CellularPhone(order.getAendContact2CellularPhone().substring(0, 30));
                } else {
                    formatordervalue.setAendContact2CellularPhone(order.getAendContact2CellularPhone());
                }

            }

            if (order.getAendContact2Email() != null) {
                if (order.getAendContact2Email().length() >= 80) {
                    formatordervalue.setAendContact2Email(order.getAendContact2Email().substring(0, 80));
                } else {
                    formatordervalue.setAendContact2Email(order.getAendContact2Email());
                }

            }

             if (order.getSrfDate() != null ) {
                 if(order.getSrfDate().contains("T")){
                     formatordervalue.setSrfDate(datetimeformat.parse(datetimeformat.format(datetimeformat.parse(order.getSrfDate()))));
                 }
                 else{
                     formatordervalue.setSrfDate(dateformat.parse(dateformat.format(dateformat.parse(order.getSrfDate()))));
                 }
             }

            if (order.getOriginatorOrdRef() != null) {
                if (order.getOriginatorOrdRef().length() >= 35) {
                    formatordervalue.setOriginatorOrdRef(order.getOriginatorOrdRef().substring(0, 35));
                } else {
                    formatordervalue.setOriginatorOrdRef(order.getOriginatorOrdRef());
                }

            }

            if (order.getRequestorName() != null) {
                if (order.getRequestorName().length() >= 50) {
                    formatordervalue.setRequestorName(order.getRequestorName().substring(0, 50));
                } else {
                    formatordervalue.setRequestorName(order.getRequestorName());
                }

            }

            if (order.getRequestorEmail() != null) {
                if (order.getRequestorEmail().length() >= 80) {
                    formatordervalue.setRequestorEmail(order.getRequestorEmail().substring(0, 80));
                } else {
                    formatordervalue.setRequestorEmail(order.getRequestorEmail());
                }

            }

            if (order.getRequestorPhoneArea() != null) {
                if (order.getRequestorPhoneArea().length() >= 4) {
                    formatordervalue.setRequestorPhoneArea(order.getRequestorPhoneArea().substring(0, 4));
                } else {
                    formatordervalue.setRequestorPhoneArea(order.getRequestorPhoneArea());
                }

            }

            if (order.getRequestorPhone() != null) {
                if (order.getRequestorPhone().length() >= 30) {
                    formatordervalue.setRequestorPhone(order.getRequestorPhone().substring(0, 30));
                } else {
                    formatordervalue.setRequestorPhone(order.getRequestorPhone());
                }

            }

            if (order.getRequestorFaxArea() != null) {
                if (order.getRequestorFaxArea().length() >= 4) {
                    formatordervalue.setRequestorFaxArea(order.getRequestorFaxArea().substring(0, 4));
                } else {
                    formatordervalue.setRequestorFaxArea(order.getRequestorFaxArea());
                }

            }

            if (order.getRequestorFax() != null) {
                if (order.getRequestorFax().length() >= 30) {
                    formatordervalue.setRequestorFax(order.getRequestorFax().substring(0, 30));
                } else {
                    formatordervalue.setRequestorFax(order.getRequestorFax());
                }
            }

            if (order.getbOption() != null) {
                if (order.getbOption().length() >= 1) {
                    formatordervalue.setbOption(order.getbOption().substring(0, 0));
                } else {
                    formatordervalue.setbOption(order.getbOption());
                }
            }

            if (order.getDisruptTest() != null) {
                if (order.getDisruptTest().length() >= 1) {
                    formatordervalue.setDisruptTest(order.getDisruptTest().substring(0, 0));
                } else {
                    formatordervalue.setDisruptTest(order.getDisruptTest());
                }
            }

            if (order.getCctSpeed() != null) {
                if (order.getCctSpeed().length() >= 3) {
                    formatordervalue.setCctSpeed(order.getCctSpeed().substring(0, 3));
                } else {
                    formatordervalue.setCctSpeed(order.getCctSpeed());
                }
            }

            if (order.getOldCctSpeed() != null) {
                if (order.getOldCctSpeed().length() >= 3) {
                    formatordervalue.setOldCctSpeed(order.getOldCctSpeed().substring(0, 3));
                } else {
                    formatordervalue.setOldCctSpeed(order.getOldCctSpeed());
                }
            }

            if (order.getPartnerId() != null) {
                if (order.getPartnerId().length() >= 10) {
                    formatordervalue.setPartnerId(order.getPartnerId().substring(0, 10));
                } else {
                    formatordervalue.setPartnerId(order.getPartnerId());
                }
            }

            if (order.getForeignUsid() != null) {
                if (order.getForeignUsid().length() >= 15) {
                    formatordervalue.setForeignusId(order.getForeignUsid().substring(0, 15));
                } else {
                    formatordervalue.setForeignusId(order.getForeignUsid());
                }
            }

            if (order.getParentUsid() != null) {
                if (order.getParentUsid().length() >= 25) {
                    formatordervalue.setParentUsid(order.getParentUsid().substring(0, 25));
                } else {
                    formatordervalue.setParentUsid(order.getParentUsid());
                }
            }

            if (order.getServiceParam1() != null) {
                if (order.getServiceParam1().length() >= 255) {
                    formatordervalue.setServiceParam1(order.getServiceParam1().substring(0, 255));
                } else {
                    formatordervalue.setServiceParam1(order.getServiceParam1());
                }
            }

            if (order.getServiceParam2() != null) {
                if (order.getServiceParam2().length() >= 255) {
                    formatordervalue.setServiceParam2(order.getServiceParam2().substring(0, 255));
                } else {
                    formatordervalue.setServiceParam2(order.getServiceParam2());
                }
            }

            if (order.getServiceParam3() != null) {
                if (order.getServiceParam3().length() >= 255) {
                    formatordervalue.setServiceParam3(order.getServiceParam3().substring(0, 255));
                } else {
                    formatordervalue.setServiceParam3(order.getServiceParam3());
                }
            }

            if (order.getServiceParam4() != null) {
                if (order.getServiceParam4().length() >= 255) {
                    formatordervalue.setServiceParam4(order.getServiceParam4().substring(0, 255));
                } else {
                    formatordervalue.setServiceParam4(order.getServiceParam4());
                }
            }

            if (order.getServiceParam5() != null) {
                if (order.getServiceParam5().length() >= 255) {
                    formatordervalue.setServiceParam5(order.getServiceParam5().substring(0, 255));
                } else {
                    formatordervalue.setServiceParam5(order.getServiceParam5());
                }
            }

            if (order.getServiceParam6() != null) {
                if (order.getServiceParam6().length() >= 255) {
                    formatordervalue.setServiceParam6(order.getServiceParam6().substring(0, 255));
                } else {
                    formatordervalue.setServiceParam6(order.getServiceParam6());
                }
            }

            if (order.getServiceParam7() != null) {
                if (order.getServiceParam7().length() >= 255) {
                    formatordervalue.setServiceParam7(order.getServiceParam7().substring(0, 255));
                } else {
                    formatordervalue.setServiceParam7(order.getServiceParam7());
                }
            }

            if (order.getServiceParam8() != null) {
                if (order.getServiceParam8().length() >= 255) {
                    formatordervalue.setServiceParam8(order.getServiceParam8().substring(0, 255));
                } else {
                    formatordervalue.setServiceParam8(order.getServiceParam8());
                }
            }

            if (order.getServiceParam9() != null) {
                if (order.getServiceParam9().length() >= 255) {
                    formatordervalue.setServiceParam9(order.getServiceParam9().substring(0, 255));
                } else {
                    formatordervalue.setServiceParam9(order.getServiceParam9());
                }
            }

            if (order.getServiceParam10() != null) {
                if (order.getServiceParam10().length() >= 255) {
                    formatordervalue.setServiceParam10(order.getServiceParam10().substring(0, 255));
                } else {
                    formatordervalue.setServiceParam10(order.getServiceParam10());
                }
            }

            if (order.getServiceParam11() != null) {
                if (order.getServiceParam11().length() >= 255) {
                    formatordervalue.setServiceParam11(order.getServiceParam11().substring(0, 255));
                } else {
                    formatordervalue.setServiceParam11(order.getServiceParam11());
                }
            }

            if (order.getServiceParam12() != null) {
                if (order.getServiceParam12().length() >= 255) {
                    formatordervalue.setServiceParam12(order.getServiceParam12().substring(0, 255));
                } else {
                    formatordervalue.setServiceParam12(order.getServiceParam12());
                }

            }
            if (order.getServiceParam13() != null) {
                if (order.getServiceParam13().length() >= 255) {
                    formatordervalue.setServiceParam13(order.getServiceParam13().substring(0, 255));
                } else {
                    formatordervalue.setServiceParam13(order.getServiceParam13());
                }
            }

            if (order.getServiceParam14() != null) {
                if (order.getServiceParam14().length() >= 255) {
                    formatordervalue.setServiceParam14(order.getServiceParam14().substring(0, 255));
                } else {
                    formatordervalue.setServiceParam14(order.getServiceParam14());
                }
            }

            if (order.getServiceParam15() != null) {
                if (order.getServiceParam15().length() >= 255) {
                    formatordervalue.setServiceParam15(order.getServiceParam15().substring(0, 255));
                } else {
                    formatordervalue.setServiceParam15(order.getServiceParam15());
                }
            }

            if (order.getServiceParam16() != null) {
                if (order.getServiceParam16().length() >= 255) {
                    formatordervalue.setServiceParam16(order.getServiceParam16().substring(0, 255));
                } else {
                    formatordervalue.setServiceParam16(order.getServiceParam16());
                }
            }

            if (order.getServiceParam17() != null) {
                if (order.getServiceParam17().length() >= 255) {
                    formatordervalue.setServiceParam17(order.getServiceParam17().substring(0, 255));
                } else {
                    formatordervalue.setServiceParam17(order.getServiceParam17());
                }
            }

            if (order.getServiceParam18() != null) {
                if (order.getServiceParam18().length() >= 255) {
                    formatordervalue.setServiceParam18(order.getServiceParam18().substring(0, 255));
                } else {
                    formatordervalue.setServiceParam18(order.getServiceParam18());
                }
            }

            if (order.getServiceParam19() != null) {
                if (order.getServiceParam19().length() >= 255) {
                    formatordervalue.setServiceParam19(order.getServiceParam19().substring(0, 255));
                } else {
                    formatordervalue.setServiceParam19(order.getServiceParam19());
                }
            }

            if (order.getServiceParam20() != null) {
                if (order.getServiceParam20().length() >= 255) {
                    formatordervalue.setServiceParam20(order.getServiceParam20().substring(0, 255));
                } else {
                    formatordervalue.setServiceParam20(order.getServiceParam20());
                }
            }

            if (order.getAendUserName() != null) {
                if (order.getAendUserName().length() >= 50) {
                    formatordervalue.setAendUserName(order.getAendUserName().substring(0, 50));
                } else {
                    formatordervalue.setAendUserName(order.getAendUserName());
                }
            }

            if (order.getBendUserName() != null) {
                if (order.getBendUserName().length() >= 50) {
                    formatordervalue.setBendUserName(order.getBendUserName().substring(0, 50));
                } else {
                    formatordervalue.setBendUserName(order.getBendUserName());
                }
            }

            if (order.getOrangeServiceName() != null) {
                if (order.getOrangeServiceName().length() >= 255) {
                    formatordervalue.setOrangeServiceName(order.getOrangeServiceName().substring(0, 255));
                } else {
                    formatordervalue.setOrangeServiceName(order.getOrangeServiceName());
                }
            }

            if (order.getCoresiteId() != null) {
                if (order.getCoresiteId().length() >= 10) {
                    formatordervalue.setCoresiteId(order.getCoresiteId().substring(0, 10));
                } else {
                    formatordervalue.setCoresiteId(order.getCoresiteId());
                }
            }

            if (order.getCoreaddressId() != null) {
                if (order.getCoreaddressId().length() >= 10) {
                    formatordervalue.setCoreaddressId(order.getCoreaddressId().substring(0, 10));
                } else {
                    formatordervalue.setCoreaddressId(order.getCoreaddressId());
                }
            }

             if (order.getBtlvsDate() != null ) {
                 if(order.getBtlvsDate().contains("T")){
                     formatordervalue.setBtlvsDate(datetimeformat.parse(datetimeformat.format(datetimeformat.parse(order.getBtlvsDate()))));
                 }
                 else{
                     formatordervalue.setBtlvsDate(dateformat.parse(dateformat.format(dateformat.parse(order.getBtlvsDate()))));
                 }
             }

            if (order.getSourceTool() != null) {
                if (order.getSourceTool().length() >= 20) {
                    formatordervalue.setSourceTool(order.getSourceTool().substring(0, 20));
                } else {
                    formatordervalue.setSourceTool(order.getSourceTool());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        LOGGER.info("End of data formating for all the columns succeesfully");
        return formatordervalue;
    }
}
