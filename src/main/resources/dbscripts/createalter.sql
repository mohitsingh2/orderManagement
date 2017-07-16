
CREATE TABLE LOIS_ORDERS_INPUT
(
  USID                        VARCHAR(25) NOT NULL,
  LOISORDERID                 INTEGER(8),
  OPERATIONCODE               VARCHAR(20 ),
  ORDERREFERENCE              VARCHAR(20 ),
  LEGACYORDERREFERENCE        VARCHAR(20 ),
  ORDERTYPE                   VARCHAR(20 ),
  CUSTOMERORDERREFERENCE      VARCHAR(25 ),
  CUSTOMERDEFINEDCODE         VARCHAR(25 ),
  SELLINGENTITYREFERENCE      VARCHAR(25 ),
  PROJECTID                   VARCHAR(15 ),
  ORDERSTATUS                 VARCHAR(50 ),
  USERID                      VARCHAR(8 ),
  SERVICEPROCUREMENTACTIONID  VARCHAR(8 ),
  LEGACYSERVICETYPEID         VARCHAR(50 ),
  PRODID                      INTEGER(8),
  SUBPRODID                   INTEGER(8),
  SUPPLEMENTARYSERVICEID      VARCHAR(8 ),
  SERVICESPEEDID              VARCHAR(10 ),
  CIRCUIT_REQUESTED           VARCHAR(1 ),
  CONFIGURATION_REQUESTED     VARCHAR(1 ),
  CUSTOMERCODE                VARCHAR(14 ),
  CUSTOMERNAME                VARCHAR(35 ),
  USERNAME                    VARCHAR(50 ),
  ADDRESS1                    VARCHAR(50 ),
  ADDRESS2                    VARCHAR(50 ),
  ADDRESS3                    VARCHAR(50 ),
  ADDRESS4                    VARCHAR(50 ),
  FLOORINTEGER                 VARCHAR(20 ),
  ROOM                        VARCHAR(20 ),
  CITYNAME                    VARCHAR(50 ),
  ZIPCODE                     VARCHAR(10 ),
  COUNTRY_STATE               VARCHAR(50 ),
  COUNTRYCODE                 VARCHAR(2 ),
  CONTACT1NAME                VARCHAR(50 ),
  CONTACT1POSITION            VARCHAR(50 ),
  CONTACT1AREACODE            VARCHAR(4 ),
  CONTACT1PHONE               VARCHAR(30 ),
  CONTACT1FAX                 VARCHAR(30 ),
  CONTACT1CELLULARPHONE       VARCHAR(30 ),
  CONTACT1EMAIL               VARCHAR(80 ),
  CONTACT1COMMENT             VARCHAR(255 ),
  CONTACT2NAME                VARCHAR(50 ),
  CONTACT2POSITION            VARCHAR(50 ),
  CONTACT2AREACODE            VARCHAR(4 ),
  CONTACT2PHONE               VARCHAR(30 ),
  CONTACT2FAX                 VARCHAR(30 ),
  CONTACT2CELLULARPHONE       VARCHAR(30 ),
  CONTACT2EMAIL               VARCHAR(80 ),
  CONTACT2COMMENT             VARCHAR(255 ),
  ORDERDATE                   DATE,
  CUSTREQDELIVERYDATE         DATE,
  VALIDATIONDATE              DATE,
  REVISEDVALIDATIONDATE       DATE,
  GAD                         DATE,
  CDD                         DATE,
  CAV                         DATE,
  CONFIGURATIONDATE           DATE,
  MAV                         DATE,
  RFSDATE                     DATE,
  CUTDATE                     DATE,
  NETWORKPARAM0               VARCHAR(255 ),
  NETWORKPARAM1               VARCHAR(255 ),
  NETWORKPARAM2               VARCHAR(255 ),
  NETWORKPARAM3               VARCHAR(255 ),
  NETWORKPARAM4               VARCHAR(255 ),
  NETWORKPARAM5               VARCHAR(255 ),
  NETWORKPARAM6               VARCHAR(255 ),
  NETWORKPARAM7               VARCHAR(255 ),
  NETWORKPARAM8               VARCHAR(255 ),
  NETWORKPARAM9               VARCHAR(255 ),
  NETWORKPARAM10              VARCHAR(255 ),
  NETWORKPARAM11              VARCHAR(255 ),
  NETWORKPARAM12              VARCHAR(255 ),
  NETWORKPARAM13              VARCHAR(255 ),
  NETWORKPARAM14              VARCHAR(255 ),
  NETWORKPARAM15              VARCHAR(255 ),
  NETWORKPARAM16              VARCHAR(255 ),
  NETWORKPARAM17              VARCHAR(255 ),
  NETWORKPARAM18              VARCHAR(255 ),
  NETWORKPARAM19              VARCHAR(255 ),
  NETWORKPARAM20              VARCHAR(255 ),
  ORDERCOMMENT                VARCHAR(255 ),
  REJECTREASON                VARCHAR(10 ),
  CREATIONDATE                DATE,
  CITYCODE                    VARCHAR(5 ),
  CUSTPROJCODE                VARCHAR(20 ),
  AEND_ADDRESS1               VARCHAR(50 ),
  AEND_ADDRESS2               VARCHAR(50 ),
  AEND_ADDRESS3               VARCHAR(50 ),
  AEND_ADDRESS4               VARCHAR(50 ),
  AEND_FLOOR                  VARCHAR(20 ),
  AEND_ROOM                   VARCHAR(20 ),
  AEND_CITYIATACODE           VARCHAR(5 ),
  AEND_CITYNAME               VARCHAR(50 ),
  AEND_ZIPCODE                VARCHAR(15 ),
  AEND_COUNTRYSTATE           VARCHAR(50 ),
  AEND_COUNTRYCODE            VARCHAR(4 ),
  AEND_CONTACT1NAME           VARCHAR(50 ),
  AEND_CONTACT1POSITION       VARCHAR(50 ),
  AEND_CONTACT1PHONEAREACODE  VARCHAR(4 ),
  AEND_CONTACT1PHONE          VARCHAR(30 ),
  AEND_CONTACT1FAXAREACODE    VARCHAR(4 ),
  AEND_CONTACT1FAX            VARCHAR(30 ),
  AEND_CONTACT1CELLAREACODE   VARCHAR(4 ),
  AEND_CONTACT1CELLULARPHONE  VARCHAR(30 ),
  AEND_CONTACT1EMAIL          VARCHAR(80 ),
  AEND_CONTACT2NAME           VARCHAR(50 ),
  AEND_CONTACT2POSITION       VARCHAR(50 ),
  AEND_CONTACT2PHONEAREACODE  VARCHAR(4 ),
  AEND_CONTACT2PHONE          VARCHAR(30 ),
  AEND_CONTACT2FAXAREACODE    VARCHAR(4 ),
  AEND_CONTACT2FAX            VARCHAR(30 ),
  AEND_CONTACT2CELLAREACODE   VARCHAR(4 ),
  AEND_CONTACT2CELLULARPHONE  VARCHAR(30 ),
  AEND_CONTACT2EMAIL          VARCHAR(80 ),
  SRFDATE                     DATE,
  ORIGINATORORDREF            VARCHAR(35 ),
  REQUESTORNAME               VARCHAR(50 ),
  REQUESTOREMAIL              VARCHAR(80 ),
  REQUESTORPHONEAREA          VARCHAR(4 ),
  REQUESTORPHONE              VARCHAR(30 ),
  REQUESTORFAXAREA            VARCHAR(4 ),
  REQUESTORFAX                VARCHAR(30 ),
  B_OPTION                    VARCHAR(1 ),
  DISRUPT_TEST                VARCHAR(1 ),
  CCTSPEED                    INTEGER(11),
  OLDCCTSPEED                 INTEGER(11),
  PARTNERID                   VARCHAR(10 ),
  FOREIGNUSID                 VARCHAR(15 ),
  PARENTUSID                  VARCHAR(25 ),
  SERVICEPARAM1               VARCHAR(255 ),
  SERVICEPARAM2               VARCHAR(255 ),
  SERVICEPARAM3               VARCHAR(255 ),
  SERVICEPARAM4               VARCHAR(255 ),
  SERVICEPARAM5               VARCHAR(255 ),
  SERVICEPARAM6               VARCHAR(255 ),
  SERVICEPARAM7               VARCHAR(255 ),
  SERVICEPARAM8               VARCHAR(255 ),
  SERVICEPARAM9               VARCHAR(255 ),
  SERVICEPARAM10              VARCHAR(255 ),
  SERVICEPARAM11              VARCHAR(255 ),
  SERVICEPARAM12              VARCHAR(255 ),
  SERVICEPARAM13              VARCHAR(255 ),
  SERVICEPARAM14              VARCHAR(255 ),
  SERVICEPARAM15              VARCHAR(255 ),
  SERVICEPARAM16              VARCHAR(255 ),
  SERVICEPARAM17              VARCHAR(255 ),
  SERVICEPARAM18              VARCHAR(255 ),
  SERVICEPARAM19              VARCHAR(255 ),
  SERVICEPARAM20              VARCHAR(255 ),
  AEND_USERNAME               VARCHAR(50 ),
  BEND_USERNAME               VARCHAR(50 ),
  ORANGESERVICENAME           VARCHAR(255 ),
  CORESITEID                  VARCHAR(10 ),
  COREADDRESSID               VARCHAR(10 ),
  BTLVS_DATE                  DATE,
  SOURCETOOL                  VARCHAR(20 )
)
TABLESPACE;
alter table LOIS_ORDERS_INPUT add column floornumber VARCHAR(25);
ALTER TABLE LOIS_ORDERS_INPUT ADD PRIMARY KEYLOISORDERID;

ALTER TABLE LOIS_ORDERS_INPUT MODIFY COLUMN LOISORDERID INT auto_increment;