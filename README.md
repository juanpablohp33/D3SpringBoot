# D3SpringBoot

# Pre Requisito

1. Instalar maven.

    Linux:  sudo apt install maven

2.Instalar MySql, los comandos en Linux son:
    
    sudo apt update
    sudo apt install mysql-server
    

# FRONT END
1. UTILIZAR GOOGLE CHROME.
2. INSTALAR CORS.
3. INSTALAR D3.
4. Darle doble click a los archivos que se encuentran en la siguiente ruta: "$HOME/PEC3/D3SpringBoot/FrontEnd"
5. El nombre de los archivos son:
        index.html
        index_barras.html

# BASE DE DATOS
1. ingresar con el siguiente comando linux:

    sudo mysql

2. Depués configurar el password de la base de datos Mysql

    mysql> ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'pr4ct1c4';
    mysql> FLUSH PRIVILEGES;
    
3. Para validar el cambio ejecutar el siguiente comando:

    mysql -u root -p

4. Después mostrará que se ingrese el password.
5. Crear la base de datos ebenezer, con los siguientes comandos linux:
    CREATE DATABASE ebenezer;
6. Ejecutar el comando, para seleccionar la base de datos creada en el punto anterior:

    use ebenezer;

7. Ejecutar el script que se encuentra en la ruta $HOME/PEC3/D3SpringBoot/BackEnd/Datos/ebenezer_articles.sql
8. También se puede realizar en consola, ejecutando lo siguiente:
    
    mysql> CREATE TABLE `articles` (
  `article_id` int(11) NOT NULL DEFAULT '10',
  `title` varchar(200) NOT NULL,
  `category` varchar(200) NOT NULL,
  `monto` int(11) NOT NULL,
  `vistos` int(11) NOT NULL,
  PRIMARY KEY (`article_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

9. Para verificar la creación de la tabla, ejecutar el siguiente comando:

        msql> show tables;


# BACK END
I. Si solo desea correr el proyecto se debe ejecutar los siguientes pasos:

    1. Ingresar a la ruta "$HOME/PEC3/D3SpringBoot/BackEnd/venta/target":
    2. Ejecutar el comando: "java -jar ventas-0.0.1-SNAPSHOT.jar"
    3. La URL es la siguiente: "http://localhost:8080/user"

II.
1. Crear una carpeta PCE3.
    
    Linux:
            mkdir PEC3

2. Ingresar a la carpeta PEC3:

    cd PEC3
    
    La ruta de nuestra zona de trabajo sería $HOME/PEC3
    
3. Dentro de la carpeta PEC3, clonar el proyecto con los siguientes comandos:
  
    git clone https://github.com/juanpablohp33/D3SpringBoot.git
      
4. Dentro de la carpeta PEC3, se mostrará la carpeta D3SpringBoot.
5. Ingresar a la carpeta D3SpringBoot.
      cd D3SpringBoot
      La ruta de trabajo sería $HOME/PEC3/D3SpringBoot
      
6. Dentro de la carpeta D3SpringBoot mostrará las siguientes carpetas:
      
      BackEnd
      FrontEnd

7. Ingresar a la carpeta BackEnd.

      cd BackEnd
      
8. Ingresar a la carpeta venta y ejecutar el siguientes comando (ruta:$HOME/PEC3/D3SpringBoot/BackEnd/venta):
    
    mvn clean install
    
9. Ingresar a la carpeta target (ruta:$HOME/PEC3/D3SpringBoot/BackEnd/venta/target)
    
10. Ejecutar el comando java -jar ventas-0.0.1-SNAPSHOT.jar.

11. La URL es la siguiente: "http://localhost:8080/user"
