# Challenge ONE | Java | Back-end | Hotel Alura

---
<div align="center">
<h1>HOTEL ALURA</h1> 
  
![Ha-100px](https://user-images.githubusercontent.com/119555055/233255693-6f24393d-cd0d-41fe-9eae-5e63b0eeaa4b.png)

</div>

<hr>

## Tópicos 

- [Descripción del proyecto](#descripción-del-proyecto)

- [Funcionalidades](#funcionalidades)


## Descripción del proyecto 

<p align="justify">
Poniendo en practica nuestro conocieminto del curso de formación Java del programa Oracle Next Education ONE.<br><br>
El Hotel Alura conocido por su espectaculares instalaciones y paquetes promocionales para Desarrolladores de Software está teniendo problemas para llevar el control de las reservaciones hechas por sus clientes, por eso solicitan nuestra ayuda para desarrollar un sistema de reserva que contenga: 
</p>

* Sistema de autenticación de usuario para que solo usuarios pertenecientes al hotel consigan acceder al sistema.
* Permitir crear, editar y eliminar una reserva para los clientes.
* Buscar en la base de datos todas las informaciones tanto de los clientes como de las reservas.
* Registrar, editar y eliminar datos de los huéspedes.
* Calcular el valor de la reserva en base a la cantidad de días de la reserva y a una tasa diaria que puede ser asignada por ti y en la moneda local de tu país, por ejemplo, si tenemos una reserva de 3 días y el valor de nuestra diaria son 20$ debemos multiplicar esos 3 días por el valor de la diaria, lo que serían 60$, todo esto deberá ser hecho automáticamente y mostrado al usuario antes de guardar la reserva.
* Base de datos para almacenar todos los datos pedidos anteriormente.

## Funcionalidades
<p align="justify"><strong>Funcionalidad 1: MENÚ PRINCIPAL DE LA APLICACIÓN</strong> <br>
  
![1-principal](https://user-images.githubusercontent.com/119555055/233256088-549e169e-c718-43b5-9adf-e71b12cdb14e.png)

<p align="justify">El menú principal de nuestra aplicación es nuestra presentación, podemos ver que contiene diferentes elementos:
  
* Imagen de wallpaper
  
* Logo del Hotel
  
* Botón Login que al ser clickado debe llevar a la ventana de iniciar sesión
  
* Botón salir que debe preguntar al usuario si realmente desea salir de la aplicación..
  
   </p>
</p>
<br>
<p align="justify"><strong>Funcionalidad 2: LOGIN</strong> <br>
  
![LOGIN](https://user-images.githubusercontent.com/119555055/233256226-081fdf9f-2b22-4e99-9abd-139d8b31c341.png)

<p align="justify">Esta ventana debe permitir al usuario ingresar su usuario y contraseña.
Por detrás de la cortina debemos verificar si los datos ingresados son correctos o incorrectos y notificar al usuario de este estatus, por ejemplo si los datos son incorrectos debe ser mostrado una mensaje al usuario diciendo "Usuario y Contraseña inválidos".
   </p>
</p>
<br>
<p align="justify"><strong>Funcionalidad 3: VENTA DE MENÚ USUARIO</strong> <br>
  
![3 menuUsuario](https://user-images.githubusercontent.com/119555055/233256628-9a3d5633-1721-4a0e-9eca-392bf7a5a49c.png)

   <p align="justify">En esta ventana se presentarán las opciones cuando el usuario autenticado está dentro del sistema, tienes las siguientes opciones:
     
* Reservar: Deve llevar a la ventana de Reservas
     
* Búsqueda: Deve llevar a la ventana de Sistema de búsqueda.
     
* Salir del Sistema: Deve llevar a la ventana de Login
     
   </p>
</p>
<br>
<p align="justify"><strong>Funcionalidad 4: VENTANA REGISTRO DE RESERVA</strong> <br>
  
![4 reservas](https://user-images.githubusercontent.com/119555055/233257000-5767da19-ece0-438c-bf8d-3ad53730db00.png)

 <p align="justify">La ventana de Reservas debe permitir al usuário registrar los siguientes datos:
     
* Día de Entrada
* Día de Salida
* Valor de la reserva, que será calculado en base a un valor de diaria fijo que tú mismo podrás elegir.
* Forma de Pago donde el usuário podrá elegir entre:
 -Tarjeta de crédito
 -Tarjeta de débito
 -Dinero en efectivo
 -Botón continuar.
   </p>
</p>
<br>
<p align="justify"><strong>Funcionalidad 5: VENTANA DE REGISTRO DE HUÉSPED</strong> <br>
  
![5 registro-huesped](https://user-images.githubusercontent.com/119555055/233257559-236d68a0-71fc-46de-bf99-2ed0dd16b20e.png)

 <p align="justify">Esta sección tendrá los datos personales de los huéspedes con los siguientes campos:
        
* Nombre
* Apellido
* Fecha de Nacimiento
* Nacionalidad
* Teléfono
* Número de reserva que fue generada anteriormente.
Se notificara al usuário tanto para registro satisfactorio de los datos como si ocurrió algún error.
      </p>
</p>
<br>
<br>
<p align="justify"><strong>Funcionalidad 6: SISTEMA DE BÚSQUEDA</strong> <br>
  
![6 busqueda](https://user-images.githubusercontent.com/119555055/233257816-1b734bed-be51-4921-9ca5-77a3c0207925.png)

 <p align="justify">Esta sección debe permitir al usuario buscar las informaciones que están dentro de nuestra base de datos.
   
Existen dos critério de búsqueda:
   
- Apellido
   
- Número de Reserva
   

Estos datos serán presentado a través de dos tablas, al seleccionar cualquier registro el usuario podrá, editar o eliminar dicho registro.
      </p>
</p>
<br>
<p align="justify"><strong>Funcionalidad 7: EDITAR Y ELIMINAR </strong> <br>
  
<p align="justify">El usuario podrá editar datos de reserva y datos del Huésped y también eliminar datos de reserva y de Huésped
      </p>
</p>
<br>
## 🖥️ Tecnologías Utilizadas:

- Java
- Eclipse
- Biblioteca JCalendar
- MySql
- Plugin WindowBuilder </br>


