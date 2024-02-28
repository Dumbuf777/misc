package miscProgram;

public class PushZero {
	
	static void pushZeroToEnd(int arr[], int n) {
		int count=0;
		for (int i=0;i<n;i++) {
			if(arr[i]!=0) {
				arr[count++]=arr[i];
			}
		}
		
	}

}
