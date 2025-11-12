
//🪣 2. Dynamic Array — vector vs ArrayList
//java code
import java.util.*;
class Main {
    public static void main(String[] args) {
       ArrayList<Integer>v=new ArrayList<>();
       //adding element in list
       v.add(10);
       v.add(20);
       //updating at oth index with 30
       v.set(0,30);
       //iterating the list
       for(Integer num:v){
           System.out.print(num+" ");
       }
       //accessing first index element
       System.out.println(v.get(0));
       
    }
}

//c++ code
// Online C++ compiler to run C++ program online
// #include <bits/stdc++.h>
// using namespace std;
// int main() {
//     vector<int>v;
//     v.push_back(10);
//     v.push_back(20);
    
//     v[0]=30;
    
//     for(int num:v){
//         cout<<num<<" ";
//     }
//     cout<<v[0];
    
//     v.pop_back();
    
//     for(int num:v){
//         cout<<num<<" ";
//     }
//     return 0;
// }