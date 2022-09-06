package OH.OH_25_26.Homework_April_28;

public class City_Life {
    public static void main(String[] args) {
        Person news = new Person( "Alonina Olga", 34 ) {

            @Override
            public void hobby() {
                System.out.println( "Reading books" );
            }
        };
        System.out.println(news);
        System.out.println("*********************");
        Employee news1 = new Employee( "Zayarny Anna",
                28, "CEO", 250_000 ) {
            @Override
            public void work() {

            }

            @Override
            public void hobby() {

            }
        };System.out.println(news1);
        System.out.println("*********************");
        Tester news2 = new Tester( "Zayarny Daniel", 25,
                "Developer", 200_000 );
        news2.work();
        news2.hobby();
        System.out.println(news2);
        System.out.println("*********************");
        Chef news3 = new Chef( "Zayarny Alex",38,"Sushi master",
               60_000 );
        news3.work();
        news3.hobby();
        System.out.println(news3);
    }
}
