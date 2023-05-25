package s7_actividadgrupalmatrices;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.security.SecureRandom;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author kelvi
 */
public class Acciones {

 
    int[] temp = new int[2];
    
    
    ActionListener ejercicio1;
    ActionListener ejercicio2;
    ActionListener ejercicio3;
    ActionListener ejercicio4;
    ActionListener ejercicio5;
    ActionListener ejercicio6;
    ActionListener ejercicio7;
    ActionListener ejercicio8;
    ActionListener ejercicio9;
    ActionListener ejercicio10;
    ActionListener ejercicio11;
    ActionListener ejercicio12;
    ActionListener buscaMina;
    
    

    static enum Estado {
        UNO, DOS
    };
    Estado prop;
    static SecureRandom num_ram = new SecureRandom();

    //contructores
    public Acciones() {
        
        //fila.setPreferredSize(new Dimension(250, 40));
        
        
        this.ejercicio1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TextFilCol();
            }

        };// ejercicio 1

        this.ejercicio2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prop = Estado.DOS;
                int[] filColum = obtenerFilCol();
                int[][] a, b;

                a = lectura(filColum[0], filColum[1]);
                b = lectura(filColum[0], filColum[1]);

                int[][] suma = matrizSumaDos(a, b);

                JOptionPane.showMessageDialog(null,
                        imprimirDos(a, b) + "\nResultado Suma\n"
                        + imprimir(suma, prop));
            }

        };

        this.ejercicio3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prop = Estado.UNO;
                int[] filColum = obtenerFilCol();

                int[][] matriz = lectura(filColum[0], filColum[1]);

                JOptionPane.showMessageDialog(null, "Matriz\n"
                        + imprimir(matriz, prop) + "\nResultado Suma:\n"
                        + sumaMatriz(matriz));
            }
        };

        this.ejercicio4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prop = Estado.UNO;
                int[] filColum = obtenerFilCol();

                int[][] matriz = lectura(filColum[0], filColum[1]);
                int n_may = numeroMayor(matriz);

                JOptionPane.showMessageDialog(null, "Matriz\n"
                        + imprimir(matriz, prop) + "\nNumero Mayor:\n"
                        + n_may);
            }
        };

        this.ejercicio5 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prop = Estado.UNO;
                JOptionPane.showMessageDialog(null,
                        "La matriz debe ser cuadrada.");

                int[] filColum = obtenerFilCol();

                int[][] matriz = lectura(filColum[0], filColum[1]);

                JOptionPane.showMessageDialog(null, "Matriz\n"
                        + imprimir(matriz, prop) + "\nSuma de diagonales:\n"
                        + sumaDiagonal(matriz));
            }
        };

        this.ejercicio6 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prop = Estado.UNO;
                JOptionPane.showMessageDialog(null,
                        "La matriz debe ser cuadrada.");

                int[] filColum = obtenerFilCol();

                int[][] matriz = lectura(filColum[0], filColum[1]);

                JOptionPane.showMessageDialog(null, "Matriz\n"
                        + imprimir(matriz, prop) + "\nSuma de diagonales a reves:\n"
                        + sumaDiagonalReves(matriz), "Suma matriz Diagonal", 1);
            }
        };

        this.ejercicio7 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prop = Estado.UNO;
                JOptionPane.showMessageDialog(null,
                        "La matriz debe ser cuadrada.");

                int[] filColum = obtenerFilCol();

                int[][] matriz = lectura(filColum[0], filColum[1]);

                int[] sumaDeTriangulos = sumaTriangulos(matriz);

                JOptionPane.showMessageDialog(null, "Matriz\n"
                        + imprimir(matriz, prop) + "\nT. superior:"
                        + "            T. inferior:\n        " + sumaDeTriangulos[0] + "                          "
                        + sumaDeTriangulos[1],
                         "Suma de triangulos", 1);
            }
        };

        this.ejercicio8 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] filColum = obtenerFilCol();

                int[][] matriz = lectura(filColum[0], filColum[1]);

                int[] sumafilas = sumaFila(matriz);

                JOptionPane.showMessageDialog(null, "Matriz\n"
                        + imprimirSumaFila(matriz, sumafilas) + "\n ", "Suma filas", 1);
            }
        };

        this.ejercicio9 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] filColum = obtenerFilCol();

                int[][] matriz = lectura(filColum[0], filColum[1]);

                int[] sumaColums = sumaColumna(matriz);

                JOptionPane.showMessageDialog(null, "Matriz\n"
                        + imprimirSumaColum(matriz, sumaColums) + "\n ", "Suma Columnas", 1);

            }
        };

        this.ejercicio10 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prop = Estado.UNO;
                int[] filColum = obtenerFilCol();

                int[][] matriz = lectura(filColum[0], filColum[1]);
                JOptionPane.showMessageDialog(null, "Matriz Base\n"
                        + imprimir(matriz, prop) + "\n "
                        + "Resultado\n" + imprimir(modMatriz(matriz), prop),
                         "Modificar Matriz", 1);

            }
        };

        this.ejercicio1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prop = Estado.UNO;
                int[] filColum = obtenerFilCol();

                int[][] matriz = lectura(filColum[0], filColum[1]);
                JOptionPane.showMessageDialog(null, "Matriz Base\n"
                        + imprimir(matriz, prop) + "\n "
                        + "Resultado\n" + imprimir(ordenarMatriz(matriz), prop),
                         "Odenar Matriz", 1);
            }
        };

        this.ejercicio12 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prop = Estado.DOS;
                int[] filColum1 = obtenerFilCol();
                int[] filColum2 = obtenerFilCol();
                int[][] a, b;

                a = lectura(filColum1[0], filColum1[1]);
                b = lectura(filColum2[0], filColum2[1]);

                if (a[0].length == b.length) {
                    int[][] multi = multiplicarMatriz(a, b);

                    JOptionPane.showMessageDialog(null,
                            imprimirDos(a, b) + "\nResultado Multiplicacion\n"
                            + imprimir(multi, prop), "Multiplicar Matriz", 1);

                } else {
                    JOptionPane.showMessageDialog(null,
                            "No se puede realizar la operacion",
                             "Multiplicar Matriz", 0);
                }

            }
        };

        this.buscaMina = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new BuscaMina();

            }
        };
        
        
    }// fin del constructor

    public static int[][] lectura(int fila, int colum) {
        int[][] temp = new int[fila][colum];

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < colum; j++) {
                temp[i][j] = num_ram.nextInt(10);
            }

        }

        return temp;
    }

    public static String imprimir(int[][] matris, Estado pro) {
        String cadena = "";

        for (int[] matri : matris) {
            for (int j = 0; j < matris[0].length; j++) {
                if (matri[j] < 10 && pro == Estado.DOS) {
                    cadena += "0" + matri[j] + " ";
                } else {
                    cadena += matri[j] + " ";
                }
            }
            cadena += "\n";
        }

        return cadena;
    }

    public static String imprimirSumaFila(int[][] matris, int[] sumFil) {
        String cadena = "";

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {

                cadena += matris[i][j] + " ";

            }
            cadena += "   >>>>   " + sumFil[i];
            cadena += "\n";
        }

        return cadena;
    }

    public static String imprimirSumaColum(int[][] matris, int[] sumColum) {
        String cadena = "";

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {

                cadena += matris[i][j] + "     ";
            }

            cadena += "\n";
        }

        for (int i = 0; i < sumColum.length; i++) {
            cadena += "---   ";
        }
        cadena += "\n";
        for (int i = 0; i < sumColum.length; i++) {
            cadena += sumColum[i] + "  ";
        }

        return cadena;
    }

    public static String imprimirDos(int[][] matrisA, int[][] matrisB) {
        String esp = "";
        for (int i = 0; i < matrisA[0].length; i++) {
            esp += "  ";
        }
        String cadena = "Matriz A" + esp + "        Matriz B\n";

        int filM;
        if (matrisA.length > matrisB.length) {
            filM = matrisA.length;
        } else {
            filM = matrisB.length;
        }

        int colM;
        if (matrisA[0].length > matrisB.length) {
            colM = matrisA[0].length;
        } else {
            colM = matrisB[0].length;
        }

        for (int i = 0; i < filM; i++) {

            if (i < matrisA.length) {
                for (int j = 0; j < matrisA[0].length; j++) {
                    cadena += matrisA[i][j] + " ";
                }
            } else {

                if (matrisA[0].length <= "matris A ".length()) {
                    cadena += esp;
                }
                for (int j = 0; j < matrisA.length - 1; j++) {
                    cadena += "       ";
                }
            }

            if (matrisA[0].length < " Matriz A".length()) {
                cadena += "                   ";
            } else {
                cadena += "          ";
            }

            if (i < matrisB.length) {
                for (int j = 0; j < matrisB[0].length; j++) {
                    cadena += matrisB[i][j] + " ";
                }
            }

            cadena += "\n";

        }

        return cadena;
    }

    public static int[][] matrizSumaDos(int[][] a, int[][] b) {
        int[][] temp = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                temp[i][j] = a[i][j] + b[i][j];
            }

        }

        return temp;
    }

    public  int[] obtenerFilCol() {

        temp[0] = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingrese el tamanio de la fila",
                "Fila Matriz", 3));
        temp[1] = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingrese el tamanio de las columnas",
                "Columna Matriz", 3));

        return temp;
    }

    public static int sumaMatriz(int[][] matriz) {
        int temp = 0;

        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                temp += matriz1[j];
            }
        }

        return temp;

    }

    public static int numeroMayor(int[][] matriz) {

        int n_mayor = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                if (n_mayor < matriz[i][j]) {
                    n_mayor = matriz[i][j];
                }

            }

        }

        return n_mayor;
    }

    public static int sumaDiagonal(int[][] matriz) {
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {

            suma += matriz[i][i];
        }

        return suma;

    }

    public static int sumaDiagonalReves(int[][] matriz) {
        int suma = 0;

        for (int i = matriz.length - 1; i >= 0; i--) {

            suma += matriz[i][(matriz.length - 1) - i];
        }

        return suma;

    }

    public static int[] sumaTriangulos(int[][] matriz) {
        int[] temp = new int[2];

        int a = 0, b = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {
                if (i > 0 && j < i) {
                    a += matriz[i][j];
                } else if (j > i) {
                    b += matriz[i][j];
                }
            }
        }

        temp[0] = a;
        temp[1] = b;

        return temp;

    }

    public static int[] sumaFila(int[][] matriz) {

        int[] temp = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            int acum = 0;

            for (int j = 0; j < matriz[0].length; j++) {
                acum += matriz[i][j];

            }

            temp[i] = acum;
        }

        return temp;
    }

    public static int[] sumaColumna(int[][] matriz) {

        int[] temp = new int[matriz[0].length];

        for (int i = 0; i < matriz[0].length; i++) {
            int acum = 0;

            for (int j = 0; j < matriz.length; j++) {
                acum += matriz[j][i];

            }

            temp[i] = acum;
        }

        return temp;
    }

    public static int[][] modMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {

                if (i == 0 || j == 0 || matriz.length - i == 1 || matriz[0].length - j == 1) {
                    matriz[i][j] = 0;
                }
            }
        }

        return matriz;
    }

    public static int[][] ordenarMatriz(int[][] matriz) {
        int[] elemts = new int[matriz.length * matriz[0].length];

        int cont = 0;
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {
                elemts[cont] = matriz[i][j];
                cont++;
            }
        }

        //Itera hasta antes de la ultima posicion del arreglo
        for (int i = 0; i < elemts.length - 1; i++) {

            for (int j = i + 1; j < elemts.length; j++) {

                if (elemts[i] > elemts[j]) {

                    int n = elemts[i];
                    elemts[i] = elemts[j];
                    elemts[j] = n;

                }
            }
        }

        cont = 0;
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = elemts[cont];
                cont++;
            }
        }

        return matriz;
    }

    public static int[][] multiplicarMatriz(int[][] a, int[][] b) {
        int[][] result = new int[a.length][b[0].length];
        int acum;

        for (int i = 0; i < result.length; i++) { //Itera en las filas de la matriz resultante

            for (int j = 0; j < result[0].length; j++) { //Itera en cada columna de la fila actual del resultante
                acum = 0;
                for (int k = 0; k < b.length; k++) { //itera en todos los elemento de la columna actual de b y lo mutiplica con la fila actual de a (que lo toma del primer for)
                    acum += a[i][k] * b[k][j];
                }

                result[i][j] = acum;
            }
        }

        return result;
    }
}
