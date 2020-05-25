package sorend.bitbucketserver.eventpayloads.model;

public class PullRequestReviewerFeedback extends BaseEventPayload {
    public PullRequest pullRequest;
    public Participant participant;
    public String previousStatus;
}
