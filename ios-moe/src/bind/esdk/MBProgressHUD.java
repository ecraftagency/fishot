package bind.esdk;


import apple.NSObject;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSProgress;
import apple.foundation.NSSet;
import apple.uikit.UIButton;
import apple.uikit.UIColor;
import apple.uikit.UIFont;
import apple.uikit.UILabel;
import apple.uikit.UITraitCollection;
import apple.uikit.UIView;
import apple.uikit.UIWindow;
import bind.esdk.protocol.MBProgressHUDDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("ESDK")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MBProgressHUD extends UIView {
	static {
		NatJ.register();
	}

	@Generated
	protected MBProgressHUD(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("HUDForView:")
	public static native MBProgressHUD HUDForView(UIView view);

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Deprecated
	@Selector("activityIndicatorColor")
	public native UIColor activityIndicatorColor();

	@Generated
	@Selector("addKeyframeWithRelativeStartTime:relativeDuration:animations:")
	public static native void addKeyframeWithRelativeStartTimeRelativeDurationAnimations(
			double frameStartTime,
			double frameDuration,
			@ObjCBlock(name = "call_addKeyframeWithRelativeStartTimeRelativeDurationAnimations") UIView.Block_addKeyframeWithRelativeStartTimeRelativeDurationAnimations animations);

	@Generated
	@Deprecated
	@Selector("allHUDsForView:")
	public static native NSArray<?> allHUDsForView(UIView view);

	@Generated
	@Owned
	@Selector("alloc")
	public static native MBProgressHUD alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("animateKeyframesWithDuration:delay:options:animations:completion:")
	public static native void animateKeyframesWithDurationDelayOptionsAnimationsCompletion(
			double duration,
			double delay,
			@NUInt long options,
			@ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3") UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3 animations,
			@ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4") UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4 completion);

	@Generated
	@Selector("animateWithDuration:animations:")
	public static native void animateWithDurationAnimations(
			double duration,
			@ObjCBlock(name = "call_animateWithDurationAnimations") UIView.Block_animateWithDurationAnimations animations);

	@Generated
	@Selector("animateWithDuration:animations:completion:")
	public static native void animateWithDurationAnimationsCompletion(
			double duration,
			@ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_1") UIView.Block_animateWithDurationAnimationsCompletion_1 animations,
			@ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_2") UIView.Block_animateWithDurationAnimationsCompletion_2 completion);

	@Generated
	@Selector("animateWithDuration:delay:options:animations:completion:")
	public static native void animateWithDurationDelayOptionsAnimationsCompletion(
			double duration,
			double delay,
			@NUInt long options,
			@ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_3") UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_3 animations,
			@ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_4") UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_4 completion);

	@Generated
	@Selector("animateWithDuration:delay:usingSpringWithDamping:initialSpringVelocity:options:animations:completion:")
	public static native void animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion(
			double duration,
			double delay,
			@NFloat double dampingRatio,
			@NFloat double velocity,
			@NUInt long options,
			@ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5") UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5 animations,
			@ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6") UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6 completion);

	@Generated
	@Selector("animationType")
	@NInt
	public native long animationType();

	@Generated
	@Selector("appearance")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object appearance();

	@Generated
	@ProtocolClassMethod("appearance")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _appearance() {
		return appearance();
	}

	@Generated
	@Selector("appearanceForTraitCollection:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object appearanceForTraitCollection(
			UITraitCollection trait);

	@Generated
	@ProtocolClassMethod("appearanceForTraitCollection")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _appearanceForTraitCollection(UITraitCollection trait) {
		return appearanceForTraitCollection(trait);
	}

	@Generated
	@Variadic()
	@Deprecated
	@Selector("appearanceForTraitCollection:whenContainedIn:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object appearanceForTraitCollectionWhenContainedIn(
			UITraitCollection trait,
			@Mapped(ObjCObjectMapper.class) Object ContainerClass,
			Object... varargs);

	@Generated
	@Deprecated
	@ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _appearanceForTraitCollectionWhenContainedIn(
			UITraitCollection trait,
			@Mapped(ObjCObjectMapper.class) Object ContainerClass,
			Object... varargs) {
		return appearanceForTraitCollectionWhenContainedIn(trait,
				ContainerClass, varargs);
	}

	@Generated
	@Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
			UITraitCollection trait, NSArray<?> containerTypes);

	@Generated
	@ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
			UITraitCollection trait, NSArray<?> containerTypes) {
		return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
				trait, containerTypes);
	}

	@Generated
	@Variadic()
	@Deprecated
	@Selector("appearanceWhenContainedIn:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object appearanceWhenContainedIn(
			@Mapped(ObjCObjectMapper.class) Object ContainerClass,
			Object... varargs);

	@Generated
	@Deprecated
	@ProtocolClassMethod("appearanceWhenContainedIn")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _appearanceWhenContainedIn(
			@Mapped(ObjCObjectMapper.class) Object ContainerClass,
			Object... varargs) {
		return appearanceWhenContainedIn(ContainerClass, varargs);
	}

	@Generated
	@Selector("appearanceWhenContainedInInstancesOfClasses:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object appearanceWhenContainedInInstancesOfClasses(
			NSArray<?> containerTypes);

	@Generated
	@ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _appearanceWhenContainedInInstancesOfClasses(
			NSArray<?> containerTypes) {
		return appearanceWhenContainedInInstancesOfClasses(containerTypes);
	}

	@Generated
	@Selector("areAnimationsEnabled")
	public static native boolean areAnimationsEnabled();

	@Generated
	@Selector("areDefaultMotionEffectsEnabled")
	public native boolean areDefaultMotionEffectsEnabled();

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("backgroundView")
	public native MBBackgroundView backgroundView();

	@Generated
	@Selector("beginAnimations:context:")
	public static native void beginAnimationsContext(String animationID,
			VoidPtr context);

	@Generated
	@Selector("bezelView")
	public native MBBackgroundView bezelView();

	@Generated
	@Selector("button")
	public native UIButton button();

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
	@Selector("clearTextInputContextIdentifier:")
	public static native void clearTextInputContextIdentifier(String identifier);

	@Generated
	@Deprecated
	@Selector("color")
	public native UIColor color();

	@Generated
	@Selector("commitAnimations")
	public static native void commitAnimations();

	@Generated
	@Selector("completionBlock")
	@ObjCBlock(name = "call_completionBlock_ret")
	public native Block_completionBlock_ret completionBlock();

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_completionBlock_ret {
		@Generated
		void call_completionBlock_ret();
	}

	@Generated
	@Selector("contentColor")
	public native UIColor contentColor();

	@Generated
	@Deprecated
	@Selector("cornerRadius")
	@NFloat
	public native double cornerRadius();

	@Generated
	@Selector("customView")
	public native UIView customView();

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native MBProgressHUDDelegate delegate();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("detailsLabel")
	public native UILabel detailsLabel();

	@Generated
	@Deprecated
	@Selector("detailsLabelColor")
	public native UIColor detailsLabelColor();

	@Generated
	@Deprecated
	@Selector("detailsLabelFont")
	public native UIFont detailsLabelFont();

	@Generated
	@Deprecated
	@Selector("detailsLabelText")
	public native String detailsLabelText();

	@Generated
	@Deprecated
	@Selector("dimBackground")
	public native boolean dimBackground();

	@Generated
	@Selector("graceTime")
	public native double graceTime();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Deprecated
	@Selector("hide:")
	public native void hide(boolean animated);

	@Generated
	@Deprecated
	@Selector("hide:afterDelay:")
	public native void hideAfterDelay(boolean animated, double delay);

	@Generated
	@Deprecated
	@Selector("hideAllHUDsForView:animated:")
	@NUInt
	public static native long hideAllHUDsForViewAnimated(UIView view,
			boolean animated);

	@Generated
	@Selector("hideAnimated:")
	public native void hideAnimated(boolean animated);

	@Generated
	@Selector("hideAnimated:afterDelay:")
	public native void hideAnimatedAfterDelay(boolean animated, double delay);

	@Generated
	@Selector("hideHUDForView:animated:")
	public static native boolean hideHUDForViewAnimated(UIView view,
			boolean animated);

	@Generated
	@Selector("inheritedAnimationDuration")
	public static native double inheritedAnimationDuration();

	@Generated
	@Selector("init")
	public native MBProgressHUD init();

	@Generated
	@Selector("initWithCoder:")
	public native MBProgressHUD initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithFrame:")
	public native MBProgressHUD initWithFrame(@ByValue CGRect frame);

	@Generated
	@Selector("initWithView:")
	public native MBProgressHUD initWithView(UIView view);

	@Generated
	@Deprecated
	@Selector("initWithWindow:")
	public native MBProgressHUD initWithWindow(UIWindow window);

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
	@Selector("isSquare")
	public native boolean isSquare();

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("label")
	public native UILabel label();

	@Generated
	@Deprecated
	@Selector("labelColor")
	public native UIColor labelColor();

	@Generated
	@Deprecated
	@Selector("labelFont")
	public native UIFont labelFont();

	@Generated
	@Deprecated
	@Selector("labelText")
	public native String labelText();

	@Generated
	@Selector("layerClass")
	public static native Class layerClass();

	@Generated
	@Selector("margin")
	@NFloat
	public native double margin();

	@Generated
	@Selector("minShowTime")
	public native double minShowTime();

	@Generated
	@Selector("minSize")
	@ByValue
	public native CGSize minSize();

	@Generated
	@Selector("mode")
	@NInt
	public native long mode();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("offset")
	@ByValue
	public native CGPoint offset();

	@Generated
	@Deprecated
	@Selector("opacity")
	@NFloat
	public native double opacity();

	@Generated
	@Selector("performSystemAnimation:onViews:options:animations:completion:")
	public static native void performSystemAnimationOnViewsOptionsAnimationsCompletion(
			@NUInt long animation,
			NSArray<? extends UIView> views,
			@NUInt long options,
			@ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_3") UIView.Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_3 parallelAnimations,
			@ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_4") UIView.Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_4 completion);

	@Generated
	@Selector("performWithoutAnimation:")
	public static native void performWithoutAnimation(
			@ObjCBlock(name = "call_performWithoutAnimation") UIView.Block_performWithoutAnimation actionsWithoutAnimation);

	@Generated
	@Selector("progress")
	public native float progress();

	@Generated
	@Selector("progressObject")
	public native NSProgress progressObject();

	@Generated
	@Selector("removeFromSuperViewOnHide")
	public native boolean removeFromSuperViewOnHide();

	@Generated
	@Selector("requiresConstraintBasedLayout")
	public static native boolean requiresConstraintBasedLayout();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Deprecated
	@Selector("setActivityIndicatorColor:")
	public native void setActivityIndicatorColor(UIColor value);

	@Generated
	@Selector("setAnimationBeginsFromCurrentState:")
	public static native void setAnimationBeginsFromCurrentState(
			boolean fromCurrentState);

	@Generated
	@Selector("setAnimationCurve:")
	public static native void setAnimationCurve(@NInt long curve);

	@Generated
	@Selector("setAnimationDelay:")
	public static native void setAnimationDelay(double delay);

	@Generated
	@Selector("setAnimationDelegate:")
	public static native void setAnimationDelegate(
			@Mapped(ObjCObjectMapper.class) Object delegate);

	@Generated
	@Selector("setAnimationDidStopSelector:")
	public static native void setAnimationDidStopSelector(SEL selector);

	@Generated
	@Selector("setAnimationDuration:")
	public static native void setAnimationDuration_static(double duration);

	@Generated
	@Selector("setAnimationRepeatAutoreverses:")
	public static native void setAnimationRepeatAutoreverses(
			boolean repeatAutoreverses);

	@Generated
	@Selector("setAnimationRepeatCount:")
	public static native void setAnimationRepeatCount_static(float repeatCount);

	@Generated
	@Selector("setAnimationStartDate:")
	public static native void setAnimationStartDate(NSDate startDate);

	@Generated
	@Selector("setAnimationTransition:forView:cache:")
	public static native void setAnimationTransitionForViewCache(
			@NInt long transition, UIView view, boolean cache);

	@Generated
	@Selector("setAnimationType:")
	public native void setAnimationType(@NInt long value);

	@Generated
	@Selector("setAnimationWillStartSelector:")
	public static native void setAnimationWillStartSelector(SEL selector);

	@Generated
	@Selector("setAnimationsEnabled:")
	public static native void setAnimationsEnabled(boolean enabled);

	@Generated
	@Deprecated
	@Selector("setColor:")
	public native void setColor(UIColor value);

	@Generated
	@Selector("setCompletionBlock:")
	public native void setCompletionBlock(
			@ObjCBlock(name = "call_setCompletionBlock") Block_setCompletionBlock value);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_setCompletionBlock {
		@Generated
		void call_setCompletionBlock();
	}

	@Generated
	@Selector("setContentColor:")
	public native void setContentColor(UIColor value);

	@Generated
	@Deprecated
	@Selector("setCornerRadius:")
	public native void setCornerRadius(@NFloat double value);

	@Generated
	@Selector("setCustomView:")
	public native void setCustomView(UIView value);

	@Generated
	@Selector("setDefaultMotionEffectsEnabled:")
	public native void setDefaultMotionEffectsEnabled(boolean value);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) MBProgressHUDDelegate value);

	@Generated
	public void setDelegate(
			@Mapped(ObjCObjectMapper.class) MBProgressHUDDelegate value) {
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
	@Deprecated
	@Selector("setDetailsLabelColor:")
	public native void setDetailsLabelColor(UIColor value);

	@Generated
	@Deprecated
	@Selector("setDetailsLabelFont:")
	public native void setDetailsLabelFont(UIFont value);

	@Generated
	@Deprecated
	@Selector("setDetailsLabelText:")
	public native void setDetailsLabelText(String value);

	@Generated
	@Deprecated
	@Selector("setDimBackground:")
	public native void setDimBackground(boolean value);

	@Generated
	@Selector("setGraceTime:")
	public native void setGraceTime(double value);

	@Generated
	@Deprecated
	@Selector("setLabelColor:")
	public native void setLabelColor(UIColor value);

	@Generated
	@Deprecated
	@Selector("setLabelFont:")
	public native void setLabelFont(UIFont value);

	@Generated
	@Deprecated
	@Selector("setLabelText:")
	public native void setLabelText(String value);

	@Generated
	@Selector("setMargin:")
	public native void setMargin(@NFloat double value);

	@Generated
	@Selector("setMinShowTime:")
	public native void setMinShowTime(double value);

	@Generated
	@Selector("setMinSize:")
	public native void setMinSize(@ByValue CGSize value);

	@Generated
	@Selector("setMode:")
	public native void setMode(@NInt long value);

	@Generated
	@Selector("setOffset:")
	public native void setOffset(@ByValue CGPoint value);

	@Generated
	@Deprecated
	@Selector("setOpacity:")
	public native void setOpacity(@NFloat double value);

	@Generated
	@Selector("setProgress:")
	public native void setProgress(float value);

	@Generated
	@Selector("setProgressObject:")
	public native void setProgressObject(NSProgress value);

	@Generated
	@Selector("setRemoveFromSuperViewOnHide:")
	public native void setRemoveFromSuperViewOnHide(boolean value);

	@Generated
	@Selector("setSquare:")
	public native void setSquare(boolean value);

	@Generated
	@Deprecated
	@Selector("setTaskInProgress:")
	public native void setTaskInProgress(boolean value);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Deprecated
	@Selector("setXOffset:")
	public native void setXOffset(@NFloat double value);

	@Generated
	@Deprecated
	@Selector("setYOffset:")
	public native void setYOffset(@NFloat double value);

	@Generated
	@Deprecated
	@Selector("show:")
	public native void show(boolean animated);

	@Generated
	@Selector("showAnimated:")
	public native void showAnimated(boolean animated);

	@Generated
	@Deprecated
	@Selector("showAnimated:whileExecutingBlock:")
	public native void showAnimatedWhileExecutingBlock(
			boolean animated,
			@ObjCBlock(name = "call_showAnimatedWhileExecutingBlock") Block_showAnimatedWhileExecutingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_showAnimatedWhileExecutingBlock {
		@Generated
		void call_showAnimatedWhileExecutingBlock();
	}

	@Generated
	@Deprecated
	@Selector("showAnimated:whileExecutingBlock:completionBlock:")
	public native void showAnimatedWhileExecutingBlockCompletionBlock(
			boolean animated,
			@ObjCBlock(name = "call_showAnimatedWhileExecutingBlockCompletionBlock_1") Block_showAnimatedWhileExecutingBlockCompletionBlock_1 block,
			@ObjCBlock(name = "call_showAnimatedWhileExecutingBlockCompletionBlock_2") Block_showAnimatedWhileExecutingBlockCompletionBlock_2 completion);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_showAnimatedWhileExecutingBlockCompletionBlock_1 {
		@Generated
		void call_showAnimatedWhileExecutingBlockCompletionBlock_1();
	}

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_showAnimatedWhileExecutingBlockCompletionBlock_2 {
		@Generated
		void call_showAnimatedWhileExecutingBlockCompletionBlock_2();
	}

	@Generated
	@Deprecated
	@Selector("showAnimated:whileExecutingBlock:onQueue:")
	public native void showAnimatedWhileExecutingBlockOnQueue(
			boolean animated,
			@ObjCBlock(name = "call_showAnimatedWhileExecutingBlockOnQueue") Block_showAnimatedWhileExecutingBlockOnQueue block,
			NSObject queue);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_showAnimatedWhileExecutingBlockOnQueue {
		@Generated
		void call_showAnimatedWhileExecutingBlockOnQueue();
	}

	@Generated
	@Deprecated
	@Selector("showAnimated:whileExecutingBlock:onQueue:completionBlock:")
	public native void showAnimatedWhileExecutingBlockOnQueueCompletionBlock(
			boolean animated,
			@ObjCBlock(name = "call_showAnimatedWhileExecutingBlockOnQueueCompletionBlock_1") Block_showAnimatedWhileExecutingBlockOnQueueCompletionBlock_1 block,
			NSObject queue,
			@ObjCBlock(name = "call_showAnimatedWhileExecutingBlockOnQueueCompletionBlock_3") Block_showAnimatedWhileExecutingBlockOnQueueCompletionBlock_3 completion);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_showAnimatedWhileExecutingBlockOnQueueCompletionBlock_1 {
		@Generated
		void call_showAnimatedWhileExecutingBlockOnQueueCompletionBlock_1();
	}

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_showAnimatedWhileExecutingBlockOnQueueCompletionBlock_3 {
		@Generated
		void call_showAnimatedWhileExecutingBlockOnQueueCompletionBlock_3();
	}

	@Generated
	@Selector("showHUDAddedTo:animated:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object showHUDAddedToAnimated(UIView view,
			boolean animated);

	@Generated
	@Deprecated
	@Selector("showWhileExecuting:onTarget:withObject:animated:")
	public native void showWhileExecutingOnTargetWithObjectAnimated(SEL method,
			@Mapped(ObjCObjectMapper.class) Object target,
			@Mapped(ObjCObjectMapper.class) Object object, boolean animated);

	@Generated
	@Deprecated
	@Selector("size")
	@ByValue
	public native CGSize size();

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Deprecated
	@Selector("taskInProgress")
	public native boolean taskInProgress();

	@Generated
	@Selector("transitionFromView:toView:duration:options:completion:")
	public static native void transitionFromViewToViewDurationOptionsCompletion(
			UIView fromView,
			UIView toView,
			double duration,
			@NUInt long options,
			@ObjCBlock(name = "call_transitionFromViewToViewDurationOptionsCompletion") UIView.Block_transitionFromViewToViewDurationOptionsCompletion completion);

	@Generated
	@Selector("transitionWithView:duration:options:animations:completion:")
	public static native void transitionWithViewDurationOptionsAnimationsCompletion(
			UIView view,
			double duration,
			@NUInt long options,
			@ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_3") UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_3 animations,
			@ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_4") UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_4 completion);

	@Generated
	@Selector("userInterfaceLayoutDirectionForSemanticContentAttribute:")
	@NInt
	public static native long userInterfaceLayoutDirectionForSemanticContentAttribute(
			@NInt long attribute);

	@Generated
	@Selector("userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
	@NInt
	public static native long userInterfaceLayoutDirectionForSemanticContentAttributeRelativeToLayoutDirection(
			@NInt long semanticContentAttribute, @NInt long layoutDirection);

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();

	@Generated
	@Deprecated
	@Selector("xOffset")
	@NFloat
	public native double xOffset();

	@Generated
	@Deprecated
	@Selector("yOffset")
	@NFloat
	public native double yOffset();
}