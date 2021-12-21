package com.company;

public class Skeleton extends Boss {
    private int colStrike;

    public int getColStrike() {
        return colStrike;
    }

    public void setColStrike(int colStrike) {
        this.colStrike = colStrike;
    }
    public String printInfo(){
        return super.printInfo() + " " + getColStrike();
    }
}
