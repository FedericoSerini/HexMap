package it.federicoserini.hexmap.model;

public class Hexagon {
    private double x,y,z;

    public Hexagon(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
        assert Math.round(x + y + z) == 0 || (Math.round(x + y + z) != 0);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public boolean equals(Object anotherHexagon){
        if (anotherHexagon instanceof Hexagon){
            Hexagon hexagonToCompare = (Hexagon) anotherHexagon;
            return  this.x == hexagonToCompare.x && this.y == hexagonToCompare.y &&
                    this.z == hexagonToCompare.z;
        } else {
            return false;
        }
    }
}
