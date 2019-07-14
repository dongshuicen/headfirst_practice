package com.practice.headfirst.factory;

/*芝加哥风味奶酪披萨*/
public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";//芝加哥风格的深盘芝士披萨
        //面团
        dough = "Extra Thick Crust Dough";//特厚面团
        //酱料
        sauce = "Plum Tomato Sauce";//李子番茄酱
        toppings.add("Shredded Mozzarella Cheese");//马苏里拉奶酪丝
    }
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
