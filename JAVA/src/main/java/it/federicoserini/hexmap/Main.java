package it.federicoserini.hexmap;

import it.federicoserini.hexmap.drawer.HexagonDrawerImpl;
import it.federicoserini.hexmap.drawer.PolygonDrawer;
import it.federicoserini.hexmap.model.Hexagon;
import it.federicoserini.hexmap.model.HexagonLayout;
import it.federicoserini.hexmap.model.Point;
import javax.swing.*;
import java.awt.*;
import java.util.Set;
import java.util.Vector;

public class Main {
    public static void main(String[] args){
        HexagonDrawerImpl hexagonDrawer = new HexagonDrawerImpl();
        HexagonLayout hexagonLayout = new HexagonLayout(HexagonLayout.pointyHexagon, new Point(20, 20), new Point(20,20));
        Polygon polygon = new Polygon();

        Set<Hexagon> hive = hexagonDrawer.drawRectangleShape(1, 2);

        for (Hexagon hexagon: hive){
            Vector<Point> points = hexagonDrawer.polygonCorners(hexagonLayout , hexagon);
           for (int i=0; i < points.size(); i++){
               java.awt.Point pointAwt = new java.awt.Point((int) points.get(i).getX(), (int) points.get(i).getY());
               System.out.println("POINT: "+ i +pointAwt.toString());
               polygon.addPoint(pointAwt.x, pointAwt.y);
            }
        }

        SwingUtilities.invokeLater(() -> new PolygonDrawer(polygon));
    }
}
