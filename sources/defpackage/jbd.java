package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: jbd  reason: default package */
public final class jbd implements hbd, mh3 {
    public static final /* synthetic */ int j = 0;
    public final je7 a;
    public final o45 b;
    public final je7 c;
    public final CopyOnWriteArraySet d = new CopyOnWriteArraySet();
    public final ml0 e = new ml0((Object) null);
    public final String[] f = {"no_net", "disconnected", "connected", "logged_in"};
    public final String[] g = {"disconnected", "connected", "logged_in"};
    public volatile int h = 0;
    public volatile int i = 0;

    public jbd(je7 je7, o45 o45, je7 je72) {
        this.a = je7;
        this.b = o45;
        this.c = je72;
        ((gh3) je7.getValue()).c(new ibd(this));
        hm9.m("jbd", "ctor, %s", toString());
    }

    public final void a(gbd gbd) {
        if (gbd != null) {
            this.d.add(gbd);
            gbd.c(this.h);
        }
    }

    public final void b() {
        if (!((gh3) this.a.getValue()).f()) {
            this.h = 0;
        } else {
            int i2 = this.i;
            if (i2 == 0) {
                this.h = 1;
            } else if (i2 == 1) {
                this.h = 2;
            } else if (i2 == 2) {
                this.h = 3;
            } else {
                throw new IllegalStateException("Unknown connection status=" + this.i);
            }
        }
        hm9.m("jbd", "updateState, %s", toString());
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((gbd) it.next()).c(this.h);
        }
        this.e.e(Integer.valueOf(this.h));
    }

    public final String toString() {
        return "SessionStateInfoImpl@" + Integer.toHexString(hashCode()) + "(connStatus=" + this.g[this.i] + ") -> " + this.f[this.h];
    }
}
