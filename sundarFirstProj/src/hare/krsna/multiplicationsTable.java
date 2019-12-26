package hare.krsna;

public class multiplicationsTable {
	
	void multiply(int n)
	{
		for (int i=1; i<=n; i++)
		{
			System.out.printf("%d * %d = %d", n, i, n*i).println();
		}
	}

}
