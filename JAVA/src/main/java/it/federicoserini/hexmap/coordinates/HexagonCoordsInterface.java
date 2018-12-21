package it.federicoserini.hexmap.coordinates;

import it.federicoserini.hexmap.model.Hexagon;

public interface HexagonCoordsInterface {
    Hexagon addHexagon(Hexagon firstHexagon, Hexagon secondHexagon);
    Hexagon subHexagon(Hexagon firstHexagon, Hexagon secondHexagon);
    Hexagon mulHexagon(Hexagon firstHexagon, int multiplier);
}
