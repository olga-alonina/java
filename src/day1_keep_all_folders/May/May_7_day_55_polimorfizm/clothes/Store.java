package day1_keep_all_folders.May.May_7_day_55_polimorfizm.clothes;

public class Store {
    public static void main(String[] args) {
        //all possible obj of TShirt
        TShirt tshirt = new TShirt();//itself
        tshirt.wear();
        Clothes tshirt1 = new TShirt();//parent
        tshirt1.wear();
        Object thirt2 = new TShirt();//
        // Object class does not have  reference to "wear()" method
        // tshirt2.wear();
        //  HasHood thirt3 = new TShirt();
        // have no implement btw hashood and tshirt
        System.out.println( "*******Jacket objects*******" );
        Jacket jacket1 = new Jacket(); // reference of itself
        jacket1.wear();
        jacket1.putOnHood();

        Clothes jacket2 = new Jacket(); // reference of the super class
        jacket2.wear();
//        jacket2.putOnHood(); Clothes reference does not have access to a putOnHood()

        Object jacket3 = new Jacket(); // reference of super class Object
//        jacket3.wear();
//        jacket3.putOnHood();
        //Object class does not have reference to wear() or putOnHood() methods

        HasHood jacket4 = new Jacket();
//        jacket4.wear(); HasHood reference does not have visibility to wear() method
        jacket4.putOnHood();
        System.out.println("****buy method******");
        buy(tshirt1);
        buy(jacket1);
        buy(new TShirt());
        buy(new Jacket());
    }

    public static void buy(Clothes clothes){
        if(clothes instanceof TShirt){
            System.out.println("Bought TShirt");
        } else if(clothes instanceof Jacket){
            System.out.println("Bought a cool Jacket");
        }
    }
//    public static void buy(Jacket jacket){
//
//    }

//    public static void buy(TShirt tShirt){
//
//    }


}