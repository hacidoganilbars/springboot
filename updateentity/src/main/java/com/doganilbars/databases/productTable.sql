CREATE SCHEMA `myproduct` ;

CREATE TABLE `myproduct`.`product` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `price` DECIMAL(10,1) NOT NULL,
  `quantity` INT NOT NULL,
  `description` TEXT(250) NOT NULL,
  `photo` VARCHAR(250) NOT NULL,
  `featured` TINYINT(1) NOT NULL,
  PRIMARY KEY (`id`));
  
  
  INSERT INTO `myproduct`.`product` (`name`, `price`, `quantity`, `description`, `photo`, `featured`) VALUES ('Mobile 1', '2.0', '2', 'description 1', 'thumb1.gif', '1');
INSERT INTO `myproduct`.`product` (`name`, `price`, `quantity`, `description`, `photo`, `featured`) VALUES ('Mobile 2', '1.0', '5', 'description 2', 'thumb2.gif', '1');
INSERT INTO `myproduct`.`product` (`name`, `price`, `quantity`, `description`, `photo`, `featured`) VALUES ('Mobile 3', '3.0', '9', 'description 3', 'thumb3.gif', '1');
INSERT INTO `myproduct`.`product` (`name`, `price`, `quantity`, `description`, `photo`, `featured`) VALUES ('Computer 1', '5.0', '12', 'description 4', 'thumb1.gif', '0');
INSERT INTO `myproduct`.`product` (`name`, `price`, `quantity`, `description`, `photo`, `featured`) VALUES ('Computer 2', '7.0', '5', 'description 5', 'thumb1.gif', '1');
INSERT INTO `myproduct`.`product` (`name`, `price`, `quantity`, `description`, `photo`, `featured`) VALUES ('Computer 3', '12.0', '2', 'description 6', 'thumb2.gif', '1');
INSERT INTO `myproduct`.`product` (`name`, `price`, `quantity`, `description`, `photo`, `featured`) VALUES ('Laptop 1', '3.0', '8', 'description 7', 'thumb2.gif', '0');
INSERT INTO `myproduct`.`product` (`name`, `price`, `quantity`, `description`, `photo`, `featured`) VALUES ('Laptop 2', '4.0', '11', 'description 8', 'thumb3.gif', '0');
INSERT INTO `myproduct`.`product` (`name`, `price`, `quantity`, `description`, `photo`, `featured`) VALUES ('Laptop 3', '2.0', '15', 'description 9', 'thumb2.gif', '1');

