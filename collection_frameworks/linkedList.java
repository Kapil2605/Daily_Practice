// java code for linkedlist
import java.util.*;
class Main {
    public static void main(String[] args) {
       LinkedList<Integer>v=new LinkedList<>();
       //adding element in list
       v.addFirst(10);
       v.addLast(20);
       //iterating the list
       for(Integer num:v){
           System.out.print(num+" ");
       }
       
       //remove from first and last of list
       v.removeFirst();
       v.removeLast();
    
        //iterating the list
       for(Integer num:v){
           System.out.print(num+" ");
       }
       
       //accessing first index element
       //System.out.println(v.getFirst());
       
    }
}

// // Online C++ compiler to run C++ program online
// #include <bits/stdc++.h>
// using namespace std;
// int main() {
//     list<int>l;
//     l.push_front(10);
//     l.push_front(20);
//     l.push_back(30);
    
//     for(int num:l){
//         cout<<num<<" ";
//     }
//     l.pop_front();
//     l.pop_back();
    
//     //l.front();
//     //l.back();
//     return 0;
// }