## Alura Back-end

### Descripción
Este proyecto tiene como objetivo desarrollar un Catálogo de Libros que ofrezca una interfaz de usuario basada en consola, proporcionando al menos 5 opciones de interacción. Los libros se buscarán a través de la API [Gutendex](https://gutendex.com), una API web JSON del proyecto Gutenberg.

### Tecnologías utilizadas
- Java JDK: versión 17 en adelante
- Maven: versión 4 en adelante
- Spring: versión 3.3.1 - https://start.spring.io/
- Postgres: versión 16 en adelante
- IDE (Entorno de desarrollo integrado): IntelliJ IDEA (opcional)

### Configuración del proyecto
Al crear el proyecto en Spring Initializr, se deben utilizar las siguientes configuraciones:
- Java (versión 17 en adelante)
- Maven (Initializr utiliza la versión 4)
- Spring Boot (versión 3.3.1)
- Proyecto en JAR

Las dependencias a agregar al crear el proyecto en Spring Initializr son:
- Spring Data JPA
- Postgres Driver

### Cómo probar esta API
1. Modifica el archivo `application.properties` ubicado en `./LiterAluraChallenge/src/main/resources/application.properties`, reemplazando las variables `DB_NAME`, `DB_USER` y `DB_PASSWORD` con los datos de tu base de datos Postgres o declara las variables de entorno en tu sistema operativo.
2. Ejecuta el archivo `LiterAluraChallengeApplication.java`.

### Funcionalidades
El programa ofrece las siguientes opciones en el menú principal:

1. **Buscar libro por título**: Busca un libro en la API Gutendex, lo guarda en la base de datos si no está registrado, y muestra la información del libro.
2. **Listar libros registrados**: Muestra la lista de libros guardados en la base de datos, ordenados alfabéticamente.
3. **Listar autores registrados**: Muestra la lista de autores registrados en la base de datos, ordenados alfabéticamente.
4. **Listar autores vivos en un año**: Muestra la lista de autores vivos en el año ingresado por el usuario.
5. **Listar libros por idioma**: Muestra la lista de libros filtrados por el idioma seleccionado por el usuario.
6. **Ver estadísticas**: Obtiene el promedio de descargas, el total de descargas del libro más y menos descargado, y el total de libros en la base de datos.
7. **Top 10 libros más descargados**: Muestra los 10 libros más descargados en la base de datos.
8. **Buscar autor por nombre**: Solicita al usuario que ingrese el nombre del autor a buscar, realiza una consulta a la base de datos para encontrar los autores que coincidan con el nombre ingresado, y muestra la información del autor seleccionado.
9. **Salir**: Sale del programa.

### Menú

Bienvenido al librero (LiterAluraChallenge)
1. Buscar libro por título
2. Listar libros registrados
3. Listar autores registrados
4. Listar autores vivos año
5. Listar libros por idioma
6. Ver estadísticas
7. Top 10 libros mas descargados
8. Buscar autor por nombre
9. Salir


   Elige una opción (1 - 9):