package defpackage;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: g9c  reason: default package */
public final class g9c {
    public final long a;
    public final f9c b;
    public final String c;

    public g9c(long j, f9c f9c, String str) {
        this.a = j;
        this.b = f9c;
        this.c = str;
    }

    public static final g9c a(gy8 gy8) {
        int i;
        String str;
        Object obj;
        try {
            i = lz7.N(gy8);
        } catch (Throwable th) {
            Throwable th2 = th;
            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
            Iterator it = u7d.a.iterator();
            while (it.hasNext()) {
                ((r4a) it.next()).getClass();
                r4a.a(th2);
            }
            int s = au1.s(k7d.a);
            if (s == 0) {
                i = 0;
            } else if (s != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                throw th2;
            }
        }
        if (i == 0) {
            return null;
        }
        String str2 = null;
        long j = 0;
        f9c f9c = f9c.UNKNOWN;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                str = lz7.P(gy8);
            } catch (Throwable th3) {
                Throwable th4 = th3;
                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                Iterator it2 = u7d.a.iterator();
                while (it2.hasNext()) {
                    ((r4a) it2.next()).getClass();
                    r4a.a(th4);
                }
                int s2 = au1.s(k7d.a);
                if (s2 == 0) {
                    str = null;
                } else if (s2 != 1) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    throw th4;
                }
            }
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 3355) {
                    if (hashCode != 3575610) {
                        if (hashCode == 111972721 && str.equals("value")) {
                            try {
                                str2 = lz7.P(gy8);
                            } catch (Throwable th5) {
                                Throwable th6 = th5;
                                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th6);
                                Iterator it3 = u7d.a.iterator();
                                while (it3.hasNext()) {
                                    ((r4a) it3.next()).getClass();
                                    r4a.a(th6);
                                }
                                int s3 = au1.s(k7d.a);
                                if (s3 == 0) {
                                    str2 = null;
                                } else if (s3 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                } else {
                                    throw th6;
                                }
                            }
                        }
                    } else if (str.equals("type")) {
                        f9c = f9c.UNKNOWN;
                        try {
                            buc buc = f9c.b;
                            String P = lz7.P(gy8);
                            buc.getClass();
                            Iterator it4 = f9c.Z.iterator();
                            while (true) {
                                u1 u1Var = (u1) it4;
                                if (!u1Var.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = u1Var.next();
                                if (tpa.f(((f9c) obj).a, P)) {
                                    break;
                                }
                            }
                            f9c f9c2 = (f9c) obj;
                            if (f9c2 == null) {
                                f9c2 = f9c.UNKNOWN;
                            }
                            f9c = f9c2;
                        } catch (Throwable th7) {
                            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th7);
                            Iterator it5 = u7d.a.iterator();
                            while (it5.hasNext()) {
                                ((r4a) it5.next()).getClass();
                                r4a.a(th7);
                            }
                            int s4 = au1.s(k7d.a);
                            if (s4 != 0) {
                                if (s4 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th7;
                            }
                        }
                    }
                } else if (str.equals("id")) {
                    try {
                        j = lz7.M(gy8, 0);
                    } catch (Throwable th8) {
                        Throwable th9 = th8;
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th9);
                        Iterator it6 = u7d.a.iterator();
                        while (it6.hasNext()) {
                            ((r4a) it6.next()).getClass();
                            r4a.a(th9);
                        }
                        int s5 = au1.s(k7d.a);
                        if (s5 == 0) {
                            j = 0;
                        } else if (s5 != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th9;
                        }
                    }
                }
                try {
                    gy8.z();
                } catch (Throwable th10) {
                    Throwable th11 = th10;
                    hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th11);
                    Iterator it7 = u7d.a.iterator();
                    while (it7.hasNext()) {
                        ((r4a) it7.next()).getClass();
                        r4a.a(th11);
                    }
                    int s6 = au1.s(k7d.a);
                    if (s6 != 0) {
                        if (s6 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th11;
                    }
                }
            }
            gy8 gy82 = gy8;
        }
        if (j == 0 && f9c == f9c.UNKNOWN && str2 == null) {
            return null;
        }
        return new g9c(j, f9c, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9c)) {
            return false;
        }
        g9c g9c = (g9c) obj;
        return this.a == g9c.a && this.b == g9c.b && tpa.f(this.c, g9c.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecentEmojiItem(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", value=");
        return zr6.l(sb, this.c, ")");
    }
}
