package com.sopra.steria.jpinternational.constant;


public interface MessageConstants {

    public static final int CONSTANT_VALUE_ONE = 1;
    public static final String STATUS_CODE_OK = "200";
    public static final String STATUS_CODE_CREATED = "201";
    public static final String ERRORCODE_GENERAL_EXCEPTION = "202";

    public static final String ERRORCODE_CIB_POLARIS_BAD_REQUEST = "400";
    public static final String STATUS_UNAUTORISED = "401";
    public static final String STATUS_RESOURCE_NOT_FOUND = "404";
    public static final int RESPONSE_CODE_BAD_REQUEST_FUNCTIONAL = 422;

    public static final String ERRORCODE_MORETHANONEOFFER = "4001";
    public static final String ERRORCODE_RELATIONSHIP = "4002";
    public static final String ERRORCODE_NO_ASSOCIATED_PRODUCT = "4003";
    public static final String ERRORCODE_BLANK_OFFERID = "4004";
    public static final String ERRORCODE_NOPRODUCTWITHTYPEOFFER = "4005";
    public static final String ERRORCODE_VALUE_NOT_EXIST_IN_LIST_GRP = "4006";
    public static final String ERRORCODE_CHILD_NOT_PRESENT_FOR_PARENT_GRP = "4007";
    public static final String ERRORCODE_VERSION_MISMATCH = "4008";
    public static final String ERRORCODE_MANDATORY_PRODUCT_NOT_EXIST = "4009";

    public static final String ERRORCODE_MANDATORY_PARAMETERS_MISSING = "4010";
    public static final String ERRORCODE_SITEINFO_MISMATCH_CIBREFERENTIAL = "4011";
    public static final String ERRORCODE_INVALIDQUERYPARAMETER = "4012";
    public static final String ERRORCODE_VALIDATE_PRODUCTID = "4013";
    public static final String ERRORCODE_VALIDATE_PRODUCTVERSIONID = "4014";
    public static final String ERRORCODE_BILLINGSTARTDATE = "4015";
    public static final String ERRORCODE_PARTIALBILLINGSTARTDATE = "4016";
    public static final String ERRORCODE_BILLINGTERMINATIONDATE = "4017";
    public static final String ERRORCODE_SERVICESTARTDATE = "4018";
    public static final String ERRORCODE_SERVICETERMINATIONDATE = "4019";

    public static final String ERRORCODE_CANCEL_FLOW = "4020";
    public static final String ERRORCODE_OFFERID_WITH_ACTIVE_STATUS_MISMATCH_DATABASE = "4021";
    public static final String ERRORCODE_PARALLELORDER = "4022";
    public static final String ERRORCODE_NOINFO_IN_CIBREFERENTIAL = "4023";
    public static final String ERRORCODE_RELATEDPARTY_ROLE = "4026";
    public static final String ERRORCODE_SITE = "4027";
    public static final String ERRORCODE_OFFER_PRODUCTOFFERING = "4028";
    public static final String ERRORCODE_RELATEDPARTY_CONTRACTINGPARTY_ROLE = "4029";
    public static final String ERRORCODE_MANDATORY_FOR_RFSCORRECTION_TERMINATED_DISCONNECT = "4043";
    public static final String ERRORCODE_FASTTRACK_ONLY_FOR_ACTIVE_TERMINATED = "4030";
    public static final String ERRORCODE_EXTRA_FIELD_EXISTS = "4031";
    public static final String ERRORCODE_ONLY_RFB_UPDATE_ALLOWED = "4032";
    public static final String ERRORCODE_SETRFB_CHANGE_EXCEPT_MLI = "4033";
    public static final String ERRORCODE_MANDATORY_FOR_RFSCORRECTION = "4034";
    public static final String ERRORCODE_MANDATORY_CONDITION_IN_POST_REQUEST = "4035";
    public static final String ERRORCODE_OFFER_PRODUCTID_IN_PUT_REQUEST = "4036";
    public static final String ERRORCODE_HAS_PARTIAL_BILLING_NOT_PRESENT_FOR_CHILD = "4037";
    public static final String ERRORCODE_WRONG_STATUS = "4038";
    public static final String ERRORCODE_WRONG_TERMINATIONDATE_STATUS = "4039";

