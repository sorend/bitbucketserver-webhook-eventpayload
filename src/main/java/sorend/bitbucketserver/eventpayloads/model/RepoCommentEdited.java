package sorend.bitbucketserver.eventpayloads.model;

public class RepoCommentEdited extends BaseEventPayload {
    private Repository repository;
    private Comment comment;
    private String previousComment;
    private String commit;
}
