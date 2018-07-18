import java.io.*;
class coreStack
{
	private int max_stack;
	public int top;
	private String array[];
	
	public coreStack(int n)
	{
		max_stack = n;
		array = new String[n];
		top = -1;
	}
	
	public void push(String value)
	{
		array[++top] = value;
	}
	
	public String pop()
	{
		return array[top--];
	}
	
	public String peek()
	{
		return array[top];
	}
	
	public boolean isEmpty()
	{
		return (top==-1);
	}
	
	public boolean isFull()
	{
		return (top==max_stack-1);
	}
	
	public void cetak()
	{
		int i = top;
		while ( i>= 0)
		{              
			System.out.print(array[i]);
			System.out.print(" ");
			i--;
		}	
		System.out.println ("  ");
	}
}

class coreQueue 
{
	private int max_queue;
	private String array[];
	private int front;
	private int rear;
	public int count;
	
    public coreQueue(int n) 
    {
    	max_queue = n;
    	array = new String[n];
    	front = 0;
    	rear = -1;
    	count = 0;
    }
    
    public void enQueue(String value)
    {
    	if(!isFull())
    	{
    		array[++rear] = value;
    		count++;
    	}
    	else
    	{
    		System.out.println("Antrian sudah penuh");
    	}
    }
    
    public String deQueue()
    {
    	String temp = array[0];
    	if(!isEmpty())
    	{
    		for(int i=0; i<count; i++)
    		{
    			array[i] = array[i+1];
    			--count;
    			rear--;
    		}
    	}
    	else
    	{
    		System.out.println("Antrian sudah kosong");
    	}
    	return temp;
    }
    
    public String peekFront()
    {
    	return array[front];
    }
    
    public boolean isFull()
    {
    	return (rear == max_queue-1);
    }
    
    public boolean isEmpty()
    {
    	return (count == 0);
    }
    
    public int size()
    {
    	return count;
    }
    
    public void print()
    {
    	for(int i=0; i<count; i++)
    	{
    		System.out.print(array[i] + " ");
    	}
    	System.out.println("");
    }
}

class stack 
{
    public static void main(String[] args) throws IOException
    {
    	BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
    	System.out.print("Masukkan maksimal stack : ");
    	int n = Integer.parseInt(io.readLine());
    	
    	System.out.println("=============================");
    	System.out.println("==========Menu Stack=========");
    	System.out.println("=============================");
    	System.out.println("1. Push Stack\t\t (1)");
    	System.out.println("2. Pop Stack\t\t (2)");
    	System.out.println("3. Peek Stack\t\t (3)");
    	System.out.println("4. Check isFull\t\t (4)");
    	System.out.println("5. Check isEmpty\t (5)");
    	System.out.println("6. Print Stack\t\t (6)");
    	System.out.println("7. Input to Queue\t (7)");
    	System.out.println("8. Print Queue\t\t (8)");
    	System.out.println("9. Input to Queue + DeQueue + Print (9)");
    	System.out.println("=============================");
    	System.out.println("");
    	
    	coreStack s = new coreStack(n);
    	coreQueue q = new coreQueue(n);
    	
    	for(String b="y"; b.equals("y")|| b.equals("Y");)
    	{
    		System.out.print("Tekan sesuai daftar untuk melakukan operasi stack.");
	    	System.out.println("");
	    	
	    	int menu = Integer.parseInt(io.readLine());
	    	switch(menu)
	    	{
	    		case 1 : if(s.isFull() != true)
			    			 {
			    				System.out.println("Masukkan data yang akan dipush ke stack : ");
				    			String data = io.readLine();
				    			s.push(data);
				    			System.out.println ("  ");
			    			 }
			    			 else
			    			 {
			    			 	System.out.println("Stack penuh.");
			    			 	System.out.println ("  ");
			    			 }
			    			 break;
			    			 
	    		case 2 : if(s.isEmpty() != true)
			    			 {
			    				System.out.println(s.pop());
			    				System.out.println ("  ");
			    			 }
			    			 else
			    			 {
			    			 	System.out.println("Stack kosong.");
			    			 	System.out.println ("  ");
			    			 }
			    			 break;
			    			 
	    	 	case 3 : if(s.isEmpty() != true)
			    			 {
			    				System.out.println(s.pop());
			    				System.out.println ("  ");
			    			 }
			    			 else
			    			 {
			    			 	System.out.println("Stack kosong.");
			    			 	System.out.println ("  ");
			    			 }
			    			 break;
			    			 
	    		case 4 : if(s.isFull() != true)
			    			 {
			    				System.out.println("Stack belum penuh.");
			    				System.out.println ("  ");
			    			 }
			    			 else
			    			 {
			    			 	System.out.println("Stack penuh.");
			    			 	System.out.println ("  ");
			    			 }
			    			 break;
			    			 
	    		case 5 : if(s.isEmpty() != true)
			    			 {
			    				System.out.println("Stack belum kosong.");
			    				System.out.println ("  ");
			    			 }
			    			 else
			    			 {
			    			 	System.out.println("Stack kosong.");
			    			 	System.out.println ("  ");
			    			 }
			    	     break;
			    	     
	    		case 6 : s.cetak();
	    				 System.out.println ("  ");
	    			 	 break;
	    			 	 
	    		case 7 : int i = s.top;
	    				 while(i>=0)
	    				 {
	    				 	q.enQueue(s.pop());
	    				 	i--;
	    				 }
	    				 System.out.println("Berhasil dimasukkan ke Queue");
	    				 break;
	    				 
	    		case 8 : q.print();
	    				 System.out.println ("  ");
	    			 	 break;
	    		
	    		case 9 : int k = s.top;
	    				 while(k>=0)
	    				 {
	    				 	q.enQueue(s.pop());
	    				 	k--;
	    				 }
	    				 int l = q.count;
	    				 for(int j=0; j<l; j++)
	    				 {
	    				 	System.out.print(q.deQueue());
	    				 	--l;
	    				 }
	    				 System.out.println("");
	    				break;
	    		default : System.out.println("Maaf menu yang Anda masukkan salah.");
	    				  System.out.println ("  ");
	    				  break;
	    	}
	    	
	    	System.out.print("Ada operasi stack lain? (Y/n) : ");
	    	b = io.readLine();
	    	System.out.println ("  ");
    	}
    }
}
