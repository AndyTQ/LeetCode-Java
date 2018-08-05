class Solution {
    public Node construct(int[][] grid){
        return quadTreeNode(grid, 0, 0, grid.length);
    }
    public Node quadTreeNode(int[][] grid, int c, int r, int size) {  // c represents column and r represents row.
        if (size == 1) return new Node(grid[r] == 1, true, null, null, null, null); // leaf; base case
        else{
            // recursive calls
            Node topLeft = quadTreeNode(grid, c, r, size / 2); 
            Node topRight = quadTreeNode(grid, c, r + size / 2, size / 2);
            Node bottomLeft = quadTreeNode(grid, c + size / 2, r, size / 2);
            Node bottomRight = quadTreeNode(grid, c + size / 2, r + size / 2, size / 2);
            boolean isLeaf = (topLeft.isLeaf && topRight.isLeaf && bottomLeft.isLeaf && bottomRight.isLeaf
             && ((topLeft.val && topRight.val && bottomLeft.val && bottomRight.val)
             ||  (topLeft.val && topRight.val && !bottomLeft.val && !bottomRight.val))); // notice that val is in boolean, not int!
            if (isLeaf) return new Node(topLeft.val, true, null, null, null, null); // first case
            else return new Node(topLeft.val, isLeaf, topLeft, topRight, bottomLeft, bottomRight); // second case
        }
    }
}
