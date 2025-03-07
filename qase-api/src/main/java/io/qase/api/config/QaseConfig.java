package io.qase.api.config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Mutable;
import org.aeonbits.owner.Reloadable;

import static org.aeonbits.owner.Config.DisableableFeature.PARAMETER_FORMATTING;
import static org.aeonbits.owner.Config.DisableableFeature.VARIABLE_EXPANSION;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env"})
@Config.DisableFeature({PARAMETER_FORMATTING, VARIABLE_EXPANSION})
public interface QaseConfig extends Reloadable, Mutable {
    String API_TOKEN_KEY = "QASE_API_TOKEN";
    String PROJECT_CODE_KEY = "QASE_PROJECT_CODE";
    String RUN_ID_KEY = "QASE_RUN_ID";
    String ENABLE_KEY = "QASE_ENABLE";
    String USE_BULK_KEY = "QASE_USE_BULK";
    String BASE_URL_KEY = "QASE_URL";
    String RUN_NAME_KEY = "QASE_RUN_NAME";
    String QASE_RUN_DESCRIPTION_KEY = "QASE_RUN_DESCRIPTION";

    @Key(ENABLE_KEY)
    @DefaultValue("false")
    boolean isEnabled();

    @Key(USE_BULK_KEY)
    @DefaultValue("true")
    boolean useBulk();

    @Key(PROJECT_CODE_KEY)
    String projectCode();

    @Key(RUN_ID_KEY)
    Integer runId();

    @Key(API_TOKEN_KEY)
    String apiToken();

    @DefaultValue("https://api.qase.io/v1")
    @Key(BASE_URL_KEY)
    String baseUrl();

    @Key(RUN_NAME_KEY)
    String runName();

    @Key(QASE_RUN_DESCRIPTION_KEY)
    String runDescription();
}
