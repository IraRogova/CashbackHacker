package ru.netology.unit;

import org.junit.Test;

//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest {
    @Test
    public void shouldRemainBoundaryIfLess1000(){
        CashbackHackService  cashbackHack = new CashbackHackService();
        int amount = 900;

        int actual = cashbackHack.remain(amount);
        int expected = 100;

        assertEquals(expected,actual);
    }

    @Test
    public void shouldNotRemainBoundaryIfBayOn1000 (){
        CashbackHackService  cashbackHack = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHack.remain(amount);
        int expected = 0;

        assertEquals(expected,actual);

    }

}
