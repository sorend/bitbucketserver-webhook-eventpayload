package sorend.bitbucketserver.eventpayloads.model;

import java.util.List;

public class RepoRefsChanged extends BaseEventPayload {
    public Repository repository;
    public List<Change> changes;
}
