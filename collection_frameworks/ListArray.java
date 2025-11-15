
//🪣 2. Dynamic Array — vector vs ArrayList
//ArrayList is used to stored \
//java code
import java.util.*;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
		List<Object>list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(1,30);
		list.add("Kapil");//to add string or any data type we have require object data type
		System.out.println(list);
		
		
		//ArayList implements List interface
        ArrayList<Integer> v = new ArrayList<>();
        // adding element in list
        v.add(10);
        v.add(20);
        // updating at oth index with 30
        v.set(0, 30);
        // iterating the list
        for (Integer num : v) { 
            System.out.print(num + " ");
        }
        // accessing first index element
        System.out.println(v.get(0));
		
		//vector== syncronized and thread safe  but slower thats why we prefer ArrayList for faster
		Vector<Integer>vc=new Vector<>();
		vc.add(12);
		vc.add(15);
		vc.add(13);
		System.out.println("Vector: "+vc);
		vc.clear();
		System.out.println("Vector: "+vc);
		
		//Stack implements list
		Stack<Integer>s=new Stack<>();
		s.push(10);
		s.push(10);
		s.push(20);
		System.out.println("Stack: "+s);
		System.out.println("Top element: "+s.peek());
		System.out.println("Pop top element: "+s.pop());
		System.out.println("Stack: "+s);
		while(!s.empty()){
			System.out.println("Top element: "+s.peek());
			s.pop();
		}
		
    }
}

// c++ code
// Online C++ compiler to run C++ program online
// #include <bits/stdc++.h>
// using namespace std;
// int main() {
// vector<int>v;
// v.push_back(10);
// v.push_back(20);

// v[0]=30;

// for(int num:v){
// cout<<num<<" ";
// }
// cout<<v[0];

// v.pop_back();

// for(int num:v){
// cout<<num<<" ";
// }
// return 0;
// }