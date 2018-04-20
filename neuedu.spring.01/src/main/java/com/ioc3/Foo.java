package com.ioc3;

public class Foo {

    private Baz baz;
    private Bar bar;

    public Baz getBaz() {
        return baz;
    }

    public void setBaz(Baz baz) {
        this.baz = baz;
    }

    public Bar getBar() {
        return bar;
    }

    public void setBar(Bar bar) {
        this.bar = bar;
    }

    public Foo() {
        System.out.println("Foo()");
    }

    public void handler() {
        bar.say();
    }


}
