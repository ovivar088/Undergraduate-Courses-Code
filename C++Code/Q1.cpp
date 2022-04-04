#include <iostream>


    struct BstNode 
    {
        int data;
        BstNode* left;
        BstNode* right;
    };

// Nodes will be created using "new" operator in C++ (in c this is usually a malloc or calloc)
//Items in the heap can only be accesed VIA pointers and CANNOT be named 

//In a BST we must keep track of all of the root nodes addresses, this allows us to traverse trees.

BstNode* NewNode(int data)  
{
    BstNode* newNode = new BstNode(); 
//pointer which points to "newNode", newNode of Struct BstNode 

    newNode->data = data; 
    // (*newNode).data = data; <-- is acceptable syntax as well
    newNode-> left = newNode-> right = NULL; 
    //These are the SUBTREES basically children of root
    //why is  left and right field NULL?
    return newNode;
}

BstNode* Insert(BstNode* rootPtr, int data) {

    //condition for recursion to stop, basically we reach a node
    //which has no data, is NULL and we can insert data
    if(rootPtr == NULL)
    { //empty tree

    rootPtr = NewNode(data);
    std::cout << "We found an empty node " << data << "\n";
    return rootPtr;
    }

    //These two conditions are used to navigate through tree
    //uses recurssion to do so, till it finds an empty node

    else if (data <= rootPtr->data)
    {
        std::cout << "Calling back to insert checking left \n";
        rootPtr->left = Insert(rootPtr->left,data);
        
    }
    else 
    { 
        std::cout << "Calling back to insert checking right \n";
        rootPtr->right = Insert(rootPtr->right,data);  
    }


    return rootPtr;
}


//We are going to try make the delete function for BST
//Things to consider:  when we delete a node...
//if it has no children then we are good
//if it HAS children then one of its children need to take its
//place which one would it be??? Also what is the return value
//of our delete function?




void preorder_traversal(BstNode* root) {
    
    if (root == NULL) 
        {
        return;
        }

    std::cout << "Value : " << (root->data) << "\n";
    preorder_traversal(root->left);
    preorder_traversal(root->right);
}

void inorder_traversal(BstNode* root) {

    
    if(root == NULL) 
    {
        return;
    }
    //std::cout << "We made it here, value: " << root->data << "---> "; 

    inorder_traversal(root->left);
    std::cout << "Value : " << (root->data) << "\n";
    inorder_traversal(root->right); 

}



bool Search(BstNode* root, int data) {
        if(root==NULL)  {
        std::cout<< "The value " << data << " was not found \n";
        return false;
        }

    else if(root->data == data) {
        std::cout << "We found your value " << data << " \n";
        return true;
    }
    

    else if(data <= root->data) {
        std::cout << "Reccursion to the left\n";
        return Search(root->left,data);
        }

    else {
        std::cout << "Reccursion to the right \n";
        return Search(root->right,data);}
}

BstNode* Delete(BstNode* root, int data) {
    //We probably need to search the data <3
    
    if (root == NULL) {
        return root;
    }
    
    else if (data < root->data) {
        Delete(root->left,data);
    }
    else if (data > root->data) {
        Delete(root->right,data);
    }
    
    return root;
}

int main() 
{

    BstNode* root = NULL; //Create an empty tree
    root = Insert(root,17); //First element in tree, ^ is no longer empty
    root = Insert(root,5); //Insert will add more nodes after, subtrees
    root = Insert(root,35); //We are passing address of BSTNode
    root = Insert(root,2);
    root = Insert(root,11);
    root = Insert(root,29);
    root = Insert(root,38);
    root = Insert(root,9);
    root = Insert(root,16);
    root = Insert(root,8);

    inorder_traversal(root);
    std::cout << "End of In Order Traversal! \n" ;
    preorder_traversal(root);
    std::cout << "End of PreOrder_Traversal \n";

    
    Search(root,16);
    Delete(root,16);
    Search(root,16);

    std::cout << "function has ran! \n "; 


}