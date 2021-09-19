
public class Conway
{
    public static void main(String[] args)
    {
        InitiateGrid();


    }

    public static void InitiateGrid()
    {
        int M = 10;
        int N = 10;

        //Create basic simple grid
        int[][] grid = {
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 1, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
        };

        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++){
                if (grid[i][j] == 0)
                    System.out.print(".");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        nextGen(grid, M, N);

    }

    static void nextGen(int grid[][], int M, int N)
    {
        int[][] future = new int[M][N];

        for (int i = 1; i < M - 1; i++) {
            for (int j = 1; j < N - 1; j++) {
                int lifeNeighbour = 0;
                for (int l = -1; l <= 1; l++) {
                    for (int m = -1; m <= 1; m++) {
                        lifeNeighbour += grid[i+l][j+m];
                        lifeNeighbour -= grid[i][j];
                    }
                }
            }
        }
    }
}
