package com.practice.headfirst.factory;

/*蔬菜披萨*/
public class VeggiePizza extends Pizza{
    public VeggiePizza() {
        name = "VeggiePizza";
        sauce = "vegetables";
        dough = "面团";
        toppings.add("菠菜、芹菜、万能菜。。。");
    }
}
