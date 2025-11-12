//using for loop to iterate the map

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Ram", 90);
        marks.put("Shyam", 85);
        marks.put("Mohan", 95);

        System.out.println("Printing map using for-each loop:");
        // ✅ Method 1: For-each with entrySet()
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Marks: " + entry.getValue());
        }

        System.out.println("\nPrinting map using keySet():");
        // ✅ Method 2: Loop through only keys
        for (String name : marks.keySet()) {
            System.out.println("Name: " + name + ", Marks: " + marks.get(name));
        }

        System.out.println("\nPrinting map using iterator:");
        // ✅ Method 3: Using Iterator
        Iterator<Map.Entry<String, Integer>> it = marks.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> e = it.next();
            System.out.println("Name: " + e.getKey() + ", Marks: " + e.getValue());
        }
    }
}


//c++ code
//#include <bits/stdc++.h>
// using namespace std;

// int main() {
//     map<string, int> marks;
//     marks["Ram"] = 90;
//     marks["Shyam"] = 85;
//     marks["Mohan"] = 95;

//     cout << "Printing map using for-each loop:\n";
//     // ✅ Method 1: Range-based for loop (Recommended)
//     for (auto &entry : marks) {
//         cout << "Name: " << entry.first << ", Marks: " << entry.second << endl;
//     }

//     cout << "\nPrinting map using iterator:\n";
//     // ✅ Method 2: Using iterator
//     for (map<string, int>::iterator it = marks.begin(); it != marks.end(); ++it) {
//         cout << "Name: " << it->first << ", Marks: " << it->second << endl;
//     }

//     return 0;
// }
