package org.dipti;

import org.springframework.stereotype.Component;

@Component
public class Obj1 {

    private String name;

    public Obj1() {
        this.name="Dipti rai";
    }

    public String getName() {
        return name;
    }
}
