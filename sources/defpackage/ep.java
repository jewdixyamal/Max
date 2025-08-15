package defpackage;

import android.content.Context;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: ep  reason: default package */
public final class ep extends lle {
    public final je7 k;
    public final je7 l;
    public final je7 m;
    public final je7 n;
    public final je7 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ep(Context context, je7 je7, je7 je72, v7g v7g, p84 p84, je7 je73, je7 je74, je7 je75, je7 je76, je7 je77, je7 je78, je7 je79) {
        super(context, p84, je72, je74, je75, je76, je77);
        Context context2 = context;
        p84 p842 = p84;
        this.k = je78;
        this.l = je7;
        this.m = tu0.r(2, new bp(context, this, p84, v7g, je79));
        this.n = tu0.r(2, new cp(context, this, p842, 0));
        tu0.r(2, new cp(context, this, p842, 1));
        this.o = tu0.r(2, new cp(p842, this, context));
        tu0.r(2, new cp(context, this, p842, 3));
    }

    public final boolean b() {
        if (jv9.a(a().j(false).b)) {
            return false;
        }
        je7 je7 = this.l;
        z7d z7d = ((p7b) je7.getValue()).b;
        z7d.getClass();
        int q = (int) z7d.q(PmsKey.f103pushalerttimeout, (long) 604800);
        if (q <= 0) {
            return false;
        }
        return System.currentTimeMillis() - ((p7b) je7.getValue()).a.g.getLong("app.last.push.alert.time", 0) > ((long) (q * 1000));
    }
}
