package it.federicoserini.hexmap;

public class Main {
    public static void main(String[] args){
        Hexagon hexagon = new Hexagon(0,0,0);
        HexagonOrientation pointyHexagon = new HexagonOrientation(
                Math.sqrt(3.0),
                Math.sqrt(3.0)/ 2.0,
                0.0,
                3.0/2.0,
                Math.sqrt(3.0) / 3.0,
                -1.0 / 3.0,
                0.0,
                2.0 / 3.0,
                0.5
        );

        HexagonOrientation flatHexagon = new HexagonOrientation(
                3.0 / 2.0,
                0.0,
                Math.sqrt(3.0)/2.0,
                 Math.sqrt(3.0),
                2.0/3.0,
                0.0,
                -1.0/3.0,
                Math.sqrt(3.0)/3.0,
                0.0
        );

    }
}
