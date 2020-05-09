package bind.esdk.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ObjCProtocolSourceName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("ESDK")
@Runtime(ObjCRuntime.class)
@ObjCProtocolSourceName("ESDKDelegate")
@ObjCProtocolName("_TtP4ESDK12ESDKDelegate_")
public interface ESDKDelegate {
	@Generated
	@Selector("authorizeFormDidClose")
	void authorizeFormDidClose();

	@Generated
	@Selector("authorizeSuccessWithUserInfo:")
	void authorizeSuccessWithUserInfo(String userInfo);

	@Generated
	@Selector("paymentFailedWithError:")
	void paymentFailedWithError(String error);

	@Generated
	@Selector("paymentFormDidClose")
	void paymentFormDidClose();

	@Generated
	@Selector("paymentSuccessWithReceiptInfo:")
	void paymentSuccessWithReceiptInfo(String receiptInfo);

	@Generated
	@Selector("userDidLogout")
	void userDidLogout();

	@Generated
	@Selector("videoRewardDismissed")
	void videoRewardDismissed();
}