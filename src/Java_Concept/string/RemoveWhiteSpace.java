package Java_Concept.string;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String str = "Ho  c Tie  ng A  n  h c h u a d  u g o    i l a s   u kh    ang c    u";

        // \\s cut Whitespace
        str = str.replaceAll("\\s", "");
        System.out.println(str);
    }
}
