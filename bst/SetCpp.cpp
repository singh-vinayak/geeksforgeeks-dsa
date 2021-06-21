#include <iostream>
#include <set>
using namespace std;


int main() {
	set<int> s;
	s.insert(10);
	s.insert(5);
	s.insert(20);
	for (int x : s) {
	    cout<<x<<" ";
	}
	cout<<"-----------"<<endl;
	
	set<int,greater<int>> s1;//Decreasing order
	s1.insert(10);
	s1.insert(5);
	s1.insert(20);
	for (auto it=s1.begin();it!=s1.end();it++) {
	    cout<<(*it)<<" ";
	}
	
	cout<<"-----------"<<endl;
	
	set<int,greater<int>> s2;//Decreasing order
	s2.insert(10);
	s2.insert(5);
	s2.insert(20);
	for (auto it=s2.rbegin();it!=s2.rend();it++) {
	    cout<<(*it)<<" ";
	}cout<<endl;
	
	auto it=s2.find(10);
	if(it==s2.end())
	    cout<<"Not found"<<endl;
	else
	    cout<<"Found"<<endl;
	    
	s2.clear();
	cout<<"Size: "<<s2.size()<<endl;
	cout<<"-----------"<<endl;
	
	set<int> s3;
	s3.insert(10);
	s3.insert(5);
	s3.insert(20);
	s3.insert(7);
	
	if(s3.count(10))
	    cout<<"Found"<<endl;
	else
	    cout<<"Not Found"<<endl;
	    
	s3.erase(5);
	for(int x: s3){
	    cout<<x<<" ";
	}cout<<endl;
	
	auto it=s3.find(7);
	s3.erase(it);
	for(int x: s3){
	    cout<<x<<" ";
	}
	cout<<"-----------"<<endl;
	
	set<int> s4;
	s4.insert(10);
	s4.insert(5);
	s4.insert(20);

	auto it=s4.lower_bound(5);
	if(it!=s4.end())
	    cout<<(*it)<<endl;
	else
	    cout<<"Given element is greater than the largest"<<endl;
	   
	it=s4.upper_bound(5);
	if(it!=s4.end())
	    cout<<(*it)<<endl;
	else
	    cout<<"Given element is greater than the largest"<<endl;
	
	return 0;
}