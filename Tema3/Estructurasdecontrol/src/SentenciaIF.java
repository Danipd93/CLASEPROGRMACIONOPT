public class SentenciaIF {

    public void notaExamen(int nota) {
        // Validamos que la nota esté en el rango correcto
        if (nota < 0 || nota > 10) {
            System.out.println("La nota debe estar entre 0 y 10");
            return;
        }

        if (nota < 5) {
            System.out.println("El examen está suspenso");
        } else if (nota < 8) {
            System.out.println("El examen está aprobado");
        } else if (nota < 9) {
            System.out.println("El examen es notable");
        } else if (nota < 10) {
            System.out.println("El examen es sobresaliente");
        } else {
            System.out.println("El examen tiene matrícula de honor");
        }
    }

