package app;

public class Lessons11Solutions {

    public static void main(String[] args){

        //Створіть об'єкти класу Person для трьох різних осіб, використовуючи конструктор класу Person.
        // Виведіть інформацію про цих осіб на екран.
         Person jons = new Person("Jons",30, "Інженер");
         Person mary = new Person("Mary",30, "Вчитель");
         Person bob = new Person("Bob",30, "Лікар");

         jons.printPerson();
         mary.printPerson();
         bob.printPerson();

         Person.printLn();

         //Використання метода для зміни професії одного з об'єктів Person,
        // а потім виведіть оновлену інформацію про цю особу на екран.
        Person alice = new Person("Alice",30, "Лікар");

        alice.printPerson();

        alice.setProfession("Дизайнер");

        Person.printLn("(Після оновлення професії)");
        alice.printPerson();




    }
}
