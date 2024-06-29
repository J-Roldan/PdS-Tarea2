# PdS-Tarea2

## Diseño del programa

Para el diseño del programa se dividió en 5 clases principales, 3 destinadas a ser estructuras de datos y 2 para la 
lógica del programa.

### Clases de estructuras de datos
- **`Room`**: Representa una sala, contiene la información de la sala, tal como su id, nombre, ubicación y 
disponibilidad, además de métodos para obtener y modificar esta información.
- **`Reservation`**: Representa una reserva, contiene la información de la reserva, tal como su id, id de la sala, id 
del usuario, fecha y descripción, además de métodos para obtener y modificar esta información.
- **`User`**: Representa un usuario, contiene la información del usuario, tal como su id, nombre, departamento y 
descripción, además de métodos para obtener y modificar esta información.

### Clases de lógica
- **`CRUD`**: Contiene los métodos para crear, leer, actualizar y eliminar las salas, reservas y usuarios, además de 
verificar escenarios de error.
- **`Main`**: Contiene el método main, donde se ejecuta el programa, además de los métodos para mostrar los menús y 
llamar al CRUD

## Uso del programa
Para el correcto uso del programa, se debe ejecutar el archivo `Main.java`, el cual mostrará un menú con las opciones y
seguir las instrucciones que se muestran en pantalla. IMPORTANTE SOLO SELECCIONAR LAS OPCIONES QUE SE MUESTRAN EN 
PANTALLA.

## Resultados de las pruebas
Se realizaron pruebas unitarias para cada uno de los métodos de la clase `Room`, `Reservation` y `User`, en las cuales 
todas las pruebas pasaron exitosamente. Además, se realizaron pruebas de integración para los métodos de la clase `CRUD`,
en las cuales todas las pruebas pasaron exitosamente.