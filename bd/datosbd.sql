CREATE DATABASE holte;
use hotel;

-- Table structure for table `huespedes`


DROP TABLE IF EXISTS `huespedes`;

CREATE TABLE `huespedes` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `idReserva` int unsigned NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `fechaNnacimiento` date NOT NULL,
  `nacionalidad` varchar(50) NOT NULL,
  `telefono` varchar(35) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `huespedes_ibfk_1` (`idReserva`),
  CONSTRAINT `huespedes_ibfk_1` FOREIGN KEY (`idReserva`) REFERENCES `reservas` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Table structure for table `reservas`

DROP TABLE IF EXISTS `reservas`;

CREATE TABLE `reservas` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `fechaEntrada` date NOT NULL,
  `fechaSalida` date NOT NULL,
  `valor` varchar(25) NOT NULL,
  `formaPago` varchar(35) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Table structure for table `usuarios`


DROP TABLE IF EXISTS `usuarios`;

CREATE TABLE `usuarios` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `nombre` varchar(25) NOT NULL,
  `contrasena` varchar(25) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



