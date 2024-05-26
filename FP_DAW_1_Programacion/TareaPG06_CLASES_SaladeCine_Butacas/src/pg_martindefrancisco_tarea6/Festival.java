package pg_martindefrancisco_tarea6;

public class Festival {
    
    protected String nombreFestival;
    
    // Constructor
    public Festival(){
        nombreFestival = (""+
"                      ______        _   _            _    ____        _          _____ _     _           \n" + 
"                     |  ____|      | | (_)          | |  / __ \\      | |        / ____| |   (_)          \n" + 
"                     | |__ ___  ___| |_ ___   ____ _| | | |  | |_ __ | |_   _  | (___ | |__  _ _ __  ___ \n" + 
"                     |  __/ _ \\/ __| __| \\ \\ / / _` | | | |  | | '_ \\| | | | |  \\___ \\| '_ \\| | '_ \\/ __|\n" + 
"                     | | |  __/\\__ \\ |_| |\\ V / (_| | | | |__| | | | | | |_| |  ____) | | | | | |_) \\__ \\\n" + 
"                     |_|  \\___||___/\\__|_| \\_/ \\__,_|_|  \\____/|_| |_|_|\\__, | |_____/|_| |_|_| .__/|___/\n"  +
"                                                                         __/ |                | |        \n" + 
"                                                                        |___/                 |_|        ");
    }
    
    // Metodos
    public void mostrarFestival(){
        System.out.println(nombreFestival);
    }
}
