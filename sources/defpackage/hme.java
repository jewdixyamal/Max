package defpackage;

import android.content.Context;
import one.me.common.drawable.SavedMessagesIconDrawable;

/* renamed from: hme  reason: default package */
public final /* synthetic */ class hme implements qj3, b66, mpe, ru0, w56, mm7, cc3 {
    public static final hme X = new hme(27);
    public static final hme Y = new hme(28);
    public static final hme b = new hme(24);
    public static final hme c = new hme(25);
    public static final hme o = new hme(26);
    public final /* synthetic */ int a;

    public /* synthetic */ hme(int i) {
        this.a = i;
    }

    public void a(v1f v1f, w1f w1f, boolean z) {
        switch (this.a) {
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                v1f.d(w1f);
                return;
            case 25:
                v1f.e(w1f);
                return;
            case 26:
                v1f.g(w1f);
                return;
            case 27:
                v1f.b();
                return;
            default:
                v1f.f();
                return;
        }
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                hm9.k("ime", "retryWhenTamHttpError: connected");
                return;
            case 3:
                Long l = (Long) obj;
                return;
            default:
                Throwable th = (Throwable) obj;
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0387  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object apply(java.lang.Object r52) {
        /*
            r51 = this;
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = 0
            r5 = 0
            r6 = 1
            r7 = r51
            int r7 = r7.a
            switch(r7) {
                case 1: goto L_0x048e;
                case 2: goto L_0x047c;
                case 5: goto L_0x0468;
                case 7: goto L_0x0456;
                case 9: goto L_0x03ce;
                case 10: goto L_0x02b2;
                case 14: goto L_0x00a2;
                case 16: goto L_0x0097;
                case 19: goto L_0x0074;
                case 20: goto L_0x0047;
                default: goto L_0x0010;
            }
        L_0x0010:
            r0 = r52
            android.os.Bundle r0 = (android.os.Bundle) r0
            java.lang.String r1 = defpackage.o0f.f
            android.os.Bundle r1 = r0.getBundle(r1)
            r1.getClass()
            rze r1 = defpackage.rze.b(r1)
            java.lang.String r2 = defpackage.o0f.g
            int[] r2 = r0.getIntArray(r2)
            int r3 = r1.a
            int[] r4 = new int[r3]
            if (r2 == 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r2 = r4
        L_0x002f:
            java.lang.String r4 = defpackage.o0f.h
            boolean[] r4 = r0.getBooleanArray(r4)
            boolean[] r3 = new boolean[r3]
            if (r4 == 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r4 = r3
        L_0x003b:
            java.lang.String r3 = defpackage.o0f.i
            boolean r0 = r0.getBoolean(r3, r5)
            o0f r3 = new o0f
            r3.<init>(r1, r0, r2, r4)
            return r3
        L_0x0047:
            r0 = r52
            o0f r0 = (defpackage.o0f) r0
            r0.getClass()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            rze r2 = r0.b
            android.os.Bundle r2 = r2.f()
            java.lang.String r3 = defpackage.o0f.f
            r1.putBundle(r3, r2)
            java.lang.String r2 = defpackage.o0f.g
            int[] r3 = r0.d
            r1.putIntArray(r2, r3)
            java.lang.String r2 = defpackage.o0f.h
            boolean[] r3 = r0.e
            r1.putBooleanArray(r2, r3)
            java.lang.String r2 = defpackage.o0f.i
            boolean r0 = r0.c
            r1.putBoolean(r2, r0)
            return r1
        L_0x0074:
            r0 = r52
            c0f r0 = (defpackage.c0f) r0
            r0.getClass()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            rze r2 = r0.a
            android.os.Bundle r2 = r2.f()
            java.lang.String r3 = defpackage.c0f.c
            r1.putBundle(r3, r2)
            zw6 r0 = r0.b
            int[] r0 = defpackage.s5c.c0(r0)
            java.lang.String r2 = defpackage.c0f.d
            r1.putIntArray(r2, r0)
            return r1
        L_0x0097:
            r0 = r52
            rze r0 = (defpackage.rze) r0
            int r0 = r0.c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x00a2:
            r7 = r52
            android.os.Bundle r7 = (android.os.Bundle) r7
            qy5 r0 = defpackage.qy5.M
            ny5 r8 = new ny5
            r8.<init>()
            if (r7 == 0) goto L_0x00ba
            java.lang.Class<nu0> r0 = defpackage.nu0.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            int r1 = defpackage.oaf.a
            r7.setClassLoader(r0)
        L_0x00ba:
            java.lang.String r0 = defpackage.qy5.N
            java.lang.String r0 = r7.getString(r0)
            qy5 r9 = defpackage.qy5.M
            java.lang.String r1 = r9.a
            if (r0 == 0) goto L_0x00c7
            goto L_0x00c8
        L_0x00c7:
            r0 = r1
        L_0x00c8:
            r8.a = r0
            java.lang.String r0 = defpackage.qy5.O
            java.lang.String r0 = r7.getString(r0)
            if (r0 == 0) goto L_0x00d3
            goto L_0x00d5
        L_0x00d3:
            java.lang.String r0 = r9.b
        L_0x00d5:
            r8.b = r0
            java.lang.String r0 = defpackage.qy5.t0
            java.util.ArrayList r0 = r7.getParcelableArrayList(r0)
            if (r0 != 0) goto L_0x00e2
            ffc r0 = defpackage.ffc.X
            goto L_0x0113
        L_0x00e2:
            ww6 r1 = defpackage.zw6.i()
            r2 = r5
        L_0x00e7:
            int r3 = r0.size()
            if (r2 >= r3) goto L_0x010f
            java.lang.Object r3 = r0.get(r2)
            android.os.Bundle r3 = (android.os.Bundle) r3
            r3.getClass()
            od7 r4 = new od7
            java.lang.String r10 = defpackage.od7.c
            java.lang.String r10 = r3.getString(r10)
            java.lang.String r11 = defpackage.od7.d
            java.lang.String r3 = r3.getString(r11)
            r3.getClass()
            r4.<init>(r10, r3)
            r1.a(r4)
            int r2 = r2 + r6
            goto L_0x00e7
        L_0x010f:
            ffc r0 = r1.j()
        L_0x0113:
            zw6 r0 = defpackage.zw6.j(r0)
            r8.c = r0
            java.lang.String r0 = defpackage.qy5.P
            java.lang.String r0 = r7.getString(r0)
            if (r0 == 0) goto L_0x0122
            goto L_0x0124
        L_0x0122:
            java.lang.String r0 = r9.d
        L_0x0124:
            r8.d = r0
            java.lang.String r0 = defpackage.qy5.Q
            int r1 = r9.e
            int r0 = r7.getInt(r0, r1)
            r8.e = r0
            java.lang.String r0 = defpackage.qy5.R
            int r1 = r9.f
            int r0 = r7.getInt(r0, r1)
            r8.f = r0
            java.lang.String r0 = defpackage.qy5.S
            int r1 = r9.g
            int r0 = r7.getInt(r0, r1)
            r8.g = r0
            java.lang.String r0 = defpackage.qy5.T
            int r1 = r9.h
            int r0 = r7.getInt(r0, r1)
            r8.h = r0
            java.lang.String r0 = defpackage.qy5.U
            java.lang.String r0 = r7.getString(r0)
            if (r0 == 0) goto L_0x0157
            goto L_0x0159
        L_0x0157:
            java.lang.String r0 = r9.j
        L_0x0159:
            r8.i = r0
            java.lang.String r0 = defpackage.qy5.V
            android.os.Parcelable r0 = r7.getParcelable(r0)
            f99 r0 = (defpackage.f99) r0
            if (r0 == 0) goto L_0x0166
            goto L_0x0168
        L_0x0166:
            f99 r0 = r9.k
        L_0x0168:
            r8.j = r0
            java.lang.String r0 = defpackage.qy5.W
            java.lang.String r0 = r7.getString(r0)
            if (r0 == 0) goto L_0x0173
            goto L_0x0175
        L_0x0173:
            java.lang.String r0 = r9.m
        L_0x0175:
            java.lang.String r0 = defpackage.ia9.l(r0)
            r8.l = r0
            java.lang.String r0 = defpackage.qy5.X
            java.lang.String r0 = r7.getString(r0)
            if (r0 == 0) goto L_0x0184
            goto L_0x0186
        L_0x0184:
            java.lang.String r0 = r9.n
        L_0x0186:
            java.lang.String r0 = defpackage.ia9.l(r0)
            r8.m = r0
            java.lang.String r0 = defpackage.qy5.Y
            int r1 = r9.o
            int r0 = r7.getInt(r0, r1)
            r8.n = r0
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x019b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = defpackage.qy5.Z
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            r1 = 36
            java.lang.String r1 = java.lang.Integer.toString(r5, r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            byte[] r0 = r7.getByteArray(r0)
            if (r0 != 0) goto L_0x02ac
            r8.p = r10
            java.lang.String r0 = defpackage.qy5.a0
            android.os.Parcelable r0 = r7.getParcelable(r0)
            dr4 r0 = (defpackage.dr4) r0
            r8.q = r0
            java.lang.String r0 = defpackage.qy5.b0
            long r1 = r9.s
            long r0 = r7.getLong(r0, r1)
            r8.r = r0
            java.lang.String r0 = defpackage.qy5.c0
            int r1 = r9.t
            int r0 = r7.getInt(r0, r1)
            r8.s = r0
            java.lang.String r0 = defpackage.qy5.d0
            int r1 = r9.u
            int r0 = r7.getInt(r0, r1)
            r8.t = r0
            java.lang.String r0 = defpackage.qy5.e0
            float r1 = r9.v
            float r0 = r7.getFloat(r0, r1)
            r8.u = r0
            java.lang.String r0 = defpackage.qy5.f0
            int r1 = r9.w
            int r0 = r7.getInt(r0, r1)
            r8.v = r0
            java.lang.String r0 = defpackage.qy5.g0
            float r1 = r9.x
            float r0 = r7.getFloat(r0, r1)
            r8.w = r0
            java.lang.String r0 = defpackage.qy5.h0
            byte[] r0 = r7.getByteArray(r0)
            r8.x = r0
            java.lang.String r0 = defpackage.qy5.i0
            int r1 = r9.z
            int r0 = r7.getInt(r0, r1)
            r8.y = r0
            java.lang.String r0 = defpackage.qy5.j0
            android.os.Bundle r0 = r7.getBundle(r0)
            if (r0 == 0) goto L_0x024c
            i63 r1 = new i63
            java.lang.String r2 = defpackage.i63.j
            r3 = -1
            int r11 = r0.getInt(r2, r3)
            java.lang.String r2 = defpackage.i63.k
            int r12 = r0.getInt(r2, r3)
            java.lang.String r2 = defpackage.i63.l
            int r13 = r0.getInt(r2, r3)
            java.lang.String r2 = defpackage.i63.m
            byte[] r16 = r0.getByteArray(r2)
            java.lang.String r2 = defpackage.i63.n
            int r14 = r0.getInt(r2, r3)
            java.lang.String r2 = defpackage.i63.o
            int r15 = r0.getInt(r2, r3)
            r10 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r8.z = r1
        L_0x024c:
            java.lang.String r0 = defpackage.qy5.k0
            int r1 = r9.B
            int r0 = r7.getInt(r0, r1)
            r8.A = r0
            java.lang.String r0 = defpackage.qy5.l0
            int r1 = r9.C
            int r0 = r7.getInt(r0, r1)
            r8.B = r0
            java.lang.String r0 = defpackage.qy5.m0
            int r1 = r9.D
            int r0 = r7.getInt(r0, r1)
            r8.C = r0
            java.lang.String r0 = defpackage.qy5.n0
            int r1 = r9.E
            int r0 = r7.getInt(r0, r1)
            r8.D = r0
            java.lang.String r0 = defpackage.qy5.o0
            int r1 = r9.F
            int r0 = r7.getInt(r0, r1)
            r8.E = r0
            java.lang.String r0 = defpackage.qy5.p0
            int r1 = r9.G
            int r0 = r7.getInt(r0, r1)
            r8.F = r0
            java.lang.String r0 = defpackage.qy5.r0
            int r1 = r9.I
            int r0 = r7.getInt(r0, r1)
            r8.H = r0
            java.lang.String r0 = defpackage.qy5.s0
            int r1 = r9.J
            int r0 = r7.getInt(r0, r1)
            r8.I = r0
            java.lang.String r0 = defpackage.qy5.q0
            int r1 = r9.K
            int r0 = r7.getInt(r0, r1)
            r8.J = r0
            qy5 r0 = new qy5
            r0.<init>(r8)
            return r0
        L_0x02ac:
            r10.add(r0)
            int r5 = r5 + r6
            goto L_0x019b
        L_0x02b2:
            r7 = r52
            android.os.Bundle r7 = (android.os.Bundle) r7
            java.lang.String r8 = defpackage.hue.h
            int r12 = r7.getInt(r8, r5)
            java.lang.String r8 = defpackage.hue.i
            long r13 = r7.getLong(r8, r1)
            java.lang.String r8 = defpackage.hue.j
            long r15 = r7.getLong(r8, r3)
            java.lang.String r8 = defpackage.hue.k
            boolean r18 = r7.getBoolean(r8, r5)
            java.lang.String r8 = defpackage.hue.l
            android.os.Bundle r7 = r7.getBundle(r8)
            if (r7 == 0) goto L_0x03bf
            java.lang.String r8 = defpackage.s8.i
            java.util.ArrayList r8 = r7.getParcelableArrayList(r8)
            if (r8 != 0) goto L_0x02e4
            q8[] r0 = new defpackage.q8[r5]
            r20 = r0
            goto L_0x039c
        L_0x02e4:
            int r9 = r8.size()
            q8[] r9 = new defpackage.q8[r9]
            r10 = r5
        L_0x02eb:
            int r11 = r8.size()
            if (r10 >= r11) goto L_0x039a
            java.lang.Object r11 = r8.get(r10)
            android.os.Bundle r11 = (android.os.Bundle) r11
            java.lang.String r0 = defpackage.q8.j
            long r20 = r11.getLong(r0)
            java.lang.String r0 = defpackage.q8.k
            int r22 = r11.getInt(r0)
            java.lang.String r0 = defpackage.q8.q
            int r23 = r11.getInt(r0)
            java.lang.String r0 = defpackage.q8.l
            java.util.ArrayList r0 = r11.getParcelableArrayList(r0)
            java.lang.String r1 = defpackage.q8.r
            java.util.ArrayList r1 = r11.getParcelableArrayList(r1)
            java.lang.String r2 = defpackage.q8.m
            int[] r2 = r11.getIntArray(r2)
            java.lang.String r3 = defpackage.q8.n
            long[] r3 = r11.getLongArray(r3)
            java.lang.String r4 = defpackage.q8.o
            long r27 = r11.getLong(r4)
            java.lang.String r4 = defpackage.q8.p
            boolean r29 = r11.getBoolean(r4)
            q8 r4 = new q8
            if (r2 != 0) goto L_0x0333
            int[] r2 = new int[r5]
        L_0x0333:
            r24 = r2
            if (r1 == 0) goto L_0x0359
            int r0 = r1.size()
            tb8[] r0 = new defpackage.tb8[r0]
            r2 = r5
        L_0x033e:
            int r11 = r1.size()
            if (r2 >= r11) goto L_0x0356
            java.lang.Object r11 = r1.get(r2)
            android.os.Bundle r11 = (android.os.Bundle) r11
            if (r11 != 0) goto L_0x034e
            r11 = 0
            goto L_0x0352
        L_0x034e:
            tb8 r11 = defpackage.tb8.b(r11)
        L_0x0352:
            r0[r2] = r11
            int r2 = r2 + r6
            goto L_0x033e
        L_0x0356:
            r25 = r0
            goto L_0x0380
        L_0x0359:
            if (r0 == 0) goto L_0x037d
            int r1 = r0.size()
            tb8[] r1 = new defpackage.tb8[r1]
            r2 = r5
        L_0x0362:
            int r11 = r0.size()
            if (r2 >= r11) goto L_0x037a
            java.lang.Object r11 = r0.get(r2)
            android.net.Uri r11 = (android.net.Uri) r11
            if (r11 != 0) goto L_0x0372
            r11 = 0
            goto L_0x0376
        L_0x0372:
            tb8 r11 = defpackage.tb8.c(r11)
        L_0x0376:
            r1[r2] = r11
            int r2 = r2 + r6
            goto L_0x0362
        L_0x037a:
            r25 = r1
            goto L_0x0380
        L_0x037d:
            tb8[] r0 = new defpackage.tb8[r5]
            goto L_0x0356
        L_0x0380:
            if (r3 != 0) goto L_0x0387
            long[] r0 = new long[r5]
            r26 = r0
            goto L_0x0389
        L_0x0387:
            r26 = r3
        L_0x0389:
            r19 = r4
            r19.<init>(r20, r22, r23, r24, r25, r26, r27, r29)
            r9[r10] = r4
            int r10 = r10 + r6
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = 0
            goto L_0x02eb
        L_0x039a:
            r20 = r9
        L_0x039c:
            java.lang.String r0 = defpackage.s8.j
            r1 = 0
            long r21 = r7.getLong(r0, r1)
            java.lang.String r0 = defpackage.s8.k
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r23 = r7.getLong(r0, r1)
            java.lang.String r0 = defpackage.s8.l
            int r25 = r7.getInt(r0, r5)
            s8 r0 = new s8
            r19 = r0
            r19.<init>(r20, r21, r23, r25)
        L_0x03bc:
            r17 = r0
            goto L_0x03c2
        L_0x03bf:
            s8 r0 = defpackage.s8.g
            goto L_0x03bc
        L_0x03c2:
            hue r0 = new hue
            r0.<init>()
            r10 = 0
            r11 = 0
            r9 = r0
            r9.j(r10, r11, r12, r13, r15, r17, r18)
            return r0
        L_0x03ce:
            r0 = r52
            android.os.Bundle r0 = (android.os.Bundle) r0
            java.lang.String r1 = defpackage.kue.t
            android.os.Bundle r1 = r0.getBundle(r1)
            if (r1 == 0) goto L_0x03e1
            tb8 r1 = defpackage.tb8.b(r1)
        L_0x03de:
            r32 = r1
            goto L_0x03e4
        L_0x03e1:
            tb8 r1 = defpackage.tb8.g
            goto L_0x03de
        L_0x03e4:
            java.lang.String r1 = defpackage.kue.u
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r34 = r0.getLong(r1, r2)
            java.lang.String r1 = defpackage.kue.v
            long r36 = r0.getLong(r1, r2)
            java.lang.String r1 = defpackage.kue.w
            long r38 = r0.getLong(r1, r2)
            java.lang.String r1 = defpackage.kue.x
            boolean r40 = r0.getBoolean(r1, r5)
            java.lang.String r1 = defpackage.kue.y
            boolean r41 = r0.getBoolean(r1, r5)
            java.lang.String r1 = defpackage.kue.z
            android.os.Bundle r1 = r0.getBundle(r1)
            if (r1 == 0) goto L_0x0416
            hb8 r1 = defpackage.hb8.b(r1)
            r42 = r1
            goto L_0x0418
        L_0x0416:
            r42 = 0
        L_0x0418:
            java.lang.String r1 = defpackage.kue.A
            boolean r1 = r0.getBoolean(r1, r5)
            java.lang.String r2 = defpackage.kue.B
            r3 = 0
            long r43 = r0.getLong(r2, r3)
            java.lang.String r2 = defpackage.kue.C
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r45 = r0.getLong(r2, r3)
            java.lang.String r2 = defpackage.kue.D
            int r47 = r0.getInt(r2, r5)
            java.lang.String r2 = defpackage.kue.E
            int r48 = r0.getInt(r2, r5)
            java.lang.String r2 = defpackage.kue.F
            r3 = 0
            long r49 = r0.getLong(r2, r3)
            kue r0 = new kue
            r30 = r0
            r0.<init>()
            java.lang.Object r31 = defpackage.kue.r
            r33 = 0
            r30.b(r31, r32, r33, r34, r36, r38, r40, r41, r42, r43, r45, r47, r48, r49)
            r0.k = r1
            return r0
        L_0x0456:
            r0 = r52
            upe r0 = (defpackage.upe) r0
            boolean r1 = r0.a
            if (r1 != 0) goto L_0x0461
            m28 r0 = defpackage.m28.a
            goto L_0x0467
        L_0x0461:
            java.lang.CharSequence r0 = r0.b
            u28 r0 = defpackage.f28.e(r0)
        L_0x0467:
            return r0
        L_0x0468:
            r0 = r52
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0477
            r5 = r6
        L_0x0477:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        L_0x047c:
            r0 = r52
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            boolean r1 = r0 instanceof one.me.sdk.transfer.exceptions.HttpUrlExpiredException
            if (r1 == 0) goto L_0x0489
            p0a r0 = defpackage.qy9.m(r0)
            goto L_0x048d
        L_0x0489:
            iz9 r0 = defpackage.qy9.g(r0)
        L_0x048d:
            return r0
        L_0x048e:
            r0 = r52
            qy9 r0 = (defpackage.qy9) r0
            hme r1 = new hme
            r2 = 2
            r1.<init>(r2)
            qy9 r0 = r0.h(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hme.apply(java.lang.Object):java.lang.Object");
    }

    public void d(Object obj, tm5 tm5) {
        ol8 ol8 = (ol8) obj;
    }

    public Object f(bg4 bg4) {
        return o2f.b((Context) bg4.a(Context.class));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: qze} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r26v2, types: [gb8] */
    /* JADX WARNING: type inference failed for: r6v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.su0 g(android.os.Bundle r36) {
        /*
            r35 = this;
            r0 = r36
            r1 = 0
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = -1
            r6 = 0
            r7 = 4
            java.lang.String r8 = ""
            r9 = 3
            r10 = 2
            r11 = 1
            r12 = 36
            r13 = 0
            r14 = r35
            int r14 = r14.a
            switch(r14) {
                case 8: goto L_0x0262;
                case 9: goto L_0x001b;
                case 10: goto L_0x001b;
                case 11: goto L_0x021d;
                case 12: goto L_0x0151;
                case 13: goto L_0x0127;
                case 14: goto L_0x001b;
                case 15: goto L_0x0105;
                case 16: goto L_0x001b;
                case 17: goto L_0x00cb;
                case 18: goto L_0x007c;
                default: goto L_0x001b;
            }
        L_0x001b:
            java.lang.String r1 = java.lang.Integer.toString(r13, r12)
            android.os.Bundle r1 = r0.getBundle(r1)
            if (r1 != 0) goto L_0x0026
            goto L_0x004d
        L_0x0026:
            ig5 r2 = defpackage.oy5.S0
            java.lang.String r3 = java.lang.Integer.toString(r13, r12)
            java.util.ArrayList r3 = r1.getParcelableArrayList(r3)
            ls5 r4 = defpackage.zw6.b
            ffc r4 = defpackage.ffc.X
            java.util.List r2 = defpackage.tu0.i(r2, r3, r4)
            java.lang.String r3 = java.lang.Integer.toString(r11, r12)
            java.lang.String r1 = r1.getString(r3, r8)
            qze r6 = new qze
            oy5[] r3 = new defpackage.oy5[r13]
            java.lang.Object[] r2 = r2.toArray(r3)
            oy5[] r2 = (defpackage.oy5[]) r2
            r6.<init>(r1, r2)
        L_0x004d:
            r6.getClass()
            java.lang.String r1 = java.lang.Integer.toString(r11, r12)
            int[] r1 = r0.getIntArray(r1)
            int r2 = r6.a
            int[] r3 = new int[r2]
            if (r1 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r1 = r3
        L_0x0060:
            java.lang.String r3 = java.lang.Integer.toString(r10, r12)
            int r3 = r0.getInt(r3, r5)
            java.lang.String r4 = java.lang.Integer.toString(r9, r12)
            boolean[] r0 = r0.getBooleanArray(r4)
            boolean[] r2 = new boolean[r2]
            if (r0 == 0) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r0 = r2
        L_0x0076:
            q0f r2 = new q0f
            r2.<init>(r6, r1, r3, r0)
            return r2
        L_0x007c:
            java.lang.String r1 = java.lang.Integer.toString(r13, r12)
            android.os.Bundle r1 = r0.getBundle(r1)
            r1.getClass()
            ig5 r2 = defpackage.oy5.S0
            java.lang.String r3 = java.lang.Integer.toString(r13, r12)
            java.util.ArrayList r3 = r1.getParcelableArrayList(r3)
            ls5 r4 = defpackage.zw6.b
            ffc r4 = defpackage.ffc.X
            java.util.List r2 = defpackage.tu0.i(r2, r3, r4)
            java.lang.String r3 = java.lang.Integer.toString(r11, r12)
            java.lang.String r1 = r1.getString(r3, r8)
            qze r3 = new qze
            oy5[] r4 = new defpackage.oy5[r13]
            qw6 r2 = (defpackage.qw6) r2
            java.lang.Object[] r2 = r2.toArray(r4)
            oy5[] r2 = (defpackage.oy5[]) r2
            r3.<init>(r1, r2)
            java.lang.String r1 = java.lang.Integer.toString(r11, r12)
            int[] r0 = r0.getIntArray(r1)
            if (r0 != 0) goto L_0x00c0
            d0f r0 = new d0f
            r0.<init>(r3)
            goto L_0x00ca
        L_0x00c0:
            d0f r1 = new d0f
            java.util.List r0 = defpackage.s5c.i(r0)
            r1.<init>(r3, r0)
            r0 = r1
        L_0x00ca:
            return r0
        L_0x00cb:
            hme r1 = defpackage.d0f.c
            java.lang.String r2 = java.lang.Integer.toString(r13, r12)
            java.util.ArrayList r0 = r0.getParcelableArrayList(r2)
            ls5 r2 = defpackage.zw6.b
            ffc r2 = defpackage.ffc.X
            java.util.List r0 = defpackage.tu0.i(r1, r0, r2)
            jn r1 = new jn
            r1.<init>((int) r7)
        L_0x00e2:
            r2 = r0
            ffc r2 = (defpackage.ffc) r2
            int r2 = r2.o
            if (r13 >= r2) goto L_0x00f9
            r2 = r0
            ffc r2 = (defpackage.ffc) r2
            java.lang.Object r2 = r2.get(r13)
            d0f r2 = (defpackage.d0f) r2
            qze r3 = r2.a
            r1.I(r3, r2)
            int r13 = r13 + r11
            goto L_0x00e2
        L_0x00f9:
            e0f r0 = new e0f
            cx6 r1 = r1.j()
            kfc r1 = (defpackage.kfc) r1
            r0.<init>(r1)
            return r0
        L_0x0105:
            hme r1 = defpackage.qze.X
            java.lang.String r2 = java.lang.Integer.toString(r13, r12)
            java.util.ArrayList r0 = r0.getParcelableArrayList(r2)
            ls5 r2 = defpackage.zw6.b
            ffc r2 = defpackage.ffc.X
            java.util.List r0 = defpackage.tu0.i(r1, r0, r2)
            sze r1 = new sze
            qze[] r2 = new defpackage.qze[r13]
            qw6 r0 = (defpackage.qw6) r0
            java.lang.Object[] r0 = r0.toArray(r2)
            qze[] r0 = (defpackage.qze[]) r0
            r1.<init>(r0)
            return r1
        L_0x0127:
            ig5 r1 = defpackage.oy5.S0
            java.lang.String r2 = java.lang.Integer.toString(r13, r12)
            java.util.ArrayList r2 = r0.getParcelableArrayList(r2)
            ls5 r3 = defpackage.zw6.b
            ffc r3 = defpackage.ffc.X
            java.util.List r1 = defpackage.tu0.i(r1, r2, r3)
            java.lang.String r2 = java.lang.Integer.toString(r11, r12)
            java.lang.String r0 = r0.getString(r2, r8)
            qze r2 = new qze
            oy5[] r3 = new defpackage.oy5[r13]
            qw6 r1 = (defpackage.qw6) r1
            java.lang.Object[] r1 = r1.toArray(r3)
            oy5[] r1 = (defpackage.oy5[]) r1
            r2.<init>(r0, r1)
            return r2
        L_0x0151:
            java.lang.String r5 = java.lang.Integer.toString(r11, r12)
            android.os.Bundle r5 = r0.getBundle(r5)
            if (r5 == 0) goto L_0x0166
            wa8 r8 = defpackage.rb8.Y
            su0 r5 = r8.g(r5)
            rb8 r5 = (defpackage.rb8) r5
            r16 = r5
            goto L_0x0168
        L_0x0166:
            r16 = r6
        L_0x0168:
            java.lang.String r5 = java.lang.Integer.toString(r10, r12)
            long r18 = r0.getLong(r5, r3)
            java.lang.String r5 = java.lang.Integer.toString(r9, r12)
            long r20 = r0.getLong(r5, r3)
            java.lang.String r5 = java.lang.Integer.toString(r7, r12)
            long r22 = r0.getLong(r5, r3)
            r5 = 5
            java.lang.String r5 = java.lang.Integer.toString(r5, r12)
            boolean r24 = r0.getBoolean(r5, r13)
            r5 = 6
            java.lang.String r5 = java.lang.Integer.toString(r5, r12)
            boolean r25 = r0.getBoolean(r5, r13)
            r5 = 7
            java.lang.String r5 = java.lang.Integer.toString(r5, r12)
            android.os.Bundle r5 = r0.getBundle(r5)
            if (r5 == 0) goto L_0x01cf
            gb8 r6 = new gb8
            java.lang.String r8 = java.lang.Integer.toString(r13, r12)
            long r27 = r5.getLong(r8, r3)
            java.lang.String r8 = java.lang.Integer.toString(r11, r12)
            long r29 = r5.getLong(r8, r3)
            java.lang.String r8 = java.lang.Integer.toString(r10, r12)
            long r31 = r5.getLong(r8, r3)
            java.lang.String r8 = java.lang.Integer.toString(r9, r12)
            r9 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            float r33 = r5.getFloat(r8, r9)
            java.lang.String r7 = java.lang.Integer.toString(r7, r12)
            float r34 = r5.getFloat(r7, r9)
            r26 = r6
            r26.<init>(r27, r29, r31, r33, r34)
        L_0x01cf:
            r26 = r6
            r5 = 8
            java.lang.String r5 = java.lang.Integer.toString(r5, r12)
            boolean r5 = r0.getBoolean(r5, r13)
            r6 = 9
            java.lang.String r6 = java.lang.Integer.toString(r6, r12)
            long r27 = r0.getLong(r6, r1)
            r6 = 10
            java.lang.String r6 = java.lang.Integer.toString(r6, r12)
            long r29 = r0.getLong(r6, r3)
            r3 = 11
            java.lang.String r3 = java.lang.Integer.toString(r3, r12)
            int r31 = r0.getInt(r3, r13)
            r3 = 12
            java.lang.String r3 = java.lang.Integer.toString(r3, r12)
            int r32 = r0.getInt(r3, r13)
            r3 = 13
            java.lang.String r3 = java.lang.Integer.toString(r3, r12)
            long r33 = r0.getLong(r3, r1)
            jue r0 = new jue
            r14 = r0
            r0.<init>()
            java.lang.Object r15 = defpackage.jue.D0
            r17 = 0
            r14.b(r15, r16, r17, r18, r20, r22, r24, r25, r26, r27, r29, r31, r32, r33)
            r0.w0 = r5
            return r0
        L_0x021d:
            java.lang.String r5 = java.lang.Integer.toString(r13, r12)
            int r17 = r0.getInt(r5, r13)
            java.lang.String r5 = java.lang.Integer.toString(r11, r12)
            long r18 = r0.getLong(r5, r3)
            java.lang.String r3 = java.lang.Integer.toString(r10, r12)
            long r20 = r0.getLong(r3, r1)
            java.lang.String r1 = java.lang.Integer.toString(r9, r12)
            boolean r23 = r0.getBoolean(r1)
            java.lang.String r1 = java.lang.Integer.toString(r7, r12)
            android.os.Bundle r0 = r0.getBundle(r1)
            if (r0 == 0) goto L_0x0252
            xw0 r1 = defpackage.r8.s0
            su0 r0 = r1.g(r0)
            r8 r0 = (defpackage.r8) r0
        L_0x024f:
            r22 = r0
            goto L_0x0255
        L_0x0252:
            r8 r0 = defpackage.r8.Y
            goto L_0x024f
        L_0x0255:
            gue r0 = new gue
            r0.<init>()
            r15 = 0
            r16 = 0
            r14 = r0
            r14.h(r15, r16, r17, r18, r20, r22, r23)
            return r0
        L_0x0262:
            java.lang.String r1 = java.lang.Integer.toString(r13, r12)
            int r1 = r0.getInt(r1, r5)
            if (r1 != r9) goto L_0x026e
            r1 = r11
            goto L_0x026f
        L_0x026e:
            r1 = r13
        L_0x026f:
            defpackage.np8.d(r1)
            java.lang.String r1 = java.lang.Integer.toString(r11, r12)
            boolean r1 = r0.getBoolean(r1, r13)
            if (r1 == 0) goto L_0x028a
            kte r1 = new kte
            java.lang.String r2 = java.lang.Integer.toString(r10, r12)
            boolean r0 = r0.getBoolean(r2, r13)
            r1.<init>(r0)
            goto L_0x028f
        L_0x028a:
            kte r1 = new kte
            r1.<init>()
        L_0x028f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hme.g(android.os.Bundle):su0");
    }
}
