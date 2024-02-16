# MonteCarloPi

Este programa en Java implementa un método iterativo que permite obtener una aproximación al número Pi mediante el método de Montecarlo. 

## Contenido

- [Introducción](#introducción)
- [Manual de Instalación](#manual-de-instalación)
- [Manual de Uso](#manual-de-uso)

## Introducción

Este programa implementa un algoritmo iterativo para obtener una aproximación al número Pi mediante el método de Montecarlo. La clase `Matematicas` proporciona la funcionalidad necesaria para realizar este cálculo.
## Manual de Instalación

Para instalar y utilizar este programa, primero asegúrese de tener instalado el [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk14-downloads.html) en su computadora.

Luego, clone este repositorio en su computadora utilizando el siguiente comando en la terminal o línea de comandos:

```bash
git clone https://github.com/enzohuin/practicaPr2.git

```
Para acceder al directorio del proyecto utiliza el comando:
```
cd practicaPr2
```
Para compilar puede usar el camando:
```
make compilar
```
Para creaar un archivo ejecutable JAR se utiliza:
```
make jar
```
Si quieres crear la documentacion de Javadoc pra el codigo se hace con la siguiente instruccion:
```
make javadoc
```
## Manual de Uso
Para ejecutar el programa y obtener una aproximación de Pi, utilice el siguiente comando:
```
java -jar pi.jar <numero de pasos>
```
Ejemplo:
```
java -jar pi.jar <1000000>
```
