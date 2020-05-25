package com.github.sorend.bitbucketserver.webhook.eventpayload.model;

public class RepoCommentAdded extends BaseEventPayload {
    public Repository repository;
    public Comment comment;
    public String commit;
}
