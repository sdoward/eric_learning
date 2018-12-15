package sdoward.com.samsmodule;

import com.google.gson.annotations.SerializedName;

public class Brewery {

    int id;
    String name;
    @SerializedName("brewery_type") String breweryType;
    String street;
    String city;
    String state;
    @SerializedName("postal_code") String postalCode;
    String country;
    Double latitude;
    Double longitude;
    @SerializedName("website_url") String websiteUrl;
    @SerializedName("updated_at") String updatedAt;


    public Brewery(int id, String name, String breweryType, String street, String city, String state, String postalCode, String country, Double latitude, Double longitude, String websiteUrl, String updatedAt) {
        this.id = id;
        this.name = name;
        this.breweryType = breweryType;
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
        this.latitude = latitude;
        this.longitude = longitude;
        this.websiteUrl = websiteUrl;
        this.updatedAt = updatedAt;
    }
}
