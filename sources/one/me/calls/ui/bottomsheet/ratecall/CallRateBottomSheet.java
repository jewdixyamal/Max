package one.me.calls.ui.bottomsheet.ratecall;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u000e¨\u0006\u000f"}, d2 = {"Lone/me/calls/ui/bottomsheet/ratecall/CallRateBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Lu4c;", "La5c;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "callId", "", "isVideoCall", "", "sdkReasons", "(Ljava/lang/String;ZLjava/util/List;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class CallRateBottomSheet extends BottomSheetWidget implements u4c, a5c {
    public static final /* synthetic */ bc7[] I0;
    public final fs A0;
    public final AutoTransition B0;
    public final je7 C0;
    public final q7c D0;
    public final q7c E0;
    public final q7c F0;
    public final q7c G0;
    public final q7c H0;
    public final fs y0;
    public final fs z0;

    static {
        Class<CallRateBottomSheet> cls = CallRateBottomSheet.class;
        hob hob = new hob(cls, "callId", "getCallId()Ljava/lang/String;", 0);
        oec oec = nec.a;
        I0 = new bc7[]{hob, zr6.e(oec, cls, "isVideoCall", "isVideoCall()Z", 0), zr6.f(cls, "sdkReasons", "getSdkReasons()Ljava/util/List;", 0, oec), zr6.f(cls, "title", "getTitle()Landroid/widget/TextView;", 0, oec), zr6.f(cls, "rateCallButtonGroup", "getRateCallButtonGroup()Lone/me/calls/ui/bottomsheet/ratecall/view/RateCallButtonGroup;", 0, oec), zr6.f(cls, "reasonsChipGroup", "getReasonsChipGroup()Lone/me/calls/ui/bottomsheet/ratecall/view/RateCallReasonsChipGroup;", 0, oec), zr6.f(cls, "sendButton", "getSendButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, oec), zr6.f(cls, "customReasonEditText", "getCustomReasonEditText()Lone/me/calls/ui/bottomsheet/ratecall/view/CustomReasonInputView;", 0, oec)};
    }

    public CallRateBottomSheet(Bundle bundle) {
        super(bundle);
        this.y0 = new fs(String.class, "ratecall:call_id");
        this.z0 = new fs(Boolean.class, "ratecall:is_video_call");
        this.A0 = new fs(List.class, "ratecall:sdk_reasons");
        this.B0 = new AutoTransition();
        this.C0 = createViewModelLazy(lh1.class, new s(19, new md1(1, this)));
        this.D0 = viewBinding(y7a.B0);
        this.E0 = viewBinding(y7a.u0);
        this.F0 = viewBinding(y7a.v0);
        this.G0 = viewBinding(y7a.A0);
        this.H0 = viewBinding(y7a.w0);
    }

    public final b5c A0() {
        return (b5c) this.F0.T0(this, I0[5]);
    }

    public final lh1 B0() {
        return (lh1) this.C0.getValue();
    }

    public final void onViewCreated(View view) {
        w7c w7c = B0().t0;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(w7c, getViewLifecycleOwner().Q(), fg7), new zg1((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(B0().v0, getViewLifecycleOwner().Q(), fg7), new ah1((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(B0().x0, getViewLifecycleOwner().Q(), fg7), new bh1((Continuation) null, view, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(B0().y0, getViewLifecycleOwner().Q(), fg7), new ch1((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(B0().z0, getViewLifecycleOwner().Q(), fg7), new dh1((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void u0() {
        B0().s((String) null, true);
    }

    /* JADX WARNING: type inference failed for: r5v7, types: [android.widget.LinearLayout, w4c, android.view.View] */
    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        TextView textView = new TextView(context);
        textView.setId(y7a.B0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = (float) 24;
        layoutParams.bottomMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        i4f.b.b(textView, du4.b);
        v3c.y(new v9(3, (Continuation) null, 1), textView);
        ? linearLayout = new LinearLayout(context, (AttributeSet) null);
        linearLayout.b = 3;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.c = nz4.a;
        linearLayout.setId(y7a.u0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        linearLayout.setLayoutParams(layoutParams2);
        linearLayout.setGravity(17);
        linearLayout.setListener(this);
        b5c b5c = new b5c(context, (AttributeSet) null);
        b5c.setId(y7a.v0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.bottomMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        b5c.setLayoutParams(layoutParams3);
        b5c.setListener(this);
        OneMeButton oneMeButton = new OneMeButton(context, (AttributeSet) null);
        oneMeButton.setId(y7a.A0);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setAppearance(z6a.o);
        oneMeButton.setText(b8a.D0);
        tu0.K(oneMeButton, 300, new c5(10, (Object) this));
        n04 n04 = new n04(context);
        n04.setId(y7a.w0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        float f2 = (float) 84;
        n04.setMinimumHeight(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        layoutParams4.bottomMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        n04.setLayoutParams(layoutParams4);
        n04.setHint(z7.B(n04.getContext(), b8a.l0));
        n04.setMaxCount(50);
        n04.setMinimumHeight(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        n04.setTextChangeListener(new l(19, this));
        n04.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(frameLayout.getContext());
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        float f3 = (float) 12;
        linearLayout2.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f3 * fk4.d().getDisplayMetrics().density), 0);
        linearLayout2.addView(textView);
        linearLayout2.addView(linearLayout);
        linearLayout2.addView(b5c);
        linearLayout2.addView(n04);
        linearLayout2.addView(oneMeButton);
        return linearLayout2;
    }

    public CallRateBottomSheet(String str, boolean z, List<String> list) {
        this(dy7.g(new kpa("ratecall:call_id", str), new kpa("ratecall:is_video_call", Boolean.valueOf(z)), new kpa("ratecall:sdk_reasons", list)));
    }
}
