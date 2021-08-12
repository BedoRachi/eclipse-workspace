
CREATE TABLE member
(
	id                   VARCHAR2(20) NOT NULL ,
	pwd                  VARCHAR2(20) NULL ,
	name                 VARCHAR2(50) NULL ,
	address              VARCHAR2(20) NULL ,
	tel                  VARCHAR2(13) NULL ,
	indate               DATE DEFAULT  sysdate  NULL ,
	_zipcode             VARCHAR2(7) NOT NULL 
);



CREATE UNIQUE INDEX _XPK고객 ON member
(id   ASC);



ALTER TABLE member
	ADD CONSTRAINT  _XPK고객 PRIMARY KEY (id);



CREATE TABLE orders
(
	_id                  VARCHAR2(20) NOT NULL ,
	_product_code        VARCHAR2(20) NOT NULL ,
	o_seq                NUMBER(10) NOT NULL ,
	product_size         VARCHAR2(5) NULL ,
	quantity             VARCHAR2(5) NULL ,
	result               CHAR(1) NULL ,
	indate               date DEFAULT  sysdate  NULL 
);



CREATE UNIQUE INDEX _XPK주문 ON orders
(o_seq   ASC);



ALTER TABLE orders
	ADD CONSTRAINT  _XPK주문 PRIMARY KEY (o_seq);



CREATE TABLE product
(
	product_code         VARCHAR2(20) NOT NULL ,
	product_name         VARCHAR2(100) NULL ,
	product_kind         CHAR(1) NULL ,
	product_price1       VARCHAR2(10) NULL ,
	product_price2       VARCHAR2(10) NULL ,
	product_content      VARCHAR2(1000) NULL ,
	product_image        VARCHAR2(50) NULL ,
	sizeSt               VARCHAR2(5) NULL ,
	sizeEt               VARCHAR2(5) NULL ,
	product_quantity     VARCHAR2(5) NULL ,
	useyn                CHAR(1) NULL ,
	indate               DATE DEFAULT  sysdate  NULL 
);



CREATE UNIQUE INDEX _XPK상품 ON product
(product_code   ASC);



ALTER TABLE product
	ADD CONSTRAINT  _XPK상품 PRIMARY KEY (product_code);



CREATE TABLE tb_zipcode
(
	zipcode              VARCHAR2(7) NOT NULL ,
	sido                 VARCHAR2(30) NULL ,
	gugun                VARCHAR2(30) NULL ,
	dong                 VARCHAR2(30) NULL ,
	bungi                VARCHAR2(30) NULL 
);



CREATE UNIQUE INDEX _XPK우편번호 ON tb_zipcode
(zipcode   ASC);



ALTER TABLE tb_zipcode
	ADD CONSTRAINT  _XPK우편번호 PRIMARY KEY (zipcode);



ALTER TABLE member
	ADD (FOREIGN KEY (_zipcode) REFERENCES tb_zipcode (zipcode));



ALTER TABLE orders
	ADD (FOREIGN KEY (_id) REFERENCES member (id));



ALTER TABLE orders
	ADD (FOREIGN KEY (_product_code) REFERENCES product (product_code));



CREATE  TRIGGER tI_member BEFORE INSERT ON member for each row
-- ERwin Builtin Trigger
-- INSERT trigger on member 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin Trigger */
    /* tb_zipcode  member on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="0000e67f", PARENT_OWNER="", PARENT_TABLE="tb_zipcode"
    CHILD_OWNER="", CHILD_TABLE="member"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="", FK_COLUMNS="_zipcode" */
    SELECT count(*) INTO NUMROWS
      FROM tb_zipcode
      WHERE
        /* %JoinFKPK(:%New,tb_zipcode," = "," AND") */
        :new._zipcode = tb_zipcode.zipcode;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert member because tb_zipcode does not exist.'
      );
    END IF;


-- ERwin Builtin Trigger
END;
/

CREATE  TRIGGER  tD_member AFTER DELETE ON member for each row
-- ERwin Builtin Trigger
-- DELETE trigger on member 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin Trigger */
    /* member  orders on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="0000c2cd", PARENT_OWNER="", PARENT_TABLE="member"
    CHILD_OWNER="", CHILD_TABLE="orders"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="", FK_COLUMNS="_id" */
    SELECT count(*) INTO NUMROWS
      FROM orders
      WHERE
        /*  %JoinFKPK(orders,:%Old," = "," AND") */
        orders._id = :old.id;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete member because orders exists.'
      );
    END IF;


-- ERwin Builtin Trigger
END;
/

CREATE  TRIGGER tU_member AFTER UPDATE ON member for each row
-- ERwin Builtin Trigger
-- UPDATE trigger on member 
DECLARE NUMROWS INTEGER;
BEGIN
  /* ERwin Builtin Trigger */
  /* member  orders on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="0001e627", PARENT_OWNER="", PARENT_TABLE="member"
    CHILD_OWNER="", CHILD_TABLE="orders"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="", FK_COLUMNS="_id" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.id <> :new.id
  THEN
    SELECT count(*) INTO NUMROWS
      FROM orders
      WHERE
        /*  %JoinFKPK(orders,:%Old," = "," AND") */
        orders._id = :old.id;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update member because orders exists.'
      );
    END IF;
  END IF;

  /* ERwin Builtin Trigger */
  /* tb_zipcode  member on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="tb_zipcode"
    CHILD_OWNER="", CHILD_TABLE="member"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="", FK_COLUMNS="_zipcode" */
  SELECT count(*) INTO NUMROWS
    FROM tb_zipcode
    WHERE
      /* %JoinFKPK(:%New,tb_zipcode," = "," AND") */
      :new._zipcode = tb_zipcode.zipcode;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update member because tb_zipcode does not exist.'
    );
  END IF;


