package OH.OH_1_12;

public class myVision {
    public static void main(String[] args) {
        String sen = "ghghgaaadjfgkrkaaafkfkfk";
        //            012345678901234
        sen = sen.replaceAll(" ", "");
        int half = sen.length() / 2;
        String result = "";
        int count = 0;
        String copy2 = "";
        String copy = "";

        if (sen.length() % 2 == 0) {
            for (int i = half; i >= 0; i--) {
                copy2 = sen.substring(count + half, sen.length());
                copy = sen.substring(0, i);

                if (copy.equals(copy2)) {
                    break;
                } else {
                    count++;
                    if (count > half) {
                        System.out.println("There is no repetitive substring");
                    }
                }
            }
        } else {
            for (int i = half; i >= 2; i--) {
                copy2 = sen.substring(count + half, sen.length());
                copy = sen.substring(0, i + 1);

                if (copy.equals(copy2)) {
                    break;
                } else {
                    count++;
                    if (count > half) {
                        System.out.println("There is no repetitive substring");
                    }
                }
            }
        }
        System.out.println(copy);

    }
}

