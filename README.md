# LABORATORIO 3 - PBT
## CLASES DE EQUIVALENCIA
---
## CREAR UN PROYECTO CON MAVEN

Creamos un nuevo proyecto con los valores dados en el enunciado del laboratorio:

```
mvn archetype:generate -DgroupId=edu.eci.cvds -DartifactId=ClasesEquivalencia -Dpackage=edu.eci.cvds.tdd -DarchetypeArtifactId=maven-archetype-quickstart
```
![image](https://user-images.githubusercontent.com/63562181/220468826-b9e985ff-36f6-45ed-b81e-117836b48486.png)

![image](https://user-images.githubusercontent.com/63562181/220468961-ca8b6402-b26d-4ff1-afeb-104b7f596fda.png)

### Actualizar y crear dependencias en el proyecto

Ingresamos al repositorio central de maven, buscamos el artefacto JUnit y agregamos la dependencia en el archivo pom.xml. Ademas, cambiamos la versión del compilador de Java a la versión 8.

![image](https://user-images.githubusercontent.com/63562181/221335317-8fde1bc8-f70f-4f3c-a27b-382d5d6ac995.png)

### COMPILAR Y EJECUTAR

Para compilar ejecutamos el comando `mvn compile`

![image](https://user-images.githubusercontent.com/63562181/221335209-a734a6a2-7573-4e34-a583-54f6e1553358.png)

Para ejecutar las pruebas unitarias ejecutamos el comando `mvn test`

![image](https://user-images.githubusercontent.com/63562181/221335617-fb06a274-14e0-4169-8e9f-0b230ba0555a.png)

El comando para ejecutar la clase AppTest es `mvn -Dtest=edu.eci.cvds.tdd.AppTest test`

![image](https://user-images.githubusercontent.com/63562181/221379889-d3144255-c832-4559-beaf-8462a30fb6b9.png)

---

## EJERCICIO “REGISTRADURÍA”

Creamos las enumeraciones y clases para el esqueleto de la aplicación:

![image](https://user-images.githubusercontent.com/63562181/221381336-0710fc4b-4c0f-43ca-8970-872e11ff60bb.png)

### EJECUTAR LAS PRUEBAS

Ejecutamos el comando `mvn package`:

![image](https://user-images.githubusercontent.com/63562181/221381411-8b95ef87-6b52-4de2-85e1-889c02a3a386.png)

Ejecutamos el comando `mvn test`:

![image](https://user-images.githubusercontent.com/63562181/221381435-dd666d9e-beb6-4c13-90d8-841194dac03f.png)

---

## FINALIZAR EL EJERCICIO

Los casos de equivalencia propuestos son los siguientes:

1. Edad mayor a 0 y menor o igual a 17 (UNDERAGE)
2. Edad mayor a 17 y menor 114 (VALID)
3. Edad mayor a 114 o atributo alive es false (DEAD)
4. Edad menor o igual a 0 o un número mayor a 114 (INVALID_AGE)
5. Id de la persona duplicado (DUPLICATED)
6. 
