package it.federicoserini.hexmap;

import java.util.Vector;

public interface HexagonDistanceInterface {
    int hexagonLength(Hexagon hexagon);
    int hexagonDistance(Hexagon firstHexagon, Hexagon secondHexagon);
    Hexagon hexagonDirection(int direction);
    Hexagon hexagonNeighbor(Hexagon hexagon, int direction);
}
