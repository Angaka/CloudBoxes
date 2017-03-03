package com.projects.tan.cloudboxes.networks.api.dropbox;

import com.dropbox.core.v2.users.Name;
import com.google.gson.annotations.SerializedName;

/**
 * Created by oudong on 03/03/2017.
 */

public class User {
    @SerializedName("account_id")
    public String accountId;
    @SerializedName("name")
    public Name name;
    @SerializedName("email")
    public String email;
    @SerializedName("email_verified")
    public boolean emailVerified;
    @SerializedName("disabled")
    public boolean disabled;
    @SerializedName("is_teammate")
    public boolean isTeammate;
    @SerializedName("profile_photo_url")
    public String profilePhotoUrl;

    @SerializedName("used")
    public int used;

    @SerializedName("allocation")
    public Allocation allocation;

    public class Allocation {
        @SerializedName(".tag")
        public String tag;
        @SerializedName("allocated")
        public int allocated;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public boolean isTeammate() {
        return isTeammate;
    }

    public void setTeammate(boolean teammate) {
        isTeammate = teammate;
    }

    public String getProfilePhotoUrl() {
        return profilePhotoUrl;
    }

    public void setProfilePhotoUrl(String profilePhotoUrl) {
        this.profilePhotoUrl = profilePhotoUrl;
    }

    public int getUsed() {
        return used;
    }

    public void setUsed(int used) {
        this.used = used;
    }

    public Allocation getAllocation() {
        return allocation;
    }

    public void setAllocation(Allocation allocation) {
        this.allocation = allocation;
    }
}
