package Rooms;

import Game.Runner;
import People.Person;

public class DeathRoom extends Room {

    public DeathRoom(int x, int y) {
        super(x, y);
    }

    @Override
    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You found the death room! You died!");
        Runner.gameOff();
    }
}