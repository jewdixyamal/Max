package defpackage;

import android.content.Context;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* renamed from: ecf  reason: default package */
public final class ecf extends EnhancedVectorDrawable implements kre {
    public final int a;
    public final m56 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ecf(Context context, int i, m56 m56) {
        super(context, i == 1 ? woc.h2 : woc.i2);
        this.a = i;
        this.b = m56;
        onThemeChanged(qp4.u0.b(context).i());
    }

    public final void onThemeChanged(fka fka) {
        dcf dcf = (dcf) this.b.invoke(fka);
        c54.Z(this, "mark_path", dcf.a);
        c54.Z(this, "background_path", dcf.b);
    }
}
