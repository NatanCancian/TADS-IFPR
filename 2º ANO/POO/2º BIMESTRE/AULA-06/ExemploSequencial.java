public class ExemploSequencial {
    public static void main(String[] args) {
        System.out.println("Cozinheiro começou o turno.");
        for (int i= 1; i <= 3; i++){
            System.out.println("Fritando Hamburger " + i);
        }
        for (int i= 1; i <= 3; i++){
            System.out.println("Montando Salada " + i);
        }
        System.out.println("Cozinheiro terminou o turno.");
    }
}
