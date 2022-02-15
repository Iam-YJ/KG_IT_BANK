#include <stdio.h>
#include <stdlib.h>
#define EMPTY 0

typedef struct node {
    int data;
    struct node* right;
    struct node* left;
} Tree;

Tree* GetNode() {
    Tree* tmp = (Tree*)malloc(sizeof(Tree));
    tmp->right = EMPTY;
    tmp->left = EMPTY;
    return tmp;
}

//45 27 17 62 57 73 52 65 76 69 63 64 71 tree insert

void Insert(Tree** root, int data) {

        if ((*root) == NULL) {
            (*root) = GetNode();
            (*root)->data = data;
        }
        else if ((*root)->data > data) {
        Insert(&(*root)->left, data);
        }
        else {
            Insert(&(*root)->right, data);
        }
  
}

//preorder 
void Pre(Tree** root) {
    printf("%d ", (*root)->data);

    


}
//inorder
//postorder


int main(void) {
    Tree*root = EMPTY;

    Insert(&root, 45);
    Insert(&root, 27);
    Insert(&root, 17);
    Insert(&root, 62);
    Insert(&root, 57);
    Insert(&root, 73);
    Insert(&root, 52);
    Insert(&root, 65);
    Insert(&root, 76);
    Insert(&root, 69);
    Insert(&root, 63);
    Insert(&root, 64);
    Insert(&root, 71);

    Pre(&root);




	return 0;
}