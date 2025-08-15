package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.text.Layout;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.util.LangUtils;

/* renamed from: ty2  reason: default package */
public final class ty2 implements o82, obe {
    public static final byte[] s0 = {0, 7, 8, 15};
    public static final byte[] t0 = {0, 119, -120, -1};
    public static final byte[] u0 = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public Object X;
    public Object Y;
    public Object Z;
    public Object a;
    public Object b;
    public Object c;
    public Object o;

    public static final void a(ty2 ty2) {
        SparseArray sparseArray = (SparseArray) ty2.X;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray.keyAt(i);
            c8e c8e = (c8e) sparseArray.valueAt(i);
            SparseArray sparseArray2 = (SparseArray) ty2.Y;
            c8e.getClass();
            List list = (List) sparseArray2.get(0);
            if (list == null) {
                list = new ArrayList();
                sparseArray2.put(0, list);
            }
            list.add(c8e);
        }
        sparseArray.clear();
        ((SparseArray) ty2.o).clear();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Comparable d(defpackage.ty2 r4, long r5, kotlin.coroutines.Continuation r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof defpackage.ny2
            if (r0 == 0) goto L_0x0016
            r0 = r7
            ny2 r0 = (defpackage.ny2) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x001b
        L_0x0016:
            ny2 r0 = new ny2
            r0.<init>(r4, r7)
        L_0x001b:
            java.lang.Object r7 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            long r5 = r0.X
            ty2 r4 = r0.o
            defpackage.od2.a0(r7)     // Catch:{ ChatNotFoundException -> 0x002e }
            goto L_0x0056
        L_0x002e:
            r7 = move-exception
            goto L_0x005a
        L_0x0030:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0038:
            defpackage.od2.a0(r7)
            java.lang.Object r7 = r4.c     // Catch:{ ChatNotFoundException -> 0x002e }
            je7 r7 = (defpackage.je7) r7     // Catch:{ ChatNotFoundException -> 0x002e }
            java.lang.Object r7 = r7.getValue()     // Catch:{ ChatNotFoundException -> 0x002e }
            p82 r7 = (defpackage.p82) r7     // Catch:{ ChatNotFoundException -> 0x002e }
            iqd r7 = r7.y(r5)     // Catch:{ ChatNotFoundException -> 0x002e }
            r0.o = r4     // Catch:{ ChatNotFoundException -> 0x002e }
            r0.X = r5     // Catch:{ ChatNotFoundException -> 0x002e }
            r0.s0 = r3     // Catch:{ ChatNotFoundException -> 0x002e }
            java.lang.Object r7 = defpackage.s36.f(r7, r0)     // Catch:{ ChatNotFoundException -> 0x002e }
            if (r7 != r1) goto L_0x0056
            goto L_0x0071
        L_0x0056:
            e52 r7 = (defpackage.e52) r7     // Catch:{ ChatNotFoundException -> 0x002e }
            r1 = r7
            goto L_0x0071
        L_0x005a:
            java.lang.Object r4 = r4.a
            java.lang.String r4 = (java.lang.String) r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "failed to fetch chat for chatId="
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            defpackage.hm9.p(r4, r5, r7)
            r4 = 0
            r1 = r4
        L_0x0071:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ty2.d(ty2, long, kotlin.coroutines.Continuation):java.lang.Comparable");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Comparable e(defpackage.ty2 r7, long r8, kotlin.coroutines.Continuation r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof defpackage.oy2
            if (r0 == 0) goto L_0x0016
            r0 = r10
            oy2 r0 = (defpackage.oy2) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x001b
        L_0x0016:
            oy2 r0 = new oy2
            r0.<init>(r7, r10)
        L_0x001b:
            java.lang.Object r10 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            long r8 = r0.X
            ty2 r7 = r0.o
            defpackage.od2.a0(r10)     // Catch:{ ChatNotFoundException -> 0x002e }
            goto L_0x006d
        L_0x002e:
            r10 = move-exception
            goto L_0x0071
        L_0x0030:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0038:
            defpackage.od2.a0(r10)
            java.lang.Object r10 = r7.c     // Catch:{ ChatNotFoundException -> 0x002e }
            je7 r10 = (defpackage.je7) r10     // Catch:{ ChatNotFoundException -> 0x002e }
            java.lang.Object r10 = r10.getValue()     // Catch:{ ChatNotFoundException -> 0x002e }
            p82 r10 = (defpackage.p82) r10     // Catch:{ ChatNotFoundException -> 0x002e }
            pa3 r2 = r10.f()     // Catch:{ ChatNotFoundException -> 0x002e }
            c82 r4 = new c82     // Catch:{ ChatNotFoundException -> 0x002e }
            r5 = 1
            r4.<init>(r10, r8, r5)     // Catch:{ ChatNotFoundException -> 0x002e }
            q1a r5 = new q1a     // Catch:{ ChatNotFoundException -> 0x002e }
            r6 = 2
            r5.<init>(r6, r4)     // Catch:{ ChatNotFoundException -> 0x002e }
            ib3 r4 = new ib3     // Catch:{ ChatNotFoundException -> 0x002e }
            r4.<init>(r5, r2)     // Catch:{ ChatNotFoundException -> 0x002e }
            ztc r10 = r10.y     // Catch:{ ChatNotFoundException -> 0x002e }
            drd r10 = r4.m(r10)     // Catch:{ ChatNotFoundException -> 0x002e }
            r0.o = r7     // Catch:{ ChatNotFoundException -> 0x002e }
            r0.X = r8     // Catch:{ ChatNotFoundException -> 0x002e }
            r0.s0 = r3     // Catch:{ ChatNotFoundException -> 0x002e }
            java.lang.Object r10 = defpackage.s36.f(r10, r0)     // Catch:{ ChatNotFoundException -> 0x002e }
            if (r10 != r1) goto L_0x006d
            goto L_0x0088
        L_0x006d:
            e52 r10 = (defpackage.e52) r10     // Catch:{ ChatNotFoundException -> 0x002e }
            r1 = r10
            goto L_0x0088
        L_0x0071:
            java.lang.Object r7 = r7.a
            java.lang.String r7 = (java.lang.String) r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "failed to fetch chat for serverId="
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            defpackage.hm9.p(r7, r8, r10)
            r7 = 0
            r1 = r7
        L_0x0088:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ty2.e(ty2, long, kotlin.coroutines.Continuation):java.lang.Comparable");
    }

