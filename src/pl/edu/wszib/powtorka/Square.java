package pl.edu.wszib.powtorka;

class Square {
    private int side;
    private int field;
    private int circuit;

    private Square() {
    }

    public Square(int side, int field, int circuit) {
        this.side = side;
        this.field = field;
        this.circuit = circuit;
    }

    public int getSide() {
        return this.side;
    }

    public int getField() {
        return this.field;
    }

    public int getCircuit() {
        return this.circuit;
    }

    public void setSide(int side) {
        this.side = side;
        this.field = side * side;
        this.circuit = 4 * side;
    }

    private void cos() {

    }

    private void k1() {

    }

    private void k2() {

    }

    private void k3() {

    }

    public void zrobCos() {
        k1();
        k2();
        k3();
    }
}
