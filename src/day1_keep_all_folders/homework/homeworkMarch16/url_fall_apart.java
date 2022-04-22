package day1_keep_all_folders.homework.homeworkMarch16;

public class url_fall_apart {
    public static void main(String[] args) {
        //Given a url as follows, print each section of the url separated by the forward slash /
        //	Example:
        //		url = https://learn.cydeo.com/courses/130
        String url = "https://learn.cydeo.com/courses/130";
        String[] newURL = url.split("/");
        for (String result : newURL) {
            System.out.println(result);

        }
    }
}
