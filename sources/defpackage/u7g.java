package defpackage;

import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: u7g  reason: default package */
public final class u7g extends ContextWrapper implements ke3 {
    public final t7g a;
    public final /* synthetic */ v7g b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u7g(v7g v7g, Context context) {
        super(context);
        this.b = v7g;
        this.a = new t7g(v7g, v7g.a.getApplicationContext());
    }

    public final me3 a() {
        return ((ke3) this.b.a.getApplicationContext()).a();
    }

    public final Context getApplicationContext() {
        return this.a;
    }
}
