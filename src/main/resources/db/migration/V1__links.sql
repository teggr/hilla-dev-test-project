-- create application user

CREATE TABLE application_user (
	id varchar(255) NOT NULL,
	hashed_password varchar(255) NULL,
	"name" varchar(255) NULL,
	profile_picture_url varchar(2048) NULL,
	username varchar(255) NULL,
	CONSTRAINT application_user_pkey PRIMARY KEY (id)
);

CREATE TABLE user_roles (
	user_id varchar(255) NOT NULL,
	roles varchar(255) NULL,
	CONSTRAINT user_role_fkey FOREIGN KEY (user_id) REFERENCES application_user(id)
);

-- create link table
CREATE TABLE LINK (
   id SERIAL PRIMARY KEY,
   url varchar(2048),
   created_date timestamp default now()
);