package sdoward.com.ericsmodule;

import com.google.gson.annotations.SerializedName;

public class Beer {

        private int id;
        private String name;
        private String tagline;
        private @SerializedName("first_brewed")String firstBrewed;
        private String description;
        private @SerializedName("image_url")String imageUrl;
        private Float abv;
        private @SerializedName("attenuation_level")Float attenuationLevel;
        private @SerializedName("brewers_tips")String brewersTips;
        private @SerializedName("contributed_by")String contributedBy;

    public Beer(int id, String name, String tagline, String firstBrewed, String description, String imageUrl, Float abv, Float attenuationLevel, String brewersTips, String contributedBy) {
        this.id = id;
        this.name = name;
        this.tagline = tagline;
        this.firstBrewed = firstBrewed;
        this.description = description;
        this.imageUrl = imageUrl;
        this.abv = abv;
        this.attenuationLevel = attenuationLevel;
        this.brewersTips = brewersTips;
        this.contributedBy = contributedBy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {return name;}
    public void setName(String name) {
        this.name = name;
    }

    public String getTagline() {return tagline;}

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getFirstBrewed() {
        return firstBrewed;
    }

    public void setFirstBrewed(String firstBrewed) {
        this.firstBrewed = firstBrewed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Float getAbv() {
        return abv;
    }

    public void setAbv(Float abv) {
        this.abv = abv;
    }

    public Float getAttenuationLevel() {
        return attenuationLevel;
    }

    public void setAttenuationLevel(Float attenuationLevel) {
        this.attenuationLevel = attenuationLevel;
    }

    public String getBrewersTips() {
        return brewersTips;
    }

    public void setBrewersTips(String brewersTips) {
        this.brewersTips = brewersTips;
    }

    public String getContributedBy() {
        return contributedBy;
    }

    public void setContributedBy(String contributedBy) {
        this.contributedBy = contributedBy;
    }

}




