package day1;

import org.junit.Assert;
import org.junit.Test;


import java.util.ArrayList;

public class TestDay1 {
    Day1 day1=new Day1();

    @Test
    public void testDay1part1() {

        Assert.assertEquals(3393938,day1.day1part1());
    }

    @Test
    public void testDay1part2() {
        Assert.assertEquals(5088037,day1.day1part2());
    }
}
