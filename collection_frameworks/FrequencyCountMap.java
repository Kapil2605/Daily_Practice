import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 1};

        // HashMap to store frequency
        Map<Integer, Integer> freq = new HashMap<>();

        // Counting frequency
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            // if key exists, get old value and add 1
            // else start from 1
            freq.put(key, freq.getOrDefault(key, 0) + 1);
        }

        // Printing result
        System.out.println("Element frequencies:");
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            System.out.println(e.getKey() + " => " + e.getValue());
        }
    }
}

// #include <bits/stdc++.h>
// using namespace std;

// int main() {
//     vector<int> v = {1, 2, 2, 3, 3, 3, 4, 1};

//     // Map to store frequency
//     map<int, int> freq;

//     // Counting frequency
//     for (int i = 0; i < v.size(); i++) {
//         freq[v[i]]++; // agar key nahi hai toh automatically 0 se start hota hai
//     }

//     // Printing result
//     cout << "Element frequencies:\n";
//     for (auto &p : freq) {
//         cout << p.first << " => " << p.second << endl;
//     }

//     return 0;
// }
