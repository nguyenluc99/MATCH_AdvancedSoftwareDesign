
import java.util.*;

/**
 * 
 */
public class BaseRequest extends RequestFactory {

    /**
     * Default constructor
     */
    public BaseRequest() {
    }

    /**
     * 
     */
    public java.sql.Timestamp due_date;

    /**
     * 
     */
    public String location;

    /**
     * 
     */
    public Long requester_id;

    /**
     * 
     */
    public Long responder_id[];

    /**
     * 
     */
    public Boolean requester_acceptance;

    /**
     * 
     */
    public Boolean responder_acceptance[];

    /**
     * 
     */
    public String preferences[];

    /**
     * 
     */
    public java.sql.Timestamp time_stamp;

    /**
     * 
     */
    public void save() {
        // TODO implement here
    }

    /**
     * @return
     */
    public String get_type() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String get_prio_info() {
        // TODO implement here
        return "";
    }

}