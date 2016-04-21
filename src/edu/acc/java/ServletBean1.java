package edu.acc.java;
import java.io.Serializable;

/**
 * Created by lewis on 4/18/16.
 */


public class ServletBean1 implements Serializable {

        private String accept;
        private String host;
        private String useragent;

        public ServletBean1() {
            accept = "";
            host = "";
            useragent = "";
        }

        public ServletBean1(String accept, String host, String useragent) {
            this.accept = accept;
            this.host = host;
            this.useragent = useragent;
        }

    public String getAccept() {
        return accept;
    }

    public void setAccept(String accept) {
        this.accept = accept;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUseragent() {
        return useragent;
    }

    public void setUseragent(String useragent) {
        this.useragent = useragent;
    }
}



