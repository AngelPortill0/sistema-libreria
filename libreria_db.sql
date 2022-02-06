-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 06, 2022 at 07:44 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `libreria_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `autor`
--

CREATE TABLE `autor` (
  `id` int(11) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellido` varchar(20) NOT NULL,
  `fechaDeNacimiento` date NOT NULL,
  `biografia` varchar(500) NOT NULL,
  `numeroDePublicaciones` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `autor`
--

INSERT INTO `autor` (`id`, `nombre`, `apellido`, `fechaDeNacimiento`, `biografia`, `numeroDePublicaciones`) VALUES
(4, 'Mark', 'Douglas', '1968-10-20', 'Mark Douglas es un trader rentable que busca adquirir y fomentar conocimiento referente a todo lo relacionado con el trading, como la psicología, estrategias, gestión de riesgo y análisis técnico.', 20),
(5, 'Alfredo', 'Chaumer', '1978-02-02', 'Alfredo nació en Caracas, Venezuela. Sus estudios los realizó en la UCV como sociólogo.', 1),
(6, 'Gabriel José', 'García Márquez', '1927-03-06', 'Gabriel José García Márquez    fue un escritor y periodista colombiano. Reconocido principalmente por sus novelas y cuentos, también escribió narrativa de no ficción, discursos, reportajes, críticas cinematográficas y memorias. Fue conocido como Gabo, y familiarmente y por sus amigos como Gabito.', 48);

-- --------------------------------------------------------

--
-- Table structure for table `genero`
--

CREATE TABLE `genero` (
  `id` int(10) NOT NULL,
  `genero` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `genero`
--

INSERT INTO `genero` (`id`, `genero`) VALUES
(2, 'Negocios y Economía'),
(3, 'Novela'),
(4, 'Obra de Teatro');

-- --------------------------------------------------------

--
-- Table structure for table `libro`
--

CREATE TABLE `libro` (
  `id` int(10) NOT NULL,
  `titulo` varchar(200) NOT NULL,
  `fechaDePublicacion` date NOT NULL,
  `isbn` varchar(50) NOT NULL,
  `numeroDePaginas` int(255) NOT NULL,
  `puntuacion` int(10) NOT NULL,
  `descripcion` varchar(2000) NOT NULL,
  `precio` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `libro`
--

INSERT INTO `libro` (`id`, `titulo`, `fechaDePublicacion`, `isbn`, `numeroDePaginas`, `puntuacion`, `descripcion`, `precio`) VALUES
(7, 'el eppe', '1605-01-01', '10:8415171803', 500, 4, 'asdasdasdasdasd', 16.79),
(8, 'csdfsdfsdf', '1605-01-01', '10:8415171803', 500, 4, 'fafasf', 6.6),
(9, 'fasfas', '1605-01-01', '13:9780486842196', 500, 4, 'asfasfasf', 16.79),
(10, 'fasasfafas', '1867-01-01', '13:9780486842196', 500, 4, 'afafaf', 0),
(11, 'fasasfafas', '1867-01-01', '13:9780486842196', 500, 4, 'afafaf', 0),
(12, 'fasfasf', '0000-00-00', '10:8415171803', 500, 4, 'dasdasdasd', 6.6),
(13, 'fasfasf', '0000-00-00', '10:8415171803', 500, 4, 'dasdasdasd', 6.6);

-- --------------------------------------------------------

--
-- Table structure for table `libros_autores`
--

CREATE TABLE `libros_autores` (
  `idLibro` int(10) NOT NULL,
  `idAutor` int(10) NOT NULL,
  `idGenero` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `libros_autores`
--

INSERT INTO `libros_autores` (`idLibro`, `idAutor`, `idGenero`) VALUES
(8, 5, 2),
(7, 6, 3),
(7, 6, 3),
(10, 4, 4),
(7, 4, 2),
(11, 6, 2),
(11, 5, 3);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `autor`
--
ALTER TABLE `autor`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `genero`
--
ALTER TABLE `genero`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `libro`
--
ALTER TABLE `libro`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `libros_autores`
--
ALTER TABLE `libros_autores`
  ADD KEY `fkAutor` (`idAutor`),
  ADD KEY `idLibro` (`idLibro`),
  ADD KEY `idGenero` (`idGenero`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `autor`
--
ALTER TABLE `autor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `genero`
--
ALTER TABLE `genero`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `libro`
--
ALTER TABLE `libro`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `libros_autores`
--
ALTER TABLE `libros_autores`
  ADD CONSTRAINT `fkAutor` FOREIGN KEY (`idAutor`) REFERENCES `autor` (`id`),
  ADD CONSTRAINT `libros_autores_ibfk_1` FOREIGN KEY (`idLibro`) REFERENCES `libro` (`id`),
  ADD CONSTRAINT `libros_autores_ibfk_2` FOREIGN KEY (`idGenero`) REFERENCES `genero` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
