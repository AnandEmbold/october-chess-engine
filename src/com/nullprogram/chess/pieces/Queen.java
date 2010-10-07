package com.nullprogram.chess.pieces;

import com.nullprogram.chess.Piece;
import com.nullprogram.chess.PositionList;

/**
 * The Chess queen.
 *
 * This class describes the movement and capture behavior of the Chess
 * queen.
 */
public class Queen extends Piece {

    /**
     * Create a new queen on the given side.
     *
     * @param side piece owner
     */
    public Queen(final Side side) {
        super(side);
    }

    /** {@inheritDoc} */
    public final PositionList getMoves() {
        PositionList list = new PositionList(getBoard());
        // Take advantage of the Bishop and Rook implementations
        list = Rook.getMoves(this, list);
        list = Bishop.getMoves(this, list);
        return list;
    }
}
