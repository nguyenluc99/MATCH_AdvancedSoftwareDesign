package match;
import match.User;
import java.util.ArrayList;
import match.Work;
public class Responder extends User {
    private ArrayList<Work> workReceived = new ArrayList<Work>();
    public String desiredWorkTypes;
    public String datetime;
    // public DateTime datetime;
    public float salary; // maybe expected or current
    public Responder(){}
    public boolean replyNotification(){}

    public addWork(Work w) {
        w.setWorker(this);
        this.workReceived.add(w);
    }

    public finishWork(Work w){}; // notify request and create bill

    public void reviewRequester(Work w, int star, String message) {

    }
}

