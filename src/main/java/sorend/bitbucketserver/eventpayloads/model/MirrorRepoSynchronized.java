package sorend.bitbucketserver.eventpayloads.model;

import java.time.ZonedDateTime;
import java.util.List;

public class MirrorRepoSynchronized {
    public String eventKey;
    public ZonedDateTime date;
    public MirrorServer mirrorServer;
    public String syncType;
    public boolean refLimitExceeded;
    public Repository repository;
    public List<Change> changes;
}
