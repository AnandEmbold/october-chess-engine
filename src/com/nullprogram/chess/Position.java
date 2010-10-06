package com.nullprogram.chess;

/**
 * Represents a position on a Chess board.
 */
public class Position {
    public int x, y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position(Position pos, int deltax, int deltay) {
        this(pos.x + deltax, pos.y + deltay);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
