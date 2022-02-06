-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 07, 2022 at 12:05 AM
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
  `id` int(10) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellido` varchar(20) NOT NULL,
  `fechaDeNacimiento` date NOT NULL,
  `biografia` varchar(1000) NOT NULL,
  `numeroDePublicaciones` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `autor`
--

INSERT INTO `autor` (`id`, `nombre`, `apellido`, `fechaDeNacimiento`, `biografia`, `numeroDePublicaciones`) VALUES
(1, 'Alfredo', 'Chaumer', '1978-02-02', 'Alfredo José Chaumer Herrera Nació en Caracas, Venezuela. Graduado de Sociólogo egresado de la Universidad Central de Venezuela en el año 2009; curso estudios de Planificación del desarrollo y se ha especializado en el análisis de datos para la toma de decisiones. Consultor, asesor y Trader desde el año 2012, su proceso de aprendizaje siempre se ha enriquecido transmitiendo pedagógicamente la sistematización de su experiencia, es por ello que en el año 2018 crea un programa de capacitación integral enfocado en el desarrollo de un criterio propio y en estimular la consistencia operativa siempre enfocado en la rentabilidad factible.', 1),
(2, 'Gabriel', 'Márquez', '1927-03-06', 'Gabriel José García Márquez    fue un escritor y periodista colombiano. Reconocido principalmente por sus novelas y cuentos, también escribió narrativa de no ficción, discursos, reportajes, críticas cinematográficas y memorias. Fue conocido como Gabo, y familiarmente y por sus amigos como Gabito.', 48),
(3, 'Charles', 'Dickens', '1812-02-07', 'Charles John Huffam Dickens fue un escritor inglés. Creó algunos de los personajes de ficción más conocidos en el mundo y muchos lo consideran el mejor novelista de la época victoriana.', 18),
(4, 'Miguel', 'de Cervantes', '1547-09-29', 'Miguel de Cervantes Saavedra fue un novelista, poeta, dramaturgo y soldado español. Es ampliamente considerado una de las máximas figuras de la literatura española.', 8),
(5, 'Jorge', 'Borges', '1889-07-24', 'Jorge Francisco Isidoro Luis Borges, más conocido como Jorge Luis Borges, fue un destacado escritor de cuentos, poemas y ensayos argentino, extensamente considerado una figura clave tanto para la literatura en habla hispana como para la literatura universal.', 80),
(6, 'Jane', 'Austen', '1775-12-16', 'fue una novelista británica que vivió durante la época georgiana. La ironía que empleaba para dotar de comicidad a sus novelas hace que Jane Austen sea considerada entre los clásicos de la novela inglesa,  a la vez que su recepción va, incluso en la actualidad, más allá del interés académico, siendo sus obras leídas por un público más amplio', 30);

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
(1, 'Conocimientos'),
(2, 'Novela'),
(3, 'Obra de teatro'),
(4, 'Cuento');

-- --------------------------------------------------------

--
-- Table structure for table `libro`
--

CREATE TABLE `libro` (
  `id` int(10) NOT NULL,
  `titulo` varchar(20) NOT NULL,
  `fechaDePublicacion` date NOT NULL,
  `isbn` varchar(50) NOT NULL,
  `numeroDePaginas` int(255) NOT NULL,
  `puntuacion` float NOT NULL,
  `descripcion` varchar(2000) NOT NULL,
  `precio` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `libro`
--

INSERT INTO `libro` (`id`, `titulo`, `fechaDePublicacion`, `isbn`, `numeroDePaginas`, `puntuacion`, `descripcion`, `precio`) VALUES
(1, 'Trading como Negocio', '2020-04-01', 'B086PG66L2', 101, 10, 'Mucho se ha escrito sobre trading, innumerables libros enfocados en operativas, análisis, estrategias, incluso en tratar de diagramar paso a paso esta actividad. En este caso, busco trascender de lo técnico o esperanzador y me enfoco en estimular el proceso reflexivo que permite configurar una percepción del trading propia. A través de diversos elementos, enfoques o concepciones busco exponer los principales escenarios en los cuales contextualizamos el trading, las limitaciones particulares que más se repiten, acciones orientadas a superar circunstancias complejas, para luego plantear una concepción factible y exitosa con la cual he logrado desarrollar resultados rentables desde hace más de 3 años.\r\nEscribí este libro no con ínfulas ni pretensiones de experto financiero, y creo que ya es evidente que no te estoy ofreciendo una operativa, una fórmula, una entrada o un método mágico para crear riqueza de forma instantánea y segura. Mi promesa para ti, cuando termines de leer este libro, es que podrás ver el trading desde una perspectiva que trasciende el “marketing esperanzador”, un paradigma integrador y de negocios, lo que te permitirá diseñar esta actividad a tu medida, con una visión a largo plazo, utilizando todas las herramientas de las cuales dispongas y adquiriendo todo el conocimiento que consideres apropiado para hacer del trading un negocio rentable.', 9.99),
(2, 'Don Quijote de la Ma', '1605-01-01', '10:8415171803', 150, 4, 'Libro Raro', 16.79),
(3, 'Sin vía pública', '1867-01-01', '13:9780486842196', 500, 3, 'En esta fascinante novela de intriga se funden el amor y la crítica social, el humor y la ironía con la aventura y el drama, hasta culminar en un inesperado desenlace.\r\nLondres, 1835. Una elegante mujer detiene a una empleada del orfanato, cuando esta sale de trabajar al anochecer. Necesita saber el nombre que le han puesto a un niño que han recogido pocos días antes a las puertas de esa institución. Con el paso del tiempo, la identidad del joven Walter Winding dará lugar a equívocos y a amores imposibles...Esta novela constituye el fruto más destacado de la amistad y la colaboración literaria entre dos grandes autores de la literatura universal.\r\n', 6.6),
(4, 'Orgullo y prejuicio', '1813-01-28', '9780192561411', 150, 10, 'La novela describe poco más de un año en la vida de un pequeño grupo de jóvenes en el campo cerca de Londres en el cambio de siglo (del XVIII al XIX), durante el reinado de Jorge III.', 16.79),
(5, 'Emma', '1815-12-23', '9780486842196', 150, 0.1, 'Emma es una novela cómica escrita por Jane Austen, en inglés, publicada por vez primera en 1815 por el editor John Murray, sobre los peligros de malinterpretar el romance. El personaje principal, Emma Woodhouse, se describe como \"hermosa, lista y rica\" pero también es bastante mimada.', 9924),
(6, 'Lady Susan', '1871-01-01', '13: 9780140431025', 1, 4, 'Lady Susan, es una novela corta epistolar de Jane Austen. Posiblemente escrita en 1794, fue publicada en 1871 en forma póstuma.', 6.6),
(7, 'Ficciones', '1944-01-01', '77:98457', 150, 4, 'Ficciones es un libro de cuentos escrito por Jorge Luis Borges, publicado en 1944 y compuesto de dos partes: El jardín de senderos que se bifurcan y Artificios; posee dos prólogos.', 9924);

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
(1, 1, 1),
(2, 3, 2),
(7, 4, 5),
(6, 2, 6),
(5, 2, 6),
(1, 1, 3),
(4, 2, 6);

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
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `genero`
--
ALTER TABLE `genero`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `libro`
--
ALTER TABLE `libro`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `libros_autores`
--
ALTER TABLE `libros_autores`
  ADD CONSTRAINT `libros_autores_ibfk_1` FOREIGN KEY (`idGenero`) REFERENCES `genero` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `libros_autores_ibfk_2` FOREIGN KEY (`idLibro`) REFERENCES `libro` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `libros_autores_ibfk_3` FOREIGN KEY (`idAutor`) REFERENCES `autor` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
