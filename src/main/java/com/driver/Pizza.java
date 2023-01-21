package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheese;

    private int toppings;

    private int basePrice;

    boolean isExtraCheeseAdded;

    boolean isExtraToppingAdded;

    boolean isTakeAwayAdded;

    boolean isBillGenerated;

    public Pizza(Boolean isVeg)
    {
        this.isVeg = isVeg;
        this.isBillGenerated = false;
        this.isExtraCheeseAdded = false;
        this.isExtraToppingAdded = false;
        this.isTakeAwayAdded = false;
        this.bill = "";

        if (isVeg)
        {
            this.price = 300;
            this.toppings = 70;
        }
        else
        {
            this.price = 400;
            this.toppings = 120;
        }
        this.cheese = 80;
        this.bill += "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice()
    {
        return this.price;
    }

    public void addExtraCheese()
    {
        if (!isExtraCheeseAdded)
        {
            this.price = this.price + cheese;
            isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings()
    {
       if (!isExtraToppingAdded)
       {
           this.price = this.price + toppings;
           isExtraToppingAdded = true;
       }
    }

    public void addTakeaway()
    {
        if (!isTakeAwayAdded)
        {
            this.price = this.price + 20;
            isTakeAwayAdded = true;
        }
    }

    public String getBill()
    {
        if(!isBillGenerated){
            if(isExtraCheeseAdded) {
                this.bill += "Extra Cheese Added: "+this.cheese+"\n";
            }

            if(isExtraToppingAdded) {
                this.bill += "Extra Toppings Added: "+this.toppings+"\n";
            }

            if(isTakeAwayAdded) {
                this.bill += "Paperbag Added: 20" + "\n";
            }

            this.bill += "Total Price: " + this.price + "\n";
            isBillGenerated = true;
        }

        return this.bill;
    }
}
