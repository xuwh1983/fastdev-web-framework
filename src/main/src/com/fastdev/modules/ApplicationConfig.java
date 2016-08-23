package com.fastdev.modules;

/**
 * Created by xuwh on 16/8/21.
 */
public final class ApplicationConfig {

    /**
     * sms
     */
    private String smsMachineClass;

    private String smsMachineUsername;

    private String smsMachinePassword;

    private String smsMachineExtno;

    private String smsMachineSendUri;

    private String smsMachineOverageUri;

    /**
     * jpush
     */
    private String jpushAndroidAppKey;

    private String jpushAndroidMasterSecret;

    private String jpushiOSAppKey;

    private String jpushiOSMasterSecret;

    private boolean testEnvironment;


    /**
     * ftp
     */
    private String ftpHost;

    private String ftpPort;

    private String ftpUsername;

    private String ftpPassword;

    public String getSmsMachineClass() {
        return smsMachineClass;
    }

    public void setSmsMachineClass(String smsMachineClass) {
        this.smsMachineClass = smsMachineClass;
    }

    public String getSmsMachineUsername() {
        return smsMachineUsername;
    }

    public void setSmsMachineUsername(String smsMachineUsername) {
        this.smsMachineUsername = smsMachineUsername;
    }

    public String getSmsMachinePassword() {
        return smsMachinePassword;
    }

    public void setSmsMachinePassword(String smsMachinePassword) {
        this.smsMachinePassword = smsMachinePassword;
    }

    public String getSmsMachineExtno() {
        return smsMachineExtno;
    }

    public void setSmsMachineExtno(String smsMachineExtno) {
        this.smsMachineExtno = smsMachineExtno;
    }

    public String getSmsMachineSendUri() {
        return smsMachineSendUri;
    }

    public void setSmsMachineSendUri(String smsMachineSendUri) {
        this.smsMachineSendUri = smsMachineSendUri;
    }

    public String getSmsMachineOverageUri() {
        return smsMachineOverageUri;
    }

    public void setSmsMachineOverageUri(String smsMachineOverageUri) {
        this.smsMachineOverageUri = smsMachineOverageUri;
    }

    public String getJpushAndroidAppKey() {
        return jpushAndroidAppKey;
    }

    public void setJpushAndroidAppKey(String jpushAndroidAppKey) {
        this.jpushAndroidAppKey = jpushAndroidAppKey;
    }

    public String getJpushAndroidMasterSecret() {
        return jpushAndroidMasterSecret;
    }

    public void setJpushAndroidMasterSecret(String jpushAndroidMasterSecret) {
        this.jpushAndroidMasterSecret = jpushAndroidMasterSecret;
    }

    public String getJpushiOSAppKey() {
        return jpushiOSAppKey;
    }

    public void setJpushiOSAppKey(String jpushiOSAppKey) {
        this.jpushiOSAppKey = jpushiOSAppKey;
    }

    public String getJpushiOSMasterSecret() {
        return jpushiOSMasterSecret;
    }

    public void setJpushiOSMasterSecret(String jpushiOSMasterSecret) {
        this.jpushiOSMasterSecret = jpushiOSMasterSecret;
    }

    public boolean isTestEnvironment() {
        return testEnvironment;
    }

    public void setTestEnvironment(boolean testEnvironment) {
        this.testEnvironment = testEnvironment;
    }

    public String getFtpHost() {
        return ftpHost;
    }

    public void setFtpHost(String ftpHost) {
        this.ftpHost = ftpHost;
    }

    public String getFtpPort() {
        return ftpPort;
    }

    public void setFtpPort(String ftpPort) {
        this.ftpPort = ftpPort;
    }

    public String getFtpUsername() {
        return ftpUsername;
    }

    public void setFtpUsername(String ftpUsername) {
        this.ftpUsername = ftpUsername;
    }

    public String getFtpPassword() {
        return ftpPassword;
    }

    public void setFtpPassword(String ftpPassword) {
        this.ftpPassword = ftpPassword;
    }
}
