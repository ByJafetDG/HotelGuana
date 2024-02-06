create schema apphotelgte;
use apphotelgte;

-- --------------------------------Creacion de tablas--------------------------------------

create table Sucursal(
id_Sucursal int primary key,
nombre varchar(100),
direccion varchar(100),
telefono varchar(12),
correo varchar(100)
);

create table Usuario(
id_Usuario int primary key, 
nombre varchar(100),
apellido varchar(100),
correo varchar(100),
contrasena varbinary(100),
sucursal_id_Sucursal int not null,
CONSTRAINT `fk_usuario_sucursal1`
FOREIGN KEY (`sucursal_id_Sucursal`)REFERENCES `apphotelgte`.`sucursal` (`id_Sucursal`)
);


create table Empleado(
id_Empleado int primary key,
nombre varchar(100),
apellido varchar(100),
correo varchar(100),
telefono varchar(12),
direccion varchar(100),
cargo varchar(50),
id_Usuario int null,
FOREIGN KEY (id_Usuario) REFERENCES Usuario(id_Usuario));


create table Cliente(
id_Cliente int primary key AUTO_INCREMENT,
id_Habitacion int,
nombre varchar(100),
apellido varchar(100),
identificacion varchar(50) unique,
correo varchar(100),
check_in date,
check_out date,
telefono varchar(20),
direccion varchar(100),
placa varchar(30),
observacion varchar(100),
sucursal_id_Sucursal int null,
CONSTRAINT `fk_cliente_sucursal1`
FOREIGN KEY (`sucursal_id_Sucursal`) REFERENCES `apphotelgte`.`sucursal` (`id_Sucursal`)
);

create table Reservaciones(
id_Reserva int primary key,
nombre_Cliente varchar(100),
telefono_Cliente varchar(12), 
check_in date,
check_out date,
estado varchar(50),
cliente_id_Cliente int null,
CONSTRAINT `fk_reservaciones_cliente1`
FOREIGN KEY (`cliente_id_Cliente`) REFERENCES `apphotelgte`.`cliente` (`id_Cliente`)
);


create table Habitaciones(
id_Habitacion int primary key,
tipo_Habitacion varchar(100),
estado enum('Disponible', 'Ocupada', 'Limpieza', 'Mantenimiento') not null,
precio_1P decimal (10,4),
precio_2P decimal (10,4),
precio_3P decimal (10,4),
precio_4P decimal (10,4),
precio_5P decimal (10,4),
precio_6P decimal (10,4),
descripcion varchar(50),
observacion varchar(50),
reservaciones_id_Reserva int null,
CONSTRAINT `fk_habitaciones_reservaciones1`
FOREIGN KEY (`reservaciones_id_Reserva`) REFERENCES `apphotelgte`.`reservaciones` (`id_Reserva`)
);

CREATE TABLE Ventas_Habitaciones (
    id_Venta INT PRIMARY KEY AUTO_INCREMENT,
    id_Habitacion INT,
    id_Cliente int,
    nombre VARCHAR(100),
    apellido VARCHAR(100),
    identificacion VARCHAR(50) UNIQUE,
    correo VARCHAR(100),
    check_in DATE,
    check_out DATE,
    telefono VARCHAR(20),
    direccion VARCHAR(100),
    placa VARCHAR(30),
    observacion VARCHAR(100),
    fecha_Venta DATE,
    moneda enum('CRC', 'USD') not null,
    total_Venta DECIMAL(10, 4),
    FOREIGN KEY (id_Habitacion) REFERENCES Habitaciones(id_Habitacion)
);



-- ------------------------------------------INSERTS------------------------------------------------------


-- insert en la tabla habitaciones

-- Habitacion #1
INSERT INTO apphotelgte.habitaciones(id_Habitacion,tipo_Habitacion,estado,precio_1P, precio_2P,descripcion,observacion)
values('1','Doble','Disponible','13.000','21.000','Cama Matrimonial con AC manual','baño privado');

-- Habitacion #2
INSERT INTO apphotelgte.habitaciones(id_Habitacion,tipo_Habitacion,estado,precio_1P, precio_2P,descripcion,observacion)
values('2','Doble','Disponible','13.000','19.000','Cama Matrimonial con abanico','baño privado');

