package it.federicoserini.hexmap.coordinates;

import it.federicoserini.hexmap.model.Hexagon;

public interface HexagonDistanceInterface {
    double hexagonLength(Hexagon hexagon);
    double hexagonDistance(Hexagon firstHexagon, Hexagon secondHexagon);
    Hexagon hexagonDirection(int direction);
    Hexagon hexagonNeighbor(Hexagon hexagon, int direction);
}
