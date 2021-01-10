public class Notification {
    public Timestamp sent;
    public String message;
    public boolean reply;
    public String replyMessage;
    public Timestamp validUntil;
    public receiveResponse(boolean reply, String message, Timestamp replyTime){};
}
