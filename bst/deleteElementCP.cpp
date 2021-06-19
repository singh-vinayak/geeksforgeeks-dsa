#include <iostream>
using namespace std;

struct Node  
{ 
  int key; 
  struct Node *left; 
  struct Node *right; 
  Node(int k){
      key=k;
      left=right=NULL;
  }
};

Node *getSuccessor(Node *curr){
    curr=curr->right;
    while(curr!=NULL && curr->left!=NULL)
        curr=curr->left;
    return curr;
}

Node *delNode(Node *root, int x){
    
    //check if the tree is empty already or not

    if(root==NULL)
        return root;

    //checking if the element to be deleted is in left sub tree

    if(root->key>x)
        root->left=delNode(root->left,x);

    //checking if the element to be deleted is in right sub tree

    else if(root->key<x)
        root->right=delNode(root->right,x);
    else{

        //to see if the node to be deleted has only 1 child or no child, that is, a leaf node
        //in case of a leaf node, it'll return null

        if(root->left==NULL){
            Node *temp=root->right;
            delete root;
            return temp;
        }
        else if(root->right==NULL){
            Node *temp=root->left;
            delete root;
            return temp;
        }
        else{

            //this portion executes if the node has both child nodesz

            Node *succ=getSuccessor(root);
            root->key=succ->key;
            root->right=delNode(root->right,succ->key);
        }
    }
    return root;
} 

void inorder(Node *root){
    if(root!=NULL){
        inorder(root->left);
        cout<<root->key<<" ";
        inorder(root->right);    
    }
} 
int main() {
	
	Node *root=new Node(10);
	root->left=new Node(5);
	root->right=new Node(15);
	root->right->left=new Node(12);
	root->right->right=new Node(18);
	int x=15;
	
	root=delNode(root,x);
	inorder(root);
}