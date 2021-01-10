public class Work {
    public WorkRequest workReq;
    public Responder worker;
    public String status = "available" ; // or assigned or finished 
    public float wage;
    public Work(WorkRequest workReq, float wage) {

    }
    public void setStatus (String status) {
        if (status = "available")
            this.status = available;
        else if (status = assigned)
            this.status = assigned;
        else if (status = finished)
            this.status = finished
    }
    public void setWorker(Responder worker){
        this.worker = worker;
    }
    public void setWorkRequest(WorkRequest wr) {
        this.workReq = wr;
    }
}
