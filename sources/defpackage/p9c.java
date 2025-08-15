package defpackage;

import java.util.List;
import java.util.Locale;

/* renamed from: p9c  reason: default package */
public final class p9c {
    public final jlc a;
    public final q33 b;

    public p9c(jlc jlc, q33 q33) {
        this.a = jlc;
        this.b = q33;
    }

    public static t28 d(d9c d9c, h9c h9c) {
        long j = h9c.b;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        t9c t9c = h9c.a;
        if (i > 0) {
            d9c.getClass();
            xlc a2 = xlc.a(2, "SELECT * FROM recent WHERE recent_type=? AND server_id=?");
            a2.j(1, (long) t9c.a);
            a2.j(2, j);
            return new t28(new b9c(d9c, a2, 3));
        }
        int ordinal = t9c.ordinal();
        int i2 = t9c.a;
        if (ordinal == 1) {
            d9c.getClass();
            xlc a3 = xlc.a(2, "SELECT * FROM recent WHERE recent_type=? AND emoji=?");
            a3.j(1, (long) i2);
            String str = ((by4) h9c).c;
            if (str == null) {
                a3.W(2);
            } else {
                a3.f(2, str);
            }
            return new t28(new b9c(d9c, a3, 1));
        } else if (ordinal == 2) {
            d9c.getClass();
            xlc a4 = xlc.a(2, "SELECT * FROM recent WHERE recent_type=? AND sticker_id=?");
            a4.j(1, (long) i2);
            a4.j(2, ((j3e) h9c).c);
            return new t28(new b9c(d9c, a4, 0));
        } else if (ordinal == 3) {
            long j2 = ((vc6) h9c).c.s0;
            d9c.getClass();
            xlc a5 = xlc.a(2, "SELECT * FROM recent WHERE recent_type=? AND gif_id=?");
            a5.j(1, (long) i2);
            a5.j(2, j2);
            return new t28(new b9c(d9c, a5, 2));
        } else {
            Locale locale = Locale.ENGLISH;
            throw new IllegalStateException("Unexpected value: " + t9c);
        }
    }

    public final qy9 a(List list) {
        return new q28(b(), new z72(21, list), 3).i(new z72(22, list), Integer.MAX_VALUE);
    }

    public final uqd b() {
        return this.a.n().h(new p4c(10));
    }

    public final qa3 c(List list) {
        return new qa3(this.a.n(), 2, new o9c(this, list, 1));
    }
}
