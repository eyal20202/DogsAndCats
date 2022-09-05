package com.eyal.exam.DogAndCat;

import java.io.Serializable;

public class Breeds implements Serializable {
    String primary;

    public String getPrimary() {
        return primary;
    }

    public void setPrimary(String primary) {
        this.primary = primary;
    }
}
