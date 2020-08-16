package capabilities;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public enum IOSDevicesCapabilities {

    IPHONE("resources/capabilities/iphone.json"),
    IPHONE_FISICO("capabilities/iphone-fisico.json");

    private String path;

    IOSDevicesCapabilities(String path) {
        this.path = path;
    }

    public DesiredCapabilities getIOSCapabilitiesFromPlataform() {
        DesiredCapabilities iosCapabilities =  Load_capabilities.pathToDesiredCapabilitites(this.path);
        iosCapabilities.setCapability("app", new File("resources/apps/LoginExample.app").getAbsolutePath());
        return iosCapabilities;
    }

    public static void showAvaliableIphoneDevices() {
        System.out.println("======= IOS DEVICES ====== ");
        for (IOSDevicesCapabilities iosDevicesCapabilities : IOSDevicesCapabilities.values()) {
            System.out.println(iosDevicesCapabilities.name());
        }
    }
}
