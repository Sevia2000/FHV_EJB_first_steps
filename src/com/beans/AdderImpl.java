package com.beans;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless(mappedName = "AdderBean")
@Remote(AdderImplRemote.class)
public class AdderImpl implements AdderImplRemote {

    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
