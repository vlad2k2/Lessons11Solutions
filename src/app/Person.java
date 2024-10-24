package app;

//Створіть клас Person, який представляє особу з такими характеристиками: ім'я, вік та професія.
// Оголосіть поля для цих характеристик та створіть конструктор класу,
// який дозволяє встановити значення цих полів при створенні об'єкта класу Person.
public class Person {

    String name;
    int age;
    String profession;

    //Конструктор з параметрами
    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    //Додайте метод в клас Person, який дозволяє встановити нову професію для особи.
    // Використайте цей метод для зміни професії одного з об'єктів Person,
    // а потім виведіть оновлену інформацію про цю особу на екран.
    public void setProfession(String newProfession) {
        this.profession = newProfession;
    }


    //Виведіть інформацію про осіб на екран.
    public void printPerson(){

        System.out.printf("Ім'я: %s, Вік: %d, Професія: %s%n", name, age, profession);
    }

    //Пуста строка для разділення завдання
    public static void printLn(){

        System.out.println();
    }

    // Метод для виведення тексту з новою строкою
    public static void printLn(String text) {
        System.out.println(text);
    }

}
