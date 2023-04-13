
public class Message {
    private int type;
    private String message;

    //Constuctor de la clase

    public Message(int type, String message){
        this.type = type;
        this.message = message;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }
}
