package defpackage;

import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: t7g  reason: default package */
public final class t7g extends ContextWrapper implements ke3 {
    public final /* synthetic */ v7g a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t7g(v7g v7g, Context context) {
        super(context);
        this.a = v7g;
    }

    public final me3 a() {
        return ((ke3) this.a.a.getApplicationContext()).a();
    }

    public final boolean isDeviceProtectedStorage() {
        return false;
    }
}
