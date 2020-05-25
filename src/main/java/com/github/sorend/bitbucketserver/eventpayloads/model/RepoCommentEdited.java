package com.github.sorend.bitbucketserver.eventpayloads.model;

public class RepoCommentEdited extends BaseEventPayload {
    public Repository repository;
    public Comment comment;
    public String previousComment;
    public String commit;
}