    public static final String ERRORCODE_WRONG_PRICETYPE = "4040";
    public static final String ERRORCODE_CHANGEORDER_PREVIOUS_RELATIONSHIP = "4041";
    public static final String ERRORCODE_WRONG_DATA_FOR_FASTRACK = "4042";
    public static final String ERRORCODE_UNKOWN_CONTEXT_VALUE = "4042";
    public static final String ERRORCODE_RELIESON = "4044";

    public static final String ERRORCODE_INVALIDLIMIT = "4045";

    public static final String ERRORCODE_UNSUPPORTED_QUERY_EXPRESSION = "4046";

    public static final String ERRORCODE_DATA_MISMATCH = "4051";
    public static final String ERRORCODE_RFBFLOW = "4052";
    public static final String ERRORCODE_MANDATORY_PRODUCT_PRESENT_AS_TERMINATED = "4047";
    public static final String ERRORCODE_NO_SITE_AVAILABLE = "4053";
    public static final String ERRORCODE_MANDATORY_QUERY_PARAMETER_MISSING = "4048";
    public static final String ERRORCODE_RELATEDPARTY_MISSING = "4049";
    public static final String ERRORCODE_STATUS_VALUE_WRONG_SETRFS_FOR_TERMINATED = "4051";

    public static final String ERRORCODE_ROLE_UNAUTHORIZED = "4055";
    public static final String ERRORCODE_MISSING_ROLE_NAME = "4056";
    public static final String ERRORCODE_ACTION_NOT_ELIGIBLE = "4057";
    public static final String ERRORCODE_STATUS_VALUE_WRONG_SETRFS = "4050";
    public static final String ERRORCODE_MISSING_CANCEL_ORDER_DATE = "4054";
    public static final String ERRORCODE_PATCH_WITH_COMMERCIALLY_CEASED = "4055";

    public static final String ERRORCODE_FAGCIB_WRONG_OFFSET_VALUE = "4060";
    public static final String ERRORCODE_FAGCIB_INVALID_QUERY_PARAM = "4061";

    public static final String ERRORCODE_OFFER_NOT_FOUND_REPUBLICATION = "4063";
    public static final String ERRORCODE_CUSTOMERIC01_MISMATCH_DATABASE = "4064";
    public static final String ERRORCODE_ADDRESSID_EXISTS_IN_DATABASE = "4065";
    public static final String ERRORCODE_NO_ADDRESSINFO_IN_CIBREFERENTIAL = "4066";

    public static final String RESPONSE_PUBLISHCIB_ERROR_CODE = "3003";
    public static final String ERRORCODE_INVALIDXML = "3004";
    public static final String ERRORCODE_FAILFILEMOVEMENT = "3001";

    public static final String ERRORCODE_OFFER_ALREADY_PRESENT = "4056";
    public static final String ERRORCODE_XML_PARSING = "3002";
    public static final String ERRORCODE_DUPLICATE_OCATID = "4057";
    public static final String ERRORCODE_MISSING_IN_OFFERING = "4058";
    public static final String ERRORCODE_MISSING_PARENTID = "4059";
    public static final String ERRORCODE_DB_CLONE = "3006";
    public static final String ERRORCODE_SAVING_XML = "3005";
    public static final String ERRORCODE_INVALID_PARAMETERTYPE = "3007";

