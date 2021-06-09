#include <iostream>
#include <cmath>
//#include <bits/stdc++.h> 
#include <climits>
#include <deque>
using namespace std;


int main()
{
	deque<int> dq = {10, 20, 5, 30};

	auto it = dq.begin();

	it = dq.insert(it, 7);
	
	for(int i = 0; i < dq.size(); i++)
		cout<<dq[i]<<" ";
		
	cout<<endl;

	it = dq.insert(it, 2, 3);
	
	for(int i = 0; i < dq.size(); i++)
		cout<<dq[i]<<" ";
		
	cout<<endl;

    cout << (*(it+1)) << endl;
    
	it = dq.erase(it);
	
	for(int i = 0; i < dq.size(); i++)
		cout<<dq[i]<<" ";
		
	cout<<endl;

	cout << (*(it+1)) << endl;


	return 0;
}