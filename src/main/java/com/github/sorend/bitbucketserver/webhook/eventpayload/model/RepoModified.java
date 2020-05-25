package com.github.sorend.bitbucketserver.webhook.eventpayload.model;

import com.google.gson.annotations.SerializedName;

public class RepoModified extends BaseEventPayload {
    public Repository old;
    @SerializedName("new")
    public Repository new_;
}
