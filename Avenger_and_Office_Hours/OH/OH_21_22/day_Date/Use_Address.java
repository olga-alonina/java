package OH.OH_21_22.day_Date;

public class Use_Address {
    public static void main(String[] args) {
        Address news = new Address( "Rhodes ave", "River Grove", "Il", "60171", "USA" );
        System.out.println( news );
        System.out.println( "write data --> SETTER" );
        news.setCity( "Tysons" );

        System.out.println( " read data --> GETTER" );
        System.out.println( news.getCity() );

        System.out.println( "Make country name READ_ONLY" );

        //- Delete SETTER method for country name
        // cydeo.setCountry("");  IT is read_ONLY
        System.out.println( "Make zipCode WRITE_ONLY" );

        // - Delete GETTER
        // cydeo.getZipCode();
    }
}

