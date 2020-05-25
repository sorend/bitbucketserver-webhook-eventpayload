package com.github.sorend.bitbucketserver.webhook.eventpayload.model;

public class RepoCommentEdited extends BaseEventPayload {
    public Repository repository;
    public Comment comment;
    public String previousComment;
    public String commit;
}
