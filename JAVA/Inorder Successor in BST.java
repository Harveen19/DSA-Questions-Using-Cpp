// Inorder Successor in BST
// Easy  Accuracy: 34.97%  Submissions: 88K+  Points: 2

// Given a BST, and a reference to a Node x in the BST. Find the Inorder Successor of the given node in the BST.
 

// Example 1:

// Input:
//       2
//     /   \
//    1     3
// K(data of x) = 2
// Output: 3 
// Explanation: 
// Inorder traversal : 1 2 3 
// Hence, inorder successor of 2 is 3.

// Example 2:

// Input:
//              20
//             /   \
//            8     22
//           / \
//          4   12
//             /  \
//            10   14
// K(data of x) = 8
// Output: 10
// Explanation:
// Inorder traversal: 4 8 10 12 14 20 22
// Hence, successor of 8 is 10.
 

// Your Task:
// You don't need to read input or print anything. Your task is to complete the function inOrderSuccessor(). This function takes the root node and the reference node as argument and returns the node that is inOrder successor of the reference node. If there is no successor, return null value.


// Expected Time Complexity: O(Height of the BST).
// Expected Auxiliary Space: O(1).


// Constraints:
// 1 <= N <= 105, where N is number of nodes


class Solution
{
    // returns the inorder successor of the Node x in BST (rooted at 'root')
	public Node inorderSuccessor(Node root,Node x)
        {
            //add code here.
            
            if(root == null){
                return null;
            }
            
            if(x.right != null){
                x = x.right;
                
                while(x.left != null){
                    x = x.left;
                }
                
                return x;
            }
            
            Node successor = null;
            while(root != null){
                if(x.data < root.data){
                    successor = root;
                    root = root.left;
                }else if(x.data > root.data){
                    root = root.right;
                }else{
                    break;
                }
            }
            
            return successor;
        }
}
