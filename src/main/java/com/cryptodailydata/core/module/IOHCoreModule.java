package com.cryptodailydata.core.module;

import java.io.Serializable;
import java.util.List;

/**
 * @author serhat.akdeniz created at 10/3/2019
 */

public interface IOHCoreModule extends Serializable
{
    List<?> getModule();
}
