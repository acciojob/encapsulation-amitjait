package com.driver;

public class Main {
  public static void main(String[] args) {
    RWOnly obj = new RWOnly();
    /*  obj.name = "Amit"; will get an error ands need to implement setter function to set the name and for getting the name 
     need to implement getter() */
    obj.setter("AccioJob");
    System.out.println(obj.getter());

  }
}