package defpackage;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: we9  reason: default package */
public final class we9 extends gle {
    public final fs8 c;

    public we9(fs8 fs8) {
        this.c = fs8;
    }

    public static final we9 c(gy8 gy8) {
        String str;
        if (!gy8.m()) {
            return null;
        }
        int x0 = gy8.x0();
        fs8 fs8 = null;
        for (int i = 0; i < x0; i++) {
            try {
                str = lz7.P(gy8);
            } catch (Throwable th) {
                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                Iterator it = u7d.a.iterator();
                while (it.hasNext()) {
                    ((r4a) it.next()).getClass();
                    r4a.a(th);
                }
                int s = au1.s(k7d.a);
                if (s == 0) {
                    str = null;
                } else if (s != 1) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    throw th;
                }
            }
            if (str != null) {
                if (str.equals("message")) {
                    fs8 = tpa.z(gy8);
                } else {
                    gy8.z();
                }
            }
        }
        return new we9(fs8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof we9) && tpa.f(this.c, ((we9) obj).c);
    }

    public final int hashCode() {
        fs8 fs8 = this.c;
        if (fs8 == null) {
            return 0;
        }
        return fs8.hashCode();
    }

    public final String toString() {
        return "Response(message=" + this.c + ")";
    }
}
