public class Ex01 {
    public static void main(String[] args) {
        Cozinheiro tarefa = new Cozinheiro("João Pedro");

        Thread thread = new Thread(tarefa);

        thread.start();

        System.out.println("Pedi para o João e fui trabalhar ");

    }

}
