package defpackage;

import org.apache.http.cookie.ClientCookie;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: cu7  reason: default package */
public final class cu7 {
    public static final /* synthetic */ int G = 0;
    public final je7 A;
    public final je7 B;
    public final je7 C;
    public final je7 D;
    public final je7 E;
    public final je7 F;
    public final blb a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final je7 h;
    public final je7 i;
    public final je7 j;
    public final je7 k;
    public final je7 l;
    public final je7 m;
    public final je7 n;
    public final je7 o;
    public final je7 p;
    public final je7 q;
    public final je7 r;
    public final je7 s;
    public final je7 t;
    public final je7 u;
    public final je7 v;
    public final je7 w;
    public final je7 x;
    public final je7 y;
    public final je7 z;

    public cu7(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76, je7 je77, je7 je78, je7 je79, je7 je710, je7 je711, je7 je712, je7 je713, je7 je714, je7 je715, je7 je716, je7 je717, je7 je718, je7 je719, je7 je720, je7 je721, je7 je722, je7 je723, je7 je724, je7 je725, je7 je726, je7 je727, je7 je728, je7 je729, je7 je730, je7 je731, blb blb) {
        this.a = blb;
        this.b = je7;
        this.c = je72;
        this.d = je73;
        this.e = je74;
        this.f = je75;
        this.g = je76;
        this.h = je77;
        this.i = je78;
        this.j = je79;
        this.k = je710;
        this.l = je711;
        this.m = je712;
        this.n = je713;
        this.o = je714;
        this.p = je715;
        this.q = je716;
        this.r = je717;
        this.s = je718;
        this.t = je719;
        this.u = je720;
        this.v = je721;
        this.w = je722;
        this.x = je723;
        this.y = je724;
        this.z = je725;
        this.A = je726;
        this.B = je727;
        this.C = je728;
        this.D = je729;
        this.E = je730;
        this.F = je731;
    }

    public static final long a(lec lec) {
        int i2 = ft4.o;
        long S = z7.S(System.nanoTime(), kt4.NANOSECONDS);
        long g2 = ft4.g(S, lec.a);
        lec.a = S;
        return g2;
    }

    public final gj b() {
        return (gj) this.E.getValue();
    }

    public final t20 c() {
        return (t20) this.u.getValue();
    }

    public final ct1 d() {
        return (ct1) this.C.getValue();
    }

    public final p82 e() {
        return (p82) this.i.getValue();
    }

    public final ri4 f() {
        return (ri4) this.e.getValue();
    }

    public final sc5 g() {
        return (sc5) this.y.getValue();
    }

    public final js7 h() {
        return (js7) this.F.getValue();
    }

    public final af8 i() {
        return (af8) this.p.getValue();
    }

    public final xb9 j() {
        return (xb9) this.A.getValue();
    }

    public final bva k() {
        return (bva) this.s.getValue();
    }

    public final lva l() {
        return (lva) this.t.getValue();
    }

    public final w7b m() {
        return (w7b) this.l.getValue();
    }

    public final m9b n() {
        return (m9b) this.z.getValue();
    }

    public final s8g o() {
        return (s8g) this.m.getValue();
    }

