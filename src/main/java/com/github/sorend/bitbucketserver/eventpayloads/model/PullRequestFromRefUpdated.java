package com.github.sorend.bitbucketserver.eventpayloads.model;

public class PullRequestFromRefUpdated extends BaseEventPayload {
    public PullRequest pullRequest;
    public String previousFromHash;
}
