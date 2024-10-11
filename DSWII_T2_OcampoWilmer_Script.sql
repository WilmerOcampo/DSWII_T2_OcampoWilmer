CREATE SCHEMA `wo_soap_db` DEFAULT CHARACTER SET utf8 ;

SELECT * FROM wo_soap_db.payments;

INSERT INTO `wo_soap_db`.`payments` (`payment_date`, `total_amount`, `currency`) VALUES ('2024-10-10', '950.09', 'Soles');
INSERT INTO `wo_soap_db`.`payments` (`payment_date`, `total_amount`, `currency`) VALUES ('2024-10-11', '860.52', 'Dólares');
INSERT INTO `wo_soap_db`.`payments` (`payment_date`, `total_amount`, `currency`) VALUES ('2024-10-11', '3200.23', 'Soles');
INSERT INTO `wo_soap_db`.`payments` (`payment_date`, `total_amount`, `currency`) VALUES ('2024-10-11', '520.03', 'Dólares');
INSERT INTO `wo_soap_db`.`payments` (`payment_date`, `total_amount`, `currency`) VALUES ('2024-10-11', '1025.99', 'Soles');

SELECT * FROM wo_soap_db.payments WHERE `payment_date` = '2024-10-11';
