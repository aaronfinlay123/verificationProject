package cm;
//Calculate Test14, takes off with the new spec and is the centre of focus for now.
//DUE DATE: 26/03/21
//Author: Aaron Finlay
// 4th Year Soft Eng
// 21 Rate Constructor tests
// 14 Calculate Method tests

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import static java.math.BigDecimal.valueOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import java.math.BigDecimal;
import java.util.ArrayList;

import static java.math.BigDecimal.valueOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FinlayAaronTestTask3
{

    //Rate Class Test Case #1
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCaseOne() throws IllegalArgumentException {
        Rate rate;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal("18");
        BigDecimal reducedRate = new BigDecimal("-2");
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(13, 16);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normPeriod = new Period(8, 12);
        normalPeriods.add(normPeriod);
        // Car Park
        CarParkKind park = CarParkKind.STAFF;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //Rate Class Test Case #2
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCaseTwo() throws IllegalArgumentException {
        Rate rate;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal("-2");
        BigDecimal reducedRate = new BigDecimal("0");
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(12, 14);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normPeriod = new Period(10, 11);
        normalPeriods.add(normPeriod);
        // Car Park
        CarParkKind park = CarParkKind.STUDENT;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }


    //Rate Class Test Case #3
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCaseThree() throws IllegalArgumentException {
        Rate rate;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(7);
        BigDecimal reducedRate = new BigDecimal(9);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(5, 9);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normPeriod = new Period(3, 4);
        normalPeriods.add(normPeriod);
        // Car Park
        CarParkKind park = CarParkKind.VISITOR;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }


    ////Rate Class Test Case #4
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCaseFour() throws IllegalArgumentException {
        Rate rate;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(11);
        BigDecimal reducedRate = new BigDecimal(4);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(3, 5);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normPeriod = new Period(7, 19);
        normalPeriods.add(normPeriod);
        // Car Park
        CarParkKind park = CarParkKind.MANAGEMENT;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }


    //Rate Class Test Case #5
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCaseFive() throws IllegalArgumentException {
        Rate rate;
        // normalRate && reducedRate
        BigDecimal reducedRate = new BigDecimal(3);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(4, 6);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normPeriod = new Period(1, 3);
        normalPeriods.add(normPeriod);
        // Car Park
        CarParkKind park = CarParkKind.STUDENT;
        rate = new Rate(park, null, reducedRate, reducedPeriods, normalPeriods);
    }

    //Rate Class Test Case #6
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCaseSix() throws IllegalArgumentException {
        Rate rate;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(6);

        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(12, 16);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normPeriod = new Period(1, 8);
        normalPeriods.add(normPeriod);
        // Car Park
        CarParkKind park = CarParkKind.MANAGEMENT;
        rate = new Rate(park, normalRate, null, reducedPeriods, normalPeriods);
    }


    //Rate Class Test Case #7
    @org.junit.Test()
    public void testCaseSeven() throws IllegalArgumentException {
        Rate rate;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal("3");
        BigDecimal reducedRate = new BigDecimal(2);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(7, 11);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normPeriod = new Period(4, 7);
        normalPeriods.add(normPeriod);
        // Car Park
        CarParkKind park = CarParkKind.VISITOR;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //Rate Class Test Case #8
    @org.junit.Test()
    public void testCaseEight() throws IllegalArgumentException
    {
        Rate rate;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(3);
        BigDecimal reducedRate = new BigDecimal("3");
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(7, 11);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normPeriod = new Period(4, 7);
        normalPeriods.add(normPeriod);
        // Car Park
        CarParkKind park = CarParkKind.STUDENT;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //Rate Class Test Case #9
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCaseNine() throws IllegalArgumentException {
        Rate rate;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(12);
        BigDecimal reducedRate = new BigDecimal(9);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedP = new Period(10, 13);
        Period reducePeriod = new Period(1, 11);
        reducedPeriods.add(reducedP);
        reducedPeriods.add(reducePeriod);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normPeriod = new Period(5, 9);
        normalPeriods.add(normPeriod);
        // Car Park
        CarParkKind park = CarParkKind.STAFF;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //Rate Class Test Case #10
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCaseTen() throws IllegalArgumentException {
        Rate rate;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(12);
        BigDecimal reducedRate = new BigDecimal(9);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedP = new Period(9, 13);
        reducedPeriods.add(reducedP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normPeriod = new Period(9, 13);
        normalPeriods.add(normPeriod);
        // Car Park
        CarParkKind park = CarParkKind.MANAGEMENT;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }


    //Rate Class Test Case #11
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCaseEleven() throws IllegalArgumentException {
        Rate rate;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(12);
        BigDecimal reducedRate = new BigDecimal(9);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedP = new Period(9, 13);
        reducedPeriods.add(reducedP);
        Period reducePeriod = new Period(16, 20);
        reducedPeriods.add(reducePeriod);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normPeriod = new Period(9, 13);
        normalPeriods.add(normPeriod);
        // Car Park
        CarParkKind park = CarParkKind.VISITOR;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //Rate Class Test Case #12
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCaseTwelve() throws IllegalArgumentException {
        Rate rate;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(12);
        BigDecimal reducedRate = new BigDecimal(9);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normPeriod = new Period(9, 13);
        normalPeriods.add(normPeriod);
        // Car Park
        CarParkKind park = CarParkKind.VISITOR;
        rate = new Rate(park, normalRate, reducedRate, null, normalPeriods);
    }

    //Rate Class Test Case 13
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCaseThirteen() throws IllegalArgumentException {
        Rate rate;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(12);
        BigDecimal reducedRate = new BigDecimal(9);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedP = new Period(10, 12);
        reducedPeriods.add(reducedP);
        Period reducedPeriod = null;
        reducedPeriods.add(reducedPeriod);
        // normalPeriods

        // Car Park
        CarParkKind park = CarParkKind.STAFF;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, null);
    }


    // Rate Class Test Case #14
    @org.junit.Test
    public void testCaseFourteen() {
        Rate rate;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(12);
        BigDecimal reducedRate = new BigDecimal(9);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(9, 13);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normPeriod = new Period(6, 9);
        normalPeriods.add(normPeriod);
        // Car Park
        CarParkKind park = CarParkKind.VISITOR;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    // Rate Class Test Case #15
    @org.junit.Test
    public void testCaseFifteen() throws IllegalArgumentException {
        Rate rate;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(12);
        BigDecimal reducedRate = new BigDecimal(9);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(9, 13);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normPeriod = new Period(5, 9);
        normalPeriods.add(normPeriod);
        // Car Park
        CarParkKind park = CarParkKind.STUDENT;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    // Rate Class Test Case #16
    @org.junit.Test
    public void testCaseSixteen() throws IllegalArgumentException {
        Rate rate;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(12);
        BigDecimal reducedRate = new BigDecimal(9);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedP = new Period(9, 13);
        reducedPeriods.add(reducedP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normPeriod = new Period(6, 9);
        normalPeriods.add(normPeriod);
        // Car Park
        CarParkKind park = CarParkKind.MANAGEMENT;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    // Rate Test Case #17
    @org.junit.Test
    public void testCaseSeventeen() {
        Rate rate;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(12);
        BigDecimal reducedRate = new BigDecimal(9);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(9, 13);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(6, 8);
        normalPeriods.add(np);
        // Car Park
        CarParkKind park = CarParkKind.STAFF;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //Rate  Test Case #18
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCaseEighteen() throws IllegalArgumentException {
        Rate rate;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(8);
        // normalPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(9, 12);
        normalPeriods.add(normP);
        Period normPeriod = new Period(10, 16);
        normalPeriods.add(normPeriod);
        Period normalP = new Period(12, 21);
        normalPeriods.add(normalP);
        // Car Park
        CarParkKind park = CarParkKind.VISITOR;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //Rate Class Test Case #19
    @org.junit.Test
    public void testCaseNineteen() throws IllegalArgumentException {
        Rate rate;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal("0");
        BigDecimal reducedRate = new BigDecimal("0");
        // normalPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period redP = new Period(9, 13);
        reducedPeriods.add(redP);

        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(14, 18);
        normalPeriods.add(np);
        // Car Park
        CarParkKind park = CarParkKind.VISITOR;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }


    // Calculate Test Case #1
    @org.junit.Test
    public void calculateTestOne() {
        Rate rate;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(12);
        BigDecimal reducedRate = new BigDecimal(9);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(9, 13);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(7, 10);
        normalPeriods.add(normP);
        // Car Park
        CarParkKind park = CarParkKind.VISITOR;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal outputExpected = new BigDecimal("7.00");
        assertEquals(outputExpected, rate.calculate(new Period(8, 10)));
    }

    // calculate Test Case #2
    @org.junit.Test
    public void calculateTestTwo() {
        Rate rate;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(12);
        BigDecimal reducedRate = new BigDecimal(9);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(8, 13);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(5, 7);
        normalPeriods.add(normP);
        // Car Park
        CarParkKind park = CarParkKind.VISITOR;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal outputExpected = new BigDecimal(36);
        assertEquals(outputExpected, rate.calculate(new Period(8, 10)));
    }


    // calculate Test Case #3
    @org.junit.Test
    public void calculateTestThree() {
        Rate rate;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(15);
        BigDecimal reducedRate = new BigDecimal(10);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(10, 15);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(7, 10);
        normalPeriods.add(normP);
        // Car Park
        CarParkKind park = CarParkKind.MANAGEMENT;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal outputExpected = new BigDecimal(70);
        assertNotEquals(outputExpected, rate.calculate(new Period(9, 14)));
    }

    // calculate Test Case #4
    @org.junit.Test
    public void calculateTestFour() {
        Rate rate;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(5);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(10, 15);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(7, 10);
        normalPeriods.add(np);
        // Car Park
        CarParkKind park = CarParkKind.MANAGEMENT;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal outputExpected = new BigDecimal("10.00");
        assertEquals(outputExpected, rate.calculate(new Period(8, 9)));
    }

    // calculate Test Case #5
    @org.junit.Test
    public void calculateTestFive() {
        Rate rate;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = new BigDecimal(3);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(14, 16);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(10, 12);
        normalPeriods.add(np);
        // Car Park
        CarParkKind park = CarParkKind.STAFF;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal outputExpected = new BigDecimal("15.00");
        assertEquals(outputExpected, rate.calculate(new Period(9, 12)));
    }

    // calculate Test Case #6
    @org.junit.Test
    public void calculateTestSix() {
        Rate rate;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(6);
        BigDecimal reducedRate = new BigDecimal(3);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(15, 19);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(4, 10);
        normalPeriods.add(normP);
        // Car Park
        CarParkKind park = CarParkKind.STAFF;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal outputExpected = new BigDecimal(6);
        assertEquals(outputExpected, rate.calculate(new Period(15, 16)));
    }

    // calculate Test Case #7
    @org.junit.Test
    public void calculateTestSeven() {
        Rate rate;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(7);
        BigDecimal reducedRate = new BigDecimal(1);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(16, 18);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(8, 15);
        normalPeriods.add(np);
        // Car Park
        CarParkKind park = CarParkKind.VISITOR;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal outputExpected = new BigDecimal("0");
        assertEquals(outputExpected, rate.calculate(new Period(8, 9)));
    }

    // calculate Test Case 8
    @org.junit.Test
    public void calculateTestEight() {
        Rate rate;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(1);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(12, 15);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(5, 8);
        normalPeriods.add(np);
        // Car Park
        CarParkKind park = CarParkKind.MANAGEMENT;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal outputExpected = new BigDecimal("2");
        assertEquals(outputExpected, rate.calculate(new Period(6, 7)));
    }

    //Calculate Test Case #9

    @org.junit.Test
    public void calculateTestNine() {
        Rate rate;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(6.50);
        BigDecimal reducedRate = new BigDecimal(2);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(14, 18);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(6, 12);
        normalPeriods.add(np);
        // Car Park
        CarParkKind park = CarParkKind.STUDENT;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal outputExpected = new BigDecimal(6.50);
        assertEquals(outputExpected, rate.calculate(new Period(6, 7)));

    }

    //Calculate Test Case 10
    @org.junit.Test
    public void calculateTestTen() {
        Rate rate;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(2.45);
        BigDecimal reducedRate = new BigDecimal(1);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(15, 20);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(8, 12);
        normalPeriods.add(normP);
        // Car Park
        CarParkKind park = CarParkKind.STUDENT;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal outputExpected = new BigDecimal("2.45");
        assertEquals(outputExpected, rate.calculate(new Period(10, 11)));
    }

    // Calculate Test Case #11
    @org.junit.Test
    public void calculateTestEleven() {
        Rate rate;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(11.5);
        BigDecimal reducedRate = new BigDecimal(1);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(10, 19);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(3, 9);
        normalPeriods.add(normP);
        // Car Park
        CarParkKind park = CarParkKind.STUDENT;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal outputExpected = new BigDecimal("6.25");
        assertEquals(outputExpected, rate.calculate(new Period(3, 4)));
    }

    // Calculate Test Case 12
    @org.junit.Test
    public void calculateTestTwelve() throws IllegalArgumentException {
        Rate rate;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(9);
        BigDecimal reducedRate = new BigDecimal(7);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(17, 18);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(6, 16);
        normalPeriods.add(normP);
        // Car Park
        CarParkKind carPark = CarParkKind.MANAGEMENT;
        rate = new Rate(carPark, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal expectedValue = new BigDecimal(-4500);
        assertEquals(expectedValue, rate.calculate(new Period(8, 16)));
    }

    //Calculate Test Case 13
    @org.junit.Test
    public void calculateTestThirteen() throws IllegalArgumentException
    {
        Rate rate;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(9);
        BigDecimal reducedRate = new BigDecimal(7);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(16, 18);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(8, 15);
        normalPeriods.add(normP);
        // Car Park
        CarParkKind carPark = CarParkKind.STAFF;
        rate = new Rate(carPark, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal expectedValue = new BigDecimal(36);
        assertNotEquals(expectedValue, rate.calculate(new Period(8, 12)));
    }


    //Prev Test Cases from Task2
    //Below is new Test Cases for Task 3
    //Task 3, new spec edition

    //TEST 14 Passes now that the appropiate IReductionRate + StudentRate classes are setup
    //Furthermore this required changes to be made in the Rate class - via switch statements and a cost var being rounded equivalent to each carPark
    //STEP BY STEP:
    //Wrote test, ran test, test failed, made changes to Rate, created StudentRate
    //Re-ran tests, failed, made change to test (rRate > nRate) now: (rRate < nRate)
    //Ran the tests again. Test now passes
    @org.junit.Test
    public void calculateTestFourteen() throws IllegalArgumentException
    {
        Rate rate;

        //normalRate + reducedRate instances
        BigDecimal normalRate = new BigDecimal(5.5);
        BigDecimal reducedRate = new BigDecimal(3);

        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normPeriod = new Period (8, 15);
        normalPeriods.add(normPeriod);

        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedP = new Period(16, 18);
        reducedPeriods.add(reducedP);

        //Car Park Kind
        CarParkKind carPark = CarParkKind.STUDENT;
        rate = new Rate(carPark, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal expectedValue = new BigDecimal(5.5);
        Assert.assertEquals(expectedValue, rate.calculate(new Period(8, 9)));

    //
    }
    //TEST 15 -> Below 5.50 - STUDENT
    @org.junit.Test
    public void calculateTestFifteen() throws IllegalArgumentException
    {
        Rate rate;

        //normalRate + reducedRate instances
        BigDecimal normalRate = new BigDecimal(3);
        BigDecimal reducedRate = new BigDecimal(2);

        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normPeriod = new Period (8, 15);
        normalPeriods.add(normPeriod);

        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedP = new Period(16, 18);
        reducedPeriods.add(reducedP);

        //Car Park Kind
        CarParkKind carPark = CarParkKind.STUDENT;
        rate = new Rate(carPark, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal expectedValue = new BigDecimal(3);
        assertNotEquals(expectedValue, rate.calculate(new Period(8, 9)));

        //
    }

    //TEST 16 -> Above 5.50 - STUDENT
    // 5.50 + 4.50 reduced by 25% -> 1/4 (4.50) == 10.00 - 1.12500 = 8.875 => roundingValue => 9
    @org.junit.Test
    public void calculateTestSixteen() throws IllegalArgumentException
    {
        Rate rate;

        //normalRate + reducedRate instances
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(2);

        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normPeriod = new Period (8, 15);
        normalPeriods.add(normPeriod);

        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedP = new Period(16, 18);
        reducedPeriods.add(reducedP);

        //Car Park Kind
        CarParkKind carPark = CarParkKind.STUDENT;
        rate = new Rate(carPark, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal expectedValue = new BigDecimal("9");
        assertEquals(expectedValue, rate.calculate(new Period(8, 9)));

        //
    }
    //MANAGEMENT TESTS -MIN PAY == 3.00,
    // FIRST TEST (17) AT 3.00,
    // 2nd TEST(18)BELOW 3.00,
    // 3rd TEST (19) ABOVE 3.00...

    // = 3
    @org.junit.Test
    public void calculateTestSeventeen() throws IllegalArgumentException
    {
        Rate rate;

        //normalRate + reducedRate instances
        BigDecimal normalRate = new BigDecimal(3.00);
        BigDecimal reducedRate = new BigDecimal(2);

        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normPeriod = new Period (8, 15);
        normalPeriods.add(normPeriod);

        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedP = new Period(16, 18);
        reducedPeriods.add(reducedP);

        //Car Park Kind
        CarParkKind carPark = CarParkKind.STUDENT;
        rate = new Rate(carPark, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal expectedValue = new BigDecimal("3.00");
        assertEquals(expectedValue, rate.calculate(new Period(8, 9)));

        //
    }


}