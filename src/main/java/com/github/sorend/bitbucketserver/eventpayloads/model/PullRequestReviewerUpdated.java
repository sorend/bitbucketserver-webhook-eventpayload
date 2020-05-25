package com.github.sorend.bitbucketserver.eventpayloads.model;

import java.util.List;

public class PullRequestReviewerUpdated extends BaseEventPayload {
    public PullRequest pullRequest;
    public List<Actor> addedReviewers;
    public List<Actor> removedReviewers;
}
