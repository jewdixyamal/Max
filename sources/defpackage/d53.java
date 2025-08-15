package defpackage;

import android.graphics.drawable.Animatable;

/* renamed from: d53  reason: default package */
public final class d53 extends ii0 {
    public final /* synthetic */ e53 b;
    public final /* synthetic */ a53 c;

    public d53(e53 e53, a53 a53) {
        this.b = e53;
        this.c = a53;
    }

    public final void a(String str, ru6 ru6, Animatable animatable) {
        e53 e53 = this.b;
        e53.b.postInvalidate();
        e53.g.invoke(this.c.i());
    }

    public final void d(String str, Throwable th) {
        hm9.p("CollageImageAttachDraweeWrapper", "onFailure", th);
    }
}
