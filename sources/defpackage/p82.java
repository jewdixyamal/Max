package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.Continuation;

/* renamed from: p82  reason: default package */
public final class p82 {
    public static final v00 I = new v00(9);
    public static final v00 J = new v00(10);
    public static final EnumSet K;
    public static final EnumSet L;
    public static final EnumSet M;
    public static final un0 N = new un0(16);
    public final rm4 A;
    public final rm4 B;
    public final je7 C;
    public final rm4 D;
    public final q0e E = r0e.a((Object) null);
    public final us F = new qpd(0);
    public o82 G;
    public final ReentrantLock H = new ReentrantLock();
    public e52 a = null;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    public final ConcurrentHashMap h = new ConcurrentHashMap();
    public volatile boolean i = false;
    public final fb3 j = new fb3();
    public final Set k = Collections.synchronizedSet(new HashSet());
    public final rm4 l;
    public final av0 m;
    public final m7b n;
    public final rm4 o;
    public final rm4 p;
    public final rm4 q;
    public final rm4 r;
    public final rm4 s;
    public final rm4 t;
    public final ztc u;
    public final rm4 v;
    public final rm4 w;
    public final rm4 x;
    public final ztc y;
    public final ztc z;

    static {
        i92 i92 = i92.a;
        i92 i922 = i92.b;
        K = EnumSet.of(i92, new i92[]{i922, i92.c, i92.X, i92.o, i92.Y, i92.Z});
        L = EnumSet.of(i92, i922);
        M = EnumSet.of(i92);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [qpd, us] */
    public p82(rm4 rm4, av0 av0, m7b m7b, rm4 rm42, rm4 rm43, rm4 rm44, rm4 rm45, rm4 rm46, rm4 rm47, ztc ztc, rm4 rm48, rm4 rm49, rm4 rm410, rm4 rm411, ztc ztc2, ztc ztc3, rm4 rm412, rm4 rm413, je7 je7) {
        this.l = rm4;
        this.m = av0;
        this.n = m7b;
        this.o = rm42;
        this.D = rm411;
        this.p = rm43;
        this.q = rm44;
        this.r = rm45;
        this.s = rm46;
        this.t = rm47;
        this.u = ztc;
        this.v = rm48;
        this.w = rm49;
        this.x = rm410;
        this.y = ztc2;
        this.z = ztc3;
        this.A = rm412;
        this.B = rm413;
        this.C = je7;
    }

    public static x82 H(u82 u82, Set set) {
        if (b10.D0.equals(set)) {
            x82 x82 = u82.q;
            return x82 != null ? x82 : x82.g;
        } else if (b10.E0.equals(set)) {
            x82 x822 = u82.r;
            return x822 != null ? x822 : x82.g;
        } else if (b10.F0.equals(set)) {
            x82 x823 = u82.s;
            return x823 != null ? x823 : x82.g;
        } else if (b10.G0.equals(set)) {
            x82 x824 = u82.t;
            return x824 != null ? x824 : x82.g;
        } else if (b10.H0.equals(set)) {
            x82 x825 = u82.u;
            return x825 != null ? x825 : x82.g;
        } else if (b10.I0.equals(set)) {
            x82 x826 = u82.v;
            return x826 != null ? x826 : x82.g;
        } else if (b10.J0.equals(set)) {
            x82 x827 = u82.w;
            return x827 != null ? x827 : x82.g;
        } else {
            x82 x828 = x82.f;
            return new x82((d92) null, 0, 0, 0, Collections.emptyList());
        }
    }

    public static x82 I(k92 k92, Set set) {
        if (b10.D0.equals(set)) {
            x82 x82 = k92.q;
            return x82 != null ? x82 : x82.g;
        } else if (b10.E0.equals(set)) {
            x82 x822 = k92.r;
            return x822 != null ? x822 : x82.g;
        } else if (b10.F0.equals(set)) {
            x82 x823 = k92.s;
            return x823 != null ? x823 : x82.g;
        } else if (b10.G0.equals(set)) {
            x82 x824 = k92.t;
            return x824 != null ? x824 : x82.g;
        } else if (b10.H0.equals(set)) {
            x82 x825 = k92.u;
            return x825 != null ? x825 : x82.g;
        } else if (b10.I0.equals(set)) {
            x82 x826 = k92.v;
            return x826 != null ? x826 : x82.g;
        } else if (b10.J0.equals(set)) {
            x82 x827 = k92.w;
            return x827 != null ? x827 : x82.g;
        } else {
            x82 x828 = x82.f;
            return new x82((d92) null, 0, 0, 0, Collections.emptyList());
        }
    }

    public static boolean L(k92 k92, Set set) {
        if (b10.D0.equals(set)) {
            return k92.q != null;
        }
        if (b10.E0.equals(set)) {
            return k92.r != null;
        }
        if (b10.F0.equals(set)) {
            return k92.s != null;
        }
        if (b10.G0.equals(set)) {
            return k92.t != null;
        }
        if (b10.H0.equals(set)) {
            return k92.u != null;
        }
        if (b10.I0.equals(set)) {
            return k92.v != null;
        }
        if (b10.J0.equals(set)) {
            return k92.w != null;
        }
        return false;
    }

    public static void a0(u82 u82, Set set, x82 x82) {
        if (b10.D0.equals(set)) {
            u82.q = x82;
        } else if (b10.E0.equals(set)) {
            u82.r = x82;
        } else if (b10.F0.equals(set)) {
            u82.s = x82;
        } else if (b10.G0.equals(set)) {
            u82.t = x82;
        } else if (b10.H0.equals(set)) {
            u82.u = x82;
        } else if (b10.I0.equals(set)) {
            u82.v = x82;
        } else if (b10.J0.equals(set)) {
            u82.w = x82;
        }
    }

    public static void l0(u82 u82, cu8 cu8) {
        if (!cu8.o()) {
            u82.j = cu8.b;
            long j2 = u82.k;
            long j3 = cu8.o;
            if (j3 > j2) {
                u82.k = j3;
                return;
            }
            long j4 = cu8.w0;
            if (j4 > j2) {
                u82.k = j4;
            }
        }
    }

    public static boolean m(e52 e52, EnumSet enumSet, boolean z2, qe5 qe5) {
        k92 k92 = e52.b;
        if (k92.b == j92.c) {
            if (e52.I() && !e52.h0() && k92.a().e == 0) {
                return false;
            }
            if (z2) {
                boolean z3 = ((se5) qe5).t() && (e52.y() || e52.d0() || oag.s(e52.e(e52.Y), 512));
                if ((e52.x() || z3) && e52.C()) {
                    return true;
                }
            } else if (e52.c0()) {
                return true;
            }
            return false;
        } else if (!z2 && e52.J() && e52.e0() && !e52.d0() && e52.L()) {
            return true;
        } else {
            if (!e52.J() || e52.e0() || !e52.C() || k92.a().e != 0) {
                return enumSet.contains(k92.c);
            }
            return false;
        }
    }

    public static void q(u82 u82) {
        b92 b92 = u82.p;
        if (b92 == null) {
            b92 = b92.h;
        }
        a92 a2 = b92.a();
        a2.e = 0;
        u82.p = new b92(a2);
    }

    public static k92 t(long j2, long j3, int i2, long j4, Map map, long j5, int i3, long j6, long j7, w4d w4d) {
        u82 u82 = new u82();
        u82 u822 = u82;
        u(u82, j2, j3, i2, j4, map, j5, i3, j6, j7, "", "", w4d);
        return new k92(u822);
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.Object, s82] */
    public static void u(u82 u82, long j2, long j3, int i2, long j4, Map map, long j5, int i3, long j6, long j7, String str, String str2, w4d w4d) {
        j92 j92;
        c92 c92;
        u82 u822 = u82;
        long j8 = j2;
        long j9 = j3;
        int i4 = i2;
        long j10 = j4;
        w4d w4d2 = w4d;
        int i5 = 2;
        if (i4 == 2 || j9 != 0) {
            u822.l = j9;
        }
        if (i4 == 2 || j8 != 0) {
            u822.a = j8;
        }
        int s2 = au1.s(i2);
        if (s2 != 1) {
            j92 = j92.b;
            if (s2 != 2) {
                if (s2 == 3) {
                    j92 = j92.c;
                } else if (s2 == 4) {
                    j92 = j92.o;
                }
            }
        } else {
            j92 = j92.a;
        }
        u822.b = j92;
        if (i4 == 3) {
            u822.I = Collections.singletonList(Long.valueOf(j4));
            Long valueOf = Long.valueOf(j4);
            ? obj = new Object();
            obj.b = j10;
            obj.a = 2047;
            u82.e(Collections.singletonMap(valueOf, new t82(obj)));
        }
        if (i3 != 0) {
            if (au1.s(i3) == 1) {
                i5 = 1;
            }
            u822.r0 = i5;
        } else {
            u822.r0 = 2;
        }
        u822.c = i92.Z;
        u822.d = j10;
        u822.G = map.size();
        u82.d().putAll(map);
        u822.k = j5;
        u822.p0 = j6;
        u822.q0 = j7;
        u822.g = str;
        u822.h = str2;
        if (w4d2 != null) {
            long[] jArr = (long[]) w4d2.b;
            if (jArr.length > 0) {
                c92 = new c92(jArr);
                u822.D = c92;
            }
        }
        c92 = null;
        u822.D = c92;
    }

    public final l92 A(long j2) {
        l92 l92 = (l92) this.d.get(Long.valueOf(j2));
        return (l92 != null || this.i) ? l92 : X(j2);
    }

    public final l92 B(long j2) {
        l92 l92 = (l92) this.e.get(Long.valueOf(j2));
        return (l92 != null || this.i) ? l92 : ((k24) ((c34) this.l.get())).b.f(j2);
    }

    public final e52 C(long j2) {
        ConcurrentHashMap concurrentHashMap = this.f;
        e52 e52 = (e52) concurrentHashMap.get(Long.valueOf(j2));
        if (e52 != null) {
            return n(e52);
        }
        e();
        return n((e52) concurrentHashMap.get(Long.valueOf(j2)));
    }

    public final ArrayList D(EnumSet enumSet, boolean z2, c7b c7b) {
        boolean z3;
        e();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry value : this.f.entrySet()) {
            e52 e52 = (e52) value.getValue();
            if (c7b != null) {
                try {
                    z3 = c7b.test(e52);
                } catch (Exception unused) {
                }
                if (z3 && m(e52, enumSet, z2, ((p7b) this.n).e)) {
                    arrayList.add(e52);
                }
            }
            z3 = true;
            arrayList.add(e52);
        }
        return arrayList;
    }

