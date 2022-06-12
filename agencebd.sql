-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mer. 16 mars 2022 à 11:25
-- Version du serveur : 10.4.21-MariaDB
-- Version de PHP : 7.3.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `agencebd`
--

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE `client` (
  `id` int(11) NOT NULL,
  `nom` char(30) NOT NULL,
  `prenom` char(30) NOT NULL,
  `genre` char(15) NOT NULL DEFAULT 'Male',
  `passport` varchar(50) NOT NULL,
  `idcontact` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`id`, `nom`, `prenom`, `genre`, `passport`, `idcontact`) VALUES
(3, 'bore', 'dg', '1', 'sffd', NULL),
(14, 'bore', 'j', 'o', 'j', NULL),
(15, 'yfg', 'ygh', 'male', '1', NULL),
(16, 'bore', 'bore', 'Femme', '66', NULL),
(18, 'bore', 'borre', 'Homme', 'vore', NULL),
(19, 'bore', 'ih', 'Homme', 'jh', 38),
(20, 'Aya', 'Yaya', 'Homme', 'lo25', 35),
(21, 'coulibaly', 'soliba', 'Homme', '66025', 36),
(22, 'Solib', 'Coulibaly', 'Homme', '456', 37),
(23, 'younouss', 'bore', 'Homme', 'b06', 38),
(24, 'soliba', 'solia', 'Homme', '42', 39);

-- --------------------------------------------------------

--
-- Structure de la table `contact`
--

