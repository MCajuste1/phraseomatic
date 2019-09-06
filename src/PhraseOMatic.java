public class PhraseOMatic {
    public static void main (String[] args) {
        String[] wordListOne = {
                "2020",
                "2019",
                "2018",
                "2017",
                "2016",
                "2015",
                "2014",
                "2013",
                "2012",
                "2011",
                "2010",
                "2009",
                "2008"
        };

        String[] wordListTwo = {
                "Ford",
                "Lycansport",
                "BMW",
                "Mercedes",
                "Mustang",
                "Honda",
                "Bently",
                "Maserati",
                "Audi",
                "Toyota",
                "Nissan",
                "Ford Jeep",
                "Acura"
        };

        String[] wordListThree = {
                "all day",
                "on Mondays",
                "on Fridays",
                "every day of the week",
                "all month",
                "at nights",
                "at evenings",
                "at some point",
                "at full speed",
                "on Sundays",
                "on Tuesdays",
                "once a week"
        };

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random()* oneLength);
        int rand2 = (int) (Math.random()* twoLength);
        int rand3 = (int) (Math.random()* threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("What we swerve in is a " + phrase);
    }

}