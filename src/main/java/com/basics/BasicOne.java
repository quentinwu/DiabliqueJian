package com.basics;

import com.annotation.MyAnno;

/**
 * Created by quentin on 9/3/2017.
 */
public class BasicOne {
    private boolean indicator;

    public BasicOne(boolean b) {
        this.indicator = b;
    }

    @MyAnno(str="Apple pid", val=10992)
    public boolean getIndicator() {
        return indicator;
    }
    public void diabliqueJian(String s, int a) {

    }

    private void thisIsPrivate(int p, double o) {

    }

    protected void thisIsProtected(int q, float z, boolean b) {

    }
}
