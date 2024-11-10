public class Main {
    public static void main(String[] args) {


        System.out.println("Задача 1");

        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний. ");

        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать.");
        }

        System.out.println("Задача 2");

        int temperature = 6;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }

        System.out.println("Задача 3");

        int speed = 61;
        boolean speeding = speed > 60;
        if (speeding) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        System.out.println("Задача 4");

        int ageHuman = 25;

        if (ageHuman >= 2 && ageHuman <= 6) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в детский сад.");
        }

        if (ageHuman >= 7 && ageHuman <= 17) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в школу.");
        }

        if (ageHuman >= 18 && ageHuman <= 24) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в университет.");
        }

        if (ageHuman > 24) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить на работу");
        }

        System.out.println("Задача 5");

        int ageKid = 13;

        if (ageKid < 5) {
            System.out.println("Если возраст ребенка равен " + ageKid + ", то ему нельзя кататься на аттракционе");
        }

        if (ageKid >=5 && ageKid < 14 ) {
            System.out.println("Если возраст ребенка равен " + ageKid + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }

        if (ageKid >= 14 ) {
            System.out.println("Если возраст ребенка равен " + ageKid + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        System.out.println("Задача 6");

        int humanWagon = 60;
        int placesWagon = 102;
        int sitPlaceWagon = 60;


        if (humanWagon < sitPlaceWagon) {
            System.out.println("В вагоне есть места для сидения");
        }
        if (humanWagon < placesWagon && humanWagon >= sitPlaceWagon) {
            System.out.println("В вагоне есть места для стояния");
        }
        if (humanWagon >= placesWagon) {
            System.out.println("В вагоне нет мест");
        }

        System.out.println("Задача 7");

        int one = 4;
        int two = 6;
        int three = 3;

        if (one >= two && one >= three) {
            System.out.println("Максимальное число равно " + one);
        } else {
            if (two >= three) {
                System.out.println("Максимальное число равно " + two);
            } else {
                System.out.println("Максимальное число равно " + three);
        }

            }

    }

}