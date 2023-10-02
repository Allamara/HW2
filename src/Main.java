public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var dog2 = 8.0 + 4;
        var cat2 = 3.6 + 4;
        var paper2 = 763789 + 4;
        System.out.println(dog2);
        System.out.println(cat2);
        System.out.println(paper2);

        var dog3 = 8.0 - 3.5;
        var cat3 = 3.6 - 1.6;
        var paper3 = 763789 - 7639;
        System.out.println(dog3);
        System.out.println(cat3);
        System.out.println(paper3);

        var friend = 19;
        System.out.println(friend);
        var friendVersion2 = 19 + 2;
        System.out.println(friendVersion2);
        var friendVersion3 = friendVersion2 + 7;
        System.out.println(friendVersion3);

        var frog = 3.5;
        System.out.println(frog);
        var frogVariant2 = 3.5 * 10;
        System.out.println(frogVariant2);
        var frogVariant3 = frogVariant2 / 3.5;
        System.out.println(frogVariant3);
        var frogVariant4 = frogVariant3 + 4;
        System.out.println(frogVariant4);

        var boxerAndrew = 78.2;
        var boxerAntony = 82.7;
        var totalBoxersWeight = boxerAndrew + boxerAntony;
        System.out.println(totalBoxersWeight);
        var boxersWeightDifference = boxerAntony - boxerAndrew;
        System.out.println(boxersWeightDifference);

        var boxersWeightDifferenceMinus = boxerAntony - boxerAndrew;
        System.out.println(boxersWeightDifferenceMinus);
        var boxersWeightDifferencePercentage = boxerAntony % boxerAndrew;
        System.out.println(boxersWeightDifferencePercentage);
    }
}