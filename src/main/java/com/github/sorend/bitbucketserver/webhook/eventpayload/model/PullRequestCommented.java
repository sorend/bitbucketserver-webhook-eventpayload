package com.github.sorend.bitbucketserver.webhook.eventpayload.model;

public class PullRequestCommented extends BaseEventPayload {
    public PullRequest pullRequest;
    public Comment comment;
    public int commentParentId;
    public String previousComment;
}
