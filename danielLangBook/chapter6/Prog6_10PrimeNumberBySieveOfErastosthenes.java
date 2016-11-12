package chapter6;

//prime numbeers till 10000 sieve of erastotsthanes

public class Prog6_10PrimeNumberBySieveOfErastosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 50;
		int[] a = new int[n + 1];
		for (int i = 2; i <= n; i++) {
			a[i] = i;
		}
		int j = 2;
		// ************************************************************************************************************
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (a[i] != 0) {
				j = i * i;
				while (j <= n) {
					a[j] = 0;
					j = j + i;// j(j+1)4 +2 6 +2
				}

			}
		}

		// ****************************************************************************************************************
		int k = 0;
		for (int i = 2; i <= n; i++)
			if (a[i] != 0) {
				k++;
			}
		int[] newArray = new int[k];
		k = 0;
		for (int i = 2; i <= n; i++)
			if (a[i] != 0) {
				newArray[k] = a[i];
				k++;
			}
		for (int l : newArray)
			System.out.println(l);
		System.out.println("total no of primes: " + k);

	}

}
