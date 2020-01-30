package com.codechallange.api;

import java.util.ArrayList;

public class BinaryGap {
    public int solution(int N) {
        String binaryRepresentationOfTheGivenN = Integer.toBinaryString(N);

        int theGreatestGapThatIGotUntilNow = 0;

        ArrayList<Integer> ListOfPositionsOfNumbersOneFound = new ArrayList<>();

        for (int i = 0; i < binaryRepresentationOfTheGivenN.length(); i++) {
            if (binaryRepresentationOfTheGivenN.charAt(i) == '0') continue;
            ListOfPositionsOfNumbersOneFound.add(i);
        }

        for (int i = 0; i < ListOfPositionsOfNumbersOneFound.size() - 1; i++) {
            int NewGapFound = ListOfPositionsOfNumbersOneFound.get(i + 1) - ListOfPositionsOfNumbersOneFound.get(i) - 1;

            theGreatestGapThatIGotUntilNow = WhoIsGreater(theGreatestGapThatIGotUntilNow, NewGapFound);
        }
        return theGreatestGapThatIGotUntilNow;
    }

    private int WhoIsGreater(int a, int b){
        if(a>=b){
            return a;
        }
        return b;
    }
}