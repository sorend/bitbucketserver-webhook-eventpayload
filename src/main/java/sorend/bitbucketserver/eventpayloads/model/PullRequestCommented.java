package sorend.bitbucketserver.eventpayloads.model;

public class PullRequestCommented extends BaseEventPayload {
    public PullRequest pullRequest;
    public Comment comment;
    public int commentParentId;
    public String previousComment;
}
