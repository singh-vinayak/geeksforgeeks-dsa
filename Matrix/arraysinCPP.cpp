//using doube pointers
#include <iostream>
#include <cmath>
#include <bits/stdc++.h>
#include <climits>
#include <deque>
using namespace std;
int main()
{
 int m = 3, n = 2;
 int **arr;
 arr = new int* [m];
 for(int i = 0; i < m; i++)
  arr[i] = new int[n];
 for(int i = 0; i < m; i++)
 {
  for(int j = 0; j < n; j++)
  {
   arr[i][j] = 10;
   cout << arr[i][j] << " ";
  }
 }
 return 0;
}
//using arrays of pointers
/**

#include <iostream>

#include <cmath>

#include <bits/stdc++.h>

#include <climits>

#include <deque>

using namespace std;



int main()

{

    int m = 3, n = 2;



    int *arr[m];



    for (int i = 0; i < m; i++)

        arr[i] = new int[n];



    for (int i = 0; i < 3; i++)

    {

        for (int j = 0; j < 2; j++)

        {

            arr[i][j] = 10;



            cout << arr[i][j] << " ";

        }

    }



    return 0;

}

*/
//array of vectors
/**

#include <iostream>

#include <cmath>

#include <bits/stdc++.h>

#include <climits>

#include <deque>

using namespace std;



int main()

{

    int m = 3, n = 2;



    vector<int> arr[m];



    for (int i = 0; i < m; i++)

    {

        for (int j = 0; j < n; j++)

        {

            arr[i].push_back(10);

        }

    }



    for (int i = 0; i < m; i++)

    {

        for (int j = 0; j < n; j++)

        {

            cout << arr[i][j] << " ";

        }

    }



    return 0;

}

*/
//vector of vectors
/**

#include <iostream>

#include <cmath>

#include <bits/stdc++.h>

#include <climits>

#include <deque>

using namespace std;



int main()

{

    int m = 3, n = 2;



    vector<vector<int>> arr;



    for (int i = 0; i < m; i++)

    {

        vector<int> v;



        for (int j = 0; j < n; j++)

        {

            v.push_back(10);

        }



        arr.push_back(v);

    }



    for (int i = 0; i < arr.size(); i++)

    {

        for (int j = 0; j < arr[i].size(); j++)

        {

            cout << arr[i][j] << " ";

        }

    }



    return 0;

}

*/
