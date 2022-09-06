package OH.OH_21_22.day_Date;

public class Address {
    private String street, city, state, zipCode, country;

    public Address(String street, String city, String state, String zipCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    public String getStreet() {

        return street;
    }

    public void setStreet(String street) {
        if (!street.isEmpty()) {
            this.street = street;
        } else {
            System.out.println( "The street name cannot be empty" );

        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    /*public void setCountry(String country) {//if we delete it country FDOR READ ONLY
        this.country = country;
    }*/

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        if (zipCode.length() == 5) {
            this.zipCode = zipCode;
        } else {
            System.out.println( "ZipCode length should be equal to 5" );
        }
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
