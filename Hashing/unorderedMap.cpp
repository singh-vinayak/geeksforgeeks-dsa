#include <bits/stdc++.h>
using namespace std;

int main()
{

    unordered_map<string, int> m;       //creating unordered map
    m["gfg"] = 20;                      //input key-value pairs
    m["ide"] = 30;
    m.insert({"courses", 15});

    if (m.find("ide") != m.end())       //searching based on key
        cout << "Found";                //if value is present, it will not go to the end pointer
    else
        cout << "Not Found ";

    cout << endl;

    for (auto it = m.begin(); it != m.end(); it++)
        cout << (it->first) << " " << (it->second) << endl; //the 'it' iterator in the map behaves like a pointer
                                                            //'first' points to key, 'second' points to value
    if (m.count("ide") > 0)
        cout << "Found";
    else
        cout << "Not Found";
    cout << endl;

    cout << m.size() << endl;
    m.erase("ide");         //deletes based on key or position specified
    m.erase(m.begin());
    cout << m.size() << endl;
    m.erase(m.begin(), m.end());

    return 0;
}