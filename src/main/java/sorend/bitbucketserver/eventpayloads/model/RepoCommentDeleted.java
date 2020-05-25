package sorend.bitbucketserver.eventpayloads.model;

public class RepoCommentDeleted extends BaseEventPayload {
    private Repository repository;
    private Comment comment;
    private String commit;
}
