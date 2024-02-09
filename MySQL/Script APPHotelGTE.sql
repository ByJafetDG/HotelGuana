create schema apphotelgte;
use apphotelgte;

-- --------------------------------Creacion de tablas--------------------------------------

create table Sucursal(
id_Sucursal int primary key,
cedula_Juridica varchar(30),
nombre varchar(100),
direccion varchar(100),
telefono varchar(12),
correo varchar(100)
);

create table Usuario(
id_Usuario int primary key, 
nombre varchar(100),
apellidos varchar(100),
correo varchar(100),
contrasena varbinary(100),
rol enum('Admin','Empleado')not null,
sucursal_id_Sucursal int not null,
CONSTRAINT `fk_usuario_sucursal1`
FOREIGN KEY (`sucursal_id_Sucursal`)REFERENCES `apphotelgte`.`sucursal` (`id_Sucursal`)
);


create table Empleado(
id_Empleado int primary key auto_increment,
nombre varchar(100),
apellidos varchar(100),
correo varchar(100),
telefono varchar(12),
direccion varchar(100),
cargo varchar(50),
empleado_id_Sucursal int not null,
FOREIGN KEY (empleado_id_Sucursal) REFERENCES Sucursal(id_Sucursal));


create table Cliente(
id_Cliente int primary key AUTO_INCREMENT,
id_Habitacion int,
nombre varchar(100),
apellidos varchar(100),
identificacion varchar(50) unique,
correo varchar(100),
check_in date,
check_out date,
historial enum('Bueno','Regular','Vetado') not null,
telefono varchar(20),
direccion varchar(100),
placa varchar(30),
observacion varchar(100) not null,
sucursal_id_Sucursal int null,
CONSTRAINT `fk_cliente_sucursal1`
FOREIGN KEY (`sucursal_id_Sucursal`) REFERENCES `apphotelgte`.`sucursal` (`id_Sucursal`)
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
observacion varchar(100) not null,
habitacion_id_cliente int null,
CONSTRAINT `fk_habitaciones_cliente1`
FOREIGN KEY (`habitacion_id_cliente`) REFERENCES `apphotelgte`.`cliente` (`id_cliente`)
);

CREATE TABLE Reservaciones (
id_Reserva INT PRIMARY KEY AUTO_INCREMENT,
nombre_Cliente VARCHAR(100),
telefono_Cliente VARCHAR(12), 
check_in DATE,
check_out DATE,
estado ENUM('Cancelada','Confirmada','Pendiente') NOT NULL,
reserva_id_habitacion INT NULL,
CONSTRAINT fk_reservaciones_habitaciones1 FOREIGN KEY (reserva_id_habitacion) REFERENCES Habitaciones (id_Habitacion)
);