    public static final String SYM = ">.";
    public static final String PK = "role";
    public static final String REQ_SYM = "*";
    public static final String STRING_AND_VERSION = " and version ";
    public static final String SITE = "site";
    public static final String ADDRESS = "address";
    public static final String REQ = "x-requested-with";
    public static final String OCAT_ID = "System Bug : The OCAT ID <";
    public static final String PRODUCT_ID = "System Bug : Product Id <";
    public static final String RELATED_PARTY = "relatedParty";
    public static final String BILLING_ACCOUNT = "billingAccount";
    public static final String EXCEPTION = "Exception in product :";
    public static final String PRODUCT_OFFERING = "productOffering";
    public static final String TRADING_NAME = "customer.tradingName";
    public static final String ERROR_MSZ_EXP = " : Exception message:";
    public static final String UNUSED_PARAM = "unused parameter : {} ";
    public static final String ERROR_MSZ_EXP_CAUSE = "Exception cause:";
    public static final String ENDUSER_CUSTOMERID = "endUserCustomerId";
    public static final String PRODUCT_VERSION = "System Bug : Product VersionId <";
    public static final String INSTALLED_OFFER = " for installed offer ";
    public static final String PRODUCT_OFFERING_ID = "productOffering.id";
    public static final String ACCESS_ORIGIN = "Access-Control-Allow-Origin";
    public static final String ACCESS_HEADERS = "Access-Control-Allow-Headers";
    public static final String ROLE_UNAUTHORIZED = "You do not have sufficient role to perform this operation";
    public static final String CONTRACTING_CUSTOMERID = "contractingCustomerId";
    public static final String ERRORMESSAGE_UNKOWN_CONTEXT_VALUE = "System Bug : Context value <";
    public static final String ERRORMESSAGE_MISSING = "> is missing in the request.";
    public static final String ERROR_XML_PARSING = "Error while parsing the xmlFile";
    public static final String INSTALLED_OFFER_VERSION = " ,Installed offer version ";
    public static final String GRP_REFRENTIAL = "> does not exist in GRP referential.";
    public static final String DESCRIPTION_BAD_REQUEST_TECHNICAL = "bad_request_technical";
    public static final String COMMON_MESSAGE_DATAVALIDATION = "> does not exist in CiBase";
    public static final String DESCRIPTION_BAD_REQUEST_FUNCTIONAL = "bad_request_functional";
    public static final String ERRORMESSAGE_INVALIDXML = "Error while validating Xml Schema";
    public static final String DESCRIPTION_GENERAL_EXCEPTION_FOR_UPLOAD_TOOL = "PSID/UniqueName ";
    public static final String ERROR_NOOFFER = "No Product of type = 'Offer' exists in the request";
    public static final String WELCOME_MESSAGE_DATA_VALIDATION = "Entry in Method DataValidation :";
    public static final String ERRORMESSAGE_NO_PRODUCT_AVAILABLE = "No product available in request";
    public static final String BILLING_START_DATE_MESSAGE = "Ready for billing must not be less than ";
    public static final String ERRORMESSAGE_FAILFILEMOVEMENT = "Error saving the data in the Database";
    public static final String ERRORMESSAGE_SITE = "Site can not be changed for same Installed Offer.";
    public static final String INVALID_PRODUCT_TYPE = "Product type must be 'Offer' only for this search.";
    public static final String ERRORMESSAGE_STATUS_MISMATCH_WITH_DATABASE = "Status Mismatch with Database";
    public static final String ERROMESSAGE_WRONG_DATA_FOR_FASTRACK = "One or more Input data is wrong/missing";
    public static final String ERRORMESSAGE_CANCEL_FLOW = "System Bug : Active Installed Offer Version cannot be cancelled";
    public static final String DESCRIPTION_GENERAL_EXCEPTION_FOR_UPLOAD_TOOL1 = " Not Found In GRP Referential.";

    public static final String ERRORMESSAGE_ACTIVE_RELIESON = " with an Active Version for reliesOn relationship ";
    public static final String ERRORMESSAGE_VERSION_MISMATCH = "Version Mismatch with GRP referential for OCAT ID <";
    public static final String DESCRIPTION_GENERAL_EXCEPTION = "An unexpected technical error has occured in CiBase";
    public static final String ERRORMESSAGE_NOPRODUCTWITHTYPEOFFER = "System Bug : No Product of type = 'Offer' exists in the request";
    public static final String ERRORMESSAGE_MORETHANONEOFFER = "System Bug : More than 1 product of type = 'Offer' exist in the request";
    public static final String ERRORMESSAGE_UNSUPPORTED_QUERY_EXPRESSION = "System Bug : Unsupported Query Expression for query parameter <";
    public static final String ERRORMESSAGE_ACTIVE_MIGRATION = " with an Active Version for reliesOn migration/relocation ";

