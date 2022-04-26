package com.cryptodailydata.core.module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author serhat.akdeniz created at 10/17/2019
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
// This class is map of list elements inside "allmodules" of application-ohmodules.yaml file.
public class YAMLModule
{
    private String moduleType;
    private String moduleName;
    private String methodName;

    public YAMLModule(String moduleType)
    {
        this.moduleType = moduleType;
    }
}
