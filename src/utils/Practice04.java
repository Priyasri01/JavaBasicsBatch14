package utils;

public class Practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a = { 12,15,11,13,9,25};
int[] a2= {12,15,11,13,9,25};
int sum=0;
for(int i=0; i<a.length-1; i++) {
	
	if(a[i]%2==a2[i]%5){
		
	sum+=i*i;
	}
	
}

System.out.println("sum= " + sum);

	}

}
