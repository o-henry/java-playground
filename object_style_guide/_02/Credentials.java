package object_style_guide._02;

public final class Credentials {

    private String username;
    private String password;

    public Credentials(String username, String password) {
        {
            this.username = username;
            this.password = password;
        }
    }
}

public final class ApiClient {
    private Credentials credentials;

    public ApiClient(Credentials credentials) {
        this.credentials = credentials;
    }
}