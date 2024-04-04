package front;

public class Interface {
    public static void menu(String ... mensagens) {
        System.out.println("==========");
        for (int index = 0; index < mensagens.length; index++) {
            System.out.printf("[%d] %s \n", index + 1, mensagens[index]);
        }
    }
}
