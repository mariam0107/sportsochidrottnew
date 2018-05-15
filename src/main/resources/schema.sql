/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  maria
 * Created: 3 May, 2018
 */
DROP TABLE IF EXISTS age;
CREATE TABLE age (
ageid INT NOT NULL,
agemin INT NOT NULL,
agemax INT NOT NULL,
    PRIMARY KEY (ageid));

DROP TABLE IF EXISTS clubdetails;
CREATE TABLE clubdetails (
clubid INT NOT NULL,
OrgNumber varchar(50) NOT NULL,
clubname varchar(50) NOT NULL, 
clubemail varchar(50) NOT NULL,
clubpwd varchar(50) NOT NULL,   
clubphone varchar(10) NOT NULL, 
clubwebsite varchar(50) NOT NULL,   
  PRIMARY KEY (clubid));

DROP TABLE IF EXISTS region;
CREATE TABLE region (
regionid INT NOT NULL,
regionname varchar(50) NOT NULL,
  PRIMARY KEY (regionid));

DROP TABLE IF EXISTS sports;
CREATE TABLE sports (
sportsid INT NOT NULL,
sportsitem varchar(50) NOT NULL,
  PRIMARY KEY (sports id));