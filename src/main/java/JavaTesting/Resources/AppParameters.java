package JavaTesting.Resources;

public class AppParameters {

    // afegir-hi objectes conexió de Base de Dades

    public static final String DOMAIN = "127.0.0.1";

    public static final String PORT = "80";

    // public final static Object DD_CON = new ClasseConexioBBDD();

    // public static Object MESSAGES_TRANSLATIONS;

    // Implementar SINGLEON PATTERN

    private static AppParameters instance;

    private AppParameters() {

    }
    private void initApp(){
        // codi necessari per la inicialització de l'app
    }

    public void resetApp(){
        // codi per reconfigurar l'App
    }

    public static AppParameters getInstance() {
        if (instance == null) {
            instance = new AppParameters();
        }
        return instance;
    }

    public static String deployedURL(){
        return "http://" + DOMAIN + ":" + PORT;
    }
}