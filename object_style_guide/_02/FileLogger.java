package object_style_guide._02;

interface Logger {
    void log(String message);
}


final public class FileLogger implements Logger{

    private final Formatter formatter;

    public FileLogger(Formatter formatter) {
        this.formatter = formatter;
    }


    void log(String message) {
        String formattedMessage = this.formatter.format(message);
    }
}
