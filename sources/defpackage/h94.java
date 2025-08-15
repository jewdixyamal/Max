package defpackage;

import android.content.Context;

/* renamed from: h94  reason: default package */
public final class h94 implements q24 {
    public final Context a;
    public final q24 b;

    public h94(Context context) {
        this(context, new jb4());
    }

    public final t24 a() {
        return new j94(this.a, this.b.a());
    }

    public h94(Context context, q24 q24) {
        this.a = context.getApplicationContext();
        this.b = q24;
    }
}
