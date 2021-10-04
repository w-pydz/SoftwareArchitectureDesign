package com.solid.lsp;

public class Square implements CalculateArea {

    private int side ;

    Square(int side) {
        this.side = side;
    }

    public int getArea() {
        return side*side;
    }
}
