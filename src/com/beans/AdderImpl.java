package com.beans;

import javax.ejb.Stateless;

@Stateless(mappedName = "AdderBean")
public class AdderImpl implements AdderImplRemote {

    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
