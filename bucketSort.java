class Untitled {
	public static void bucketSort(int[] Array) {
		int max = 0,min = 0;
		int z = 0;
		for (int i = 0;i < Array.length;i++) {
			if (Array[i] > max) {
				max = Array[i];
			}
			if (Array[i] < min) {
				min = Array[i];
			}
		}
		int num = (max-min) / Array.length+1;
		int d = (max-min+1) / Array.length;
		int[][] bucket = new int[num][Array.length];
		for (int i=0;i < Array.length;i++) {
			int x = (Array[i]-min) / d;
			for (;;) {
				int c = 0;
				if (bucket[x][c] != 0) {
					c++;
				}
				else {
					bucket[x][c] = Array[i];
					break;
				}
			}
		}
		for (int p = 0; p < bucket.length; p++) {
			for (int i = 1; i < bucket.length; i++) {
				if (bucket[i-1][0]>bucket[i][0]) {
					int x = bucket[i-1][0];
					int y = bucket[i][0];
					bucket[i-1][0] = y;
					bucket[i][0] = x;
					int q = bucket[i-1][1];
					int w = bucket[i][1];
					bucket[i-1][1] = w;
					bucket[i][1] = q;
				}
			}
		}
		for (int i = 0;i < num;i++) {
			for (int j = 0;j < bucket[i].length;j++) {
				if (bucket[i][j] != 0) {
					Array[z] = bucket[i][j];
					z++;
				}
			}
		}
	}
	public static void insertSort(int[] Array) {
		for (int i = 0; i < Array.length; i++) {
			for (int j = 1; j < Array.length; i++) {
				if (Array[i-1]>Array[j]) {
					int x = Array[j-1];
					int y = Array[j];
					Array[j-1] = y;
					Array[j] = x;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] Array = {31,33,27,15,42,11,40,5,19,21};
		bucketSort(Array);
		for (int i = 0; i < Array.length; i++) {
			System.out.print(Array[i]+" ");
		}
	}
}