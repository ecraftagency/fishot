package bind.esdk.c;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstBytePtr;

@Generated
@Library("ESDK")
@Runtime(CRuntime.class)
public final class ESDK {
	static {
		NatJ.register();
	}

	@Generated
	private ESDK() {
	}

	@Generated
	@CVariable()
	@NFloat
	public static native double MBProgressMaxOffset();

	@Generated
	@CVariable()
	public static native double ESDKVersionNumber();

	@Generated
	@CVariable()
	public static native ConstBytePtr ESDKVersionString();
}