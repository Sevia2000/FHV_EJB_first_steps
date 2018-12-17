package com.beans;

import javax.ejb.Remote;

@Remote
public interface IncreaseRemote {

    int increaseNumber(int incNumber);
}
