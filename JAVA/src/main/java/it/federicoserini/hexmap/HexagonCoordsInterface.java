package it.federicoserini.hexmap;

public interface HexagonCoordsInterface {
    Hexagon addHexagon(Hexagon firstHexagon, Hexagon secondHexagon);
    Hexagon subHexagon(Hexagon firstHexagon, Hexagon secondHexagon);
    Hexagon mulHexagon(Hexagon firstHexagon, int multiplier);
}
