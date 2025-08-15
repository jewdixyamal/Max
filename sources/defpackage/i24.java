package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: i24  reason: default package */
public abstract class i24 {
    public static final byte[] a = {0, 0, 0, 1};
    public static final String[] b = {"", "A", "B", "C"};
    public static final long[] c = {-9187201950435737345L, -1};
    public static final long[] d = new long[0];
    public static final Object[] e = new Object[0];
    public static final ky6 f = new ky6(15);

    public static final boolean A(String str, Bundle bundle) {
        Boolean u = u(str, bundle);
        if (u != null) {
            return u.booleanValue();
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static final double B(String str, Bundle bundle) {
        String string = bundle.getString(str);
        Double valueOf = string != null ? Double.valueOf(Double.parseDouble(string)) : null;
        if (valueOf != null) {
            return valueOf.doubleValue();
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static final int C(String str, Bundle bundle) {
        String string = bundle.getString(str);
        Integer valueOf = string != null ? Integer.valueOf(Integer.parseInt(string)) : null;
        if (valueOf != null) {
            return valueOf.intValue();
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static final long D(String str, Bundle bundle) {
        Long v = v(str, bundle);
        if (v != null) {
            return v.longValue();
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static final long[] E(String str, Bundle bundle) {
        return x53.E0(l6d.i0(new r1f(l6d.Z(w9e.R0(F(str, bundle), new String[]{","}, true, 4), y54.a), z54.a)));
    }

    public static final String F(String str, Bundle bundle) {
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static final void G(y5f y5f) {
        y5f.e(wj8.class, new sx6(5));
        y5f.e(jb4.class, new sx6(6));
        y5f.e(so4.class, new sx6(7));
        y5f.e(spd.class, new sx6(8));
        y5f.e(wxd.class, new ze7(24));
        y5f.e(taa.class, new ze7(25));
    }

    public static final void H(y5f y5f) {
        y5f.c(b64.class, new it7(5));
    }

    public static final int I(float f2) {
        return f2 >= ((float) 16) ? 2 : 1;
    }

    public static void J(ByteArrayOutputStream byteArrayOutputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((int) ((j >> (i2 * 8)) & 255));
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void K(int i, ByteArrayOutputStream byteArrayOutputStream) {
        J(byteArrayOutputStream, (long) i, 2);
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [u9g, lx3, e0] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        if (kotlinx.coroutines.internal.DispatchedContinuationKt.yieldUndispatched(r5) == false) goto L_0x0019;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object L(kotlin.coroutines.Continuation r5) {
        /*
            lx3 r0 = r5.getContext()
            defpackage.pag.j(r0)
            kotlin.coroutines.Continuation r5 = defpackage.v3c.u(r5)
            boolean r1 = r5 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r1 == 0) goto L_0x0012
            kotlinx.coroutines.internal.DispatchedContinuation r5 = (kotlinx.coroutines.internal.DispatchedContinuation) r5
            goto L_0x0013
        L_0x0012:
            r5 = 0
        L_0x0013:
            tx3 r1 = defpackage.tx3.a
            e5f r2 = defpackage.e5f.a
            if (r5 != 0) goto L_0x001b
        L_0x0019:
            r5 = r2
            goto L_0x0040
        L_0x001b:
            nx3 r3 = r5.dispatcher
            boolean r3 = r3.isDispatchNeeded(r0)
            if (r3 == 0) goto L_0x0027
            r5.dispatchYield$kotlinx_coroutines_core(r0, r2)
            goto L_0x003f
        L_0x0027:
            u9g r3 = new u9g
            vu4 r4 = defpackage.u9g.b
            r3.<init>(r4)
            lx3 r0 = r0.plus(r3)
            r5.dispatchYield$kotlinx_coroutines_core(r0, r2)
            boolean r0 = r3.a
            if (r0 == 0) goto L_0x003f
            boolean r5 = kotlinx.coroutines.internal.DispatchedContinuationKt.yieldUndispatched(r5)
            if (r5 == 0) goto L_0x0019
        L_0x003f:
            r5 = r1
        L_0x0040:
            if (r5 != r1) goto L_0x0043
            return r5
        L_0x0043:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i24.L(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0283, code lost:
        if (r2.d == r7) goto L_0x0287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0109, code lost:
        if (r4.d == r13) goto L_0x010d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0440 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x04aa A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x0584  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0586  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x059b  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x059e  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x05a4  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x0674  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x06bb  */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x06bd  */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x06c8  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x06cb  */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x06d1  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x06d4  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x06d8  */
    /* JADX WARNING: Removed duplicated region for block: B:416:0x06e8  */
    /* JADX WARNING: Removed duplicated region for block: B:432:0x0113 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(defpackage.ij3 r36, defpackage.zh7 r37, java.util.ArrayList r38, int r39) {
        /*
            r0 = r36
            r10 = r37
            r11 = r38
            r12 = 2
            if (r39 != 0) goto L_0x0012
            int r1 = r0.z0
            f12[] r2 = r0.C0
            r14 = r1
            r15 = r2
            r16 = 0
            goto L_0x001a
        L_0x0012:
            int r1 = r0.A0
            f12[] r2 = r0.B0
            r14 = r1
            r15 = r2
            r16 = r12
        L_0x001a:
            r9 = 0
        L_0x001b:
            if (r9 >= r14) goto L_0x0714
            r1 = r15[r9]
            boolean r2 = r1.q
            hj3 r8 = r1.a
            r3 = 3
            r4 = 1
            r7 = 8
            r17 = 0
            if (r2 != 0) goto L_0x0155
            int r2 = r1.l
            int r6 = r2 * 2
            r13 = r8
            r20 = r13
            r18 = 0
        L_0x0034:
            if (r18 != 0) goto L_0x011f
            int r5 = r1.i
            int r5 = r5 + r4
            r1.i = r5
            hj3[] r5 = r13.m0
            r5[r2] = r17
            hj3[] r5 = r13.l0
            r5[r2] = r17
            int r5 = r13.g0
            oi3[] r4 = r13.Q
            if (r5 == r7) goto L_0x00ec
            r13.j(r2)
            r5 = r4[r6]
            r5.e()
            int r5 = r6 + 1
            r23 = r4[r5]
            r23.e()
            r23 = r4[r6]
            r23.e()
            r5 = r4[r5]
            r5.e()
            hj3 r5 = r1.b
            if (r5 != 0) goto L_0x0068
            r1.b = r13
        L_0x0068:
            r1.d = r13
            int[] r5 = r13.p0
            r5 = r5[r2]
            if (r5 != r3) goto L_0x00ec
            int[] r7 = r13.t
            r7 = r7[r2]
            if (r7 == 0) goto L_0x007e
            if (r7 == r3) goto L_0x007e
            if (r7 != r12) goto L_0x007b
            goto L_0x007e
        L_0x007b:
            r25 = r9
            goto L_0x00d0
        L_0x007e:
            int r12 = r1.j
            r22 = 1
            int r12 = r12 + 1
            r1.j = r12
            float[] r12 = r13.k0
            r12 = r12[r2]
            r21 = 0
            int r24 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r24 <= 0) goto L_0x0095
            float r3 = r1.k
            float r3 = r3 + r12
            r1.k = r3
        L_0x0095:
            int r3 = r13.g0
            r25 = r9
            r9 = 8
            if (r3 == r9) goto L_0x00c0
            r3 = 3
            if (r5 != r3) goto L_0x00c0
            if (r7 == 0) goto L_0x00a4
            if (r7 != r3) goto L_0x00c0
        L_0x00a4:
            r3 = 0
            int r5 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x00ad
            r3 = 1
            r1.n = r3
            goto L_0x00b0
        L_0x00ad:
            r3 = 1
            r1.o = r3
        L_0x00b0:
            java.util.ArrayList r3 = r1.h
            if (r3 != 0) goto L_0x00bb
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.h = r3
        L_0x00bb:
            java.util.ArrayList r3 = r1.h
            r3.add(r13)
        L_0x00c0:
            hj3 r3 = r1.f
            if (r3 != 0) goto L_0x00c6
            r1.f = r13
        L_0x00c6:
            hj3 r3 = r1.g
            if (r3 == 0) goto L_0x00ce
            hj3[] r3 = r3.l0
            r3[r2] = r13
        L_0x00ce:
            r1.g = r13
        L_0x00d0:
            if (r2 != 0) goto L_0x00de
            int r3 = r13.r
            if (r3 == 0) goto L_0x00d7
            goto L_0x00e9
        L_0x00d7:
            int r3 = r13.u
            if (r3 != 0) goto L_0x00e9
            int r3 = r13.v
            goto L_0x00e9
        L_0x00de:
            int r3 = r13.s
            if (r3 == 0) goto L_0x00e3
            goto L_0x00e9
        L_0x00e3:
            int r3 = r13.x
            if (r3 != 0) goto L_0x00e9
            int r3 = r13.y
        L_0x00e9:
            r3 = r20
            goto L_0x00ef
        L_0x00ec:
            r25 = r9
            goto L_0x00e9
        L_0x00ef:
            if (r3 == r13) goto L_0x00f5
            hj3[] r3 = r3.m0
            r3[r2] = r13
        L_0x00f5:
            int r3 = r6 + 1
            r3 = r4[r3]
            oi3 r3 = r3.f
            if (r3 == 0) goto L_0x010b
            hj3 r3 = r3.d
            oi3[] r4 = r3.Q
            r4 = r4[r6]
            oi3 r4 = r4.f
            if (r4 == 0) goto L_0x010b
            hj3 r4 = r4.d
            if (r4 == r13) goto L_0x010d
        L_0x010b:
            r3 = r17
        L_0x010d:
            if (r3 == 0) goto L_0x0110
            goto L_0x0113
        L_0x0110:
            r3 = r13
            r18 = 1
        L_0x0113:
            r20 = r13
            r9 = r25
            r4 = 1
            r7 = 8
            r12 = 2
            r13 = r3
            r3 = 3
            goto L_0x0034
        L_0x011f:
            r25 = r9
            hj3 r3 = r1.b
            if (r3 == 0) goto L_0x012c
            oi3[] r3 = r3.Q
            r3 = r3[r6]
            r3.e()
        L_0x012c:
            hj3 r3 = r1.d
            if (r3 == 0) goto L_0x0139
            int r6 = r6 + 1
            oi3[] r3 = r3.Q
            r3 = r3[r6]
            r3.e()
        L_0x0139:
            r1.c = r13
            if (r2 != 0) goto L_0x0144
            boolean r2 = r1.m
            if (r2 == 0) goto L_0x0144
            r1.e = r13
            goto L_0x0146
        L_0x0144:
            r1.e = r8
        L_0x0146:
            boolean r2 = r1.o
            if (r2 == 0) goto L_0x0150
            boolean r2 = r1.n
            if (r2 == 0) goto L_0x0150
            r2 = 1
            goto L_0x0151
        L_0x0150:
            r2 = 0
        L_0x0151:
            r1.p = r2
            r2 = 1
            goto L_0x0158
        L_0x0155:
            r25 = r9
            r2 = r4
        L_0x0158:
            r1.q = r2
            if (r11 == 0) goto L_0x016d
            boolean r2 = r11.contains(r8)
            if (r2 == 0) goto L_0x0163
            goto L_0x016d
        L_0x0163:
            r30 = r14
            r31 = r15
            r23 = r25
            r19 = 0
            goto L_0x0707
        L_0x016d:
            hj3 r12 = r1.c
            hj3 r13 = r1.b
            hj3 r9 = r1.d
            hj3 r2 = r1.e
            float r3 = r1.k
            int[] r4 = r0.p0
            r4 = r4[r39]
            r7 = 2
            if (r4 != r7) goto L_0x0180
            r4 = 1
            goto L_0x0181
        L_0x0180:
            r4 = 0
        L_0x0181:
            if (r39 != 0) goto L_0x01a0
            int r5 = r2.i0
            r6 = 1
            if (r5 != 0) goto L_0x018b
            r22 = 1
            goto L_0x018d
        L_0x018b:
            r22 = 0
        L_0x018d:
            if (r5 != r6) goto L_0x0192
            r18 = r6
            goto L_0x0194
        L_0x0192:
            r18 = 0
        L_0x0194:
            if (r5 != r7) goto L_0x0198
            r5 = r6
            goto L_0x0199
        L_0x0198:
            r5 = 0
        L_0x0199:
            r26 = r3
            r7 = r8
            r20 = r22
        L_0x019e:
            r6 = 0
            goto L_0x01bc
        L_0x01a0:
            r6 = 1
            int r5 = r2.j0
            if (r5 != 0) goto L_0x01a8
            r18 = r6
            goto L_0x01aa
        L_0x01a8:
            r18 = 0
        L_0x01aa:
            if (r5 != r6) goto L_0x01ae
            r6 = 1
            goto L_0x01af
        L_0x01ae:
            r6 = 0
        L_0x01af:
            if (r5 != r7) goto L_0x01b3
            r5 = 1
            goto L_0x01b4
        L_0x01b3:
            r5 = 0
        L_0x01b4:
            r26 = r3
            r7 = r8
            r20 = r18
            r18 = r6
            goto L_0x019e
        L_0x01bc:
            oi3[] r3 = r0.Q
            if (r6 != 0) goto L_0x029c
            oi3[] r11 = r7.Q
            r11 = r11[r16]
            if (r5 == 0) goto L_0x01c9
            r27 = 1
            goto L_0x01cb
        L_0x01c9:
            r27 = 4
        L_0x01cb:
            int r28 = r11.e()
            r29 = r6
            int[] r6 = r7.p0
            r30 = r14
            r14 = r6[r39]
            r31 = r15
            r15 = 3
            if (r14 != r15) goto L_0x01e4
            int[] r14 = r7.t
            r14 = r14[r39]
            if (r14 != 0) goto L_0x01e4
            r14 = 1
            goto L_0x01e5
        L_0x01e4:
            r14 = 0
        L_0x01e5:
            oi3 r15 = r11.f
            if (r15 == 0) goto L_0x01f1
            if (r7 == r8) goto L_0x01f1
            int r15 = r15.e()
            int r28 = r15 + r28
        L_0x01f1:
            r15 = r28
            if (r5 == 0) goto L_0x01fe
            if (r7 == r8) goto L_0x01fe
            if (r7 == r13) goto L_0x01fe
            r28 = r2
            r27 = 8
            goto L_0x0200
        L_0x01fe:
            r28 = r2
        L_0x0200:
            oi3 r2 = r11.f
            if (r2 == 0) goto L_0x023e
            if (r7 != r13) goto L_0x0213
            r32 = r8
            sud r8 = r11.i
            sud r2 = r2.i
            r33 = r1
            r1 = 6
            r10.f(r8, r2, r15, r1)
            goto L_0x0220
        L_0x0213:
            r33 = r1
            r32 = r8
            sud r1 = r11.i
            sud r2 = r2.i
            r8 = 8
            r10.f(r1, r2, r15, r8)
        L_0x0220:
            if (r14 == 0) goto L_0x0226
            if (r5 != 0) goto L_0x0226
            r27 = 5
        L_0x0226:
            if (r7 != r13) goto L_0x0232
            if (r5 == 0) goto L_0x0232
            boolean[] r1 = r7.S
            boolean r1 = r1[r39]
            if (r1 == 0) goto L_0x0232
            r1 = 5
            goto L_0x0234
        L_0x0232:
            r1 = r27
        L_0x0234:
            sud r2 = r11.i
            oi3 r8 = r11.f
            sud r8 = r8.i
            r10.e(r2, r8, r15, r1)
            goto L_0x0242
        L_0x023e:
            r33 = r1
            r32 = r8
        L_0x0242:
            oi3[] r1 = r7.Q
            if (r4 == 0) goto L_0x026f
            int r2 = r7.g0
            r8 = 8
            if (r2 == r8) goto L_0x0261
            r2 = r6[r39]
            r6 = 3
            if (r2 != r6) goto L_0x0261
            int r2 = r16 + 1
            r2 = r1[r2]
            sud r2 = r2.i
            r6 = r1[r16]
            sud r6 = r6.i
            r8 = 0
            r11 = 5
            r10.f(r2, r6, r8, r11)
            goto L_0x0262
        L_0x0261:
            r8 = 0
        L_0x0262:
            r2 = r1[r16]
            sud r2 = r2.i
            r3 = r3[r16]
            sud r3 = r3.i
            r6 = 8
            r10.f(r2, r3, r8, r6)
        L_0x026f:
            int r2 = r16 + 1
            r1 = r1[r2]
            oi3 r1 = r1.f
            if (r1 == 0) goto L_0x0285
            hj3 r1 = r1.d
            oi3[] r2 = r1.Q
            r2 = r2[r16]
            oi3 r2 = r2.f
            if (r2 == 0) goto L_0x0285
            hj3 r2 = r2.d
            if (r2 == r7) goto L_0x0287
        L_0x0285:
            r1 = r17
        L_0x0287:
            if (r1 == 0) goto L_0x028d
            r7 = r1
            r6 = r29
            goto L_0x028e
        L_0x028d:
            r6 = 1
        L_0x028e:
            r11 = r38
            r2 = r28
            r14 = r30
            r15 = r31
            r8 = r32
            r1 = r33
            goto L_0x01bc
        L_0x029c:
            r33 = r1
            r28 = r2
            r32 = r8
            r30 = r14
            r31 = r15
            if (r9 == 0) goto L_0x0303
            oi3[] r1 = r12.Q
            int r2 = r16 + 1
            r1 = r1[r2]
            oi3 r1 = r1.f
            if (r1 == 0) goto L_0x0303
            oi3[] r1 = r9.Q
            r1 = r1[r2]
            int[] r6 = r9.p0
            r6 = r6[r39]
            r7 = 3
            if (r6 != r7) goto L_0x02d9
            int[] r6 = r9.t
            r6 = r6[r39]
            if (r6 != 0) goto L_0x02d9
            if (r5 != 0) goto L_0x02d9
            oi3 r6 = r1.f
            hj3 r7 = r6.d
            if (r7 != r0) goto L_0x02d9
            sud r7 = r1.i
            sud r6 = r6.i
            int r8 = r1.e()
            int r8 = -r8
            r11 = 5
            r10.e(r7, r6, r8, r11)
            goto L_0x02ef
        L_0x02d9:
            r11 = 5
            if (r5 == 0) goto L_0x02ef
            oi3 r6 = r1.f
            hj3 r7 = r6.d
            if (r7 != r0) goto L_0x02ef
            sud r7 = r1.i
            sud r6 = r6.i
            int r8 = r1.e()
            int r8 = -r8
            r14 = 4
            r10.e(r7, r6, r8, r14)
        L_0x02ef:
            sud r6 = r1.i
            oi3[] r7 = r12.Q
            r2 = r7[r2]
            oi3 r2 = r2.f
            sud r2 = r2.i
            int r1 = r1.e()
            int r1 = -r1
            r7 = 6
            r10.g(r6, r2, r1, r7)
            goto L_0x0304
        L_0x0303:
            r11 = 5
        L_0x0304:
            if (r4 == 0) goto L_0x031b
            int r1 = r16 + 1
            r2 = r3[r1]
            sud r2 = r2.i
            oi3[] r3 = r12.Q
            r1 = r3[r1]
            sud r3 = r1.i
            int r1 = r1.e()
            r4 = 8
            r10.f(r2, r3, r1, r4)
        L_0x031b:
            r1 = r33
            java.util.ArrayList r2 = r1.h
            if (r2 == 0) goto L_0x043a
            int r3 = r2.size()
            r4 = 1
            if (r3 <= r4) goto L_0x043a
            boolean r6 = r1.n
            if (r6 == 0) goto L_0x0334
            boolean r6 = r1.p
            if (r6 != 0) goto L_0x0334
            int r6 = r1.j
            float r6 = (float) r6
            goto L_0x0336
        L_0x0334:
            r6 = r26
        L_0x0336:
            r14 = r17
            r7 = 0
            r8 = 0
        L_0x033a:
            if (r8 >= r3) goto L_0x043a
            java.lang.Object r15 = r2.get(r8)
            hj3 r15 = (defpackage.hj3) r15
            float[] r4 = r15.k0
            r4 = r4[r39]
            r21 = 0
            int r24 = (r4 > r21 ? 1 : (r4 == r21 ? 0 : -1))
            oi3[] r11 = r15.Q
            if (r24 >= 0) goto L_0x036b
            boolean r4 = r1.p
            if (r4 == 0) goto L_0x0364
            int r0 = r16 + 1
            r0 = r11[r0]
            sud r0 = r0.i
            r4 = r11[r16]
            sud r4 = r4.i
            r11 = 0
            r15 = 4
            r10.e(r0, r4, r11, r15)
            r24 = r15
            goto L_0x0382
        L_0x0364:
            r24 = 4
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x0368:
            r21 = 0
            goto L_0x036e
        L_0x036b:
            r24 = 4
            goto L_0x0368
        L_0x036e:
            int r26 = (r4 > r21 ? 1 : (r4 == r21 ? 0 : -1))
            if (r26 != 0) goto L_0x038c
            int r0 = r16 + 1
            r0 = r11[r0]
            sud r0 = r0.i
            r4 = r11[r16]
            sud r4 = r4.i
            r11 = 0
            r15 = 8
            r10.e(r0, r4, r11, r15)
        L_0x0382:
            r29 = r2
            r27 = r3
            r19 = r11
            r21 = 0
            goto L_0x042e
        L_0x038c:
            r19 = 0
            if (r14 == 0) goto L_0x0420
            oi3[] r14 = r14.Q
            r0 = r14[r16]
            sud r0 = r0.i
            int r27 = r16 + 1
            r14 = r14[r27]
            sud r14 = r14.i
            r29 = r2
            r2 = r11[r16]
            sud r2 = r2.i
            r11 = r11[r27]
            sud r11 = r11.i
            r27 = r3
            ws r3 = r37.l()
            r33 = r15
            r15 = 0
            r3.b = r15
            int r21 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r21 == 0) goto L_0x03bb
            int r21 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r21 != 0) goto L_0x03c3
        L_0x03bb:
            r26 = r4
            r4 = r15
            r15 = 1065353216(0x3f800000, float:1.0)
            r21 = 0
            goto L_0x0408
        L_0x03c3:
            r21 = 0
            int r34 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            if (r34 != 0) goto L_0x03d8
            ks r2 = r3.d
            r7 = 1065353216(0x3f800000, float:1.0)
            r2.j(r0, r7)
            ks r0 = r3.d
            r0.j(r14, r15)
        L_0x03d5:
            r26 = r4
            goto L_0x041c
        L_0x03d8:
            r15 = 1065353216(0x3f800000, float:1.0)
            if (r26 != 0) goto L_0x03e9
            ks r0 = r3.d
            r0.j(r2, r15)
            ks r0 = r3.d
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.j(r11, r2)
            goto L_0x03d5
        L_0x03e9:
            float r7 = r7 / r6
            float r26 = r4 / r6
            float r7 = r7 / r26
            r26 = r4
            ks r4 = r3.d
            r4.j(r0, r15)
            ks r0 = r3.d
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.j(r14, r4)
            ks r0 = r3.d
            r0.j(r11, r7)
            ks r0 = r3.d
            float r4 = -r7
            r0.j(r2, r4)
            goto L_0x041c
        L_0x0408:
            ks r7 = r3.d
            r7.j(r0, r15)
            ks r0 = r3.d
            r0.j(r14, r4)
            ks r0 = r3.d
            r0.j(r11, r15)
            ks r0 = r3.d
            r0.j(r2, r4)
        L_0x041c:
            r10.c(r3)
            goto L_0x042a
        L_0x0420:
            r29 = r2
            r27 = r3
            r26 = r4
            r33 = r15
            r21 = 0
        L_0x042a:
            r7 = r26
            r14 = r33
        L_0x042e:
            int r8 = r8 + 1
            r3 = r27
            r2 = r29
            r4 = 1
            r11 = 5
            r0 = r36
            goto L_0x033a
        L_0x043a:
            r19 = 0
            r24 = 4
            if (r13 == 0) goto L_0x0447
            if (r13 == r9) goto L_0x0444
            if (r5 == 0) goto L_0x0447
        L_0x0444:
            r0 = r32
            goto L_0x044f
        L_0x0447:
            r14 = r9
            r15 = r25
            r0 = r32
            r11 = 2
            goto L_0x04a8
        L_0x044f:
            oi3[] r0 = r0.Q
            r0 = r0[r16]
            oi3[] r1 = r12.Q
            int r2 = r16 + 1
            r1 = r1[r2]
            oi3 r0 = r0.f
            if (r0 == 0) goto L_0x0461
            sud r0 = r0.i
            r3 = r0
            goto L_0x0463
        L_0x0461:
            r3 = r17
        L_0x0463:
            oi3 r0 = r1.f
            if (r0 == 0) goto L_0x046b
            sud r0 = r0.i
            r6 = r0
            goto L_0x046d
        L_0x046b:
            r6 = r17
        L_0x046d:
            oi3[] r0 = r13.Q
            r0 = r0[r16]
            if (r9 == 0) goto L_0x0477
            oi3[] r1 = r9.Q
            r1 = r1[r2]
        L_0x0477:
            if (r3 == 0) goto L_0x04a0
            if (r6 == 0) goto L_0x04a0
            if (r39 != 0) goto L_0x0483
            r2 = r28
            float r2 = r2.d0
        L_0x0481:
            r5 = r2
            goto L_0x0488
        L_0x0483:
            r2 = r28
            float r2 = r2.e0
            goto L_0x0481
        L_0x0488:
            int r4 = r0.e()
            int r8 = r1.e()
            sud r2 = r0.i
            sud r7 = r1.i
            r0 = 7
            r1 = r37
            r11 = 2
            r14 = r9
            r15 = r25
            r9 = r0
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x04a4
        L_0x04a0:
            r14 = r9
            r15 = r25
            r11 = 2
        L_0x04a4:
            r23 = r15
            goto L_0x06ad
        L_0x04a8:
            if (r20 == 0) goto L_0x058d
            if (r13 == 0) goto L_0x058d
            int r2 = r1.j
            if (r2 <= 0) goto L_0x04b7
            int r1 = r1.i
            if (r1 != r2) goto L_0x04b7
            r22 = 1
            goto L_0x04b9
        L_0x04b7:
            r22 = r19
        L_0x04b9:
            r8 = r13
            r9 = r8
        L_0x04bb:
            if (r9 == 0) goto L_0x04a4
            hj3[] r1 = r9.m0
            r1 = r1[r39]
            r7 = r1
        L_0x04c2:
            if (r7 == 0) goto L_0x04cf
            int r1 = r7.g0
            r6 = 8
            if (r1 != r6) goto L_0x04d1
            hj3[] r1 = r7.m0
            r7 = r1[r39]
            goto L_0x04c2
        L_0x04cf:
            r6 = 8
        L_0x04d1:
            if (r7 != 0) goto L_0x04dd
            if (r9 != r14) goto L_0x04d6
            goto L_0x04dd
        L_0x04d6:
            r21 = r7
            r23 = r8
            r11 = r9
            goto L_0x057e
        L_0x04dd:
            oi3[] r1 = r9.Q
            r2 = r1[r16]
            sud r3 = r2.i
            oi3 r4 = r2.f
            if (r4 == 0) goto L_0x04ea
            sud r4 = r4.i
            goto L_0x04ec
        L_0x04ea:
            r4 = r17
        L_0x04ec:
            if (r8 == r9) goto L_0x04f7
            oi3[] r4 = r8.Q
            int r5 = r16 + 1
            r4 = r4[r5]
            sud r4 = r4.i
            goto L_0x0506
        L_0x04f7:
            if (r9 != r13) goto L_0x0506
            oi3[] r4 = r0.Q
            r4 = r4[r16]
            oi3 r4 = r4.f
            if (r4 == 0) goto L_0x0504
            sud r4 = r4.i
            goto L_0x0506
        L_0x0504:
            r4 = r17
        L_0x0506:
            int r2 = r2.e()
            int r5 = r16 + 1
            r21 = r1[r5]
            int r21 = r21.e()
            if (r7 == 0) goto L_0x051b
            oi3[] r6 = r7.Q
            r6 = r6[r16]
            sud r11 = r6.i
            goto L_0x0528
        L_0x051b:
            oi3[] r6 = r12.Q
            r6 = r6[r5]
            oi3 r6 = r6.f
            if (r6 == 0) goto L_0x0526
            sud r11 = r6.i
            goto L_0x0528
        L_0x0526:
            r11 = r17
        L_0x0528:
            r1 = r1[r5]
            sud r1 = r1.i
            if (r6 == 0) goto L_0x0534
            int r6 = r6.e()
            int r21 = r6 + r21
        L_0x0534:
            oi3[] r6 = r8.Q
            r6 = r6[r5]
            int r6 = r6.e()
            int r6 = r6 + r2
            if (r3 == 0) goto L_0x04d6
            if (r4 == 0) goto L_0x04d6
            if (r11 == 0) goto L_0x04d6
            if (r1 == 0) goto L_0x04d6
            if (r9 != r13) goto L_0x0550
            oi3[] r2 = r13.Q
            r2 = r2[r16]
            int r2 = r2.e()
            r6 = r2
        L_0x0550:
            if (r9 != r14) goto L_0x055c
            oi3[] r2 = r14.Q
            r2 = r2[r5]
            int r2 = r2.e()
            r21 = r2
        L_0x055c:
            if (r22 == 0) goto L_0x0561
            r24 = 8
            goto L_0x0563
        L_0x0561:
            r24 = 5
        L_0x0563:
            r5 = 1056964608(0x3f000000, float:0.5)
            r25 = r1
            r1 = r37
            r2 = r3
            r3 = r4
            r4 = r6
            r23 = 8
            r6 = r11
            r11 = r7
            r7 = r25
            r23 = r8
            r8 = r21
            r21 = r11
            r11 = r9
            r9 = r24
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x057e:
            int r1 = r11.g0
            r9 = 8
            if (r1 == r9) goto L_0x0586
            r8 = r11
            goto L_0x0588
        L_0x0586:
            r8 = r23
        L_0x0588:
            r9 = r21
            r11 = 2
            goto L_0x04bb
        L_0x058d:
            r9 = 8
            if (r18 == 0) goto L_0x04a4
            if (r13 == 0) goto L_0x04a4
            int r2 = r1.j
            if (r2 <= 0) goto L_0x059e
            int r1 = r1.i
            if (r1 != r2) goto L_0x059e
            r22 = 1
            goto L_0x05a0
        L_0x059e:
            r22 = r19
        L_0x05a0:
            r8 = r13
            r11 = r8
        L_0x05a2:
            if (r11 == 0) goto L_0x0659
            hj3[] r1 = r11.m0
            r1 = r1[r39]
        L_0x05a8:
            if (r1 == 0) goto L_0x05b3
            int r2 = r1.g0
            if (r2 != r9) goto L_0x05b3
            hj3[] r1 = r1.m0
            r1 = r1[r39]
            goto L_0x05a8
        L_0x05b3:
            if (r11 == r13) goto L_0x0646
            if (r11 == r14) goto L_0x0646
            if (r1 == 0) goto L_0x0646
            if (r1 != r14) goto L_0x05be
            r7 = r17
            goto L_0x05bf
        L_0x05be:
            r7 = r1
        L_0x05bf:
            oi3[] r1 = r11.Q
            r2 = r1[r16]
            sud r3 = r2.i
            oi3[] r4 = r8.Q
            int r5 = r16 + 1
            r4 = r4[r5]
            sud r4 = r4.i
            int r2 = r2.e()
            r6 = r1[r5]
            int r6 = r6.e()
            if (r7 == 0) goto L_0x05eb
            oi3[] r1 = r7.Q
            r1 = r1[r16]
            sud r9 = r1.i
            r21 = r7
            oi3 r7 = r1.f
            if (r7 == 0) goto L_0x05e8
            sud r7 = r7.i
            goto L_0x0601
        L_0x05e8:
            r7 = r17
            goto L_0x0601
        L_0x05eb:
            r21 = r7
            oi3[] r7 = r14.Q
            r7 = r7[r16]
            if (r7 == 0) goto L_0x05f6
            sud r9 = r7.i
            goto L_0x05f8
        L_0x05f6:
            r9 = r17
        L_0x05f8:
            r1 = r1[r5]
            sud r1 = r1.i
            r35 = r7
            r7 = r1
            r1 = r35
        L_0x0601:
            if (r1 == 0) goto L_0x060b
            int r1 = r1.e()
            int r1 = r1 + r6
            r23 = r1
            goto L_0x060d
        L_0x060b:
            r23 = r6
        L_0x060d:
            oi3[] r1 = r8.Q
            r1 = r1[r5]
            int r1 = r1.e()
            int r5 = r1 + r2
            if (r22 == 0) goto L_0x061c
            r25 = 8
            goto L_0x061e
        L_0x061c:
            r25 = r24
        L_0x061e:
            if (r3 == 0) goto L_0x063d
            if (r4 == 0) goto L_0x063d
            if (r9 == 0) goto L_0x063d
            if (r7 == 0) goto L_0x063d
            r6 = 1056964608(0x3f000000, float:0.5)
            r1 = r37
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r9
            r26 = r8
            r8 = r23
            r23 = r15
            r15 = 8
            r9 = r25
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0643
        L_0x063d:
            r26 = r8
            r23 = r15
            r15 = 8
        L_0x0643:
            r1 = r21
            goto L_0x064b
        L_0x0646:
            r26 = r8
            r23 = r15
            r15 = r9
        L_0x064b:
            int r2 = r11.g0
            if (r2 == r15) goto L_0x0651
            r8 = r11
            goto L_0x0653
        L_0x0651:
            r8 = r26
        L_0x0653:
            r11 = r1
            r9 = r15
            r15 = r23
            goto L_0x05a2
        L_0x0659:
            r23 = r15
            oi3[] r1 = r13.Q
            r1 = r1[r16]
            oi3[] r0 = r0.Q
            r0 = r0[r16]
            oi3 r0 = r0.f
            oi3[] r2 = r14.Q
            int r3 = r16 + 1
            r11 = r2[r3]
            oi3[] r2 = r12.Q
            r2 = r2[r3]
            oi3 r15 = r2.f
            r9 = 5
            if (r0 == 0) goto L_0x0681
            if (r13 == r14) goto L_0x0683
            sud r2 = r1.i
            sud r0 = r0.i
            int r1 = r1.e()
            r10.e(r2, r0, r1, r9)
        L_0x0681:
            r0 = r9
            goto L_0x069d
        L_0x0683:
            if (r15 == 0) goto L_0x0681
            sud r2 = r1.i
            sud r3 = r0.i
            int r4 = r1.e()
            sud r6 = r11.i
            sud r7 = r15.i
            int r8 = r11.e()
            r5 = 1056964608(0x3f000000, float:0.5)
            r1 = r37
            r0 = r9
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x069d:
            if (r15 == 0) goto L_0x06ad
            if (r13 == r14) goto L_0x06ad
            sud r1 = r11.i
            sud r2 = r15.i
            int r3 = r11.e()
            int r3 = -r3
            r10.e(r1, r2, r3, r0)
        L_0x06ad:
            if (r20 != 0) goto L_0x06b1
            if (r18 == 0) goto L_0x0707
        L_0x06b1:
            if (r13 == 0) goto L_0x0707
            if (r13 == r14) goto L_0x0707
            oi3[] r0 = r13.Q
            r1 = r0[r16]
            if (r14 != 0) goto L_0x06bd
            r9 = r13
            goto L_0x06be
        L_0x06bd:
            r9 = r14
        L_0x06be:
            int r2 = r16 + 1
            oi3[] r3 = r9.Q
            r4 = r3[r2]
            oi3 r5 = r1.f
            if (r5 == 0) goto L_0x06cb
            sud r5 = r5.i
            goto L_0x06cd
        L_0x06cb:
            r5 = r17
        L_0x06cd:
            oi3 r6 = r4.f
            if (r6 == 0) goto L_0x06d4
            sud r6 = r6.i
            goto L_0x06d6
        L_0x06d4:
            r6 = r17
        L_0x06d6:
            if (r12 == r9) goto L_0x06e6
            oi3[] r6 = r12.Q
            r6 = r6[r2]
            oi3 r6 = r6.f
            if (r6 == 0) goto L_0x06e4
            sud r6 = r6.i
            r17 = r6
        L_0x06e4:
            r6 = r17
        L_0x06e6:
            if (r13 != r9) goto L_0x06ea
            r4 = r0[r2]
        L_0x06ea:
            if (r5 == 0) goto L_0x0707
            if (r6 == 0) goto L_0x0707
            int r0 = r1.e()
            r2 = r3[r2]
            int r8 = r2.e()
            sud r2 = r1.i
            sud r7 = r4.i
            r9 = 5
            r11 = 1056964608(0x3f000000, float:0.5)
            r1 = r37
            r3 = r5
            r4 = r0
            r5 = r11
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0707:
            int r9 = r23 + 1
            r12 = 2
            r0 = r36
            r11 = r38
            r14 = r30
            r15 = r31
            goto L_0x001b
        L_0x0714:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i24.a(ij3, zh7, java.util.ArrayList, int):void");
    }

    public static void b(View view, qka qka, fka fka) {
        boolean z = qka instanceof oka;
        z6a z6a = z6a.c;
        b7a b7a = b7a.o;
        c7a c7a = c7a.b;
        OneMeButton oneMeButton = null;
        if (z) {
            yka yka = ((oka) qka).a;
            if (yka instanceof vka) {
                if (view instanceof OneMeButton) {
                    oneMeButton = (OneMeButton) view;
                }
                if (oneMeButton != null) {
                    oneMeButton.setSize(c7a);
                    oneMeButton.setMode(b7a);
                    oneMeButton.setAppearance(z6a);
                }
            } else if (!(yka instanceof xka) && !(yka instanceof wka)) {
                throw new NoWhenBranchMatchedException();
            }
        } else if ((qka instanceof kka) || (qka instanceof lka)) {
            if (view instanceof OneMeButton) {
                oneMeButton = (OneMeButton) view;
            }
            if (oneMeButton != null) {
                oneMeButton.setSize(c7a);
                oneMeButton.setMode(b7a);
                oneMeButton.setAppearance(z6a);
                oneMeButton.setCustomTheme(fka);
            }
        } else if (!(qka instanceof nka)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: one.me.sdk.uikit.common.button.OneMeButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: one.me.sdk.uikit.common.button.OneMeButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: one.me.sdk.uikit.common.button.OneMeButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: eha} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(android.view.View r5, defpackage.ska r6, boolean r7) {
        /*
            boolean r0 = r6 instanceof defpackage.pka
            c7a r1 = defpackage.c7a.b
            z6a r2 = defpackage.z6a.c
            b7a r3 = defpackage.b7a.o
            r4 = 0
            if (r0 == 0) goto L_0x0062
            pka r6 = (defpackage.pka) r6
            if (r7 == 0) goto L_0x0012
            yka r6 = r6.b
            goto L_0x0014
        L_0x0012:
            yka r6 = r6.a
        L_0x0014:
            boolean r7 = r6 instanceof defpackage.xka
            if (r7 == 0) goto L_0x0028
            boolean r6 = r5 instanceof defpackage.eha
            if (r6 == 0) goto L_0x001f
            r4 = r5
            eha r4 = (defpackage.eha) r4
        L_0x001f:
            if (r4 == 0) goto L_0x00a0
            aha r5 = defpackage.aha.b
            r4.setCollapsedStyle(r5)
            goto L_0x00a0
        L_0x0028:
            boolean r7 = r6 instanceof defpackage.vka
            if (r7 == 0) goto L_0x003f
            boolean r6 = r5 instanceof one.me.sdk.uikit.common.button.OneMeButton
            if (r6 == 0) goto L_0x0033
            r4 = r5
            one.me.sdk.uikit.common.button.OneMeButton r4 = (one.me.sdk.uikit.common.button.OneMeButton) r4
        L_0x0033:
            if (r4 == 0) goto L_0x00a0
            r4.setSize(r1)
            r4.setMode(r3)
            r4.setAppearance(r2)
            goto L_0x00a0
        L_0x003f:
            boolean r7 = r6 instanceof defpackage.wka
            if (r7 == 0) goto L_0x0059
            boolean r7 = r5 instanceof android.widget.ImageView
            if (r7 == 0) goto L_0x004a
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            goto L_0x004b
        L_0x004a:
            r5 = r4
        L_0x004b:
            if (r5 == 0) goto L_0x00a0
            m1d r7 = new m1d
            wka r6 = (defpackage.wka) r6
            r0 = 4
            r7.<init>((java.lang.Object) r6, (kotlin.coroutines.Continuation) r4, (int) r0)
            defpackage.v3c.y(r7, r5)
            goto L_0x00a0
        L_0x0059:
            if (r6 != 0) goto L_0x005c
            goto L_0x00a0
        L_0x005c:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L_0x0062:
            boolean r7 = r6 instanceof defpackage.rka
            if (r7 == 0) goto L_0x007b
            boolean r6 = r5 instanceof one.me.sdk.uikit.common.button.OneMeButton
            if (r6 == 0) goto L_0x006d
            r4 = r5
            one.me.sdk.uikit.common.button.OneMeButton r4 = (one.me.sdk.uikit.common.button.OneMeButton) r4
        L_0x006d:
            if (r4 == 0) goto L_0x00a0
            c7a r5 = defpackage.c7a.a
            r4.setSize(r5)
            r4.setMode(r3)
            r4.setAppearance(r2)
            goto L_0x00a0
        L_0x007b:
            boolean r7 = r6 instanceof defpackage.mka
            if (r7 != 0) goto L_0x008e
            boolean r7 = r6 instanceof defpackage.lka
            if (r7 != 0) goto L_0x008e
            boolean r5 = r6 instanceof defpackage.nka
            if (r5 == 0) goto L_0x0088
            goto L_0x00a0
        L_0x0088:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L_0x008e:
            boolean r6 = r5 instanceof one.me.sdk.uikit.common.button.OneMeButton
            if (r6 == 0) goto L_0x0095
            r4 = r5
            one.me.sdk.uikit.common.button.OneMeButton r4 = (one.me.sdk.uikit.common.button.OneMeButton) r4
        L_0x0095:
            if (r4 == 0) goto L_0x00a0
            r4.setSize(r1)
            r4.setMode(r3)
            r4.setAppearance(r2)
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i24.c(android.view.View, ska, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: one.me.sdk.uikit.common.button.OneMeButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: one.me.sdk.uikit.common.button.OneMeButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: eha} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(android.view.View r5, defpackage.ska r6, boolean r7) {
        /*
            boolean r0 = r6 instanceof defpackage.pka
            z6a r1 = defpackage.z6a.c
            z6a r2 = defpackage.z6a.o
            r3 = 0
            if (r0 == 0) goto L_0x006c
            pka r6 = (defpackage.pka) r6
            if (r7 == 0) goto L_0x0010
            yka r6 = r6.b
            goto L_0x0012
        L_0x0010:
            yka r6 = r6.a
        L_0x0012:
            if (r7 == 0) goto L_0x0017
            b7a r0 = defpackage.b7a.a
            goto L_0x0019
        L_0x0017:
            b7a r0 = defpackage.b7a.b
        L_0x0019:
            boolean r4 = r6 instanceof defpackage.xka
            if (r4 == 0) goto L_0x002d
            boolean r6 = r5 instanceof defpackage.eha
            if (r6 == 0) goto L_0x0024
            r3 = r5
            eha r3 = (defpackage.eha) r3
        L_0x0024:
            if (r3 == 0) goto L_0x009c
            aha r5 = defpackage.aha.a
            r3.setCollapsedStyle(r5)
            goto L_0x009c
        L_0x002d:
            boolean r4 = r6 instanceof defpackage.vka
            if (r4 == 0) goto L_0x0049
            boolean r6 = r5 instanceof one.me.sdk.uikit.common.button.OneMeButton
            if (r6 == 0) goto L_0x0038
            r3 = r5
            one.me.sdk.uikit.common.button.OneMeButton r3 = (one.me.sdk.uikit.common.button.OneMeButton) r3
        L_0x0038:
            if (r3 == 0) goto L_0x009c
            c7a r5 = defpackage.c7a.a
            r3.setSize(r5)
            r3.setMode(r0)
            if (r7 == 0) goto L_0x0045
            r1 = r2
        L_0x0045:
            r3.setAppearance(r1)
            goto L_0x009c
        L_0x0049:
            boolean r7 = r6 instanceof defpackage.wka
            if (r7 == 0) goto L_0x0063
            boolean r6 = r5 instanceof android.widget.ImageView
            if (r6 == 0) goto L_0x0055
            r6 = r5
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            goto L_0x0056
        L_0x0055:
            r6 = r3
        L_0x0056:
            if (r6 == 0) goto L_0x009c
            r1b r7 = new r1b
            r0 = 18
            r7.<init>((java.lang.Object) r5, (kotlin.coroutines.Continuation) r3, (int) r0)
            defpackage.v3c.y(r7, r6)
            goto L_0x009c
        L_0x0063:
            if (r6 != 0) goto L_0x0066
            goto L_0x009c
        L_0x0066:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L_0x006c:
            boolean r0 = r6 instanceof defpackage.rka
            if (r0 != 0) goto L_0x0083
            boolean r0 = r6 instanceof defpackage.mka
            if (r0 != 0) goto L_0x0083
            boolean r0 = r6 instanceof defpackage.lka
            if (r0 != 0) goto L_0x0083
            boolean r5 = r6 instanceof defpackage.nka
            if (r5 == 0) goto L_0x007d
            goto L_0x009c
        L_0x007d:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L_0x0083:
            boolean r6 = r5 instanceof one.me.sdk.uikit.common.button.OneMeButton
            if (r6 == 0) goto L_0x008a
            r3 = r5
            one.me.sdk.uikit.common.button.OneMeButton r3 = (one.me.sdk.uikit.common.button.OneMeButton) r3
        L_0x008a:
            if (r3 == 0) goto L_0x009c
            c7a r5 = defpackage.c7a.b
            r3.setSize(r5)
            b7a r5 = defpackage.b7a.o
            r3.setMode(r5)
            if (r7 == 0) goto L_0x0099
            r1 = r2
        L_0x0099:
            r3.setAppearance(r1)
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i24.d(android.view.View, ska, boolean):void");
    }

    public static final coc e(uu3 uu3, zu3 zu3, zu3 zu32) {
        coc coc = new coc(uu3, (String) null, (zu3) null, (zu3) null, false, -1);
        coc.c(zu32);
        coc.a(zu3);
        return coc;
    }

    public static String f(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = {b[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i4)};
        int i5 = maf.a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i6 = 0; i6 < length; i6++) {
            sb.append(String.format(".%02X", new Object[]{Integer.valueOf(iArr[i6])}));
        }
        return sb.toString();
    }

    public static final Layout g(Context context, fe7 fe7, CharSequence charSequence, int i, TextPaint textPaint, m56 m56) {
        Context context2 = context;
        int i2 = i;
        m56 m562 = m56;
        int I = I(textPaint.getTextSize() / context.getResources().getDisplayMetrics().density);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.append(8288);
        spannableStringBuilder.append(" ");
        spannableStringBuilder.setSpan(new fcf(context2, I, false, m562), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        int c2 = fe7.a(spannableStringBuilder, textPaint, i, Integer.MAX_VALUE, false, TextUtils.TruncateAt.END).getLineCount() > 1 ? i2 - rh4.c((float) h4f.f(I), fk4.d().getDisplayMetrics().density, tu0.G(((float) h4f.i(I)) * fk4.d().getDisplayMetrics().density)) : i2;
        int i3 = c2;
        Layout b2 = fe7.a(spannableStringBuilder, textPaint, c2, 1, false, TextUtils.TruncateAt.END);
        if (i3 == i2) {
            return b2;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(b2.getText().subSequence(0, b2.getEllipsisStart(0) + 1));
        spannableStringBuilder2.append(8288);
        spannableStringBuilder2.append(" ");
        spannableStringBuilder2.setSpan(new fcf(context2, I, false, m562), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
        return fe7.a(spannableStringBuilder2, textPaint, i, 1, false, TextUtils.TruncateAt.END);
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static byte[] i(byte[] bArr) {
        DeflaterOutputStream deflaterOutputStream;
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r6 == 0) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.ty j(defpackage.mn5 r7, int r8) {
        /*
            d32 r0 = defpackage.e32.l
            r0.getClass()
            int r0 = defpackage.d32.b
            if (r8 >= r0) goto L_0x000a
            goto L_0x000b
        L_0x000a:
            r0 = r8
        L_0x000b:
            int r0 = r0 - r8
            boolean r1 = r7 instanceof defpackage.l32
            r2 = 1
            if (r1 == 0) goto L_0x003a
            r1 = r7
            l32 r1 = (defpackage.l32) r1
            mn5 r3 = r1.l()
            if (r3 == 0) goto L_0x003a
            ty r7 = new ty
            r4 = -3
            int r5 = r1.c
            int r6 = r1.b
            if (r6 == r4) goto L_0x002a
            r4 = -2
            if (r6 == r4) goto L_0x002a
            if (r6 == 0) goto L_0x002a
            r0 = r6
            goto L_0x0034
        L_0x002a:
            r4 = 0
            if (r5 != r2) goto L_0x0031
            if (r6 != 0) goto L_0x0034
        L_0x002f:
            r0 = r4
            goto L_0x0034
        L_0x0031:
            if (r8 != 0) goto L_0x002f
            r0 = r2
        L_0x0034:
            lx3 r8 = r1.a
            r7.<init>((int) r0, (int) r5, (defpackage.lx3) r8, (defpackage.mn5) r3)
            return r7
        L_0x003a:
            ty r8 = new ty
            hz4 r1 = defpackage.hz4.a
            r8.<init>((int) r0, (int) r2, (defpackage.lx3) r1, (defpackage.mn5) r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i24.j(mn5, int):ty");
    }

    public static ApiException k(Status status) {
        return status.c != null ? new ApiException(status) : new ApiException(status);
    }

    public static final Bitmap l(go0 go0, Context context, int i) {
        Drawable b2 = kt3.b(context, i);
        if (b2 != null) {
            Bitmap bitmap = (Bitmap) go0.get(b2.getIntrinsicHeight() * b2.getIntrinsicWidth() * 4);
            bitmap.reconfigure(b2.getIntrinsicWidth(), b2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            b2.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            b2.draw(canvas);
            return bitmap;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static ou6 o(InputStream inputStream) {
        int i;
        pu6 p = p();
        int i2 = p.a;
        byte[] bArr = new byte[i2];
        if (inputStream.markSupported()) {
            try {
                inputStream.mark(i2);
                i = hm9.Y(inputStream, bArr, i2);
            } finally {
                inputStream.reset();
            }
        } else {
            i = hm9.Y(inputStream, bArr, i2);
        }
        ou6 a2 = p.c.a(i, bArr);
        boolean equals = a2.equals(qb4.m);
        ou6 ou6 = ou6.c;
        if (equals) {
            a2 = ou6;
        }
        if (a2 != ou6) {
            return a2;
        }
        List<nu6> list = p.b;
        if (list == null) {
            return ou6;
        }
        for (nu6 a3 : list) {
            ou6 a4 = a3.a(i, bArr);
            if (a4 != ou6) {
                return a4;
            }
        }
        return ou6;
    }

    public static pu6 p() {
        return (pu6) pu6.d.getValue();
    }

    public static ArrayList q(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static final boolean r(uj3 uj3) {
        return uj3 == null || uj3.w();
    }

    public static final vxd s(mn5 mn5, pg7 pg7) {
        return j47.T(pg7, (lx3) null, (vx3) null, new og7(pg7, new mg7(mn5, (Continuation) null), (Continuation) null), 3);
    }

    public static String t(String str, Object... objArr) {
        int indexOf;
        String str2;
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e2) {
                    String str3 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str3, e2);
                    StringBuilder m = au1.m("<", str3, " threw ");
                    m.append(e2.getClass().getName());
                    m.append(">");
                    str2 = m.toString();
                }
            }
            objArr[i2] = str2;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i3 = 0;
        while (i < objArr.length && (indexOf = str.indexOf("%s", i3)) != -1) {
            sb.append(str, i3, indexOf);
            sb.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb.append(str, i3, str.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static final Boolean u(String str, Bundle bundle) {
        String string = bundle.getString(str, (String) null);
        if (string != null) {
            return Boolean.valueOf(Boolean.parseBoolean(string));
        }
        return null;
    }

    public static final Long v(String str, Bundle bundle) {
        String string = bundle.getString(str);
        if (string != null) {
            return Long.valueOf(Long.parseLong(string));
        }
        return null;
    }

    public static final long[] w(String str, Bundle bundle) {
        return bundle.containsKey(str) ? E(str, bundle) : new long[0];
    }

    public static byte[] x(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read >= 0) {
                i2 += read;
            } else {
                throw new IllegalStateException(zr6.h(i, "Not enough bytes to read: "));
            }
        }
        return bArr;
    }

    public static byte[] y(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int i4 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int read = fileInputStream.read(bArr2);
                if (read >= 0) {
                    inflater.setInput(bArr2, 0, read);
                    i4 += inflater.inflate(bArr, i4, i2 - i4);
                    i3 += read;
                } else {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
            }
            if (i3 != i) {
                throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
            } else if (inflater.finished()) {
                inflater.end();
                return bArr;
            } else {
                throw new IllegalStateException("Inflater did not finish");
            }
        } catch (DataFormatException e2) {
            throw new IllegalStateException(e2.getMessage());
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static long z(InputStream inputStream, int i) {
        byte[] x = x(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (x[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    public abstract jqe m();

    public abstract Integer n();
}
