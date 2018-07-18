import java.util.LinkedList;
import java.io.*;
class LinkedListLihat 
{
  	public static void main(String[] args)  throws IOException
  	{		int DATA,i,j;
  			String data;
  			LinkedList<String> uu = new LinkedList<String>();
    		LinkedList<Integer> ll = new LinkedList<Integer>();
    		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    		System.out.println("Isi Data Linked List integer !!!");
    		
    		for (i=0; i<5; i++)
    		{
    		
    			System.out.print("Masukkan  Data A ke-"+i+" : "); DATA = Integer.parseInt(in.readLine()); 
    			ll.add(DATA);
    		}
    		
    		System.out.println(" "); 
    			
    		System.out.println("Isi Data Linked List String !!!");
    	
    		for (j=0; j<3; j++)
    		{
    		System.out.print("Masukkan  Data B ke-"+j+" : "); data = in.readLine(); 
    		uu.add(data);
    		}
    		System.out.println(" "); 
    			
    		System.out.println("ISI LINKED LIST ");
    		System.out.println(ll);
    		System.out.println(uu);
    		
    		
    		System.out.println(" "); 
    		System.out.print(ll.get(0));
    		System.out.print(" "); 
    		System.out.print(uu.get(0));
    		System.out.print(" "); 
    		System.out.print(ll.get(0));
    		System.out.println(" "); 
    		System.out.print(uu.get(1));
    		System.out.print(" "); 
    		System.out.print(uu.get(2));
    		System.out.print(" "); 
    		System.out.print(ll.get(1));
    		System.out.println(" "); 
    		System.out.print(ll.get(1));
    		System.out.print(" "); 
    		System.out.print(uu.get(0));
    		System.out.print(" "); 
    		System.out.print(ll.get(1));
    		System.out.println(" "); 
    		System.out.print(uu.get(1));
    		System.out.print(" "); 
    		System.out.print(uu.get(2));
    		System.out.print(" "); 
    		System.out.print(ll.get(2));
    		System.out.println(" "); 
    		System.out.print(ll.get(2));
    		System.out.print(" ");
    		System.out.print(uu.get(0));
    		System.out.print(" ");
    		System.out.print(ll.get(2));
    		System.out.println(" "); 
    		System.out.print(uu.get(1));
    		System.out.print(" "); 
    		System.out.print(uu.get(2));
    		System.out.print(" ");  
    		System.out.print(ll.get(3));
    		System.out.println(" "); 
    		System.out.print(ll.get(3));
    		System.out.print(" "); 
    		System.out.print(uu.get(0));
    		System.out.print(" "); 
    		System.out.print(ll.get(3));
    		System.out.println(" "); 
    		System.out.print(uu.get(1));
    		System.out.print(" "); 
    		System.out.print(uu.get(2));
    		System.out.print(" "); 
    		System.out.print(ll.get(4));
    		System.out.println(" ");
    		System.out.println(" ");
    		System.out.println("ISI LINKED LIST ");
    		System.out.println(ll);
    		System.out.println(uu);
    		
}}
