import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) a[i]=sc.nextInt();
		List<List<Integer>> res=new ArrayList<>();
		res.add(new ArrayList<>());
		for(int i:a){
		    int size=res.size();
		    for(int j=0;j<size;j++){
		    List<Integer> temp=new ArrayList<>(res.get(j));
		    temp.add(i);
		    res.add(temp);
		    }
		}
		for(List<Integer> l:res){
		    System.out.println(l);
		}
	}
}
