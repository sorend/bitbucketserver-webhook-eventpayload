package sorend.bitbucketserver.eventpayloads.model;

import java.util.List;

public class RepoRefsChanged extends BaseEventPayload {
    private Repository repository;
    private List<Change> changes;
}
