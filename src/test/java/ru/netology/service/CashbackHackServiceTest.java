package ru.netology.service;

public class CashbackHackServiceTest {
    @org.junit.Test
    public void return100IfAmount900() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void return1000IfAmount0() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int actual = service.remain(0);
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void return0IfAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void return1IfAmount999() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1;
        int actual = service.remain(999);
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void return999IfAmount1() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        int actual = service.remain(1);
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void return999IfAmount1001() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        int actual = service.remain(1001);
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void return1IfAmount1999() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1;
        int actual = service.remain(1999);
        org.junit.Assert.assertEquals(expected, actual);
    }


}