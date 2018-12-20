package it.federicoserini.hexmap.drawer;

import it.federicoserini.hexmap.model.Hexagon;
import it.federicoserini.hexmap.model.HexagonLayout;
import it.federicoserini.hexmap.model.Point;

import java.util.Set;
import java.util.Vector;

public interface HexagonDrawerInterface {
    Point hexagonToPixel(HexagonLayout hexagonLayout, Hexagon hexagon);
    Hexagon pixelToHexagon(HexagonLayout hexagonLayout, Point point);
    Point hexagonCornerOffset(HexagonLayout hexagonLayout, int corner);
    Vector<Point> polygonCorners(HexagonLayout hexagonLayout, Hexagon hexagon);
    Set<Hexagon> drawParallelogramShape(int vertexA, int vertexB, int vertexC, int vertexD);
    Set<Hexagon> drawTriangleShape(int mapSize);
    Set<Hexagon> drawHexagonShape(int mapRadius);
    Set<Hexagon> drawRectangleShape(int mapHeight, int mapWidth);
}
