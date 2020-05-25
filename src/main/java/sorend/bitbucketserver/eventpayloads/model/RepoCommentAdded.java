package sorend.bitbucketserver.eventpayloads.model;

public class RepoCommentAdded extends BaseEventPayload {
    private Repository repository;
    private Comment comment;
    private String commit;
}
