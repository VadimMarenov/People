public class Main {
    public static void main(String[] args) {

        Person father = new PersonBuilder()
                .setName("Антошка")
                .setSurname("Лопатов")
                .setAge(48)
                .setAddress("Moscow")
                .build();

        Person son = father.newChildBuilder()
                .setName("Миша")
                .build();

        System.out.println(father + "\n" + son);
    }
}
