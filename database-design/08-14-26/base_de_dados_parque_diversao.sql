CREATE TABLE lista_brinqd(id_brinqd NUMERIC(2), nome_brinqd VARCHAR(30), valor_unit DECIMAL(3,2), loc NUMERIC(2), alt_min DECIMAL(1,2), idade_min NUMERIC(2));

DESCRIBE lista_brinqd;

ALTER TABLE lista_brinqd
ADD(tema VARCHAR(20));

ALTER TABLE lista_brinqd
DROP COLUMN loc;

ALTER TABLE lista_brinqd
ADD(id_loc NUMERIC(2));

DESCRIBE lista_brinqd;

DROP TABLE lista_brinqd;

CREATE TABLE lista_brinqd 
    ( 
     id_brinqd   NUMBER (2)  NOT NULL , 
     nome_brinqd VARCHAR2 (30 CHAR)  NOT NULL , 
     valor_unit  NUMBER (3,2)  NOT NULL , 
     alt_min     NUMBER (1,2)  NOT NULL , 
     idade_min   NUMBER (2)  NOT NULL 
    ) 
;

COMMENT ON COLUMN lista_brinqd.id_brinqd IS 'id do brinquedo' 
;

COMMENT ON COLUMN lista_brinqd.nome_brinqd IS 'nome do brinquedo' 
;

COMMENT ON COLUMN lista_brinqd.valor_unit IS 'valor cobrado pelo ingresso individual' 
;

COMMENT ON COLUMN lista_brinqd.alt_min IS 'altura minima para a pessoa entrar no brinquedo' 
;

COMMENT ON COLUMN lista_brinqd.idade_min IS 'idade minima para a pessoa entrar no brinquedo' 
;

ALTER TABLE lista_brinqd 
    ADD CONSTRAINT lista_brinqd_PK PRIMARY KEY ( id_brinqd ) ;

CREATE TABLE local_brinqd 
    ( 
     id_local               NUMBER (2)  NOT NULL , 
     descr_loc              VARCHAR2 (30 CHAR)  NOT NULL , 
     bairro                 VARCHAR2 (30 CHAR)  NOT NULL , 
     rua                    VARCHAR2 (30 CHAR)  NOT NULL , 
     numero                 NUMBER (3)  NOT NULL , 
     lista_brinqd_id_brinqd NUMBER (2)  NOT NULL 
    ) 
;

COMMENT ON COLUMN local_brinqd.id_local IS 'id da localizacao do brinquedo no parque' 
;

COMMENT ON COLUMN local_brinqd.descr_loc IS 'ponto de referencia' 
;

COMMENT ON COLUMN local_brinqd.bairro IS 'area da localicao do brinquedo' 
;

COMMENT ON COLUMN local_brinqd.rua IS 'alameda onde o brinquedo esta localizado' 
;

COMMENT ON COLUMN local_brinqd.numero IS 'numero da alameda da localizacao' 
;
CREATE UNIQUE INDEX local_brinqd__IDX ON local_brinqd 
    ( 
     lista_brinqd_id_brinqd ASC 
    ) 
;

ALTER TABLE local_brinqd 
    ADD CONSTRAINT local_brinqd_PK PRIMARY KEY ( id_local ) ;

ALTER TABLE local_brinqd 
    ADD CONSTRAINT local_brinqd_lista_brinqd_FK FOREIGN KEY 
    ( 
     lista_brinqd_id_brinqd
    ) 
    REFERENCES lista_brinqd 
    ( 
     id_brinqd
    ) 
;

DESCRIBE lista_brinqd;

DESCRIBE local_brinqd;
