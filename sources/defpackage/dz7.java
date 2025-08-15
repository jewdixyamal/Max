package defpackage;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

/* renamed from: dz7  reason: default package */
public abstract class dz7 {
    public static final ArrayList a(List list, int i, int i2, int i3) {
        ArrayList I0 = x53.I0(list, i, i);
        ArrayList arrayList = new ArrayList(z53.S(I0, 10));
        Iterator it = I0.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i5 = i4 + 1;
            if (i4 >= 0) {
                arrayList.add(new sma((List) next, i4 + i3, i2));
                i4 = i5;
            } else {
                y53.R();
                throw null;
            }
        }
        return arrayList;
    }

    public static final a51 b(CallsAudioDeviceInfo callsAudioDeviceInfo, boolean z) {
        int i = cz7.$EnumSwitchMapping$0[callsAudioDeviceInfo.getDeviceType().ordinal()];
        return i != 1 ? i != 2 ? (i == 3 || i == 4) ? new v41(callsAudioDeviceInfo, z) : i != 5 ? new y41(callsAudioDeviceInfo) : new x41(callsAudioDeviceInfo) : new w41(callsAudioDeviceInfo) : new z41(callsAudioDeviceInfo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.hb1 c(defpackage.fqa r30, boolean r31, boolean r32, boolean r33, defpackage.bn1 r34, defpackage.i95 r35, defpackage.gg1 r36) {
        /*
            r0 = r30
            r10 = r35
            ig1 r11 = r0.a
            if (r31 == 0) goto L_0x0013
            boolean r1 = r11.a()
            if (r1 == 0) goto L_0x0013
            iaf r1 = defpackage.iaf.b
        L_0x0010:
            r16 = r1
            goto L_0x002e
        L_0x0013:
            iaf r1 = defpackage.iaf.o
            if (r31 == 0) goto L_0x0018
            goto L_0x0010
        L_0x0018:
            if (r32 == 0) goto L_0x0029
            gg1 r2 = r11.getId()
            r3 = r36
            boolean r2 = defpackage.tpa.f(r2, r3)
            if (r2 == 0) goto L_0x0029
            iaf r1 = defpackage.iaf.c
            goto L_0x0010
        L_0x0029:
            if (r32 == 0) goto L_0x0010
            iaf r1 = defpackage.iaf.a
            goto L_0x0010
        L_0x002e:
            boolean r1 = r10 instanceof defpackage.f95
            r12 = 1
            r13 = 3
            if (r1 != 0) goto L_0x0037
        L_0x0034:
            r17 = r13
            goto L_0x0049
        L_0x0037:
            boolean r2 = r11.k()
            if (r2 == 0) goto L_0x0040
            r17 = r12
            goto L_0x0049
        L_0x0040:
            boolean r2 = r11.b()
            if (r2 != 0) goto L_0x0034
            r2 = 2
            r17 = r2
        L_0x0049:
            r14 = 0
            if (r31 == 0) goto L_0x0056
            if (r1 != 0) goto L_0x0054
            boolean r1 = r10 instanceof defpackage.h95
            if (r1 != 0) goto L_0x0054
        L_0x0052:
            r15 = r12
            goto L_0x005d
        L_0x0054:
            r15 = r14
            goto L_0x005d
        L_0x0056:
            boolean r1 = r11.isConnected()
            if (r1 != 0) goto L_0x0054
            goto L_0x0052
        L_0x005d:
            gg1 r18 = r11.getId()
            md0 r9 = new md0
            bo1 r8 = r0.b
            long r0 = r8.d()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.CharSequence r1 = r8.j()
            uc0 r0 = defpackage.oag.a(r1, r0)
            java.lang.String r1 = r8.q()
            r9.<init>(r0, r1)
            java.lang.String r19 = r8.getName()
            boolean r20 = r11.a()
            boolean r21 = r11.b()
            boolean r22 = r11.k()
            boolean r23 = r11.n()
            boolean r24 = r11.i()
            boolean r25 = r11.e()
            haf r26 = new haf
            gg1 r0 = r11.getId()
            long r1 = r0.a
            boolean r4 = r11.a()
            llf r5 = r11.s()
            if (r31 != 0) goto L_0x00b3
            boolean r0 = r11.isConnected()
            if (r0 == 0) goto L_0x00b1
            goto L_0x00b3
        L_0x00b1:
            r6 = r14
            goto L_0x00b4
        L_0x00b3:
            r6 = r12
        L_0x00b4:
            boolean r7 = r11.t()
            boolean r27 = r11.isScreenCaptureEnabled()
            llf r28 = r11.p()
            r0 = r26
            r3 = r31
            r29 = r8
            r8 = r27
            r27 = r9
            r9 = r28
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r0 = r29.getName()
            boolean r6 = r11.isScreenCaptureEnabled()
            int r1 = r11.r()
            if (r1 != r13) goto L_0x00e1
            r1 = r34
            r2 = r12
            goto L_0x00e4
        L_0x00e1:
            r1 = r34
            r2 = r14
        L_0x00e4:
            android.content.Context r8 = r1.a
            if (r31 == 0) goto L_0x00ee
            int r0 = defpackage.f0c.call_me_member
            java.lang.String r0 = r8.getString(r0)
        L_0x00ee:
            if (r2 == 0) goto L_0x00f3
            java.lang.String r3 = "  "
            goto L_0x00f5
        L_0x00f3:
            java.lang.String r3 = ""
        L_0x00f5:
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r4.<init>(r0)
            r9 = 0
            if (r2 == 0) goto L_0x014f
            yl5 r0 = new yl5
            int r2 = defpackage.x7a.G
            pq9 r3 = defpackage.qp4.u0
            sba r3 = r3.o(r8)
            fka r3 = r3.c
            bs6 r3 = r3.getIcon()
            int r3 = r3.c
            android.graphics.drawable.Drawable r2 = defpackage.dy7.E(r2, r3, r8)
            r3 = 12
            float r3 = (float) r3
            android.content.res.Resources r5 = defpackage.fk4.d()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r5 = r5 * r3
            int r5 = defpackage.tu0.G(r5)
            android.content.res.Resources r7 = defpackage.fk4.d()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r3 = r3 * r7
            int r3 = defpackage.tu0.G(r3)
            r2.setBounds(r14, r14, r5, r3)
            r3 = 6
            r0.<init>((android.graphics.drawable.Drawable) r2, (defpackage.sl5) r9, (int) r3)
            r2 = 17
            r4.setSpan(r0, r14, r12, r2)
        L_0x014f:
            r0 = r34
            r1 = r4
            r2 = r31
            r3 = r17
            r4 = r15
            r5 = r33
            r7 = r35
            android.text.SpannableStringBuilder r3 = r0.d(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = r11.o()
            java.lang.String r1 = r29.getName()
            if (r0 == 0) goto L_0x016f
            int r0 = defpackage.f0c.call_me_member
            java.lang.String r1 = r8.getString(r0)
        L_0x016f:
            boolean r0 = r11.o()
            if (r0 == 0) goto L_0x0182
            boolean r0 = r11.isConnected()
            if (r0 != 0) goto L_0x0182
            int r0 = defpackage.b8a.Y1
            java.lang.String r9 = r8.getString(r0)
            goto L_0x019b
        L_0x0182:
            boolean r0 = r11.k()
            if (r0 == 0) goto L_0x018f
            int r0 = defpackage.b8a.e2
            java.lang.String r9 = r8.getString(r0)
            goto L_0x019b
        L_0x018f:
            boolean r0 = r11.b()
            if (r0 != 0) goto L_0x019b
            int r0 = defpackage.b8a.d2
            java.lang.String r9 = r8.getString(r0)
        L_0x019b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r4 = r0.toString()
            if (r32 == 0) goto L_0x01b7
            boolean r0 = r11.h()
            r11 = r0
            goto L_0x01b8
        L_0x01b7:
            r11 = r14
        L_0x01b8:
            hb1 r28 = new hb1
            r0 = r28
            r1 = r18
            r2 = r19
            r5 = r27
            r6 = r22
            r7 = r23
            r8 = r15
            r9 = r20
            r10 = r21
            r12 = r31
            r13 = r24
            r14 = r25
            r15 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r28
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dz7.c(fqa, boolean, boolean, boolean, bn1, i95, gg1):hb1");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r9.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.yj1 d(defpackage.wvc r9, defpackage.fqa r10, boolean r11) {
        /*
            r0 = 0
            if (r9 == 0) goto L_0x000b
            kvc r1 = r9.b
            if (r1 == 0) goto L_0x000b
            gg1 r1 = r1.c
            r6 = r1
            goto L_0x000c
        L_0x000b:
            r6 = r0
        L_0x000c:
            ig1 r10 = r10.a
            gg1 r1 = r10.getId()
            boolean r3 = defpackage.tpa.f(r6, r1)
            boolean r4 = r10.m()
            if (r9 == 0) goto L_0x001f
            xvc r10 = r9.a
            goto L_0x0020
        L_0x001f:
            r10 = r0
        L_0x0020:
            xvc r1 = defpackage.xvc.a
            r2 = 1
            if (r10 != r1) goto L_0x0027
            r5 = r2
            goto L_0x0029
        L_0x0027:
            r10 = 0
            r5 = r10
        L_0x0029:
            if (r9 == 0) goto L_0x002d
            java.lang.CharSequence r0 = r9.d
        L_0x002d:
            r8 = r0
            r7 = r11 ^ 1
            yj1 r9 = new yj1
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dz7.d(wvc, fqa, boolean):yj1");
    }

    public static final zx7 e(hb1 hb1, la1 la1, bn1 bn1) {
        int i;
        SpannableStringBuilder spannableStringBuilder;
        hb1 hb12 = hb1;
        la1 la12 = la1;
        boolean z = la12.g;
        boolean z2 = false;
        boolean z3 = z ? false : hb12.Y;
        boolean z4 = la12.t;
        String str = hb12.b;
        boolean z5 = hb12.s0;
        boolean z6 = la12.m;
        haf haf = hb12.z0;
        boolean z7 = hb12.w0;
        int i2 = hb12.B0;
        if (z4 || z) {
            i = i2;
            spannableStringBuilder = null;
        } else {
            if (haf != null) {
                z2 = haf.g;
            }
            i = i2;
            spannableStringBuilder = bn1.g(z7, i2, str, z, z5, z6, z2, la12.e);
        }
        return new zx7(hb12.X, str, hb12.a, z3, z6, hb12.Z, z5, haf, z7, hb12.v0, i, spannableStringBuilder, hb12.o);
    }

    public static final qma f(hb1 hb1, boolean z, boolean z2, boolean z3) {
        hb1 hb12 = hb1;
        boolean z4 = false;
        boolean z5 = z ? hb12.Y : false;
        if (z2 || z3) {
            z4 = hb12.s0;
        }
        boolean z6 = z4;
        iaf iaf = z ? hb12.A0 : null;
        if (iaf == null) {
            iaf = iaf.o;
        }
        return new qma(hb12.X, hb12.b, hb12.a, z5, hb12.u0, z6, hb12.z0, iaf, hb12.w0, hb12.c);
    }
}
