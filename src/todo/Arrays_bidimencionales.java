package todo;

public class Arrays_bidimencionales {
    public static void main(String[] args) {

            /*int [][] matriz = new int [4][5];

            matriz[0][0] = 5;
            matriz[0][1] = 10;
            matriz[0][2] = 15;
            matriz[0][3] = 20;
            matriz[0][4] = 25;

            matriz[1][0] = 30;
            matriz[1][1] = 35;
            matriz[1][2] = 40;
            matriz[1][3] = 45;
            matriz[1][4] = 50;

            matriz[2][0] = 55;
            matriz[2][1] = 60;
            matriz[2][2] = 65;
            matriz[2][3] = 70;
            matriz[2][4] = 75;

            matriz[3][0] = 80;
            matriz[3][1] = 85;
            matriz[3][2] = 90;
            matriz[3][3] = 95;
            matriz[3][4] = 100;*/

            /*for ( int i=0; i<4; i++ ){

                    System.out.println();

                    for ( int j=0; j<5; j++ ){

                            System.out.print(matriz[i][j] + " ");

                    }

            }

             */


            int [][] matriz = {
                    {5,10,15,20,25},
                    {30,35,40,45,50},
                    {55,60,65,70,75},
                    {80,85,90,95,100}

            };

            for (int[]fila:matriz){

                    System.out.println();

                    for(int z:fila){

                            System.out.print( z + " ");
                    }
            }







    }
}
