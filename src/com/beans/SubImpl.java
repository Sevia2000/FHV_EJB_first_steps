package com.beans;

import javax.ejb.Stateless;

@Stateless(mappedName = "SubBean")
public class SubImpl implements SubImplRemote {

    @Override
    public int sub(int a, int b) {
        return a - b;
    }
}
