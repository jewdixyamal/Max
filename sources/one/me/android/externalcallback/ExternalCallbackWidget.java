package one.me.android.externalcallback;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/android/externalcallback/ExternalCallbackWidget;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "uriAsParam", "(Ljava/lang/String;)V", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ExternalCallbackWidget extends BottomSheetWidget {
    public static final /* synthetic */ int B0 = 0;
    public final boolean A0;
    public final je7 y0;
    public final je7 z0;

    public ExternalCallbackWidget(Bundle bundle) {
        super(bundle);
        this.y0 = createViewModelLazy(t95.class, new nj4(2, new zf3(27)));
        this.z0 = tu0.r(3, new zf3(28));
        this.A0 = true;
    }

    public final boolean isDialog() {
        return this.A0;
    }

    public final void onAttach(View view) {
        super.onAttach(view);
        t95 t95 = (t95) this.y0.getValue();
        String string = getArgs().getString("external_callback_param_arg");
        if (string == null) {
            string = "";
        }
        vxd vxd = t95.X;
        if (vxd == null || !vxd.isActive()) {
            t95.X = j47.T(t95.a, ((w9a) ((kke) t95.c.getValue())).b(), (vx3) null, new s95(t95, string, (Continuation) null), 2);
        }
    }

    public final void onViewCreated(View view) {
        od2.L(new zn5(tu0.g(((t95) this.y0.getValue()).o, getViewLifecycleOwner().Q(), fg7.o), new u95((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setLayoutParams(layoutParams);
        float f = (float) 70;
        frameLayout2.setPadding(frameLayout2.getPaddingLeft(), tu0.G(fk4.d().getDisplayMetrics().density * f), frameLayout2.getPaddingRight(), tu0.G(f * fk4.d().getDisplayMetrics().density));
        TextView textView = new TextView(frameLayout2.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        textView.setGravity(17);
        ArrayList arrayList = qqe.a;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (sz6) this.z0.getValue(), (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density));
        textView.setText(yoc.y0);
        v3c.y(new c3(this, (Continuation) null, 11), textView);
        frameLayout2.addView(textView);
        return frameLayout2;
    }

    public ExternalCallbackWidget(String str) {
        this(dy7.g(new kpa("external_callback_param_arg", str)));
    }
}
