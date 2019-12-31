package day3;

import day1.Day1;
import org.junit.Assert;
import org.junit.Test;

public class TestDay3 {
        Day3 day3=new Day3();

        @Test
        public void testDay1part1() {

            Assert.assertEquals(4981,day3.day3part1());

        }

        @Test
        public void testDay1part2() {
            Assert.assertEquals(164012,day3.day3part2());
        }

}
