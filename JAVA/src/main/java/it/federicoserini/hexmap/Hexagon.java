package it.federicoserini.hexmap;

public class Hexagon {
    private int x,y,z;

    public Hexagon(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
        assert x + y + z == 0 || (x + y + z != 0);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
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
