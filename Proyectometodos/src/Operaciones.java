public class Operaciones {

    public void sumar(int op1, int op2){
        int resultado= op1+op2;
        System.out.println("El resultado de la suma "+resultado);
    }
    public void restar(int op1, int op2){
        int resultado= op1-op2;
        System.out.println("El resultado de la resta "+resultado);
    }
    public void multiplicacion(int op1, int op2){
        int resultado= op1*op2;
        System.out.println("El resultado de la multiplicacion "+resultado);
    }
    public void division(int op1, int op2){
        int resultado= op1/op2;
        System.out.println("El resultado de la division "+resultado);
    }
    public boolean validarNumero (int numeroValidar){
        return numeroValidar>0;

    }
}
