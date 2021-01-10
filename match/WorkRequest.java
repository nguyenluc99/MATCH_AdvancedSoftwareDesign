package match;
import match.WorkRequest;
import match.Work;
import match.User;
import java.util.ArrayList;
public class WorkRequest {
    private String title;
    private String description;
    private User owner;
    private float wage;
    private ArrayList<Work> works = new ArrayList<Work>;
    public WorkRequest(String title, String description, User owner, float wage) {
        // creating workRequest

    }

    public void addWork(Work w) {
        w.setWorkRequest(this);
        this.works.add(w);
    }

}
