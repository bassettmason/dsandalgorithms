# Trees 

Lab 15
## Challenge
Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.
Create a BinaryTree class
Define a method for each of the depth first traversals called preOrder, inOrder, and postOrder which returns an array of the values, ordered appropriately.
At no time should an exception or stack trace be shown to the end user. Catch and handle any such exceptions and return a printed value or operation which cleanly represents the state and either stops execution cleanly, or provides the user with clear direction and output.

Create a BinarySearchTree class
Define a method named add that accepts a value, and adds a new node with that value in the correct location in the binary search tree.
Define a method named contains that accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.
## Approach & Efficiency
Used recursion to efficiently itterate and implement methods. 




## API
Modifiers/Type     | Class       | Method    | Description |
|---                    | ---         | ---     |         --- |
|  java.util.List       |`BinaryTree `  | `preOrder()`   | returns preorder list|
|  java.util.List       |`BinaryTree `  | `postOrder()`   | returns postorder list |
|  java.util.List       |`BinaryTree `  | `inOrder()`   | returns in0rder list |
|  void       |`BinarySearchTree `  | `add(int value)`   | recursively itterates and finds where input value |
|  boolean       |`BinarySearchTree `  | `contains(int value)`   | recursivly itterates and checks through the tree |

### Space Efficiency
O(1)

### Time Efficiency:
O(n)

