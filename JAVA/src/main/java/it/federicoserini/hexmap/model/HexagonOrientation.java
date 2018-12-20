package it.federicoserini.hexmap.model;

public class HexagonOrientation {
    private double forwardMatrix0, forwardMatrix1, forwardMatrix2, forwardMatrix3;
    private double inverseMatrix0, inverseMatrix1, inverseMatrix2, inverseMatrix3;
    private double startAngle; // will define if is a flat or pointy hexagon

    public HexagonOrientation(double forwardMatrix0, double forwardMatrix1, double forwardMatrix2, double forwardMatrix3,
                              double inverseMatrix0, double inverseMatrix1, double inverseMatrix2, double inverseMatrix3,
                              double startAngle){
        this.forwardMatrix0 = forwardMatrix0;
        this.forwardMatrix1 = forwardMatrix1;
        this.forwardMatrix2 = forwardMatrix2;
        this.forwardMatrix3 = forwardMatrix3;
        this.inverseMatrix0 = inverseMatrix0;
        this.inverseMatrix1 = inverseMatrix1;
        this.inverseMatrix2 = inverseMatrix2;
        this.inverseMatrix3 = inverseMatrix3;
        this.startAngle = startAngle;
    }

    public double getForwardMatrix0() {
        return forwardMatrix0;
    }

    public void setForwardMatrix0(double forwardMatrix0) {
        this.forwardMatrix0 = forwardMatrix0;
    }

    public double getForwardMatrix1() {
        return forwardMatrix1;
    }

    public void setForwardMatrix1(double forwardMatrix1) {
        this.forwardMatrix1 = forwardMatrix1;
    }

    public double getForwardMatrix2() {
        return forwardMatrix2;
    }

    public void setForwardMatrix2(double forwardMatrix2) {
        this.forwardMatrix2 = forwardMatrix2;
    }

    public double getForwardMatrix3() {
        return forwardMatrix3;
    }

    public void setForwardMatrix3(double forwardMatrix3) {
        this.forwardMatrix3 = forwardMatrix3;
    }

    public double getInverseMatrix0() {
        return inverseMatrix0;
    }

    public void setInverseMatrix0(double inverseMatrix0) {
        this.inverseMatrix0 = inverseMatrix0;
    }

    public double getInverseMatrix1() {
        return inverseMatrix1;
    }

    public void setInverseMatrix1(double inverseMatrix1) {
        this.inverseMatrix1 = inverseMatrix1;
    }

    public double getInverseMatrix2() {
        return inverseMatrix2;
    }

    public void setInverseMatrix2(double inverseMatrix2) {
        this.inverseMatrix2 = inverseMatrix2;
    }

    public double getInverseMatrix3() {
        return inverseMatrix3;
    }

    public void setInverseMatrix3(double inverseMatrix3) {
        this.inverseMatrix3 = inverseMatrix3;
    }

    public double getStartAngle() {
        return startAngle;
    }

    public void setStartAngle(double startAngle) {
        this.startAngle = startAngle;
    }

}
