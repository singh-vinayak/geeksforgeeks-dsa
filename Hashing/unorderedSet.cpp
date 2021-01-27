#include <bits/stdc++.h> 
using namespace std; 

int main(){
    
    unordered_set <int> s;
    s.insert(10);
    s.insert(5);
    s.insert(15);
    s.insert(20);
    for(int x: s)
        cout<<x<<" ";
        
    cout<<endl;
    for(auto it=s.begin();it!=s.end();it++)
        cout<<*it<<" ";                         //prints elements in random order
    cout<<endl;
    cout<<s.size()<<endl;
    s.clear();
    cout<<s.size()<<endl;
    
    s.insert(10);
    s.insert(5);
    s.insert(15);
    s.insert(20);
    cout<<s.size()<<endl; //returns total number of elements present
    
    if(s.find(15)==s.end())// gives boolean output
        cout<<"Not Found";
    else
        cout<<"Found "<<(*s.find(15));
    
    cout<<endl;   
    if(s.count(15)) //returns 1 or 0 depending on search
        cout<<"Found";
    else
        cout<<"Not Found";
    cout<<endl;
    
    cout<<s.size()<<endl;
    s.erase(15);//removes the element specified
    cout<<s.size()<<endl;
    auto it=s.find(10);
    s.erase(it);//based on position
    cout<<s.size()<<endl;
    
    s.erase(s.begin(),s.end());//deletes entire set
        
    return 0;
}