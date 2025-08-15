package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: uq2  reason: default package */
public final class uq2 extends gle {
    public final Long X;
    public final List c;
    public final boolean o;

    public uq2(Long l, List list, boolean z) {
        this.c = list;
        this.o = z;
        this.X = l;
    }

    public static final uq2 c(gy8 gy8) {
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
        if (i == 0) {
            return null;
        }
        List list = nz4.a;
        Long l = null;
        boolean z = false;
        List list2 = list;
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
                int hashCode = str.hashCode();
                if (hashCode != -1950992144) {
                    if (hashCode != -1081306054) {
                        if (hashCode == 696739087 && str.equals("hasMore")) {
                            Boolean bool = Boolean.FALSE;
                            try {
                                bool = Boolean.valueOf(lz7.H(gy8));
                            } catch (Throwable th3) {
                                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                                Iterator it3 = u7d.a.iterator();
                                while (it3.hasNext()) {
                                    ((r4a) it3.next()).getClass();
                                    r4a.a(th3);
                                }
                                int s3 = au1.s(k7d.a);
                                if (s3 != 0) {
                                    if (s3 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th3;
                                }
                            }
                            z = bool.booleanValue();
                        }
                    } else if (str.equals("marker")) {
                        try {
                            long M = lz7.M(gy8, -1);
                            Long valueOf = Long.valueOf(M);
                            if (M < 0) {
                                valueOf = null;
                            }
                            l = valueOf;
                        } catch (Throwable th4) {
                            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                            Iterator it4 = u7d.a.iterator();
                            while (it4.hasNext()) {
                                ((r4a) it4.next()).getClass();
                                r4a.a(th4);
                            }
                            int s4 = au1.s(k7d.a);
                            if (s4 == 0) {
                                l = null;
                            } else if (s4 != 1) {
                                throw new NoWhenBranchMatchedException();
                            } else {
                                throw th4;
                            }
                        }
                    }
                } else if (str.equals("commonChats")) {
                    try {
                        list2 = wz.b(gy8);
                    } catch (Throwable th5) {
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                        Iterator it5 = u7d.a.iterator();
                        while (it5.hasNext()) {
                            ((r4a) it5.next()).getClass();
                            r4a.a(th5);
                        }
                        int s5 = au1.s(k7d.a);
                        if (s5 == 0) {
                            list2 = list;
                        } else if (s5 != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th5;
                        }
                    }
                }
                try {
                    gy8.z();
                } catch (Throwable th6) {
                    hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th6);
                    Iterator it6 = u7d.a.iterator();
                    while (it6.hasNext()) {
                        ((r4a) it6.next()).getClass();
                        r4a.a(th6);
                    }
                    int s6 = au1.s(k7d.a);
                    if (s6 != 0) {
                        if (s6 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th6;
                    }
                }
            }
        }
        return new uq2(l, list2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq2)) {
            return false;
        }
        uq2 uq2 = (uq2) obj;
        return tpa.f(this.c, uq2.c) && this.o == uq2.o && tpa.f(this.X, uq2.X);
    }

    public final int hashCode() {
        int d = ms2.d(this.c.hashCode() * 31, 31, this.o);
        Long l = this.X;
        return d + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "Response(commonChats=" + this.c + ", hasMore=" + this.o + ", marker=" + this.X + ")";
    }
}
