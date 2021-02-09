package example;

import com.avs.Single;

public class Hello {
    public static void main(String[] args){
        System.out.println("hello");
        var f = new Holla();
        f.print();
        new Holla().print();
        Holla.Companion.a();
    }
}
