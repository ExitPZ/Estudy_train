package Semana_1.treino_arrays;

public class TestesArrays {

        // 1️ Verificar se está ordenado
        public static boolean estaOrdenado(int[] v) {
            for (int i = 0; i < v.length - 1; i++) {
                if (v[i] > v[i + 1]) {
                    return false;
                }
            }
            return true;
        }

        // 2️ Desvio padrão
        public static double desvioPadrao(double[] valores) {
            double soma = 0;
            for (double v : valores) {
                soma += v;
            }
            double media = soma / valores.length;

            double somaQuadrados = 0;
            for (double v : valores) {
                somaQuadrados += Math.pow(v - media, 2);
            }

            return Math.sqrt(somaQuadrados / valores.length);
        }

        // 3️ Busca linear
        public static int buscaLinear(int[] v, int alvo) {
            for (int i = 0; i < v.length; i++) {
                if (v[i] == alvo) {
                    return i;
                }
            }
            return -1;
        }

        // 4️ Contar maiores que a média
        public static int maioresQueMedia(int[] v) {
            int soma = 0;
            for (int x : v)
                soma += x;

            double media = (double) soma / v.length;

            int cont = 0;
            for (int x : v) {
                if (x > media) cont++;
            }
            return cont;
        }

        // 5️ Redimensionar array
        public static int[] redimensionar(int[] original, int novoTamanho) {
            int[] novo = new int[novoTamanho];
            int limite = Math.min(original.length, novoTamanho);

            for (int i = 0; i < limite; i++) {
                novo[i] = original[i];
            }
            return novo;
        }

        // MAIN 
        public static void main(String[] args) {
            int[] v = {3, 4, 6, 23, 7, 10, 15, 6 ,6 ,6 ,7, 8, 8, 9};
            double[] d = {3.0, 6.0, 9.0, 12.0, 15.0, 18.0, 21.0};

            // Teste 1
            System.out.println("Ordenado? " + estaOrdenado(v));

            // Teste 2
            System.out.println("Desvio padrão: " + desvioPadrao(d));

            // Teste 3
            int pos = buscaLinear(v, 7);
            System.out.println("Busca linear (7): posição " + pos);

            // Teste 4
            System.out.println("Maiores que a média: " + maioresQueMedia(v));

            // Teste 5
            int[] novo = redimensionar(v, 14);
            System.out.println("Novo tamanho: " + novo.length);
            System.out.println("Conteúdo do novo array:" + v[0] + ", " + v[1] + ", " + v[2] + ", " + v[3] + ", " + v[4] + ", " + v[5] + ", " + v[6] + ", " + v[7] + ", " + v[8] + ", " + v[9] + ", " + v[10] + ", " + v[11] + ", " + v[12] + ", " + v[13]);
        }
    }


