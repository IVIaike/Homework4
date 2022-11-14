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

        int humanAge = 19;
        if (humanAge>=7) {
            System.out.println("Ребенок ходит в школу.");
        }
        if (humanAge>=18) {
            System.out.println("Человек уже закончил школу и может отправляться в университет!");
        }
        if (humanAge>=24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу!");
        }
    }
}