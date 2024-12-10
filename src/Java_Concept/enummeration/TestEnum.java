package Java_Concept.enummeration;

public class TestEnum {
    public static void main(String[] args) {
        System.out.println(EnumExample.SUNDAY);

        String str = EnumExample.SUNDAY.toString();

        // Iterate all the values in the enum
        for(EnumExample day: EnumExample.values()) {
            System.out.println(day);
        }

        // Retrieve the Index of Enum constants
        for(EnumExample day: EnumExample.values()) {
            System.out.println(day.ordinal());
        }
    }
}
