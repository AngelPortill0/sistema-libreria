-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-02-2022 a las 02:42:30
-- Versión del servidor: 10.4.19-MariaDB
-- Versión de PHP: 8.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `libreria_db`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `autor`
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
-- Volcado de datos para la tabla `autor`
--

INSERT INTO `autor` (`id`, `nombre`, `apellido`, `fechaDeNacimiento`, `biografia`, `numeroDePublicaciones`) VALUES
(4, 'Mark', 'Douglas', '1968-10-20', 'Mark Douglas es un trader rentable que busca adquirir y fomentar conocimiento referente a todo lo relacionado con el trading, como la psicología, estrategias, gestión de riesgo y análisis técnico.', 20),
(5, 'Alfredo', 'Chaumer', '1978-02-02', 'Alfredo nació en Caracas, Venezuela. Sus estudios los realizó en la UCV como sociólogo.', 1),
(6, 'Gabriel José', 'García Márquez', '1927-03-06', 'Gabriel José García Márquez    fue un escritor y periodista colombiano. Reconocido principalmente por sus novelas y cuentos, también escribió narrativa de no ficción, discursos, reportajes, críticas cinematográficas y memorias. Fue conocido como Gabo, y familiarmente y por sus amigos como Gabito.', 48),
(7, 'Charles', 'Dickens', '1812-02-07', 'Charles John Huffam Dickens fue un escritor inglés. Creó algunos de los personajes de ficción más conocidos en el mundo y muchos lo consideran el mejor novelista de la época victoriana.', 18),
(8, 'Miguel', 'de Cervantes', '1547-09-29', 'Miguel de Cervantes Saavedra fue un novelista, poeta, dramaturgo y soldado español. Es ampliamente considerado una de las máximas figuras de la literatura española.', 8);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `genero`
--

CREATE TABLE `genero` (
  `id` int(10) NOT NULL,
  `genero` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `genero`
--

INSERT INTO `genero` (`id`, `genero`) VALUES
(2, 'Negocios y Economía'),
(3, 'Novela'),
(4, 'Obra de Teatro');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libro`
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
-- Volcado de datos para la tabla `libro`
--

INSERT INTO `libro` (`id`, `titulo`, `fechaDePublicacion`, `isbn`, `numeroDePaginas`, `puntuacion`, `descripcion`, `precio`) VALUES
(4, 'Trading como negocio: 8 ingredientes para ser rentable y no quebrar en el intento', '2020-04-01', 'B086PG66L2', 101, 10, 'Mucho se ha escrito sobre trading, innumerables libros enfocados en operativas, análisis, estrategias, incluso en tratar de diagramar paso a paso esta actividad. En este caso, busco trascender de lo técnico o esperanzador y me enfoco en estimular el proceso reflexivo que permite configurar una percepción del trading propia. A través de diversos elementos, enfoques o concepciones busco exponer los principales escenarios en los cuales contextualizamos el trading, las limitaciones particulares que más se repiten, acciones orientadas a superar circunstancias complejas, para luego plantear una concepción factible y exitosa con la cual he logrado desarrollar resultados rentables desde hace más de 3 años.\r\nEscribí este libro no con ínfulas ni pretensiones de experto financiero, y creo que ya es evidente que no te estoy ofreciendo una operativa, una fórmula, una entrada o un método mágico para crear riqueza de forma instantánea y segura. Mi promesa para ti, cuando termines de leer este libro, es que podrás ver el trading desde una perspectiva que trasciende el “marketing esperanzador”, un paradigma integrador y de negocios, lo que te permitirá diseñar esta actividad a tu medida, con una visión a largo plazo, utilizando todas las herramientas de las cuales dispongas y adquiriendo todo el conocimiento que consideres apropiado para hacer del trading un negocio rentable.', 9.99),
(5, 'Don Quijote de la Mancha', '1605-01-01', '10: 8415171803', 1605, 4, 'Libro raro', 16.79),
(6, 'Sin vía pública', '1867-01-01', '13: 9780486842196', 500, 4, 'En esta fascinante novela de intriga se funden el amor y la crítica social, el humor y la ironía con la aventura y el drama, hasta culminar en un inesperado desenlace.\r\nLondres, 1835. Una elegante mujer detiene a una empleada del orfanato, cuando esta sale de trabajar al anochecer. Necesita saber el nombre que le han puesto a un niño que han recogido pocos días antes a las puertas de esa institución. Con el paso del tiempo, la identidad del joven Walter Winding dará lugar a equívocos y a amores imposibles...Esta novela constituye el fruto más destacado de la amistad y la colaboración literaria entre dos grandes autores de la literatura universal.', 6.6);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libros_autores`
--

CREATE TABLE `libros_autores` (
  `idLibro` int(10) NOT NULL,
  `idAutor` int(10) NOT NULL,
  `idGenero` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `libros_autores`
--

INSERT INTO `libros_autores` (`idLibro`, `idAutor`, `idGenero`) VALUES
(4, 5, 2),
(5, 8, 3),
(6, 7, 4);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `autor`
--
ALTER TABLE `autor`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `genero`
--
ALTER TABLE `genero`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `libro`
--
ALTER TABLE `libro`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `libros_autores`
--
ALTER TABLE `libros_autores`
  ADD KEY `fkAutor` (`idAutor`),
  ADD KEY `idLibro` (`idLibro`),
  ADD KEY `idGenero` (`idGenero`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `autor`
--
ALTER TABLE `autor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `genero`
--
ALTER TABLE `genero`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `libro`
--
ALTER TABLE `libro`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `libros_autores`
--
ALTER TABLE `libros_autores`
  ADD CONSTRAINT `fkAutor` FOREIGN KEY (`idAutor`) REFERENCES `autor` (`id`),
  ADD CONSTRAINT `libros_autores_ibfk_1` FOREIGN KEY (`idLibro`) REFERENCES `libro` (`id`),
  ADD CONSTRAINT `libros_autores_ibfk_2` FOREIGN KEY (`idGenero`) REFERENCES `genero` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
