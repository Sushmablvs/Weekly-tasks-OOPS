public class StringPlay {
    public static void main(String[] args) {
        String college = new String ("Leeds Beckett University");
        String town = "Anytown, Uk";
        int stringLength = college.length();
        System.out.println(college + " contains " + stringLength + " characters");

        String change1 = college.toUpperCase();

        String change2 = change1.replace('e', '*');

        String change3 = college.concat(town);

        System.out.println("The final string is " + change3);
    }
}
