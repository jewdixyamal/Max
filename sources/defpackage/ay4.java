package defpackage;

import java.util.List;

/* renamed from: ay4  reason: default package */
public final class ay4 extends tw4 implements tx4 {
    public final je7 a;
    public final je7 b;
    public zw4 c;
    public jy4 d;
    public boolean e;

    public ay4(je7 je7, je7 je72) {
        this.a = je7;
        this.b = je72;
    }

    public final boolean a(int i, CharSequence charSequence) {
        return j().a(i, charSequence);
    }

    public final List c(CharSequence charSequence) {
        return j().c(charSequence);
    }

    public final CharSequence e(CharSequence charSequence) {
        return j().e(charSequence);
    }

    public final List f(CharSequence charSequence) {
        return j().f(charSequence);
    }

    public final boolean g(CharSequence charSequence) {
        return j().g(charSequence);
    }

    public final void h(Throwable th) {
        vx4 vx4;
        je7 je7 = this.b;
        if (je7 != null && (vx4 = (vx4) je7.getValue()) != null) {
            ((cba) ((o45) vx4.e.getValue())).c(new Exception("Can't load emoji", th), true);
        }
    }

    public final void i() {
        vx4 vx4;
        this.c = new zw4(vw4.a());
        this.e = true;
        je7 je7 = this.b;
        if (je7 != null && (vx4 = (vx4) je7.getValue()) != null) {
            ((jle) ((hle) vx4.d.getValue())).a().b(new dd4(14, vx4));
            sx4 sx4 = (sx4) vx4.f.getValue();
            if (sx4.d == null) {
                hm9.m("sx4", "invalidate: palette is null. Ignore", new Object[0]);
                return;
            }
            hm9.m("sx4", "invalidate", new Object[0]);
            new e0a(qy9.j(sx4.d), new rx4(sx4, 0), 1).v().m(((jle) sx4.b).a()).k(new iq1(new rx4(sx4, 1), 2, new ta4(10)));
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [jy4, java.lang.Object] */
    public final tx4 j() {
        zw4 zw4 = this.c;
        if (zw4 != null) {
            return zw4;
        }
        if (this.d == null) {
            this.d = new Object();
        }
        return this.d;
    }
}
