package com.mycompany.app.Week2.Code2.AccessControl;

/* Exercise 2: Take the code fragments in this section and turn them into a program,
and verify that collisions do in fact occur.  */

//import net.mindview.simple.*; (Gây ra xung đột nếu không chỉ định đầy đủ các tên do trình biên dịch không biết Vector muốn xử dụng từ gói nào)
import java.util.*;

public class Exercise2 {
    Vector v = new Vector();
}