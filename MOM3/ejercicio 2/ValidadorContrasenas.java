public class ValidadorContrasenas {
    //MODIFICADO POR Dayana Carreño y Estevan Obando
    // Constante para la longitud mínima
    private static final int LONGITUD_MINIMA = 8;

    /**
     * Verifica si la contraseña tiene la longitud mínima requerida.
     * @param password La contraseña a verificar.
     * @return true si la longitud es válida, false en caso contrario.
     */
    public static boolean esLongitudValida(String password) {
        // TODO: Implementar lógica aquí
        if (password.length() > LONGITUD_MINIMA) {
            return true;
        }
        return false;
    }

    /**
     * Verifica si la contraseña contiene al menos una letra mayúscula.
     * @param password La contraseña a verificar.
     * @return true si contiene una mayúscula, false en caso contrario.
     */
    public static boolean contieneMayuscula(String password) {
        // TODO: Implementar lógica aquí
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true; // Se encontró una letra mayúscula
            }
        }
        return false; // Placeholder
    }

    /**
     * Verifica si la contraseña contiene al menos una letra minúscula.
     * @param password La contraseña a verificar.
     * @return true si contiene una minúscula, false en caso contrario.
     */
    public static boolean contieneMinuscula(String password) {
        // TODO: Implementar lógica aquí
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true; // Se encontró una letra mayúscula
            }
        }
        return false; // Placeholder
    }

    /**
     * Verifica si la contraseña contiene al menos un dígito.
     * @param password La contraseña a verificar.
     * @return true si contiene un dígito, false en caso contrario.
     */
    public static boolean contieneDigito(String password) {
        // TODO: Implementar lógica aquí
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true; // Se encontró una letra mayúscula
            }
        }
        return false; // Placeholder
    }

    /**
     * Verifica si una contraseña es segura según todos los criterios.
     * @param password La contraseña a verificar.
     * @return true si la contraseña es segura, false en caso contrario.
     */
    public static boolean esContrasenaSegura(String password) {
        // TODO: Llamar a los métodos anteriores y combinar sus resultados
        return esLongitudValida(password) &&
               contieneMayuscula(password) &&
               contieneMinuscula(password) &&
               contieneDigito(password);
    }

    public static void main(String[] args) {

        String [] pruebas = new String[10];
        pruebas[0] = "clave123";
        pruebas[1] = "ClaveSegura1";
        pruebas[2] = "OTRAMAYUSCULA2";
        pruebas[3] = "cLa1ve";
        pruebas[4] = "12345678";
        pruebas[5] = "12345678a";
        pruebas[6] = "ConMayusSinDigito";
        pruebas[7] = "1245aA2334";
        pruebas[8] = "ZOEVENUSSHADY";
        pruebas[9] = "cLAVEsEGURA2";

        for (int i = 0; i < 10; i++) {
            System.out.println((esContrasenaSegura(pruebas[i]))?"Prueba " + (i + 1) + " (Probando: "+ pruebas[i] +"): \tSegura":"Prueba " + (i + 1) + " (Probando: "+ pruebas[i] +"): \tInsegura");
        }

        // TODO: Añade más pruebas
    }
}