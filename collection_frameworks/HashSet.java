//Hashset in java - unordered collection of data but no duplicacy allowed
import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>();

        // Insert elements
        s.add(10);
        s.add(20);
        s.add(5);
        s.add(10); // duplicate ignored

        System.out.print("Unordered Set elements: ");
        for (int x : s) {
            System.out.print(x + " ");
        }
        System.out.println();

        // Search element
        if (s.contains(5))
            System.out.println("5 is present");
        else
            System.out.println("5 is not present");

        // Erase element
        s.remove(20);

        System.out.println("Size after deletion: " + s.size());

        // Clear all elements
        s.clear();
        System.out.println("Set empty? " + (s.isEmpty() ? "Yes" : "No"));
		
		
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        // Insert elements in sequence like whatever comes at index 1 will be sitted there forever
        lhs.add(10);
        lhs.add(20);
        lhs.add(5);
        lhs.add(10); // duplicate ignored

    }
}

//c++ unordered_set
// #include <bits/stdc++.h>
// using namespace std;

// int main() {
//     unordered_set<int> s;

//     // Insert elements
//     s.insert(10);
//     s.insert(20);
//     s.insert(5);
//     s.insert(10); // duplicate ignored

//     cout << "Unordered Set elements: ";
//     for (int x : s) {
//         cout << x << " ";
//     }
//     cout << endl;

//     // Search element
//     if (s.find(5) != s.end())
//         cout << "5 is present" << endl;
//     else
//         cout << "5 is not present" << endl;

//     // Erase element
//     s.erase(20);

//     cout << "Size after deletion: " << s.size() << endl;

//     // Clear all elements
//     s.clear();
//     cout << "Set empty? " << (s.empty() ? "Yes" : "No") << endl;

//     return 0;
// }

