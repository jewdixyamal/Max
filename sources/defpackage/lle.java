package defpackage;

import android.content.Context;

/* renamed from: lle  reason: default package */
public abstract class lle {
    public final Context a;
    public final p84 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final je7 h;
    public final khe i;
    public final khe j;

    public lle(Context context, p84 p84, je7 je7, je7 je72, je7 je73, je7 je74, je7 je75) {
        this.a = context;
        this.b = p84;
        this.c = je7;
        this.d = je73;
        this.e = je72;
        this.f = je74;
        this.g = ((c79) je75.getValue()).a;
        ((c79) je75.getValue()).getClass();
        this.h = ((c79) je75.getValue()).b;
        ep epVar = (ep) this;
        this.i = new khe(new kle(epVar, 0));
        this.j = new khe(new kle(epVar, 1));
    }

    public final bea a() {
        return (bea) this.e.getValue();
    }

    public abstract boolean b();
}
