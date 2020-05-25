package com.github.sorend.bitbucketserver.eventpayloads;

import com.google.gson.Gson;
import com.github.sorend.bitbucketserver.eventpayloads.model.*;

/**
 * Factory for loading event payloads based on event type
 */
public class EventPayloads {

    private Gson gson;

    public EventPayloads(Gson gson) {
        this.gson = gson;
    }

    public RepoRefsChanged repoRefsChanged(String json) {
        return parse(json, RepoRefsChanged.class);
    }

    public RepoModified repoModified(String json) {
        return parse(json, RepoModified.class);
    }

    public RepoForked repoForked(String json) {
        return parse(json, RepoForked.class);
    }

    public RepoCommentAdded repoCommentAdded(String json) {
        return parse(json, RepoCommentAdded.class);
    }

    public RepoCommentEdited repoCommentEdited(String json) {
        return parse(json, RepoCommentEdited.class);
    }

    public RepoCommentDeleted repoCommentDeleted(String json) {
        return parse(json, RepoCommentDeleted.class);
    }

    public MirrorRepoSynchronized mirrorRepoSynchronized(String json) {
        return parse(json, MirrorRepoSynchronized.class);
    }

    public PullRequestOpened pullRequestOpened(String json) {
        return parse(json, PullRequestOpened.class);
    }

    public PullRequestFromRefUpdated pullRequestFromRefUpdated(String json) {
        return parse(json, PullRequestFromRefUpdated.class);
    }

    public PullRequestModified pullRequestModified(String json) {
        return parse(json, PullRequestModified.class);
    }

    public PullRequestReviewerUpdated pullRequestReviewerUpdated(String json) {
        return parse(json, PullRequestReviewerUpdated.class);
    }

    public PullRequestReviewerFeedback pullRequestReviewerFeedback(String json) {
        return parse(json, PullRequestReviewerFeedback.class);
    }

    public PullRequestClosed pullRequestMerged(String json) {
        return parse(json, PullRequestClosed.class);
    }

    public PullRequestCommented pullRequestCommented(String json) {
        return parse(json, PullRequestCommented.class);
    }

    private <T> T parse(String json, Class<T> clz) {
        return gson.fromJson(json, clz);
    }
}
