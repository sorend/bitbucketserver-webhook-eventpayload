package sorend.bitbucketserver.eventpayloads.model;

import java.time.ZonedDateTime;

public class BaseEventPayload {
    public String eventKey;
    public ZonedDateTime date;
    public Actor actor;
}
