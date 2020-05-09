package bind.esdk;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.NSUserActivity;
import apple.uikit.UIApplication;
import bind.esdk.protocol.ESDKDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("ESDK")
@Runtime(ObjCRuntime.class)
@ObjCClassName("_TtC4ESDK4ESDK")
@ObjCClassBinding
public class ESDK extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected ESDK(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Owned
	@Selector("alloc")
	public static native ESDK alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("appId")
	public native String appId();

	@Generated
	@Selector("appKey")
	public native String appKey();

	@Generated
	@Selector("application:continue:restorationHandler:")
	public native void applicationContinueRestorationHandler(
			UIApplication application,
			NSUserActivity userActivity,
			@ObjCBlock(name = "call_applicationContinueRestorationHandler") Block_applicationContinueRestorationHandler restorationHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_applicationContinueRestorationHandler {
		@Generated
		void call_applicationContinueRestorationHandler(NSArray<?> arg0);
	}

	@Generated
	@Selector("application:didFinishLaunchingWithOptions:")
	public native void applicationDidFinishLaunchingWithOptions(
			UIApplication application, NSDictionary<String, ?> launchOptions);

	@Generated
	@Selector("application:didReceiveRemoteNotification:")
	public native void applicationDidReceiveRemoteNotification(
			UIApplication application, NSDictionary<?, ?> userInfo);

	@Generated
	@Selector("application:didRegisterForRemoteNotificationsWithDeviceToken:")
	public native void applicationDidRegisterForRemoteNotificationsWithDeviceToken(
			UIApplication application, NSData deviceToken);

	@Generated
	@Selector("application:open:options:")
	public native void applicationOpenOptions(UIApplication app, NSURL url,
			NSDictionary<String, ?> options);

	@Generated
	@Selector("application:open:sourceApplication:annotation:")
	public native void applicationOpenSourceApplicationAnnotation(
			UIApplication application, NSURL url, String sourceApplication,
			@Mapped(ObjCObjectMapper.class) Object annotation);

	@Generated
	@Selector("applicationDidBecomeActive:")
	public native void applicationDidBecomeActive(UIApplication application);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:")
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
	public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
			@Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
			@Mapped(ObjCObjectMapper.class) Object anArgument);

	@Generated
	@Selector("classFallbacksForKeyedArchiver")
	public static native NSArray<String> classFallbacksForKeyedArchiver();

	@Generated
	@Selector("classForKeyedUnarchiver")
	public static native Class classForKeyedUnarchiver();

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native ESDKDelegate delegate();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("init")
	public native ESDK init();

	@Generated
	@Selector("initializeWithAppId:appKey:")
	public native void initializeWithAppIdAppKey(String appId, String appKey);

	@Generated
	@Selector("instance")
	public static native ESDK instance();

	@Generated
	@Selector("instanceMethodForSelector:")
	@FunctionPtr(name = "call_instanceMethodForSelector_ret")
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isDebug")
	public native boolean isDebug();

	@Generated
	@Selector("isDev")
	public static native boolean isDev();

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("isVideoRewardAvailable")
	public native boolean isVideoRewardAvailable();

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("logout")
	public native void logout();

	@Generated
	@Owned
	@Deprecated
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("setAppId:")
	public native void setAppId(String value);

	@Generated
	@Selector("setAppKey:")
	public native void setAppKey(String value);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) ESDKDelegate value);

	@Generated
	public void setDelegate(@Mapped(ObjCObjectMapper.class) ESDKDelegate value) {
		Object __old = delegate();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setDelegate_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("setIsDebug:")
	public native void setIsDebug(boolean value);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("showForgotPassword")
	public native void showForgotPassword();

	@Generated
	@Selector("showLogin")
	public native void showLogin();

	@Generated
	@Selector("showPaymentWithPayload:")
	public native void showPaymentWithPayload(String payload);

	@Generated
	@Selector("showPlayerInfoWithPayload:")
	public native void showPlayerInfoWithPayload(String payload);

	@Generated
	@Selector("showRegister")
	public native void showRegister();

	@Generated
	@Selector("showVideoRewardAd")
	public native void showVideoRewardAd();

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}