-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema DHtube
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema DHtube
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `DHtube` ;
USE `DHtube` ;

-- -----------------------------------------------------
-- Table `DHtube`.`avatares`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DHtube`.`avatares` (
  `id_avatares` INT NOT NULL,
  `nombre` VARCHAR(100) NULL,
  `direccion` VARCHAR(100) NULL,
  PRIMARY KEY (`id_avatares`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DHtube`.`paises`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DHtube`.`paises` (
  `id_pais` INT NOT NULL,
  `nombre` VARCHAR(100) NULL,
  PRIMARY KEY (`id_pais`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DHtube`.`tipo_usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DHtube`.`tipo_usuario` (
  `idtipo_usuario` INT NOT NULL AUTO_INCREMENT,
  `premium` TINYINT NULL,
  PRIMARY KEY (`idtipo_usuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DHtube`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DHtube`.`usuario` (
  `id_usuario` INT NOT NULL AUTO_INCREMENT,
  `correo` VARCHAR(100) NULL,
  `contrasena` VARCHAR(45) NULL,
  `nombre` VARCHAR(100) NULL,
  `fecha_nacimiento` DATE NULL,
  `codigo_postal` INT NULL,
  `avatares_id_avatares` INT NOT NULL,
  `paises_id_pais` INT NOT NULL,
  `tipo_usuario_idtipo_usuario` INT NOT NULL,
  PRIMARY KEY (`id_usuario`),
  INDEX `fk_usuarios_avatares1_idx` (`avatares_id_avatares` ASC) VISIBLE,
  INDEX `fk_usuarios_paises1_idx` (`paises_id_pais` ASC) VISIBLE,
  INDEX `fk_usuario_tipo_usuario1_idx` (`tipo_usuario_idtipo_usuario` ASC) VISIBLE,
  CONSTRAINT `fk_usuarios_avatares1`
    FOREIGN KEY (`avatares_id_avatares`)
    REFERENCES `DHtube`.`avatares` (`id_avatares`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_usuarios_paises1`
    FOREIGN KEY (`paises_id_pais`)
    REFERENCES `DHtube`.`paises` (`id_pais`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_usuario_tipo_usuario1`
    FOREIGN KEY (`tipo_usuario_idtipo_usuario`)
    REFERENCES `DHtube`.`tipo_usuario` (`idtipo_usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DHtube`.`reacciones`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DHtube`.`reacciones` (
  `id_reaccion` INT NOT NULL,
  `tipo_reaccion` VARCHAR(100) NULL,
  `fecha_creacion` DATE NULL,
  PRIMARY KEY (`id_reaccion`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DHtube`.`videos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DHtube`.`videos` (
  `id_videos` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(100) NULL,
  `descripcion` VARCHAR(200) NULL,
  `tamano` FLOAT NULL,
  `nombre_video` VARCHAR(100) NULL,
  `duracion` FLOAT NULL,
  `imagen` VARCHAR(100) NULL,
  `reproducciones` INT NULL,
  `nro_likes` INT NULL,
  `nro_dislikes` INT NULL,
  `publico` TINYINT NULL,
  `fecha_publicacion` DATE NULL,
  `usuarios_id_usuario` INT NOT NULL,
  `reacciones_id_reaccion` INT NOT NULL,
  PRIMARY KEY (`id_videos`),
  INDEX `fk_videos_usuarios_idx` (`usuarios_id_usuario` ASC) VISIBLE,
  INDEX `fk_videos_reacciones1_idx` (`reacciones_id_reaccion` ASC) VISIBLE,
  CONSTRAINT `fk_videos_usuarios`
    FOREIGN KEY (`usuarios_id_usuario`)
    REFERENCES `DHtube`.`usuario` (`id_usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_videos_reacciones1`
    FOREIGN KEY (`reacciones_id_reaccion`)
    REFERENCES `DHtube`.`reacciones` (`id_reaccion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DHtube`.`etiquetas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DHtube`.`etiquetas` (
  `id_etiquetas` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(100) NULL,
  PRIMARY KEY (`id_etiquetas`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DHtube`.`canales`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DHtube`.`canales` (
  `id_canales` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(100) NULL,
  `descripcion` VARCHAR(200) NULL,
  `fecha_creacion` DATE NULL,
  `usuarios_id_usuario` INT NOT NULL,
  PRIMARY KEY (`id_canales`),
  INDEX `fk_canales_usuarios1_idx` (`usuarios_id_usuario` ASC) VISIBLE,
  CONSTRAINT `fk_canales_usuarios1`
    FOREIGN KEY (`usuarios_id_usuario`)
    REFERENCES `DHtube`.`usuario` (`id_usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DHtube`.`playlists`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DHtube`.`playlists` (
  `id_playlists` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(100) NULL,
  `fecha_creacion` DATE NULL,
  `usuarios_id_usuario` INT NOT NULL,
  `publica` TINYINT NULL,
  PRIMARY KEY (`id_playlists`),
  INDEX `fk_playlists_usuarios1_idx` (`usuarios_id_usuario` ASC) VISIBLE,
  CONSTRAINT `fk_playlists_usuarios1`
    FOREIGN KEY (`usuarios_id_usuario`)
    REFERENCES `DHtube`.`usuario` (`id_usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DHtube`.`playlists_videos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DHtube`.`playlists_videos` (
  `id_playlists_videos` INT NOT NULL AUTO_INCREMENT,
  `playlists_id_playlists` INT NOT NULL,
  `videos_id_videos` INT NOT NULL,
  PRIMARY KEY (`id_playlists_videos`),
  INDEX `fk_playlists_videos_playlists1_idx` (`playlists_id_playlists` ASC) VISIBLE,
  INDEX `fk_playlists_videos_videos1_idx` (`videos_id_videos` ASC) VISIBLE,
  CONSTRAINT `fk_playlists_videos_playlists1`
    FOREIGN KEY (`playlists_id_playlists`)
    REFERENCES `DHtube`.`playlists` (`id_playlists`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_playlists_videos_videos1`
    FOREIGN KEY (`videos_id_videos`)
    REFERENCES `DHtube`.`videos` (`id_videos`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DHtube`.`usuario_reaccion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DHtube`.`usuario_reaccion` (
  `id` INT NOT NULL,
  `usuario_id_usuario` INT NOT NULL,
  `reacciones_id_reaccion` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_usuario_reaccion_usuario1_idx` (`usuario_id_usuario` ASC) VISIBLE,
  INDEX `fk_usuario_reaccion_reacciones1_idx` (`reacciones_id_reaccion` ASC) VISIBLE,
  CONSTRAINT `fk_usuario_reaccion_usuario1`
    FOREIGN KEY (`usuario_id_usuario`)
    REFERENCES `DHtube`.`usuario` (`id_usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_usuario_reaccion_reacciones1`
    FOREIGN KEY (`reacciones_id_reaccion`)
    REFERENCES `DHtube`.`reacciones` (`id_reaccion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DHtube`.`etiquetas_videos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DHtube`.`etiquetas_videos` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `etiquetas_id_etiquetas` INT NOT NULL,
  `videos_id_videos` INT NOT NULL,
  PRIMARY KEY (`id`, `videos_id_videos`),
  INDEX `fk_etiquetas_videos_etiquetas1_idx` (`etiquetas_id_etiquetas` ASC) VISIBLE,
  INDEX `fk_etiquetas_videos_videos1_idx` (`videos_id_videos` ASC) VISIBLE,
  CONSTRAINT `fk_etiquetas_videos_etiquetas1`
    FOREIGN KEY (`etiquetas_id_etiquetas`)
    REFERENCES `DHtube`.`etiquetas` (`id_etiquetas`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_etiquetas_videos_videos1`
    FOREIGN KEY (`videos_id_videos`)
    REFERENCES `DHtube`.`videos` (`id_videos`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
