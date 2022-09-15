package demo_evolua;
// nome da classe - casa

public class Demo_Evolua {

    // mae
    public static void main(String[] args) {

        int valor = 10;
        calcula_int(valor);
        calcula_void(valor);

    }

    // metodo - ação
    public static void calcula_void(int valor) {
        int soma = valor + 10;
        System.out.println("Soma " + valor);
    }

    // metodo - ação
    public static int calcula_int(int valor) {
        int soma = valor + 10;
        System.out.println("Soma " + valor);
        return soma;
    }
    
    public static String retornoTexto(){
        return null; 
    }

}
