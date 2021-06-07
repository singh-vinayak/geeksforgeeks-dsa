//using circular arrays

//#include <bits/stdc++.h>
#include <iostream>
using namespace std;

class queueImplementation
{
public:
    int front, rear, size;
    unsigned capacity;
    int *array;
};

queueImplementation *createQueue(unsigned capacity)
{
    queueImplementation *queue = new queueImplementation();
    queue->capacity = capacity;
    queue->front = queue->size = 0;

    queue->rear = capacity - 1;
    queue->array = new int[(
        queue->capacity * sizeof(int))];
    return queue;
}

int isFull(queueImplementation *queue)
{
    return (queue->size == queue->capacity);
}

int isEmpty(queueImplementation *queue)
{
    return (queue->size == 0);
}

void enqueue(queueImplementation *queue, int item)
{
    if (isFull(queue))
        return;
    queue->rear = (queue->rear + 1) % queue->capacity;
    queue->array[queue->rear] = item;
    queue->size = queue->size + 1;
    cout << item << " enqueued to queue\n";
}

int dequeue(queueImplementation *queue)
{
    if (isEmpty(queue))
        return INT_MIN;
    int item = queue->array[queue->front];
    queue->front = (queue->front + 1) % queue->capacity;
    queue->size = queue->size - 1;
    return item;
}

int front(queueImplementation *queue)
{
    if (isEmpty(queue))
        return INT_MIN;
    return queue->array[queue->front];
}

int rear(queueImplementation *queue)
{
    if (isEmpty(queue))
        return INT_MIN;
    return queue->array[queue->rear];
}

int main()
{
    queueImplementation *queue = createQueue(1000);

    enqueue(queue, 10);
    enqueue(queue, 20);
    enqueue(queue, 30);
    enqueue(queue, 40);

    cout << dequeue(queue)
         << " dequeued from queue\n";

    cout << "Front item is "
         << front(queue) << endl;
    cout << "Rear item is "
         << rear(queue) << endl;

    return 0;
}

//using Linked Lists

// #include <bits/stdc++.h>
// using namespace std;

// struct QNode
// {
//     int data;
//     QNode *next;
//     QNode(int d)
//     {
//         data = d;
//         next = NULL;
//     }
// };

// struct Queue
// {
//     QNode *front, *rear;
//     Queue()
//     {
//         front = rear = NULL;
//     }

//     void enQueue(int x)
//     {

//         QNode *temp = new QNode(x);

//         if (rear == NULL)
//         {
//             front = rear = temp;
//             return;
//         }

//         rear->next = temp;
//         rear = temp;
//     }

//     void deQueue()
//     {

//         if (front == NULL)
//             return;

//         QNode *temp = front;
//         front = front->next;

//         if (front == NULL)
//             rear = NULL;

//         delete (temp);
//     }
// };

// int main()
// {

//     Queue q;
//     q.enQueue(10);
//     q.enQueue(20);
//     q.deQueue();
//     q.deQueue();
//     q.enQueue(30);
//     q.enQueue(40);
//     q.enQueue(50);
//     q.deQueue();
//     cout << "Queue Front : " << (q.front)->data << endl;
//     cout << "Queue Rear : " << (q.rear)->data;
// }
