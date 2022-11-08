class Untitled {
	public static void bucketSort(int[] Array) {
		int max = Array[0];
		int min = Array[0];
		int z = 0;
		for (int i = 0;i < Array.length;i++) {
			if (Array[i] > max) {
				max = Array[i];
			}
			if (Array[i] < min) {
				min = Array[i];
			}
		}
		int num = (max - min) / Array.length + 1;
		int d = (max - min + 1) / Array.length;
		int[][] bucket = new int[20][Array.length];
		for (int i = 0;i < Array.length;i++) {
			int x = (Array[i] - min) / d;
			int c = 0;
			while (bucket[x][c] != 0) {
				c++;
			}
			bucket[x][c] = Array[i];
		}
		
		for (int i = 0;i < 20;i++) {
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