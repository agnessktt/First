package com.mycompany.app.Week2.Code2.AccessControl;

import com.mycompany.app.Week2.Code2.SourceAccessControl.debug;

public class Exercise5 {
    debug Debug = new debug();
    public int publicField = 10;
    private int privateField = 20;
    protected int protectedField = 30;

    public void publicMethod() {
        debug.Debug("This is a public method");
    }

    private void privateMethod() {
        debug.Debug("This is a private method");
    }

    protected void protectedMethod() {
        debug.Debug("This is a protected method");
    }
}
/* debug.java */