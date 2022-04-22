package day1_keep_all_folders.April.April_10_day_43;

public class Address {
    String street;
    String city;
    String state;
    String zipcode;

/*public Address(  String inputStreet,String inputCity, String inputState,String inputZipcode){
street=inputStreet;
city=inputCity;
state=inputState;
zipcode=inputZipcode;
}*/
    public Address(  String street,String city, String state,String zipcode){
        this.street=street;
        this.city=city;
        this.state=state;
        this.zipcode=zipcode;
    }
}