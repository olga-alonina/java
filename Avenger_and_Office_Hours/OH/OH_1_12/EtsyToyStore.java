package OH.OH_1_12;

public class EtsyToyStore {
    public static void main(String[] args) {

        String sentence = "https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?ref=catnav-11049";

        int numStart = sentence.indexOf("toys");
        int numEnd = sentence.lastIndexOf("/toys");
//
        sentence = sentence.substring(numStart, numEnd);

        sentence = sentence.replace("-", " ");
        System.out.println("Main Category name is " + sentence);
        String sentence1 ="https://www.etsy.com/c/toys-and-entertainment?ref=catnav-11049";

        int numStart1 = sentence1.indexOf("toys");
        int numEnd1 = sentence1.lastIndexOf("?ref");
//
        sentence1 = sentence1.substring(numStart1, numEnd1);

        sentence1 = sentence1.replace("-", " ");
        System.out.println("Main Category name is " + sentence1);
    }
}
