package defpackage;

import android.net.Uri;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: e4d  reason: default package */
public final class e4d extends hqd {
    public static final /* synthetic */ int J0 = 0;
    public final bqc F0;
    public final OneMeDraweeView G0;
    public final AppCompatTextView H0;
    public c86 I0;

    public e4d(bqc bqc, OneMeDraweeView oneMeDraweeView, AppCompatTextView appCompatTextView, LinearLayout linearLayout) {
        super(linearLayout);
        this.F0 = bqc;
        this.G0 = oneMeDraweeView;
        this.H0 = appCompatTextView;
        tu0.K(linearLayout, 300, new elb(2, (Object) this));
    }

    /* renamed from: E */
    public final void A(c86 c86) {
        String str;
        this.I0 = c86;
        n3 c = c86.a.a.c();
        boolean z = c instanceof q76;
        AppCompatTextView appCompatTextView = this.H0;
        if (z) {
            str = appCompatTextView.getContext().getString(((q76) c).a);
        } else if (c instanceof r76) {
            str = ((r76) c).a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        appCompatTextView.setText(str);
        v3c.y(new m1d(c86, this, (Continuation) null), appCompatTextView);
        OneMeDraweeView oneMeDraweeView = this.G0;
        Uri uri = c86.b;
        if (uri != null) {
            xv6 d = xv6.d(uri);
            d.i = true;
            wv6 a = d.a();
            int i = OneMeDraweeView.B0;
            oneMeDraweeView.o(a, (wv6) null);
            return;
        }
        int i2 = OneMeDraweeView.B0;
        oneMeDraweeView.o((wv6) null, (wv6) null);
    }
}
