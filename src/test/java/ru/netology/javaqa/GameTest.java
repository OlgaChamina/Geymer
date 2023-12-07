package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {


    @Test
    public void shouldFindWinnerIfSecond(){
        Player player1 = new Player(3,"Killer",100);
        Player player2= new Player(78,"Fast",700);
        Game game = new Game();
        game.register(player1);
        game.register(player2);
        int expected = 2;
        int actual = game.round("Killer","Fast");
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldFindWinnerIfFirst(){
        Player player1 = new Player(3,"Killer",300);
        Player player2= new Player(78,"Fast",100);
        Game game = new Game();
        game.register(player1);
        game.register(player2);
        int expected = 1;
        int actual = game.round("Killer","Fast");
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldFindWinnerIfDraw(){
        Player player1 = new Player(3,"Killer",300);
        Player player2= new Player(78,"Fast",300);
        Game game = new Game();
        game.register(player1);
        game.register(player2);
        int expected = 0;
        int actual = game.round("Killer","Fast");
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldIfFirstPlayerNotRegistered(){
        Player player1 = new Player(3,"Killer",300);
        Player player2= new Player(78,"Fast",300);
        Game game = new Game();
        game.register(player1);
        game.register(player2);

        Assertions.assertThrows(NotRegisteredException.class, ()->game.round("killer","Fast"));
    }
    @Test
    public void shouldIfSecondPlayerNotRegistered(){
        Player player1 = new Player(3,"Killer",300);
        Player player2= new Player(78,"Fast",300);
        Game game = new Game();
        game.register(player1);
        game.register(player2);

        Assertions.assertThrows(NotRegisteredException.class, ()->game.round("Killer","fast"));
    }
    @Test
    public void shouldIfBothPlayerNotRegistered(){
        Player player1 = new Player(3,"Killer",300);
        Player player2= new Player(78,"Fast",300);
        Game game = new Game();
        game.register(player1);
        game.register(player2);

        Assertions.assertThrows(NotRegisteredException.class, ()->game.round("killer","fast"));
    }





}
