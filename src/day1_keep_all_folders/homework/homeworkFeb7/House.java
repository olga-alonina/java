package day1_keep_all_folders.homework.homeworkFeb7;

public class House {
    public static void main(String[] args) {
        String houseType = "Appartment";
        int numberOfBedrooms = 6;
        int numberOfBathroom = 3;
        int numberOfKitchen = 1;
        boolean isThereABasement = true;
        boolean isThereAnAttic = true;
        boolean isThereAPool = true;
        boolean isHouseForSale = true;
        double costOfTheHouse = 1_000_000;
        String address = "2689 Clark Street";
        int zipcode = 60156;
        boolean isAParkNearBy= false;
        double ratingOfSurroundingSchoolDistricts =4.6;
        System.out.println("I read something from newsletter about house that \n was sold last week in "+address+". " +
                "It was to much for our neiborhood "+zipcode+ " to sell\n "+ houseType+ " for "+costOfTheHouse+"$." +
                " I am really impressed how house with "+ numberOfBedrooms+" bedrooms, "+ numberOfBathroom
                +" batrooms, and only "+ numberOfKitchen+ " kitchen could cost it. May be it is because this house\n has " +
                isThereAnAttic+" attic and "+ isThereAPool+" beauty pool. Also its has "+isThereABasement+ "" +
                " basement. Is it "+isHouseForSale+ " this house was for sale not so long. Sad \nthat it" +
                " was "+ isAParkNearBy+ "informaition about park near by.");
    }
    //isThereABasement = true;
    //        boolean isThereAnAttic = true;
    //        boolean isThereAPool = true;
    //        boolean isHouseForSale = true;
}
