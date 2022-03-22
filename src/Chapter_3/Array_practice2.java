package Chapter_3;

public class Array_practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[][]; //2차원배열 선언
//		arr = new int[3][4];
//		
//		int arr2[][] = {{1,2,3},
//				        {4,5,6}};
//		
//		int len = arr2.length;
//		
//		System.out.println(len);
//		
//		int len2 = arr2[1].length;
//		
//		System.out.println(len2);
		
		
		int arr[][]; //2차원배열 선언
		arr = new int[3][4];
		
		int arr2[][] = {{1,2,3},
				        {4,5,6},
						{7,8,9}};
		
		for(int i=0;i<arr2.length;i++) {
			for(int j=0; j<arr2[i].length;j++) {
				System.out.println(arr2[i][j]);
			}
		}
				
	}
}