-- ERwin Builtin Trigger
END;
/


CREATE  TRIGGER tI_orders BEFORE INSERT ON orders for each row
-- ERwin Builtin Trigger
-- INSERT trigger on orders 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin Trigger */
    /* member  orders on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="0001d746", PARENT_OWNER="", PARENT_TABLE="member"
    CHILD_OWNER="", CHILD_TABLE="orders"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="", FK_COLUMNS="_id" */
    SELECT count(*) INTO NUMROWS
      FROM member
      WHERE
        /* %JoinFKPK(:%New,member," = "," AND") */
        :new._id = member.id;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert orders because member does not exist.'
      );
    END IF;

    /* ERwin Builtin Trigger */
    /* product  orders on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="product"
    CHILD_OWNER="", CHILD_TABLE="orders"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="", FK_COLUMNS="_product_code" */
    SELECT count(*) INTO NUMROWS
      FROM product
      WHERE
        /* %JoinFKPK(:%New,product," = "," AND") */
        :new._product_code = product.product_code;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert orders because product does not exist.'
      );
    END IF;


-- ERwin Builtin Trigger
END;
/

CREATE  TRIGGER tU_orders AFTER UPDATE ON orders for each row
-- ERwin Builtin Trigger
-- UPDATE trigger on orders 
DECLARE NUMROWS INTEGER;
BEGIN
  /* ERwin Builtin Trigger */
  /* member  orders on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="0001d4eb", PARENT_OWNER="", PARENT_TABLE="member"
    CHILD_OWNER="", CHILD_TABLE="orders"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="", FK_COLUMNS="_id" */
  SELECT count(*) INTO NUMROWS
    FROM member
    WHERE
      /* %JoinFKPK(:%New,member," = "," AND") */
      :new._id = member.id;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update orders because member does not exist.'
    );
  END IF;

  /* ERwin Builtin Trigger */
  /* product  orders on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="product"
    CHILD_OWNER="", CHILD_TABLE="orders"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="", FK_COLUMNS="_product_code" */
  SELECT count(*) INTO NUMROWS
    FROM product
    WHERE
      /* %JoinFKPK(:%New,product," = "," AND") */
      :new._product_code = product.product_code;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update orders because product does not exist.'
    );
  END IF;


-- ERwin Builtin Trigger
END;
/


CREATE  TRIGGER  tD_product AFTER DELETE ON product for each row
-- ERwin Builtin Trigger
-- DELETE trigger on product 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin Trigger */
    /* product  orders on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="0000d3bf", PARENT_OWNER="", PARENT_TABLE="product"
    CHILD_OWNER="", CHILD_TABLE="orders"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="", FK_COLUMNS="_product_code" */
    SELECT count(*) INTO NUMROWS
      FROM orders
      WHERE
        /*  %JoinFKPK(orders,:%Old," = "," AND") */
        orders._product_code = :old.product_code;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete product because orders exists.'
      );
    END IF;


-- ERwin Builtin Trigger
END;
/

CREATE  TRIGGER tU_product AFTER UPDATE ON product for each row
-- ERwin Builtin Trigger
-- UPDATE trigger on product 
DECLARE NUMROWS INTEGER;
BEGIN
  /* ERwin Builtin Trigger */
  /* product  orders on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="00010562", PARENT_OWNER="", PARENT_TABLE="product"
    CHILD_OWNER="", CHILD_TABLE="orders"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="", FK_COLUMNS="_product_code" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.product_code <> :new.product_code
  THEN
    SELECT count(*) INTO NUMROWS
      FROM orders
      WHERE
        /*  %JoinFKPK(orders,:%Old," = "," AND") */
        orders._product_code = :old.product_code;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update product because orders exists.'
      );
    END IF;
  END IF;


-- ERwin Builtin Trigger
END;
/


CREATE  TRIGGER  tD_tb_zipcode AFTER DELETE ON tb_zipcode for each row
-- ERwin Builtin Trigger
-- DELETE trigger on tb_zipcode 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin Trigger */
    /* tb_zipcode  member on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="0000d287", PARENT_OWNER="", PARENT_TABLE="tb_zipcode"
    CHILD_OWNER="", CHILD_TABLE="member"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="", FK_COLUMNS="_zipcode" */
    SELECT count(*) INTO NUMROWS
      FROM member
      WHERE
        /*  %JoinFKPK(member,:%Old," = "," AND") */
        member._zipcode = :old.zipcode;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete tb_zipcode because member exists.'
      );
    END IF;


-- ERwin Builtin Trigger
END;
/

CREATE  TRIGGER tU_tb_zipcode AFTER UPDATE ON tb_zipcode for each row
-- ERwin Builtin Trigger
-- UPDATE trigger on tb_zipcode 
DECLARE NUMROWS INTEGER;
BEGIN
  /* ERwin Builtin Trigger */
  /* tb_zipcode  member on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="0001047c", PARENT_OWNER="", PARENT_TABLE="tb_zipcode"
    CHILD_OWNER="", CHILD_TABLE="member"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="", FK_COLUMNS="_zipcode" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.zipcode <> :new.zipcode
  THEN
    SELECT count(*) INTO NUMROWS
      FROM member
      WHERE
        /*  %JoinFKPK(member,:%Old," = "," AND") */
        member._zipcode = :old.zipcode;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update tb_zipcode because member exists.'
      );
    END IF;
  END IF;


-- ERwin Builtin Trigger
END;
/

