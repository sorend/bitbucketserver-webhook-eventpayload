package sorend.bitbucketserver.eventpayloads.model;

public class RepoCommentAdded extends BaseEventPayload {
    public Repository repository;
    public Comment comment;
    public String commit;
}
