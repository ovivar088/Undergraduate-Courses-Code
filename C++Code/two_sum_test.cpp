#include <iostream>
#include <vector>

#include <map>
 
using namespace std;
 
class Solution {
public:
    vector twoSum(vector &numbers, int target) {
        int len = numbers.size();
        map<int, int> r;
        vector rr;
        for (int i = 0; i < len; i ++) {
            if (r.find(numbers[i]) == r.end()) { // if not exist
                r[numbers[i]] = i;  // add it to the map
            }
            int j, num = target - numbers[i];
            if ((r.find(num) != r.end()) && ((j = r[num]) < i)) {
                rr.push_back(j + 1);
                rr.push_back(i + 1);
                return rr;
            }
        }
        return rr;
    }
};