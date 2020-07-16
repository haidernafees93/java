public class minimalTree {
    class node{
        int data;
        node left;
        node right;

        node(int x){
            this.data = x;
            this.left = this.right = null;
        }
    }

    public node sortedArrayToBST(int[] nums) {
    	if (nums.length == 0){
            return null;   
        }
         
        return binarysearchtree(nums, 0, nums.length-1);
     }
 
	public node binarysearchtree(int[] num, int start, int end) {
        if(start > end){
            return null;
        }
 
		int mid = (start+end)/2;
		node n = new node(num[mid]);
        n.left = binarysearchtree(num, start, mid-1);
        n.right = binarysearchtree(num,mid+1, end);
 
		return n;
	}
}