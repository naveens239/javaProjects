public class BooleanComparisons {
    public static void main(String[] args) {
        int chemistryGrade = 95;
        int biologyGrade = 75;
        int englishGrade = 75;
        System.out.println(biologyGrade > chemistryGrade);
        System.out.println(englishGrade >= chemistryGrade);

        double sales = 37.75;
        double costs = 5.55;
        System.out.println(sales > costs);

        String sentence = "I love this course!";
        String sentence2 = "I love this course!";
        System.out.println(!sentence.equals(sentence2));

    }
}
