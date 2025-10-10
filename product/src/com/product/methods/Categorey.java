package com.product.methods;

public class Categorey {

    public int categoreyId;
    public String categoreyName;

    public Categorey(int categoreyId,String categoreyName){
        this.categoreyId=categoreyId;
        this.categoreyName=categoreyName;
    }

    //access modifier returntype methodName()
    public int getCategoreyId(){
        return categoreyId;
    }

    public String getCategoreyName(){
        return categoreyName;
    }

}
