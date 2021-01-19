/**
 * Write a description of class Pascal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pascal
{
    public static int[][] pascalTriangle(int n) {
        // YOUR CODE HERE
        int[][] tri = new int[n][n];
        tri[0][0] = 1;
        for (int y = 1; y < n; y++){
            tri[y][0] = 1;
            for (int x = 1; x < n; x++){
                tri[y][x] = tri[y - 1][x - 1] + tri[y - 1][x];
            }
        }
        return tri;
    }
}