CREATE TABLE Ventas_Habitaciones (
    id_Venta INT PRIMARY KEY AUTO_INCREMENT,
    id_Habitacion INT,
    id_Cliente int,
    nombre VARCHAR(100),
    apellidos VARCHAR(100),
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




-- ---------Insert a la tabla Surcursal -----------------------------------


Insert into Sucursal(id_Sucursal,cedula_Juridica, nombre, direccion, telefono, correo)
values(1, 3101848980, 'Hotel Guanacaste', 'Liberia centro continuo al rest. Bagatzi', '2666-0085', 'guanacaste.hotel@gmail.com');






-- -------------------------------Procedimientos almacenados -----------------------------------

-- este procedimiento se encarga de replicar los datos de la tabla venta_habitacion a la tabla cliente

DELIMITER //

CREATE PROCEDURE insert_venta_habitacion(
    IN id_Habitacion_param INT,
    IN nombre_param VARCHAR(100),
    IN apellidos_param VARCHAR(100),
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
    INSERT IGNORE INTO Cliente (id_habitacion,nombre, apellidos, identificacion, correo,check_in,check_out,observacion,telefono, direccion, placa)
    VALUES (id_Habitacion_param,nombre_param, apellidos_param, identificacion_param, correo_param,check_in_param,check_out_param,observacion_param,telefono_param, direccion_param, placa_param);

    -- Obtener el ID del cliente (ya sea existente o recién insertado)
    SELECT id_Cliente INTO cliente_id 
    FROM Cliente 
    WHERE identificacion = identificacion_param
    LIMIT 1;

    -- Insertar en la tabla Ventas_Habitaciones
    INSERT INTO Ventas_Habitaciones (id_Habitacion, id_Cliente, nombre, apellidos, identificacion, correo, check_in, check_out, telefono, direccion, placa, observacion, fecha_Venta,moneda, total_Venta)
    VALUES (id_Habitacion_param, cliente_id, nombre_param, apellidos_param, identificacion_param, correo_param, check_in_param, check_out_param, telefono_param, direccion_param, placa_param, observacion_param, fecha_Venta_param,moneda_param, total_Venta_param);
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




-- Este procedimiento se encarga de hacer inserts a la tabla de Reservaciones
DELIMITER //

CREATE PROCEDURE InsertarReservacion (
    IN p_nombre_cliente VARCHAR(100),
    IN p_telefono_cliente VARCHAR(12),
    IN p_check_in DATE,
    IN p_check_out DATE,
    IN p_estado ENUM('Cancelada','Confirmada','Pendiente'),
    IN p_reserva_id_habitacion INT
)
BEGIN
    DECLARE habitacion_existente INT;

    -- Verificar si la habitación existe
    SELECT COUNT(*) INTO habitacion_existente FROM Habitaciones WHERE id_Habitacion = p_reserva_id_habitacion;

    -- Si la habitación existe, insertar la reserva
    IF habitacion_existente > 0 THEN
        INSERT INTO Reservaciones (
            nombre_Cliente,
            telefono_Cliente,
            check_in,
            check_out,
            estado,
            reserva_id_habitacion
        ) VALUES (
            p_nombre_cliente,
            p_telefono_cliente,
            p_check_in,
            p_check_out,
            p_estado,
            p_reserva_id_habitacion
        );
    ELSE
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'La habitación especificada no existe';
    END IF;
END //

DELIMITER ;


-- Llamado 1
CALL InsertarReservacion('Juan Perez', '1234567890', '2024-03-01', '2024-03-05', 'Confirmada', 1);

-- Llamado 2
CALL InsertarReservacion('Maria Garcia', '9876543210', '2024-04-15', '2024-04-20', 'Pendiente', 2);

-- Llamado 3
CALL InsertarReservacion('Pedro Lopez', '5556667777', '2024-05-10', '2024-05-15', 'Cancelada', 3);

-- Llamado 4
CALL InsertarReservacion('Ana Martinez', '3332221111', '2024-06-20', '2024-06-25', 'Confirmada', 4);

-- Llamado 5
CALL InsertarReservacion('Laura Sanchez', '4443332222', '2024-07-05', '2024-07-10', 'Pendiente', 5);

-- Llamado 5
CALL InsertarReservacion('Laura Sanchez', '4443332222', '2024-07-05', '2024-07-10', 'Pendiente', 17);


-- Este procedimiento se encarga de hacer inserts a la tabla de Reservaciones

DELIMITER //

CREATE PROCEDURE InsertarEmpleado(
    IN p_id_Empleado INT,
    IN p_nombre VARCHAR(100),
    IN p_apellidos VARCHAR(100),
    IN p_correo VARCHAR(100),
    IN p_telefono VARCHAR(12),
    IN p_direccion VARCHAR(100),
    IN p_cargo VARCHAR(50),
    IN p_empleado_id_Sucursal INT
)
BEGIN
    INSERT INTO Empleado (id_Empleado, nombre, apellidos, correo, telefono, direccion, cargo, empleado_id_Sucursal)
    VALUES (p_id_Empleado, p_nombre, p_apellidos, p_correo, p_telefono, p_direccion, p_cargo, p_empleado_id_Sucursal);
END //

DELIMITER ;


-- Call 1
CALL InsertarEmpleado(1,'Christian', 'Perez', 'juan@example.com', '1234567890', 'Calle Principal 123', 'Recepcionista', 1);

-- Call 2
CALL InsertarEmpleado(2,'Raquel ', 'Wellls', 'maria@example.com', '0987654321', 'Avenida Central 456', 'Recepcionista', 1);

-- Call 3
CALL InsertarEmpleado(3,'Raquel', 'Rueda', 'Raquel@example.com', '9876543210', 'Calle Secundaria 789', 'Recepcionista', 1);



-- Este procedimiento se encarga de hacer inserts a la tabla de Usuarios

DELIMITER //

CREATE PROCEDURE InsertarUsuario(
    IN p_id_Usuario INT,
    IN p_nombre VARCHAR(100),
    IN p_apellidos VARCHAR(100),
    IN p_correo VARCHAR(100),
    IN p_contrasena VARBINARY(100),
    IN p_rol ENUM('Admin', 'Empleado'),
    IN p_sucursal_id_Sucursal INT
)
BEGIN
    INSERT INTO Usuario (id_Usuario, nombre, apellidos, correo, contrasena, rol, sucursal_id_Sucursal)
    VALUES (p_id_Usuario, p_nombre, p_apellidos, p_correo, p_contrasena, p_rol, p_sucursal_id_Sucursal);
END //

DELIMITER ;


-- Call 1
CALL InsertarUsuario(1, 'John', 'Doe', 'john@example.com', UNHEX(SHA2('password123', 256)), 'Admin', 1);

-- Call 2
CALL InsertarUsuario(2, 'Jane', 'Smith', 'jane@example.com', UNHEX(SHA2('securepassword', 256)), 'Empleado', 1);

-- Call 3
CALL InsertarUsuario(3, 'Alice', 'Johnson', 'alice@example.com', UNHEX(SHA2('strongpassword', 256)), 'Empleado', 1);


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
