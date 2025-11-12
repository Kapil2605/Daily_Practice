//java treeset==unorderset in c++
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Declare a TreeSet of integers (ordered, unique)
        Set<Integer> s = new TreeSet<>();

        // Insert elements (duplicates ignored automatically)
        s.add(10);
        s.add(20);
        s.add(10); // duplicate ignored
        s.add(5);

        System.out.print("Set elements (sorted): ");
        for (int x : s) {
            System.out.print(x + " ");
        }
        System.out.println();

        // Check if element exists
        if (s.contains(20))
            System.out.println("20 is present in the set");
        else
            System.out.println("20 is not present");

        // Remove an element
        s.remove(10);

        // Print size
        System.out.println("Set size after deletion: " + s.size());

        // Clear all elements
        s.clear();
        System.out.println("Set empty? " + (s.isEmpty() ? "Yes" : "No"));
    }
}


//c++ orderedset code
// #include <bits/stdc++.h>
// using namespace std;

// int main() {
//     // Declare a set of integers (ordered, unique)
//     set<int> s;

//     // Insert elements (duplicates ignored automatically)
//     s.insert(10);
//     s.insert(20);
//     s.insert(10);  // duplicate, ignored
//     s.insert(5);

//     cout << "Set elements (sorted): ";
//     for (int x : s) {
//         cout << x << " ";
//     }
//     cout << endl;

//     // Check if element exists
//     if (s.find(20) != s.end())
//         cout << "20 is present in the set" << endl;
//     else
//         cout << "20 is not present" << endl;

//     // Remove an element
//     s.erase(10);

//     // Print size
//     cout << "Set size after deletion: " << s.size() << endl;

//     // Clear all elements
//     s.clear();
//     cout << "Set empty? " << (s.empty() ? "Yes" : "No") << endl;

//     return 0;
// }

