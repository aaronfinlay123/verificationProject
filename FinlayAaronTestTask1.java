package cm;

//DUE DATE: 24/02/21
//Author: Aaron Finlay
// 4th Year Soft Eng
// Black Box JUnit4 Test Cases
//Based of Equiv Part Classes derived from each test case.
//All numbers are associated with # Test Case
// 21 Rate Constructor tests
// 14
//Calculate Method tests

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static java.math.BigDecimal.valueOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FinlayAaronTestTask1
{
    // Rate Test Case #1
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCaseOne() throws IllegalArgumentException
    {
        Rate rate;
        //Rate Variations
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(6);

        //Normal Period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(6, 7);
        normalPeriods.add(normP);

        //Reduced Period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedP = new Period(8, 10);
        reducedPeriods.add(reducedP);

        //Car Park
        CarParkKind carPark = CarParkKind.STAFF;
        rate = new Rate(carPark, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }
    // Rate Test Case #2
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCaseTwo() throws IllegalArgumentException
    {
        Rate rate;
        //Rate Variations
        BigDecimal normalRate = new BigDecimal(-1);
        BigDecimal reducedRate = new BigDecimal(0);

        //Normal Period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(5, 6);
        normalPeriods.add(normP);

        //Reduced Period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedP = new Period(9,11);
        reducedPeriods.add(reducedP);

        //Car Park
        CarParkKind carPark = CarParkKind.MANAGEMENT;
        rate = new Rate(carPark, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }
    // Rate Test Case #3
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCaseThree() throws IllegalArgumentException
    {
        Rate rate;
        //Rate Variations
        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = new BigDecimal(3);

        //Normal Period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(8, 9);
        normalPeriods.add(normP);

        //Reduced Period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedP = new Period(10, 12);
        reducedPeriods.add(reducedP);
        Period reducedPeriod = new Period(13, 17);
        reducedPeriods.add(reducedPeriod);

        //Car Park
        CarParkKind carPark = CarParkKind.STUDENT;
        rate = new Rate(carPark, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }
    // Rate Test Case #4
    @org.junit.Test(expected = IllegalArgumentException.class)
        public void testCaseFour() throws IllegalArgumentException
    {
        Rate rate;
        //Rate Variations
        BigDecimal normalRate = null;
        BigDecimal reducedRate = new BigDecimal(0);

        //Normal Period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(5, 8);
        normalPeriods.add(normP);
        Period normPeriod = new Period(4, 6);
        normalPeriods.add(normPeriod);

        //Reduced Period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedP = new Period(1, 4);
        reducedPeriods.add(reducedP);

        Period redPeriod = new Period(9, 12);

        //Car Park
        CarParkKind carPark = CarParkKind.VISITOR;
        rate = new Rate(carPark, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }
    // Rate Test Case #5
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCaseFive() throws IllegalArgumentException
    {
        Rate rate;
        //Rate Variations
        BigDecimal normalRate = new BigDecimal(-1);
        BigDecimal reducedRate = new BigDecimal(0);

        //Normal Period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(4, 6);
        normalPeriods.add(normP);

        //Reduced Period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedP = new Period(2, 3);
        reducedPeriods.add(reducedP);
        Period reduceP = new Period(7, 10);
        reducedPeriods.add(reduceP);

        //Car Park
        CarParkKind carPark = CarParkKind.STAFF;
        rate = new Rate(carPark, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }
    // Rate Test Case #6
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCaseSix() throws IllegalArgumentException
    {
        Rate rate;
        //Rate Variations
        BigDecimal normalRate = new BigDecimal("4");
        BigDecimal reducedRate = new BigDecimal(2);

        //Normal Period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(5, 7);
        normalPeriods.add(normP);

        //Reduced Period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedP = new Period(1, 4);
        reducedPeriods.add(reducedP);

        //Car Park
        CarParkKind carPark = CarParkKind.STAFF;
        rate = new Rate(carPark, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }
    // Rate Test Case #7
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCaseSeven() throws IllegalArgumentException
    {
        Rate rate;
        //Rate Variations
        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = new BigDecimal("3");

        //Normal Period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(5, 8);
        normalPeriods.add(normP);

        //Reduced Period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedP = new Period(2, 4);
        reducedPeriods.add(reducedP);

        //Car Park
        CarParkKind carPark = CarParkKind.STAFF;
        rate = new Rate(carPark, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }
    // Rate Test Case #8
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCaseEight() throws IllegalArgumentException
    {
        Rate rate;
        //Rate Variations
        BigDecimal normalRate = new BigDecimal(21);
        BigDecimal reducedRate = new BigDecimal(-1);

        //Normal Period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(8, 10);
        normalPeriods.add(normP);

        //Reduced Period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedP = new Period(11, 12);
        reducedPeriods.add(reducedP);

        //Car Park
        CarParkKind carPark = CarParkKind.MANAGEMENT;
        rate = new Rate(carPark, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }
    // Rate Test Case #9
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCaseNine() throws IllegalArgumentException
    {
        Rate rate;
        //Rate Variations
        BigDecimal normalRate = new BigDecimal(9);
        BigDecimal reducedRate = null;

        //Normal Period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(6, 8);
        normalPeriods.add(normP);

        //Reduced Period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedP = new Period(9, 11);
        reducedPeriods.add(reducedP);

        //Car Park
        CarParkKind carPark = CarParkKind.STAFF;
        rate = new Rate(carPark, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    // Rate Test Case #10
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCaseTen() throws IllegalArgumentException
    {
        Rate rate;
        //Rate Variations
        BigDecimal normalRate = new BigDecimal(8);
        BigDecimal reducedRate = new BigDecimal(1);

        //Normal Period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(6, 8);
        normalPeriods.add(normP);

        //Reduced Period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedP = new Period(7, 10);
        reducedPeriods.add(reducedP);
        Period reduceP = new Period(8, 12);
        reducedPeriods.add(reduceP);

        //Car Park
        CarParkKind carPark = CarParkKind.VISITOR;

        rate = new Rate(carPark, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    // Rate Test Case #11
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCaseEleven() throws IllegalArgumentException
    {
        Rate rate;
        //Rate Variations
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(2);

        //Normal Period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(7, 10);
        normalPeriods.add(normP);
        Period normPeriod = new Period(8, 12);
        normalPeriods.add(normPeriod);

        //Reduced Period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedP = new Period(5, 8);
        reducedPeriods.add(reducedP);
        Period reduceP = new Period(1, 4);
        reducedPeriods.add(reduceP);

        //Car Park
        CarParkKind carPark = CarParkKind.MANAGEMENT;
        rate = new Rate(carPark, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    // Rate Test Case #12
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCaseTwelve() throws IllegalArgumentException
    {
        Rate rate;
        //Rate Variations
        BigDecimal normalRate = new BigDecimal(4);
        BigDecimal reducedRate = new BigDecimal(2);

        //Normal Period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(8, 12);
        normalPeriods.add(normP);
        Period normPeriod = new Period(7, 10);

        //Reduced Period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedP = new Period(5, 6);
        reducedPeriods.add(reducedP);
        Period reduceP = new Period(1, 4);

        //Car Park
        CarParkKind carPark = CarParkKind.STAFF;
        rate = new Rate(carPark, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    // Rate Test Case #13
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCaseThirteen() throws IllegalArgumentException
    {
        Rate rate;
        //Rate Variations
        BigDecimal normalRate = new BigDecimal(13);
        BigDecimal reducedRate = new BigDecimal(8);

        //Normal Period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(1, 2);
        normalPeriods.add(normP);

        //Reduced Period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedP = null;
        reducedPeriods.add(reducedP);

        //Car Park
        CarParkKind carPark = CarParkKind.MANAGEMENT;
        rate = new Rate(carPark, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    // Rate Test Case #14
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCaseFourteen() throws IllegalArgumentException
    {
        Rate rate;
        //Rate Variations
        BigDecimal normalRate = new BigDecimal(4);
        BigDecimal reducedRate = new BigDecimal(2);

        //Normal Period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(9, 10);
        normalPeriods.add(normP);
        Period normPeriod = null;

        //Reduced Period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedP = new Period(5, 8);
        reducedPeriods.add(reducedP);
        Period reduceP = new Period(1, 4);
        reducedPeriods.add(reduceP);

        //Car Park
        CarParkKind carPark = CarParkKind.STAFF;
        rate = new Rate(carPark, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    // Rate Test Case #15
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCaseFifteen() throws IllegalArgumentException
    {
        Rate rate;
        //Rate Variations
        BigDecimal normalRate = new BigDecimal(23);
        BigDecimal reducedRate = new BigDecimal(13);

        //Normal Period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(8, 12);
        normalPeriods.add(normP);
        Period normPeriod = new Period(7, 10);

        //Reduced Period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedP = new Period(4, 14);
        reducedPeriods.add(reducedP);
        Period reduceP = null;
        reducedPeriods.add(reduceP);

        //Car Park
        CarParkKind carPark = CarParkKind.STUDENT;
        rate = new Rate(carPark, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    // Rate Test Case #16
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCaseSixteen() throws IllegalArgumentException
    {
        Rate rate;
        //Rate Variations
        BigDecimal normalRate = new BigDecimal(21);
        BigDecimal reducedRate = new BigDecimal(17);

        //Normal Period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(9, 12);
        normalPeriods.add(normP);
        Period normPeriod = null;
        normalPeriods.add(normPeriod);


        //Reduced Period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedP = new Period(5, 7);
        reducedPeriods.add(reducedP);
        Period reduceP = new Period(1, 3);

        //Car Park
        CarParkKind carPark = CarParkKind.STAFF;
        rate = new Rate(carPark, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    // Rate Test Case #17
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCaseSeventeen() throws IllegalArgumentException
    {
        Rate rate;
        //Rate Variations
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(7);

        //Normal Period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(9, 10);
        normalPeriods.add(normP);
        Period normPeriod = new Period("hello!");
        normalPeriods.add(normPeriod);


        //Reduced Period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedP = new Period(5, 8);
        reducedPeriods.add(reducedP);
        Period reduceP = new Period(1, 3);
        reducedPeriods.add(reduceP);

        //Car Park
        CarParkKind carPark = CarParkKind.VISITOR;
        rate = new Rate(carPark, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }
    //Rate Test Case #18
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCaseEighteen() throws IllegalArgumentException
    {
        Rate rate;

        //Rate Variations
        BigDecimal normalRate = new BigDecimal(11);
        BigDecimal reducedRate = new BigDecimal(5);

        //Normal Period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(10, 12);
        normalPeriods.add(normP);
        Period normPeriod = new Period("13, 16");
        normalPeriods.add(normPeriod);

        //Reduced Period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedP = new Period(5, 9);
        reducedPeriods.add(reducedP);
        Period reduceP = new Period(1, 4);
        reducedPeriods.add(reduceP);

        CarParkKind carPark = CarParkKind.STAFF;
        rate = new Rate(carPark, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    // Rate Test Case #19
    @org.junit.Test()
    public void testCaseNineteen() throws IllegalArgumentException
    {
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(12);
        BigDecimal reducedRate = new BigDecimal(8);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(10,12);
        normalPeriods.add(normP);
        Period normPeriod = new Period(13,16);
        normalPeriods.add(normPeriod);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(4,9);
        reducedPeriods.add(reduceP);
        Period reducedP = new Period(11,5);
        reducedPeriods.add(reducedP);
        // Car Park
        CarParkKind carPark = CarParkKind.STAFF;
        rate = new Rate(carPark, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    // Rate Test Case #20
    @org.junit.Test()
    public void testCaseTwenty() throws IllegalArgumentException
    {
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(12);
        BigDecimal reducedRate = new BigDecimal(8);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(10,12);
        normalPeriods.add(normP);
        Period normPeriod = new Period(13,16);
        normalPeriods.add(normPeriod);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(4,9);
        reducedPeriods.add(reduceP);
        Period reducedP = new Period(-1,-2);
        reducedPeriods.add(reducedP);
        // Car Park
        CarParkKind carPark = CarParkKind.STAFF;
        rate = new Rate(carPark, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    // Rate Test Case #21
    @org.junit.Test()
    public void testCaseTwentyOne() throws IllegalArgumentException
    {
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(12);
        BigDecimal reducedRate = new BigDecimal(8);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(10,12);
        normalPeriods.add(normP);
        Period normPeriod = new Period(13,16);
        normalPeriods.add(normPeriod);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(-4,-9);
        reducedPeriods.add(reduceP);
        Period reducedP = new Period(3,4);
        reducedPeriods.add(reducedP);
        // Car Park
        CarParkKind carPark = CarParkKind.STAFF;
        rate = new Rate(carPark, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }




    // calculate Test Case #1
    @org.junit.Test
    public void calculateTestOne() throws IllegalArgumentException
    {
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(9);
        BigDecimal reducedRate = new BigDecimal(7);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(10,12);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(7,10);
        normalPeriods.add(normP);
        // Car Park
        CarParkKind carPark = CarParkKind.VISITOR;
        rate = new Rate(carPark, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal expectedValue = new BigDecimal(20);
        assertNotEquals(expectedValue, rate.calculate(new Period(8,10)));
    }

    // calculate Test Case #2
    @org.junit.Test
    public void calculateTestTwo() throws IllegalArgumentException
    {
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(9);
        BigDecimal reducedRate = new BigDecimal(7);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(11,13);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(6,9);
        normalPeriods.add(normP);
        // Car Park
        CarParkKind carPark = CarParkKind.STAFF;
        rate = new Rate(carPark, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal expectedValue = new BigDecimal("!???");
        assertNotEquals(expectedValue, rate.calculate(new Period(6, 10)));
    }
    // calculate Test Case #3
    @org.junit.Test
    public void calculateTestThree() throws IllegalArgumentException{
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(9);
        BigDecimal reducedRate = new BigDecimal(7);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(4,8);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(1,3);
        normalPeriods.add(normP);
        // Car Park
        CarParkKind carPark = CarParkKind.MANAGEMENT;
        rate = new Rate(carPark, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal expectedValue = new BigDecimal(60);
        assertNotEquals(expectedValue, rate.calculate(new Period(5,10)));
    }

    // calculate Test Case #4
    @org.junit.Test
    public void calculateTestFour() throws IllegalArgumentException
    {
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(9);
        BigDecimal reducedRate = new BigDecimal(7);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(11,20);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(7,10);
        normalPeriods.add(normP);
        // Car Park
        CarParkKind carPark = CarParkKind.STUDENT;
        rate = new Rate(carPark, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal expectedValue = new BigDecimal(555555555);
        assertNotEquals(expectedValue, rate.calculate(new Period(7,11)));
    }
    // calculate Test Case #5
    @org.junit.Test
    public void calculateTestFive() throws IllegalArgumentException
    {
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(9);
        BigDecimal reducedRate = new BigDecimal(7);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(20,23);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(1,10);
        normalPeriods.add(normP);
        // Car Park
        CarParkKind carPark = CarParkKind.STUDENT;
        rate = new Rate(carPark, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal expectedValue = new BigDecimal(.0);
        assertNotEquals(expectedValue, rate.calculate(new Period(21,1)));
    }

    // calculate Test Case #6
    @org.junit.Test
    public void calculateTestSix() throws IllegalArgumentException
    {
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(9);
        BigDecimal reducedRate = new BigDecimal(7);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(10,15);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(7,10);
        normalPeriods.add(normP);
        // Car Park
        CarParkKind carPark = CarParkKind.MANAGEMENT;
        rate = new Rate(carPark, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal expectedValue = new BigDecimal(50);
        assertNotEquals(expectedValue, rate.calculate(new Period(9,14)));
    }
    // calculate Test Case #7
    @org.junit.Test
    public void calculateTestSeven() throws IllegalArgumentException
    {
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(9);
        BigDecimal reducedRate = new BigDecimal(7);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(12,15);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(7,10);
        normalPeriods.add(normP);
        // Car Park
        CarParkKind carPark = CarParkKind.VISITOR;
        rate = new Rate(carPark, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal expectedValue = new BigDecimal(-1);
        assertNotEquals(expectedValue, rate.calculate(new Period(9,14)));
    }
    // calculate Test Case #8
    @org.junit.Test
    public void calculateTestEight() throws IllegalArgumentException
    {
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(9);
        BigDecimal reducedRate = new BigDecimal(7);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(16,18);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(8,15);
        normalPeriods.add(normP);
        // Car Park
        CarParkKind carPark = CarParkKind.STAFF;
        rate = new Rate(carPark, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal expectedValue = new BigDecimal("staff");
        assertEquals(expectedValue, rate.calculate(new Period(9,12)));
    }

    // calculate Test Case #9
    @org.junit.Test
    public void calculateTestNine() throws IllegalArgumentException
    {
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(9);
        BigDecimal reducedRate = new BigDecimal(7);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(16,18);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(8,15);
        normalPeriods.add(normP);
        // Car Park
        CarParkKind carPark = CarParkKind.VISITOR;
        rate = new Rate(carPark, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal expectedValue = new BigDecimal(9000);
        assertNotEquals(expectedValue, rate.calculate(new Period(9,12)));
    }

    // calculate Test Case #10
    @org.junit.Test
    public void calculateTestTen() throws IllegalArgumentException
    {
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(9);
        BigDecimal reducedRate = new BigDecimal(7);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(19,23);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(8,15);
        normalPeriods.add(normP);
        // Car Park
        CarParkKind park = CarParkKind.STAFF;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal expectedValue = new BigDecimal("1000000");
        assertNotEquals(expectedValue, rate.calculate(new Period(9,12)));
    }
    // Calculate Test Case #11
    @org.junit.Test
    public void calculateTestEleven() throws IllegalArgumentException
    {
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(9);
        BigDecimal reducedRate = new BigDecimal(7);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(16,18);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(8,15);
        normalPeriods.add(normP);
        // Car Park
        CarParkKind park = CarParkKind.STAFF;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal expectedValue = null;
        assertNotEquals(expectedValue, rate.calculate(new Period(9,12)));
    }
    // calculate Test Case #12
    @org.junit.Test
    public void calculateTestTwelve() throws IllegalArgumentException
    {
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(9);
        BigDecimal reducedRate = new BigDecimal(7);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(16,18);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(8,15);
        normalPeriods.add(normP);
        // Car Park
        CarParkKind carPark = CarParkKind.VISITOR;
        rate = new Rate(carPark, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal expectedValue = new BigDecimal(40.056320);
        assertEquals(expectedValue, rate.calculate(new Period(9,12)));
    }
    @org.junit.Test
    public void calculateTestThirteen() throws IllegalArgumentException
    {
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(9);
        BigDecimal reducedRate = new BigDecimal(7);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(16,18);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(8,15);
        normalPeriods.add(normP);
        // Car Park
        CarParkKind carPark = CarParkKind.STAFF;
        rate = new Rate(carPark, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal expectedValue = new BigDecimal("?><()H$!");
        assertNotEquals(expectedValue, rate.calculate(new Period(8,12)));
    }

    @org.junit.Test
    public void calculateTestFourteen() throws IllegalArgumentException
    {
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(9);
        BigDecimal reducedRate = new BigDecimal(7);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(17,18);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normP = new Period(6,16);
        normalPeriods.add(normP);
        // Car Park
        CarParkKind carPark = CarParkKind.MANAGEMENT;
        rate = new Rate(carPark, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal expectedValue = new BigDecimal(-4500);
        assertEquals(expectedValue, rate.calculate(new Period(8,16)));
    }


}