    public final List E(Comparator comparator) {
        ArrayList x2 = x((un0) null);
        Collections.sort(x2, comparator);
        return Collections.unmodifiableList(x2);
    }

    public final e52 F(long j2) {
        return (e52) this.c.get(Long.valueOf(j2 ^ K()));
    }

    public final int G() {
        int i2 = 0;
        for (e52 e52 : this.f.values()) {
            if (e52.b.a().e != 0) {
                i2++;
            }
        }
        return i2;
    }

    public final ti9 J(long j2) {
        Long valueOf = Long.valueOf(j2);
        us usVar = this.F;
        Object obj = usVar.get(valueOf);
        if (obj == null) {
            obj = r0e.a((Object) null);
            usVar.put(valueOf, obj);
        }
        return (ti9) obj;
    }

    public final long K() {
        return ((p7b) this.n).a.t();
    }

    public final boolean M(long j2, v82 v82) {
        e52 C2 = C(j2);
        return C2 != null && C2.b.B.contains(v82);
    }

    public final cu8 N(long j2, fs8 fs8) {
        hm9.m("p82", "insertMessageIfNeeded", new Object[0]);
        cu8 cu8 = null;
        if (fs8 == null) {
            return null;
        }
        rm4 rm4 = this.s;
        cu8 j3 = ((au8) rm4.get()).j(j2, fs8.a);
        if (j3 != null) {
            return j3;
        }
        long j4 = fs8.Y;
        if (j4 != 0) {
            vlc vlc = ((k24) ((au8) rm4.get()).a).c;
            ru8 h2 = vlc.d().h(j2, j4);
            if (h2 != null) {
                cu8 = vlc.b(h2);
            }
            if (cu8 != null) {
                hm9.m("p82", "last message for chat %d founded by cid %d. Update it", Long.valueOf(j2), Long.valueOf(j4));
                vlc vlc2 = ((k24) ((c34) this.l.get())).c;
                oz7 oz7 = iu8.b;
                vlc2.o(fs8, j2, false, (vx8) null);
                ((au8) rm4.get()).w(cu8, iz7.g(fs8.s0, (vxc) this.q.get()));
                return ((au8) rm4.get()).q(cu8.b);
            }
        }
        hm9.m("p82", "insertMessageIfNeeded: insert message, cid = %d, chatId = %d, chatId = %d", Long.valueOf(j4), Long.valueOf(j2), Long.valueOf(fs8.b));
        return ((au8) rm4.get()).q(((au8) rm4.get()).f(j2, K(), fs8));
    }

    public final void O() {
        mpa mpa;
        e();
        if (!this.f.isEmpty()) {
            Iterator it = this.f.values().iterator();
            while (true) {
                boolean z2 = true;
                if (it.hasNext()) {
                    e52 e52 = (e52) it.next();
                    boolean z3 = e52.u0 != null;
                    boolean z4 = e52.v0 != null;
                    boolean z5 = e52.x0 != null;
                    if (e52.w0.get() == null) {
                        z2 = false;
                    }
                    e52.u0 = null;
                    e52.v0 = null;
                    e52.x0 = null;
                    e52.w0.set((Object) null);
                    if (z3) {
                        e52.k0();
                    }
                    if (z4) {
                        e52.j0();
                    }
                    if (z5) {
                        e52.l0();
                    }
                    if (z2 && (mpa = (mpa) e52.w0.updateAndGet(new c52(e52, 0))) != null) {
                        CharSequence charSequence = (CharSequence) mpa.b;
                    }
                } else {
                    this.m.c(new vz2(Collections.emptyList(), true));
                    return;
                }
            }
        }
    }

    public final boolean P(e52 e52) {
        e52 e522 = this.a;
        return e522 != null && e52.a == e522.a;
    }

    public final void Q(long j2) {
        e52 C2 = C(j2);
        if (C2 != null) {
            h(j2, false, new f9(this, 19, C2));
        }
        e52 i2 = i(j2, i92.b);
        long j3 = i2.b.a;
        ((sna) this.v.get()).getClass();
        sna.a(j3);
        k92 k92 = i2.b;
        long j4 = k92.a;
        k4a k4a = (k4a) ((pk) this.p.get());
        if (k4a.o(j2)) {
            k4a.w(k4a, new uc2(((p7b) k4a.y()).a.o(), j2, j4));
        }
        je7 je7 = this.C;
        if (je7.getValue() != null) {
            zb2 zb2 = (zb2) ((ta2) je7.getValue());
            zb2.getClass();
            j47.T(zb2.Z, (lx3) null, (vx3) null, new mb2(zb2, k92.a, (Continuation) null), 3);
        }
        vz2 vz2 = new vz2(Collections.singletonList(Long.valueOf(j2)), true);
        av0 av0 = this.m;
        av0.c(vz2);
        av0.c(new ue7(j2));
    }

