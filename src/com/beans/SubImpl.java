package com.beans;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless(mappedName = "SubBean")
@Remote(SubImplRemote.class)
public class SubImpl implements SubImplRemote {

    @Override
    public int sub(int a, int b) {
        return a - b;
    }
}
