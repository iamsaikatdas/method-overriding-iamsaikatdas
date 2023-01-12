package com.driver;

public class Main {
  public void main(String[] args) {
    B obj = new B();
    System.out.println(obj.meth());
  }

  class A {
    public String meth() {
      return "I am in A's meth";
    }
  }

  class B extends A {
    public String meth() {
      return "I am in B's meth";
    }
  }
}