    public static byte[] f(int i, int i2, s02 s02) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) s02.i(i2);
        }
        return bArr;
    }

    public static int[] g() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = i(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                int i2 = 127;
                int i3 = (i & 1) != 0 ? 127 : 0;
                int i4 = (i & 2) != 0 ? 127 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = i(255, i3, i4, i2);
            }
        }
        return iArr;
    }

    public static int[] h() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            int i2 = 255;
            if (i < 8) {
                int i3 = (i & 1) != 0 ? 255 : 0;
                int i4 = (i & 2) != 0 ? 255 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = i(63, i3, i4, i2);
            } else {
                int i5 = i & 136;
                int i6 = 170;
                int i7 = 85;
                if (i5 == 0) {
                    int i8 = ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0);
                    int i9 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i7 = 0;
                    }
                    if ((i & 64) == 0) {
                        i6 = 0;
                    }
                    iArr[i] = i(255, i8, i9, i7 + i6);
                } else if (i5 != 8) {
                    int i10 = 43;
                    if (i5 == 128) {
                        int i11 = ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0);
                        int i12 = ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i10 = 0;
                        }
                        int i13 = i10 + 127;
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = i(255, i11, i12, i13 + i7);
                    } else if (i5 == 136) {
                        int i14 = ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0);
                        int i15 = ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i10 = 0;
                        }
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = i(255, i14, i15, i10 + i7);
                    }
                } else {
                    int i16 = ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0);
                    int i17 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i7 = 0;
                    }
                    if ((i & 64) == 0) {
                        i6 = 0;
                    }
                    iArr[i] = i(127, i16, i17, i7 + i6);
                }
            }
        }
        return iArr;
    }

    public static int i(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r3v32, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r3v7, types: [byte] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01f8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x022b A[LOOP:3: B:84:0x017a->B:113:0x022b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0226 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0189  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void l(byte[] r23, int[] r24, int r25, int r26, int r27, android.graphics.Paint r28, android.graphics.Canvas r29) {
        /*
            r0 = r23
            r1 = r25
            r8 = r28
            s02 r9 = new s02
            int r2 = r0.length
            r3 = 2
            r4 = 0
            r9.<init>((byte[]) r0, (int) r2, (int) r3, (byte) r4)
            r2 = r26
            r10 = r27
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x0015:
            int r3 = r9.b()
            if (r3 == 0) goto L_0x0236
            r14 = 8
            int r3 = r9.i(r14)
            r4 = 240(0xf0, float:3.36E-43)
            if (r3 == r4) goto L_0x0230
            r15 = 1
            r16 = 0
            r7 = 3
            r6 = 4
            r5 = 2
            switch(r3) {
                case 16: goto L_0x015f;
                case 17: goto L_0x00a0;
                case 18: goto L_0x0043;
                default: goto L_0x002e;
            }
        L_0x002e:
            switch(r3) {
                case 32: goto L_0x003e;
                case 33: goto L_0x0039;
                case 34: goto L_0x0032;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x0015
        L_0x0032:
            r3 = 16
            byte[] r12 = f(r3, r14, r9)
            goto L_0x0015
        L_0x0039:
            byte[] r11 = f(r6, r14, r9)
            goto L_0x0015
        L_0x003e:
            byte[] r13 = f(r6, r6, r9)
            goto L_0x0015
        L_0x0043:
            r7 = r2
            r2 = r16
        L_0x0046:
            int r3 = r9.i(r14)
            if (r3 == 0) goto L_0x0051
            r17 = r2
            r18 = r15
            goto L_0x0079
        L_0x0051:
            boolean r3 = r9.h()
            r4 = 7
            if (r3 != 0) goto L_0x006c
            int r3 = r9.i(r4)
            if (r3 == 0) goto L_0x0065
            r17 = r2
            r18 = r3
            r3 = r16
            goto L_0x0079
        L_0x0065:
            r17 = r15
            r3 = r16
            r18 = r3
            goto L_0x0079
        L_0x006c:
            int r3 = r9.i(r4)
            int r4 = r9.i(r14)
            r17 = r2
            r18 = r3
            r3 = r4
        L_0x0079:
            if (r18 == 0) goto L_0x0094
            if (r8 == 0) goto L_0x0094
            r2 = r24[r3]
            r8.setColor(r2)
            float r3 = (float) r7
            float r4 = (float) r10
            int r2 = r7 + r18
            float r5 = (float) r2
            int r2 = r10 + 1
            float r6 = (float) r2
            r2 = r29
            r19 = r7
            r7 = r28
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x0096
        L_0x0094:
            r19 = r7
        L_0x0096:
            int r7 = r19 + r18
            if (r17 == 0) goto L_0x009d
        L_0x009a:
            r2 = r7
            goto L_0x0015
        L_0x009d:
            r2 = r17
            goto L_0x0046
        L_0x00a0:
            if (r1 != r7) goto L_0x00ab
            if (r12 != 0) goto L_0x00a7
            byte[] r3 = u0
            goto L_0x00a8
        L_0x00a7:
            r3 = r12
        L_0x00a8:
            r17 = r3
            goto L_0x00ad
        L_0x00ab:
            r17 = 0
        L_0x00ad:
            r4 = r2
            r2 = r16
        L_0x00b0:
            int r3 = r9.i(r6)
            if (r3 == 0) goto L_0x00bc
            r18 = r2
            r19 = r15
            goto L_0x011d
        L_0x00bc:
            boolean r3 = r9.h()
            if (r3 != 0) goto L_0x00d8
            int r3 = r9.i(r7)
            if (r3 == 0) goto L_0x00d1
            int r3 = r3 + 2
            r18 = r2
            r19 = r3
        L_0x00ce:
            r3 = r16
            goto L_0x011d
        L_0x00d1:
            r18 = r15
        L_0x00d3:
            r3 = r16
            r19 = r3
            goto L_0x011d
        L_0x00d8:
            boolean r3 = r9.h()
            if (r3 != 0) goto L_0x00ee
            int r3 = r9.i(r5)
            int r3 = r3 + r6
            int r18 = r9.i(r6)
        L_0x00e7:
            r19 = r3
            r3 = r18
            r18 = r2
            goto L_0x011d
        L_0x00ee:
            int r3 = r9.i(r5)
            if (r3 == 0) goto L_0x0118
            if (r3 == r15) goto L_0x0113
            if (r3 == r5) goto L_0x0108
            if (r3 == r7) goto L_0x00fd
            r18 = r2
            goto L_0x00d3
        L_0x00fd:
            int r3 = r9.i(r14)
            int r3 = r3 + 25
            int r18 = r9.i(r6)
            goto L_0x00e7
        L_0x0108:
            int r3 = r9.i(r6)
            int r3 = r3 + 9
            int r18 = r9.i(r6)
            goto L_0x00e7
        L_0x0113:
            r18 = r2
            r19 = r5
            goto L_0x00ce
        L_0x0118:
            r18 = r2
            r19 = r15
            goto L_0x00ce
        L_0x011d:
            if (r19 == 0) goto L_0x0148
            if (r8 == 0) goto L_0x0148
            if (r17 == 0) goto L_0x0125
            byte r3 = r17[r3]
        L_0x0125:
            r2 = r24[r3]
            r8.setColor(r2)
            float r3 = (float) r4
            float r2 = (float) r10
            int r0 = r4 + r19
            float r0 = (float) r0
            int r5 = r10 + 1
            float r5 = (float) r5
            r20 = r2
            r2 = r29
            r21 = r4
            r4 = r20
            r22 = r5
            r14 = 2
            r5 = r0
            r0 = r6
            r6 = r22
            r0 = r7
            r7 = r28
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x014c
        L_0x0148:
            r21 = r4
            r14 = r5
            r0 = r7
        L_0x014c:
            int r4 = r21 + r19
            if (r18 == 0) goto L_0x0156
            r9.c()
            r2 = r4
            goto L_0x0015
        L_0x0156:
            r7 = r0
            r5 = r14
            r2 = r18
            r6 = 4
            r14 = 8
            goto L_0x00b0
        L_0x015f:
            r14 = r5
            r0 = r7
            if (r1 != r0) goto L_0x016c
            if (r11 != 0) goto L_0x0168
            byte[] r3 = t0
            goto L_0x0169
        L_0x0168:
            r3 = r11
        L_0x0169:
            r17 = r3
            goto L_0x0177
        L_0x016c:
            if (r1 != r14) goto L_0x0175
            if (r13 != 0) goto L_0x0173
            byte[] r3 = s0
            goto L_0x0169
        L_0x0173:
            r3 = r13
            goto L_0x0169
        L_0x0175:
            r17 = 0
        L_0x0177:
            r7 = r2
            r2 = r16
        L_0x017a:
            int r3 = r9.i(r14)
            if (r3 == 0) goto L_0x0189
            r18 = r2
            r19 = r15
        L_0x0184:
            r5 = 4
            r6 = 8
            goto L_0x01f6
        L_0x0189:
            boolean r3 = r9.h()
            if (r3 == 0) goto L_0x019e
            int r3 = r9.i(r0)
            int r5 = r3 + 3
            int r3 = r9.i(r14)
            r18 = r2
            r19 = r5
            goto L_0x0184
        L_0x019e:
            boolean r3 = r9.h()
            if (r3 == 0) goto L_0x01ab
            r18 = r2
            r19 = r15
            r3 = r16
            goto L_0x0184
        L_0x01ab:
            int r3 = r9.i(r14)
            if (r3 == 0) goto L_0x01ed
            if (r3 == r15) goto L_0x01e3
            if (r3 == r14) goto L_0x01d0
            if (r3 == r0) goto L_0x01be
            r18 = r2
            r3 = r16
            r19 = r3
            goto L_0x0184
        L_0x01be:
            r6 = 8
            int r3 = r9.i(r6)
            int r5 = r3 + 29
            int r3 = r9.i(r14)
            r18 = r2
            r19 = r5
            r5 = 4
            goto L_0x01f6
        L_0x01d0:
            r5 = 4
            r6 = 8
            int r3 = r9.i(r5)
            int r3 = r3 + 12
            int r4 = r9.i(r14)
            r18 = r2
            r19 = r3
            r3 = r4
            goto L_0x01f6
        L_0x01e3:
            r5 = 4
            r6 = 8
            r18 = r2
            r19 = r14
            r3 = r16
            goto L_0x01f6
        L_0x01ed:
            r5 = 4
            r6 = 8
            r18 = r15
            r3 = r16
            r19 = r3
        L_0x01f6:
            if (r19 == 0) goto L_0x021d
            if (r8 == 0) goto L_0x021d
            if (r17 == 0) goto L_0x01fe
            byte r3 = r17[r3]
        L_0x01fe:
            r2 = r24[r3]
            r8.setColor(r2)
            float r3 = (float) r7
            float r4 = (float) r10
            int r2 = r7 + r19
            float r2 = (float) r2
            int r0 = r10 + 1
            float r0 = (float) r0
            r21 = r2
            r2 = r29
            r22 = r5
            r5 = r21
            r21 = r6
            r6 = r0
            r0 = r7
            r7 = r28
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x0222
        L_0x021d:
            r22 = r5
            r21 = r6
            r0 = r7
        L_0x0222:
            int r7 = r0 + r19
            if (r18 == 0) goto L_0x022b
            r9.c()
            goto L_0x009a
        L_0x022b:
            r2 = r18
            r0 = 3
            goto L_0x017a
        L_0x0230:
            int r10 = r10 + 2
            r2 = r26
            goto L_0x0015
        L_0x0236:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ty2.l(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static nt4 m(s02 s02, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        s02 s022 = s02;
        int i7 = 8;
        int i8 = s022.i(8);
        s022.t(8);
        int i9 = 2;
        int i10 = i - 2;
        int i11 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] g = g();
        int[] h = h();
        while (i10 > 0) {
            int i12 = s022.i(i7);
            int i13 = s022.i(i7);
            int[] iArr2 = (i13 & 128) != 0 ? iArr : (i13 & 64) != 0 ? g : h;
            if ((i13 & 1) != 0) {
                i5 = s022.i(i7);
                i4 = s022.i(i7);
                i3 = s022.i(i7);
                i2 = s022.i(i7);
                i6 = i10 - 6;
            } else {
                i3 = s022.i(4) << 4;
                i6 = i10 - 4;
                int i14 = s022.i(4) << 4;
                i2 = s022.i(i9) << 6;
                i5 = s022.i(6) << i9;
                i4 = i14;
            }
            if (i5 == 0) {
                i4 = i11;
                i3 = i4;
                i2 = 255;
            }
            double d = (double) i5;
            double d2 = (double) (i4 - 128);
            double d3 = (double) (i3 - 128);
            iArr2[i12] = i((byte) (255 - (i2 & 255)), oaf.j((int) ((1.402d * d2) + d), 0, 255), oaf.j((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), oaf.j((int) ((d3 * 1.772d) + d), 0, 255));
            i10 = i6;
            i11 = 0;
            i8 = i8;
            h = h;
            i7 = 8;
            i9 = 2;
        }
        return new nt4(i8, iArr, g, h);
    }

    public static qt4 o(s02 s02) {
        byte[] bArr;
        int i = s02.i(16);
        s02.t(4);
        int i2 = s02.i(2);
        boolean h = s02.h();
        s02.t(1);
        byte[] bArr2 = oaf.f;
        if (i2 == 1) {
            s02.t(s02.i(8) * 16);
        } else if (i2 == 0) {
            int i3 = s02.i(16);
            int i4 = s02.i(16);
            if (i3 > 0) {
                bArr2 = new byte[i3];
                s02.l(i3, bArr2);
            }
            if (i4 > 0) {
                bArr = new byte[i4];
                s02.l(i4, bArr);
                return new qt4(i, h, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new qt4(i, h, bArr2, bArr);
    }

    public void G(byte[] bArr, int i, int i2, nbe nbe, pj3 pj3) {
        yt4 yt4;
        b04 b04;
        char c2;
        char c3;
        int i3;
        int i4;
        ot4 ot4;
        ArrayList arrayList;
        int i5;
        yt4 yt42;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        vt4 vt4;
        vt4 vt42;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = i;
        int i16 = 8;
        int i17 = 0;
        s02 s02 = new s02(bArr, i15 + i2, 2, (byte) 0);
        s02.q(i15);
        while (true) {
            int b2 = s02.b();
            yt4 = (yt4) this.Y;
            if (b2 < 48 || s02.i(i16) != 15) {
                rt4 rt4 = (rt4) yt4.i;
            } else {
                int i18 = s02.i(i16);
                int i19 = 16;
                int i20 = s02.i(16);
                int i21 = s02.i(16);
                int f = s02.f() + i21;
                if (i21 * 8 > s02.b()) {
                    z04.c0("Data field length exceeds limit");
                    s02.t(s02.b());
                } else {
                    switch (i18) {
                        case 16:
                            if (i20 == yt4.a) {
                                rt4 rt42 = (rt4) yt4.i;
                                s02.i(i16);
                                int i22 = s02.i(4);
                                int i23 = s02.i(2);
                                s02.t(2);
                                int i24 = i21 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i24 > 0) {
                                    int i25 = s02.i(i16);
                                    s02.t(i16);
                                    i24 -= 6;
                                    sparseArray.put(i25, new tt4(s02.i(16), s02.i(16)));
                                    i16 = 8;
                                }
                                rt4 rt43 = new rt4(i22, i23, sparseArray);
                                if (i23 == 0) {
                                    if (!(rt42 == null || rt42.a == i22)) {
                                        yt4.i = rt43;
                                        break;
                                    }
                                } else {
                                    yt4.i = rt43;
                                    yt4.c.clear();
                                    yt4.d.clear();
                                    yt4.e.clear();
                                    break;
                                }
                            }
                            break;
                        case LangUtils.HASH_SEED:
                            rt4 rt44 = (rt4) yt4.i;
                            if (i20 == yt4.a && rt44 != null) {
                                int i26 = s02.i(i16);
                                s02.t(4);
                                boolean h = s02.h();
                                s02.t(3);
                                int i27 = s02.i(16);
                                int i28 = s02.i(16);
                                s02.i(3);
                                int i29 = s02.i(3);
                                s02.t(2);
                                int i30 = s02.i(i16);
                                int i31 = s02.i(i16);
                                int i32 = s02.i(4);
                                int i33 = s02.i(2);
                                s02.t(2);
                                int i34 = i21 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i34 > 0) {
                                    int i35 = s02.i(i19);
                                    int i36 = s02.i(2);
                                    s02.i(2);
                                    int i37 = s02.i(12);
                                    s02.t(4);
                                    int i38 = s02.i(12);
                                    int i39 = i34 - 6;
                                    if (i36 == 1 || i36 == 2) {
                                        s02.i(i16);
                                        s02.i(i16);
                                        i34 -= 8;
                                    } else {
                                        i34 = i39;
                                    }
                                    sparseArray2.put(i35, new xt4(i37, i38));
                                    i19 = 16;
                                }
                                vt4 vt43 = new vt4(i26, h, i27, i28, i29, i30, i31, i32, i33, sparseArray2);
                                SparseArray sparseArray3 = yt4.c;
                                if (rt44.b == 0 && (vt42 = (vt4) sparseArray3.get(i26)) != null) {
                                    int i40 = 0;
                                    while (true) {
                                        SparseArray sparseArray4 = vt42.j;
                                        if (i40 < sparseArray4.size()) {
                                            vt43.j.put(sparseArray4.keyAt(i40), (xt4) sparseArray4.valueAt(i40));
                                            i40++;
                                        }
                                    }
                                }
                                sparseArray3.put(vt43.a, vt43);
                                break;
                            }
                        case 18:
                            if (i20 != yt4.a) {
                                if (i20 == yt4.b) {
                                    nt4 m = m(s02, i21);
                                    yt4.f.put(m.a, m);
                                    break;
                                }
                            } else {
                                nt4 m2 = m(s02, i21);
                                yt4.d.put(m2.a, m2);
                                break;
                            }
                            break;
                        case 19:
                            if (i20 != yt4.a) {
                                if (i20 == yt4.b) {
                                    qt4 o2 = o(s02);
                                    yt4.g.put(o2.a, o2);
                                    break;
                                }
                            } else {
                                qt4 o3 = o(s02);
                                yt4.e.put(o3.a, o3);
                                break;
                            }
                            break;
                        case 20:
                            if (i20 == yt4.a) {
                                s02.t(4);
                                boolean h2 = s02.h();
                                s02.t(3);
                                int i41 = s02.i(16);
                                int i42 = s02.i(16);
                                if (h2) {
                                    int i43 = s02.i(16);
                                    int i44 = s02.i(16);
                                    int i45 = s02.i(16);
                                    i14 = i43;
                                    i11 = s02.i(16);
                                    i13 = i44;
                                    i12 = i45;
                                } else {
                                    i14 = i17;
                                    i12 = i14;
                                    i13 = i41;
                                    i11 = i42;
                                }
                                yt4.h = new ot4(i41, i42, i14, i13, i12, i11);
                                break;
                            }
                            break;
                    }
                    s02.u(f - s02.f());
                }
                i16 = 8;
                i17 = 0;
            }
        }
        rt4 rt45 = (rt4) yt4.i;
        if (rt45 == null) {
            ls5 ls5 = zw6.b;
            b04 = new b04(-9223372036854775807L, -9223372036854775807L, ffc.X);
        } else {
            ot4 ot42 = (ot4) yt4.h;
            if (ot42 == null) {
                ot42 = (ot4) this.o;
            }
            Bitmap bitmap = (Bitmap) this.Z;
            Canvas canvas = (Canvas) this.c;
            if (!(bitmap != null && ot42.a + 1 == bitmap.getWidth() && ot42.b + 1 == ((Bitmap) this.Z).getHeight())) {
                Bitmap createBitmap = Bitmap.createBitmap(ot42.a + 1, ot42.b + 1, Bitmap.Config.ARGB_8888);
                this.Z = createBitmap;
                canvas.setBitmap(createBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            int i46 = 0;
            while (true) {
                SparseArray sparseArray5 = rt45.c;
                if (i46 < sparseArray5.size()) {
                    canvas.save();
                    tt4 tt4 = (tt4) sparseArray5.valueAt(i46);
                    vt4 vt44 = (vt4) yt4.c.get(sparseArray5.keyAt(i46));
                    int i47 = tt4.a + ot42.c;
                    int i48 = tt4.b + ot42.e;
                    int min = Math.min(vt44.c + i47, ot42.d);
                    int i49 = vt44.d;
                    int i50 = i48 + i49;
                    canvas.clipRect(i47, i48, min, Math.min(i50, ot42.f));
                    SparseArray sparseArray6 = yt4.d;
                    int i51 = vt44.f;
                    nt4 nt4 = (nt4) sparseArray6.get(i51);
                    if (nt4 == null && (nt4 = (nt4) yt4.f.get(i51)) == null) {
                        nt4 = (nt4) this.X;
                    }
                    int i52 = 0;
                    while (true) {
                        SparseArray sparseArray7 = vt44.j;
                        if (i52 < sparseArray7.size()) {
                            int keyAt = sparseArray7.keyAt(i52);
                            xt4 xt4 = (xt4) sparseArray7.valueAt(i52);
                            rt4 rt46 = rt45;
                            qt4 qt4 = (qt4) yt4.e.get(keyAt);
                            if (qt4 == null) {
                                qt4 = (qt4) yt4.g.get(keyAt);
                            }
                            if (qt4 != null) {
                                Paint paint = qt4.b ? null : (Paint) this.a;
                                yt42 = yt4;
                                int i53 = xt4.a + i47;
                                int i54 = xt4.b + i48;
                                i5 = i46;
                                int i55 = vt44.e;
                                i6 = i52;
                                arrayList = arrayList2;
                                int i56 = i50;
                                int[] iArr = i55 == 3 ? nt4.d : i55 == 2 ? nt4.c : nt4.b;
                                ot4 = ot42;
                                int i57 = i49;
                                int i58 = i55;
                                i8 = i57;
                                int i59 = i48;
                                int i60 = i53;
                                i7 = i56;
                                i10 = i47;
                                i9 = i59;
                                vt4 = vt44;
                                Paint paint2 = paint;
                                Canvas canvas2 = canvas;
                                l(qt4.c, iArr, i58, i60, i54, paint2, canvas2);
                                l(qt4.d, iArr, i58, i60, i54 + 1, paint2, canvas2);
                            } else {
                                ot4 = ot42;
                                arrayList = arrayList2;
                                i5 = i46;
                                yt42 = yt4;
                                i6 = i52;
                                i7 = i50;
                                i8 = i49;
                                i9 = i48;
                                i10 = i47;
                                vt4 = vt44;
                            }
                            i52 = i6 + 1;
                            rt45 = rt46;
                            vt44 = vt4;
                            i47 = i10;
                            yt4 = yt42;
                            i46 = i5;
                            arrayList2 = arrayList;
                            ot42 = ot4;
                            i49 = i8;
                            i50 = i7;
                            i48 = i9;
                        } else {
                            rt4 rt47 = rt45;
                            ot4 ot43 = ot42;
                            ArrayList arrayList3 = arrayList2;
                            int i61 = i46;
                            yt4 yt43 = yt4;
                            int i62 = i50;
                            int i63 = i49;
                            int i64 = i48;
                            int i65 = i47;
                            vt4 vt45 = vt44;
                            boolean z = vt45.b;
                            int i66 = vt45.c;
                            if (z) {
                                int i67 = vt45.e;
                                c3 = 3;
                                if (i67 == 3) {
                                    i4 = nt4.d[vt45.g];
                                    c2 = 2;
                                } else {
                                    c2 = 2;
                                    i4 = i67 == 2 ? nt4.c[vt45.h] : nt4.b[vt45.i];
                                }
                                Paint paint3 = (Paint) this.b;
                                paint3.setColor(i4);
                                i3 = i64;
                                canvas.drawRect((float) i65, (float) i3, (float) (i65 + i66), (float) i62, paint3);
                            } else {
                                i3 = i64;
                                c3 = 3;
                                c2 = 2;
                            }
                            int i68 = i63;
                            Bitmap createBitmap2 = Bitmap.createBitmap((Bitmap) this.Z, i65, i3, i66, i68);
                            float f2 = (float) i65;
                            ot4 ot44 = ot43;
                            float f3 = (float) ot44.a;
                            float f4 = f2 / f3;
                            float f5 = (float) ot44.b;
                            ArrayList arrayList4 = arrayList3;
                            arrayList4.add(new yz3((CharSequence) null, (Layout.Alignment) null, (Layout.Alignment) null, createBitmap2, ((float) i3) / f5, 0, 0, f4, 0, Integer.MIN_VALUE, -3.4028235E38f, ((float) i66) / f3, ((float) i68) / f5, false, -16777216, Integer.MIN_VALUE, 0.0f));
                            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                            canvas.restore();
                            yt4 = yt43;
                            rt45 = rt47;
                            ot4 ot45 = ot44;
                            arrayList2 = arrayList4;
                            ot42 = ot45;
                            char c4 = c3;
                            i46 = i61 + 1;
                            char c5 = c2;
                            char c6 = c4;
                        }
                    }
                } else {
                    b04 = new b04(-9223372036854775807L, -9223372036854775807L, arrayList2);
                }
            }
        }
        pj3.accept(b04);
    }

    public int J() {
        return 2;
    }

    public void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ti9 ti9 = (ti9) ((ConcurrentHashMap) this.Y).remove(Long.valueOf(((Number) it.next()).longValue()));
            if (ti9 != null) {
                e52 e52 = (e52) ti9.getValue();
                ti9.setValue((Object) null);
                if (e52 != null) {
                    k92 k92 = e52.b;
                    if (k92.a != 0 || k92.f(((wxc) ((je7) this.o).getValue()).a())) {
                        ti9 ti92 = (ti9) ((ConcurrentHashMap) this.Z).remove(Long.valueOf(k92.a));
                        if (ti92 != null) {
                            ti92.setValue((Object) null);
                        }
                    } else {
                        return;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e52 e52 = (e52) it.next();
            ((ti9) ((ConcurrentHashMap) this.Y).computeIfAbsent(Long.valueOf(e52.a), new di(2, new ky2(e52, 1)))).setValue(e52);
            k92 k92 = e52.b;
            if (k92.a != 0 || k92.f(((wxc) ((je7) this.o).getValue()).a())) {
                ((ti9) ((ConcurrentHashMap) this.Z).computeIfAbsent(Long.valueOf(k92.a), new di(3, new ky2(e52, 0)))).setValue(e52);
            } else {
                return;
            }
        }
    }

    public Object j(int i) {
        SparseArray sparseArray = (SparseArray) this.o;
        if (sparseArray.indexOfKey(i) >= 0) {
            return sparseArray.get(i);
        }
        Object a2 = ((i8e) this.c).a(i);
        sparseArray.put(i, a2);
        return a2;
    }

    public c8e k(int i) {
        SparseArray sparseArray = (SparseArray) this.X;
        c8e c8e = (c8e) sparseArray.get(i);
        if (c8e == null) {
            i8e i8e = (i8e) this.c;
            i8e.getClass();
            List list = (List) ((SparseArray) this.Y).get(0);
            RecyclerView recyclerView = (RecyclerView) this.a;
            c8e = (list == null || list.isEmpty()) ? i8e.b(recyclerView) : (c8e) list.remove(0);
            sparseArray.put(i, c8e);
            i8e.c(c8e, i);
            View view = c8e.a;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            view.measure(marginLayoutParams.width == -1 ? View.MeasureSpec.makeMeasureSpec((recyclerView.getMeasuredWidth() - marginLayoutParams.rightMargin) - recyclerView.getScrollBarSize(), 1073741824) : ViewGroup.getChildMeasureSpec(recyclerView.getMeasuredWidth(), 0, view.getLayoutParams().width), ViewGroup.getChildMeasureSpec(recyclerView.getMeasuredHeight(), 0, view.getLayoutParams().height));
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            if (c54.K(view)) {
                view.layout(recyclerView.getMeasuredWidth() - measuredWidth, 0, recyclerView.getMeasuredWidth(), measuredHeight);
            } else {
                view.layout(0, 0, measuredWidth, measuredHeight);
            }
            c8e.b = marginLayoutParams.getMarginStart();
            c8e.c = marginLayoutParams.topMargin;
        }
        return c8e;
    }

    public void reset() {
        yt4 yt4 = (yt4) this.Y;
        yt4.c.clear();
        yt4.d.clear();
        yt4.e.clear();
        yt4.f.clear();
        yt4.g.clear();
        yt4.h = null;
        yt4.i = null;
    }
}
