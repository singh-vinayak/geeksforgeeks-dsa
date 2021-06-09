// Consider an arrangement where n petrol pumps are arranged in a circular
// manner. We need to find the first petrol pump from where we can visit all
// petrol pumps and come back to the petrol pump without ever going out of the
// petrol.

class circularTour {
    static int firstPetrolPump(int petrol[], int dist[], int n) {
        for (int start = 0; start < n; start++) {
            int curr_petrol = 0, end = start;
            while (true) {
                curr_petrol += (petrol[end] - dist[end]);
                if (curr_petrol < 0)
                    break;
                end = (end + 1) % n;
                if (end == start)
                    return (start + 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int petrol[] = { 4, 8, 7, 4 };
        int dist[] = { 6, 5, 7, 3 };
        System.out.println(firstPetrolPump(petrol, dist, 4));
    }

}

/**
 * a better approach would be using deque data structure for the above approach.
 * remove the peak element every time we move ahead and check if the new element
 * is greater than the peak of the previously formed dq.
 */

// efficient approach below
// static int firstPetrolPump(int petrol[],int dist[],int n)
// {
// int start=0,curr_pet=0,prev_pet=0;
// for(int i=0;i<n;start++)
// {
// curr_pet+=(petrol[i]-dist[i]);
// if(curr_pet<0)
// {
// start=i+1;
// prev_pet+=curr_pet;
// curr_pet=0;
// }
// }
// return (prev_pet+curr_pet)>=0? (start+1):-1;
// }
