//HashMap in java vs unordered_map in c++
import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();

        // Insert elements
        marks.put("Ram", 90);
        marks.put("Shyam", 85);
        marks.put("Mohan", 95);

        // Duplicate key (overwrites)
        marks.put("Ram", 99);

        System.out.println("Marks of students (unordered):");
        for (Map.Entry<String, Integer> e : marks.entrySet()) {
            System.out.println(e.getKey() + " => " + e.getValue());
        }

        // Search
        if (marks.containsKey("Shyam"))
            System.out.println("Shyam is present");
        else
            System.out.println("Shyam not found");

        // Erase key
        marks.remove("Mohan");

        // Size
        System.out.println("Size after deletion: " + marks.size());

        // Clear
        marks.clear();
        System.out.println("Empty? " + (marks.isEmpty() ? "Yes" : "No"));
    }
}

//c++ unordered_map
// // #include <bits/stdc++.h>
// using namespace std;

// int main() {
//     unordered_map<string, int> marks;

//     // Insert elements
//     marks["Ram"] = 90;
//     marks["Shyam"] = 85;
//     marks["Mohan"] = 95;

//     // Duplicate key (overwrites)
//     marks["Ram"] = 99;

//     cout << "Marks of students (unordered):\n";
//     for (auto &p : marks) {
//         cout << p.first << " => " << p.second << endl;
//     }

//     // Search
//     if (marks.find("Shyam") != marks.end())
//         cout << "Shyam is present\n";
//     else
//         cout << "Shyam not found\n";

//     // Erase key
//     marks.erase("Mohan");

//     // Size
//     cout << "Size after deletion: " << marks.size() << endl;

//     // Clear
//     marks.clear();
//     cout << "Empty? " << (marks.empty() ? "Yes" : "No") << endl;

//     return 0;
// }