    public static final String ERRORMESSAGE_OFFER_PRODUCTOFFERING = "Product/Service cannot be changed for same Installed Offer";
    public static final String DESCRIPTION_POLARIS_EXCEPTION = "An unexpected technical error has been occurred while publishing CIB";
    public static final String ERRORMESSAGE_ID_AND_VERSIONID_NOT_PRESENT = "The Offer in the request does not exist in CIB database.";
    public static final String ERRORMESSAGE_RELATEDPARTY_CONTRACTINGPARTY_ROLE = "Customer cannot be changed for same Installed Offer";
    public static final String ERRORMESSAGE_MANDATORY_PRODUCT_NOT_EXIST = "System Bug : The Mandatory Product(component/element) or its attribute with <";
    public static final String DESCRIPTION_GENERAL_EXCEPTION_FOR_CIB_ADDRESS = "Address ID in the request already exists in the database.";
    public static final String ERROMESSAGE_MANDATORY_FOR_RFSCORRECTION = "System Bug : For RFS correction on Active IOV, request must have (only) RFS date in it";
    public static final String ERROMESSAGE_MANDATORY_IN_PATCH_REQUEST = "System Bug : Product id and Product version id is mandatory for PATCH operation.";
    public static final String ERROMESSAGE_CHANGEORDER_PREVIOUS_RELATIONSHIP = "System Bug : For Change order, relationship type = PREVIOUS for offer, must be present.";
    public static final String MESSAGE_MISSING_ROLE_NAME = "If role value is enabled, in this case role value must be present in header information";
    public static final String ERROMESSAGE_PRODUCTID_MANDATORY_IN_PUT_REQUEST = "Product id is mandatory for product type = 'Offer' in PUT operation.";
    public static final String ERRORMESSAGE_WRONG_STATUS_OR_BILLINGDATE = "Either Status is wrong or billingStartDate/billingTerminationDate is empty";
    public static final String ERRORMESSAGE_SETRFB_CHANGE_EXCEPT_MLI = "Modification in service build/companion is not allowed as IOV is already active";
    public static final String DESCRIPTION_GENERAL_EXCEPTION_FOR_CIB_RERENCIAL = "No matching Installed Offer found in CiBase based on input criteria.";
    public static final String ERROR_MESSAGE_FOR_DISCONNECT_ORDER = "For Order Type = disconnect only priceType allowed is 'non-recurring' (OTC charge)";
    public static final String ERROMESSAGE_ACTIVE_STATUS_AT_OFFERLEVEL_BILLINGSTARTDATE = "System Bug : To set RFB date on IOV, IOV status must be Active in CiBase.";
    public static final String ERROMESSAGE_ACTIVE_STATUS_AT_OFFERLEVEL_SERVICESTARTDATE = "System Bug : For productType = 'Offer' with status as 'Active', ServiceStartDate is mandatory.";
    public static final String DESCRIPTION_GENERAL_EXCEPTION_FOR_CIB_CUSTOMER = "Customer ICO1 sent in the request does not match with any entry in the database.";
    public static final String ERRORMESSAGE_FASTTRACK_ONLY_FOR_ACTIVE_TERMINATED = "Fast Track order is only allowed on Active/Terminated installed offer version.";
    public static final String ERROMESSAGE_MANDATORY_FOR_RFSCORRECTION_TERMINATED = "RFS correction termination flow must have only service termination date in it";
    public static final String ERROMESSAGE_MANDATORY_CONDITION_IN_POST_REQUEST = "System Bug : Product version id for productType = 'Offer' must not be filled for POST operation.";
    public static final String ERROMESSAGE_ACTIVE_STATUS_AT_OFFERLEVEL_BILLINGTERMINATIONDATE = "Only Allowed status is Terminated if BillingStartDate available in flow.";
    public static final String ERROMESSAGE_ACTIVE_STATUS_AT_OFFERLEVEL_SETSERVICESTARTDATE = "For productType = 'Offer' with status as 'Active', ServiceStartDate is mandatory";

