import java.util.Scanner;

public class lec12 {
    public static void main(String args[]) {
        // String
        // Declaration
        // String name = "Tony ";
        // String FullName = " Tony Stark";

        // String are Immutable

        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("Your name is " + name);

        // String Manipulation
        // 1]Concatenation

        // String firstName = "Tony";
        // String lastName = "Stark";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName);
        // System.out.println("Your name is " + firstName + " " + lastName);

        // // 2] Length
        // System.out.println(fullName.length());

        // // 3] charAt
        // for (int i = 0; i < fullName.length(); i++) {
        // System.out.println(fullName.charAt(i));
        // }

        // 4] comapre

        // String name1 = "Tony";
        // String name2 = "Tony";

        // s1 > s2 : +ve value
        // s1 == s2 : 0
        // s1 < s2 :-ve value

        // hello<wello
        // hello>cello
        // in string compare first char a is smallest and z is biggest a<z

        // if(name1.compareTo(name2) == 0){
        // System.out.println("Strings are equal");
        // }else{
        // System.out.println("Strings are not equal");
        // }

        // if(name1 == name2){
        // System.out.println("Strings are equal");
        // }else{
        // System.out.println("Strings are not equal");
        // }

        // if (new String("Tony") == new String("Tony")) {
        // System.out.println("Strings are equal");
        // } else {
        // System.out.println("Strings are not equal");
        // }

        // 7] substring

        String sentence = "My name is Tony";
        String sentence1 = "Tony Stark";

        // substring(beg index, end index)

        String name = sentence.substring(11, sentence.length());
        System.out.println(name);

        String name1 = sentence1.substring(0, 4);
        System.out.println(name1);

        String name2 = sentence1.substring(5);
        System.out.println(name2);

        sc.close();
    }
}
