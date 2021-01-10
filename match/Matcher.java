
public class Matcher {
    private ArrayList<Profile>;
    private ArrayList<Profile> bestProfiles;
    private MatchConfiguration config;
    public Matcher (Integer maxResponder, boolean notifyIdleResponder, boolean distanceImportance) {}
    public Worker match(WorkRequest wr){};
    public void loadProfile(){};
    public void satisfyHardContraints(){}
    public ArrayList<Responder> findBestProfile(){};
    public void satisfyMatchConfiguration(){};
    public void sendNofitication(WorkRequest wr, ArrayList<Profile> bestProfiles){}
}