-- Habitacion #3
INSERT INTO apphotelgte.habitaciones(id_Habitacion,tipo_Habitacion,estado,precio_1P, precio_2P,descripcion,observacion)
values('3','Doble','Disponible','12.000','21.000','Camarote con abanico','baño privado');

-- Habitacion #4
INSERT INTO apphotelgte.habitaciones(id_Habitacion,tipo_Habitacion,estado,precio_1P,descripcion,observacion)
values('4','Individual','Disponible','11.000','Cama Individual con abanico','baño privado abierto');

-- Habitacion #5
INSERT INTO apphotelgte.habitaciones(id_Habitacion,tipo_Habitacion,estado,precio_1P,precio_2P,descripcion,observacion)
values('5','Doble','Disponible','12.000','21.000','Camarote con abanico','baño privado');

-- Habitacion #7
INSERT INTO apphotelgte.habitaciones(id_Habitacion,tipo_Habitacion,estado,precio_1P,precio_2P,descripcion,observacion)
values('7','Doble','Disponible','15.000','25.000','Cama Matrimonial con AC control','baño privado');

-- Habitacion #8
INSERT INTO apphotelgte.habitaciones(id_Habitacion,tipo_Habitacion,estado,precio_1P,precio_2P,descripcion,observacion)
values('8','Doble','Disponible','12.000','21.000','Camarote con abanico','baño compartido');

-- Habitacion #9
INSERT INTO apphotelgte.habitaciones(id_Habitacion,tipo_Habitacion,estado,precio_1P,precio_2P,descripcion,observacion)
values('9','Doble','Disponible','12.000','21.000','Camarote con abanico','baño compartido');

-- Habitacion #10
INSERT INTO apphotelgte.habitaciones(id_Habitacion,tipo_Habitacion,estado,precio_1P, precio_2P,descripcion,observacion)
values('10','Doble','Disponible','13.000','19.000','Cama Matrimonial con abanico','baño privado');

-- Habitacion #11
INSERT INTO apphotelgte.habitaciones(id_Habitacion,tipo_Habitacion,estado,precio_1P,descripcion,observacion)
values('11','Individual','Disponible','11.000','Cama Individual con abanico','baño privado abierto');

-- Habitacion #12
INSERT INTO apphotelgte.habitaciones(id_Habitacion,tipo_Habitacion,estado,precio_1P,precio_2P,descripcion,observacion)
values('12','Doble','Disponible','12.000','21.000','Camarote con abanico','baño privado');

-- Habitacion #13
INSERT INTO apphotelgte.habitaciones(id_Habitacion,tipo_Habitacion,estado,precio_1P,descripcion,observacion)
values('13','Individual','Disponible','11.000','Camarote con abanico','baño privado abierto');

-- Habitacion #14
INSERT INTO apphotelgte.habitaciones(id_Habitacion,tipo_Habitacion,estado,precio_1P,precio_2P,descripcion,observacion)
values('14','Doble','Disponible','12.000','21.000','Camarote con abanico','baño privado');

-- Habitacion #15
INSERT INTO apphotelgte.habitaciones(id_Habitacion,tipo_Habitacion,estado,precio_1P,descripcion,observacion)
values('15','Individual','Disponible','11.000','Cama Individual con abanico','baño privado abierto');

-- Habitacion #16
INSERT INTO apphotelgte.habitaciones(id_Habitacion,tipo_Habitacion,estado,precio_1P,precio_2P,descripcion,observacion)
values('16','Doble','Disponible','12.000','21.000','Camarote con abanico','baño privado');

-- Habitacion #17
INSERT INTO apphotelgte.habitaciones(id_Habitacion,tipo_Habitacion,estado,precio_1P, precio_2P,descripcion,observacion)
values('17','Doble','Disponible','13.000','19.000','Cama Matrimonial con abanico','baño privado');

-- Habitacion #18
INSERT INTO apphotelgte.habitaciones(id_Habitacion,tipo_Habitacion,estado,precio_1P,precio_2P,descripcion,observacion)
values('18','Doble','Disponible','15.000','25.000','Cama Matrimonial con AC control','baño privado');