CREATE TABLE `contact` (
  `id` int(11) NOT NULL,
  `tel` char(11) NOT NULL,
  `email` varchar(55) NOT NULL,
  `adresse` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `contact`
--

INSERT INTO `contact` (`id`, `tel`, `email`, `adresse`) VALUES
(19, '8745587', 'njnj', 'hjnjni'),
(20, '4534', 'dfnxbddv', 'dfdb'),
(21, '66', 'test', 'test'),
(22, '66', 'etst', 'test'),
(25, '66', 'boreman', '66'),
(27, '123', 'monsieur', '123'),
(34, '66035300', 'marietouCisse@gmail.com', 'Bamako Mali 7536'),
(35, '66666', 'ayayaya', 'Bkko'),
(36, '66035300', 'soliba', 'Bko'),
(37, '6620', 'Coulibaly', 'Chine'),
(38, '66035300', 'younoussbore', 'bko'),
(39, '4564152', '123456', 'cg'),
(40, '', '', '');

-- --------------------------------------------------------

--
-- Structure de la table `reservation`
--

CREATE TABLE `reservation` (
  `id` int(11) NOT NULL,
  `dateheure` datetime NOT NULL DEFAULT '2000-12-12 00:00:00',
  `prix` float NOT NULL,
  `statut` varchar(30) NOT NULL DEFAULT 'active',
  `fraispenalite` float NOT NULL DEFAULT 0,
  `numplace` varchar(5) NOT NULL DEFAULT 'FE2',
  `idclient` int(11) DEFAULT NULL,
  `idvol` int(11) DEFAULT NULL,
  `num` varchar(20) NOT NULL DEFAULT 'A50'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `reservation`
--

INSERT INTO `reservation` (`id`, `dateheure`, `prix`, `statut`, `fraispenalite`, `numplace`, `idclient`, `idvol`, `num`) VALUES
(2, '2022-02-06 00:00:00', 85000000, 'ok', 7800000, 'FE2', 3, 1, '45'),
(3, '2002-02-17 00:00:00', 14, '14', 14, 'FE2', NULL, NULL, ''),
(4, '2022-03-01 23:05:35', 1, 'active', 1, 'FE2', 3, 7, 'A50'),
(5, '2022-03-01 23:05:35', 2, 'active', 2, 'FE2', 3, 7, 'A50'),
(6, '2022-03-01 23:05:35', 3, 'active', 3, 'FE2', 3, 7, 'A50'),
(7, '2022-03-01 23:05:35', 50000, 'active', 0, 'FE2', 3, 7, 'A50'),
(8, '2022-03-01 23:05:35', 300000, 'active', 0, 'FE2', 3, 6, 'A50'),
(9, '2022-03-01 23:05:35', 900000, 'active', 0, 'FE2', 3, 5, 'A50'),
(10, '2022-03-01 23:05:35', 50000, 'active', 0, 'FE2', 3, 7, 'A50'),
(11, '2022-03-01 23:05:35', 50000, 'active', 0, 'FE2', 3, 7, 'A50'),
(12, '2022-03-01 23:05:28', 450000, 'active', 0, 'FE2', 3, 2, 'A50'),
(13, '2022-03-01 23:05:35', 50000, 'active', 0, 'FE2', 3, 7, 'A50'),
(14, '2022-03-01 23:05:35', 50000, 'active', 0, 'FE2', 3, 7, 'A50'),
(15, '2022-03-01 23:05:35', 50000, 'active', 0, 'FE2', 3, 7, 'A50'),
(16, '2022-03-01 23:05:35', 50000, 'active', 0, 'FE2', 3, 7, 'A50'),
(17, '2022-03-01 23:05:35', 300000, 'active', 0, 'FE2', 3, 6, 'A50'),
(19, '2022-03-01 23:05:35', 50000, 'active', 0, 'FE2', 3, 7, 'A50'),
(21, '2022-03-01 23:05:35', 900000, 'active', 0, 'FE2', 3, 5, 'A50'),
(22, '2022-03-01 23:05:28', 740000, 'active', 0, 'FE2', 3, 4, 'A50'),
(23, '2022-03-01 23:05:35', 300000, 'active', 0, 'FE2', 3, 6, 'A50'),
(43, '2022-03-03 18:36:00', 350000, 'active', 0, 'FE2', 15, 9, 'A50'),
(44, '2022-03-04 00:00:00', 12, 'active', 0, 'FE2', 21, 16, 'A50'),
(45, '2022-03-01 23:05:35', 50000, 'active', 0, 'FE2', 21, 7, 'A50'),
(47, '2022-03-03 18:36:00', 350000, 'active', 0, 'FE2', 21, 9, 'A50'),
(48, '2022-03-04 00:00:00', 12, 'active', 0, 'FE2', 23, 16, 'A50'),
(49, '2022-03-06 00:00:00', 95000, 'active', 0, 'FE2', 23, 13, 'A50'),
(52, '2022-03-11 00:00:00', 50000, 'active', 0, 'FE2', 15, 22, 'A50'),
(53, '2022-03-10 00:00:00', 9000000, 'active', 0, 'FE2', 15, 20, 'A50'),
(54, '2022-03-11 00:00:00', 350000, 'active', 0, 'FE2', 15, 21, 'A50');

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `nom` varchar(30) NOT NULL,
  `prenom` varchar(30) NOT NULL,
  `email` varchar(50) NOT NULL,
  `motdepasse` varchar(30) NOT NULL,
  `role` varchar(50) NOT NULL DEFAULT 'client',
  `idclient` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`id`, `nom`, `prenom`, `email`, `motdepasse`, `role`, `idclient`) VALUES
(1, 'Bore', 'Younouss', 'Bore', 'Bore', 'admin', NULL),
(3, 'youss', 'youss', 'youss', '123456', 'admin', NULL),
(5, 'admin', 'admin', 'admin', 'admin', 'admin', NULL),
(12, 'younouss', 'younouss', 'younouss', 'younouss', 'client', 15),
(14, 'Ayak', 'Yayaj', 'ayayayak', '123456k', 'client', 20),
(15, 'yfg', 'ygh', 'tygh', '12345', 'client', 21),
(17, 'younouss', 'bore', 'younoussbore', '123456', 'client', 23),
(18, 'soliba', 'solia', '123456', '123456', 'client', 24);

-- --------------------------------------------------------

--
-- Structure de la table `vol`
--

CREATE TABLE `vol` (
  `id` int(11) NOT NULL,
  `num` varchar(5) DEFAULT NULL,
  `datedepart` datetime NOT NULL DEFAULT current_timestamp(),
  `datearrivee` datetime NOT NULL DEFAULT current_timestamp(),
  `aeropdepart` varchar(30) DEFAULT NULL,
  `aeroparrivee` varchar(30) DEFAULT NULL,
  `nomcompagnie` varchar(30) DEFAULT NULL,
  `nbrplace` int(11) DEFAULT NULL,
  `terminal` int(10) DEFAULT NULL,
  `prix` int(8) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `vol`
--

INSERT INTO `vol` (`id`, `num`, `datedepart`, `datearrivee`, `aeropdepart`, `aeroparrivee`, `nomcompagnie`, `nbrplace`, `terminal`, `prix`) VALUES
(1, '1', '2022-03-05 00:00:00', '2022-03-05 00:00:00', '3', '5', '2', 2, 52, 2),
(2, '1', '2022-03-01 23:05:28', '2022-03-01 23:05:28', 'Hong kong', 'Bamako', '1', 1, 1, 450000),
(3, '3', '2022-03-01 23:05:28', '2022-03-01 23:05:28', 'Prague ', 'L.A', '3', 3, 3, 650000),
(4, '2', '2022-03-01 23:05:28', '2022-03-01 23:05:28', 'Chine', 'Dubai', '2', 2, 2, 740000),
(5, '1', '2022-03-01 23:05:35', '2022-03-01 23:05:35', 'turkie', 'Moscou', '1', 1, 1, 900000),
(6, '4', '2022-03-06 00:00:00', '2022-03-06 00:00:00', '5', '6', '5', 3, 4, 14),
(7, '2', '2022-03-01 23:05:35', '2022-03-01 23:05:35', 'Gao', 'bamako', '2', 2, 2, 50000),
(8, 'a', '2022-03-03 18:36:00', '2022-03-03 18:36:00', 'LA', 'Bamako', 'Trkish', 44, 78, 800000),
(9, '489', '2022-03-11 00:00:00', '2022-03-11 00:00:00', 'xf', 'xdv', 'dg', 45, 452, 900000),
(12, '1', '2022-03-05 00:00:00', '2022-03-05 00:00:00', '3', '5', '2', 2, 2, 2),
(13, '4', '2022-03-06 00:00:00', '2022-03-06 00:00:00', '3', '5', '12', 21, 54, 95000),
(14, '4', '2022-03-06 00:00:00', '2022-03-06 00:00:00', 'LA', 'BAMAKO', '12', 21, 54, 95000),
(15, '4', '2022-03-06 00:00:00', '2022-03-06 00:00:00', '5', '6', '5', 3, 4, 14),
(16, '5', '2022-03-04 00:00:00', '2022-03-04 00:00:00', 'Kaye', 'Hane', '15', 21, 12, 12),
(17, '48', '2022-03-10 00:00:00', '2022-03-10 00:00:00', 'Bamako', 'Turkie', 'Quatar Airlines', 100, 9, 780000),
(18, '48', '2022-03-10 00:00:00', '2022-03-10 00:00:00', 'Bamako', 'Turkie', 'Quatar Airlines', 100, 9, 780000),
(19, '48', '2022-03-10 00:00:00', '2022-03-10 00:00:00', 'Gao', 'CAnada', 'Quatar Airlines', 100, 9, 780000),
(20, '489', '2022-03-10 00:00:00', '2022-03-10 00:00:00', 'Italie', 'Ile maldive', 'Fly emirate', 2, 90, 9000000),
(21, '489', '2022-03-11 00:00:00', '2022-03-11 00:00:00', 'c', 'xc', 'df', 5, 4, 520),
(22, '489', '2022-03-11 00:00:00', '2022-03-11 00:00:00', 'MAdagascar', 'Chine', 'Air AK', 2, 90, 50000),
(23, '65', '2022-03-03 00:00:00', '2022-03-03 00:00:00', 'Chine', 'Saint Petersbourg', 'Turkish', 40, 65, 350000),
(24, '651', '2022-03-27 00:00:00', '2022-03-27 00:00:00', 'hgg', 'nv', 'khh', 56, 35, 6846548),
(25, '45', '2022-03-01 00:00:00', '2022-03-01 00:00:00', 'gfd', 'c', '2', 562, 42, 758),
(26, '65', '2022-03-03 00:00:00', '2022-03-13 00:00:00', 'jdf', 'gsgcx', 'iysdxc', 654, 54, 5253);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_contact_client` (`idcontact`);

--
-- Index pour la table `contact`
--
ALTER TABLE `contact`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_client_reservation` (`idclient`),
  ADD KEY `fk_vol_reservation` (`idvol`);

--
-- Index pour la table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idclient` (`idclient`);

--
-- Index pour la table `vol`
--
ALTER TABLE `vol`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `client`
--
ALTER TABLE `client`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT pour la table `contact`
--
ALTER TABLE `contact`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;

--
-- AUTO_INCREMENT pour la table `reservation`
--
ALTER TABLE `reservation`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=55;

--
-- AUTO_INCREMENT pour la table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT pour la table `vol`
--
ALTER TABLE `vol`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `client`
--
ALTER TABLE `client`
  ADD CONSTRAINT `fk_contact_client` FOREIGN KEY (`idcontact`) REFERENCES `contact` (`id`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Contraintes pour la table `reservation`
--
ALTER TABLE `reservation`
  ADD CONSTRAINT `fk_client_reservation` FOREIGN KEY (`idclient`) REFERENCES `client` (`id`) ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_vol_reservation` FOREIGN KEY (`idvol`) REFERENCES `vol` (`id`) ON UPDATE CASCADE;

--
-- Contraintes pour la table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `user_ibfk_1` FOREIGN KEY (`idclient`) REFERENCES `client` (`id`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
