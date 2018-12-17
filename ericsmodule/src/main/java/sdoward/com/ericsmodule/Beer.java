package sdoward.com.ericsmodule;

import com.google.gson.annotations.SerializedName;

public class Beer {

        int id;
        String name;
        String tagline;
        @SerializedName("first_brewed")String firstBrewed;
        String description;
        @SerializedName("image_url")String imageUrl;
        Float abv;
        @SerializedName("attenuation_level")Float attenuationLevel;
        @SerializedName("brewers_tips")String brewersTips;
        @SerializedName("contributed_by")String contributedBy;

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
}




