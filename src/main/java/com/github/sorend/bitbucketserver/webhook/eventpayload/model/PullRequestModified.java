package com.github.sorend.bitbucketserver.webhook.eventpayload.model;

public class PullRequestModified extends BaseEventPayload {
    public PullRequest pullRequest;
    public String previousTitle;
    public String previousDescription;
    public PreviousTarget previousTarget;
}
