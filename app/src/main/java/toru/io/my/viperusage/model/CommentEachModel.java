package toru.io.my.viperusage.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by toruchoi on 08/10/2017.
 */

public class CommentEachModel {
    private long id;
    private String text;

    @SerializedName("created_time")
    private long createdTime;

    @SerializedName("from")
    private UserModel commentedUser;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(long createdTime) {
        this.createdTime = createdTime;
    }

    public UserModel getCommentedUser() {
        return commentedUser;
    }

    public void setCommentedUser(UserModel commentedUser) {
        this.commentedUser = commentedUser;
    }
}
