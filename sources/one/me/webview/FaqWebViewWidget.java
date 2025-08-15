package one.me.webview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/webview/FaqWebViewWidget;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "webview_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class FaqWebViewWidget extends Widget {
    public static final /* synthetic */ bc7[] Z;
    public final xe5 X;
    public final zf4 Y;
    public final q7c a = viewBinding(nla.a);
    public final x27 b = x27.d;
    public final w4d c = mqd.D();
    public final je7 o;

    static {
        Class<FaqWebViewWidget> cls = FaqWebViewWidget.class;
        Z = new bc7[]{new hob(cls, "webView", "getWebView()Lone/me/sdk/uikit/common/views/OneMeWebView;", 0), rh4.g(nec.a, cls, "urlJob", "getUrlJob()Lkotlinx/coroutines/Job;")};
    }

    /* JADX WARNING: type inference failed for: r3v9, types: [a66, ffe] */
    public FaqWebViewWidget() {
        super((Bundle) null, 0, 3, (z84) null);
        q3g q3g = q3g.a;
        this.o = q3g.getAccessor().d(al.class);
        this.X = new xe5(q3g.getAccessor().d(ri4.class), q3g.getAccessor().d(f5a.class), q3g.getAccessor().d(ds3.class), q3g.getAccessor().d(q33.class), q3g.getAccessor().d(y7d.class), q3g.getAccessor().d(Context.class));
        this.Y = j47.h(getLifecycleScope(), ((w9a) ((kke) q3g.getAccessor().c(kke.class))).a(), new ffe(2, (Continuation) null), 2);
    }

    public final x27 getInsetsConfig() {
        return this.b;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        cla cla = new cla(linearLayout.getContext(), 6);
        cla.setTitle(ola.b);
        cla.setForm(uka.a);
        cla.setLeftActions(new kka(new jy2(12, this)));
        linearLayout.addView(cla);
        hla hla = new hla(linearLayout.getContext(), (AttributeSet) null, 0, 14);
        hla.setId(nla.a);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        hla.setLayoutParams(layoutParams);
        hla.getSettings().setJavaScriptEnabled(true);
        hla.setWebViewClient(new rb5(this));
        linearLayout.addView(hla);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        bc7[] bc7Arr = Z;
        bc7 bc7 = bc7Arr[1];
        w4d w4d = this.c;
        x77 x77 = (x77) w4d.T0(this, bc7);
        if (x77 != null) {
            x77.cancel((CancellationException) null);
        }
        w4d.o1(this, bc7Arr[1], (Object) null);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        j47.T(getViewLifecycleScope(), (lx3) null, (vx3) null, new sb5(this, (Continuation) null), 3);
    }
}
