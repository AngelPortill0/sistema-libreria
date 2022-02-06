-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 06, 2022 at 08:34 PM
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
(6, 'Gabriel José', 'García Márquez', '1927-03-06', 'Gabriel José García Márquez    fue un escritor y periodista colombiano. Reconocido principalmente por sus novelas y cuentos, también escribió narrativa de no ficción, discursos, reportajes, críticas cinematográficas y memorias. Fue conocido como Gabo, y familiarmente y por sus amigos como Gabito.', 48),
(15, 'Jane', 'Austen', '1775-12-16', 'Fue una novelista británica que vivió durante la época georgiana. La ironía que empleaba para dotar de comicidad a sus novelas hace que Jane Austen sea considerada entre los clásicos de la novela inglesa,  a la vez que su recepción va, incluso en la actualidad, más allá del interés académico, siendo sus obras leídas por un público más amplio', 30),
(16, 'Jorge', 'Borges', '1889-07-24', 'Jorge Francisco Isidoro Luis Borges, más conocido como Jorge Luis Borges, fue un destacado escritor de cuentos, poemas y ensayos argentino, extensamente considerado una figura clave tanto para la literatura en habla hispana como para la literatura universal.', 80);

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
(4, 'Obra de Teatro'),
(5, 'Cuento'),
(6, 'Cuento');

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
(14, 'Ficciones', '1944-01-01', '13:9789875666474', 250, 7, 'Ficciones es un libro de cuentos escrito por Jorge Luis Borges, publicado en 1944 y compuesto de dos partes: El jardín de senderos que se bifurcan y Artificios; posee dos prólogos.', 520),
(15, 'Lady Susan', '1870-01-01', '13:9780140431025', 150, 7, 'Lady Susan, es una novela corta epistolar de Jane Austen. Posiblemente escrita en 1794, fue publicada en 1871 en forma póstuma.', 90),
(16, 'Emma', '1815-12-23', '9789588925769', 50, 10, 'Emma es una novela cómica escrita por Jane Austen, en inglés, publicada por vez primera en 1815 por el editor John Murray, sobre los peligros de malinterpretar el romance. El personaje principal, Emma Woodhouse, se describe como \"hermosa, lista y rica\" pero también es bastante mimada.', 5.99),
(17, 'Orgullo y prejuicio', '1813-01-28', '9780192561411', 90, 58, 'La novela describe poco más de un año en la vida de un pequeño grupo de jóvenes en el campo cerca de Londres en el cambio de siglo (del XVIII al XIX), durante el reinado de Jorge III.', 7);

-- --------------------------------------------------------

--
-- Table structure for table `libros_autores`
--

CREATE TABLE `libros_autores` (
  `idLibro` int(10) NOT NULL,
  `idGenero` int(10) NOT NULL,
  `idAutor` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `libros_autores`
--

INSERT INTO `libros_autores` (`idLibro`, `idGenero`, `idAutor`) VALUES
(16, 3, 15),
(16, 3, 15),
(14, 5, 16),
(14, 6, 16),
(15, 3, 15),
(17, 3, 15),
(14, 2, 6),
(17, 4, 6),
(15, 6, 4);

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
  ADD KEY `idLibro` (`idLibro`),
  ADD KEY `idGenero` (`idGenero`),
  ADD KEY `idAutor` (`idAutor`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `autor`
--
ALTER TABLE `autor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `genero`
--
ALTER TABLE `genero`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `libro`
--
ALTER TABLE `libro`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `libros_autores`
--
ALTER TABLE `libros_autores`
  ADD CONSTRAINT `libros_autores_ibfk_1` FOREIGN KEY (`idGenero`) REFERENCES `genero` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `libros_autores_ibfk_2` FOREIGN KEY (`idAutor`) REFERENCES `autor` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `libros_autores_ibfk_3` FOREIGN KEY (`idLibro`) REFERENCES `libro` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
