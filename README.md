# LABORATORIO3_CVDS
#### autor: Julia Mejia  

## EJERCICIO "REGISTRADURIA"  
  
### Actualizar y crear dependencias en el proyecto  
modificar la versión del compilador de java  
<img width="264" alt="image" src="https://user-images.githubusercontent.com/98657146/188341388-f62208e8-8ba7-42aa-aa35-02dfc95e1d76.png">

### COMPILAR Y EJECUTAR  
se realiza el esqueleto de la aplicacion y se corren las pruebas con el comando "mvn package"  
<img width="296" alt="image" src="https://user-images.githubusercontent.com/98657146/188341477-451439ec-3652-4d77-874a-d8823ab62acd.png">  
  
### FINALIZAR EL EJERCICIO  
*	Piense en los casos de equivalencia que se pueden generar del ejercicio para la registraduría, dadas las condiciones. Deben ser al menos 5. 
*	Complete la implementación de la clase RegistryTest.java con (al menos) un método por cada clase de equivalencia, creando diferentes personas y validando que el resultado sea el esperado. 
*	Complete la implementación del método registerVoter en la clase Registry.java para retornar el resultado esperado según la entrada.  
  
Después de realizar los test y modificar la clase Registry , corremos el paquete y vemos que corren los 8 test  
<img width="295" alt="image" src="https://user-images.githubusercontent.com/98657146/188341589-22c6c663-c30d-4894-9299-64c34b5ea80d.png">  
  
  
  
## EJERCICIO "DESCUENTO DE TARIFAS"

### IMPLEMENTACIÓN DE LAS PRUEBAS  
Descargue el archivo aerodescuentos.jar y adicione esta nueva dependencia en el archivo pom.xml de su proyecto.  
<img width="205" alt="image" src="https://user-images.githubusercontent.com/98657146/188341650-829c3294-7246-4100-aa61-231cda722f32.png">  

Para adicionar una librería personalizada al repositorio local de maven puede ejecutar el siguiente comando.  
<img width="303" alt="image" src="https://user-images.githubusercontent.com/98657146/188341670-02c389de-c174-410f-af97-c16eeee853dd.png">  

*	Cree el archivo TarifasTest.java en el directorio src/test/java/edu/eci/cvds/tdd/aerodescuentos. Realice la implementación de las pruebas propuestas en la etapa de diseño de pruebas en esta clase. Para sus pruebas debe usar el método "calculoTarifa" de la clase edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos, que se encuentran dentro del JAR de la librería personalizada.
* Ejecute el comando de Maven para las fases de compilación y pruebas. Verifique el resultado exitoso de todas las pruebas y el reporte generado  

<img width="333" alt="image" src="https://user-images.githubusercontent.com/98657146/188341718-e00d3748-fd18-4c8c-bc3b-e53dbdeb42e3.png">
