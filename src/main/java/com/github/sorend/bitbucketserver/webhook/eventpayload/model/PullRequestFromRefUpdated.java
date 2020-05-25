package com.github.sorend.bitbucketserver.webhook.eventpayload.model;

public class PullRequestFromRefUpdated extends BaseEventPayload {
    public PullRequest pullRequest;
    public String previousFromHash;
}
