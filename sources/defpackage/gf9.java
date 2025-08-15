package defpackage;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: gf9  reason: default package */
public final class gf9 extends gle {
    public final fx8 c;
    public final String o;

    public gf9(fx8 fx8, String str) {
        this.c = fx8;
        this.o = str;
    }

    public static final gf9 c(gy8 gy8) {
        int i;
        String str;
        if (!gy8.m()) {
            return null;
        }
        try {
            i = lz7.N(gy8);
        } catch (Throwable th) {
            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = u7d.a.iterator();
            while (it.hasNext()) {
                ((r4a) it.next()).getClass();
                r4a.a(th);
            }
            int s = au1.s(k7d.a);
            if (s == 0) {
                i = 0;
            } else if (s != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                throw th;
            }
        }
        fx8 fx8 = null;
        String str2 = null;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                str = lz7.P(gy8);
            } catch (Throwable th2) {
                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                Iterator it2 = u7d.a.iterator();
                while (it2.hasNext()) {
                    ((r4a) it2.next()).getClass();
                    r4a.a(th2);
                }
                int s2 = au1.s(k7d.a);
                if (s2 == 0) {
                    str = null;
                } else if (s2 != 1) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    throw th2;
                }
            }
            if (str != null) {
                if (str.equals("reactionInfo")) {
                    fx8 = ote.F(gy8);
                } else if (str.equals("error")) {
                    try {
                        str2 = lz7.P(gy8);
                    } catch (Throwable th3) {
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                        Iterator it3 = u7d.a.iterator();
                        while (it3.hasNext()) {
                            ((r4a) it3.next()).getClass();
                            r4a.a(th3);
                        }
                        int s3 = au1.s(k7d.a);
                        if (s3 == 0) {
                            str2 = null;
                        } else if (s3 != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th3;
                        }
                    }
                } else {
                    try {
                        gy8.z();
                    } catch (Throwable th4) {
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                        Iterator it4 = u7d.a.iterator();
                        while (it4.hasNext()) {
                            ((r4a) it4.next()).getClass();
                            r4a.a(th4);
                        }
                        int s4 = au1.s(k7d.a);
                        if (s4 != 0) {
                            if (s4 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th4;
                        }
                    }
                }
            }
        }
        return new gf9(fx8, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf9)) {
            return false;
        }
        gf9 gf9 = (gf9) obj;
        return tpa.f(this.c, gf9.c) && tpa.f(this.o, gf9.o);
    }

    public final int hashCode() {
        int i = 0;
        fx8 fx8 = this.c;
        int hashCode = (fx8 == null ? 0 : fx8.hashCode()) * 31;
        String str = this.o;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Response(reactionInfo=" + this.c + ", error=" + this.o + ")";
    }
}
