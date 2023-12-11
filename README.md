Taller de productividad basada en herramientas tecnologicas

Descripcion

Es una Aplicación Web integrada con una base de datos que pueda almacenar toda la información pertinente de los Datos del Proveedor el cuál contiene una lista de los proveedores agregados en la base de datos, un botón para agregar más proveedores, editar la información existente de un proveedor, así como un botón de remover.También contiene el log in para que el usuario pueda iniciar sesión para poder acceder a la información de los proveedores y hacer los cambios correspondientes.

Problema Identificado

La principal problemática que tienen, como se mencionó en la justificación, es que muchas de las herramientas que utilizan para almacenar la información es muy “ineficiente”. Por ejemplo, al tener una cartera de clientes muy amplia, requieren tener la información de contacto a la mano en caso de que se requiera. La forma en la que actualmente almacenan dicha información es a través de Whatsapp y Google Sheets, pero al ser una cartera muy grande, pierden mucho tiempo para buscar la información necesaria. La información que requieren guardar es: Dirección del local, nombre de la empresa, nombre del contacto de la empresa, correo electrónico, teléfono celular y “zonas” en donde ofrezcan el servicio dado. Al utilizar whatsapp se pierde mucha información ya que sólo se almacena de manera correcta el número de teléfono y el nombre, pero para la otra información la tienen que tener almacenada en el Excel.

Tabla de Contenidos

Deployment Descriptor: Actividad_3_Taller
JAX-WS Web Services
Java Resources
  src
    Packages
      - controlados
      - dao
      - datos
      - interfaz
      - modelo
      - vista
      - inicio
    Archivos
      - Controlador.java
      - daoProveedor.java
      - MostrarDatos.java
      - CRUD.java
      - Proveedor.java
      - InicioS.java
    Libraries
      - JRE System Library
      - Referenced Libraries
      - Server Runtime (Apache Tomcat 8.0.53)
      - Web App Libraries
  WebApp
    META-INF
      MANIFEST.MF
    WEB-INF
      lib
        jsp.api-2.2.jar
        jstl-1.2 jar
        mysql-connector-j-8.2.0 jar
        servlet-api-2.5 jar
  Vistas
    InicioSesion.jsp
    add.jsp
    edit.jsp
    index.jsp
    Interfaz Proveedor.jsp
    listar.jsp

Requerimientos

- Conexión a base de datos SQL
- Visualización de la información
- Editar Información
- Agregar Información
- Remover Información
- Iniciar Sesión
- Guardar cambios al editar

Diseño

- Interfaz inicio sesión
- Visualización de la tabla con la lista de los proveedores
- Interfaz para agregar nuevo proveedor
- Interfaz para editar proveedor existente
- Interfaz de eliminación correcta del proveedor

Versión de Java

Utilizar JDK 11 Y Java 8

Base de Datos

MySQL

Instalación

- Descargar el proyecto del repositorio
- Desconprimir el archivo ZIP con el proyecto completo
- Abrir el proyecto
- Conectar con base de datos MYSQL
- Integrar el Servidor Apache Tomcat
- Ejecutar

Configuración

- Instalar versión de Java 8
- Instalar JDK 11
- Instalar Eclipse o algún otro IDE
- Configurar las 3 herramientas anteriores
- Conectar la base de datos

Uso

El software es para uso exlusivo de la empresa Reservas Events, la cual sólo podrá accesar mediante el usuario y contraseña que se les proporcionará para su ingreso.

Contribución

Abrir el repositorio
Link del repositorio: https://github.com/MagicTolentino/Actividad3_Taller
En el branch main podremos encontrar el archivo zip con el proyecto beta 
Tendremos la opción de clonar el repositorio o descargarlo

RoadMap

Conforme el equipo de trabajo vaya utilizando esta nueva herramienta para almacenar la información, va a ser más fácil la búsqueda de los proveedores existentes

Creditos

Desarrollado por: Miguel Garcia 02888663
      


