package it.federicoserini.hexmap.drawer;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PolygonDrawer {

    private void initDrawer(ArrayList<Polygon> polygonsToDraw){
        JFrame mainMap = new JFrame();
        mainMap.setResizable(false);

        mainMap.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel p = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLUE);

                for (Polygon polygon : polygonsToDraw) {
                    g.drawPolygon(polygon);
                }
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(1024, 768);
            }
        };

        mainMap.add(p);
        mainMap.pack();
        mainMap.setVisible(true);

    }

    public PolygonDrawer(ArrayList<Polygon> polygonsToDraw){
        initDrawer(polygonsToDraw);
    }

}
