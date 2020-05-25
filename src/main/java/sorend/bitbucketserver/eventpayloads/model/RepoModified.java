package sorend.bitbucketserver.eventpayloads.model;

import com.google.gson.annotations.SerializedName;

public class RepoModified extends BaseEventPayload {
    private Repository old;
    @SerializedName("new")
    private Repository new_;
}
