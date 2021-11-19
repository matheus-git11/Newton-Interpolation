package INTER;

public class classds {
	
	
	public static void main(String[] args)
	{
	
		int n = 8;
		double x[] = { 2, 4, 8, 10, 12 ,16 ,18 ,22 }; // valores fornecidos para x 
		
		
		double y[][]=new double[n][n]; // valores fornecidos para f(x) e uma matriz com base no numero do x
		y[0][0] = 0.3010;
		y[1][0] = 0.6020;
		y[2][0] = 0.9030;
		y[3][0] = 1.0000;
		y[4][0] = 1.0792;
		y[5][0] = 1.2041;
		y[6][0] = 1.2552;
		y[7][0] = 1.3424;
		
		

		
		for (int i = 1; i < n; i++) {  // metodo para realizaras operacoes e deixara matriz completa
			for (int j = 0; j < n - i; j++)
				y[j][i] = y[j + 1][i - 1] - y[j][i - 1];
		}

	
		for (int i = 0; i < n; i++) { // metodo parecido com o de cima porem apenas com função de printar a matriz
			System.out.print(x[i]+"\t");
			for (int j = 0; j < n - i; j++)
				System.out.print(y[i][j]+"\t");
			System.out.println();
		}

		
		
		int valor[]  = {6,14,20}; // vetores dos valores pedidos a serem resolvidos pela interpolação
		
    for(int k=0 ;k<=2;k++){ 
		
		double sum = y[0][0];
		double u = (valor[k] - x[0]) / (x[1] - x[0]);
		for (int i = 1; i < n; i++) {
			sum = sum + (Calcular(u, i) * y[0][i]) / //
									fatorial(i); 
		}
		System.out.println("o valor "+valor[k]+" corresponde á "+ sum);
    }
		
	}
	
	public static double Calcular (double u , int n) {
		double temp = u;
		for (int i = 1; i < n; i++)
			temp = temp * (u - i);
		return temp;
	}
	
	public static int fatorial(int n) {
		int f = 1;
		for (int i = 2; i <= n; i++)
			f *= i;
		return f;
	}
	

	}

 

