package it.federicoserini.hexmap.drawer;

import javax.swing.*;
import java.awt.*;

public class PolygonDrawer {

    private void initDrawer(Polygon polygonToDraw){
        JFrame mainMap = new JFrame();
        mainMap.setResizable(false);

        mainMap.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel p = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLUE);
                g.drawPolygon(polygonToDraw);
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

    public PolygonDrawer(Polygon polygonToDraw){
        initDrawer(polygonToDraw);
    }

}
