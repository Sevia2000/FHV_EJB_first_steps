package com.beans;

import javax.ejb.Remote;
import javax.ejb.Stateful;

@Stateful(mappedName = "IncreaseBean")
@Remote(IncreaseRemote.class)
public class IncreaseImpl implements IncreaseRemote {

    private static final int STARTING_NUMBER = 10;
    private int currentNumber;

    public IncreaseImpl(){
        currentNumber = STARTING_NUMBER;
    }

    @Override
    public int increaseNumber(int incNumber) {
        currentNumber += incNumber;
        return currentNumber;
    }
}
