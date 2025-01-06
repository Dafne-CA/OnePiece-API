package com.proyecto.onepiece_api.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CharacterDTO {
    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("job")
    private String job;
    @JsonProperty("size")
    private String size;
    @JsonProperty("birthday")
    private String birthday;
    @JsonProperty("age")
    private String age;
    @JsonProperty("bounty")
    private String bounty;
    @JsonProperty("status")
    private String status;
}
