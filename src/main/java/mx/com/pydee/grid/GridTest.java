/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.pydee.grid;


import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class GridTest extends JComponent {    
    
    @Override
    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        // Indicamos que queremos se use antialiasing al hacer las lineas
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Fondo
        g2.setColor(Color.BLACK);
        g2.fillRect(0, 0, getWidth(), getHeight());
        
        // Grueso y color de linea
        g2.setStroke(new BasicStroke(2f));
        g2.setColor(Color.RED);
        
        // Dibujamos las lineas verticales de la cuadricula, empezando del centro
        // hacia la izquierda
        for(int i = 450, x=450; i > 0; i -= 20, x-=90) {
            g2.draw(new Line2D.Double(i, 210, x, 420));
        }
        
        // Luego del centro a la derecha
        for(int i = 450, x=450; i <= 900; i += 20, x+=90) {
            g2.draw(new Line2D.Double(i, 210, x, 420));
        }

        // Ahora dibujamos las lineas horizontales
        int y = 209;
        int incremento = 5;
        
        // la distancia vertical se incrementa para dar perspectiva
        while(y < 420) {
            g2.draw(new Line2D.Double(0, y, 900, y));
            y = y + incremento;
            incremento = incremento + incremento;
        }
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new GridTest());
        frame.pack();
        frame.setSize(new Dimension(900, 420));
        frame.setVisible(true);
    }
}