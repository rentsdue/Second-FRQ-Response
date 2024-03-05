public class LightBoard {

/* The lights on the board, where true represents on and false represents off.*/
private boolean[][] lights;

/** Constructs a LightBoard object having numRows rows and numCols columns.
Precondition: numRows > 0, numCols > 0
Postcondition: each light has a 40% probability of being set to on.
*/

    public LightBoard(int numRows, int numCols) {
        lights= new boolean[numRows][numCols];
        double probability=Math.random();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                lights[i][j]= (probability<0.4);
            }
        }
    }


/* Evaluates a light in row index row and column index col and returns a status
as described in part (b).
Precondition: row and col are valid indexes in lights.
*/

    public boolean evaluateLight(int row, int col) {
        int trueCounter=0;
        for (int i=0; i < lights.length; i++) {
            if (lights[i][col]==true) {
                trueCounter++;
            }
        }
        if (lights[row][col]==true && trueCounter%2==0) {
            return false;
        } else if (lights[row][col]==false && trueCounter%3==0) {
            return true;
        } else {
            return lights[row][col];
        }
    }

    public void setLights(boolean[][] lights) {
        this.lights=lights;
    }

}