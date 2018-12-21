package it.federicoserini.hexmap;

import it.federicoserini.hexmap.drawer.HexagonDrawerImpl;
import it.federicoserini.hexmap.drawer.PolygonDrawer;
import it.federicoserini.hexmap.model.Hexagon;
import it.federicoserini.hexmap.model.HexagonLayout;
import it.federicoserini.hexmap.model.Point;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Set;
import java.util.Vector;

public class Main {
    public static void main(String[] args){
        HexagonDrawerImpl hexagonDrawer = new HexagonDrawerImpl();
        HexagonLayout hexagonLayout = new HexagonLayout(HexagonLayout.pointyHexagon, new Point(15, 15), new Point(0,0));


        Set<Hexagon> hive = hexagonDrawer.drawRectangleShape(40, 40);
        ArrayList<Polygon> polygons = new ArrayList<>();

        for (Hexagon hexagon: hive){
            Vector<Point> points = hexagonDrawer.polygonCorners(hexagonLayout , hexagon);
            Polygon polygon = new Polygon();
           for (int j=0; j < points.size(); j++){
               java.awt.Point pointAwt = new java.awt.Point((int) points.get(j).getX(), (int) points.get(j).getY());
               System.out.println("POINT: "+ j +pointAwt.toString());
               polygon.addPoint(pointAwt.x, pointAwt.y);
            }
            polygons.add(polygon);
        }

        SwingUtilities.invokeLater(() -> new PolygonDrawer(polygons));
    }
}
