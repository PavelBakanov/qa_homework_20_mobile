package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UploadedAppsListResponseModel {
    @JsonProperty("app_name")
    private String appName;
    @JsonProperty("app_version")
    private String appVersion;
    @JsonProperty("app_url")
    private String appUrl;
    @JsonProperty("app_id")
    private String appId;
    @JsonProperty("uploaded_at")
    private String uploadedAt;
}
