package by.control.two.service;

/**
 * Hello world!
 */
public class App {
    public static String getHelloService() {
        return by.control.two.repository.App.getHelloRepository() + "Hello from Service! ";
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
