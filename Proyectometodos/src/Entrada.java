public class Entrada {

    public static void main(String[] args) {

        System.out.println("Proyecto metodos");
        System.out.println("Vamosa realizar llamadas a metodos");
        saludar( "Angel");
        saludar( "Tomas");
        despedir();
        int numero;
        Operaciones operacionesMatematicas = new Operaciones();
        //operacionesMatematicas.sumar (1, 4);
        //operacionesMatematicas.restar(5, 2);
        //operacionesMatematicas.multiplicacion(5, 2);
        //operacionesMatematicas.division(20, 2);
        operacionesMatematicas.validarNumero(numeroValidar);
    }

    public static void saludar(String nombre){
    System.out.println("Hola"+nombre);
    System.out.println("Encantado de saludarte");
    System.out.println("vamos a praticar el llamado a metodos");
    System.out.println("Hay que ponerle tiempo");
    }

    public static void despedir(){

        System.out.println("Despedido");

    }
}
