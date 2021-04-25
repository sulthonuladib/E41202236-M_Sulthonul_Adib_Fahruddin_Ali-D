package Minggu7;

import Minggu5.Graph.Graph;

import java.awt.*;
import java.applet.*;

public class Nomor5A extends Applet {
    Font font;
    Color redColor;
    Color blueColor;
    Color backgroundColor;

    public void init () {
        font = new Font("Arial", Font.ITALIC, 18);

        redColor = Color.red;
        backgroundColor = Color.orange;

        setBackground(backgroundColor);
    }

    public void stop(){
    }

    public void paint(Graphics graph) {
        graph.setFont(font);
        graph.drawString("DrawShapes", 90,20);
        graph.setColor(blueColor);
        graph.drawRect(120, 120, 120, 120);
        graph.fillRect(115, 115, 90, 90);
        graph.setColor(redColor);
        graph.fillArc(110, 110, 50, 50, 0, 360);
        graph.setColor(Color.CYAN);
        graph.drawRect(50, 50, 50 ,50 );
        graph.fillRect(50, 50 ,60 ,60);


    }
}
