package com.example.campingmaster.api.gocamping.dto;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class CampingSiteDto implements Serializable {
    @SerializedName("contentId")
    private Long contentId;
    @SerializedName("siteName")
    private String name;
    @SerializedName("featureNm")
    private String featureNm;
    @SerializedName("address")
    private String address;
    @SerializedName("lineIntro")
    private String description;
    @SerializedName("category")
    private String category;
    @SerializedName("locationCategory")
    private String locationCategory;
    @SerializedName("tel")
    private String phoneNumber;
    @SerializedName("mapX")
    private String mapX;
    @SerializedName("mapY")
    private String mapY;
    @SerializedName("homepageUrl")
    private String homepageUrl;
    @SerializedName("season")
    private String season;
    @SerializedName("nearbyFacilities")
    private String nearbyFacilities;
    @SerializedName("themaEnvrnCl")
    private String themaEnvrnCl;
    @SerializedName("petAllowed")
    private String petAllowed;
    @SerializedName("imgUrl")
    private String imgUrl;
    @SerializedName("reserveUrl")
    private String reserveUrl;

    @Override
    public String toString() {
        return "CampingSiteDto{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mapX='" + mapX + '\'' +
                ", mapY='" + mapY + '\'' +
                ", description='" + description + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }


    public Long getContentId() {
        return contentId;
    }

    public String getName() {
        return name;
    }
    public String getMapX(){ return mapX; }
    public String getMapY(){ return mapY; }

    public String getFeatureNm() {
        return featureNm;
    }

    public String getAddress() {
        return address;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getLocationCategory() {
        return locationCategory;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getHomepageUrl() {
        return homepageUrl;
    }

    public String getSeason() {
        return season;
    }

    public String getNearbyFacilities() {
        return nearbyFacilities;
    }

    public String getThemaEnvrnCl() {
        return themaEnvrnCl;
    }

    public String getPetAllowed() {
        return petAllowed;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getReserveUrl() {
        return reserveUrl;
    }
}
