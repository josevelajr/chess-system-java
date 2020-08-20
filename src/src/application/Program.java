package application;

import bordgame.Board;
import bordgame.Position;

public class Program {

    public static void main(String[] args) {

        System.out.println("Hello world!!!");

        Position pos = new Position(12,18);
        System.out.println(pos);

        Board board = new Board(8,8);

    }
}
