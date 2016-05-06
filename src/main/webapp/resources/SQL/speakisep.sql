-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mar 26 Avril 2016 à 17:33
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `speakisep`
--

-- --------------------------------------------------------

--
-- Structure de la table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `IDADMIN` int(20) NOT NULL,
  `MAILADMIN` varchar(255) NOT NULL,
  PRIMARY KEY (`IDADMIN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `parcours`
--

CREATE TABLE IF NOT EXISTS `parcours` (
  `IDPARCOURS` int(20) NOT NULL,
  `NOMPARCOURS` varchar(255) NOT NULL,
  `DESCRIPTION` varchar(255) NOT NULL,
  `IDRESPO` varchar(255) NOT NULL,
  `IDTEMOIGNAGE` varchar(20) NOT NULL,
  PRIMARY KEY (`IDPARCOURS`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `responsable de parcours`
--

CREATE TABLE IF NOT EXISTS `responsable de parcours` (
  `IDRESPO` int(20) NOT NULL,
  `NOMRESPO` varchar(255) NOT NULL,
  `PRENOMRESPO` varchar(255) NOT NULL,
  `MAILRESPO` varchar(255) NOT NULL,
  `IDPARCOURS` int(20) NOT NULL,
  PRIMARY KEY (`IDRESPO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `témoignage`
--

CREATE TABLE IF NOT EXISTS `témoignage` (
  `IDTEM` int(20) NOT NULL,
  `NOMTEM` varchar(255) NOT NULL,
  `DESCRIPTEM` varchar(255) NOT NULL,
  `IDELEVE` int(20) NOT NULL,
  PRIMARY KEY (`IDTEM`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `université`
--

CREATE TABLE IF NOT EXISTS `université` (
  `IDUNIV` int(20) NOT NULL,
  `NOMUNIV` varchar(255) NOT NULL,
  `DESCRIPUNIV` varchar(255) NOT NULL,
  `LIENUNIV` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `étudiant`
--

CREATE TABLE IF NOT EXISTS `étudiant` (
  `IDELEVE` int(20) NOT NULL,
  `NUMELEVE` int(5) NOT NULL,
  `NOMELEVE` varchar(255) NOT NULL,
  `PRENOMELEVE` varchar(255) NOT NULL,
  `ETAPEELEVE` varchar(255) NOT NULL,
  `PROMOELEVE` int(4) NOT NULL,
  `MAILELEVE` varchar(255) NOT NULL,
  `MDPELEVE` varchar(255) NOT NULL,
  `IDPARCOURS` int(20) NOT NULL,
  PRIMARY KEY (`IDELEVE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
