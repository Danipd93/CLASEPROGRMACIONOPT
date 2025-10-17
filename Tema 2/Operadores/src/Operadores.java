public class Operadores {

    public void operadoresAritmeticos(){

        // unarios
        int operandoUno = 5;
        // incremento

        operandoUno ++; //le suma uno al valor que ya tenia
        operandoUno ++;
        operandoUno ++;
        operandoUno ++;
        System.out.println("El valor del operando despues de los incrementos es "+operandoUno);

        // decremento  le resta uno al valor que ya tenia como por ejemplo para se usa para casos com con el pin del movil
        operandoUno --;
        operandoUno --;
        operandoUno --;
        System.out.println("El valor del operando uno despues de los decrementos es "+operandoUno);
        // binarios  dos operadores: suma (+) resta (-) multi (*) div (/) modulo-resto division (%)
        operandoUno = 5;
        int operandoDos = 8;
        int suma = operandoUno + operandoDos;
        System.out.println("El resultado de la suma es " +suma);
        int operandoTres = 6;
        int resta = operandoDos - operandoTres;
        System.out.println("El valor de la resta es "+resta);
        int operandoCuatro = 4;
        int multi = operandoDos * operandoCuatro;
        System.out.println("El resultado de la multi es "+multi);
        int operandoCinco = 3;
        double divi = (double) operandoDos / operandoCinco;
        System.out.println(" El resultado de la division es "+divi);
        int modulo = operandoDos%operandoCinco;
        System.out.println("El modulo de la division es "+modulo);


    }
    public void operadoresAsignacion(){
        int operadorUno = 10;
        int operadorDos = 6;
        // operadorUno= operador +5;
        operadorUno += 5; // en operadorUno guarda la suma de lo que valia operadorUno + 5
        operadorUno += operadorDos;
        System.out.println("El valor de operador 1 es "+operadorUno);
        operadorUno -=5;
        operadorUno *=2;
        operadorUno %=2;



    }

    // seran utilizados como condicionnes para ejecutar una parte del codigo simpre el resultado es un boolean o true o false
    public void operadorComparacion (){
        int operandoUno = 10;
        int operandoDos = 20;
        boolean resultado = operandoUno>operandoDos;
        System.out.println(" El resultado de la comparacion es "+resultado);
        resultado = operandoUno<operandoDos;
        System.out.println(" El resultado de la comparacion es "+resultado);
        resultado = operandoUno<=operandoDos;
        resultado = operandoUno>=operandoDos;
        resultado = operandoUno==operandoDos;
        resultado = operandoUno!=operandoDos;
        // cuanto quieres cobrar
        // cuantos años tienes
        // tienes carnet de conducir (ejemplos de comparaciones)

    }

    public void operadoresLogicos (){
        int sueldo = 20000;
        int edad = 35;
        boolean conducir = true;
        // conducir = !conducir;
        // ! sirve para negar su validacion

        System.out.println("El candidato puede conducir: "+!conducir);
        // cuando quiere cobrar menos de 30000 y tiene menos de 40 años y pueda conducir
        boolean candidatoValido = sueldo<30000 && edad<40 && conducir; // true
        candidatoValido = sueldo<20000 || edad< 25 || conducir && sueldo>25000 && edad > 40;
        // OR CON || Y AND CON &&
        System.out.println("El candidato es valido: "+candidatoValido);
    }

    public void evaluarCandidato (double sueldo, int edad, boolean conducir, String nombre){
        boolean resultado = sueldo<=20000 && edad<40 && conducir;
        System.out.println("Evaluando al candidato nombre ");
        System.out.println("La evaluacion del candidato es: "+resultado);
    }

}
