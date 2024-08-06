DROP TABLE IF EXISTS project_category;
DROP TABLE IF EXISTS category;
DROP TABLE IF EXISTS step;
DROP TABLE IF EXISTS material;
DROP TABLE IF EXISTS project;

CREATE TABLE project (
	project_id int NOT NULL,
	project_name varchar(128)	NOT NULL,
	estimated_hours decimal(7,2) NULL, 
	actual_hours decimal(7,2) NULL,
	difficulty int NULL,
	notes text NULL
	/*PRIMARY KEY(project_id)*/
);

CREATE TABLE material (
	material_id int NOT NULL,
	project_id int NOT NULL,
	material_name varchar(128) NOT NULL,
	num_required int NULL,
	cost decimal(7,2) NULL
	/*PRIMARY KEY(material_id)*/
	/*FOREIGN KEY(project_id)*/
);

CREATE TABLE step (
	step_id int NOT NULL,
	project_id int NOT NULL,
	step_text text NOT NULL,
	step_order int NOT NULL
	/*PRIMARY KEY(step_id),*/
	/*FOREIGN KEY(project_id)*/
);

CREATE TABLE category (
	category_id int NOT NULL,
	category_name varchar(128) NOT NULL,
	/*PRIMARY KEY(category_id)*/
);
	
CREATE TABLE project_category (
	projecy_id int NOT NULL,
	category_id int NOT NULL
	/*FOREIGN KEY(project_id),*/
	/*FOREIGN KEY(category_id)*/
);