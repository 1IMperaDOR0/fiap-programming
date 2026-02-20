public class Operadores {
    public static void main(String[] args) {
        int x = 5;
        float y = 5.5f;
        double z = x + y;

        System.out.println(z);

        for(int i = 0; i < 10; ++i) {
            i += 1;
            System.out.println("\nTabuada do " + i + ":\n");    
            for(int j = 0; j < 11; ++j) {
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }
    }
}