package com.cryptodailydata.core.module;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
// List<YAMLModule> de ki sıra ile tetiklenen EMSlerin response unu tutan sınıftır.
public class OHModuleModel implements IOHModule
{
    @JsonProperty("mdId")
    private Integer moduleId;
    @JsonProperty("mdName")
    private String moduleName;
    @JsonProperty("tpDt")
    private IOHCoreModule typeData = null;
}
