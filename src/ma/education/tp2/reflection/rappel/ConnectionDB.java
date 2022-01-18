package ma.education.tp2.reflection.rappel;

public class ConnectionDB {
    String url,user,password;

    public ConnectionDB(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
        System.out.println("Voici le constructor ConccectionDB");
    }
}
