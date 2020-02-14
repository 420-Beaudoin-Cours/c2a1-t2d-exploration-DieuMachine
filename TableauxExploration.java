/**
 * @author Linden Brochu
 */
public class TableauxExploration {
    public static void initTen(int[][] tab2d){
        for (int i = 0; i < tab2d.length; i++)
            for (int j = 0; j < tab2d[i].length; j++)
                tab2d[i][j] = 10;
    }

    public static void initDiagonaleTen(int[][] tab2d){
        for (int i = 0; i < tab2d.length; i++)
            tab2d[i][i] = 10;
    }

    public static void initPosition(String[][] tab2d){
        for (int i = 0; i < tab2d.length; i++)
            for (int j = 0; j < tab2d[i].length; j++)
                tab2d[i][j] = i + ":" + j;
    }

    public static boolean isTabCarre(int[][] tab2d){
        return tab2d.length == tab2d[0].length;
    }

    public static boolean isTabDimEgal(int[][] tab2d, int[][] tab2d2){
        return tab2d.length == tab2d2.length && tab2d2[0].length == tab2d[0].length;
    }

    public static int[][] getSommeMatrices(int[][] matrice1, int[][] matrice2){
        int[][] sommeMatrice = new int[matrice1.length][matrice1[0].length];
        for (int i = 0; i < sommeMatrice.length; i++)
            for (int j = 0; j < sommeMatrice[0].length; j++){
                sommeMatrice[i][j] = matrice1[i][j] + matrice2[i][j];
            }
        return sommeMatrice;
    }
}
