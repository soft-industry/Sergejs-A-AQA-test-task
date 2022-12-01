package starter.configuration;

import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

public class ApplicationProperties {

    private static final String BASE_URL = "base.url";

    public static EnvironmentVariables getVariables() {
        return SystemEnvironmentVariables.createEnvironmentVariables();
    }

    public static String getBaseUrl() {
        return getVariables().getProperty(BASE_URL);
    }

}
