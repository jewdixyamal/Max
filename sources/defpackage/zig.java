package defpackage;

import android.content.Context;

/* renamed from: zig  reason: default package */
public final class zig implements ifg {
    public final y7f a;

    public zig(y7f y7f) {
        this.a = y7f;
    }

    public final Object r() {
        Context context = (Context) this.a.b;
        if (context != null) {
            return context;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