    public static final String ERROMESSAGE_ACTIVE_STATUS_AT_OFFERLEVEL_SETSERVICESTOPDATEVISEVERSA = "Only Allowed status is terminated if BillingterminationDate available in flow.";
    public static final String ERRORMESSAGE_ID_NOT_PRESENT_WITH_ACTIVE_STATUS = "Installed Offer Version selected as basis for creating this installed offer version is no more active";
    public static final String ERROMESSAGE_ACTIVE_STATUS_AT_OFFERLEVEL_SETSERVICESTOPDATE = "System Bug : For productType = 'Offer' with status as 'Terminated', ServiceTerminationDate is mandatory";
    public static final String ERRORMESSAGE_ERRORCODE_NO_ASSOCIATED_PRODUCT = "System Bug : IsBundle is true however there is no associated product found in product relationships with type = contains";
    public static final String ERRORMESSAGE_ERRORCODE_ASSOCIATED_PRODUCT = "System Bug : IsBundle is either false or absent however there is/are associated products found in product relationships with type = contains";
    public static final String ERRORMESSAGE_MANDATORY_QUERY_PARAMETER_MISSING = "System Bug : For this search, either endUserCustomerId or contractingCustomerId must be provided as one of the query parameter";

    public static final String ERRORMESSAGE_STATUS_VALUE_WRONG_SETRFS = "System Bug : In RFS flow for New or Change order, offer status must be Active and all it's objects status must be Active/Terminated.";
    public static final String ERRORMESSAGE_MISSING_CANCEL_ORDER_DATE = "System Bug : With Context value Standard, order cancellation date is mandatory for order cancellation flow.";
    public static final String ERRORMESSAGE_ONLY_RFB_UPDATE_ALLOWED = "With change Type as 'fast track' and change reason 'Revised RFB Date' only allowed attribute to be modified are Ready for billing date or stop billing date.";
    public static final String ERRORMESSAGE_EXTRA_FIELD_EXISTS = "With change Type as 'fast track' and change reason 'Other' only allowed attributes to be modified are Customer PO Number, Customer Division Id , Customer Label, and External Reference Number.";
    public static final String ERROMESSAGE_HAS_PARTIAL_BILLING_NOT_PRESENT_FOR_CHILD = "System Bug : If for productType = 'Offer' 'hasPartialBilling' is true then at-least one of the associated object must have 'hasPartialBilling' as true and 'startDateTime' filled (partial RFB date) in product price object.";
    public static final String ERRORMESSAGE_DB_CLONE = "Error while cloning the database object.";
    public static final String ERRORMESSAGE_SITEINFO_MISMATCH_CIBREFERENTIAL = "System Bug : Site details do not match any site information in the Site Referential available at CiBase.";
    public static final String ERROMESSAGE_MANDATORY_FOR_RFSCORRECTION_TERMINATED_DISCONNECT = "System Bug : For RFS correction on terminated IOV, request must have (only) Service Termination Date in it";
    public static final String HASPARTIALBILLING_CHILD = "System Bug : For productType = 'Offer', 'hasPartialBilling' is not set as true, however one or more associated object/s has 'hasPartialBilling' as true and 'startDateTime' filled (partial RFB date) in product price object.";
    public static final String ERROMESSAGE_SERVICESTARTDATE = "System Bug : For productType = 'Offer' if ServiceStartDate is available then offer status must be active ";
    public static final String ERRORMESSAGE_NO_SITE_AVAILABLE = "System Bug : Site details is missing in the request.";
    public static final String ERRORMESSAGE_FAGCIB_OFFSET_VALUE_WRONG = "System Bug : Incorrect offset value";
    public static final String ERRORMESSAGE_RELATEDPARTY_MISSING = "System Bug : Contracting Customer detail is missing in the request.";
    public static final String ERRORMESSAGE_STATUS_VALUE_WRONG_SETRFS_FOR_TERMINATED = "System Bug : In RFS flow for disconnect order, offer and all it's objects status must be Terminated";
    public static final String ERROMESSAGE_SAVING_XML = "Error while saving the Xml file to progress folder";
    public static final String ERROMESSAGE_PATCH_WITH_COMMERCIALLY_CEASED = "Patch request with status Commercially_ceased must have billingTerminationDate in it";
    public static final String ERRORMESSAGE_PARALLEL_ORDER_SOURCE_SYSTEM_DIFFERENT = "Another Installed Offer Version '%s' created by source system '%s' is in progress in CiBase on the Installed offer version selected as basis for creating this installed offer version.";
    public static final String ERRORMESSAGE_OFFER_NOT_FOUND_REPUBLICATION = "There is no matching record found to be republished.";

}
