
import java.util.*;

/**
 * 
 */
public class DatabaseController {

    /**
     * Default constructor
     */
    public DatabaseController() {
    }

    /**
     * @param user_id 
     * @return
     */
    public BaseRequest get_requests(Long user_id) {
        // TODO implement here
        return null;
    }

    /**
     * @param data
     */
    public void update_request(String data) {
        // TODO implement here
    }

    /**
     * @param user_id 
     * @param time 
     * @return
     */
    public BaseRequest get_changes_since(Long user_id, java.sql.Timestamp time) {
        // TODO implement here
        return null;
    }

    /**
     * @param user_id
     */
    public void update_profile(Long user_id) {
        // TODO implement here
    }

    /**
     * @param responder_id 
     * @param request_id 
     * @param responder_reply 
     * @param time_stamp
     */
    public void create_request_responder_mapping(Long responder_id, Long request_id, Boolean responder_reply, java.sql.Timestamp time_stamp) {
        // TODO implement here
    }

}