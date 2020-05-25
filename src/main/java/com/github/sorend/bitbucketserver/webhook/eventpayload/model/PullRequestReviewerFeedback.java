package com.github.sorend.bitbucketserver.webhook.eventpayload.model;

public class PullRequestReviewerFeedback extends BaseEventPayload {
    public PullRequest pullRequest;
    public Participant participant;
    public String previousStatus;
}
