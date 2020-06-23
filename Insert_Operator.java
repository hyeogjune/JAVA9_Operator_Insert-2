import java.util.*;
public class Insert_Operator {
	
	static int[] a;
	static int n;
	static int max;
	static int min;
	
	public static void dfs(int idx, int sum, int[] op, int s) {
		if(idx == n) {
			max = Math.max(max, sum);
			min = Math.min(min, sum);
			return;
		}
		
		int[] cop = new int[4];
		
		for(int i = 0; i < 4; i++) {
			cop[i] = op[i];
		}
		if(s != -1) {
			cop[s]--;
		}
		
		if(cop[0] > 0) {
			dfs(idx+1, sum + a[idx], cop, 0);
		}
		if(cop[1] > 0) {
			dfs(idx+1, sum - a[idx], cop, 1);
		}
		if(cop[2] > 0) {
			dfs(idx+1, sum * a[idx], cop, 2);
		}
		if(cop[3] > 0) {
			dfs(idx+1, sum / a[idx], cop, 3);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[n];
		max = -1000000001;
		min = 1000000001;
		
		int[] op = new int[4];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < 4; i++) {
			op[i] = sc.nextInt();
		}
		
		dfs(1, a[0], op, -1);
		
		System.out.println(max + "\n" + min);
	}
}
	
	
	

	/*
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int max = Integer.MIN_VALUE; // 최대 값 시작은 정수 최소값
		int min = Integer.MAX_VALUE; // 최소 값 시작은 정수 최대값
		
		//첫째 줄, 2부터 10 사이의 원하는 숫자 N의 개수 입력
		System.out.print("수의 개수 입력: ");
		int N = sc.nextInt();		
		N_range(N); //범위가 2부터 10까지일 조건
		
		//둘째 줄, 1부터 100사이 원하는 숫자 N개 입력
		System.out.print("숫자 N개 입력: ");
		int[] arr = new int[N];
		for(int i = 0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		Arr_range(arr, N); //범위가 1부터 100까지일 조건
		
		//셋째 줄, 합이 N-1인 4개의 정수(+,-,*,/)
		System.out.print("+, -, *, /의 개수: ");
		int[] arr_arith = new int[4];
		for(int i = 0; i<arr_arith.length; i++) {
			arr_arith[i] = sc.nextInt();
		}
		Arith(arr_arith, N); //합이 N-1일 조건
		
		Dfs(1, arr_arith[0], arr_arith[1], arr_arith[2], arr_arith[3], arr[0], arr, max, min);
		System.out.println(max);
		System.out.print(min);
		
	}
	
	public static void Dfs(int count, int p, int m, int t, int d, int sum, int[] arrr, int max, int min) {
		if(arrr.length == 1) {
			max = Integer.max(max, sum);
			min = Integer.min(min, sum);
			return;
		}
	}
	
	
	public static void N_range(int n) {		
		if(2<= n && n<=10) {
			return;
		}
		else {
			System.out.print("재입력");
		}
	}
	
	
	public static void Arr_range(int[] arrr, int NN) {
		for(int i = 0; i<arrr.length; i++) {
			if(1<=arrr[i] && arrr[i]<=100) {
				return;
			}
			else {
				System.out.print("재입력");
			}
		}
	}
	
	
	public static void Arith(int[] arrr_arith, int NN) {
		if(arrr_arith[0] + arrr_arith[1] + arrr_arith[2] + arrr_arith[3] == NN-1) {
			return;
		}
		else {
			System.out.print("재입력");
		}
	}
	*/

	
	

