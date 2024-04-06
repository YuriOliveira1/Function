public class Function_08 {
    public static int contarDigitos(int numero) {
        String numeroString = String.valueOf(numero);
        return numeroString.length();
    }

    public static void main(String[] args) {
        int numero = 12345;
        int quantidadeDigitos = contarDigitos(numero);
        System.out.println("O número " + numero + " possui " + quantidadeDigitos + " dígitos.");
    }
}