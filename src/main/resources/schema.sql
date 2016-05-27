
CREATE TABLE IF NOT EXISTS `parcours` (
  `IDPARCOURS` int(20) NOT NULL AUTO_INCREMENT,
  `NOMPARCOURS` varchar(255) NOT NULL,
  `DESCRIPTION` varchar(255) NOT NULL,
  `IDTEMOIGNAGE` varchar(20) NOT NULL,
  PRIMARY KEY (`IDPARCOURS`)
);

CREATE TABLE IF NOT EXISTS `temoignage` (
  `IDTEM` int(20) NOT NULL AUTO_INCREMENT,
  `NOMTEM` varchar(255) NOT NULL,
  `DESCRIPTEM` varchar(255) NOT NULL,
  `userId` int(20) NOT NULL,
  PRIMARY KEY (`IDTEM`)
);

CREATE TABLE IF NOT EXISTS `universite` (
  `IDUNIV` int(20) NOT NULL AUTO_INCREMENT,
  `NOMUNIV` varchar(255) NOT NULL,
  `DESCRIPUNIV` varchar(255) NOT NULL,
  `LIENUNIV` varchar(255) NOT NULL,
  PRIMARY KEY (`IDUNIV`)
);
CREATE TABLE IF NOT EXISTS `fiche` (
  `IDFICHE` int(20) NOT NULL AUTO_INCREMENT,
  `NUMSALLE` varchar(255) NOT NULL,
  `PHOTO` varchar(255) NOT NULL,
  `CV` varchar(255) NOT NULL,
  `LMOTIV` varchar(255) NOT NULL,
  `ADRESSE` varchar(255) NOT NULL,
  `ACTEXTRA` varchar(255) NOT NULL,
  `COMPETENCES` varchar(255) NOT NULL,
  `NOTES` varchar(255) NOT NULL,
  `APPRENTI` varchar(255) NOT NULL,
  `userId` varchar(255) NOT NULL,
  PRIMARY KEY (`IDFICHE`)
);
CREATE TABLE IF NOT EXISTS
  `user` (
  userId int(11) unsigned NOT NULL AUTO_INCREMENT,
  login varchar(255) NOT NULL DEFAULT '',
  password varchar(255) NOT NULL DEFAULT '',
  nom varchar(255) NOT NULL DEFAULT '',
  nomFamille varchar(255) NOT NULL DEFAULT '',
  prenom varchar(255) NOT NULL DEFAULT '',
  type varchar(255) NOT NULL DEFAULT '',
  numero varchar(255) NOT NULL DEFAULT '',
  mail varchar(255) NOT NULL DEFAULT '',
  `IDPARCOURS` int(20),
  PRIMARY KEY (userId)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
