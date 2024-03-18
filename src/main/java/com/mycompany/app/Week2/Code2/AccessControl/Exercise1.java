package com.mycompany.app.Week2.Code2.AccessControl;

/*Exercise 1: Create a class in a package. Create an instance of your class outside of that
package */

import com.mycompany.app.Week2.Code2.SourceAccessControl.MyClass;

public class Exercise1 {
    public static void AccessControlE1 () {
        MyClass myObject = new MyClass(); // Create an instance of MyClass
        myObject.myMethod(); // Call the method on the object
    }
}

/*MyClass.java thuộc phạm vi bài tập 1*/
