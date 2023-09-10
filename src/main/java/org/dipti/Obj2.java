package org.dipti;

import org.springframework.stereotype.Component;

@Component
public class Obj2 {
    private String color;


    public Obj2() {
        this.color="Blue";
    }

    public String getName2() {
        return color;
    }
}
