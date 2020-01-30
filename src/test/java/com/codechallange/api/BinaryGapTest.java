package com.codechallange.api;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BinaryGapTest {

    public static final int TWO = 2;
    public static final int FOUR = 4;
    public static final int FIVE = 5;
    public static final int NINE = 9;
    public static final int FIVEHUNDREDTWENTYNINE = 529;
    public static final int ONETHOUSANDFORTYONE = 1041;
    public static final int ZERO = 0;
    public static final int THIRTYTWO = 32;

    private int expectedValue;
    private int actualValue;

    @Before
    public void setup(){

    }

    @Test
    public void givenTheGapCountingAlgorithmAnalisysWhenReceivedNineShouldReturnTwoZerosGapsSizeSurroundedByOne() throws Exception {
        BinaryGap binaryGap = new BinaryGap();
        expectedValue = TWO;
        actualValue = binaryGap.solution(NINE);
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void givenTheGapCountingAlgorithmAnalisysWhenReceivedFiveHundredTwentyNineShouldReturnFourZerosGapsSizeSurroundedByOne() throws Exception {
        BinaryGap binaryGap = new BinaryGap();
        expectedValue = FOUR;
        actualValue = binaryGap.solution(FIVEHUNDREDTWENTYNINE);
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void givenTheGapCountingAlgorithmAnalisysWhenReceivedOneThousandFortyOneShouldReturnFiveZerosGapsSizeSurroundedByOne() throws Exception {
        BinaryGap binaryGap = new BinaryGap();
        expectedValue = FIVE;
        actualValue = binaryGap.solution(ONETHOUSANDFORTYONE);
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void givenTheGapCountingAlgorithmAnalisysWhenReceivedThirtyTwoShouldReturnZeroGapsSizeSurroundedByOne() throws Exception {
        BinaryGap binaryGap = new BinaryGap();
        expectedValue = ZERO;
        actualValue = binaryGap.solution(THIRTYTWO);
        Assert.assertEquals(expectedValue, actualValue);
    }

    @After
    public void tearDown(){

    }
}
