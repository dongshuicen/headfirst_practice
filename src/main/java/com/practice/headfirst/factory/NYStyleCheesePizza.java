package com.practice.headfirst.factory;

/*纽约风味奶酪披萨*/
public class NYStyleCheesePizza extends Pizza{
    public NYStyleCheesePizza() {
        super.name = "NY Style Sauce and Cheese Pizza";//纽约风格的沙司和芝士披萨
        dough = "Thin Crust Dough";//薄的地壳面团
        sauce = "Marinara Sauce";//加番茄酱

        toppings.add("Grated Reggiano Cheese");//碎雷奇亚干酪奶酪
    }

}
