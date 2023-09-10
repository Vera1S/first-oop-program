package Lesson7_06_09_23;

public class Cell {
    private boolean isShip;

    public Cell(boolean isShip) {
        this.isShip = isShip;
    }

    public boolean isShip() {
        return isShip;
    }

    public void setShip(boolean ship) {
        isShip = ship;
    }

    @Override
    public String toString() {
        if (isShip) {
            return "\uD83D\uDEA2";
        }
        else {
            return " ";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cell cell = (Cell) o;

        return isShip == cell.isShip;
    }

    @Override
    public int hashCode() {
        return (isShip ? 1 : 0);
    }
}
