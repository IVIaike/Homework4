public class Conditions {
    public static void main(String[] args) {

        //Задание 1
        System.out.println("Задание 1");
        int userAge = 21;
        if (userAge>=18) {
            System.out.println("Поздравляем Вас с совершеннолетием!");
        }
        if (userAge<18) {
            System.out.println("Ваше совершеннолетие еще впереди и вам нужно немного подождать!");
        }

        //Задание 2
        System.out.println("Задание 2");

        int humanAge = 25;
        if (humanAge>=7 && humanAge<18) {
            System.out.println("Ребенок ходит в школу.");
        }
        if (humanAge>=18 && humanAge<24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет!");
        }
        if (humanAge>=24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу!");
        }

        //Задание 3
        System.out.println("Задание 3");

        int vagonCapacity = 102;
        int seatingPlaces = 60;
        int standingPlaces = vagonCapacity - seatingPlaces;

        System.out.println("Вместимость одного вагона поезда составляет 102 человека. Вагон рассчитан на 60 сидячих мест, все остальные – " + standingPlaces + " стоячие.");

        int passengerNumber = 61;

        if (passengerNumber>102) {
            System.out.println("На этот рейс свободных мест нет");
        }
        if (passengerNumber>seatingPlaces && passengerNumber<102) {
            System.out.println("На этот рейс остались только стоячие места");
        }
        if (passengerNumber<=seatingPlaces) {
            System.out.println("На этот рейс есть свободные сидячие места.");
        }

        //Задание 2.1
        System.out.println("Задание 2.1");
        int anotherUserAge = 17;

        if (anotherUserAge>=18) {
            System.out.println("Поздравляем Вас с совершеннолетием!");
        }
        else
        {
            System.out.println("Ваше совершеннолетие еще впереди и вам нужно немного подождать!");
        }


    }
}