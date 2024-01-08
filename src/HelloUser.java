public class HelloUser {

    public static void helloUser(String user_name) {
        String name = "Вячеслав";

        if (name.equals(user_name)) {
            System.out.println("Привет, " + user_name);
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
