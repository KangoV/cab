CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

DROP TABLE IF EXISTS api_root;
CREATE TABLE api_root (
  id                 UUID          NOT NULL PRIMARY KEY,
  version            INTEGER       NOT NULL,
  created            TIMESTAMPTZ   NOT NULL,
  updated            TIMESTAMPTZ,
  name               VARCHAR(255)  NOT NULL,
  description        TEXT,
  domain             VARCHAR(255),
  path               VARCHAR(255),
  versions           VARCHAR(255),
  max_content_length VARCHAR(255),
  is_default         BOOLEAN
);
INSERT INTO api_root (id,version,created,name,description,domain,path,versions,max_content_length,is_default)
    VALUES('d967da01-9d66-4623-9762-68506151006c', 0, CURRENT_TIMESTAMP, 'api-root-a', 'root a description', 'mydomain', '/path', 'application/taxii+json;version=2.1,application/taxii+json;version=2.0', 10000, true);
INSERT INTO api_root (id,version,created,name,description,domain,path,versions,max_content_length,is_default)
    VALUES('d967da01-9d66-4623-9762-68506151006d', 0, CURRENT_TIMESTAMP, 'api-root-b', 'root b description', 'mydomain', '/path', 'application/taxii+json;version=2.1', 10000, false);

DROP TABLE IF EXISTS config;
CREATE TABLE config (
    key     VARCHAR(128)    NOT NULL PRIMARY KEY,
    value   VARCHAR(255)    NOT NULL
);
insert into config (key,value) values('taxii.server.title', 'KangoV');
insert into config (key,value) values('taxii.server.description', 'KangoV TAXII Server');
insert into config (key,value) values('taxii.server.contact.name', 'Joe Blogs');
insert into config (key,value) values('taxii.server.contact.email', 'joe.blogs@blogsdomain.com');

commit;