package it.federicoserini.hexmap.model;

public class HexagonLayout {
    private HexagonOrientation hexagonOrientation;
    private Point size;
    private Point origin;

    static public HexagonOrientation pointyHexagon = new HexagonOrientation(Math.sqrt(3.0), Math.sqrt(3.0) / 2.0, 0.0,
            3.0 / 2.0, Math.sqrt(3.0) / 3.0, -1.0 / 3.0, 0.0, 2.0 / 3.0, 0.5
    );
    static public HexagonOrientation flatHexagon = new HexagonOrientation(
            3.0 / 2.0, 0.0, Math.sqrt(3.0) / 2.0, Math.sqrt(3.0), 2.0 / 3.0,
            0.0, -1.0 / 3.0, Math.sqrt(3.0) / 3.0, 0.0
    );


    public HexagonLayout(HexagonOrientation hexagonOrientation, Point size, Point origin){
        this.hexagonOrientation = hexagonOrientation;
        this.size = size;
        this.origin = origin;
    }

    public HexagonOrientation getHexagonOrientation() {
        return hexagonOrientation;
    }

    public void setHexagonOrientation(HexagonOrientation hexagonOrientation) {
        this.hexagonOrientation = hexagonOrientation;
    }

    public Point getSize() {
        return size;
    }

    public void setSize(Point size) {
        this.size = size;
    }

    public Point getOrigin() {
        return origin;
    }

    public void setOrigin(Point origin) {
        this.origin = origin;
    }

    public HexagonOrientation getPointyHexagon() {
        return pointyHexagon;
    }

    public void setPointyHexagon(HexagonOrientation pointyHexagon) {
        this.pointyHexagon = pointyHexagon;
    }

    public HexagonOrientation getFlatHexagon() {
        return flatHexagon;
    }

    public void setFlatHexagon(HexagonOrientation flatHexagon) {
        this.flatHexagon = flatHexagon;
    }
}
