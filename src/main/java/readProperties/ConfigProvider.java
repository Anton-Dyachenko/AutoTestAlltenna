package readProperties;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import java.io.ObjectInputFilter;

public interface ConfigProvider {
    Config config = readConfig();

    static Config readConfig() {
        return ConfigFactory.systemProperties().hasPath("testProfile")
                ? ConfigFactory.load(ConfigFactory.systemProperties().getString("testProfile"))
                : ConfigFactory.load("application.conf");
    }

    String URL = readConfig().getString("url");
    String LOGIN = readConfig().getString("login");
    String PASSWORD = readConfig().getString("password");

}
