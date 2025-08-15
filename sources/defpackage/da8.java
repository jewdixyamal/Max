package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.view.Surface;
import androidx.media3.common.PlaybackException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: da8  reason: default package */
public final class da8 implements z88 {
    public final Context a;
    public final a98 b;
    public final obd c;
    public final pm7 d;
    public final ba8 e;
    public final ao0 f;
    public qz7 g;
    public q68 h;
    public boolean i;
    public boolean j;
    public ca8 k = new ca8();
    public ca8 l = new ca8();
    public ai3 m;
    public long n;
    public long o;

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, ai3] */
    public da8(Context context, a98 a98, obd obd, Looper looper, imc imc) {
        ? obj = new Object();
        obj.a = m4b.F.l(xqb.g);
        obj.b = z9d.b;
        obj.c = k3b.b;
        obj.o = ffc.X;
        obj.X = Bundle.EMPTY;
        obj.Y = null;
        this.m = obj;
        this.d = new pm7(looper, she.a, new z98(this));
        this.a = context;
        this.b = a98;
        this.e = new ba8(this, looper);
        this.c = obd;
        this.f = imc;
        this.n = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    public static List i(List list) {
        if (list == null) {
            return Collections.emptyList();
        }
        ph4 ph4 = j47.X;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static i3b j(i3b i3b) {
        i3b i3b2 = i3b;
        if (i3b2 == null) {
            return null;
        }
        if (i3b2.o > 0.0f) {
            return i3b2;
        }
        z04.c0("Adjusting playback speed to 1.0f because negative playback speed isn't supported.");
        ArrayList arrayList = new ArrayList();
        AbstractCollection abstractCollection = i3b2.t0;
        if (abstractCollection != null) {
            arrayList.addAll(abstractCollection);
        }
        return new i3b(i3b2.a, i3b2.b, i3b2.c, 1.0f, i3b2.X, i3b2.Y, i3b2.Z, i3b2.s0, arrayList, i3b2.u0, i3b2.v0);
    }

    public static p3b o(int i2, tb8 tb8, long j2, boolean z) {
        return new p3b((Object) null, i2, tb8, (Object) null, i2, j2, j2, z ? 0 : -1, z ? 0 : -1);
    }

    public final long A() {
        return c();
    }

    public final void A0(int i2, tb8 tb8) {
        s0(zw6.n(tb8), i2, i2 + 1);
    }

    public final int B() {
        return p0();
    }

    public final jlf C() {
        z04.c0("Session doesn't support getting VideoSize");
        return jlf.e;
    }

    public final void C0(tb8 tb8) {
        U0(tb8);
    }

    public final void D() {
        this.g.R().g.skipToPrevious();
    }

    public final void D0() {
        N(1);
    }

    public final void E() {
        T(p0(), 0);
    }

    public final boolean E0() {
        return ((m4b) this.m.a).i;
    }

    public final h30 F() {
        return ((m4b) this.m.a).o;
    }

    public final j0f F0() {
        return j0f.C;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v32, resolved type: z9d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v48, resolved type: zw6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: wqb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: tb8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: tb8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: wqb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: wqb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v50, resolved type: tb8} */
    /* JADX WARNING: type inference failed for: r0v2, types: [ed8, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v52, types: [java.util.AbstractCollection, java.util.List] */
    /* JADX WARNING: type inference failed for: r9v42, types: [java.util.AbstractCollection, java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void G(boolean r86, defpackage.ca8 r87) {
        /*
            r85 = this;
            r0 = r85
            r2 = r87
            boolean r4 = r0.i
            if (r4 != 0) goto L_0x07bd
            boolean r4 = r0.j
            if (r4 != 0) goto L_0x000e
            goto L_0x07bd
        L_0x000e:
            ca8 r4 = r0.k
            ai3 r5 = r0.m
            qz7 r6 = r0.g
            java.lang.Object r6 = r6.b
            e98 r6 = (defpackage.e98) r6
            android.media.session.MediaController r6 = r6.a
            java.lang.String r6 = r6.getPackageName()
            qz7 r7 = r0.g
            java.lang.Object r7 = r7.b
            e98 r7 = (defpackage.e98) r7
            android.media.session.MediaController r7 = r7.a
            long r7 = r7.getFlags()
            qz7 r9 = r0.g
            java.lang.Object r9 = r9.b
            e98 r9 = (defpackage.e98) r9
            ai8 r9 = r9.e
            pr6 r9 = r9.a()
            if (r9 == 0) goto L_0x003a
            r9 = 1
            goto L_0x003b
        L_0x003a:
            r9 = 0
        L_0x003b:
            qz7 r11 = r0.g
            java.lang.Object r11 = r11.b
            e98 r11 = (defpackage.e98) r11
            android.media.session.MediaController r11 = r11.a
            int r11 = r11.getRatingType()
            a98 r12 = r0.b
            long r13 = r12.Y
            qz7 r15 = r0.g
            int r1 = defpackage.oaf.a
            r10 = 30
            if (r1 >= r10) goto L_0x0055
        L_0x0053:
            r1 = 0
            goto L_0x0066
        L_0x0055:
            java.lang.Object r1 = r15.b
            e98 r1 = (defpackage.e98) r1
            android.media.session.MediaController r1 = r1.a
            android.media.session.MediaController$PlaybackInfo r1 = r1.getPlaybackInfo()
            if (r1 != 0) goto L_0x0062
            goto L_0x0053
        L_0x0062:
            java.lang.String r1 = r1.getVolumeControlId()
        L_0x0066:
            java.util.List r10 = r4.d
            java.util.List r15 = r2.d
            if (r10 == r15) goto L_0x006e
            r10 = 1
            goto L_0x006f
        L_0x006e:
            r10 = 0
        L_0x006f:
            java.lang.String r3 = "initialCapacity"
            if (r10 == 0) goto L_0x00ce
            xqb r18 = defpackage.xqb.g
            r18 = r12
            r12 = 4
            defpackage.wmd.i(r12, r3)
            r19 = r1
            java.lang.Object[] r1 = new java.lang.Object[r12]
            r20 = r6
            r21 = r13
            r6 = 0
            r12 = 0
        L_0x0085:
            int r13 = r15.size()
            if (r12 >= r13) goto L_0x00c1
            java.lang.Object r13 = r15.get(r12)
            yh8 r13 = (defpackage.yh8) r13
            jx6 r14 = defpackage.gf7.a
            ja8 r14 = r13.a
            tb8 r24 = defpackage.gf7.h(r14)
            wqb r14 = new wqb
            r27 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r29 = r7
            long r7 = r13.b
            r23 = r14
            r25 = r7
            r23.<init>(r24, r25, r27)
            r7 = 1
            int r8 = r6 + 1
            int r13 = r1.length
            if (r13 >= r8) goto L_0x00ba
            int r13 = r1.length
            int r13 = defpackage.pw6.h(r13, r8)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r13)
        L_0x00ba:
            r1[r6] = r14
            int r12 = r12 + r7
            r6 = r8
            r7 = r29
            goto L_0x0085
        L_0x00c1:
            r29 = r7
            xqb r7 = new xqb
            ffc r1 = defpackage.zw6.h(r6, r1)
            r6 = 0
            r7.<init>(r1, r6)
            goto L_0x00e9
        L_0x00ce:
            r19 = r1
            r20 = r6
            r29 = r7
            r18 = r12
            r21 = r13
            java.lang.Object r1 = r5.a
            m4b r1 = (defpackage.m4b) r1
            mue r1 = r1.j
            xqb r1 = (defpackage.xqb) r1
            xqb r7 = new xqb
            zw6 r6 = r1.e
            wqb r1 = r1.f
            r7.<init>(r6, r1)
        L_0x00e9:
            hd8 r1 = r4.c
            hd8 r6 = r2.c
            if (r1 != r6) goto L_0x00f4
            if (r86 == 0) goto L_0x00f2
            goto L_0x00f4
        L_0x00f2:
            r1 = 0
            goto L_0x00f5
        L_0x00f4:
            r1 = 1
        L_0x00f5:
            i3b r8 = r4.b
            if (r8 != 0) goto L_0x00fc
            r14 = -1
            goto L_0x00fe
        L_0x00fc:
            long r14 = r8.u0
        L_0x00fe:
            i3b r12 = r2.b
            if (r12 != 0) goto L_0x0108
            r25 = r8
            r13 = r9
            r8 = -1
            goto L_0x010d
        L_0x0108:
            r25 = r8
            r13 = r9
            long r8 = r12.u0
        L_0x010d:
            int r14 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r14 != 0) goto L_0x0119
            if (r86 == 0) goto L_0x0114
            goto L_0x0119
        L_0x0114:
            r15 = r12
            r26 = r13
            r14 = 0
            goto L_0x011d
        L_0x0119:
            r15 = r12
            r26 = r13
            r14 = 1
        L_0x011d:
            long r12 = defpackage.gf7.d(r6)
            if (r1 != 0) goto L_0x013d
            if (r14 != 0) goto L_0x013d
            if (r10 == 0) goto L_0x0128
            goto L_0x013d
        L_0x0128:
            java.lang.Object r1 = r5.a
            m4b r1 = (defpackage.m4b) r1
            qad r8 = r1.c
            p3b r8 = r8.a
            int r8 = r8.b
            gd8 r1 = r1.z
            r75 = r1
            r24 = r3
            r23 = r15
            r1 = 0
            goto L_0x0207
        L_0x013d:
            java.util.List r10 = r2.d
            if (r10 == 0) goto L_0x0147
            r23 = -1
            int r23 = (r8 > r23 ? 1 : (r8 == r23 ? 0 : -1))
            if (r23 != 0) goto L_0x014c
        L_0x0147:
            r24 = r3
            r23 = r15
            goto L_0x016d
        L_0x014c:
            r23 = r15
            r15 = 0
        L_0x014f:
            int r0 = r10.size()
            if (r15 >= r0) goto L_0x016b
            java.lang.Object r0 = r10.get(r15)
            yh8 r0 = (defpackage.yh8) r0
            r24 = r3
            long r2 = r0.b
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0164
            goto L_0x016e
        L_0x0164:
            r0 = 1
            int r15 = r15 + r0
            r2 = r87
            r3 = r24
            goto L_0x014f
        L_0x016b:
            r24 = r3
        L_0x016d:
            r15 = -1
        L_0x016e:
            if (r6 == 0) goto L_0x0172
            r0 = 1
            goto L_0x0173
        L_0x0172:
            r0 = 0
        L_0x0173:
            if (r0 == 0) goto L_0x017c
            if (r1 == 0) goto L_0x017c
            gd8 r2 = defpackage.gf7.k(r6, r11)
            goto L_0x0199
        L_0x017c:
            if (r0 != 0) goto L_0x0193
            if (r14 == 0) goto L_0x0193
            r2 = -1
            if (r15 != r2) goto L_0x0186
            gd8 r2 = defpackage.gd8.J
            goto L_0x0199
        L_0x0186:
            java.lang.Object r2 = r10.get(r15)
            yh8 r2 = (defpackage.yh8) r2
            ja8 r2 = r2.a
            gd8 r2 = defpackage.gf7.j(r2, r11)
            goto L_0x0199
        L_0x0193:
            java.lang.Object r2 = r5.a
            m4b r2 = (defpackage.m4b) r2
            gd8 r2 = r2.z
        L_0x0199:
            zw6 r3 = r7.e
            r8 = -1
            if (r15 != r8) goto L_0x01df
            if (r1 == 0) goto L_0x01dc
            if (r0 == 0) goto L_0x01d4
            java.lang.String r0 = "Adding a fake MediaItem at the end of the list because there's no QueueItem with the active queue id and current Timeline should have currently playing MediaItem."
            defpackage.z04.c0(r0)
            android.os.Bundle r0 = r6.a
            java.lang.String r1 = "android.media.metadata.MEDIA_ID"
            java.lang.CharSequence r0 = r0.getCharSequence(r1)
            if (r0 == 0) goto L_0x01b6
            java.lang.String r0 = r0.toString()
            goto L_0x01b7
        L_0x01b6:
            r0 = 0
        L_0x01b7:
            tb8 r32 = defpackage.gf7.i(r0, r6, r11)
            xqb r7 = new xqb
            wqb r0 = new wqb
            r33 = -1
            r31 = r0
            r35 = r12
            r31.<init>(r32, r33, r35)
            r7.<init>(r3, r0)
            int r0 = r7.p()
            r1 = 1
            int r0 = r0 - r1
            r15 = r0
            r1 = 0
            goto L_0x0204
        L_0x01d4:
            xqb r7 = new xqb
            r1 = 0
            r7.<init>(r3, r1)
        L_0x01da:
            r15 = 0
            goto L_0x0204
        L_0x01dc:
            r1 = 0
            r8 = -1
            goto L_0x01e0
        L_0x01df:
            r1 = 0
        L_0x01e0:
            if (r15 == r8) goto L_0x01da
            xqb r7 = new xqb
            r7.<init>(r3, r1)
            if (r0 == 0) goto L_0x0204
            int r0 = r7.p()
            if (r15 < r0) goto L_0x01f1
            r0 = r1
            goto L_0x01f7
        L_0x01f1:
            wqb r0 = r7.v(r15)
            tb8 r0 = r0.a
        L_0x01f7:
            r0.getClass()
            java.lang.String r0 = r0.a
            tb8 r0 = defpackage.gf7.i(r0, r6, r11)
            xqb r7 = r7.s(r15, r0, r12)
        L_0x0204:
            r75 = r2
            r8 = r15
        L_0x0207:
            java.lang.CharSequence r0 = r4.e
            r2 = r87
            java.lang.CharSequence r3 = r2.e
            if (r0 != r3) goto L_0x0218
            java.lang.Object r0 = r5.a
            m4b r0 = (defpackage.m4b) r0
            gd8 r0 = r0.m
        L_0x0215:
            r62 = r0
            goto L_0x022b
        L_0x0218:
            if (r3 != 0) goto L_0x021d
            gd8 r0 = defpackage.gd8.J
            goto L_0x0215
        L_0x021d:
            ed8 r0 = new ed8
            r0.<init>()
            r0.a = r3
            gd8 r3 = new gd8
            r3.<init>(r0)
            r0 = r3
            goto L_0x0215
        L_0x022b:
            int r0 = r2.f
            int r0 = defpackage.gf7.s(r0)
            int r3 = r2.g
            boolean r58 = defpackage.gf7.u(r3)
            r4 = r23
            r3 = r25
            if (r3 == r4) goto L_0x0330
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            ffc r9 = defpackage.y9d.d
            r10 = 0
        L_0x0245:
            int r11 = r9.o
            if (r10 >= r11) goto L_0x025e
            y9d r11 = new y9d
            java.lang.Object r14 = r9.get(r10)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            r11.<init>(r14)
            r3.add(r11)
            r11 = 1
            int r10 = r10 + r11
            goto L_0x0245
        L_0x025e:
            if (r26 != 0) goto L_0x027a
            java.util.Iterator r9 = r3.iterator()
        L_0x0264:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x027a
            java.lang.Object r10 = r9.next()
            y9d r10 = (defpackage.y9d) r10
            int r11 = r10.a
            r14 = 40010(0x9c4a, float:5.6066E-41)
            if (r11 != r14) goto L_0x0264
            r3.remove(r10)
        L_0x027a:
            if (r4 == 0) goto L_0x02a1
            java.util.AbstractCollection r9 = r4.t0
            if (r9 == 0) goto L_0x02a1
            java.util.Iterator r9 = r9.iterator()
        L_0x0284:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x02a1
            java.lang.Object r10 = r9.next()
            h3b r10 = (defpackage.h3b) r10
            java.lang.String r11 = r10.a
            y9d r14 = new y9d
            android.os.Bundle r10 = r10.o
            if (r10 != 0) goto L_0x029a
            android.os.Bundle r10 = android.os.Bundle.EMPTY
        L_0x029a:
            r14.<init>(r11, r10)
            r3.add(r14)
            goto L_0x0284
        L_0x02a1:
            z9d r9 = new z9d
            r9.<init>(r3)
            if (r4 != 0) goto L_0x02b0
            ls5 r3 = defpackage.zw6.b
            ffc r3 = defpackage.ffc.X
        L_0x02ac:
            r24 = r9
            goto L_0x032d
        L_0x02b0:
            java.util.AbstractCollection r3 = r4.t0
            if (r3 != 0) goto L_0x02b9
            ls5 r3 = defpackage.zw6.b
            ffc r3 = defpackage.ffc.X
            goto L_0x02ac
        L_0x02b9:
            r11 = r24
            r10 = 4
            defpackage.wmd.i(r10, r11)
            java.lang.Object[] r11 = new java.lang.Object[r10]
            java.util.Iterator r3 = r3.iterator()
            r10 = 0
        L_0x02c6:
            boolean r14 = r3.hasNext()
            if (r14 == 0) goto L_0x0327
            java.lang.Object r14 = r3.next()
            h3b r14 = (defpackage.h3b) r14
            java.lang.String r15 = r14.a
            android.os.Bundle r1 = r14.o
            if (r1 == 0) goto L_0x02e6
            r23 = r3
            java.lang.String r3 = "androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT"
            r24 = r9
            r9 = 0
            int r3 = r1.getInt(r3, r9)
            r34 = r3
            goto L_0x02ec
        L_0x02e6:
            r23 = r3
            r24 = r9
            r34 = 0
        L_0x02ec:
            android.os.Bundle r38 = android.os.Bundle.EMPTY
            y9d r3 = new y9d
            if (r1 != 0) goto L_0x02f4
            r1 = r38
        L_0x02f4:
            r3.<init>(r15, r1)
            c73 r1 = new c73
            java.lang.CharSequence r9 = r14.b
            r39 = 1
            r33 = -1
            int r14 = r14.c
            r36 = 0
            r31 = r1
            r32 = r3
            r35 = r14
            r37 = r9
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39)
            r3 = 1
            int r9 = r10 + 1
            int r3 = r11.length
            if (r3 >= r9) goto L_0x031e
            int r3 = r11.length
            int r3 = defpackage.pw6.h(r3, r9)
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r11, r3)
            r11 = r3
        L_0x031e:
            r11[r10] = r1
            r10 = r9
            r3 = r23
            r9 = r24
            r1 = 0
            goto L_0x02c6
        L_0x0327:
            r24 = r9
            ffc r3 = defpackage.zw6.h(r10, r11)
        L_0x032d:
            r9 = r24
            goto L_0x033a
        L_0x0330:
            java.lang.Object r1 = r5.b
            r9 = r1
            z9d r9 = (defpackage.z9d) r9
            java.lang.Object r1 = r5.o
            r3 = r1
            zw6 r3 = (defpackage.zw6) r3
        L_0x033a:
            f98 r1 = r2.a
            if (r1 == 0) goto L_0x0341
            int r10 = r1.c
            goto L_0x0342
        L_0x0341:
            r10 = 0
        L_0x0342:
            rm5 r11 = new rm5
            r14 = 1
            r11.<init>(r14)
            if (r4 != 0) goto L_0x034f
            r25 = r3
            r14 = 0
            goto L_0x0353
        L_0x034f:
            long r14 = r4.X
            r25 = r3
        L_0x0353:
            r2 = 4
            boolean r27 = defpackage.gf7.y(r14, r2)
            if (r27 == 0) goto L_0x0366
            r2 = 2
            boolean r2 = defpackage.gf7.y(r14, r2)
            if (r2 != 0) goto L_0x0364
            goto L_0x0366
        L_0x0364:
            r2 = 1
            goto L_0x036f
        L_0x0366:
            r2 = 512(0x200, double:2.53E-321)
            boolean r2 = defpackage.gf7.y(r14, r2)
            if (r2 == 0) goto L_0x0372
            goto L_0x0364
        L_0x036f:
            r11.a(r2)
        L_0x0372:
            r2 = 16384(0x4000, double:8.0948E-320)
            boolean r2 = defpackage.gf7.y(r14, r2)
            r3 = 2
            if (r2 == 0) goto L_0x037e
            r11.a(r3)
        L_0x037e:
            r2 = r4
            r3 = 32768(0x8000, double:1.61895E-319)
            boolean r3 = defpackage.gf7.y(r14, r3)
            if (r3 == 0) goto L_0x0390
            r3 = 1024(0x400, double:5.06E-321)
            boolean r3 = defpackage.gf7.y(r14, r3)
            if (r3 != 0) goto L_0x03b2
        L_0x0390:
            r3 = 65536(0x10000, double:3.2379E-319)
            boolean r3 = defpackage.gf7.y(r14, r3)
            if (r3 == 0) goto L_0x03a1
            r3 = 2048(0x800, double:1.0118E-320)
            boolean r3 = defpackage.gf7.y(r14, r3)
            if (r3 != 0) goto L_0x03b2
        L_0x03a1:
            r3 = 131072(0x20000, double:6.47582E-319)
            boolean r3 = defpackage.gf7.y(r14, r3)
            if (r3 == 0) goto L_0x03bc
            r3 = 8192(0x2000, double:4.0474E-320)
            boolean r3 = defpackage.gf7.y(r14, r3)
            if (r3 == 0) goto L_0x03bc
        L_0x03b2:
            r3 = 31
            r4 = 2
            int[] r3 = new int[]{r3, r4}
            r11.c(r3)
        L_0x03bc:
            r3 = 8
            boolean r3 = defpackage.gf7.y(r14, r3)
            if (r3 == 0) goto L_0x03c9
            r3 = 11
            r11.a(r3)
        L_0x03c9:
            r3 = 64
            boolean r3 = defpackage.gf7.y(r14, r3)
            if (r3 == 0) goto L_0x03d6
            r3 = 12
            r11.a(r3)
        L_0x03d6:
            r3 = 256(0x100, double:1.265E-321)
            boolean r3 = defpackage.gf7.y(r14, r3)
            r4 = 5
            r84 = r9
            if (r3 == 0) goto L_0x03e9
            r3 = 4
            int[] r9 = new int[]{r4, r3}
            r11.c(r9)
        L_0x03e9:
            r3 = r5
            r4 = 32
            boolean r4 = defpackage.gf7.y(r14, r4)
            if (r4 == 0) goto L_0x03fd
            r4 = 9
            r5 = 8
            int[] r4 = new int[]{r4, r5}
            r11.c(r4)
        L_0x03fd:
            r4 = 16
            boolean r4 = defpackage.gf7.y(r14, r4)
            r5 = 7
            if (r4 == 0) goto L_0x040e
            r4 = 6
            int[] r9 = new int[]{r5, r4}
            r11.c(r9)
        L_0x040e:
            r4 = r6
            r5 = 4194304(0x400000, double:2.0722615E-317)
            boolean r5 = defpackage.gf7.y(r14, r5)
            if (r5 == 0) goto L_0x041d
            r5 = 13
            r11.a(r5)
        L_0x041d:
            r5 = 1
            boolean r5 = defpackage.gf7.y(r14, r5)
            r6 = 3
            if (r5 == 0) goto L_0x0429
            r11.a(r6)
        L_0x0429:
            r5 = 34
            r9 = 26
            r6 = 1
            if (r10 != r6) goto L_0x0439
            int[] r5 = new int[]{r9, r5}
            r11.c(r5)
        L_0x0437:
            r5 = 6
            goto L_0x0448
        L_0x0439:
            r6 = 2
            if (r10 != r6) goto L_0x0437
            r6 = 25
            r10 = 33
            int[] r5 = new int[]{r9, r5, r6, r10}
            r11.c(r5)
            goto L_0x0437
        L_0x0448:
            int[] r5 = new int[r5]
            r5 = {23, 17, 18, 16, 21, 32} // fill-array
            r11.c(r5)
            r5 = 4
            long r5 = r29 & r5
            r9 = 0
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x046c
            r5 = 20
            r11.a(r5)
            r5 = 4096(0x1000, double:2.0237E-320)
            boolean r5 = defpackage.gf7.y(r14, r5)
            if (r5 == 0) goto L_0x046c
            r5 = 10
            r11.a(r5)
        L_0x046c:
            if (r26 == 0) goto L_0x048a
            r5 = 262144(0x40000, double:1.295163E-318)
            boolean r5 = defpackage.gf7.y(r14, r5)
            if (r5 == 0) goto L_0x047c
            r5 = 15
            r11.a(r5)
        L_0x047c:
            r5 = 2097152(0x200000, double:1.0361308E-317)
            boolean r5 = defpackage.gf7.y(r14, r5)
            if (r5 == 0) goto L_0x048a
            r5 = 14
            r11.a(r5)
        L_0x048a:
            k3b r5 = new k3b
            tm5 r6 = r11.e()
            r5.<init>(r6)
            androidx.media3.common.PlaybackException r50 = defpackage.gf7.m(r2)
            if (r2 != 0) goto L_0x04a0
            r6 = 0
            r11 = r85
        L_0x049c:
            r9 = r21
            goto L_0x0564
        L_0x04a0:
            int r6 = r2.a
            r9 = 7
            if (r6 == r9) goto L_0x04a9
            int r6 = r2.Y
            if (r6 != 0) goto L_0x04ad
        L_0x04a9:
            r11 = r85
            goto L_0x0561
        L_0x04ad:
            int r6 = defpackage.gf7.t(r6)
            iad r9 = new iad
            java.lang.CharSequence r10 = r2.Z
            if (r10 == 0) goto L_0x04bf
            java.lang.String r10 = r10.toString()
            r11 = r85
            goto L_0x0554
        L_0x04bf:
            r10 = -100
            r11 = r85
            android.content.Context r14 = r11.a
            if (r6 == r10) goto L_0x054e
            r10 = 1
            if (r6 == r10) goto L_0x0547
            r10 = -6
            if (r6 == r10) goto L_0x0540
            r10 = -5
            if (r6 == r10) goto L_0x0539
            r10 = -4
            if (r6 == r10) goto L_0x0532
            r10 = -3
            if (r6 == r10) goto L_0x052b
            r10 = -2
            if (r6 == r10) goto L_0x0524
            switch(r6) {
                case -110: goto L_0x051d;
                case -109: goto L_0x0516;
                case -108: goto L_0x050f;
                case -107: goto L_0x0508;
                case -106: goto L_0x0501;
                case -105: goto L_0x04fa;
                case -104: goto L_0x04f3;
                case -103: goto L_0x04ec;
                case -102: goto L_0x04e4;
                default: goto L_0x04dc;
            }
        L_0x04dc:
            int r10 = defpackage.c1c.error_message_fallback
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x04e4:
            int r10 = defpackage.c1c.error_message_authentication_expired
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x04ec:
            int r10 = defpackage.c1c.error_message_premium_account_required
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x04f3:
            int r10 = defpackage.c1c.error_message_concurrent_stream_limit
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x04fa:
            int r10 = defpackage.c1c.error_message_parental_control_restricted
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x0501:
            int r10 = defpackage.c1c.error_message_not_available_in_region
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x0508:
            int r10 = defpackage.c1c.error_message_skip_limit_reached
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x050f:
            int r10 = defpackage.c1c.error_message_setup_required
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x0516:
            int r10 = defpackage.c1c.error_message_end_of_playlist
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x051d:
            int r10 = defpackage.c1c.error_message_content_already_playing
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x0524:
            int r10 = defpackage.c1c.error_message_invalid_state
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x052b:
            int r10 = defpackage.c1c.error_message_bad_value
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x0532:
            int r10 = defpackage.c1c.error_message_permission_denied
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x0539:
            int r10 = defpackage.c1c.error_message_io
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x0540:
            int r10 = defpackage.c1c.error_message_not_supported
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x0547:
            int r10 = defpackage.c1c.error_message_info_cancelled
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x054e:
            int r10 = defpackage.c1c.error_message_disconnected
            java.lang.String r10 = r14.getString(r10)
        L_0x0554:
            android.os.Bundle r14 = r2.v0
            if (r14 == 0) goto L_0x0559
            goto L_0x055b
        L_0x0559:
            android.os.Bundle r14 = android.os.Bundle.EMPTY
        L_0x055b:
            r9.<init>(r10, r6, r14)
            r6 = r9
            goto L_0x049c
        L_0x0561:
            r6 = 0
            goto L_0x049c
        L_0x0564:
            long r14 = defpackage.gf7.c(r2, r4, r9)
            long r47 = defpackage.gf7.a(r2, r4, r9)
            r16 = r5
            r21 = r6
            long r5 = defpackage.gf7.a(r2, r4, r9)
            r26 = r12
            long r11 = defpackage.gf7.d(r4)
            int r40 = defpackage.j47.n(r5, r11)
            long r5 = defpackage.gf7.a(r2, r4, r9)
            long r11 = defpackage.gf7.c(r2, r4, r9)
            long r41 = r5 - r11
            if (r4 != 0) goto L_0x058c
        L_0x058a:
            r5 = 0
            goto L_0x0599
        L_0x058c:
            java.lang.String r5 = "android.media.metadata.ADVERTISEMENT"
            long r5 = r4.a(r5)
            r11 = 0
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 == 0) goto L_0x058a
            r5 = 1
        L_0x0599:
            if (r2 != 0) goto L_0x05a0
            c3b r6 = defpackage.c3b.d
        L_0x059d:
            r56 = r6
            goto L_0x05a8
        L_0x05a0:
            c3b r6 = new c3b
            float r11 = r2.o
            r6.<init>(r11)
            goto L_0x059d
        L_0x05a8:
            if (r1 != 0) goto L_0x05af
            h30 r6 = defpackage.h30.g
        L_0x05ac:
            r64 = r6
            goto L_0x05d0
        L_0x05af:
            j30 r6 = r1.b
            if (r6 != 0) goto L_0x05b6
            h30 r6 = defpackage.h30.g
            goto L_0x05ac
        L_0x05b6:
            i30 r6 = r6.a
            int r33 = r6.a()
            int r34 = r6.b()
            int r35 = r6.c()
            h30 r6 = new h30
            r36 = 1
            r37 = 0
            r32 = r6
            r32.<init>(r33, r34, r35, r36, r37)
            goto L_0x05ac
        L_0x05d0:
            if (r2 != 0) goto L_0x05d5
        L_0x05d2:
            r69 = 0
            goto L_0x05dd
        L_0x05d5:
            int r6 = r2.a
            switch(r6) {
                case 3: goto L_0x05db;
                case 4: goto L_0x05db;
                case 5: goto L_0x05db;
                case 6: goto L_0x05db;
                case 7: goto L_0x05da;
                case 8: goto L_0x05da;
                case 9: goto L_0x05db;
                case 10: goto L_0x05db;
                case 11: goto L_0x05db;
                default: goto L_0x05da;
            }
        L_0x05da:
            goto L_0x05d2
        L_0x05db:
            r69 = 1
        L_0x05dd:
            if (r2 != 0) goto L_0x05e1
        L_0x05df:
            r6 = 1
            goto L_0x0616
        L_0x05e1:
            int r6 = r2.a     // Catch:{ LegacyConversions$ConversionException -> 0x0619 }
            switch(r6) {
                case 0: goto L_0x05df;
                case 1: goto L_0x05df;
                case 2: goto L_0x05fe;
                case 3: goto L_0x05fc;
                case 4: goto L_0x05fa;
                case 5: goto L_0x05fa;
                case 6: goto L_0x05fa;
                case 7: goto L_0x05df;
                case 8: goto L_0x05df;
                case 9: goto L_0x05fa;
                case 10: goto L_0x05fa;
                case 11: goto L_0x05fa;
                default: goto L_0x05e6;
            }     // Catch:{ LegacyConversions$ConversionException -> 0x0619 }
        L_0x05e6:
            androidx.media3.session.LegacyConversions$ConversionException r9 = new androidx.media3.session.LegacyConversions$ConversionException     // Catch:{ LegacyConversions$ConversionException -> 0x0619 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ LegacyConversions$ConversionException -> 0x0619 }
            java.lang.String r11 = "Invalid state of PlaybackStateCompat: "
            r10.<init>(r11)     // Catch:{ LegacyConversions$ConversionException -> 0x0619 }
            r10.append(r6)     // Catch:{ LegacyConversions$ConversionException -> 0x0619 }
            java.lang.String r6 = r10.toString()     // Catch:{ LegacyConversions$ConversionException -> 0x0619 }
            r9.<init>(r6)     // Catch:{ LegacyConversions$ConversionException -> 0x0619 }
            throw r9     // Catch:{ LegacyConversions$ConversionException -> 0x0619 }
        L_0x05fa:
            r6 = 2
            goto L_0x0616
        L_0x05fc:
            r6 = 3
            goto L_0x0616
        L_0x05fe:
            long r11 = defpackage.gf7.d(r4)     // Catch:{ LegacyConversions$ConversionException -> 0x0619 }
            r28 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r11 > r28 ? 1 : (r11 == r28 ? 0 : -1))
            if (r6 != 0) goto L_0x060c
            goto L_0x05fc
        L_0x060c:
            long r9 = defpackage.gf7.c(r2, r4, r9)     // Catch:{ LegacyConversions$ConversionException -> 0x0619 }
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0615
            goto L_0x05fc
        L_0x0615:
            r6 = 4
        L_0x0616:
            r72 = r6
            goto L_0x0642
        L_0x0619:
            int r6 = r2.a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Received invalid playback state "
            r9.<init>(r10)
            r9.append(r6)
            java.lang.String r6 = " from package "
            r9.append(r6)
            r6 = r20
            r9.append(r6)
            java.lang.String r6 = ". Keeping the previous state."
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            defpackage.z04.u(r6)
            java.lang.Object r6 = r3.a
            m4b r6 = (defpackage.m4b) r6
            int r6 = r6.y
            goto L_0x0616
        L_0x0642:
            if (r2 != 0) goto L_0x0647
            r73 = 0
            goto L_0x0651
        L_0x0647:
            int r6 = r2.a
            r9 = 3
            if (r6 != r9) goto L_0x064e
            r6 = 1
            goto L_0x064f
        L_0x064e:
            r6 = 0
        L_0x064f:
            r73 = r6
        L_0x0651:
            if (r1 != 0) goto L_0x0658
            ui4 r6 = defpackage.ui4.e
        L_0x0655:
            r66 = r6
            goto L_0x067d
        L_0x0658:
            sv0 r6 = new sv0
            int r9 = r1.a
            r10 = 2
            if (r9 != r10) goto L_0x0661
            r9 = 1
            goto L_0x0662
        L_0x0661:
            r9 = 0
        L_0x0662:
            r6.<init>((int) r9)
            int r10 = r1.d
            r6.d = r10
            if (r9 != 0) goto L_0x0670
            if (r19 != 0) goto L_0x066e
            goto L_0x0670
        L_0x066e:
            r9 = 0
            goto L_0x0671
        L_0x0670:
            r9 = 1
        L_0x0671:
            defpackage.fm9.f(r9)
            r9 = r19
            r6.e = r9
            ui4 r6 = r6.b()
            goto L_0x0655
        L_0x067d:
            if (r1 != 0) goto L_0x0682
            r67 = 0
            goto L_0x0686
        L_0x0682:
            int r6 = r1.e
            r67 = r6
        L_0x0686:
            if (r1 != 0) goto L_0x068b
            r68 = 0
            goto L_0x0694
        L_0x068b:
            int r1 = r1.e
            if (r1 != 0) goto L_0x0691
            r1 = 1
            goto L_0x0692
        L_0x0691:
            r1 = 0
        L_0x0692:
            r68 = r1
        L_0x0694:
            java.lang.Object r1 = r3.a
            m4b r1 = (defpackage.m4b) r1
            long r9 = r1.A
            int r3 = r7.p()
            if (r8 < r3) goto L_0x06a2
            r6 = 0
            goto L_0x06a8
        L_0x06a2:
            wqb r3 = r7.v(r8)
            tb8 r6 = r3.a
        L_0x06a8:
            p3b r32 = o(r8, r6, r14, r5)
            qad r31 = new qad
            r52 = r31
            long r34 = android.os.SystemClock.elapsedRealtime()
            r43 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r33 = r5
            r36 = r26
            r38 = r47
            r45 = r26
            r31.<init>(r32, r33, r34, r36, r38, r40, r41, r43, r45, r47)
            m4b r3 = new m4b
            r49 = r3
            p3b r54 = defpackage.qad.k
            r53 = r54
            jlf r59 = defpackage.jlf.e
            zz3 r65 = defpackage.zz3.c
            p0f r82 = defpackage.p0f.b
            j0f r83 = defpackage.j0f.C
            long r5 = r1.B
            r78 = r5
            long r5 = r1.C
            r80 = r5
            r51 = 0
            r55 = 0
            r61 = 0
            r63 = 1065353216(0x3f800000, float:1.0)
            r70 = 1
            r71 = 0
            r74 = 0
            r57 = r0
            r60 = r7
            r76 = r9
            r49.<init>(r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r78, r80, r82, r83)
            ai3 r5 = new ai3
            r6 = r87
            android.os.Bundle r1 = r6.h
            r31 = r5
            r32 = r3
            r33 = r84
            r34 = r16
            r35 = r25
            r36 = r1
            r37 = r21
            r31.<init>(r32, r33, r34, r35, r36, r37)
            r1 = r85
            ca8 r8 = r1.k
            ai3 r9 = r1.m
            r10 = r18
            long r10 = r10.Y
            java.lang.Object r12 = r9.a
            m4b r12 = (defpackage.m4b) r12
            mue r12 = r12.j
            boolean r12 = r12.q()
            boolean r13 = r7.q()
            if (r12 == 0) goto L_0x072a
            if (r13 == 0) goto L_0x072a
            r0 = 0
            r3 = 0
            goto L_0x07a4
        L_0x072a:
            if (r12 == 0) goto L_0x073a
            if (r13 != 0) goto L_0x073a
            r12 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r12 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            goto L_0x07a4
        L_0x073a:
            r12 = 3
            java.lang.Object r9 = r9.a
            m4b r9 = (defpackage.m4b) r9
            tb8 r9 = r9.s()
            defpackage.fm9.l(r9)
            boolean r7 = r7.r(r9)
            if (r7 != 0) goto L_0x0756
            r7 = 4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            goto L_0x07a4
        L_0x0756:
            tb8 r3 = r3.s()
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x079a
            i3b r3 = r8.b
            hd8 r7 = r8.c
            long r7 = defpackage.gf7.c(r3, r7, r10)
            long r2 = defpackage.gf7.c(r2, r4, r10)
            r9 = 0
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x0781
            r4 = 1
            if (r0 != r4) goto L_0x0781
            r0 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r17 = r0
            goto L_0x0797
        L_0x0781:
            long r7 = r7 - r2
            long r2 = java.lang.Math.abs(r7)
            r7 = 100
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0795
            r0 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = r0
        L_0x0792:
            r17 = 0
            goto L_0x0797
        L_0x0795:
            r3 = 0
            goto L_0x0792
        L_0x0797:
            r0 = r17
            goto L_0x07a4
        L_0x079a:
            r0 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x07a4:
            android.util.Pair r0 = android.util.Pair.create(r3, r0)
            java.lang.Object r2 = r0.first
            r4 = r2
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r0 = r0.second
            r7 = r0
            java.lang.Integer r7 = (java.lang.Integer) r7
            r0 = r85
            r1 = r86
            r2 = r87
            r3 = r5
            r5 = r7
            r0.c0(r1, r2, r3, r4, r5)
        L_0x07bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.da8.G(boolean, ca8):void");
    }

    public final long G0() {
        return e0();
    }

    public final void H(int i2, boolean z) {
        if (oaf.a < 23) {
            z04.c0("Session doesn't support setting mute state at API level less than 23");
            return;
        }
        if (z != z0()) {
            m4b c2 = ((m4b) this.m.a).c(l(), z);
            ai3 ai3 = this.m;
            i0(new ai3(c2, (z9d) ai3.b, (k3b) ai3.c, (zw6) ai3.o, (Bundle) ai3.X, (iad) null), (Integer) null, (Integer) null);
        }
        ((e98) this.g.b).a.adjustVolume(z ? -100 : 100, i2);
    }

    public final void H0(int i2, long j2, List list) {
        int i3 = i2;
        List list2 = list;
        if (list.isEmpty()) {
            v();
            return;
        }
        m4b n2 = ((m4b) this.m.a).n(xqb.g.t(0, list2), new qad(o(i3, (tb8) list2.get(i3), j2 == -9223372036854775807L ? 0 : j2, false), false, SystemClock.elapsedRealtime(), -9223372036854775807L, 0, 0, 0, -9223372036854775807L, -9223372036854775807L, 0), 0);
        ai3 ai3 = this.m;
        i0(new ai3(n2, (z9d) ai3.b, (k3b) ai3.c, (zw6) ai3.o, (Bundle) ai3.X, (iad) null), (Integer) null, (Integer) null);
        if (P()) {
            K();
        }
    }

    public final ui4 I() {
        return ((m4b) this.m.a).q;
    }

    public final void I0(int i2) {
        L(i2, 1);
    }

    public final void J() {
        g0(1);
    }

    public final void J0() {
        this.g.R().g.skipToNext();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if ((!((defpackage.m4b) r13.m.a).j.q()) != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void K() {
        /*
            r13 = this;
            kue r0 = new kue
            r0.<init>()
            boolean r1 = r13.P()
            r2 = 0
            if (r1 == 0) goto L_0x001d
            ai3 r1 = r13.m
            java.lang.Object r1 = r1.a
            m4b r1 = (defpackage.m4b) r1
            mue r1 = r1.j
            boolean r1 = r1.q()
            r3 = 1
            r1 = r1 ^ r3
            if (r1 == 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r3 = r2
        L_0x001e:
            defpackage.fm9.k(r3)
            ai3 r1 = r13.m
            java.lang.Object r1 = r1.a
            m4b r1 = (defpackage.m4b) r1
            mue r3 = r1.j
            xqb r3 = (defpackage.xqb) r3
            qad r1 = r1.c
            p3b r1 = r1.a
            int r1 = r1.b
            r4 = 0
            r3.n(r1, r0, r4)
            tb8 r6 = r0.c
            long r7 = r3.u(r1)
            r9 = -1
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x0066
            ai3 r6 = r13.m
            java.lang.Object r6 = r6.a
            m4b r6 = (defpackage.m4b) r6
            boolean r6 = r6.t
            if (r6 == 0) goto L_0x0059
            qz7 r6 = r13.g
            h98 r6 = r6.R()
            android.media.session.MediaController$TransportControls r6 = r6.g
            r6.play()
            goto L_0x0104
        L_0x0059:
            qz7 r6 = r13.g
            h98 r6 = r6.R()
            android.media.session.MediaController$TransportControls r6 = r6.g
            r6.prepare()
            goto L_0x0104
        L_0x0066:
            lb8 r7 = r6.f
            android.net.Uri r8 = r7.a
            if (r8 == 0) goto L_0x009f
            ai3 r6 = r13.m
            java.lang.Object r6 = r6.a
            m4b r6 = (defpackage.m4b) r6
            boolean r6 = r6.t
            if (r6 == 0) goto L_0x008b
            qz7 r6 = r13.g
            h98 r6 = r6.R()
            android.net.Uri r8 = r7.a
            android.os.Bundle r7 = r7.c
            if (r7 != 0) goto L_0x0084
            android.os.Bundle r7 = android.os.Bundle.EMPTY
        L_0x0084:
            android.media.session.MediaController$TransportControls r6 = r6.g
            r6.playFromUri(r8, r7)
            goto L_0x0104
        L_0x008b:
            qz7 r6 = r13.g
            h98 r6 = r6.R()
            android.net.Uri r8 = r7.a
            android.os.Bundle r7 = r7.c
            if (r7 != 0) goto L_0x0099
            android.os.Bundle r7 = android.os.Bundle.EMPTY
        L_0x0099:
            android.media.session.MediaController$TransportControls r6 = r6.g
            r6.prepareFromUri(r8, r7)
            goto L_0x0104
        L_0x009f:
            java.lang.String r8 = r7.b
            if (r8 == 0) goto L_0x00d5
            ai3 r6 = r13.m
            java.lang.Object r6 = r6.a
            m4b r6 = (defpackage.m4b) r6
            boolean r6 = r6.t
            if (r6 == 0) goto L_0x00c1
            qz7 r6 = r13.g
            h98 r6 = r6.R()
            java.lang.String r8 = r7.b
            android.os.Bundle r7 = r7.c
            if (r7 != 0) goto L_0x00bb
            android.os.Bundle r7 = android.os.Bundle.EMPTY
        L_0x00bb:
            android.media.session.MediaController$TransportControls r6 = r6.g
            r6.playFromSearch(r8, r7)
            goto L_0x0104
        L_0x00c1:
            qz7 r6 = r13.g
            h98 r6 = r6.R()
            java.lang.String r8 = r7.b
            android.os.Bundle r7 = r7.c
            if (r7 != 0) goto L_0x00cf
            android.os.Bundle r7 = android.os.Bundle.EMPTY
        L_0x00cf:
            android.media.session.MediaController$TransportControls r6 = r6.g
            r6.prepareFromSearch(r8, r7)
            goto L_0x0104
        L_0x00d5:
            ai3 r8 = r13.m
            java.lang.Object r8 = r8.a
            m4b r8 = (defpackage.m4b) r8
            boolean r8 = r8.t
            java.lang.String r6 = r6.a
            if (r8 == 0) goto L_0x00f3
            qz7 r8 = r13.g
            h98 r8 = r8.R()
            android.os.Bundle r7 = r7.c
            if (r7 != 0) goto L_0x00ed
            android.os.Bundle r7 = android.os.Bundle.EMPTY
        L_0x00ed:
            android.media.session.MediaController$TransportControls r8 = r8.g
            r8.playFromMediaId(r6, r7)
            goto L_0x0104
        L_0x00f3:
            qz7 r8 = r13.g
            h98 r8 = r8.R()
            android.os.Bundle r7 = r7.c
            if (r7 != 0) goto L_0x00ff
            android.os.Bundle r7 = android.os.Bundle.EMPTY
        L_0x00ff:
            android.media.session.MediaController$TransportControls r8 = r8.g
            r8.prepareFromMediaId(r6, r7)
        L_0x0104:
            ai3 r6 = r13.m
            java.lang.Object r6 = r6.a
            m4b r6 = (defpackage.m4b) r6
            qad r6 = r6.c
            p3b r6 = r6.a
            long r6 = r6.f
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x012b
            qz7 r6 = r13.g
            h98 r6 = r6.R()
            ai3 r7 = r13.m
            java.lang.Object r7 = r7.a
            m4b r7 = (defpackage.m4b) r7
            qad r7 = r7.c
            p3b r7 = r7.a
            long r7 = r7.f
            android.media.session.MediaController$TransportControls r6 = r6.g
            r6.seekTo(r7)
        L_0x012b:
            ai3 r6 = r13.m
            java.lang.Object r6 = r6.c
            k3b r6 = (defpackage.k3b) r6
            r7 = 20
            boolean r6 = r6.a(r7)
            if (r6 == 0) goto L_0x015e
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = r2
        L_0x013f:
            int r8 = r3.p()
            if (r7 >= r8) goto L_0x015b
            if (r7 == r1) goto L_0x0158
            long r11 = r3.u(r7)
            int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x0150
            goto L_0x0158
        L_0x0150:
            r3.n(r7, r0, r4)
            tb8 r8 = r0.c
            r6.add(r8)
        L_0x0158:
            int r7 = r7 + 1
            goto L_0x013f
        L_0x015b:
            r13.h(r2, r6)
        L_0x015e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.da8.K():void");
    }

    public final void K0() {
        this.g.R().g.fastForward();
    }

    public final void L(int i2, int i3) {
        int i4;
        ui4 I = I();
        if (I.b <= i2 && ((i4 = I.c) == 0 || i2 <= i4)) {
            m4b c2 = ((m4b) this.m.a).c(i2, z0());
            ai3 ai3 = this.m;
            i0(new ai3(c2, (z9d) ai3.b, (k3b) ai3.c, (zw6) ai3.o, (Bundle) ai3.X, (iad) null), (Integer) null, (Integer) null);
        }
        ((e98) this.g.b).a.setVolumeTo(i2, i3);
    }

    public final void L0() {
        this.g.R().g.rewind();
    }

    public final boolean M() {
        return this.j;
    }

    public final void N(int i2) {
        int l2 = l();
        int i3 = I().c;
        if (i3 == 0 || l2 + 1 <= i3) {
            m4b c2 = ((m4b) this.m.a).c(l2 + 1, z0());
            ai3 ai3 = this.m;
            i0(new ai3(c2, (z9d) ai3.b, (k3b) ai3.c, (zw6) ai3.o, (Bundle) ai3.X, (iad) null), (Integer) null, (Integer) null);
        }
        ((e98) this.g.b).a.adjustVolume(1, i2);
    }

    public final gd8 N0() {
        tb8 s = ((m4b) this.m.a).s();
        return s == null ? gd8.J : s.d;
    }

    public final int O() {
        return -1;
    }

    public final void O0(List list) {
        W(list);
    }

    public final boolean P() {
        return ((m4b) this.m.a).y != 1;
    }

    public final long P0() {
        return ((m4b) this.m.a).A;
    }

    public final void Q(j0f j0f) {
    }

    public final z9d Q0() {
        return (z9d) this.m.b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0090 A[SYNTHETIC, Splitter:B:20:0x0090] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R() {
        /*
            r12 = this;
            boolean r0 = r12.i
            if (r0 != 0) goto L_0x00af
            boolean r0 = r12.j
            if (r0 == 0) goto L_0x000a
            goto L_0x00af
        L_0x000a:
            r0 = 1
            r12.j = r0
            ca8 r10 = new ca8
            qz7 r1 = r12.g
            f98 r2 = r1.P()
            qz7 r1 = r12.g
            i3b r1 = r1.Q()
            i3b r3 = j(r1)
            qz7 r1 = r12.g
            java.lang.Object r1 = r1.b
            e98 r1 = (defpackage.e98) r1
            android.media.session.MediaController r1 = r1.a
            android.media.MediaMetadata r1 = r1.getMetadata()
            r4 = 0
            if (r1 == 0) goto L_0x0049
            us r5 = defpackage.hd8.c
            android.os.Parcel r5 = android.os.Parcel.obtain()
            r6 = 0
            r1.writeToParcel(r5, r6)
            r5.setDataPosition(r6)
            android.os.Parcelable$Creator<hd8> r6 = defpackage.hd8.CREATOR
            java.lang.Object r6 = r6.createFromParcel(r5)
            hd8 r6 = (defpackage.hd8) r6
            r5.recycle()
            r6.b = r1
            goto L_0x004a
        L_0x0049:
            r6 = r4
        L_0x004a:
            qz7 r1 = r12.g
            java.lang.Object r1 = r1.b
            e98 r1 = (defpackage.e98) r1
            android.media.session.MediaController r1 = r1.a
            java.util.List r1 = r1.getQueue()
            if (r1 == 0) goto L_0x005c
            java.util.ArrayList r4 = defpackage.yh8.a(r1)
        L_0x005c:
            java.util.List r5 = i(r4)
            qz7 r1 = r12.g
            java.lang.Object r1 = r1.b
            e98 r1 = (defpackage.e98) r1
            android.media.session.MediaController r1 = r1.a
            java.lang.CharSequence r7 = r1.getQueueTitle()
            qz7 r1 = r12.g
            java.lang.Object r1 = r1.b
            e98 r1 = (defpackage.e98) r1
            ai8 r1 = r1.e
            pr6 r1 = r1.a()
            r4 = -1
            if (r1 == 0) goto L_0x0081
            int r1 = r1.getRepeatMode()     // Catch:{ RemoteException -> 0x0081 }
            r8 = r1
            goto L_0x0082
        L_0x0081:
            r8 = r4
        L_0x0082:
            qz7 r1 = r12.g
            java.lang.Object r1 = r1.b
            e98 r1 = (defpackage.e98) r1
            ai8 r1 = r1.e
            pr6 r1 = r1.a()
            if (r1 == 0) goto L_0x0096
            int r1 = r1.getShuffleMode()     // Catch:{ RemoteException -> 0x0096 }
            r9 = r1
            goto L_0x0097
        L_0x0096:
            r9 = r4
        L_0x0097:
            qz7 r1 = r12.g
            java.lang.Object r1 = r1.b
            e98 r1 = (defpackage.e98) r1
            android.media.session.MediaController r1 = r1.a
            android.os.Bundle r11 = r1.getExtras()
            r1 = r10
            r4 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r12.G(r0, r10)
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.da8.R():void");
    }

    public final int R0() {
        return -1;
    }

    public final void S(int i2) {
        U(i2, i2 + 1);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, bm7] */
    public final bm7 S0(y9d y9d, Bundle bundle) {
        z9d z9d = (z9d) this.m.b;
        z9d.getClass();
        boolean contains = z9d.a.contains(y9d);
        String str = y9d.b;
        if (contains) {
            this.g.R().i0(str, bundle);
            return fm9.F(new sad(0));
        }
        ? obj = new Object();
        c98 c98 = new c98(1, this.b.X, obj);
        qz7 qz7 = this.g;
        qz7.getClass();
        if (!TextUtils.isEmpty(str)) {
            ((e98) qz7.b).a.sendCommand(str, bundle, c98);
            return obj;
        }
        throw new IllegalArgumentException("command must neither be null nor empty");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void T(int r36, long r37) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            r2 = r37
            r4 = 1
            if (r1 < 0) goto L_0x000b
            r6 = r4
            goto L_0x000c
        L_0x000b:
            r6 = 0
        L_0x000c:
            defpackage.fm9.f(r6)
            int r6 = r35.p0()
            ai3 r7 = r0.m
            java.lang.Object r7 = r7.a
            m4b r7 = (defpackage.m4b) r7
            mue r7 = r7.j
            boolean r8 = r7.q()
            if (r8 != 0) goto L_0x0027
            int r8 = r7.p()
            if (r1 >= r8) goto L_0x002d
        L_0x0027:
            boolean r8 = r35.n()
            if (r8 == 0) goto L_0x002e
        L_0x002d:
            return
        L_0x002e:
            r8 = 2
            if (r1 == r6) goto L_0x005a
            ai3 r10 = r0.m
            java.lang.Object r10 = r10.a
            m4b r10 = (defpackage.m4b) r10
            mue r10 = r10.j
            xqb r10 = (defpackage.xqb) r10
            long r10 = r10.u(r1)
            r12 = -1
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 == 0) goto L_0x0055
            qz7 r6 = r0.g
            h98 r6 = r6.R()
            android.media.session.MediaController$TransportControls r6 = r6.g
            r6.skipToQueueItem(r10)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            goto L_0x005c
        L_0x0055:
            java.lang.String r10 = "Cannot seek to new media item due to the missing queue Id at media item, mediaItemIndex="
            defpackage.ey8.k(r1, r10)
        L_0x005a:
            r1 = r6
            r6 = 0
        L_0x005c:
            long r10 = r35.k()
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x006c
            r2 = r10
            r14 = 0
            goto L_0x007b
        L_0x006c:
            qz7 r14 = r0.g
            h98 r14 = r14.R()
            android.media.session.MediaController$TransportControls r14 = r14.g
            r14.seekTo(r2)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r4)
        L_0x007b:
            r8 = 0
            if (r6 != 0) goto L_0x00a7
            long r4 = r35.e0()
            long r15 = r35.c()
            int r10 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r10 >= 0) goto L_0x008d
            r4 = r2
            goto L_0x0091
        L_0x008d:
            long r4 = java.lang.Math.max(r2, r4)
        L_0x0091:
            int r10 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r10 != 0) goto L_0x0097
            r10 = 0
            goto L_0x009c
        L_0x0097:
            r10 = 100
            long r10 = r10 * r4
            long r10 = r10 / r15
            int r10 = (int) r10
        L_0x009c:
            long r11 = r4 - r2
            r33 = r4
            r26 = r10
            r27 = r11
            r31 = r15
            goto L_0x00af
        L_0x00a7:
            r27 = r8
            r33 = r27
            r31 = r12
            r26 = 0
        L_0x00af:
            boolean r4 = r7.q()
            if (r4 != 0) goto L_0x00c2
            kue r4 = new kue
            r4.<init>()
            kue r4 = r7.n(r1, r4, r8)
            tb8 r4 = r4.c
        L_0x00c0:
            r5 = 0
            goto L_0x00c4
        L_0x00c2:
            r4 = 0
            goto L_0x00c0
        L_0x00c4:
            p3b r18 = o(r1, r4, r2, r5)
            ai3 r1 = r0.m
            java.lang.Object r1 = r1.a
            m4b r1 = (defpackage.m4b) r1
            qad r2 = new qad
            r17 = r2
            long r20 = android.os.SystemClock.elapsedRealtime()
            r29 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r19 = 0
            r22 = r31
            r24 = r33
            r17.<init>(r18, r19, r20, r22, r24, r26, r27, r29, r31, r33)
            m4b r1 = r1.j(r2)
            int r2 = r1.y
            r3 = 1
            if (r2 == r3) goto L_0x00f3
            r2 = 2
            r3 = 0
            m4b r1 = r1.f(r2, r3)
        L_0x00f3:
            r8 = r1
            ai3 r1 = new ai3
            ai3 r2 = r0.m
            java.lang.Object r3 = r2.b
            r9 = r3
            z9d r9 = (defpackage.z9d) r9
            java.lang.Object r3 = r2.X
            r12 = r3
            android.os.Bundle r12 = (android.os.Bundle) r12
            r13 = 0
            java.lang.Object r3 = r2.c
            r10 = r3
            k3b r10 = (defpackage.k3b) r10
            java.lang.Object r2 = r2.o
            r11 = r2
            zw6 r11 = (defpackage.zw6) r11
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r0.i0(r1, r14, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.da8.T(int, long):void");
    }

    public final int T0() {
        return -1;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [ww6, pw6] */
    public final void U(int i2, int i3) {
        fm9.f(i2 >= 0 && i3 >= i2);
        int p = x0().p();
        int min = Math.min(i3, p);
        if (i2 < p && i2 != min) {
            xqb xqb = (xqb) ((m4b) this.m.a).j;
            xqb.getClass();
            ? pw6 = new pw6(4);
            zw6 zw6 = xqb.e;
            pw6.e(zw6.subList(0, i2));
            pw6.e(zw6.subList(min, zw6.size()));
            xqb xqb2 = new xqb(pw6.j(), xqb.f);
            int p0 = p0();
            int i4 = min - i2;
            if (p0 >= i2) {
                p0 = p0 < min ? -1 : p0 - i4;
            }
            if (p0 == -1) {
                p0 = oaf.j(i2, 0, xqb2.p() - 1);
                z04.c0("Currently playing item is removed. Assumes item at " + p0 + " is the new current item");
            }
            m4b m2 = ((m4b) this.m.a).m(xqb2, p0);
            ai3 ai3 = this.m;
            i0(new ai3(m2, (z9d) ai3.b, (k3b) ai3.c, (zw6) ai3.o, (Bundle) ai3.X, (iad) null), (Integer) null, (Integer) null);
            if (P()) {
                while (i2 < min && i2 < this.k.d.size()) {
                    this.g.W(((yh8) this.k.d.get(i2)).a);
                    i2++;
                }
            }
        }
    }

    public final void U0(tb8 tb8) {
        t(tb8, -9223372036854775807L);
    }

    public final void V() {
        this.g.R().g.skipToPrevious();
    }

    public final zw6 V0() {
        return (zw6) this.m.o;
    }

    public final void W(List list) {
        H0(0, -9223372036854775807L, list);
    }

    public final PlaybackException X() {
        return ((m4b) this.m.a).a;
    }

    public final void Y(boolean z) {
        m4b m4b = (m4b) this.m.a;
        if (m4b.t != z) {
            this.n = j47.M(m4b, this.n, this.o, this.b.Y);
            this.o = SystemClock.elapsedRealtime();
            m4b d2 = ((m4b) this.m.a).d(1, 0, z);
            ai3 ai3 = this.m;
            i0(new ai3(d2, (z9d) ai3.b, (k3b) ai3.c, (zw6) ai3.o, (Bundle) ai3.X, (iad) null), (Integer) null, (Integer) null);
            if (P() && (!((m4b) this.m.a).j.q())) {
                if (z) {
                    this.g.R().g.play();
                } else {
                    this.g.R().g.pause();
                }
            }
        }
    }

    public final void Z(int i2) {
        T(i2, 0);
    }

    public final boolean a() {
        return false;
    }

    public final long a0() {
        return ((m4b) this.m.a).B;
    }

    public final boolean b() {
        return ((m4b) this.m.a).v;
    }

    public final long b0() {
        return k();
    }

    public final long c() {
        return ((m4b) this.m.a).c.d;
    }

    public final void c0(boolean z, ca8 ca8, ai3 ai3, Integer num, Integer num2) {
        ca8 ca82 = this.k;
        ai3 ai32 = this.m;
        if (ca82 != ca8) {
            this.k = new ca8(ca8);
        }
        this.l = this.k;
        this.m = ai3;
        boolean z2 = false;
        a98 a98 = this.b;
        zw6 zw6 = (zw6) ai3.o;
        if (z) {
            a98.j();
            if (!((zw6) ai32.o).equals(zw6)) {
                if (Looper.myLooper() == a98.X.getLooper()) {
                    z2 = true;
                }
                fm9.k(z2);
                y88 y88 = a98.o;
                y88.getClass();
                y88.r();
                y88.g();
                return;
            }
            return;
        }
        mue mue = ((m4b) ai32.a).j;
        m4b m4b = (m4b) ai3.a;
        boolean equals = mue.equals(m4b.j);
        pm7 pm7 = this.d;
        if (!equals) {
            pm7.c(0, new x98(ai3, 4));
        }
        if (!oaf.a(ca82.e, ca8.e)) {
            pm7.c(15, new x98(ai3, 5));
        }
        if (num != null) {
            pm7.c(11, new u00((Object) ai32, (Object) ai3, (Object) num, 16));
        }
        if (num2 != null) {
            pm7.c(1, new y98((Object) ai3, 0, (Object) num2));
        }
        i3b i3b = ca82.b;
        boolean z3 = i3b != null && i3b.a == 7;
        i3b i3b2 = ca8.b;
        boolean z4 = i3b2 != null && i3b2.a == 7;
        if (!z3 || !z4 ? z3 != z4 : i3b.Y != i3b2.Y || !TextUtils.equals(i3b.Z, i3b2.Z)) {
            PlaybackException m2 = gf7.m(i3b2);
            pm7.c(10, new t98(2, m2));
            if (m2 != null) {
                pm7.c(10, new t98(3, m2));
            }
        }
        if (ca82.c != ca8.c) {
            pm7.c(14, new z98(this));
        }
        m4b m4b2 = (m4b) ai32.a;
        if (m4b2.y != m4b.y) {
            pm7.c(4, new x98(ai3, 6));
        }
        if (m4b2.t != m4b.t) {
            pm7.c(5, new x98(ai3, 7));
        }
        if (m4b2.v != m4b.v) {
            pm7.c(7, new x98(ai3, 8));
        }
        if (!m4b2.g.equals(m4b.g)) {
            pm7.c(12, new x98(ai3, 9));
        }
        if (m4b2.h != m4b.h) {
            pm7.c(8, new x98(ai3, 10));
        }
        if (m4b2.i != m4b.i) {
            pm7.c(9, new x98(ai3, 11));
        }
        if (!m4b2.o.equals(m4b.o)) {
            pm7.c(20, new x98(ai3, 0));
        }
        if (!m4b2.q.equals(m4b.q)) {
            pm7.c(29, new x98(ai3, 1));
        }
        if (!(m4b2.r == m4b.r && m4b2.s == m4b.s)) {
            pm7.c(30, new x98(ai3, 2));
        }
        if (!((k3b) ai32.c).equals((k3b) ai3.c)) {
            pm7.c(13, new x98(ai3, 3));
        }
        if (!((z9d) ai32.b).equals((z9d) ai3.b)) {
            a98.getClass();
            fm9.k(Looper.myLooper() == a98.X.getLooper());
            a98.o.e();
        }
        if (!((zw6) ai32.o).equals(zw6)) {
            a98.getClass();
            fm9.k(Looper.myLooper() == a98.X.getLooper());
            y88 y882 = a98.o;
            y882.getClass();
            y88.r();
            y882.g();
        }
        if (((iad) ai3.Y) != null) {
            a98.getClass();
            if (Looper.myLooper() == a98.X.getLooper()) {
                z2 = true;
            }
            fm9.k(z2);
            a98.o.getClass();
        }
        pm7.b();
    }

    public final void connect() {
        obd obd = this.c;
        int type = obd.a.getType();
        a98 a98 = this.b;
        if (type == 0) {
            Object c2 = obd.a.c();
            fm9.l(c2);
            a98.G(new vs5(this, 16, (ai8) c2));
            a98.X.post(new aa8(this, 0));
            return;
        }
        a98.G(new aa8(this, 1));
    }

    public final c3b d() {
        return ((m4b) this.m.a).g;
    }

    public final void d0(int i2, List list) {
        fm9.f(i2 >= 0);
        if (!list.isEmpty()) {
            xqb xqb = (xqb) ((m4b) this.m.a).j;
            if (xqb.q()) {
                H0(0, -9223372036854775807L, list);
                return;
            }
            int min = Math.min(i2, x0().p());
            xqb t = xqb.t(min, list);
            int p0 = p0();
            int size = list.size();
            if (p0 >= min) {
                p0 += size;
            }
            m4b m2 = ((m4b) this.m.a).m(t, p0);
            ai3 ai3 = this.m;
            i0(new ai3(m2, (z9d) ai3.b, (k3b) ai3.c, (zw6) ai3.o, (Bundle) ai3.X, (iad) null), (Integer) null, (Integer) null);
            if (P()) {
                h(min, list);
            }
        }
    }

    public final float e() {
        return 1.0f;
    }

    public final long e0() {
        return ((m4b) this.m.a).c.e;
    }

    public final void f(c3b c3b) {
        if (!c3b.equals(d())) {
            m4b e2 = ((m4b) this.m.a).e(c3b);
            ai3 ai3 = this.m;
            i0(new ai3(e2, (z9d) ai3.b, (k3b) ai3.c, (zw6) ai3.o, (Bundle) ai3.X, (iad) null), (Integer) null, (Integer) null);
        }
        h98 R = this.g.R();
        float f2 = c3b.a;
        if (f2 != 0.0f) {
            R.g.setPlaybackSpeed(f2);
            return;
        }
        throw new IllegalArgumentException("speed must not be zero");
    }

    public final void f0() {
        this.g.R().g.skipToNext();
    }

    public final void g(float f2) {
        z04.c0("Session doesn't support setting player volume");
    }

    public final void g0(int i2) {
        int l2 = l() - 1;
        if (l2 >= I().b) {
            m4b c2 = ((m4b) this.m.a).c(l2, z0());
            ai3 ai3 = this.m;
            i0(new ai3(c2, (z9d) ai3.b, (k3b) ai3.c, (zw6) ai3.o, (Bundle) ai3.X, (iad) null), (Integer) null, (Integer) null);
        }
        ((e98) this.g.b).a.adjustVolume(-1, i2);
    }

    public final int getPlaybackState() {
        return ((m4b) this.m.a).y;
    }

    public final int getRepeatMode() {
        return ((m4b) this.m.a).h;
    }

    public final void h(int i2, List list) {
        ArrayList arrayList = new ArrayList();
        cy0 cy0 = new cy0(this, new AtomicInteger(0), list, arrayList, i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            byte[] bArr = ((tb8) list.get(i3)).d.k;
            if (bArr == null) {
                arrayList.add((Object) null);
                cy0.run();
            } else {
                bm7 B = this.f.B(bArr);
                arrayList.add(B);
                Handler handler = this.b.X;
                Objects.requireNonNull(handler);
                B.d(cy0, new a84(handler, 0));
            }
        }
    }

    public final p0f h0() {
        return p0f.b;
    }

    public final void i0(ai3 ai3, Integer num, Integer num2) {
        c0(false, this.k, ai3, num, num2);
    }

    public final boolean isConnected() {
        return this.j;
    }

    public final boolean j0() {
        return this.j;
    }

    public final long k() {
        long M = j47.M((m4b) this.m.a, this.n, this.o, this.b.Y);
        this.n = M;
        return M;
    }

    public final gd8 k0() {
        return ((m4b) this.m.a).m;
    }

    public final int l() {
        m4b m4b = (m4b) this.m.a;
        if (m4b.q.a == 1) {
            return m4b.r;
        }
        qz7 qz7 = this.g;
        if (qz7 == null) {
            return 0;
        }
        f98 P = qz7.P();
        jx6 jx6 = gf7.a;
        if (P == null) {
            return 0;
        }
        return P.e;
    }

    public final zz3 l0() {
        z04.c0("Session doesn't support getting Cue");
        return zz3.c;
    }

    public final void m(Surface surface) {
        z04.c0("Session doesn't support setting Surface");
    }

    public final void m0(h30 h30, boolean z) {
        z04.c0("Legacy session doesn't support setting audio attributes remotely");
    }

    public final boolean n() {
        return ((m4b) this.m.a).c.b;
    }

    public final void n0(gd8 gd8) {
        z04.c0("Session doesn't support setting playlist metadata");
    }

    public final int o0() {
        return -1;
    }

    public final long p() {
        return -9223372036854775807L;
    }

    public final int p0() {
        return ((m4b) this.m.a).c.a.b;
    }

    public final void pause() {
        Y(false);
    }

    public final void play() {
        Y(true);
    }

    public final void prepare() {
        m4b m4b = (m4b) this.m.a;
        if (m4b.y == 1) {
            m4b f2 = m4b.f(m4b.j.q() ? 4 : 2, (PlaybackException) null);
            ai3 ai3 = this.m;
            i0(new ai3(f2, (z9d) ai3.b, (k3b) ai3.c, (zw6) ai3.o, (Bundle) ai3.X, (iad) null), (Integer) null, (Integer) null);
            if (!((m4b) this.m.a).j.q()) {
                K();
            }
        }
    }

    public final long q() {
        return ((m4b) this.m.a).c.g;
    }

    public final void q0(boolean z) {
        H(1, z);
    }

    public final void r(int i2, long j2) {
        T(i2, j2);
    }

    public final void r0(n3b n3b) {
        this.d.e(n3b);
    }

    public final void release() {
        Messenger messenger;
        if (!this.i) {
            this.i = true;
            q68 q68 = this.h;
            if (q68 != null) {
                o68 o68 = q68.a;
                y7g y7g = o68.f;
                if (!(y7g == null || (messenger = o68.g) == null)) {
                    try {
                        y7g.E(7, (Bundle) null, messenger);
                    } catch (RemoteException unused) {
                    }
                }
                o68.b.disconnect();
                this.h = null;
            }
            qz7 qz7 = this.g;
            if (qz7 != null) {
                ba8 ba8 = this.e;
                if (ba8 != null) {
                    if (((Set) qz7.c).remove(ba8)) {
                        try {
                            ((e98) qz7.b).b(ba8);
                        } finally {
                            ba8.j((Handler) null);
                        }
                    }
                    ba8.d.removeCallbacksAndMessages((Object) null);
                    this.g = null;
                } else {
                    throw new IllegalArgumentException("callback must not be null");
                }
            }
            this.j = false;
            this.d.d();
        }
    }

    public final k3b s() {
        return (k3b) this.m.c;
    }

    public final void s0(List list, int i2, int i3) {
        fm9.f(i2 >= 0 && i2 <= i3);
        int p = ((xqb) ((m4b) this.m.a).j).p();
        if (i2 <= p) {
            int min = Math.min(i3, p);
            d0(min, list);
            U(i2, min);
        }
    }

    public final void seekTo(long j2) {
        T(p0(), j2);
    }

    public final void setPlaybackSpeed(float f2) {
        if (f2 != d().a) {
            m4b e2 = ((m4b) this.m.a).e(new c3b(f2));
            ai3 ai3 = this.m;
            i0(new ai3(e2, (z9d) ai3.b, (k3b) ai3.c, (zw6) ai3.o, (Bundle) ai3.X, (iad) null), (Integer) null, (Integer) null);
        }
        h98 R = this.g.R();
        if (f2 != 0.0f) {
            R.g.setPlaybackSpeed(f2);
            return;
        }
        throw new IllegalArgumentException("speed must not be zero");
    }

    public final void setRepeatMode(int i2) {
        if (i2 != getRepeatMode()) {
            m4b i3 = ((m4b) this.m.a).i(i2);
            ai3 ai3 = this.m;
            i0(new ai3(i3, (z9d) ai3.b, (k3b) ai3.c, (zw6) ai3.o, (Bundle) ai3.X, (iad) null), (Integer) null, (Integer) null);
        }
        h98 R = this.g.R();
        int n2 = gf7.n(i2);
        Bundle bundle = new Bundle();
        bundle.putInt(MediaSessionCompat.ACTION_ARGUMENT_REPEAT_MODE, n2);
        R.i0(MediaSessionCompat.ACTION_SET_REPEAT_MODE, bundle);
    }

    public final void stop() {
        m4b m4b = (m4b) this.m.a;
        if (m4b.y != 1) {
            qad qad = m4b.c;
            p3b p3b = qad.a;
            long j2 = p3b.f;
            long j3 = qad.d;
            m4b j4 = m4b.j(new qad(p3b, false, SystemClock.elapsedRealtime(), j3, j2, j47.n(j2, j3), 0, -9223372036854775807L, j3, j2));
            m4b m4b2 = (m4b) this.m.a;
            if (m4b2.y != 1) {
                j4 = j4.f(1, m4b2.a);
            }
            ai3 ai3 = this.m;
            i0(new ai3(j4, (z9d) ai3.b, (k3b) ai3.c, (zw6) ai3.o, (Bundle) ai3.X, (iad) null), (Integer) null, (Integer) null);
            this.g.R().g.stop();
        }
    }

    public final void t(tb8 tb8, long j2) {
        H0(0, j2, zw6.n(tb8));
    }

    public final void t0(int i2, int i3) {
        u0(i2, i2 + 1, i3);
    }

    public final boolean u() {
        return ((m4b) this.m.a).t;
    }

    public final void u0(int i2, int i3, int i4) {
        fm9.f(i2 >= 0 && i2 <= i3 && i4 >= 0);
        xqb xqb = (xqb) ((m4b) this.m.a).j;
        int p = xqb.p();
        int min = Math.min(i3, p);
        int i5 = min - i2;
        int i6 = p - i5;
        int i7 = i6 - 1;
        int min2 = Math.min(i4, i6);
        if (i2 < p && i2 != min && i2 != min2) {
            int p0 = p0();
            if (p0 >= i2) {
                p0 = p0 < min ? -1 : p0 - i5;
            }
            if (p0 == -1) {
                p0 = oaf.j(i2, 0, i7);
                z04.c0("Currently playing item will be removed and added back to mimic move. Assumes item at " + p0 + " would be the new current item");
            }
            if (p0 >= min2) {
                p0 += i5;
            }
            ArrayList arrayList = new ArrayList(xqb.e);
            oaf.R(arrayList, i2, min, min2);
            m4b m2 = ((m4b) this.m.a).m(new xqb(zw6.j(arrayList), xqb.f), p0);
            ai3 ai3 = this.m;
            i0(new ai3(m2, (z9d) ai3.b, (k3b) ai3.c, (zw6) ai3.o, (Bundle) ai3.X, (iad) null), (Integer) null, (Integer) null);
            if (P()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i8 = 0; i8 < i5; i8++) {
                    arrayList2.add((yh8) this.k.d.get(i2));
                    this.g.W(((yh8) this.k.d.get(i2)).a);
                }
                for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                    this.g.p(((yh8) arrayList2.get(i9)).a, i9 + min2);
                }
            }
        }
    }

    public final void v() {
        U(0, Integer.MAX_VALUE);
    }

    public final int v0() {
        return 0;
    }

    public final void w(boolean z) {
        if (z != E0()) {
            m4b k2 = ((m4b) this.m.a).k(z);
            ai3 ai3 = this.m;
            i0(new ai3(k2, (z9d) ai3.b, (k3b) ai3.c, (zw6) ai3.o, (Bundle) ai3.X, (iad) null), (Integer) null, (Integer) null);
        }
        h98 R = this.g.R();
        jx6 jx6 = gf7.a;
        Bundle bundle = new Bundle();
        bundle.putInt(MediaSessionCompat.ACTION_ARGUMENT_SHUFFLE_MODE, z ? 1 : 0);
        R.i0(MediaSessionCompat.ACTION_SET_SHUFFLE_MODE, bundle);
    }

    public final void w0(List list) {
        d0(Integer.MAX_VALUE, list);
    }

    public final int x() {
        return ((m4b) this.m.a).c.f;
    }

    public final mue x0() {
        return ((m4b) this.m.a).j;
    }

    public final long y() {
        return ((m4b) this.m.a).C;
    }

    public final void z(n3b n3b) {
        this.d.a(n3b);
    }

    public final boolean z0() {
        m4b m4b = (m4b) this.m.a;
        if (m4b.q.a == 1) {
            return m4b.s;
        }
        qz7 qz7 = this.g;
        if (qz7 != null) {
            f98 P = qz7.P();
            jx6 jx6 = gf7.a;
            if (P != null && P.e == 0) {
                return true;
            }
        }
        return false;
    }
}
