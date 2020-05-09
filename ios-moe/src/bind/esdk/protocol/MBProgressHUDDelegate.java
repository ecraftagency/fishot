package bind.esdk.protocol;


import bind.esdk.MBProgressHUD;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("ESDK")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MBProgressHUDDelegate")
public interface MBProgressHUDDelegate {
	@Generated
	@IsOptional
	@Selector("hudWasHidden:")
	default void hudWasHidden(MBProgressHUD hud) {
		throw new java.lang.UnsupportedOperationException();
	}
}