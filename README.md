# Cuentabank

SWEurekaBank es un proyecto de gestión de cuentas que permite realizar operaciones básicas de manejo de datos en una base de datos MySQL.

## Requisitos

- Java 8 o superior
- MySQL
- Maven (opcional, si usas Maven para la gestión de dependencias)

## Instalación

1. **Clonar el repositorio**:
   ```bash
   git clone https://github.com/crwmolada/eurekabank-crud.git
   cd cuentabank
   cd certus
   ```

2. **Configurar la base de datos**:
   - Asegúrate de tener MySQL instalado y en funcionamiento.
   - Crea una base de datos llamada `eurekabank`.

3. **Configurar las credenciales**:
   - Edita la clase `ConexionDB.java` para ajustar las credenciales de la base de datos si es necesario:
     ```java
     private static final String usuario = "root";
     private static final String password = "";
     private static final String url = "jdbc:mysql://localhost:3306/eurekabank";
     ```

4. **Compilar el proyecto** (si usas Maven):
   ```bash
   mvn clean install
   ```

## Uso

- Para establecer una conexión a la base de datos, utiliza el método `.getDeclaredConstructor().newInstance()` de la clase `ConexionDB`.
- Asegúrate de cerrar las conexiones y otros recursos utilizando los métodos proporcionados para evitar fugas de memoria.

## Base de datos

https://pastebin.com/PeimrXDt
