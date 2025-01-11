public class Coffee {
    String name;
    String roast;
    int caffeineLevelInMg;
    double price;

    public Coffee(String name, String roast, double price) {
        this.name = name;
        this.roast = roast;
        this.price = price;

        setCaffeineLevel();
    }

    public void setCaffeineLevel(){
        if (roast.equals("light")){
            caffeineLevelInMg=50;
        } else if (roast.equals("medium")) {
            caffeineLevelInMg=100;
        } else if (roast.equals("dark")) {
            caffeineLevelInMg=150;
        }else{
            caffeineLevelInMg=0;
        }
    }

    public void grindBean(){
        System.out.println("\nGranding beans for "+name+"...");
    }
    public void brewCoffee(){
        System.out.println("\nBrewing my favourite "+name+"...");
    }

    public void printInfo(){
        System.out.println("You ordered a "+name+" with a "+roast+" roast.");
        System.out.println("Caffeine level in your coffee is "+caffeineLevelInMg+" mg.");
    }



}
