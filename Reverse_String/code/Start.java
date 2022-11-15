import java.util.Scanner;

class Start {
    public static void main(String[] data) {
    Scanner in = new Scanner(System.in);
    String word = in.nextLine();
    System.out.println(useCollection(word));
    }
    public static String useCollection(String word){
        if(word.equalsIgnoreCase(""))return "";
        StringBuilder wd = new StringBuilder(word);
        return wd.reverse().toString();
    }
}    
    