-- Habitacion #19
INSERT INTO apphotelgte.habitaciones(id_Habitacion,tipo_Habitacion,estado,precio_1P,precio_2P,descripcion,observacion)
values('19','Doble','Disponible','15.000','25.000','Dos camas individuales con AC control','baño privado');

-- Habitacion #20
INSERT INTO apphotelgte.habitaciones(id_Habitacion,tipo_Habitacion,estado,precio_1P,precio_2P,precio_3P,descripcion,observacion)
values('20','Triple','Disponible','15.000','25.000','37.000','Cama Matrimonial e Individual con AC control','baño privado');

-- Habitacion #21
INSERT INTO apphotelgte.habitaciones(id_Habitacion,tipo_Habitacion,estado,precio_1P,precio_2P,descripcion,observacion)
values('21','Doble','Disponible','15.000','25.000','Cama Matrimonial con AC control','baño privado');

-- Habitacion #22
INSERT INTO apphotelgte.habitaciones(id_Habitacion,tipo_Habitacion,estado,precio_1P,precio_2P,descripcion,observacion)
values('22','Doble','Disponible','12.000','21.000','Camarote con abanico','baño privado');

-- Habitacion #23
INSERT INTO apphotelgte.habitaciones(id_Habitacion,tipo_Habitacion,estado,precio_1P,precio_2P,descripcion,observacion)
values('23','Doble','Disponible','12.000','21.000','Camarote con abanico','baño privado');

-- Habitacion #24
INSERT INTO apphotelgte.habitaciones(id_Habitacion,tipo_Habitacion,estado,precio_1P,precio_2P,descripcion,observacion)
values('24','Doble','Disponible','12.000','21.000','Camarote con abanico','baño privado');

-- Habitacion #25
INSERT INTO apphotelgte.habitaciones(id_Habitacion,tipo_Habitacion,estado,precio_1P,precio_2P,descripcion,observacion)
values('25','Doble','Disponible','12.000','21.000','Camarote con abanico','baño privado');

-- Habitacion #26
INSERT INTO apphotelgte.habitaciones(id_Habitacion,tipo_Habitacion,estado,precio_1P,precio_2P,descripcion,observacion)
values('26','Doble','Disponible','12.000','21.000','Camarote con abanico','baño privado');

-- Habitacion #27
INSERT INTO apphotelgte.habitaciones(id_Habitacion,tipo_Habitacion,estado,precio_1P,precio_2P,descripcion,observacion)
values('27','Doble','Disponible','12.000','21.000','Camarote con abanico','baño privado');

-- Habitacion #28
INSERT INTO apphotelgte.habitaciones(id_Habitacion,tipo_Habitacion,estado,precio_1P,precio_2P,precio_3P,descripcion,observacion)
values('28','Triple','Disponible','13.000','21.000','31.000','Cama Matrimonial e Individual con abanico','baño privado');

-- Habitacion #29
INSERT INTO apphotelgte.habitaciones(id_Habitacion,tipo_Habitacion,estado,precio_1P,precio_2P,precio_3P,precio_4P,precio_5P,descripcion,observacion)
values('29','quíntuple','Disponible','13.000','21.000','31.000','41.000','51.000','Cama Individual con dos camarotes y abanico','baño privado');


-- -------------------------------Procedimientos almacenados -----------------------------------

-- esta procedimiento se encarga de replicar los datos de la tabla venta_habitacion a la tabla cliente

DELIMITER //

