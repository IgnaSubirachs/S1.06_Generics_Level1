public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ignasi","Subirachs",36);
        GenericMethods.printThreeArguments(person, "Hello World", 42);
        GenericMethods.printThreeArguments("First", "Second", "Third");
        GenericMethods.printThreeArguments(2.45,false,"ITAcademy");
    }
}