    public final void R(long j2, u82 u82, cu8 cu8) {
        hm9.m("p82", "onControlMessage, chatId = %d, messageDb.event = %s", Long.valueOf(u82.a), cu8.f().a);
        q10 f2 = cu8.f();
        int ordinal = f2.a.ordinal();
        v82 v82 = v82.c;
        switch (ordinal) {
            case 1:
            case 2:
                Iterator it = f2.c.iterator();
                while (it.hasNext()) {
                    Long l2 = (Long) it.next();
                    if (!M(j2, v82)) {
                        u82.d().put(l2, 0L);
                    }
                }
                return;
            case 3:
                boolean M2 = M(j2, v82);
                long j3 = f2.b;
                if (!M2) {
                    u82.d().remove(Long.valueOf(j3));
                }
                if (j3 == K()) {
                    u82.c = i92.b;
                    return;
                }
                return;
            case 4:
                Map d2 = u82.d();
                long j4 = cu8.Y;
                d2.remove(Long.valueOf(j4));
                if (j4 == K()) {
                    u82.c = i92.o;
                    return;
                }
                return;
            case 5:
                if (!M(j2, v82.a)) {
                    u82.g = f2.d;
                    return;
                }
                return;
            case 6:
                if (!M(j2, v82.b)) {
                    u82.h = f2.f;
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final e52 S(long j2, long j3, cu8 cu8) {
        StringBuilder k2 = au1.k(j2, "onMsgSend, chatId = ", ", serverChatId = ");
        k2.append(j3);
        k2.append(", messageDb = ");
        k2.append(cu8);
        hm9.m("p82", k2.toString(), new Object[0]);
        return h(j2, true, new u72(this, j3, cu8, j2));
    }

    public final e52 T(long j2, boolean z2, cu8 cu8, boolean z3, long j3) {
        long j4 = j2;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            StringBuilder k2 = au1.k(j2, "onNotifMessage: chatId=", ",message=");
            k2.append(cu8.b);
            k2.append(",updateNewMessage=");
            k2.append(z3);
            ir6.d(us7, "p82", k2.toString(), (Throwable) null);
        } else {
            cu8 cu82 = cu8;
            boolean z4 = z3;
        }
        return h(j2, true, new r72(this, cu8, z2, z3, j2, j3));
    }

    public final void U(long j2, l92 l92) {
        this.d.put(Long.valueOf(j2), l92);
        k92 k92 = l92.c;
        long j3 = k92.a;
        if (j3 != 0 || k92.f(((p7b) this.n).a.t())) {
            this.e.put(Long.valueOf(j3), l92);
        }
        this.b.put(Long.valueOf(l92.c.l), l92);
    }

    public final void V(long j2, boolean z2) {
        hm9.m("p82", "removeFromFavorites: " + j2, new Object[0]);
        Z(j2, 0, z2);
    }

    public final void W(long j2, v82 v82) {
        if (M(j2, v82)) {
            h(j2, false, new h82(v82, 0));
        }
    }

    public final l92 X(long j2) {
        elc elc = ((k24) ((c34) this.l.get())).b;
        la2 e2 = elc.c().e(j2);
        if (e2 != null) {
            return elc.a(e2);
        }
        return null;
    }

    public final void Y(long j2, boolean z2) {
        hm9.m("p82", "setChatSubscribedToUpdates: chatId=%d, subscribed=%b", Long.valueOf(j2), Boolean.valueOf(z2));
        try {
            e52 e52 = (e52) e0((String) null, new x72((Object) this, j2, (Object) new d82(z2, 1), 2));
        } catch (Throwable th) {
            hm9.p("p82", "setChatSubscribedToUpdates fail!", th);
        }
    }

    public final void Z(long j2, long j3, boolean z2) {
        h(j2, false, new c10(j3, 3));
        if (z2) {
            ((k4a) ((pk) this.p.get())).r(j2);
        }
        this.m.c(new vz2(Collections.singletonList(Long.valueOf(j2)), true));
    }

    /* JADX WARNING: type inference failed for: r14v1, types: [qpd, java.util.Map] */
    /* JADX WARNING: type inference failed for: r13v0, types: [qpd, java.util.Map] */
    public final e52 b(j92 j92, List list, String str, String str2) {
        String str3;
        l92 l92;
        j92 j922 = j92;
        if (j922 == j92.a) {
            Long l2 = (Long) list.get(0);
            long longValue = l2.longValue();
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.X, "p82", ey8.h(longValue, "insertDialog contactId="), (Throwable) null);
            }
            long K2 = K();
            long K3 = K() ^ longValue;
            ? qpd = new qpd(2);
            qpd.put(Long.valueOf(K2), 0L);
            qpd.put(l2, 0L);
            str3 = "p82";
            k92 t2 = t(K3, K3, 2, K2, qpd, 0, 3, 0, 0, (w4d) null);
            e52 F2 = F(longValue);
            if (F2 != null) {
                ((k24) ((c34) this.l.get())).b.h(F2.a, t2);
                l92 = new l92(F2.a, F2.b);
            } else {
                l92 = new l92(((k24) ((c34) this.l.get())).b.e(t2), t2);
            }
        } else {
            List list2 = list;
            str3 = "p82";
            long K4 = K();
            long nanoTime = System.nanoTime();
            ? qpd2 = new qpd(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                qpd2.put((Long) it.next(), 0L);
            }
            qpd2.put(Long.valueOf(K4), 0L);
            u82 u82 = new u82();
            u(u82, 0, nanoTime, 3, K4, qpd2, 0, 3, 0, 0, str, str2, (w4d) null);
            k92 k92 = new k92(u82);
            l92 = new l92(((k24) ((c34) this.l.get())).b.e(k92), k92);
        }
        ir6 ir62 = hm9.m;
        if (ir62 != null && ir62.c()) {
            us7 us7 = us7.X;
            ir62.d(us7, str3, "add chat; chatId=" + l92.b + ",type=" + j922, (Throwable) null);
        }
        U(l92.b, l92);
        return h0(l92.b, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v66, resolved type: java.util.HashMap} */
    /* JADX WARNING: type inference failed for: r6v31, types: [java.lang.Object, k10] */
    /* JADX WARNING: type inference failed for: r2v67, types: [java.lang.Object, s82] */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        if (r9.l == r6) goto L_0x003c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x036a  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0388  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0477  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x048b  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x04aa  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x04bf  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x04d4  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x05a6  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x05c1  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0610  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0622  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0637  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x063a  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x06cb  */
    /* JADX WARNING: Removed duplicated region for block: B:247:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0251  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.e52 b0(defpackage.f52 r56, defpackage.xq2 r57) {
        /*
            r55 = this;
            r0 = r55
            r1 = r56
            r2 = r57
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[]{r56, r57}
            java.lang.String r5 = "p82"
            java.lang.String r6 = "storeChatFromServer, chat = %s, chatSettings = %s"
            defpackage.hm9.m(r5, r6, r4)
            long r6 = r1.a
            l92 r4 = r0.B(r6)
            if (r4 != 0) goto L_0x0058
            int r6 = r1.X0
            if (r6 != r3) goto L_0x0058
            long r6 = r1.u0
            java.util.concurrent.ConcurrentHashMap r4 = r0.b
            java.lang.Long r8 = java.lang.Long.valueOf(r6)
            java.lang.Object r8 = r4.get(r8)
            l92 r8 = (defpackage.l92) r8
            if (r8 == 0) goto L_0x003e
            k92 r9 = r8.c
            boolean r10 = r9.e()
            if (r10 == 0) goto L_0x003e
            long r9 = r9.l
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x003e
        L_0x003c:
            r4 = r8
            goto L_0x0058
        L_0x003e:
            rm4 r8 = r0.l
            java.lang.Object r8 = r8.get()
            c34 r8 = (defpackage.c34) r8
            k24 r8 = (defpackage.k24) r8
            elc r8 = r8.b
            l92 r8 = r8.g(r6)
            if (r8 == 0) goto L_0x003c
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r4.put(r6, r8)
            goto L_0x003c
        L_0x0058:
            if (r4 != 0) goto L_0x0063
            r55.e()
            long r6 = r1.a
            l92 r4 = r0.B(r6)
        L_0x0063:
            i92 r6 = defpackage.i92.Z
            if (r4 != 0) goto L_0x00bf
            long r12 = r1.a
            long r14 = r1.u0
            int r4 = r1.X0
            long r17 = r55.K()
            java.util.Map r11 = r1.o
            long r7 = r1.v0
            int r3 = r1.Y0
            long r9 = r1.V0
            r28 = r5
            r29 = r6
            long r5 = r1.W0
            w4d r2 = r1.E0
            r16 = r4
            r19 = r11
            r20 = r7
            r22 = r3
            r23 = r9
            r25 = r5
            r27 = r2
            k92 r2 = t(r12, r14, r16, r17, r19, r20, r22, r23, r25, r27)
            rm4 r3 = r0.l
            java.lang.Object r3 = r3.get()
            c34 r3 = (defpackage.c34) r3
            k24 r3 = (defpackage.k24) r3
            elc r3 = r3.b
            long r3 = r3.e(r2)
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r6 = "storeChatFromServer: insert chat, chatId = %d"
            r7 = r28
            defpackage.hm9.m(r7, r6, r5)
            l92 r5 = new l92
            r5.<init>(r3, r2)
            r0.U(r3, r5)
            r4 = r5
            r3 = r29
            r2 = 1
            goto L_0x00e7
        L_0x00bf:
            r7 = r5
            r29 = r6
            java.lang.String r2 = r1.b
            int r2 = defpackage.wg0.a(r2)
            r3 = 6
            if (r2 != r3) goto L_0x00e4
            long r2 = r1.u0
            r5 = 0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x00e4
            jef r2 = r1.N0
            if (r2 == 0) goto L_0x00e4
            byte r2 = r2.Y
            if (r2 == 0) goto L_0x00e4
            long r1 = r4.b
            r3 = r29
            r0.i(r1, r3)
            r0 = 0
            return r0
        L_0x00e4:
            r3 = r29
            r2 = 0
        L_0x00e7:
            long r5 = r4.b
            fs8 r8 = r1.t0
            cu8 r5 = r0.N(r5, r8)
            long r8 = r4.b
            fs8 r6 = r1.H0
            cu8 r6 = r0.N(r8, r6)
            long r13 = r4.b
            long r8 = r1.x0
            l92 r4 = r0.A(r13)
            if (r4 != 0) goto L_0x010c
            boolean r10 = r0.i
            if (r10 != 0) goto L_0x010c
            r55.e()
            l92 r4 = r0.A(r13)
        L_0x010c:
            if (r4 != 0) goto L_0x0133
            rm4 r0 = r0.o
            java.lang.Object r0 = r0.get()
            o45 r0 = (defpackage.o45) r0
            ru.ok.tamtam.exception.ChatNotFoundException r2 = new ru.ok.tamtam.exception.ChatNotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "chat "
            r3.<init>(r4)
            long r4 = r1.a
            java.lang.String r1 = " is not found"
            java.lang.String r1 = defpackage.zr6.k(r3, r4, r1)
            r2.<init>(r1)
            cba r0 = (defpackage.cba) r0
            r1 = 1
            r0.c(r2, r1)
            r8 = 0
            goto L_0x06d7
        L_0x0133:
            long r10 = r55.K()
            k92 r12 = r4.c
            u82 r15 = r12.h()
            int r12 = r1.X0
            int r12 = defpackage.au1.s(r12)
            r29 = r3
            j92 r3 = defpackage.j92.a
            r16 = r2
            r2 = 1
            if (r12 == r2) goto L_0x0162
            j92 r2 = defpackage.j92.b
            r19 = r2
            r2 = 2
            if (r12 == r2) goto L_0x0159
            r2 = 3
            if (r12 == r2) goto L_0x015f
            r2 = 4
            if (r12 == r2) goto L_0x015c
        L_0x0159:
            r2 = r19
            goto L_0x0163
        L_0x015c:
            j92 r2 = defpackage.j92.o
            goto L_0x0163
        L_0x015f:
            j92 r2 = defpackage.j92.c
            goto L_0x0163
        L_0x0162:
            r2 = r3
        L_0x0163:
            java.lang.String r12 = r1.b
            int r12 = defpackage.wg0.a(r12)
            int r12 = defpackage.au1.s(r12)
            i92 r19 = defpackage.i92.a
            i92 r20 = defpackage.i92.b
            i92 r21 = defpackage.i92.o
            r22 = r3
            i92 r3 = defpackage.i92.X
            if (r12 == 0) goto L_0x01a8
            r23 = r3
            r3 = 1
            if (r12 == r3) goto L_0x01a3
            r3 = 2
            if (r12 == r3) goto L_0x019e
            r3 = 3
            if (r12 == r3) goto L_0x0199
            r3 = 4
            if (r12 == r3) goto L_0x0194
            r3 = 5
            if (r12 == r3) goto L_0x018f
        L_0x018a:
            r24 = r10
            r3 = r19
            goto L_0x01ab
        L_0x018f:
            r24 = r10
            r3 = r29
            goto L_0x01ab
        L_0x0194:
            i92 r3 = defpackage.i92.Y
            r24 = r10
            goto L_0x01ab
        L_0x0199:
            r24 = r10
            r3 = r23
            goto L_0x01ab
        L_0x019e:
            r24 = r10
            r3 = r21
            goto L_0x01ab
        L_0x01a3:
            r24 = r10
            r3 = r20
            goto L_0x01ab
        L_0x01a8:
            r23 = r3
            goto L_0x018a
        L_0x01ab:
            long r10 = r1.a
            r15.a = r10
            r15.b = r2
            r15.c = r3
            long r2 = r1.c
            r15.d = r2
            java.util.List r2 = r15.c()
            v82 r3 = defpackage.v82.a
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x01d1
            java.lang.String r2 = r1.Y
            boolean r3 = defpackage.oag.t(r2)
            if (r3 != 0) goto L_0x01ce
            r15.g = r2
            goto L_0x01d1
        L_0x01ce:
            r2 = 0
            r15.g = r2
        L_0x01d1:
            java.util.List r2 = r15.c()
            v82 r3 = defpackage.v82.b
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x01f9
            java.lang.String r2 = r1.Z
            boolean r3 = defpackage.oag.t(r2)
            if (r3 != 0) goto L_0x01e9
            r15.h = r2
            r2 = 0
            goto L_0x01ec
        L_0x01e9:
            r2 = 0
            r15.h = r2
        L_0x01ec:
            java.lang.String r3 = r1.s0
            boolean r10 = defpackage.oag.t(r3)
            if (r10 != 0) goto L_0x01f7
            r15.i = r3
            goto L_0x01f9
        L_0x01f7:
            r15.i = r2
        L_0x01f9:
            long r2 = r15.k
            long r10 = r1.v0
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0203
            r15.k = r10
        L_0x0203:
            long r2 = r1.L0
            r15.P = r2
            long r2 = r1.X
            r15.f = r2
            long r2 = r1.u0
            r15.l = r2
            java.util.Map r2 = r1.o
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x0241
            java.util.List r3 = r15.c()
            v82 r10 = defpackage.v82.c
            boolean r3 = r3.contains(r10)
            if (r3 != 0) goto L_0x0232
            java.util.Map r3 = r15.d()
            r3.clear()
            java.util.Map r3 = r15.d()
            r3.putAll(r2)
            goto L_0x024d
        L_0x0232:
            java.util.Map r3 = r15.d()
            r3.clear()
            java.util.Map r3 = r15.d()
            r3.putAll(r2)
            goto L_0x024d
        L_0x0241:
            int r2 = r1.X0
            r3 = 4
            if (r2 != r3) goto L_0x024d
            java.util.Map r2 = r15.d()
            r2.clear()
        L_0x024d:
            int r2 = r1.Y0
            if (r2 == 0) goto L_0x025e
            int r2 = defpackage.au1.s(r2)
            r3 = 1
            if (r2 == r3) goto L_0x025a
            r2 = 2
            goto L_0x025b
        L_0x025a:
            r2 = 1
        L_0x025b:
            r15.r0 = r2
            goto L_0x0261
        L_0x025e:
            r2 = 2
            r15.r0 = r2
        L_0x0261:
            java.lang.String r2 = r1.D0
            r15.E = r2
            int r2 = r1.y0
            r15.G = r2
            java.lang.String r2 = r1.z0
            r15.H = r2
            java.util.List r2 = r1.A0
            r15.I = r2
            java.util.Map r2 = r1.M0
            if (r2 == 0) goto L_0x027b
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0280
        L_0x027b:
            r27 = r6
            r28 = r7
            goto L_0x02d2
        L_0x0280:
            java.util.HashMap r3 = new java.util.HashMap
            int r10 = r2.size()
            r3.<init>(r10)
            java.util.Set r10 = r2.keySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x0291:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x02cd
            java.lang.Object r11 = r10.next()
            java.lang.Long r11 = (java.lang.Long) r11
            java.lang.Object r12 = r2.get(r11)
            ca r12 = (defpackage.ca) r12
            r26 = r2
            s82 r2 = new s82
            r2.<init>()
            r27 = r6
            r28 = r7
            long r6 = r12.a
            r2.b = r6
            int r6 = r12.b
            r2.a = r6
            long r6 = r12.c
            r2.c = r6
            java.lang.String r6 = r12.d
            r2.d = r6
            t82 r6 = new t82
            r6.<init>(r2)
            r3.put(r11, r6)
            r2 = r26
            r6 = r27
            r7 = r28
            goto L_0x0291
        L_0x02cd:
            r27 = r6
            r28 = r7
            goto L_0x02d6
        L_0x02d2:
            java.util.Map r3 = java.util.Collections.emptyMap()
        L_0x02d6:
            r15.e(r3)
            int r2 = r1.B0
            r15.J = r2
            km2 r2 = r1.C0
            if (r2 != 0) goto L_0x02e5
            r39 = r13
            r3 = 0
            goto L_0x0312
        L_0x02e5:
            z82 r3 = new z82
            boolean r6 = r2.g
            boolean r7 = r2.h
            boolean r10 = r2.a
            boolean r11 = r2.b
            boolean r12 = r2.c
            r39 = r13
            boolean r13 = r2.d
            boolean r14 = r2.e
            boolean r0 = r2.i
            boolean r2 = r2.j
            r29 = r3
            r30 = r10
            r31 = r11
            r32 = r12
            r33 = r13
            r34 = r14
            r35 = r6
            r36 = r7
            r37 = r0
            r38 = r2
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38)
        L_0x0312:
            r15.K = r3
            w4d r0 = r1.E0
            if (r0 == 0) goto L_0x0325
            java.lang.Object r0 = r0.b
            long[] r0 = (long[]) r0
            int r2 = r0.length
            if (r2 <= 0) goto L_0x0325
            c92 r2 = new c92
            r2.<init>(r0)
            goto L_0x0326
        L_0x0325:
            r2 = 0
        L_0x0326:
            r15.D = r2
            fm5 r0 = new fm5
            int r2 = r1.F0
            r3 = 2
            r0.<init>(r2, r3)
            r15.F = r0
            dh6 r0 = r1.G0
            if (r0 == 0) goto L_0x036a
            f92 r2 = new f92
            long r6 = r0.a
            boolean r10 = r0.b
            boolean r11 = r0.c
            boolean r12 = r0.o
            java.lang.String r13 = r0.X
            java.lang.String r14 = r0.Y
            boolean r3 = r0.Z
            r29 = r8
            boolean r8 = r0.s0
            int r9 = r0.t0
            eh6 r0 = r0.u0
            r41 = r2
            r42 = r6
            r44 = r10
            r45 = r11
            r46 = r12
            r47 = r13
            r48 = r14
            r49 = r3
            r50 = r8
            r51 = r9
            r52 = r0
            r41.<init>(r42, r44, r45, r46, r47, r48, r49, r50, r51, r52)
            r15.C = r2
            goto L_0x036c
        L_0x036a:
            r29 = r8
        L_0x036c:
            java.util.List r0 = r15.c()
            v82 r2 = defpackage.v82.o
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x037c
            boolean r0 = r1.I0
            r15.M = r0
        L_0x037c:
            boolean r0 = r1.J0
            r15.N = r0
            boolean r0 = r1.K0
            r15.O = r0
            jef r0 = r1.N0
            if (r0 == 0) goto L_0x03b5
            byte r3 = r0.Y
            if (r3 == 0) goto L_0x0393
            r6 = 1
            if (r3 == r6) goto L_0x0391
            r3 = 1
            goto L_0x0394
        L_0x0391:
            r3 = 3
            goto L_0x0394
        L_0x0393:
            r3 = 2
        L_0x0394:
            k10 r6 = new k10
            r6.<init>()
            java.lang.String r7 = r0.a
            r6.a = r7
            long r7 = r0.b
            r6.b = r7
            java.lang.String r7 = r0.c
            r6.c = r7
            int r7 = r0.o
            r6.d = r7
            java.util.List r0 = r0.X
            r6.e = r0
            r6.f = r3
            k10 r0 = new k10
            r0.<init>(r6)
            goto L_0x03b6
        L_0x03b5:
            r0 = 0
        L_0x03b6:
            r15.T = r0
            oq0 r0 = new oq0
            pq0 r3 = r1.O0
            boolean r6 = r3.a
            boolean r3 = r3.b
            r0.<init>((boolean) r6, (boolean) r3)
            r15.d0 = r0
            long r6 = r1.P0
            r15.e0 = r6
            java.util.Map r0 = r1.Q0
            r15.j0 = r0
            long r6 = r1.R0
            r15.k0 = r6
            long r6 = r1.T0
            r15.n0 = r6
            java.lang.String r0 = r1.U0
            r15.o0 = r0
            long r6 = r1.V0
            r15.p0 = r6
            long r6 = r1.W0
            r15.q0 = r6
            if (r5 == 0) goto L_0x048b
            long r6 = r5.o
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x03fd
            long r10 = r15.j
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x03f9
            k92 r0 = r4.c
            long r8 = r0.k
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x03fd
        L_0x03f9:
            long r8 = r5.b
            r15.j = r8
        L_0x03fd:
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r8 = 0
            int r3 = (r29 > r8 ? 1 : (r29 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x0439
            r3 = r55
            rm4 r5 = r3.s
            java.lang.Object r5 = r5.get()
            au8 r5 = (defpackage.au8) r5
            r8 = r29
            r13 = r39
            cu8 r5 = r5.j(r13, r8)
            if (r5 == 0) goto L_0x0436
            e92 r8 = r15.n
            long r9 = r5.o
            mg4 r5 = defpackage.mg4.REGULAR
            r11 = r6
            r29 = r13
            r13 = r5
            boolean r5 = defpackage.hm9.t(r8, r9, r11, r13)
            if (r5 == 0) goto L_0x0433
            java.lang.String r5 = "updateChatFromServer: prevMesssage found, extend its chunk"
            r13 = r28
            defpackage.hm9.m(r13, r5, new java.lang.Object[0])
            goto L_0x0444
        L_0x0433:
            r13 = r28
            goto L_0x043f
        L_0x0436:
            r29 = r13
            goto L_0x0433
        L_0x0439:
            r3 = r55
            r13 = r28
            r29 = r39
        L_0x043f:
            java.lang.String r5 = "updateChatFromServer: chunk for prevMessage not found"
            defpackage.hm9.m(r13, r5, new java.lang.Object[0])
        L_0x0444:
            int r5 = r1.X0
            r8 = 4
            if (r5 == r8) goto L_0x0496
            java.util.Map r5 = r15.d()
            java.lang.Long r8 = java.lang.Long.valueOf(r24)
            boolean r5 = r5.containsKey(r8)
            if (r5 == 0) goto L_0x0496
            java.util.Map r5 = r15.d()
            java.lang.Long r8 = java.lang.Long.valueOf(r24)
            java.lang.Object r5 = r5.get(r8)
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto L_0x0471
            long r8 = r5.longValue()
            r10 = 0
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x0496
        L_0x0471:
            long r8 = r1.L0
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x047b
            r8 = 1
            long r8 = r6 - r8
        L_0x047b:
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            java.util.Map r6 = r15.d()
            java.lang.Long r7 = java.lang.Long.valueOf(r24)
            r6.put(r7, r5)
            goto L_0x0496
        L_0x048b:
            r3 = r55
            r13 = r28
            r29 = r39
            r5 = 0
            r15.j = r5
            r0 = 0
        L_0x0496:
            e92 r5 = r15.n
            mg4 r11 = defpackage.mg4.DELAYED
            r6 = 0
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r24 = r8
            r10 = r11
            boolean r5 = defpackage.hm9.t(r5, r6, r8, r10)
            if (r5 != 0) goto L_0x04b1
            e92 r5 = r15.n
            r6 = r24
            defpackage.hm9.J(r5, r6, r11)
        L_0x04b1:
            int r5 = r1.w0
            r15.m = r5
            java.util.List r5 = r15.c()
            boolean r2 = r5.contains(r2)
            if (r2 != 0) goto L_0x04cc
            if (r27 == 0) goto L_0x04c8
            r2 = r27
            long r5 = r2.b
            r15.L = r5
            goto L_0x04cc
        L_0x04c8:
            r5 = 0
            r15.L = r5
        L_0x04cc:
            k92 r2 = r4.c
            i92 r2 = r2.c
            i92 r5 = r15.c
            if (r2 == r5) goto L_0x0590
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "handleChatStatus, chatId = "
            r2.<init>(r5)
            long r5 = r15.a
            r2.append(r5)
            java.lang.String r5 = ", status = "
            r2.append(r5)
            i92 r5 = r15.c
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            defpackage.hm9.m(r13, r2, new java.lang.Object[0])
            i92 r2 = r15.c
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x0538
            r5 = 1
            if (r2 == r5) goto L_0x0520
            r5 = 3
            if (r2 == r5) goto L_0x0516
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "chat status = "
            r2.<init>(r5)
            i92 r5 = r15.c
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            defpackage.hm9.m(r13, r2, new java.lang.Object[0])
            i92 r2 = r15.c
            r5 = r2
            goto L_0x0550
        L_0x0516:
            q(r15)
            r5 = 0
            r15.x = r5
            r5 = r21
            goto L_0x0550
        L_0x0520:
            r5 = 0
            q(r15)
            r15.x = r5
            k92 r2 = r4.c
            i92 r2 = r2.c
            r5 = r23
            if (r2 != r5) goto L_0x0530
            goto L_0x0550
        L_0x0530:
            i92 r5 = defpackage.i92.c
            if (r2 != r5) goto L_0x0535
            goto L_0x0550
        L_0x0535:
            r5 = r20
            goto L_0x0550
        L_0x0538:
            r5 = r23
            k92 r2 = r4.c
            i92 r6 = r2.c
            if (r6 != r5) goto L_0x054e
            j92 r6 = r2.b
            r7 = r22
            if (r6 != r7) goto L_0x0550
            long r6 = r2.k
            long r8 = r15.k
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x0550
        L_0x054e:
            r5 = r19
        L_0x0550:
            k92 r2 = r4.c
            long r6 = r2.f
            long r8 = r15.f
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x057d
            java.lang.String r2 = "created time is not the same, mark messages as deleted"
            defpackage.hm9.m(r13, r2, new java.lang.Object[0])
            long r6 = r15.f
            long r8 = r4.b
            int r2 = r3.r(r8, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "created_issue: removed "
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r2 = " messages"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            defpackage.hm9.m(r13, r2, new java.lang.Object[0])
        L_0x057d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "new chat status = "
            r2.<init>(r6)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            defpackage.hm9.m(r13, r2, new java.lang.Object[0])
            r15.c = r5
        L_0x0590:
            k92 r2 = r4.c
            long r5 = r2.U
            r15.U = r5
            int r5 = r2.V
            r15.V = r5
            long r5 = r2.W
            r15.W = r5
            int r5 = r2.X
            r15.X = r5
            w4d r5 = r1.E0
            if (r5 == 0) goto L_0x05b3
            java.lang.Object r5 = r5.b
            long[] r5 = (long[]) r5
            int r6 = r5.length
            if (r6 <= 0) goto L_0x05b3
            c92 r6 = new c92
            r6.<init>(r5)
            goto L_0x05b4
        L_0x05b3:
            r6 = 0
        L_0x05b4:
            r15.D = r6
            r5 = 0
            r15.m0 = r5
            long r5 = r2.f
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x0608
            long r7 = r15.f
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x0608
            e92 r2 = r15.n
            mg4 r5 = defpackage.mg4.REGULAR
            java.util.ArrayList r2 = defpackage.hm9.h(r2, r7, r5)
            e92 r6 = r15.n
            java.util.ArrayList r6 = r6.d(r5)
            r6.clear()
            defpackage.e92.e(r5)
            e92 r6 = r15.n
            java.util.ArrayList r6 = r6.d(r5)
            r6.addAll(r2)
            defpackage.e92.e(r5)
            av0 r2 = r3.m
            re9 r6 = new re9
            long r11 = r15.f
            r17 = 0
            r8 = r6
            r9 = r29
            r19 = r11
            r11 = r17
            r7 = r13
            r53 = r29
            r13 = r19
            r28 = r7
            r7 = r15
            r15 = r5
            r8.<init>(r9, r11, r13, r15)
            r2.c(r6)
        L_0x0605:
            r2 = r57
            goto L_0x060e
        L_0x0608:
            r28 = r13
            r7 = r15
            r53 = r29
            goto L_0x0605
        L_0x060e:
            if (r2 == 0) goto L_0x061c
            k92 r4 = r4.c
            b92 r4 = r4.a()
            b92 r2 = defpackage.iz7.i(r2, r4)
            r7.p = r2
        L_0x061c:
            boolean r1 = r1.S0
            r7.l0 = r1
            if (r0 == 0) goto L_0x062d
            e92 r1 = r7.n
            long r4 = r0.longValue()
            mg4 r0 = defpackage.mg4.REGULAR
            defpackage.hm9.J(r1, r4, r0)
        L_0x062d:
            long r0 = r7.n0
            java.lang.String r2 = r7.o0
            boolean r4 = defpackage.oag.t(r2)
            if (r4 == 0) goto L_0x063a
            r5 = r53
            goto L_0x06a8
        L_0x063a:
            rm4 r4 = r3.s
            java.lang.Object r4 = r4.get()
            au8 r4 = (defpackage.au8) r4
            r5 = r53
            cu8 r4 = r4.j(r5, r0)
            if (r4 == 0) goto L_0x06a8
            ix8 r4 = r4.S0
            if (r4 == 0) goto L_0x064f
            goto L_0x06a8
        L_0x064f:
            ir6 r4 = defpackage.hm9.m
            if (r4 != 0) goto L_0x0654
            goto L_0x0679
        L_0x0654:
            boolean r8 = r4.c()
            if (r8 != 0) goto L_0x065b
            goto L_0x0679
        L_0x065b:
            us7 r8 = defpackage.us7.X
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "updateMessageReactionIfPresent: adding first reaction="
            r9.<init>(r10)
            r9.append(r2)
            java.lang.String r10 = " for message with serverId="
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r11 = r28
            r10 = 0
            r4.d(r8, r11, r9, r10)
        L_0x0679:
            rm4 r4 = r3.s
            java.lang.Object r4 = r4.get()
            au8 r4 = (defpackage.au8) r4
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            c6c r1 = new c6c
            d6c r8 = defpackage.d6c.EMOJI
            v5c r9 = new v5c
            r9.<init>(r2)
            r1.<init>(r8, r9)
            hx8 r2 = new hx8
            r8 = 1
            r2.<init>(r1, r8)
            java.util.List r1 = java.util.Collections.singletonList(r2)
            ix8 r2 = new ix8
            r9 = 0
            r2.<init>(r1, r8, r9)
            java.util.Map r0 = java.util.Collections.singletonMap(r0, r2)
            r4.h(r0)
        L_0x06a8:
            k92 r0 = new k92
            r0.<init>(r7)
            l92 r1 = new l92
            r1.<init>(r5, r0)
            r3.U(r5, r1)
            rm4 r1 = r3.l
            java.lang.Object r1 = r1.get()
            c34 r1 = (defpackage.c34) r1
            k24 r1 = (defpackage.k24) r1
            elc r1 = r1.b
            r1.h(r5, r0)
            r0 = 0
            e52 r8 = r3.h0(r5, r0)
            if (r16 == 0) goto L_0x06d7
            av0 r0 = r3.m
            i9 r1 = new i9
            long r2 = r8.a
            r1.<init>(r2)
            r0.c(r1)
        L_0x06d7:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p82.b0(f52, xq2):e52");
    }

    public final void c(long j2, v82 v82) {
        if (!M(j2, v82)) {
            h(j2, false, new h82(v82, 1));
        }
    }

    public final gi9 c0(List list) {
        return (gi9) e0("storeChatsFromServer", new id0((Object) this, (Object) list, (Object) null, 20));
    }

    public final void d(long j2, List list) {
        e52 C2 = C(j2);
        if (C2 != null) {
            h(j2, false, new z72(0, list));
            this.m.c(new vz2(Collections.singletonList(Long.valueOf(C2.a)), false));
        }
    }

    public final gi9 d0(List list, Map map) {
        return (gi9) e0("storeChatsFromServer", new id0((Object) this, (Object) list, (Object) map, 20));
    }

    public final void e() {
        if (!this.i) {
            f0("awaitLoading", new s72(this, 0));
        }
    }

    public final Object e0(String str, lde lde) {
        ir6 ir6;
        ir6 ir62;
        ir6 ir63;
        if (str != null) {
            ir6 ir64 = hm9.m;
            if (ir64 != null && ir64.c()) {
                us7 us7 = us7.X;
                ir64.d(us7, "p82", "syncSelf(" + str + ')', (Throwable) null);
            }
            if (this.H.isLocked() && (ir63 = hm9.m) != null && ir63.c()) {
                us7 us72 = us7.Z;
                StringBuilder m2 = au1.m("syncSelf(", str, "): self is locked! ");
                m2.append(this.H.getHoldCount());
                ir63.d(us72, "p82", m2.toString(), (Throwable) null);
            }
        }
        this.H.lock();
        try {
            Object obj = lde.get();
            this.H.unlock();
            if (!(str == null || (ir62 = hm9.m) == null || !ir62.c())) {
                ir62.d(us7.X, "p82", zr6.i("syncSelf(", str, "): unlocked"), (Throwable) null);
            }
            return obj;
        } catch (Throwable th) {
            this.H.unlock();
            if (!(str == null || (ir6 = hm9.m) == null || !ir6.c())) {
                ir6.d(us7.X, "p82", zr6.i("syncSelf(", str, "): unlocked"), (Throwable) null);
            }
            throw th;
        }
    }

    public final pa3 f() {
        fb3 fb3 = this.j;
        return (fb3.a.get() == fb3.X && fb3.c == null) ? wa3.a : fb3;
    }

    public final void f0(String str, Runnable runnable) {
        e0(str, new v02(5, runnable));
    }

    public final e52 g(l92 l92, cu8 cu8) {
        e52 b2 = ((ma2) this.x.get()).b(l92, cu8);
        f0((String) null, new w72(this, l92.b, b2, true));
        return b2;
    }

    public final void g0(long j2) {
        e52 C2 = C(j2);
        if (C2 != null) {
            l(0, C2);
            ((k4a) ((pk) this.p.get())).r(C2.a);
            je7 je7 = this.C;
            if (je7.getValue() != null) {
                long j3 = C2.b.a;
                zb2 zb2 = (zb2) ((ta2) je7.getValue());
                vxd vxd = zb2.H0;
                if (vxd != null) {
                    vxd.cancel((CancellationException) null);
                }
                sb2 sb2 = new sb2(zb2, (Continuation) null);
                zb2.H0 = j47.T(zb2.Z, zb2.Y, (vx3) null, sb2, 2);
            }
        }
    }

    public final e52 h(long j2, boolean z2, qj3 qj3) {
        if (A(j2) == null) {
            e();
        }
        l92 A2 = A(j2);
        if (A2 == null) {
            hm9.m("p82", "changeChatField: chat with id = " + j2 + " not found", new Object[0]);
            return null;
        }
        u82 h2 = A2.c.h();
        try {
            qj3.accept(h2);
            U(j2, new l92(j2, new k92(h2)));
            ((s8g) this.w.get()).a(new n9d(j2));
            return h0(j2, z2);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public final e52 h0(long j2, boolean z2) {
        cu8 j3;
        long j4 = j2;
        e52 C2 = C(j2);
        l92 A2 = A(j2);
        if (A2 == null) {
            throw new IllegalArgumentException(ey8.h(j4, "chat is null for #"));
        } else if (C2 == null || z2) {
            return g(A2, (cu8) null);
        } else {
            k92 k92 = A2.c;
            long j5 = k92.j;
            k92 k922 = C2.b;
            boolean z3 = false;
            boolean z4 = j5 == k922.j;
            boolean z5 = k92.L == k922.L;
            if (k92.j0 == k922.j0) {
                z3 = true;
            }
            if (!z4 || !z5 || !z3) {
                return g(A2, (cu8) null);
            }
            boolean G2 = C2.G();
            rm4 rm4 = this.x;
            es8 es8 = C2.c;
            e52 b2 = (!G2 || es8 != null || (j3 = ((au8) this.s.get()).j(j4, k92.j)) == null) ? null : ((ma2) rm4.get()).b(A2, j3);
            if (b2 == null) {
                b2 = ((ma2) rm4.get()).a(j2, ((p7b) this.n).a.t(), A2.c, es8, C2.o, C2.X);
                b2.o0((el3) this.r.get());
            }
            e52 e52 = b2;
            f0((String) null, new w72(this, j2, e52, true));
            return e52;
        }
    }

    public final e52 i(long j2, i92 i92) {
        return h(j2, false, new v02(6, i92));
    }

    public final void i0(long j2, long j3) {
        hm9.m("p82", "updateChatLastSearchClickTime: chatId=%d, chatSearchClickTime=%d", Long.valueOf(j2), Long.valueOf(j3));
        l92 A2 = A(j2);
        if (A2 == null) {
            return;
        }
        if (A2.c.Y < j3 || j3 == 0) {
            h(j2, false, new c10(j3, 5));
        }
    }

    public final void j(long j2, i92 i92) {
        hm9.m("p82", "changeDialogStatus, contactId = " + j2 + ", status = " + i92, new Object[0]);
        e52 F2 = F(j2);
        if (F2 != null) {
            long j3 = F2.a;
            i(j3, i92);
            this.m.c(new vz2(Collections.singletonList(Long.valueOf(j3)), true));
        }
    }

    public final void j0(long j2, k92 k92, long j3) {
        hm9.m("p82", "updateChatWriteTime: chatId=%d, chatWriteTime=%d", Long.valueOf(j2), Long.valueOf(j3));
        if (k92 != null && k92.Z < j3) {
            h(j2, false, new c10(j3, 9));
        }
    }

    public final void k(long j2, long j3, uaa uaa) {
        hm9.m("p82", "Change draft: %d, draft = %s draftUpdateTime = %d", Long.valueOf(j2), uaa, Long.valueOf(j3));
        e52 h2 = h(j2, false, new x72((Object) this, (Object) uaa, j3, 0));
        je7 je7 = this.C;
        if (je7.getValue() != null) {
            ((zb2) ((ta2) je7.getValue())).k(j2, h2);
        }
        this.m.c(new vz2(Collections.singletonList(Long.valueOf(j2)), true));
    }

    public final e52 k0(long j2, cu8 cu8, boolean z2) {
        if (cu8 != null && cu8.o()) {
            return C(j2);
        }
        hm9.m("p82", "updateLastMessage: chatId = " + j2 + ", messageDb = " + cu8 + ", force = " + z2, new Object[0]);
        return h(j2, true, new f82(this, cu8, z2, j2));
    }

    public final void l(long j2, e52 e52) {
        StringBuilder sb = new StringBuilder("changeMuteUntil, chatId = ");
        long j3 = e52.a;
        sb.append(j3);
        sb.append(", dontDisturbUntil = ");
        sb.append(j2);
        hm9.m("p82", sb.toString(), new Object[0]);
        h(j3, false, new c10(j2, 2));
        je7 je7 = this.C;
        if (je7.getValue() != null) {
            long j4 = e52.b.a;
            zb2 zb2 = (zb2) ((ta2) je7.getValue());
            vxd vxd = zb2.H0;
            if (vxd != null) {
                vxd.cancel((CancellationException) null);
            }
            sb2 sb2 = new sb2(zb2, (Continuation) null);
            zb2.H0 = j47.T(zb2.Z, zb2.Y, (vx3) null, sb2, 2);
        }
        this.m.c(new vz2(Collections.singletonList(Long.valueOf(j3)), false));
    }

    public final void m0(String str, long j2, long j3, long j4) {
        hm9.m("p82", "updateLastPushMessage %d", Long.valueOf(j2));
        long j5 = j2;
        e52 z2 = z(j2);
        if (z2 == null) {
            hm9.k0("p82", (Exception) null, "updateLastPushMessage: chat not found! %d", Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1));
            return;
        }
        v72 v72 = new v72(j3, str, j4);
        long j6 = z2.a;
        h(j6, true, v72);
        this.m.c(new vz2(Collections.singletonList(Long.valueOf(j6)), true));
    }

    public final e52 n(e52 e52) {
        if (e52 == null) {
            return null;
        }
        if (e52.c == null) {
            k92 k92 = e52.b;
            if (k92.j != 0) {
                l92 X = X(e52.a);
                cu8 q2 = ((au8) this.s.get()).q(k92.j);
                if (q2 == null) {
                    return e52;
                }
                hm9.m0("p82", "checkChat! lastMessage is null but chat.data.getLastMessageId() not 0", new Object[0]);
                ((cba) ((o45) this.o.get())).c(new Exception("check.chat.error"), false);
                U(X.b, X);
                return g(X, q2);
            }
        }
        return e52;
    }

    public final void n0(int i2, long j2) {
        hm9.m("p82", "updateNewMessages, chatId = " + j2 + ", count = " + i2, new Object[0]);
        h(j2, false, new hd0(i2, 3, this));
        this.m.c(new vz2(Collections.singletonList(Long.valueOf(j2)), false));
    }

    public final void o(long j2, long j3) {
        hm9.m("p82", "clearChatInternal: id=%d, time=%d", Long.valueOf(j2), Long.valueOf(j3));
        e52 C2 = C(j2);
        if (C2 != null) {
            long j4 = C2.b.a;
            ((sna) this.v.get()).getClass();
            sna.a(j4);
        }
        J(j2).setValue((Object) null);
        h(j2, false, new c10(1 + j3, 7));
        r(j2, j3);
        h(j2, false, new c10(j3, 6));
        re9 re9 = new re9(j2, 0, j3, mg4.REGULAR);
        av0 av0 = this.m;
        av0.c(re9);
        av0.c(new vz2(Collections.singletonList(Long.valueOf(j2)), false));
    }

    public final void o0(long j2) {
        hm9.m("p82", "updatePinMessage: chatId = %d", Long.valueOf(j2));
        h0(j2, true);
    }

    public final void p(long j2) {
        hm9.m("p82", "clearDraft, chatId = %d", Long.valueOf(j2));
        e52 C2 = C(j2);
        if (C2 == null) {
            hm9.k0("p82", (Exception) null, "clearDraft: chat is null", Arrays.copyOf(new Object[0], 0));
            return;
        }
        k(j2, C2.b.g0, (uaa) null);
    }

    public final e52 p0(long j2, long j3, long j4, int i2, boolean z2) {
        long j5 = j2;
        hm9.m("p82", "updateReadMark: chatId=%d, userId=%d, mark=%d, newMessages=%d, notifySelfReadMarkChangedListener=%b", Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Integer.valueOf(i2), Boolean.valueOf(z2));
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        e52 h2 = h(j5, false, new l82(this, j3, j4, i2, atomicBoolean, z2));
        if (atomicBoolean.get()) {
            rm4 rm4 = this.B;
            if (rm4.get() != null) {
                ((rw9) rm4.get()).e(j5, j4);
            }
        }
        return h2;
    }

    public final int r(long j2, long j3) {
        hm9.m("p82", "clearMessagesInChat id=%d, time=%d", Long.valueOf(j2), Long.valueOf(j3));
        au8 au8 = (au8) this.s.get();
        au8.getClass();
        int d2 = au8.d(j2, j3, mg4.REGULAR);
        v(j2, (u82) null, j3);
        w(j2);
        return d2;
    }

    public final void s() {
        if (this.i && !this.f.isEmpty()) {
            for (e52 e52 : this.f.values()) {
                e52.u0 = null;
                e52.v0 = null;
                e52.x0 = null;
                e52.w0.set((Object) null);
            }
            this.m.c(new vz2(Collections.emptyList(), true));
        }
    }

    public final void v(long j2, u82 u82, long j3) {
        if (j3 == Long.MAX_VALUE) {
            j3--;
        }
        cu8 r2 = ((au8) this.s.get()).r(j2, 1 + j3);
        hm9.m("p82", "findAndUpdateFirstMessage, chatId = %d, time = %s, message = %s", Long.valueOf(j2), nu0.G(Long.valueOf(j3)), r2);
        long j4 = 0;
        if (u82 == null) {
            if (r2 != null) {
                j4 = r2.b;
            }
            h(j2, false, new c10(j4, 4));
            return;
        }
        if (r2 != null) {
            j4 = r2.b;
        }
        u82.x = j4;
    }

    public final void w(long j2) {
        au8 au8 = (au8) this.s.get();
        au8.getClass();
        k0(j2, au8.p(j2, mg4.REGULAR), true);
    }

    public final ArrayList x(un0 un0) {
        return D(L, false, new lt1(((p7b) this.n).a.t(), (Object) un0, 1));
    }

    public final iqd y(long j2) {
        e52 e52 = (e52) this.f.get(Long.valueOf(j2));
        if (e52 != null) {
            return iqd.g(e52);
        }
        return new ib3(new q1a(2, new c82(this, j2, 0)), f()).m(this.y);
    }

    public final e52 z(long j2) {
        ConcurrentHashMap concurrentHashMap = this.g;
        e52 e52 = (e52) concurrentHashMap.get(Long.valueOf(j2));
        if (e52 != null) {
            return e52;
        }
        e();
        return (e52) concurrentHashMap.get(Long.valueOf(j2));
    }
}