    public final void p(kt7 kt7, long j2) {
        long j3;
        kt7 kt72;
        long j4 = ((p7b) ((m7b) this.d.getValue())).a.g.getLong("app.last.chat.marker", 0);
        Long valueOf = Long.valueOf(j4);
        if (j4 == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            j3 = valueOf.longValue();
            kt72 = kt7;
        } else {
            kt72 = kt7;
            j3 = Long.MAX_VALUE;
        }
        long j5 = kt72.v0;
        Long valueOf2 = Long.valueOf(j5);
        if (j5 == 0) {
            valueOf2 = null;
        }
        long min = Math.min(j3, valueOf2 != null ? valueOf2.longValue() : Long.MAX_VALUE);
        if (min != Long.MAX_VALUE && min > 0) {
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                us7 us7 = us7.X;
                z7d z7d = ((p7b) ((m7b) this.d.getValue())).b;
                z7d.getClass();
                StringBuilder k2 = au1.k(min, "api.chatsList(", ", ");
                k2.append(j2);
                k2.append(", ");
                k2.append((int) z7d.q(PmsKey.f25chatspagesize, (long) 50));
                k2.append(")");
                ir6.d(us7, "cu7", k2.toString(), (Throwable) null);
            } else {
                long j6 = j2;
            }
            z7d z7d2 = ((p7b) ((m7b) this.d.getValue())).b;
            z7d2.getClass();
            k4a k4a = (k4a) ((pk) this.b.getValue());
            ome.d(k4a.z(), new nt2((int) z7d2.q(PmsKey.f25chatspagesize, (long) 50), ((p7b) k4a.y()).a.o(), min, j2), false, 0, 12);
        }
    }

    public final void q() {
        long j2;
        t33 t33 = ((p7b) ((m7b) this.d.getValue())).a;
        long j3 = t33.g.getLong("app.reset.at.time", 0);
        String f2 = ((f5a) this.c.getValue()).f();
        long n2 = t33.n();
        if (j3 <= 0 || j3 >= n2 || f2 == null || f2.length() == 0) {
            k4a k4a = (k4a) ((pk) this.b.getValue());
            p7b p7b = (p7b) k4a.y();
            t33 t332 = p7b.a;
            long p2 = t332.p();
            long j4 = t332.g.getLong("user.contactsLastSync", 0);
            long f3 = t332.f("user.presenceLastSync", 0);
            String name = k4a.class.getName();
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                us7 us7 = us7.X;
                String G2 = nu0.G(Long.valueOf(p2));
                String G3 = nu0.G(Long.valueOf(j4));
                String G4 = nu0.G(Long.valueOf(f3));
                StringBuilder k2 = k7d.k("LoginTamTask: chatsLastSync = ", G2, ", contactLastSync = ", G3, ", presenceLastSync = ");
                k2.append(G4);
                ir6.d(us7, name, k2.toString(), (Throwable) null);
            }
            String w2 = p7b.b.w(pyc.a, (String) null);
            if (p7b.b.g.getInt(ClientCookie.VERSION_ATTR, 1) < 6) {
                p7b.b.k(6, ClientCookie.VERSION_ATTR);
                w2 = null;
                j2 = 0;
            } else {
                j2 = p2;
            }
            long o2 = ((p7b) k4a.y()).a.o();
            String f4 = ((f5a) k4a.d.getValue()).f();
            if (f4 != null) {
                k4a.v(k4a, new ht7(o2, f4, j2, j4, f3, w2, t332.g.getLong("user.callsLastSync", 0), t332.g.getLong("app.last.login.time", 0), t332.g.getLong("user.draftsLastSync", -1)));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        ir6 ir62 = hm9.m;
        if (ir62 != null && ir62.c()) {
            us7 us72 = us7.X;
            StringBuilder k3 = au1.k(j3, "Drop cache: resetAt=", ", lastLogin=");
            k3.append(n2);
            ir62.d(us72, "cu7", k3.toString(), (Throwable) null);
        }
        ((w9a) ((kke) this.B.getValue())).b().dispatch(hz4.a, new nn6(7, this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v16, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: q33} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v3, resolved type: q33} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v17, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: q33} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v20, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v23, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v21, resolved type: q33} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v14, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v15, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r9v63, types: [java.lang.Object, lec] */
    /* JADX WARNING: type inference failed for: r3v103, types: [q33] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03a9 A[SYNTHETIC, Splitter:B:147:0x03a9] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0442  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x044f  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0481  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x048e  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x04c8  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x04cb  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x04d4  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x04dd  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0582 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0583  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0596  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x05a3  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0654  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x066c  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x068c  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x078c  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x078e  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x07ab  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x07d1  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x07d3  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x07f0  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x08eb  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x08f4  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x091f  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x0961  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x0987  */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x09ad  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x09be  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x09c0  */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x09f8  */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x09fb  */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x09fe  */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0aca  */
    /* JADX WARNING: Removed duplicated region for block: B:434:0x09a1 A[EDGE_INSN: B:434:0x09a1->B:362:0x09a1 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object r(long r37, defpackage.kt7 r39, long r40, kotlin.coroutines.Continuation r42) {
        /*
            r36 = this;
            r1 = r36
            r2 = r39
            r3 = r40
            r0 = r42
            r5 = 3
            r6 = 1
            boolean r7 = r0 instanceof defpackage.zt7
            if (r7 == 0) goto L_0x001d
            r7 = r0
            zt7 r7 = (defpackage.zt7) r7
            int r8 = r7.B0
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r8 & r9
            if (r10 == 0) goto L_0x001d
            int r8 = r8 - r9
            r7.B0 = r8
            goto L_0x0022
        L_0x001d:
            zt7 r7 = new zt7
            r7.<init>(r1, r0)
        L_0x0022:
            java.lang.Object r0 = r7.z0
            tx3 r8 = defpackage.tx3.a
            int r9 = r7.B0
            r13 = 2
            java.lang.String r14 = "cu7"
            java.lang.String r11 = "onLogin#21("
            java.lang.String r12 = "onLogin#5.5("
            if (r9 == 0) goto L_0x00e3
            if (r9 == r6) goto L_0x009b
            if (r9 == r13) goto L_0x0063
            if (r9 != r5) goto L_0x005b
            int r1 = r7.y0
            long r2 = r7.v0
            boolean r4 = r7.x0
            long r8 = r7.u0
            r18 = r11
            long r10 = r7.t0
            gi9 r5 = r7.s0
            q33 r12 = r7.Z
            lec r13 = r7.Y
            kt7 r6 = r7.X
            cu7 r7 = r7.o
            defpackage.od2.a0(r0)
            r0 = r5
            r24 = r8
            r15 = r14
            r9 = r18
            r8 = r6
            r5 = r2
            r3 = 0
            goto L_0x0956
        L_0x005b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0063:
            r18 = r11
            int r1 = r7.y0
            long r2 = r7.w0
            boolean r4 = r7.x0
            long r9 = r7.v0
            long r11 = r7.u0
            long r5 = r7.t0
            gi9 r13 = r7.s0
            q33 r15 = r7.Z
            r36 = r1
            lec r1 = r7.Y
            r37 = r1
            kt7 r1 = r7.X
            r38 = r1
            cu7 r1 = r7.o
            defpackage.od2.a0(r0)
            r20 = r8
            r0 = r13
            r8 = r7
            r12 = r11
            r7 = r1
            r11 = r4
            r1 = r36
            r34 = r14
            r14 = r37
            r36 = r5
            r6 = r38
            r4 = r2
            r2 = r15
            r15 = r34
            goto L_0x0592
        L_0x009b:
            r18 = r11
            int r1 = r7.y0
            long r2 = r7.w0
            boolean r4 = r7.x0
            long r5 = r7.v0
            long r9 = r7.u0
            r11 = r1
            r36 = r2
            long r1 = r7.t0
            q33 r3 = r7.Z
            lec r13 = r7.Y
            kt7 r15 = r7.X
            r38 = r1
            cu7 r1 = r7.o
            defpackage.od2.a0(r0)     // Catch:{ all -> 0x00ca }
            r2 = r1
            r21 = r4
            r22 = r5
            r1 = r8
            r5 = r15
            r8 = r7
            r15 = r14
            r6 = r36
            r14 = r13
            r13 = r3
            r3 = r38
            goto L_0x039e
        L_0x00ca:
            r0 = move-exception
            r20 = r0
            r21 = r4
            r26 = r11
            r4 = r15
            r10 = r9
            r9 = r13
            r15 = r14
            r13 = r5
            r5 = r3
            r2 = r38
            r34 = r36
            r36 = r1
            r1 = r8
            r8 = r7
            r6 = r34
            goto L_0x043e
        L_0x00e3:
            r18 = r11
            defpackage.od2.a0(r0)
            ir6 r0 = defpackage.hm9.m
            if (r0 != 0) goto L_0x00ed
            goto L_0x0115
        L_0x00ed:
            boolean r5 = r0.c()
            if (r5 == 0) goto L_0x0115
            us7 r5 = defpackage.us7.X
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r3)
            java.lang.String r6 = defpackage.nu0.G(r6)
            long r9 = r2.v0
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r9)
            java.lang.String r9 = defpackage.nu0.G(r11)
            java.lang.String r10 = "onLogin#1: start, chatsLastSync = "
            java.lang.String r11 = ", chatMarker = "
            java.lang.String r6 = defpackage.rh4.k(r10, r6, r11, r9)
            r9 = 0
            r0.d(r5, r14, r6, r9)
        L_0x0115:
            int r0 = defpackage.ft4.o
            long r5 = java.lang.System.nanoTime()
            kt4 r0 = defpackage.kt4.NANOSECONDS
            long r5 = defpackage.z7.S(r5, r0)
            lec r9 = new lec
            r9.<init>()
            r9.a = r5
            ir6 r0 = defpackage.hm9.m
            if (r0 != 0) goto L_0x012f
        L_0x012c:
            r20 = r8
            goto L_0x0162
        L_0x012f:
            boolean r10 = r0.c()
            if (r10 == 0) goto L_0x012c
            us7 r10 = defpackage.us7.X
            long r20 = a(r9)
            java.lang.String r11 = defpackage.ft4.j(r20)
            le3 r13 = r2.t0
            if (r13 == 0) goto L_0x0145
            r13 = 1
            goto L_0x0146
        L_0x0145:
            r13 = 0
        L_0x0146:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r20 = r8
            java.lang.String r8 = "onLogin#2("
            r15.<init>(r8)
            r15.append(r11)
            java.lang.String r8 = "): notifConfigLogic.onConfiguration with config="
            r15.append(r8)
            r15.append(r13)
            java.lang.String r8 = r15.toString()
            r11 = 0
            r0.d(r10, r14, r8, r11)
        L_0x0162:
            le3 r0 = r2.t0
            if (r0 == 0) goto L_0x0172
            je7 r8 = r1.n
            java.lang.Object r8 = r8.getValue()
            ur9 r8 = (defpackage.ur9) r8
            r10 = 1
            r8.b(r0, r10)
        L_0x0172:
            ri4 r0 = r36.f()
            boolean r8 = r0.d()
            java.lang.String r0 = r2.Z
            ir6 r10 = defpackage.hm9.m
            if (r10 != 0) goto L_0x0185
        L_0x0180:
            r22 = r5
            r21 = r8
            goto L_0x01b4
        L_0x0185:
            boolean r11 = r10.c()
            if (r11 == 0) goto L_0x0180
            us7 r11 = defpackage.us7.X
            long r21 = a(r9)
            java.lang.String r13 = defpackage.ft4.j(r21)
            t7d r15 = defpackage.o84.Z
            r15.getClass()
            if (r0 == 0) goto L_0x01a3
            java.lang.String r15 = defpackage.pag.x(r0)
            r21 = r8
            goto L_0x01a6
        L_0x01a3:
            r21 = r8
            r15 = 0
        L_0x01a6:
            java.lang.String r8 = "onLogin#3("
            r22 = r5
            java.lang.String r5 = "): updateToken="
            java.lang.String r5 = defpackage.rh4.k(r8, r13, r5, r15)
            r6 = 0
            r10.d(r11, r14, r5, r6)
        L_0x01b4:
            if (r0 == 0) goto L_0x01c9
            int r5 = r0.length()
            if (r5 != 0) goto L_0x01bd
            goto L_0x01c9
        L_0x01bd:
            je7 r5 = r1.c
            java.lang.Object r5 = r5.getValue()
            f5a r5 = (defpackage.f5a) r5
            r6 = 0
            r5.h(r0, r6)
        L_0x01c9:
            je7 r0 = r1.d
            java.lang.Object r0 = r0.getValue()
            m7b r0 = (defpackage.m7b) r0
            p7b r0 = (defpackage.p7b) r0
            t33 r5 = r0.a
            nab r0 = r2.c
            if (r0 == 0) goto L_0x01e7
            wm3 r0 = r0.a
            if (r0 == 0) goto L_0x01e7
            long r10 = r0.a
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r10)
            r5.C(r0)
        L_0x01e7:
            long r10 = r2.s0
            long r24 = java.lang.System.currentTimeMillis()
            r8 = r7
            long r6 = r10 - r24
            r5.B(r6)
            long r6 = r2.y0
            r15 = 0
            int r0 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x01fe
            r5.A(r6)
        L_0x01fe:
            int r0 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x0204
            r6 = 1
            goto L_0x0205
        L_0x0204:
            r6 = 0
        L_0x0205:
            ir6 r0 = defpackage.hm9.m
            if (r0 != 0) goto L_0x020c
        L_0x0209:
            r24 = r10
            goto L_0x023b
        L_0x020c:
            boolean r7 = r0.c()
            if (r7 == 0) goto L_0x0209
            us7 r7 = defpackage.us7.X
            long r24 = a(r9)
            java.lang.String r13 = defpackage.ft4.j(r24)
            r24 = r10
            r15 = 1
            r10 = r6 ^ 1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r15 = "onLogin#4("
            r11.<init>(r15)
            r11.append(r13)
            java.lang.String r13 = "): attachmentsReadyLogic="
            r11.append(r13)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r11 = 0
            r0.d(r7, r14, r10, r11)
        L_0x023b:
            if (r6 != 0) goto L_0x0244
            t20 r0 = r36.c()
            r0.c()
        L_0x0244:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            nab r10 = r2.c
            if (r10 == 0) goto L_0x0259
            wm3 r10 = r10.a
            if (r10 == 0) goto L_0x0259
            r0.add(r10)
        L_0x0259:
            java.util.ArrayList r10 = r39.c()
            java.util.Iterator r10 = r10.iterator()
        L_0x0261:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x028a
            java.lang.Object r11 = r10.next()
            wm3 r11 = (defpackage.wm3) r11
            pq3 r13 = r11.s0
            r15 = -1
            if (r13 != 0) goto L_0x0274
            r13 = r15
            goto L_0x027c
        L_0x0274:
            int[] r26 = defpackage.yt7.$EnumSwitchMapping$0
            int r13 = r13.ordinal()
            r13 = r26[r13]
        L_0x027c:
            if (r13 == r15) goto L_0x0286
            r15 = 1
            if (r13 == r15) goto L_0x0282
            goto L_0x0261
        L_0x0282:
            r7.add(r11)
            goto L_0x0261
        L_0x0286:
            r0.add(r11)
            goto L_0x0261
        L_0x028a:
            ir6 r10 = defpackage.hm9.m
            if (r10 != 0) goto L_0x0291
        L_0x028e:
            r26 = r6
            goto L_0x02c1
        L_0x0291:
            boolean r11 = r10.c()
            if (r11 == 0) goto L_0x028e
            us7 r11 = defpackage.us7.X
            long r26 = a(r9)
            java.lang.String r13 = defpackage.ft4.j(r26)
            int r15 = r0.size()
            r26 = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r3 = "onLogin#5("
            r6.<init>(r3)
            r6.append(r13)
            java.lang.String r3 = "): ContactsController.onLogin contactsSize="
            r6.append(r3)
            r6.append(r15)
            java.lang.String r3 = r6.toString()
            r4 = 0
            r10.d(r11, r14, r3, r4)
        L_0x02c1:
            je7 r3 = r1.k
            java.lang.Object r3 = r3.getValue()
            el3 r3 = (defpackage.el3) r3
            r3.p(r0)
            ir6 r0 = defpackage.hm9.m
            if (r0 != 0) goto L_0x02d1
            goto L_0x02ff
        L_0x02d1:
            boolean r3 = r0.c()
            if (r3 == 0) goto L_0x02ff
            us7 r3 = defpackage.us7.X
            long r10 = a(r9)
            java.lang.String r4 = defpackage.ft4.j(r10)
            int r6 = r7.size()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "onLogin#5.1("
            r10.<init>(r11)
            r10.append(r4)
            java.lang.String r4 = "): ContactsController.storeRemovedContactsFromServer contactsSize="
            r10.append(r4)
            r10.append(r6)
            java.lang.String r4 = r10.toString()
            r6 = 0
            r0.d(r3, r14, r4, r6)
        L_0x02ff:
            je7 r0 = r1.k
            java.lang.Object r0 = r0.getValue()
            el3 r0 = (defpackage.el3) r0
            r0.v(r7)
            ir6 r0 = defpackage.hm9.m
            if (r0 != 0) goto L_0x030f
            goto L_0x032b
        L_0x030f:
            boolean r3 = r0.c()
            if (r3 == 0) goto L_0x032b
            us7 r3 = defpackage.us7.X
            long r6 = a(r9)
            java.lang.String r4 = defpackage.ft4.j(r6)
            java.lang.String r6 = "onLogin#5.2("
            java.lang.String r7 = "): ProfileRepository.putProfile "
            java.lang.String r4 = defpackage.zr6.i(r6, r4, r7)
            r6 = 0
            r0.d(r3, r14, r4, r6)
        L_0x032b:
            nab r0 = r2.c
            if (r0 == 0) goto L_0x0334
            blb r3 = r1.a
            r3.b(r0)
        L_0x0334:
            ir6 r0 = defpackage.hm9.m
            if (r0 != 0) goto L_0x0339
            goto L_0x0353
        L_0x0339:
            boolean r3 = r0.c()
            if (r3 == 0) goto L_0x0353
            us7 r3 = defpackage.us7.X
            long r6 = a(r9)
            java.lang.String r4 = defpackage.ft4.j(r6)
            java.lang.String r6 = "): loadMissedContactsUseCase is started"
            java.lang.String r4 = defpackage.zr6.i(r12, r4, r6)
            r6 = 0
            r0.d(r3, r14, r4, r6)
        L_0x0353:
            xb9 r0 = r36.j()     // Catch:{ all -> 0x0431 }
            int r3 = defpackage.ft4.o     // Catch:{ all -> 0x0431 }
            kt4 r3 = defpackage.kt4.SECONDS     // Catch:{ all -> 0x0431 }
            r4 = 3
            long r6 = defpackage.z7.R(r4, r3)     // Catch:{ all -> 0x0431 }
            r8.o = r1     // Catch:{ all -> 0x0435 }
            r8.X = r2     // Catch:{ all -> 0x0435 }
            r8.Y = r9     // Catch:{ all -> 0x0435 }
            r8.Z = r5     // Catch:{ all -> 0x0435 }
            r3 = r37
            r8.t0 = r3     // Catch:{ all -> 0x0431 }
            r10 = r40
            r8.u0 = r10     // Catch:{ all -> 0x042a }
            r15 = r14
            r13 = r22
            r8.v0 = r13     // Catch:{ all -> 0x0428 }
            r1 = r21
            r8.x0 = r1     // Catch:{ all -> 0x0420 }
            r3 = r24
            r8.w0 = r3     // Catch:{ all -> 0x041c }
            r21 = r1
            r1 = r26
            r8.y0 = r1     // Catch:{ all -> 0x0418 }
            r26 = r1
            r1 = 1
            r8.B0 = r1     // Catch:{ all -> 0x040e }
            java.lang.Object r0 = r0.p(r2, r6, r8)     // Catch:{ all -> 0x040e }
            r1 = r20
            if (r0 != r1) goto L_0x0391
            return r1
        L_0x0391:
            r6 = r3
            r22 = r13
            r3 = r37
            r13 = r5
            r14 = r9
            r9 = r10
            r11 = r26
            r5 = r2
            r2 = r36
        L_0x039e:
            ir6 r0 = defpackage.hm9.m     // Catch:{ all -> 0x0408 }
            if (r0 != 0) goto L_0x03a9
        L_0x03a2:
            r36 = r2
            r37 = r3
            r39 = r5
            goto L_0x03f3
        L_0x03a9:
            boolean r20 = r0.c()     // Catch:{ all -> 0x0404 }
            if (r20 == 0) goto L_0x03a2
            r36 = r2
            us7 r2 = defpackage.us7.X     // Catch:{ all -> 0x03ef }
            long r24 = a(r14)     // Catch:{ all -> 0x03ef }
            r37 = r3
            java.lang.String r3 = defpackage.ft4.j(r24)     // Catch:{ all -> 0x03eb }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x03eb }
            r4.<init>()     // Catch:{ all -> 0x03eb }
            r39 = r5
            java.lang.String r5 = "onLogin#5.x5("
            r4.append(r5)     // Catch:{ all -> 0x03e9 }
            r4.append(r3)     // Catch:{ all -> 0x03e9 }
            java.lang.String r3 = "): loadMissedContactsUseCase is ended"
            r4.append(r3)     // Catch:{ all -> 0x03e9 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x03e9 }
            r4 = 0
            r0.d(r2, r15, r3, r4)     // Catch:{ all -> 0x03e9 }
            goto L_0x03f3
        L_0x03da:
            r2 = r37
            r4 = r39
            r20 = r0
            r26 = r11
            r5 = r13
            r10 = r9
            r9 = r14
            r13 = r22
            goto L_0x043e
        L_0x03e9:
            r0 = move-exception
            goto L_0x03da
        L_0x03eb:
            r0 = move-exception
        L_0x03ec:
            r39 = r5
            goto L_0x03da
        L_0x03ef:
            r0 = move-exception
        L_0x03f0:
            r37 = r3
            goto L_0x03ec
        L_0x03f3:
            r2 = r36
            r3 = r37
            r5 = r39
            r20 = r1
            r36 = r11
            r0 = r22
            r11 = r9
        L_0x0400:
            r9 = r21
            goto L_0x047d
        L_0x0404:
            r0 = move-exception
            r36 = r2
            goto L_0x03f0
        L_0x0408:
            r0 = move-exception
            r36 = r2
            r37 = r3
            goto L_0x03ec
        L_0x040e:
            r0 = move-exception
        L_0x040f:
            r1 = r20
        L_0x0411:
            r20 = r0
            r6 = r3
            r4 = r2
            r2 = r37
            goto L_0x043e
        L_0x0418:
            r0 = move-exception
            r26 = r1
            goto L_0x040f
        L_0x041c:
            r0 = move-exception
            r21 = r1
            goto L_0x040f
        L_0x0420:
            r0 = move-exception
            r21 = r1
        L_0x0423:
            r1 = r20
        L_0x0425:
            r3 = r24
            goto L_0x0411
        L_0x0428:
            r0 = move-exception
            goto L_0x0423
        L_0x042a:
            r0 = move-exception
        L_0x042b:
            r15 = r14
            r1 = r20
            r13 = r22
            goto L_0x0425
        L_0x0431:
            r0 = move-exception
            r10 = r40
            goto L_0x042b
        L_0x0435:
            r0 = move-exception
            r10 = r40
            r15 = r14
            r1 = r20
            r13 = r22
            goto L_0x0425
        L_0x043e:
            ir6 r0 = defpackage.hm9.m
            if (r0 != 0) goto L_0x0449
        L_0x0442:
            r37 = r2
            r39 = r4
            r40 = r5
            goto L_0x046d
        L_0x0449:
            boolean r22 = r0.c()
            if (r22 == 0) goto L_0x0442
            r37 = r2
            us7 r2 = defpackage.us7.s0
            long r22 = a(r9)
            java.lang.String r3 = defpackage.ft4.j(r22)
            r39 = r4
            java.lang.String r4 = defpackage.j47.n0(r20)
            r40 = r5
            java.lang.String r5 = "): loadMissedContactsUseCase is ended "
            java.lang.String r3 = defpackage.rh4.k(r12, r3, r5, r4)
            r4 = 0
            r0.d(r2, r15, r3, r4)
        L_0x046d:
            r2 = r36
            r3 = r37
            r5 = r39
            r20 = r1
            r11 = r10
            r0 = r13
            r36 = r26
            r13 = r40
            r14 = r9
            goto L_0x0400
        L_0x047d:
            ir6 r10 = defpackage.hm9.m
            if (r10 != 0) goto L_0x0488
        L_0x0481:
            r24 = r0
            r21 = r6
            r23 = r9
            goto L_0x04be
        L_0x0488:
            boolean r21 = r10.c()
            if (r21 == 0) goto L_0x0481
            r21 = r6
            us7 r6 = defpackage.us7.X
            long r23 = a(r14)
            java.lang.String r7 = defpackage.ft4.j(r23)
            r23 = r9
            java.util.List r9 = r5.o
            int r9 = r9.size()
            r24 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onLogin#6("
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r1 = "): ChatsController.storeChatsFromServer chatsSize="
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            r1 = 0
            r10.d(r6, r15, r0, r1)
        L_0x04be:
            p82 r0 = r2.e()
            java.util.List r1 = r5.o
            le3 r6 = r5.t0
            if (r6 == 0) goto L_0x04cb
            java.util.Map r6 = r6.c
            goto L_0x04cc
        L_0x04cb:
            r6 = 0
        L_0x04cc:
            gi9 r0 = r0.d0(r1, r6)
            ir6 r1 = defpackage.hm9.m
            if (r1 != 0) goto L_0x04d7
        L_0x04d4:
            r26 = r11
            goto L_0x050f
        L_0x04d7:
            boolean r6 = r1.c()
            if (r6 == 0) goto L_0x04d4
            us7 r6 = defpackage.us7.X
            long r9 = a(r14)
            java.lang.String r7 = defpackage.ft4.j(r9)
            le3 r9 = r5.t0
            if (r9 == 0) goto L_0x04ed
            r9 = 1
            goto L_0x04ee
        L_0x04ed:
            r9 = 0
        L_0x04ee:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r26 = r11
            java.lang.String r11 = "onLogin#7("
            r10.<init>(r11)
            r10.append(r7)
            java.lang.String r7 = "): notifConfigLogic.onChatsAndFolders with config="
            r10.append(r7)
            r10.append(r9)
            java.lang.String r7 = "}"
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            r9 = 0
            r1.d(r6, r15, r7, r9)
        L_0x050f:
            le3 r1 = r5.t0
            if (r1 == 0) goto L_0x051e
            je7 r6 = r2.n
            java.lang.Object r6 = r6.getValue()
            ur9 r6 = (defpackage.ur9) r6
            r6.a(r1, r0)
        L_0x051e:
            ir6 r1 = defpackage.hm9.m
            if (r1 != 0) goto L_0x0523
            goto L_0x0553
        L_0x0523:
            boolean r6 = r1.c()
            if (r6 == 0) goto L_0x0553
            us7 r6 = defpackage.us7.X
            long r9 = a(r14)
            java.lang.String r7 = defpackage.ft4.j(r9)
            java.util.Map r9 = r5.u0
            int r9 = r9.size()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "onLogin#8("
            r10.<init>(r11)
            r10.append(r7)
            java.lang.String r7 = "): updateMessages with size="
            r10.append(r7)
            r10.append(r9)
            java.lang.String r7 = r10.toString()
            r9 = 0
            r1.d(r6, r15, r7, r9)
        L_0x0553:
            java.util.Map r1 = r5.u0
            r8.o = r2
            r8.X = r5
            r8.Y = r14
            r8.Z = r13
            r8.s0 = r0
            r8.t0 = r3
            r9 = r26
            r8.u0 = r9
            r6 = r24
            r8.v0 = r6
            r11 = r23
            r8.x0 = r11
            r23 = r3
            r3 = r21
            r8.w0 = r3
            r12 = r36
            r8.y0 = r12
            r3 = 2
            r8.B0 = r3
            java.lang.Object r1 = r2.u(r1, r8)
            r3 = r20
            if (r1 != r3) goto L_0x0583
            return r3
        L_0x0583:
            r20 = r3
            r1 = r12
            r36 = r23
            r34 = r6
            r7 = r2
            r6 = r5
            r2 = r13
            r4 = r21
            r12 = r9
            r9 = r34
        L_0x0592:
            ir6 r3 = defpackage.hm9.m
            if (r3 != 0) goto L_0x059d
        L_0x0596:
            r22 = r8
            r24 = r9
            r21 = r11
            goto L_0x05bf
        L_0x059d:
            boolean r21 = r3.c()
            if (r21 == 0) goto L_0x0596
            r21 = r11
            us7 r11 = defpackage.us7.X
            long r22 = a(r14)
            r24 = r9
            java.lang.String r9 = defpackage.ft4.j(r22)
            java.lang.String r10 = "onLogin#9("
            r22 = r8
            java.lang.String r8 = "): PresenceController.onLogin"
            java.lang.String r8 = defpackage.zr6.i(r10, r9, r8)
            r9 = 0
            r3.d(r11, r15, r8, r9)
        L_0x05bf:
            w7b r3 = r7.m()
            java.util.Map r8 = r6.Y
            java.util.HashMap r8 = defpackage.iz7.n(r8)
            r3.i(r8, r4)
            ir6 r3 = defpackage.hm9.m
            if (r3 != 0) goto L_0x05d1
            goto L_0x05ed
        L_0x05d1:
            boolean r8 = r3.c()
            if (r8 == 0) goto L_0x05ed
            us7 r8 = defpackage.us7.X
            long r9 = a(r14)
            java.lang.String r9 = defpackage.ft4.j(r9)
            java.lang.String r10 = "onLogin#11("
            java.lang.String r11 = "): loadChatsIfNeed"
            java.lang.String r9 = defpackage.zr6.i(r10, r9, r11)
            r10 = 0
            r3.d(r8, r15, r9, r10)
        L_0x05ed:
            r7.p(r6, r12)
            ir6 r3 = defpackage.hm9.m
            if (r3 != 0) goto L_0x05f5
            goto L_0x0611
        L_0x05f5:
            boolean r8 = r3.c()
            if (r8 == 0) goto L_0x0611
            us7 r8 = defpackage.us7.X
            long r9 = a(r14)
            java.lang.String r9 = defpackage.ft4.j(r9)
            java.lang.String r10 = "onLogin#12("
            java.lang.String r11 = "): processDraftNewsUseCase"
            java.lang.String r9 = defpackage.zr6.i(r10, r9, r11)
            r10 = 0
            r3.d(r8, r15, r9, r10)
        L_0x0611:
            m9b r3 = r7.n()
            vp4 r8 = r6.z0
            long r9 = r6.s0
            r3.a(r8, r9)
            ir6 r3 = defpackage.hm9.m
            if (r3 != 0) goto L_0x0621
            goto L_0x063d
        L_0x0621:
            boolean r8 = r3.c()
            if (r8 == 0) goto L_0x063d
            us7 r8 = defpackage.us7.X
            long r9 = a(r14)
            java.lang.String r9 = defpackage.ft4.j(r9)
            java.lang.String r10 = "onLogin#13("
            java.lang.String r11 = "): ServiceTaskTransmitTamTasks.execute"
            java.lang.String r9 = defpackage.zr6.i(r10, r9, r11)
            r10 = 0
            r3.d(r8, r15, r9, r10)
        L_0x063d:
            s8g r3 = r7.o()
            defpackage.r9d.y(r3)
            ri4 r3 = r7.f()
            ti4 r3 = (defpackage.ti4) r3
            u8e r3 = r3.g
            xe6 r3 = (defpackage.xe6) r3
            boolean r3 = r3.a()
            if (r3 == 0) goto L_0x0666
            java.lang.String r3 = "update push token on server"
            defpackage.hm9.m(r15, r3, new java.lang.Object[0])
            je7 r3 = r7.b
            java.lang.Object r3 = r3.getValue()
            pk r3 = (defpackage.pk) r3
            k4a r3 = (defpackage.k4a) r3
            r3.s()
        L_0x0666:
            boolean r3 = defpackage.f8.d
            java.lang.String r8 = "onLogin#14("
            if (r3 == 0) goto L_0x068c
            ir6 r3 = defpackage.hm9.m
            if (r3 != 0) goto L_0x0671
            goto L_0x06b7
        L_0x0671:
            boolean r9 = r3.c()
            if (r9 == 0) goto L_0x06b7
            us7 r9 = defpackage.us7.X
            long r10 = a(r14)
            java.lang.String r10 = defpackage.ft4.j(r10)
            java.lang.String r11 = "): phonebook already checked"
            java.lang.String r8 = defpackage.zr6.i(r8, r10, r11)
            r10 = 0
            r3.d(r9, r15, r8, r10)
            goto L_0x06b7
        L_0x068c:
            r3 = 1
            defpackage.f8.d = r3
            ir6 r3 = defpackage.hm9.m
            if (r3 != 0) goto L_0x0694
            goto L_0x06ae
        L_0x0694:
            boolean r9 = r3.c()
            if (r9 == 0) goto L_0x06ae
            us7 r9 = defpackage.us7.X
            long r10 = a(r14)
            java.lang.String r10 = defpackage.ft4.j(r10)
            java.lang.String r11 = "): phonebook.checkUpdates()"
            java.lang.String r8 = defpackage.zr6.i(r8, r10, r11)
            r10 = 0
            r3.d(r9, r15, r8, r10)
        L_0x06ae:
            bva r3 = r7.k()
            jva r3 = (defpackage.jva) r3
            r3.c()
        L_0x06b7:
            ir6 r3 = defpackage.hm9.m
            if (r3 != 0) goto L_0x06bc
            goto L_0x06d8
        L_0x06bc:
            boolean r8 = r3.c()
            if (r8 == 0) goto L_0x06d8
            us7 r8 = defpackage.us7.X
            long r9 = a(r14)
            java.lang.String r9 = defpackage.ft4.j(r9)
            java.lang.String r10 = "onLogin#15("
            java.lang.String r11 = "): phonebookSyncService.sync()"
            java.lang.String r9 = defpackage.zr6.i(r10, r9, r11)
            r10 = 0
            r3.d(r8, r15, r9, r10)
        L_0x06d8:
            lva r3 = r7.l()
            r3.c()
            ir6 r3 = defpackage.hm9.m
            if (r3 != 0) goto L_0x06e4
            goto L_0x0700
        L_0x06e4:
            boolean r8 = r3.c()
            if (r8 == 0) goto L_0x0700
            us7 r8 = defpackage.us7.X
            long r9 = a(r14)
            java.lang.String r9 = defpackage.ft4.j(r9)
            java.lang.String r10 = "onLogin#16("
            java.lang.String r11 = "): updateStickers"
            java.lang.String r9 = defpackage.zr6.i(r10, r9, r11)
            r10 = 0
            r3.d(r8, r15, r9, r10)
        L_0x0700:
            af8 r3 = r7.i()
            r3.getClass()
            je7 r3 = r7.b
            java.lang.Object r3 = r3.getValue()
            pk r3 = (defpackage.pk) r3
            r8 = r2
            hyc r8 = (defpackage.hyc) r8
            long r8 = r8.s()
            k4a r3 = (defpackage.k4a) r3
            r10 = 2
            r3.g(r10, r8)
            sc5 r3 = r7.g()
            r3.i()
            ir6 r3 = defpackage.hm9.m
            if (r3 != 0) goto L_0x0728
            goto L_0x0744
        L_0x0728:
            boolean r8 = r3.c()
            if (r8 == 0) goto L_0x0744
            us7 r8 = defpackage.us7.X
            long r9 = a(r14)
            java.lang.String r9 = defpackage.ft4.j(r9)
            java.lang.String r10 = "onLogin#17("
            java.lang.String r11 = "): updateReactions"
            java.lang.String r9 = defpackage.zr6.i(r10, r9, r11)
            r10 = 0
            r3.d(r8, r15, r9, r10)
        L_0x0744:
            gj r3 = r7.b()
            r3.k()
            ir6 r3 = defpackage.hm9.m
            if (r3 != 0) goto L_0x0750
            goto L_0x076c
        L_0x0750:
            boolean r8 = r3.c()
            if (r8 == 0) goto L_0x076c
            us7 r8 = defpackage.us7.X
            long r9 = a(r14)
            java.lang.String r9 = defpackage.ft4.j(r9)
            java.lang.String r10 = "onLogin#18("
            java.lang.String r11 = "): callsCredRepository.fetchTokenAsync()"
            java.lang.String r9 = defpackage.zr6.i(r10, r9, r11)
            r10 = 0
            r3.d(r8, r15, r9, r10)
        L_0x076c:
            ct1 r3 = r7.d()
            ft1 r3 = (defpackage.ft1) r3
            r3.b()
            ir6 r3 = defpackage.hm9.m
            if (r3 != 0) goto L_0x077a
            goto L_0x07a9
        L_0x077a:
            boolean r8 = r3.c()
            if (r8 == 0) goto L_0x07a9
            us7 r8 = defpackage.us7.X
            long r9 = a(r14)
            java.lang.String r9 = defpackage.ft4.j(r9)
            if (r1 != 0) goto L_0x078e
            r10 = 1
            goto L_0x078f
        L_0x078e:
            r10 = 0
        L_0x078f:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "onLogin#19("
            r11.<init>(r12)
            r11.append(r9)
            java.lang.String r9 = "): analytics.logSkippedPushes="
            r11.append(r9)
            r11.append(r10)
            java.lang.String r9 = r11.toString()
            r10 = 0
            r3.d(r8, r15, r9, r10)
        L_0x07a9:
            if (r1 != 0) goto L_0x07ba
            je7 r3 = r7.h
            java.lang.Object r3 = r3.getValue()
            ad r3 = (defpackage.ad) r3
            ri4 r8 = r7.f()
            r3.c(r6, r2, r8)
        L_0x07ba:
            ir6 r3 = defpackage.hm9.m
            if (r3 != 0) goto L_0x07bf
            goto L_0x07ee
        L_0x07bf:
            boolean r8 = r3.c()
            if (r8 == 0) goto L_0x07ee
            us7 r8 = defpackage.us7.X
            long r9 = a(r14)
            java.lang.String r9 = defpackage.ft4.j(r9)
            if (r1 != 0) goto L_0x07d3
            r10 = 1
            goto L_0x07d4
        L_0x07d3:
            r10 = 0
        L_0x07d4:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "onLogin#20("
            r11.<init>(r12)
            r11.append(r9)
            java.lang.String r9 = "): notificationsListener.cancelServerChatId="
            r11.append(r9)
            r11.append(r10)
            java.lang.String r9 = r11.toString()
            r10 = 0
            r3.d(r8, r15, r9, r10)
        L_0x07ee:
            if (r1 != 0) goto L_0x08d3
            long[] r3 = r0.b
            long[] r8 = r0.a
            int r9 = r8.length
            r10 = 2
            int r9 = r9 - r10
            if (r9 < 0) goto L_0x08d3
            r10 = 0
        L_0x07fa:
            r11 = r8[r10]
            r26 = r4
            long r4 = ~r11
            r13 = 7
            long r4 = r4 << r13
            long r4 = r4 & r11
            r28 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r4 = r4 & r28
            int r4 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r4 == 0) goto L_0x08b7
            int r4 = r10 - r9
            int r4 = ~r4
            int r4 = r4 >>> 31
            r5 = 8
            int r4 = 8 - r4
            r28 = r11
            r11 = 0
        L_0x0819:
            if (r11 >= r4) goto L_0x08a8
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r28 & r12
            r30 = 128(0x80, double:6.32E-322)
            int r12 = (r12 > r30 ? 1 : (r12 == r30 ? 0 : -1))
            if (r12 >= 0) goto L_0x088c
            r12 = 3
            int r19 = r10 << 3
            r32 = r36
            int r19 = r19 + r11
            r36 = r14
            r13 = r3[r19]
            p82 r12 = r7.e()
            e52 r12 = r12.C(r13)
            if (r12 == 0) goto L_0x0883
            k92 r13 = r12.b
            int r14 = r13.m
            if (r14 != 0) goto L_0x0883
            long r13 = r13.k
            long r30 = r12.n()
            int r13 = (r13 > r30 ? 1 : (r13 == r30 ? 0 : -1))
            if (r13 > 0) goto L_0x0883
            ir6 r13 = defpackage.hm9.m
            if (r13 != 0) goto L_0x0855
        L_0x084e:
            r38 = r2
            r23 = r3
            r30 = r8
            goto L_0x0873
        L_0x0855:
            boolean r14 = r13.c()
            if (r14 == 0) goto L_0x084e
            us7 r14 = defpackage.us7.Y
            k92 r5 = r12.b
            r38 = r2
            r23 = r3
            long r2 = r5.a
            java.lang.String r5 = "cancel notifications for chat "
            r30 = r8
            java.lang.String r8 = " because of no new messages!"
            java.lang.String r2 = defpackage.ey8.i(r2, r5, r8)
            r3 = 0
            r13.d(r14, r15, r2, r3)
        L_0x0873:
            je7 r2 = r7.o
            java.lang.Object r2 = r2.getValue()
            cea r2 = (defpackage.cea) r2
            k92 r3 = r12.b
            long r12 = r3.a
            r2.a(r12)
            goto L_0x0889
        L_0x0883:
            r38 = r2
            r23 = r3
            r30 = r8
        L_0x0889:
            r2 = 8
            goto L_0x0897
        L_0x088c:
            r32 = r36
            r38 = r2
            r23 = r3
            r30 = r8
            r36 = r14
            r2 = r5
        L_0x0897:
            long r28 = r28 >> r2
            r3 = 1
            int r11 = r11 + r3
            r14 = r36
            r5 = r2
            r3 = r23
            r8 = r30
            r36 = r32
            r2 = r38
            goto L_0x0819
        L_0x08a8:
            r32 = r36
            r38 = r2
            r23 = r3
            r2 = r5
            r30 = r8
            r36 = r14
            r3 = 1
            if (r4 != r2) goto L_0x08dc
            goto L_0x08c2
        L_0x08b7:
            r32 = r36
            r38 = r2
            r23 = r3
            r30 = r8
            r36 = r14
            r3 = 1
        L_0x08c2:
            if (r10 == r9) goto L_0x08dc
            int r10 = r10 + r3
            r14 = r36
            r2 = r38
            r3 = r23
            r4 = r26
            r8 = r30
            r36 = r32
            goto L_0x07fa
        L_0x08d3:
            r32 = r36
            r38 = r2
            r26 = r4
            r36 = r14
            r3 = 1
        L_0x08dc:
            je7 r2 = r7.o
            java.lang.Object r2 = r2.getValue()
            cea r2 = (defpackage.cea) r2
            r2.e(r0)
            ir6 r2 = defpackage.hm9.m
            if (r2 != 0) goto L_0x08ee
        L_0x08eb:
            r9 = r18
            goto L_0x091d
        L_0x08ee:
            boolean r4 = r2.c()
            if (r4 == 0) goto L_0x08eb
            us7 r4 = defpackage.us7.X
            long r8 = a(r36)
            java.lang.String r5 = defpackage.ft4.j(r8)
            if (r1 == 0) goto L_0x0902
            r10 = r3
            goto L_0x0903
        L_0x0902:
            r10 = 0
        L_0x0903:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r9 = r18
            r8.<init>(r9)
            r8.append(r5)
            java.lang.String r5 = "): sending critical logs if initial="
            r8.append(r5)
            r8.append(r10)
            java.lang.String r5 = r8.toString()
            r8 = 0
            r2.d(r4, r15, r5, r8)
        L_0x091d:
            if (r1 == 0) goto L_0x0961
            js7 r2 = r7.h()
            r4 = r22
            r4.o = r7
            r4.X = r6
            r14 = r36
            r4.Y = r14
            r13 = r38
            r4.Z = r13
            r4.s0 = r0
            r10 = r32
            r4.t0 = r10
            r8 = r6
            r5 = r24
            r4.u0 = r5
            r12 = r21
            r4.x0 = r12
            r5 = r26
            r4.v0 = r5
            r4.y0 = r1
            r3 = 3
            r4.B0 = r3
            r3 = 0
            java.lang.Object r2 = r2.f(r3, r4)
            r4 = r20
            if (r2 != r4) goto L_0x0953
            return r4
        L_0x0953:
            r4 = r12
            r12 = r13
            r13 = r14
        L_0x0956:
            r2 = r12
            r14 = r13
            r12 = r24
            r34 = r8
            r8 = r4
            r4 = r5
            r6 = r34
            goto L_0x0973
        L_0x0961:
            r14 = r36
            r13 = r38
            r8 = r6
            r12 = r21
            r5 = r26
            r10 = r32
            r3 = 0
            r4 = r5
            r6 = r8
            r8 = r12
            r2 = r13
            r12 = r24
        L_0x0973:
            hyc r2 = (defpackage.hyc) r2
            ne7 r3 = r2.g
            r19 = r8
            java.lang.String r8 = "app.first.login.time"
            r20 = r12
            r12 = 0
            long r16 = r3.getLong(r8, r12)
            int r3 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r3 > 0) goto L_0x098a
            r2.x(r4)
        L_0x098a:
            r2.z(r4)
            je7 r2 = r7.g
            java.lang.Object r2 = r2.getValue()
            av0 r2 = (defpackage.av0) r2
            java.util.List r3 = r6.o
            boolean r4 = r3 instanceof java.util.Collection
            if (r4 == 0) goto L_0x09a3
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x09a3
        L_0x09a1:
            r3 = 0
            goto L_0x09b8
        L_0x09a3:
            java.util.Iterator r3 = r3.iterator()
        L_0x09a7:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x09a1
            java.lang.Object r4 = r3.next()
            f52 r4 = (defpackage.f52) r4
            int r4 = r4.w0
            if (r4 <= 0) goto L_0x09a7
            r3 = 1
        L_0x09b8:
            boolean r4 = r6.x0
            ut7 r5 = new ut7
            if (r1 == 0) goto L_0x09c0
            r8 = 1
            goto L_0x09c1
        L_0x09c0:
            r8 = 0
        L_0x09c1:
            r36 = r5
            r37 = r10
            r39 = r8
            r40 = r3
            r41 = r4
            r42 = r0
            r36.<init>(r37, r39, r40, r41, r42)
            r2.c(r5)
            ir6 r0 = defpackage.hm9.m
            if (r0 != 0) goto L_0x09d8
            goto L_0x09f4
        L_0x09d8:
            boolean r2 = r0.c()
            if (r2 == 0) goto L_0x09f4
            us7 r2 = defpackage.us7.X
            long r3 = a(r14)
            java.lang.String r3 = defpackage.ft4.j(r3)
            java.lang.String r4 = "onLogin#20.saved_messages "
            java.lang.String r5 = ": saved messages"
            java.lang.String r3 = defpackage.zr6.i(r4, r3, r5)
            r4 = 0
            r0.d(r2, r15, r3, r4)
        L_0x09f4:
            nab r0 = r6.c
            if (r0 == 0) goto L_0x09fb
            wm3 r0 = r0.a
            goto L_0x09fc
        L_0x09fb:
            r0 = 0
        L_0x09fc:
            if (r0 == 0) goto L_0x0aca
            long r2 = r0.a
            java.util.List r0 = r6.o
            boolean r4 = r0 instanceof java.util.Collection
            if (r4 == 0) goto L_0x0a0d
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x0a0d
            goto L_0x0a33
        L_0x0a0d:
            java.util.Iterator r0 = r0.iterator()
        L_0x0a11:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0a33
            java.lang.Object r4 = r0.next()
            f52 r4 = (defpackage.f52) r4
            long r10 = r4.a
            r12 = 0
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 != 0) goto L_0x0a31
            int r5 = r4.X0
            r8 = 2
            if (r5 != r8) goto L_0x0a11
            long r4 = r4.c
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0a11
            goto L_0x0a42
        L_0x0a31:
            r8 = 2
            goto L_0x0a11
        L_0x0a33:
            je7 r0 = r7.b
            java.lang.Object r0 = r0.getValue()
            pk r0 = (defpackage.pk) r0
            k4a r0 = (defpackage.k4a) r0
            r2 = 0
            r0.j(r2)
        L_0x0a42:
            int r0 = defpackage.ft4.o
            long r2 = java.lang.System.nanoTime()
            kt4 r0 = defpackage.kt4.NANOSECONDS
            long r2 = defpackage.z7.S(r2, r0)
            r4 = r20
            long r2 = defpackage.ft4.g(r2, r4)
            long r4 = r6.a
            kt4 r0 = defpackage.kt4.MILLISECONDS
            long r4 = defpackage.z7.S(r4, r0)
            long r2 = defpackage.ft4.h(r2, r4)
            ir6 r0 = defpackage.hm9.m
            if (r0 != 0) goto L_0x0a65
            goto L_0x0a7f
        L_0x0a65:
            boolean r4 = r0.c()
            if (r4 == 0) goto L_0x0a7f
            us7 r4 = defpackage.us7.X
            long r5 = a(r14)
            java.lang.String r5 = defpackage.ft4.j(r5)
            java.lang.String r6 = "): sendAction"
            java.lang.String r5 = defpackage.zr6.i(r9, r5, r6)
            r6 = 0
            r0.d(r4, r15, r5, r6)
        L_0x0a7f:
            if (r19 == 0) goto L_0x0a9c
            ri4 r0 = r7.f()
            boolean r0 = r0.d()
            if (r0 == 0) goto L_0x0a9c
            if (r1 == 0) goto L_0x0a8f
            r6 = 1
            goto L_0x0a90
        L_0x0a8f:
            r6 = 0
        L_0x0a90:
            ri4 r0 = r7.f()
            vi4 r0 = r0.b()
            r7.t(r6, r0, r2)
            goto L_0x0aac
        L_0x0a9c:
            if (r1 == 0) goto L_0x0aa0
            r6 = 1
            goto L_0x0aa1
        L_0x0aa0:
            r6 = 0
        L_0x0aa1:
            ri4 r0 = r7.f()
            vi4 r0 = r0.b()
            r7.s(r6, r0, r2)
        L_0x0aac:
            ir6 r0 = defpackage.hm9.m
            if (r0 != 0) goto L_0x0ab1
            goto L_0x0ac7
        L_0x0ab1:
            boolean r1 = r0.c()
            if (r1 == 0) goto L_0x0ac7
            us7 r1 = defpackage.us7.X
            java.lang.String r2 = defpackage.ft4.j(r2)
            java.lang.String r3 = "onLogin#22: finished "
            java.lang.String r2 = r3.concat(r2)
            r3 = 0
            r0.d(r1, r15, r2, r3)
        L_0x0ac7:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0aca:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cu7.r(long, kt7, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void s(boolean z2, vi4 vi4, long j2) {
        ((ad) this.h.getValue()).e(ft4.e(j2), z2 ? "FIRST_LOGIN_PROCESSING_TIME" : "LOGIN_PROCESSING_TIME", vi4.name());
    }

    public final void t(boolean z2, vi4 vi4, long j2) {
        ((ad) this.h.getValue()).e(ft4.e(j2), z2 ? "INTERACTIVE_FIRST_LOGIN_PROCESSING_TIME" : "INTERACTIVE_LOGIN_PROCESSING_TIME", vi4.name());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: fs8} */
    /* JADX WARNING: type inference failed for: r9v17, types: [java.lang.Object, mec] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x04d3  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x04dc  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x04e4  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x04ec  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0519  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x052f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01b3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x03fc  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0470  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x049d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object u(java.util.Map r31, kotlin.coroutines.Continuation r32) {
        /*
            r30 = this;
            r0 = r32
            r1 = 3
            boolean r2 = r0 instanceof defpackage.au7
            if (r2 == 0) goto L_0x0018
            r2 = r0
            au7 r2 = (defpackage.au7) r2
            int r3 = r2.C0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r2.C0 = r3
            r3 = r30
            goto L_0x001f
        L_0x0018:
            au7 r2 = new au7
            r3 = r30
            r2.<init>(r3, r0)
        L_0x001f:
            java.lang.Object r0 = r2.A0
            tx3 r4 = defpackage.tx3.a
            int r5 = r2.C0
            r6 = 1
            java.lang.String r7 = "cu7"
            r9 = 2
            if (r5 == 0) goto L_0x00b8
            if (r5 == r6) goto L_0x008a
            if (r5 == r9) goto L_0x005a
            if (r5 != r1) goto L_0x0052
            int r3 = r2.z0
            int r5 = r2.y0
            mec r10 = r2.w0
            fs8 r11 = r2.v0
            java.util.Iterator r12 = r2.u0
            es8 r13 = r2.t0
            es8 r14 = r2.s0
            g92 r15 = r2.Z
            e52 r9 = r2.Y
            java.util.Iterator r6 = r2.X
            cu7 r8 = r2.o
            defpackage.od2.a0(r0)
            r16 = r7
            r7 = r15
            r15 = r6
            r6 = r4
            r4 = r1
            goto L_0x03fe
        L_0x0052:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x005a:
            int r3 = r2.z0
            int r5 = r2.y0
            mec r6 = r2.x0
            mec r8 = r2.w0
            fs8 r9 = r2.v0
            java.util.Iterator r10 = r2.u0
            es8 r11 = r2.t0
            es8 r12 = r2.s0
            g92 r13 = r2.Z
            e52 r14 = r2.Y
            java.util.Iterator r15 = r2.X
            cu7 r1 = r2.o
            defpackage.od2.a0(r0)
            r16 = r7
            r7 = r13
            r13 = r11
            r11 = r6
            r6 = r4
            r4 = 2
            r28 = r8
            r8 = r1
            r1 = r10
            r10 = r28
            r29 = r12
            r12 = r9
            r9 = r14
            r14 = r29
            goto L_0x03c0
        L_0x008a:
            int r1 = r2.z0
            int r3 = r2.y0
            mec r5 = r2.x0
            mec r6 = r2.w0
            fs8 r8 = r2.v0
            java.util.Iterator r9 = r2.u0
            es8 r10 = r2.t0
            es8 r11 = r2.s0
            g92 r12 = r2.Z
            e52 r13 = r2.Y
            java.util.Iterator r14 = r2.X
            cu7 r15 = r2.o
            defpackage.od2.a0(r0)
            r16 = r7
            r28 = r11
            r11 = r6
            r6 = r15
            r15 = r28
            r29 = r12
            r12 = r8
            r8 = r13
            r13 = r9
            r9 = r14
            r14 = r10
            r10 = r29
            goto L_0x01c0
        L_0x00b8:
            defpackage.od2.a0(r0)
            java.util.Set r0 = r31.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x00c3:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x052f
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r5 = r1.getKey()
            java.lang.Number r5 = (java.lang.Number) r5
            long r5 = r5.longValue()
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            je7 r8 = r3.v
            java.lang.Object r8 = r8.getValue()
            jc2 r8 = (defpackage.jc2) r8
            r8.getClass()
            boolean r9 = r1.isEmpty()
            if (r9 == 0) goto L_0x00f5
            java.util.List r8 = java.util.Collections.emptyList()
            goto L_0x0109
        L_0x00f5:
            iua r9 = defpackage.iua.TYPE_MSG_EDIT
            eoe r8 = r8.g
            r10 = 0
            java.util.List r8 = r8.h(r10, r9)
            z72 r9 = new z72
            r10 = 3
            r9.<init>(r10, r8)
            java.util.List r8 = defpackage.nd7.p(r1, r9)
        L_0x0109:
            int r9 = r8.size()
            int r10 = r1.size()
            if (r9 == r10) goto L_0x012f
            ir6 r1 = defpackage.hm9.m
            if (r1 != 0) goto L_0x0118
            goto L_0x012e
        L_0x0118:
            boolean r9 = r1.c()
            if (r9 == 0) goto L_0x012e
            us7 r9 = defpackage.us7.X
            int r10 = r8.size()
            java.lang.String r11 = "updateMessages: local edit found by size "
            java.lang.String r10 = defpackage.zr6.h(r10, r11)
            r11 = 0
            r1.d(r9, r7, r10, r11)
        L_0x012e:
            r1 = r8
        L_0x012f:
            boolean r8 = r1.isEmpty()
            if (r8 != 0) goto L_0x013f
            p82 r8 = r3.e()
            e52 r5 = r8.z(r5)
            if (r5 != 0) goto L_0x0144
        L_0x013f:
            r6 = r4
            r16 = r7
            goto L_0x052a
        L_0x0144:
            k92 r6 = r5.b
            g92 r6 = r6.o0
            es8 r8 = r5.c
            es8 r9 = r5.X
            java.util.Iterator r1 = r1.iterator()
            r10 = 0
            r11 = r5
            r13 = r6
            r15 = r8
            r14 = r9
            r6 = r1
            r5 = r3
            r1 = r10
            r3 = r1
        L_0x0159:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x04e4
            java.lang.Object r8 = r6.next()
            r12 = r8
            fs8 r12 = (defpackage.fs8) r12
            mec r9 = new mec
            r9.<init>()
            je7 r8 = r5.f
            java.lang.Object r8 = r8.getValue()
            c34 r8 = (defpackage.c34) r8
            k24 r8 = (defpackage.k24) r8
            vlc r8 = r8.c
            r16 = r7
            r10 = r8
            long r7 = r11.a
            r30 = r7
            long r7 = r12.a
            r2.o = r5
            r2.X = r0
            r2.Y = r11
            r2.Z = r13
            r2.s0 = r15
            r2.t0 = r14
            r2.u0 = r6
            r2.v0 = r12
            r2.w0 = r9
            r2.x0 = r9
            r2.y0 = r3
            r2.z0 = r1
            r17 = r0
            r0 = 1
            r2.C0 = r0
            r18 = r30
            r20 = r7
            r8 = r10
            r0 = r9
            r9 = r18
            r7 = r11
            r18 = r12
            r11 = r20
            r19 = r13
            r13 = r2
            java.lang.Object r8 = r8.j(r9, r11, r13)
            if (r8 != r4) goto L_0x01b4
            return r4
        L_0x01b4:
            r11 = r0
            r13 = r6
            r9 = r17
            r12 = r18
            r10 = r19
            r6 = r5
            r0 = r8
            r5 = r11
            r8 = r7
        L_0x01c0:
            r5.a = r0
            wx8 r0 = r12.X
            if (r0 == 0) goto L_0x01d6
            int[] r5 = defpackage.yt7.$EnumSwitchMapping$1
            int r0 = r0.ordinal()
            r0 = r5[r0]
            java.lang.String r5 = ", message.id = "
            r7 = 1
            if (r0 == r7) goto L_0x0300
            r7 = 2
            if (r0 == r7) goto L_0x01e6
        L_0x01d6:
            r26 = r1
            r30 = r3
            r17 = r6
            r0 = r8
            r1 = r9
            r19 = r10
            r18 = r13
            r13 = r2
            r6 = r4
            goto L_0x04af
        L_0x01e6:
            java.lang.Object r0 = r11.a
            if (r0 == 0) goto L_0x0283
            je7 r0 = r6.f
            java.lang.Object r0 = r0.getValue()
            c34 r0 = (defpackage.c34) r0
            k24 r0 = (defpackage.k24) r0
            vlc r0 = r0.c
            r30 = r3
            r24 = r4
            long r3 = r8.a
            java.lang.Object r7 = r11.a
            cu8 r7 = (defpackage.cu8) r7
            r31 = r13
            r25 = r14
            long r13 = r7.b
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r13)
            java.util.List r7 = java.util.Collections.singletonList(r7)
            vx8 r13 = defpackage.vx8.DELETED
            t19 r0 = r0.d()
            r0.o(r3, r7, r13)
            ir6 r0 = defpackage.hm9.m
            if (r0 != 0) goto L_0x0223
        L_0x021c:
            r26 = r1
            r27 = r2
            r4 = r16
            goto L_0x024a
        L_0x0223:
            boolean r3 = r0.c()
            if (r3 == 0) goto L_0x021c
            us7 r3 = defpackage.us7.X
            long r13 = r8.a
            java.lang.Object r4 = r11.a
            cu8 r4 = (defpackage.cu8) r4
            r26 = r1
            r27 = r2
            long r1 = r4.b
            java.lang.String r4 = "updateMessages, REMOVED: chat.id = "
            java.lang.StringBuilder r4 = defpackage.au1.k(r13, r4, r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r4 = r16
            r2 = 0
            r0.d(r3, r4, r1, r2)
        L_0x024a:
            je7 r0 = r6.g
            java.lang.Object r0 = r0.getValue()
            av0 r0 = (defpackage.av0) r0
            re9 r1 = new re9
            long r2 = r8.a
            java.lang.Object r5 = r11.a
            cu8 r5 = (defpackage.cu8) r5
            long r13 = r5.b
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r13)
            java.util.List r5 = java.util.Collections.singletonList(r5)
            r7 = 0
            r1.<init>(r2, r5, r7)
            r0.c(r1)
            je7 r0 = r6.w
            java.lang.Object r0 = r0.getValue()
            rs9 r0 = (defpackage.rs9) r0
            je7 r1 = r6.o
            java.lang.Object r1 = r1.getValue()
            cea r1 = (defpackage.cea) r1
            r0.getClass()
            defpackage.rs9.a(r8, r1)
            goto L_0x0291
        L_0x0283:
            r26 = r1
            r27 = r2
            r30 = r3
            r24 = r4
            r31 = r13
            r25 = r14
            r4 = r16
        L_0x0291:
            if (r10 == 0) goto L_0x02ee
            long r0 = r10.c
            long r2 = r12.a
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x02ee
            p82 r0 = r6.e()
            k92 r1 = r8.b
            long r1 = r1.a
            r0.getClass()
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r5 = "p82"
            java.lang.String r7 = "removeLastPushMessage %d"
            defpackage.hm9.m(r5, r7, r3)
            e52 r3 = r0.z(r1)
            if (r3 != 0) goto L_0x02cf
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r13 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r13)
            java.lang.String r1 = "removeLastPushMessage: chat not found! %d"
            r2 = 0
            defpackage.hm9.k0(r5, r2, r1, r0)
            goto L_0x02ee
        L_0x02cf:
            r13 = 1
            un0 r1 = new un0
            r2 = 21
            r1.<init>(r2)
            long r2 = r3.a
            r0.h(r2, r13, r1)
            vz2 r1 = new vz2
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r1.<init>(r2, r13)
            av0 r0 = r0.m
            r0.c(r1)
        L_0x02ee:
            r18 = r31
            r16 = r4
            r17 = r6
            r0 = r8
            r1 = r9
            r19 = r10
            r6 = r24
            r14 = r25
            r13 = r27
            goto L_0x04af
        L_0x0300:
            r26 = r1
            r27 = r2
            r30 = r3
            r24 = r4
            r31 = r13
            r25 = r14
            r4 = r16
            r13 = r7
            java.lang.Object r0 = r11.a
            if (r0 == 0) goto L_0x0452
            je7 r0 = r6.f
            java.lang.Object r0 = r0.getValue()
            c34 r0 = (defpackage.c34) r0
            k24 r0 = (defpackage.k24) r0
            vlc r0 = r0.c
            long r1 = r8.a
            r23 = 0
            r20 = 0
            r17 = r0
            r18 = r1
            r22 = r12
            r17.p(r18, r20, r22, r23)
            ir6 r0 = defpackage.hm9.m
            if (r0 != 0) goto L_0x0333
            goto L_0x0364
        L_0x0333:
            boolean r1 = r0.c()
            if (r1 == 0) goto L_0x0364
            us7 r1 = defpackage.us7.X
            long r2 = r8.a
            java.lang.Object r7 = r11.a
            cu8 r7 = (defpackage.cu8) r7
            if (r7 == 0) goto L_0x034b
            long r13 = r7.b
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r13)
            goto L_0x034c
        L_0x034b:
            r7 = 0
        L_0x034c:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "updateMessages, EDITED: chat.id = "
            r13.<init>(r14)
            r13.append(r2)
            r13.append(r5)
            r13.append(r7)
            java.lang.String r2 = r13.toString()
            r3 = 0
            r0.d(r1, r4, r2, r3)
        L_0x0364:
            je7 r0 = r6.f
            java.lang.Object r0 = r0.getValue()
            c34 r0 = (defpackage.c34) r0
            k24 r0 = (defpackage.k24) r0
            vlc r5 = r0.c
            long r0 = r8.a
            long r2 = r12.a
            r13 = r27
            r13.o = r6
            r13.X = r9
            r13.Y = r8
            r13.Z = r10
            r13.s0 = r15
            r14 = r25
            r13.t0 = r14
            r7 = r31
            r13.u0 = r7
            r13.v0 = r12
            r13.w0 = r11
            r13.x0 = r11
            r16 = r4
            r4 = r30
            r13.y0 = r4
            r4 = r26
            r13.z0 = r4
            r4 = 2
            r13.C0 = r4
            r17 = r6
            r18 = r7
            r6 = r0
            r0 = r8
            r1 = r9
            r8 = r2
            r19 = r10
            r10 = r13
            java.lang.Object r2 = r5.j(r6, r8, r10)
            r6 = r24
            if (r2 != r6) goto L_0x03af
            return r6
        L_0x03af:
            r5 = r30
            r9 = r0
            r0 = r2
            r10 = r11
            r2 = r13
            r13 = r14
            r14 = r15
            r8 = r17
            r7 = r19
            r3 = r26
            r15 = r1
            r1 = r18
        L_0x03c0:
            r11.a = r0
            java.lang.Object r0 = r10.a
            if (r0 == 0) goto L_0x044b
            je7 r0 = r8.B
            java.lang.Object r0 = r0.getValue()
            kke r0 = (defpackage.kke) r0
            w9a r0 = (defpackage.w9a) r0
            nx3 r0 = r0.b()
            bu7 r11 = new bu7
            r4 = 0
            r11.<init>(r8, r10, r12, r4)
            r2.o = r8
            r2.X = r15
            r2.Y = r9
            r2.Z = r7
            r2.s0 = r14
            r2.t0 = r13
            r2.u0 = r1
            r2.v0 = r12
            r2.w0 = r10
            r2.x0 = r4
            r2.y0 = r5
            r2.z0 = r3
            r4 = 3
            r2.C0 = r4
            java.lang.Object r0 = defpackage.j47.t0(r0, r11, r2)
            if (r0 != r6) goto L_0x03fc
            return r6
        L_0x03fc:
            r11 = r12
            r12 = r1
        L_0x03fe:
            je7 r0 = r8.q
            java.lang.Object r0 = r0.getValue()
            t6b r0 = (defpackage.t6b) r0
            java.lang.Object r1 = r10.a
            cu8 r1 = (defpackage.cu8) r1
            p82 r4 = r8.e()
            r30 = r2
            java.lang.Object r2 = r10.a
            cu8 r2 = (defpackage.cu8) r2
            r31 = r3
            long r2 = r2.t0
            e52 r2 = r4.C(r2)
            r0.b(r2, r1)
            je7 r0 = r8.g
            java.lang.Object r0 = r0.getValue()
            av0 r0 = (defpackage.av0) r0
            l6f r1 = new l6f
            long r2 = r9.a
            java.lang.Object r4 = r10.a
            cu8 r4 = (defpackage.cu8) r4
            r10 = r5
            long r4 = r4.b
            r22 = 0
            r17 = r1
            r18 = r2
            r20 = r4
            r17.<init>(r18, r20, r22)
            r0.c(r1)
            r2 = r30
            r1 = r31
            r3 = r10
            r0 = r14
            r10 = r7
            r14 = r13
            r13 = r12
            r12 = r11
            goto L_0x046e
        L_0x044b:
            r10 = r7
            r0 = r14
            r14 = r13
            r13 = r1
            r1 = r3
            r3 = r5
            goto L_0x046e
        L_0x0452:
            r18 = r31
            r16 = r4
            r17 = r6
            r0 = r8
            r1 = r9
            r19 = r10
            r6 = r24
            r14 = r25
            r13 = r27
            r3 = r30
            r9 = r0
            r2 = r13
            r0 = r15
            r8 = r17
            r13 = r18
            r15 = r1
            r1 = r26
        L_0x046e:
            if (r10 == 0) goto L_0x049d
            long r4 = r10.c
            r31 = r0
            r30 = r1
            long r0 = r12.a
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0499
            p82 r17 = r8.e()
            k92 r0 = r9.b
            long r0 = r0.a
            long r4 = r12.a
            java.lang.String r7 = r12.Z
            r11 = r2
            r25 = r3
            long r2 = r12.c
            r18 = r7
            r19 = r0
            r21 = r4
            r23 = r2
            r17.m0(r18, r19, r21, r23)
            goto L_0x04a2
        L_0x0499:
            r11 = r2
            r25 = r3
            goto L_0x04a2
        L_0x049d:
            r31 = r0
            r30 = r1
            goto L_0x0499
        L_0x04a2:
            r1 = r30
            r5 = r8
            r19 = r10
            r2 = r11
            r0 = r15
            r3 = r25
            r15 = r31
            r11 = r9
            goto L_0x04ba
        L_0x04af:
            r3 = r30
            r11 = r0
            r0 = r1
            r2 = r13
            r5 = r17
            r13 = r18
            r1 = r26
        L_0x04ba:
            if (r15 == 0) goto L_0x04c7
            cu8 r4 = r15.a
            long r7 = r4.c
            long r9 = r12.a
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x04c7
            r3 = 1
        L_0x04c7:
            if (r14 == 0) goto L_0x04dc
            cu8 r4 = r14.a
            long r7 = r4.c
            long r9 = r12.a
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x04dc
            r4 = r6
            r6 = r13
            r7 = r16
            r13 = r19
            r1 = 1
            goto L_0x0159
        L_0x04dc:
            r4 = r6
            r6 = r13
            r7 = r16
            r13 = r19
            goto L_0x0159
        L_0x04e4:
            r17 = r0
            r6 = r4
            r16 = r7
            r7 = r11
            if (r3 == 0) goto L_0x0517
            p82 r0 = r5.e()
            long r3 = r7.a
            r0.w(r3)
            je7 r0 = r5.g
            java.lang.Object r0 = r0.getValue()
            av0 r0 = (defpackage.av0) r0
            vz2 r3 = new vz2
            long r8 = r7.a
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r8)
            java.util.List r9 = java.util.Collections.singletonList(r4)
            r12 = 0
            r13 = 0
            r10 = 0
            r11 = 0
            r14 = 124(0x7c, float:1.74E-43)
            r8 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r0.c(r3)
        L_0x0517:
            if (r1 == 0) goto L_0x0522
            p82 r0 = r5.e()
            long r3 = r7.a
            r0.o0(r3)
        L_0x0522:
            r3 = r5
            r4 = r6
            r7 = r16
            r0 = r17
            goto L_0x00c3
        L_0x052a:
            r4 = r6
            r7 = r16
            goto L_0x00c3
        L_0x052f:
            e5f r0 = defpackage.e5f.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cu7.u(java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
