#Uso basico de Java2D

![Un ejemplo de que se puede hacer con Java2D](grid.png "Un ejemplo de que se puede hacer con Java2D")


Una de las capacidades de las librerias de Java para la creación de interfaces
graficas es el poder generar graficas directamente, ya sea en pantalla o en
memoria para despues exportalas a un archivo de imagen, estas capacidades estan
contenidas en la líbreria Java2D, de la cual veremos un pequeño ejemplo de
como se usa.

## Graphics2D
Para generar nuestra grafica haremos uso del objeto Graphics2D, este objeto
contiene los métodos para especificar cosas como el color de trazo, tamaño de 
trazo, fondo, si se usara o no antialiasing, entre otras caracteristicas.

Tambien contiene el método draw el cual dibujara la implementación de la 
interfaz Shape que le pasemos como argumento con el tipo de trazo y colores 
especificados.

Obviamente hay mucho mas de Graphics2D que solo dibujar lineas y figuras, como
por ejemplo el método drawImage que dibuja imagenes ya existentes, pero eso sera
para otra entrada.

## Dibujar graficas en pantalla
La forma mas sencilla de dibujar graficas en la pantalla consiste en crear un
nuevo componente de Swing en el cual crearemos la grafica deseada, esto es mucho
mas sencillo de lo que suena, basta con crear una subclase de *JComponent* y
redefinir el método *draw*, como se ve a continuación:

```java
public class GridTest extends JComponent {
   @Override
   public void paint(Graphics g){
   }
}
```

Esta clase se puede usar como cualquier otro componente Swing 
