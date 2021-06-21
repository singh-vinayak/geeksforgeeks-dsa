#include <iostream>
#include <map>
using namespace std;

int main()
{

    map<int, int> m;
    m.insert({10, 200});
    m[5] = 100;
    m.insert({3, 300});

    for (auto &x : m)
        cout << x.first << " " << x.second << endl;

    cout << "Size: " << m.size() << endl;

    m.at(10) = 300;

    map<int, int> m2;
    m2.insert({10, 200});
    m2[5] = 100;
    m2.insert({3, 300});

    for (auto it = m2.begin(); it != m2.end(); it++)
        cout << (*it).first << " " << (*it).second << endl;

    m2.clear();
    cout << "Size: " << m2.size() << endl;
    cout << "Empty: " << (m2.empty() ? "Yes" : "No") << endl;

    map<int, string> m3;
    m3.insert({5, "gfg"});
    m3.insert({2, "ide"});
    m3.insert({1, "practice"});

    if (m3.find(5) == m3.end())
        cout << "Not found";
    else
        cout << "Found";
    cout << endl;
    if (m3.count(2) == 0)
        cout << "Not found";
    else
        cout << "Found";
    cout << endl;
    auto it = m3.lower_bound(7);
    if (it != m3.end())
        cout << (*it).first << " ";
    else
        cout << "No Equal or Greater Value";

    map<int, string> m4;
    m4.insert({5, "gfg"});
    m4.insert({2, "ide"});
    m4.insert({1, "practice"});

    auto it = m4.upper_bound(2);
    if (it != m4.end())
        cout << (*it).first << endl;
    else
        cout << "Greater Value" << endl;

    m4.erase(5);
    cout << "Size: " << m4.size() << endl;

    m4.erase(m4.find(2), m4.end());
    cout << "Size: " << m4.size() << endl;

    return 0;
}