//by default, 
//in c++ STL- priority queue are developed using max heap
//below

#include <iostream>
#include <queue>
using namespace std;

int main()
{
    priority_queue<int> pq;
    pq.push(10);
    pq.push(15);
    pq.push(5);
    cout << pq.size() << " ";
    cout << pq.top() << " ";
    while (pq.empty() == false)
    {
        cout << pq.top() << " ";
        pq.pop();
    }

    return 0;
}

//using min heap- below

// #include <iostream>
// #include <queue>
// using namespace std;

// int main()
// {
//     priority_queue<int, vector<int>, greater<int>> pq;
//     pq.push(10);
//     pq.push(15);
//     pq.push(5);
//     cout << pq.size() << " ";
//     cout << pq.top() << " ";
//     while (pq.empty() == false)
//     {
//         cout << pq.top() << " ";
//         pq.pop();
//     }

//     return 0;
// }