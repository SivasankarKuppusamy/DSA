package LinkedList;

import java.util.*;
import java.util.LinkedList;
public class JavaCollections {
    public static void main(String[] args) {
        Queue <Character> q=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(c=='('||c=='{'||c=='['){
                q.add(c);
            }
            else if(c==']'&&q.peek()=='['){
                q.poll();
            }
            else if(c==')'&&q.peek()=='('){
                q.poll();
            }
            else if(c=='}'&&q.peek()=='{'){
                q.poll();
            }
        }
        if(q.isEmpty()){
            System.out.println(true);
        }
        else
        System.out.println(false);
    }
}
