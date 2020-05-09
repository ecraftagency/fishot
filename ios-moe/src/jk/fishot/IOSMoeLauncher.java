package jk.fishot;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.backends.iosmoe.IOSApplication;
import com.badlogic.gdx.backends.iosmoe.IOSApplicationConfiguration;
import com.fruit.FruitGame;

import org.moe.natj.general.Pointer;

import java.nio.ByteBuffer;

import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.uikit.UIApplication;
import bind.esdk.ESDK;
import jk.fishot.Fishot;

import apple.uikit.c.UIKit;
import jk.fishot.common.Websocket;

public class IOSMoeLauncher extends IOSApplication.Delegate {

    protected IOSMoeLauncher(Pointer peer) {
        super(peer);
    }

    @Override
    protected IOSApplication createApplication() {
        IOSApplicationConfiguration config = new IOSApplicationConfiguration();
        config.useAccelerometer = false;
        //return new IOSApplication(new Fishot(new RoboWebsocket(), Application.ApplicationType.iOS), config);
        return new IOSApplication(new FruitGame(), config);
    }

//    @Override
//    public boolean applicationDidFinishLaunchingWithOptions(UIApplication application, NSDictionary<?, ?> launchOptions) {
//        ESDK.instance().applicationDidFinishLaunchingWithOptions(application, (NSDictionary<String, ?>)launchOptions);
//        ESDK.instance().setIsDebug(true);
//        return super.applicationDidFinishLaunchingWithOptions(application, launchOptions);
//    }
//
//    @Override
//    public void applicationDidBecomeActive(UIApplication application) {
//        ESDK.instance().applicationDidBecomeActive(application);
//        ESDK.instance().showLogin();
//        super.applicationDidBecomeActive(application);
//    }
//
//    @Override
//    public void applicationDidRegisterForRemoteNotificationsWithDeviceToken(UIApplication application, NSData deviceToken) {
//        ESDK.instance().applicationDidRegisterForRemoteNotificationsWithDeviceToken(application, deviceToken);
//    }


    public static void main(String[] argv) {
        UIKit.UIApplicationMain(0, null, null, IOSMoeLauncher.class.getName());
    }
}
