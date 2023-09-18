package Lesson7_06_09_23;

import java.util.Arrays;
//Улучшить наш морской бой
//1) Все числа в классе FieldGenerator вынести, как private final static переменные (константы) прямо в этом классе
//2) Добавить классам, описывающим структуры (поле, например) гетеры, сетеры и реализовать все нужные методы из класса object
//3) Добавить возможность "стрелять" не 1 раз, а 10 раз. ввести подсчет очков

public class Field {

    private Cell[][] cells;
    public Field(Cell[][] cells) {
        this.cells = cells;
    }

    public boolean checkCell(int row, int column) {
        Cell targetCell = cells[row][column];
        return targetCell.isShip();
    }

    public Cell[][] getCells() {
        return cells;
    }

    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }

    @Override
    public String toString() {
        return "Field{" +
                "cells=" + Arrays.deepToString(cells) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Field field = (Field) o;

        return Arrays.deepEquals(cells, field.cells);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(cells);
    }
}
