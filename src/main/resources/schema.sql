
CREATE TABLE IF NOT EXISTS `parcours` (
  `IDPARCOURS` int(20) NOT NULL AUTO_INCREMENT,
  `NOMPARCOURS` varchar(255) NOT NULL,
  `DESCRIPTION` varchar(255) NOT NULL,
  `IDTEMOIGNAGE` varchar(20) NOT NULL,
  PRIMARY KEY (`IDPARCOURS`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS  `temoignage` (
  `IDTEM` int(20) NOT NULL AUTO_INCREMENT,
  `NOMTEM` varchar(255) NOT NULL,
  `DESCRIPTEM` varchar(255) NOT NULL,
  `userId` int(20) NOT NULL,
  `NOMPARCOURS` varchar(255) NOT NULL DEFAULT '',
  `STATUT` varchar(255) NOT NULL DEFAULT '',
  PRIMARY KEY (`IDTEM`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `universite` (
  `IDUNIV` int(20) NOT NULL AUTO_INCREMENT,
  `NOMUNIV` varchar(255) NOT NULL,
  `DESCRIPUNIV` varchar(255) NOT NULL,
  `LIENUNIV` varchar(255) NOT NULL,
  PRIMARY KEY (`IDUNIV`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `fiche` (
  `IDFICHE` int(20) NOT NULL AUTO_INCREMENT,
  `NUMSALLE` varchar(255) NOT NULL DEFAULT '',
  `PHOTO` varchar(255) NOT NULL DEFAULT '',
  `CV` varchar(255) NOT NULL DEFAULT '',
  `LMOTIV` varchar(255) NOT NULL DEFAULT '',
  `ADRESSE` varchar(255) NOT NULL DEFAULT '',
  `ACTEXTRA` varchar(255) NOT NULL DEFAULT '',
  `COMPETENCES` varchar(255) NOT NULL DEFAULT '',
  `NOTES` varchar(255) NOT NULL DEFAULT '',
  `APPRENTI` varchar(255) NOT NULL DEFAULT '',
  `ETAPE` varchar(255) NOT NULL DEFAULT '',
  `PROMOTION` varchar(255) NOT NULL DEFAULT '',
  `STATUT` varchar(255) NOT NULL DEFAULT '',
  `userId` int(20) NOT NULL,
  PRIMARY KEY (`IDFICHE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `module` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `NOMUNIV` varchar(255) NOT NULL DEFAULT '',
  `DESCRIPTION` varchar(255) NOT NULL DEFAULT '',
  `LIEN` varchar(255) NOT NULL DEFAULT '',
  `STATUT` varchar(255) NOT NULL DEFAULT '',
  `COMMENTAIRE` varchar(255) NOT NULL DEFAULT '',
  `userId` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


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
