package SnakesAndLadders;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SquareTest {
    @Test
    public void testGettingSquareNumber() {
        Square square = new Square(1, 2);
        
        assertTrue(square.getSquareNumber() == 1);
    }

    @Test
    public void testGettingSquarePlayerTakenTo() {
        Square square = new Square(1, 2);
        
        assertTrue(square.getTakesPlayerTo() == 2);
    }

    @Test
    public void testEmptySquareType() {
        Square emptySquare = new Square(1, 1);
        
        assertTrue(emptySquare.getType() == SquareType.EMPTY);
    }

    @Test
    public void testLadderSquareType() {
        Square ladderSquare = new Square(1, 2);

        assertTrue(ladderSquare.getType() == SquareType.LADDER);
    }

    @Test
    public void testSnakeSquareType() {
        Square snakeSquare = new Square(2, 1);

        assertTrue(snakeSquare.getType() == SquareType.SNAKE);
    }
}
