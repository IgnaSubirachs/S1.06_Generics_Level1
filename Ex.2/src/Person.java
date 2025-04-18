public class Person {

        private String name;
        private String surname;
        private int age;

        // Constructor
        public Person(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

    @Override
    public String toString() {
        return "Person: " + name + " " + surname + ", age: " + age;
    }
}


