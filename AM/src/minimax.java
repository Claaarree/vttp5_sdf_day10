public class minimax {

    public int calculateLevel(int n){
        if (n == 1){
            return 0;
        } else {
            return 1 + calculateLevel(n/2);
        }
    }
    
    public int minimax(int currentDepth, boolean isMax, int[] values, 
    int currentNodeIndex, int depth) {
        if (currentDepth == depth){
            return values[currentNodeIndex];

        } else if (isMax){
            return Math.max(minimax(currentDepth + 1, false, values, currentNodeIndex*2, depth),
            minimax(currentDepth + 1, false, values, currentNodeIndex * 2 + 1, depth));

        } else if (!isMax){
            return Math.min(minimax(currentDepth + 1, true, values, currentNodeIndex * 2, depth), 
            minimax(currentDepth + 1, true, values, currentNodeIndex * 2 + 1, depth));

        }
        return 0;
    }
}
