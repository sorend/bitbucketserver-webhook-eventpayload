package com.github.sorend.bitbucketserver.webhook.eventpayload.model;

import java.util.List;

public class RepoRefsChanged extends BaseEventPayload {
    public Repository repository;
    public List<Change> changes;
}
