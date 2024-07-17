import javax.swing.JOptionPane;

public class JavaLibsPractice {

    public static void main(String[] args) {
        // Paso 2: Definir variables para almacenar las entradas del usuario
        String nombre;
        int edad;
        double altura;
        String ciudad;
        String color;
        String animal;
        String comida;
        String pasatiempo;
        String trabajoSonado;
        String libroFavorito;

        // Paso 3: Usar JOptionPane para obtener entradas del usuario
        nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad:"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura en metros:"));
        ciudad = JOptionPane.showInputDialog("Ingrese su ciudad:");
        color = JOptionPane.showInputDialog("Ingrese su color favorito:");
        animal = JOptionPane.showInputDialog("Ingrese su animal favorito:");
        comida = JOptionPane.showInputDialog("Ingrese su comida favorita:");
        pasatiempo = JOptionPane.showInputDialog("Ingrese su pasatiempo:");
        trabajoSonado = JOptionPane.showInputDialog("Ingrese su trabajo soñado:");
        libroFavorito = JOptionPane.showInputDialog("Ingrese su libro favorito:");

        // Paso 4: Realizar operaciones matemáticas
        int edadProximoAno = edad + 1;
        double alturaEnCm = altura * 100;

        // Paso 5: Construir la historia
        String historia = "Érase una vez, una persona llamada " + nombre + ".\n" +
                          nombre + " tenía " + edad + " años y vivía en " + ciudad + ".\n" +
                          "Medía " + alturaEnCm + " cm de altura y le encantaba el color " + color + ".\n" +
                          nombre + " tenía una mascota " + animal + " y disfrutaba comer " + comida + ".\n" +
                          "En su tiempo libre, le gustaba " + pasatiempo + " y soñaba con convertirse en " + trabajoSonado + ".\n" +
                          "Su libro favorito era '" + libroFavorito + "'.\n" +
                          "El próximo año, " + nombre + " tendrá " + edadProximoAno + " años.\n" +
                          "Y vivieron felices para siempre.";

        // Paso 6: Mostrar la historia completa
        JOptionPane.showMessageDialog(null, historia, "Tu Historia JavaLibs", JOptionPane.INFORMATION_MESSAGE);
    }
}
