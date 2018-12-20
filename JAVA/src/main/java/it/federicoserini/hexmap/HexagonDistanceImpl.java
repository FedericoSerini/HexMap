package it.federicoserini.hexmap;

import it.federicoserini.hexmap.model.Hexagon;

import java.util.Vector;

public class HexagonDistanceImpl implements HexagonDistanceInterface{

    public static Vector getAllHexagonDirections(){
        Vector<Hexagon> hexagonVector = new Vector<>();
        hexagonVector.add(new Hexagon(1,0,-1));
        hexagonVector.add(new Hexagon(1,-1,0));
        hexagonVector.add(new Hexagon(0,-1,1));
        hexagonVector.add(new Hexagon(-1,0,1));
        hexagonVector.add(new Hexagon(-1,1,0));
        hexagonVector.add(new Hexagon(0,1,-1));
        return hexagonVector;
    }

    @Override
    public double hexagonLength(Hexagon hexagon) {
        double length = Math.abs(hexagon.getX()) +
                Math.abs(hexagon.getY()) +
                Math.abs(hexagon.getZ());
        return length/2;
    }

    @Override
    public double hexagonDistance(Hexagon firstHexagon, Hexagon secondHexagon) {
        return hexagonLength(
            new Hexagon(
                    firstHexagon.getX() - secondHexagon.getX(),
                    firstHexagon.getY() - secondHexagon.getY(),
                    firstHexagon.getZ() - secondHexagon.getZ()
            )
        );
    }

    @Override
    public Hexagon hexagonDirection(int direction) {
        assert (0<= direction && direction < 6); // we have only 5 element in Vector
        return (Hexagon) getAllHexagonDirections().get(direction);
    }

    @Override
    public Hexagon hexagonNeighbor(Hexagon hexagon, int direction) {
        Hexagon hexagonToAdd = hexagonDirection(direction);
        return new Hexagon(
              hexagon.getX() + hexagonToAdd.getX(),
              hexagon.getY() + hexagonToAdd.getY(),
              hexagon.getZ() + hexagonToAdd.getZ()
        );
    }

}
