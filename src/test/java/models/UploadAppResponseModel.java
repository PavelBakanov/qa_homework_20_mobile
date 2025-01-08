package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UploadAppResponseModel {
    @JsonProperty("app_url") private String appUrl;
}
