package day1_keep_all_folders.March.day20Practice;

public class SmsParts {
    public static void main(String[] args) {

        String msg = "Sender: <James Bond>. From Number: [202-123-3456].Message: {“I love programming and Problem solving}";
        int senderStart = msg.indexOf('<');
        int senderEnd = msg.indexOf('>');

        int numberStart=msg.indexOf('[');
        int numberEnd=msg.indexOf(']');

        int messStart=msg.indexOf('{');
        int messEnd=msg.indexOf('}');

        System.out.println("Sender: "+msg.substring(senderStart+1, senderEnd));
        System.out.println("Numbr: "+ msg.substring(numberStart+1,numberEnd));
        System.out.println("Message: "+msg.substring(messStart+1,messEnd));

            }
}
