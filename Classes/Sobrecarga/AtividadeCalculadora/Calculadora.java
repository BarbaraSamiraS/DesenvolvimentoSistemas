
public class Calculadora {
	
	private String nome;
    
    public Calculadora(String nome) {
        this.nome = nome;
    }
    
    // Soma
    public int Soma(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }

    public double Soma(double num1, double num2) {
       double resultado = num1 + num2;
        return resultado;
    }
    
    public int Soma (int[] nume) {
    	int resultado = 0;
    	for (int i=0; i < nume.length; i++) {
    	 resultado += nume[i];
    	}
    	return resultado;
    }
    
    public double Soma (double[] nume) {
    	double resultado = 0.0;
    	for (int i=0; i < nume.length; i++) {
    	 resultado += nume[i];
    	}
    	return resultado;
    }
    
 // Subtra��o
    public int Subtracao(int num1, int num2) {
        int resultado = num1 - num2;
        return  resultado;
    }

    public double Subtracao(double num1, double num2) {
        double resultado = num1 - num2;
        return resultado;
    }
    
    public int Subtracao (int[] nume) {
    	int resultado = nume[0];
    	for (int i=1; i < nume.length; i++) {
    	 resultado -= nume[i];
    	}
    	return resultado;
    }
    
    public double Subtracao (double[] nume) {
    	double resultado = nume[0];
    	for (int i=1; i < nume.length; i++) {
    	 resultado -= nume[i];
    	}
    	return resultado;
    }
    
 // Multiplica��o
    public int Multiplicacao(int num1, int num2) {
        int resultado = num1 * num2;
        return resultado;
    }

    public double Multiplicacao(double num1, double num2) {
       double resultado = num1 * num2;
        return resultado;
    }
    
    public int Multiplicacao (int[] nume) {
    	int resultado = nume[0];
    	for (int i=1; i < nume.length; i++) {
    	 resultado *= nume[i];
    	}
    	return resultado;
    }
    
    public double Multiplicacao (double[] nume) {
    	double resultado = nume[0];
    	for (int i=1; i < nume.length; i++) {
    	 resultado *= nume[i];
    	}
    	return resultado;
    }
    
 // Divis�o
    public int Divisao(int num1, int num2) {
        int resultado = num1 / num2;
        return resultado;
    }

    public double Divisao(double num1, double num2) {
       double resultado = num1 / num2;
       return resultado;
    }
    
    public int Divisao (int[] nume) {
    	int resultado = nume[0];
        for (int i = 1; i < nume.length; i++) {
            resultado /= nume[i];
        }
    	return resultado;
    }
    
    public double Divisao (double[] nume) {
    	double resultado = nume[0];
    	for (int i=1; i < nume.length; i++) {
    	 resultado /= nume[i];
    	}
    	return resultado;
    }
    
    
    

}