CREATE PROCEDURE insert_venta_habitacion(
    IN id_Habitacion_param INT,
    IN nombre_param VARCHAR(100),
    IN apellido_param VARCHAR(100),
    IN identificacion_param VARCHAR(50),
    IN correo_param VARCHAR(100),
    IN check_in_param DATE,
    IN check_out_param DATE,
    IN telefono_param VARCHAR(20),
    IN direccion_param VARCHAR(100),
    IN placa_param VARCHAR(30),
    IN observacion_param VARCHAR(100),
    IN moneda_param enum('CRC','USD'),
    IN fecha_Venta_param DATE,
    IN total_Venta_param DECIMAL(10, 4)
)
BEGIN
    DECLARE cliente_id INT;
    
    -- Insertar un nuevo cliente si aún no existe
    INSERT IGNORE INTO Cliente (id_habitacion,nombre, apellido, identificacion, correo,check_in,check_out,observacion,telefono, direccion, placa)
    VALUES (id_Habitacion_param,nombre_param, apellido_param, identificacion_param, correo_param,check_in_param,check_out_param,observacion_param,telefono_param, direccion_param, placa_param);

    -- Obtener el ID del cliente (ya sea existente o recién insertado)
    SELECT id_Cliente INTO cliente_id 
    FROM Cliente 
    WHERE identificacion = identificacion_param
    LIMIT 1;

    -- Insertar en la tabla Ventas_Habitaciones
    INSERT INTO Ventas_Habitaciones (id_Habitacion, id_Cliente, nombre, apellido, identificacion, correo, check_in, check_out, telefono, direccion, placa, observacion, fecha_Venta,moneda, total_Venta)
    VALUES (id_Habitacion_param, cliente_id, nombre_param, apellido_param, identificacion_param, correo_param, check_in_param, check_out_param, telefono_param, direccion_param, placa_param, observacion_param, fecha_Venta_param,moneda_param, total_Venta_param);
END //

DELIMITER ;


CALL insert_venta_habitacion(
    22,'Juan','Perez','123456789','juan@example.com','2024-02-01','2024-02-05','1234567890','123 Main St','ABC123','Comentario','CRC','2024-02-05',12.000
);

CALL insert_venta_habitacion(
    18,'María','Ruíz','503390532','MariaR@example.com','2024-02-01','2024-02-05','8888-8888','Liberia','AJH225','Comentario','CRC','2024-02-05',21.000
);

CALL insert_venta_habitacion(
    3,'Josh','Juarez','705540983','josh@example.com','2024-02-01','2024-02-05','1234567890','123 Main St','ABC123','Comentario','USD','2024-02-05',30
);

CALL insert_venta_habitacion(
    14,'Lucía','Alvarez','103340532','LuciA@example.com','2024-02-01','2024-02-05','8888-8888','Liberia','AJH225','Comentario','USD','2024-02-05',24
);








-- -------------------------------FUNCIONES-----------------------------------



-- Esta función se encarga de sumar los ingresos semanales y mensuales de colones y dolares por separado 

DELIMITER //

CREATE FUNCTION ObtenerTotalIngresosSemanalesColones()
RETURNS DECIMAL(10, 4) DETERMINISTIC
BEGIN
    DECLARE total DECIMAL(10, 4);

    -- Calcula la suma de ingresos en colones para la última semana
    SELECT SUM(total_Venta) INTO total
    FROM Ventas_Habitaciones
    WHERE Moneda = 'CRC' AND fecha_Venta >= CURDATE() - INTERVAL 1 WEEK;

    RETURN total;
END //

CREATE FUNCTION ObtenerTotalIngresosMensualesColones()
RETURNS DECIMAL(10, 4) DETERMINISTIC
BEGIN
    DECLARE total DECIMAL(10, 4);

    -- Calcula la suma de ingresos en colones para el mes actual
    SELECT SUM(total_Venta) INTO total
    FROM Ventas_Habitaciones
    WHERE Moneda = 'CRC' AND MONTH(fecha_Venta) = MONTH(CURDATE());

    RETURN total;
END //

CREATE FUNCTION ObtenerTotalIngresosSemanalesDolares()
RETURNS DECIMAL(10, 2) DETERMINISTIC
BEGIN
    DECLARE total DECIMAL(10, 2);

    -- Calcula la suma de ingresos en dólares para la última semana
    SELECT SUM(total_Venta) INTO total
    FROM Ventas_Habitaciones
    WHERE Moneda = 'USD' AND fecha_Venta >= CURDATE() - INTERVAL 1 WEEK;

    RETURN total;
END //

CREATE FUNCTION ObtenerTotalIngresosMensualesDolares()
RETURNS DECIMAL(10, 2) DETERMINISTIC
BEGIN
    DECLARE total DECIMAL(10, 2);

    -- Calcula la suma de ingresos en dólares para el mes actual
    SELECT SUM(total_Venta) INTO total
    FROM Ventas_Habitaciones
    WHERE Moneda = 'USD' AND MONTH(fecha_Venta) = MONTH(CURDATE());

    RETURN total;
END //

DELIMITER ;
