package it.federicoserini.hexmap.drawer;

import it.federicoserini.hexmap.model.Hexagon;
import it.federicoserini.hexmap.model.HexagonLayout;
import it.federicoserini.hexmap.model.HexagonOrientation;
import it.federicoserini.hexmap.model.Point;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

import static java.lang.Math.*;

public class HexagonDrawerImpl implements HexagonDrawerInterface{

    @Override
    public Point hexagonToPixel(HexagonLayout hexagonLayout, Hexagon hexagon) {
        HexagonOrientation hexagonOrientation = hexagonLayout.getHexagonOrientation();
        double x = (hexagonOrientation.getForwardMatrix0() * hexagon.getX() + hexagonOrientation.getForwardMatrix1() * hexagon.getY()) * hexagonLayout.getSize().getX();

        double y = (hexagonOrientation.getForwardMatrix2() * hexagon.getX() + hexagonOrientation.getForwardMatrix3() * hexagon.getY()) * hexagonLayout.getSize().getY();

        return new Point(
                x + hexagonLayout.getOrigin().getX(),
                y + hexagonLayout.getOrigin().getY()
        );
    }

    @Override
    public Hexagon pixelToHexagon(HexagonLayout hexagonLayout, Point pixel) {
        HexagonOrientation hexagonOrientation = hexagonLayout.getHexagonOrientation();
        Point point = new Point(
                (pixel.getX() - hexagonLayout.getOrigin().getX()) / hexagonLayout.getSize().getX(),
                (pixel.getY() - hexagonLayout.getOrigin().getY()) / hexagonLayout.getSize().getY()
        );
        double hexagonX = hexagonOrientation.getInverseMatrix0() * point.getX() +
                hexagonOrientation.getInverseMatrix1() * point.getX();
        double hexagonY = hexagonOrientation.getInverseMatrix2() * point.getX() +
                hexagonOrientation.getInverseMatrix3() * point.getY();
        double hexagonZ = -hexagonX - hexagonY;
        return new Hexagon(
                hexagonX,
                hexagonY,
                hexagonZ
        );
    }

    private Hexagon hexagonRound(Hexagon hexagonToRound){
        int roundedX = (int) round(hexagonToRound.getX());
        int roundedY = (int) round(hexagonToRound.getY());
        int roundedZ = (int) round(hexagonToRound.getZ());
        double xDiff = Math.abs(roundedX - hexagonToRound.getX());
        double yDiff = Math.abs(roundedY - hexagonToRound.getY());
        double zDiff = Math.abs(roundedZ - hexagonToRound.getZ());

        if (xDiff > yDiff && xDiff > zDiff) {
            roundedX = -roundedY - roundedZ;
        } else if (yDiff > zDiff) {
            roundedY = -roundedX - roundedZ;
        } else {
            roundedZ = -roundedX - roundedY;
        }

        return new Hexagon(roundedX, roundedY, roundedZ);
    }

    @Override
    public Point hexagonCornerOffset(HexagonLayout hexagonLayout, int corner) {
        Point size = hexagonLayout.getSize();
        double angle = 2.0 * Math.PI * (hexagonLayout.getHexagonOrientation().getStartAngle() - corner) / 6.0;
        return new Point(
                size.getX() * Math.cos(angle),
                size.getY() * Math.sin(angle)
        );
    }

    @Override
    public Vector<Point> polygonCorners(HexagonLayout hexagonLayout, Hexagon hexagon) {
        Vector<Point> pointVector = new Vector<>();
        Point centerPoint = hexagonToPixel(hexagonLayout, hexagon);
        for (int i = 0; i < 6; i++){
            Point offset = hexagonCornerOffset(hexagonLayout, i);
            pointVector.add(new Point(
                    centerPoint.getX() + offset.getX(),
                    centerPoint.getY() + offset.getY()
            ));
        }
        return pointVector;
    }

    @Override
    public Set<Hexagon> drawParallelogramShape(int vertexA, int vertexB, int vertexC, int vertexD) {
        Set<Hexagon> hexagonSet = new HashSet<>();
        for(int x = vertexA; x <= vertexB; x++) {
            for(int y = vertexC; y <= vertexD; y++){
                hexagonSet.add(new Hexagon(
                        x,y,-x-y
                ));
            }
        }
        return hexagonSet;
    }

    @Override
    public Set<Hexagon> drawTriangleShape(int mapSize) {
        Set<Hexagon> hexagonSet = new HashSet<>();
        for (int x = 0; x <= mapSize; x++){
            for (int y = 0; y <= mapSize - x; y++){
                hexagonSet.add(new Hexagon(
                        x,y,-x-y
                ));
            }
        }
        return hexagonSet;
    }

    @Override
    public Set<Hexagon> drawHexagonShape(int mapRadius) {
        Set<Hexagon> hexagonSet = new HashSet<>();
        for (int x = -mapRadius; x <= mapRadius; x++){
            int height = max(-mapRadius, -x - mapRadius);
            int width = min(mapRadius, -x + mapRadius);
            for (int y = height; y <= width; y++){
                hexagonSet.add(new Hexagon(
                        x,y,-x-y
                ));
            }
        }
        return hexagonSet;
    }

    @Override
    public Set<Hexagon> drawRectangleShape(int mapHeight, int mapWidth) {
        Set<Hexagon> hexagonSet = new HashSet<>();
        for (int y = 0; y < mapHeight; y++){
            int offset = (int) Math.floor(y / 2);
            for (int x = -offset; x < mapWidth - offset; x++){
                hexagonSet.add(new Hexagon(
                        x, y,-x-y
                ));
            }
        }
        return hexagonSet;
    }

}
