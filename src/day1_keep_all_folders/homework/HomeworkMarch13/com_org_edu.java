package day1_keep_all_folders.homework.HomeworkMarch13;

public class com_org_edu {
    public static void main(String[] args) {
        int ourCounter = 0;
        int otherCounter = 0;
        String[] web = {"bing.com", " wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp", "mysql.com",
                " nasa.gov", "linkedin.com", "ucla.edu", "github.io", "spotify.com", "mozilla.org", "nba.com",
                "comcast.net", "tamu.edu", "utexas.edu"};
        System.out.println("web lenght = " + web.length);
       /* for (int i = 0; i < web.length; i++) {
            if (web[i].contains(".com")) {
                ourCounter++;
                if (web[i].contains(".org")) {
                    ourCounter++;
                    if (web[i].contains(".edu")) {
                        ourCounter++;
                    }
                }
            } else {
                otherCounter++;
            }
        }
        System.out.println("our counter = " + ourCounter);
        System.out.println("other counter = " + otherCounter);*/

        System.out.println("******************");

        for (String each : web) {
            if (each.contains(".com")) {
                ourCounter++;
                if (each.contains(".org")) {
                    ourCounter++;
                    if (each.contains(".edu")) {
                        ourCounter++;
                    }
                }
            } else {
                otherCounter++;

            }

        }
        System.out.println("ourCounter = " + ourCounter);
        System.out.println("otherCounter = " + otherCounter);
    }
}