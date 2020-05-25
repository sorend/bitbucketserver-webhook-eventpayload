package com.github.sorend.bitbucketserver.webhook.eventpayload.model;

public class RepoCommentDeleted extends BaseEventPayload {
    public Repository repository;
    public Comment comment;
    public String commit;
}
