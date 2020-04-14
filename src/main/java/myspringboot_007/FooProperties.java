package myspringboot_007;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix = "foo")
public class FooProperties {

    private InetAddress remoteAddress;

    private final Security security = new Security();

    public InetAddress getRemoteAddress() {
        return remoteAddress;
    }

    public void setRemoteAddress(InetAddress remoteAddress) {
        this.remoteAddress = remoteAddress;
    }

    public Security getSecurity() {
        return security;
    }

    public static class Security{

        private String userName;
        private List<String> roles = new ArrayList<>(Collections.singleton("USER"));

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public List<String> getRoles() {
            return roles;
        }

        public void setRoles(List<String> roles) {
            this.roles = roles;
        }

        @Override
        public String toString() {
            return "Security{" +
                    "userName='" + userName + '\'' +
                    ", roles=" + roles +
                    '}';
        }
    }

}