import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        int[][] matriz = new int[10][10];
        Random gerador = new Random();
        int maior = 0;
        int menor = 0;

        System.out.println(); //quebra de linha

        // valores que a matriz recebera, usando gerador de numeros para preencher
        System.out.println("Valores presentes na matriz 10x10: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                int x = gerador.nextInt(9) + 1;
                matriz[i][j] = x;

                // verificar qual o maior valor da matriz
                if (x > maior) {
                    maior = x;

                }
                // verificar o menor valor da matriz
                if (x < menor) {
                    menor = x;

                }
            }

        }
        // imprimir a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); //quebra de linha
        }

        // imprimir a diagonal principal
        System.out.println();
        System.out.println("Diagonal Principal");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println(); //quebra de linha
        System.out.println(); //quebra de linha

        // imprimir diagonal secundaria
        System.out.println("Diagonal Secundaria");

        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][matriz.length - 1 - i] + " ");
        }
        System.out.println(); //quebra de linha
        System.out.println(); //quebra de linha

        // imprimir triangulo superior
        System.out.println("Triangulo superior");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (j < i + 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(matriz[i][j]);
                }
            }
            System.out.println(); //quebra de linha
        }

        // imprimir triangulo inferior
        System.out.println("Triangulo inferior");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i < j + 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println(); //quebra de linha
        }

        // imprimir o maior e menor numero da matriz
        System.out.println(); //quebra de linha
        System.out.println("O número de maior valor dentro da matriz: " + maior);
        System.out.println(); //quebra de linha
        System.out.println("O número de menor valor dentro da matriz: " + menor);
        System.out.println(); //quebra de linha
    }

}
