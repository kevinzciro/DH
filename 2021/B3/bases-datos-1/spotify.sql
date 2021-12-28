-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema spotify
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema spotify
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `spotify` ;
USE `spotify` ;

-- -----------------------------------------------------
-- Table `spotify`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `spotify`.`usuario` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `correo` VARCHAR(100) NULL,
  `contrasena` VARCHAR(100) NULL,
  `fecha_nacimiento` DATE NULL,
  `sexo` INT NULL,
  `codigo_postal` VARCHAR(100) NULL,
  `pais` VARCHAR(100) NULL,
  `fecha_mod_contra` DATE NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `spotify`.`playlist`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `spotify`.`playlist` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(100) NULL,
  `numero_canciones` INT NULL,
  `fecha_creacion` DATE NULL,
  `usuario_id` INT NOT NULL,
  `activa` TINYINT NULL,
  `fecha_eliminacion` DATE NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_playlist_usuario_idx` (`usuario_id` ASC) VISIBLE,
  CONSTRAINT `fk_playlist_usuario`
    FOREIGN KEY (`usuario_id`)
    REFERENCES `spotify`.`usuario` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `spotify`.`artista`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `spotify`.`artista` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(100) NULL,
  `apellido` VARCHAR(100) NULL,
  `imagen` VARCHAR(100) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `spotify`.`discografia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `spotify`.`discografia` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `pais` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `spotify`.`album`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `spotify`.`album` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(100) NULL,
  `anio_publicacion` INT(4) NULL,
  `imagen` VARCHAR(100) NULL,
  `artista_id` INT NOT NULL,
  `discografia_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_album_artista1_idx` (`artista_id` ASC) VISIBLE,
  INDEX `fk_album_discografia1_idx` (`discografia_id` ASC) VISIBLE,
  CONSTRAINT `fk_album_artista1`
    FOREIGN KEY (`artista_id`)
    REFERENCES `spotify`.`artista` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_album_discografia1`
    FOREIGN KEY (`discografia_id`)
    REFERENCES `spotify`.`discografia` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `spotify`.`canciones`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `spotify`.`canciones` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(100) NULL,
  `duracion` FLOAT NULL,
  `numero_reproducciones` INT NULL,
  `likes` INT NULL,
  `album_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_canciones_album1_idx` (`album_id` ASC) VISIBLE,
  CONSTRAINT `fk_canciones_album1`
    FOREIGN KEY (`album_id`)
    REFERENCES `spotify`.`album` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `spotify`.`genero`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `spotify`.`genero` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(100) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `spotify`.`canciones_genero`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `spotify`.`canciones_genero` (
  `id` INT NOT NULL,
  `canciones_id` INT NOT NULL,
  `genero_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_canciones_genero_canciones1_idx` (`canciones_id` ASC) VISIBLE,
  INDEX `fk_canciones_genero_genero1_idx` (`genero_id` ASC) VISIBLE,
  CONSTRAINT `fk_canciones_genero_canciones1`
    FOREIGN KEY (`canciones_id`)
    REFERENCES `spotify`.`canciones` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_canciones_genero_genero1`
    FOREIGN KEY (`genero_id`)
    REFERENCES `spotify`.`genero` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `spotify`.`playlist_cancion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `spotify`.`playlist_cancion` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `playlist_id` INT NOT NULL,
  `canciones_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_playlist_cancion_playlist1_idx` (`playlist_id` ASC) VISIBLE,
  INDEX `fk_playlist_cancion_canciones1_idx` (`canciones_id` ASC) VISIBLE,
  CONSTRAINT `fk_playlist_cancion_playlist1`
    FOREIGN KEY (`playlist_id`)
    REFERENCES `spotify`.`playlist` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_playlist_cancion_canciones1`
    FOREIGN KEY (`canciones_id`)
    REFERENCES `spotify`.`canciones` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
