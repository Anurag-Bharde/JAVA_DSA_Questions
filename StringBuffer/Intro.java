package StringBuffer;

public class Intro {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append("allinone");
        System.out.println(sb.capacity());
        sb.append("aaara");
        sb.reverse();
        System.out.println(sb);

    }
}
