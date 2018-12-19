package it.federicoserini.hexmap;

public class HexagonCoords implements HexagonCoordsInterface {

    @Override
    public Hexagon addHexagon(Hexagon firstHexagon, Hexagon secondHexagon) {
        return new Hexagon(
                firstHexagon.getX() + secondHexagon.getX(),
                firstHexagon.getY() + secondHexagon.getY(),
                firstHexagon.getZ() + secondHexagon.getZ()
        );
    }

    @Override
    public Hexagon subHexagon(Hexagon firstHexagon, Hexagon secondHexagon) {
        return new Hexagon(
                firstHexagon.getX() - secondHexagon.getX(),
                firstHexagon.getY() - secondHexagon.getY(),
                firstHexagon.getZ() - secondHexagon.getZ()
        );
    }

    @Override
    public Hexagon mulHexagon(Hexagon firstHexagon, int multiplier) {
        return new Hexagon(
                firstHexagon.getX() * multiplier,
                firstHexagon.getY() * multiplier,
                firstHexagon.getZ() * multiplier

        );
    }
}
