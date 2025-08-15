package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: yxc  reason: default package */
public final class yxc implements b66, iud, s43, py7, r2a {
    public static final yxc X = new yxc(3);
    public static final yxc Y = new yxc(4);
    public static final yxc Z = new yxc(4);
    public static final yxc b = new yxc(0);
    public static final yxc c = new yxc(1);
    public static final yxc o = new yxc(2);
    public static final yxc s0 = new yxc(5);
    public static final yxc t0 = new yxc(6);
    public final /* synthetic */ int a;

    public /* synthetic */ yxc(int i) {
        this.a = i;
    }

    public static final long c(long j, Long l) {
        if (l != null) {
            return j - l.longValue();
        }
        return -1;
    }

    public Map a(Map map) {
        return map == null ? new HashMap() : map;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 2:
                ztc ztc = (ztc) obj;
                return (ztc) ((jle) ((hle) sd3.g.getValue())).e.getValue();
            default:
                return qy9.j((List) obj);
        }
    }

    public gle w(gy8 gy8) {
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
        String str2 = null;
        String str3 = null;
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
                if (str.equals("url")) {
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
                } else if (str.equals("query_id")) {
                    try {
                        str3 = lz7.P(gy8);
                    } catch (Throwable th4) {
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                        Iterator it4 = u7d.a.iterator();
                        while (it4.hasNext()) {
                            ((r4a) it4.next()).getClass();
                            r4a.a(th4);
                        }
                        int s4 = au1.s(k7d.a);
                        if (s4 == 0) {
                            str3 = null;
                        } else if (s4 != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th4;
                        }
                    }
                } else {
                    try {
                        gy8.z();
                    } catch (Throwable th5) {
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                        Iterator it5 = u7d.a.iterator();
                        while (it5.hasNext()) {
                            ((r4a) it5.next()).getClass();
                            r4a.a(th5);
                        }
                        int s5 = au1.s(k7d.a);
                        if (s5 != 0) {
                            if (s5 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th5;
                        }
                    }
                }
            }
        }
        return new rxf(str2, str3);
    }
}
