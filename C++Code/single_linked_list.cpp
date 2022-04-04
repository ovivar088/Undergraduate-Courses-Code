#include <iostream>

struct Node
{
    int data;
    Node* Next;
    ListNode() : val(0), next(nullptr) {}
};

void print_list(Node* n)
{
    while (n != NULL)
    {
        std::cout << n->data << "\n"; //end1 is = "\n"
        n = n->Next;
    }
}

int main()
{
    Node* head = new Node();
    Node* second = new Node();
    Node* third = new Node();

    head->data = 1;
    head->Next = second;

    second->data = 2;
    second->Next = third;

    third->data = 3;
    third->Next = NULL;

    print_list(head);

}