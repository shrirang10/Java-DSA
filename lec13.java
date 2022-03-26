public class lec13 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

        // char at index 0
        // System.out.println(sb.charAt(0));

        // // set char at index 0
        // sb.setCharAt(0,'p');
        // System.out.println(sb);

        // // insert
        // sb.insert(0, 's');
        // System.out.println(sb);

        // sb.insert(2,'t');
        // System.out.println(sb);

        // // delete
        // sb.delete(0,2);
        // System.out.println(sb);

        // // sb.delete(2,3);
        // // System.out.println(sb);

        // // append
        // sb.append(" ");
        // sb.append("s");
        // sb.append("t");
        // sb.append("a");
        // sb.append("r");
        // sb.append("k");
        // System.out.println(sb);
        // System.out.println(sb.length());

        // reversal of string

        for (int i = 0; i <= sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i; // 5-1-0=>4

            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println(sb);
        for (int i =sb.length()-1; i>=0; i--) {
        System.out.print(sb.charAt(i) + " ");
        }
    }
}
