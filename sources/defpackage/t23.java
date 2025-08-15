package defpackage;

import com.jakewharton.processphoenix.ProcessPhoenix;

/* renamed from: t23  reason: default package */
public final class t23 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;

    public t23(je7 je7, je7 je72, je7 je73, je7 je74) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        this.d = je74;
    }

    public final void a() {
        je7 je7 = this.a;
        String f = ((f5a) je7.getValue()).f();
        je7 je72 = this.b;
        long t = ((hyc) ((q33) je72.getValue())).t();
        if (f != null && f.length() != 0 && t != -1) {
            ((ku7) this.c.getValue()).a(false);
            ((hyc) ((q33) je72.getValue())).C(Long.valueOf(t));
            ((f5a) je7.getValue()).h(f, false);
            hm9.m("cu7", "Run onDropCache", new Object[0]);
            ProcessPhoenix.b(((n8c) this.d.getValue()).a);
        }
    }
}
