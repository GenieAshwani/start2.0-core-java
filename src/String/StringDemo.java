package String;

public class StringDemo {

    public static void main(String[] args) {
        String s=new String("ashwani");
        System.out.println(s.hashCode());

        String concat = s.concat(" upadhayay");
        System.out.println(concat.hashCode());

    }
}
