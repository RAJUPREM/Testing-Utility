import java.util.Arrays;

public class Animal {
	
	public String[] arr={"ant","bison","camel","duck","elephant"};
	
	public void Slice()
	{
		for(int i=0;i<this.arr.length;i++)
		{
			System.out.println(this.arr[i]);
		}
	}
	
	public void Slice(int x)
	{
		if(x<0)
		{
			x*=(-1);
			for(int i=this.arr.length-x;i<this.arr.length;i++)
			{
				System.out.println(this.arr[i]);
			}
		}
		else
		{
		for(int i=x;i<this.arr.length;i++)
		{
			System.out.println(this.arr[i]);
		}
		}
	}
	
	public void Slice(int x ,int y)
	{
		if(x>0 && y<0)
		{
			y*=(-1);
		for(int i=x;i<this.arr.length-y;i++)
		{
			System.out.println(this.arr[i]);
		}
		}
		else if(x>0 && y>0)
		{
			for(int i=x;i<y;i++)
			{
				System.out.println(this.arr[i]);
			}
		}
	}
	
	public static void prime()
	{
		int x=30;
		for(int i=2;i<x;i++)
		{
			int count=0;
			for(int j=1;j<=i/2;j++)
			{
				if(i%j==0)
				{
					count+=1;
				}
			}
			if(count<2)
			{
				System.out.println("I am prime number : "+i);
			}
		}
	}

	public static void main(String[] args) {
		
		Animal s=new Animal();
		
		s.Slice();
		System.out.println("-----------------------------");
		s.Slice(2);
		System.out.println("-----------------------------");
		s.Slice(2,4);
		System.out.println("-----------------------------");
		s.Slice(-2);
		System.out.println("-----------------------------");
		s.Slice(2,-1);
		prime();
	}

	@Override
	public String toString() {
		return "Animal [arr=" + Arrays.toString(arr) + "]";
	}

}
