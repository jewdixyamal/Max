package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* renamed from: iz7  reason: default package */
public abstract class iz7 {
    public static final /* synthetic */ int a = 0;

    public static l20 a(byte[] bArr) {
        if (bArr != null && bArr.length > 0) {
            try {
                byte[] bArr2 = b.a;
                return b.c(Protos.Attaches.Attach.parseFrom(bArr));
            } catch (InvalidProtocolBufferNanoException e) {
                throw new IOException(e);
            } catch (ProtoException unused) {
            }
        }
        return null;
    }

    public static k8g b(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            byte[] bArr2 = b.a;
            return b.e(Protos.Attaches.parseFrom(bArr));
        } catch (InvalidProtocolBufferNanoException e) {
            throw new IOException(e);
        } catch (ProtoException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static int c(k8g k8g) {
        if (k8g == null) {
            return 0;
        }
        if (k8g.i() != 1) {
            return k8g.i() > 1 ? 4 : 0;
        }
        l20 h = k8g.h(0);
        switch (h.a.ordinal()) {
            case 1:
            case 8:
            case 10:
            case 11:
            case 13:
                return 0;
            case 2:
                return 1;
            case 3:
                return h.d.b == 2 ? 11 : 3;
            case 4:
                return 2;
            case 5:
                return 10;
            case 6:
                return 5;
            case 7:
                return 8;
            case 9:
                return 7;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return 9;
            default:
                hm9.p("iz7", "new attach type " + k8g.h(0).a + " in calcMediaType method. developer, please add mapping logic for it", (Throwable) null);
                return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.bz d(defpackage.l20 r50) {
        /*
            r0 = r50
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            g20 r2 = r0.a
            int r2 = r2.ordinal()
            r3 = 6
            r4 = 5
            r5 = 4
            r6 = 1
            r7 = 2
            r8 = 3
            switch(r2) {
                case 0: goto L_0x0290;
                case 1: goto L_0x0233;
                case 2: goto L_0x022c;
                case 3: goto L_0x01f8;
                case 4: goto L_0x01c8;
                case 5: goto L_0x015d;
                case 6: goto L_0x012f;
                case 7: goto L_0x00e8;
                case 8: goto L_0x0015;
                case 9: goto L_0x00cb;
                case 10: goto L_0x00a1;
                case 11: goto L_0x005d;
                case 12: goto L_0x0016;
                default: goto L_0x0015;
            }
        L_0x0015:
            return r1
        L_0x0016:
            u10 r0 = r0.m
            java.util.List r1 = r0.e
            if (r1 == 0) goto L_0x0040
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0025:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x003e
            java.lang.Object r3 = r1.next()
            v10 r3 = (defpackage.v10) r3
            fr7 r4 = new fr7
            er7 r5 = r3.a
            long r6 = r3.b
            r4.<init>(r5, r6)
            r2.add(r4)
            goto L_0x0025
        L_0x003e:
            r11 = r2
            goto L_0x0045
        L_0x0040:
            java.util.List r2 = java.util.Collections.emptyList()
            goto L_0x003e
        L_0x0045:
            cr7 r1 = new cr7
            r15 = 0
            r16 = 0
            er7 r4 = r0.a
            long r5 = r0.b
            long r7 = r0.c
            long r9 = r0.d
            java.lang.String r12 = r0.f
            float r13 = r0.g
            boolean r14 = r0.h
            r3 = r1
            r3.<init>(r4, r5, r7, r9, r11, r12, r13, r14, r15, r16)
            return r1
        L_0x005d:
            y10 r0 = r0.l
            int r1 = r0.e
            if (r1 == 0) goto L_0x0071
            int r1 = defpackage.au1.s(r1)
            if (r1 == r6) goto L_0x007b
            if (r1 == r7) goto L_0x0079
            if (r1 == r8) goto L_0x0077
            if (r1 == r5) goto L_0x0075
            if (r1 == r4) goto L_0x0073
        L_0x0071:
            r14 = r6
            goto L_0x007c
        L_0x0073:
            r14 = r3
            goto L_0x007c
        L_0x0075:
            r14 = r4
            goto L_0x007c
        L_0x0077:
            r14 = r5
            goto L_0x007c
        L_0x0079:
            r14 = r8
            goto L_0x007c
        L_0x007b:
            r14 = r7
        L_0x007c:
            a8b r1 = new a8b
            long r2 = r0.a
            java.lang.Long r10 = java.lang.Long.valueOf(r2)
            long r2 = r0.b
            java.lang.Long r11 = java.lang.Long.valueOf(r2)
            long r2 = r0.c
            java.lang.Long r12 = java.lang.Long.valueOf(r2)
            long r2 = r0.d
            java.lang.Long r13 = java.lang.Long.valueOf(r2)
            java.lang.String r15 = r0.f
            r16 = 0
            r17 = 0
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            return r1
        L_0x00a1:
            zj3 r1 = new zj3
            n10 r0 = r0.k
            java.lang.String r2 = r0.a
            r27 = 0
            r28 = 0
            long r3 = r0.b
            java.lang.String r5 = r0.c
            java.lang.String r6 = r0.d
            java.lang.String r7 = r0.e
            java.lang.String r8 = r0.f
            java.lang.String r0 = r0.g
            r18 = r1
            r19 = r2
            r20 = r3
            r22 = r5
            r23 = r6
            r24 = r7
            r25 = r8
            r26 = r0
            r18.<init>(r19, r20, r22, r23, r24, r25, r26, r27, r28)
            return r1
        L_0x00cb:
            lf5 r1 = new lf5
            s10 r0 = r0.j
            long r10 = r0.a
            l20 r2 = r0.d
            bz r15 = d(r2)
            java.lang.String r14 = r0.c
            r18 = 0
            long r12 = r0.b
            r16 = 0
            java.lang.String r0 = r0.e
            r9 = r1
            r17 = r0
            r9.<init>(r10, r12, r14, r15, r16, r17, r18)
            return r1
        L_0x00e8:
            l10 r0 = r0.i
            int r1 = r0.c
            if (r1 == 0) goto L_0x00fb
            int r1 = defpackage.au1.s(r1)
            if (r1 == r6) goto L_0x00f9
            if (r1 == r7) goto L_0x00f7
            goto L_0x00fb
        L_0x00f7:
            r12 = r7
            goto L_0x00fc
        L_0x00f9:
            r12 = r8
            goto L_0x00fc
        L_0x00fb:
            r12 = r6
        L_0x00fc:
            int r1 = r0.d
            if (r1 == 0) goto L_0x0117
            int r1 = defpackage.au1.s(r1)
            if (r1 == 0) goto L_0x0117
            if (r1 == r6) goto L_0x0115
            if (r1 == r7) goto L_0x0113
            if (r1 == r8) goto L_0x0111
            if (r1 == r5) goto L_0x010f
            goto L_0x0117
        L_0x010f:
            r13 = r4
            goto L_0x0118
        L_0x0111:
            r13 = r5
            goto L_0x0118
        L_0x0113:
            r13 = r8
            goto L_0x0118
        L_0x0115:
            r13 = r7
            goto L_0x0118
        L_0x0117:
            r13 = r6
        L_0x0118:
            x01 r1 = new x01
            long r2 = r0.e
            java.lang.Long r14 = java.lang.Long.valueOf(r2)
            r16 = 0
            r17 = 0
            java.lang.String r10 = r0.a
            java.lang.String r11 = r0.b
            java.util.List r15 = r0.f
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            return r1
        L_0x012f:
            sjd r1 = new sjd
            c20 r0 = r0.g
            long r2 = r0.a
            x10 r4 = r0.f
            tva r25 = y(r4)
            l20 r4 = r0.g
            bz r26 = d(r4)
            r27 = 0
            r28 = 0
            java.lang.String r4 = r0.b
            java.lang.String r5 = r0.c
            java.lang.String r6 = r0.d
            java.lang.String r0 = r0.e
            r18 = r1
            r19 = r2
            r21 = r4
            r22 = r5
            r23 = r6
            r24 = r0
            r18.<init>(r19, r21, r22, r23, r24, r25, r26, r27, r28)
            return r1
        L_0x015d:
            f2e r1 = new f2e
            f20 r0 = r0.f
            long r2 = r0.a
            int r4 = r0.j
            int r4 = defpackage.au1.s(r4)
            if (r4 == r6) goto L_0x0178
            if (r4 == r7) goto L_0x0175
            if (r4 == r8) goto L_0x0172
            r41 = r6
            goto L_0x017a
        L_0x0172:
            r41 = r5
            goto L_0x017a
        L_0x0175:
            r41 = r8
            goto L_0x017a
        L_0x0178:
            r41 = r7
        L_0x017a:
            int r4 = r0.n
            int r4 = defpackage.au1.s(r4)
            if (r4 == r6) goto L_0x018a
            if (r4 == r7) goto L_0x0187
            r46 = r6
            goto L_0x018c
        L_0x0187:
            r46 = r8
            goto L_0x018c
        L_0x018a:
            r46 = r7
        L_0x018c:
            long r4 = r0.k
            r42 = r4
            java.lang.String r4 = r0.l
            r44 = r4
            boolean r4 = r0.m
            r45 = r4
            r47 = 0
            int r4 = r0.c
            r32 = r4
            int r4 = r0.d
            r33 = r4
            java.lang.String r4 = r0.b
            r34 = r4
            long r4 = r0.i
            r35 = r4
            java.lang.String r4 = r0.e
            r37 = r4
            java.lang.String r4 = r0.f
            r38 = r4
            java.util.List r4 = r0.g
            r39 = r4
            java.lang.String r4 = r0.h
            r40 = r4
            r48 = 0
            java.lang.String r0 = r0.o
            r49 = r0
            r29 = r1
            r30 = r2
            r29.<init>(r30, r32, r33, r34, r35, r37, r38, r39, r40, r41, r42, r44, r45, r46, r47, r48, r49)
            return r1
        L_0x01c8:
            v20 r1 = new v20
            i10 r0 = r0.e
            long r2 = r0.a
            int r9 = r0.i
            if (r9 != 0) goto L_0x01d4
        L_0x01d2:
            r15 = r6
            goto L_0x01e8
        L_0x01d4:
            int r9 = defpackage.au1.s(r9)
            if (r9 == r6) goto L_0x01e7
            if (r9 == r7) goto L_0x01e5
            if (r9 == r8) goto L_0x01e3
            if (r9 == r5) goto L_0x01e1
            goto L_0x01d2
        L_0x01e1:
            r15 = r4
            goto L_0x01e8
        L_0x01e3:
            r15 = r5
            goto L_0x01e8
        L_0x01e5:
            r15 = r8
            goto L_0x01e8
        L_0x01e7:
            r15 = r7
        L_0x01e8:
            r11 = 0
            java.lang.String r12 = r0.e
            r7 = 0
            r8 = 0
            r10 = 0
            java.lang.String r13 = r0.f
            r14 = 0
            r4 = r1
            r5 = r2
            r4.<init>(r5, r7, r8, r10, r11, r12, r13, r14, r15)
            return r1
        L_0x01f8:
            vcf r1 = new vcf
            k20 r0 = r0.d
            long r2 = r0.a
            int r4 = r0.b
            int r19 = defpackage.au1.s(r4)
            r4 = 0
            java.lang.Long r20 = java.lang.Long.valueOf(r4)
            r31 = 0
            r32 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            java.lang.String r0 = r0.m
            r30 = r0
            r16 = r1
            r17 = r2
            r16.<init>(r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return r1
        L_0x022c:
            x10 r0 = r0.b
            tva r0 = y(r0)
            return r0
        L_0x0233:
            q10 r0 = r0.c
            p10 r2 = r0.a
            int r2 = r2.ordinal()
            switch(r2) {
                case 1: goto L_0x0250;
                case 2: goto L_0x024e;
                case 3: goto L_0x0251;
                case 4: goto L_0x024c;
                case 5: goto L_0x0242;
                case 6: goto L_0x024a;
                case 7: goto L_0x0247;
                case 8: goto L_0x0244;
                case 9: goto L_0x023e;
                case 10: goto L_0x0240;
                default: goto L_0x023e;
            }
        L_0x023e:
            r5 = r6
            goto L_0x0251
        L_0x0240:
            r3 = 12
        L_0x0242:
            r5 = r3
            goto L_0x0251
        L_0x0244:
            r3 = 10
            goto L_0x0242
        L_0x0247:
            r3 = 9
            goto L_0x0242
        L_0x024a:
            r3 = 7
            goto L_0x0242
        L_0x024c:
            r5 = r4
            goto L_0x0251
        L_0x024e:
            r5 = r8
            goto L_0x0251
        L_0x0250:
            r5 = r7
        L_0x0251:
            a20 r2 = r0.h
            if (r2 == 0) goto L_0x0264
            a20 r1 = new a20
            float r9 = r2.d
            float r10 = r2.e
            float r7 = r2.b
            float r8 = r2.c
            r11 = 2
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x0264:
            r12 = r1
            ju3 r1 = new ju3
            long r2 = r0.b
            java.lang.Long r6 = java.lang.Long.valueOf(r2)
            java.util.ArrayList r7 = r0.c
            r19 = 0
            r20 = 0
            java.lang.String r8 = r0.d
            java.lang.String r9 = r0.e
            java.lang.String r10 = r0.f
            java.lang.String r11 = r0.g
            java.lang.String r13 = r0.i
            java.lang.String r14 = r0.j
            boolean r15 = r0.k
            int r2 = r0.l
            r16 = r2
            r17 = 0
            java.lang.String r0 = r0.o
            r18 = r0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r1
        L_0x0290:
            f5f r0 = new f5f
            r1 = 0
            r0.<init>(r1, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iz7.d(l20):bz");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: d5g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: d5g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v46, resolved type: d5g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v48, resolved type: d5g} */
    /* JADX WARNING: type inference failed for: r11v1, types: [t10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v11, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v6, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v8, types: [java.lang.Object, o10] */
    /* JADX WARNING: type inference failed for: r12v20, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v21, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v25, types: [h10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v31, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v27, types: [e20, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v52, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v57, types: [b20, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v60, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v32, types: [f10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v34, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v37, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v84, types: [r10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v86, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v41, types: [java.lang.Object, m10] */
    /* JADX WARNING: type inference failed for: r11v43, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v44, types: [y10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v46, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v48, types: [j10, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.l20 e(defpackage.bz r10, defpackage.vxc r11, long r12, long r14) {
        /*
            r0 = 1
            b10 r1 = r10.a
            int r1 = r1.ordinal()
            r2 = 13
            if (r1 == r2) goto L_0x0637
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 16
            r8 = 0
            if (r1 == r7) goto L_0x0555
            switch(r1) {
                case 1: goto L_0x0471;
                case 2: goto L_0x046a;
                case 3: goto L_0x03a5;
                case 4: goto L_0x032f;
                case 5: goto L_0x0280;
                case 6: goto L_0x0211;
                case 7: goto L_0x01c9;
                case 8: goto L_0x0148;
                case 9: goto L_0x00f9;
                case 10: goto L_0x00ad;
                case 11: goto L_0x003a;
                default: goto L_0x0018;
            }
        L_0x0018:
            int r11 = defpackage.l20.A
            j10 r11 = new j10
            r11.<init>()
            g20 r12 = defpackage.g20.a
            r11.a = r12
            java.util.UUID r12 = java.util.UUID.randomUUID()
            java.lang.String r12 = r12.toString()
            r11.l = r12
            boolean r12 = r10.b
            r11.n = r12
            boolean r10 = r10.c
            r11.z = r10
            l20 r10 = r11.a()
            return r10
        L_0x003a:
            a8b r10 = (defpackage.a8b) r10
            y10 r11 = new y10
            r11.<init>()
            java.lang.Long r12 = r10.o
            long r12 = r12.longValue()
            r11.a = r12
            java.lang.Long r12 = r10.X
            long r12 = r12.longValue()
            r11.b = r12
            java.lang.Long r12 = r10.Y
            long r12 = r12.longValue()
            r11.c = r12
            java.lang.Long r12 = r10.Z
            long r12 = r12.longValue()
            r11.d = r12
            int r12 = r10.s0
            if (r12 != 0) goto L_0x0066
            goto L_0x007e
        L_0x0066:
            int r12 = defpackage.au1.s(r12)
            if (r12 == r0) goto L_0x007d
            if (r12 == r5) goto L_0x007b
            if (r12 == r4) goto L_0x0079
            if (r12 == r3) goto L_0x0077
            if (r12 == r2) goto L_0x0075
            goto L_0x007e
        L_0x0075:
            r0 = 6
            goto L_0x007e
        L_0x0077:
            r0 = r2
            goto L_0x007e
        L_0x0079:
            r0 = r3
            goto L_0x007e
        L_0x007b:
            r0 = r4
            goto L_0x007e
        L_0x007d:
            r0 = r5
        L_0x007e:
            r11.e = r0
            java.lang.String r12 = r10.t0
            r11.f = r12
            y10 r12 = new y10
            r12.<init>(r11)
            int r11 = defpackage.l20.A
            j10 r11 = new j10
            r11.<init>()
            java.util.UUID r13 = java.util.UUID.randomUUID()
            java.lang.String r13 = r13.toString()
            r11.l = r13
            g20 r13 = defpackage.g20.w0
            r11.a = r13
            r11.t = r12
            boolean r12 = r10.b
            r11.n = r12
            boolean r10 = r10.c
            r11.z = r10
            l20 r10 = r11.a()
            return r10
        L_0x00ad:
            zj3 r10 = (defpackage.zj3) r10
            m10 r11 = new m10
            r11.<init>()
            java.lang.String r12 = r10.o
            r11.a = r12
            long r12 = r10.X
            r11.b = r12
            java.lang.String r12 = r10.Y
            r11.c = r12
            java.lang.String r12 = r10.t0
            r11.f = r12
            java.lang.String r12 = r10.u0
            r11.g = r12
            java.lang.String r12 = r10.Z
            r11.d = r12
            java.lang.String r12 = r10.s0
            r11.e = r12
            n10 r12 = new n10
            r12.<init>(r11)
            int r11 = defpackage.l20.A
            j10 r11 = new j10
            r11.<init>()
            java.util.UUID r13 = java.util.UUID.randomUUID()
            java.lang.String r13 = r13.toString()
            r11.l = r13
            g20 r13 = defpackage.g20.v0
            r11.a = r13
            r11.s = r12
            boolean r12 = r10.b
            r11.n = r12
            boolean r10 = r10.c
            r11.z = r10
            l20 r10 = r11.a()
            return r10
        L_0x00f9:
            lf5 r10 = (defpackage.lf5) r10
            r10 r12 = new r10
            r12.<init>()
            long r13 = r10.o
            r12.a = r13
            long r13 = r10.X
            r12.b = r13
            java.lang.String r13 = r10.Y
            r12.c = r13
            bz r0 = r10.Z
            if (r0 == 0) goto L_0x0119
            r2 = 0
            r4 = 0
            r1 = r11
            l20 r8 = e(r0, r1, r2, r4)
        L_0x0119:
            r12.e = r8
            java.lang.String r11 = r10.s0
            r12.d = r11
            s10 r11 = new s10
            r11.<init>(r12)
            int r12 = defpackage.l20.A
            j10 r12 = new j10
            r12.<init>()
            java.util.UUID r13 = java.util.UUID.randomUUID()
            java.lang.String r13 = r13.toString()
            r12.l = r13
            g20 r13 = defpackage.g20.u0
            r12.a = r13
            r12.r = r11
            boolean r11 = r10.b
            r12.n = r11
            boolean r10 = r10.c
            r12.z = r10
            l20 r10 = r12.a()
            return r10
        L_0x0148:
            x01 r10 = (defpackage.x01) r10
            k10 r11 = new k10
            r11.<init>()
            java.lang.String r12 = r10.o
            r11.a = r12
            java.lang.String r12 = r10.X
            r11.c = r12
            int r12 = r10.Y
            if (r12 == 0) goto L_0x0169
            int r12 = defpackage.au1.s(r12)
            if (r12 == r0) goto L_0x0167
            if (r12 == r5) goto L_0x0165
            r12 = r0
            goto L_0x016a
        L_0x0165:
            r12 = r5
            goto L_0x016a
        L_0x0167:
            r12 = r4
            goto L_0x016a
        L_0x0169:
            r12 = r6
        L_0x016a:
            r11.d = r12
            int r12 = r10.Z
            if (r12 == 0) goto L_0x0185
            int r12 = defpackage.au1.s(r12)
            if (r12 == r0) goto L_0x0183
            if (r12 == r5) goto L_0x0181
            if (r12 == r4) goto L_0x017f
            if (r12 == r3) goto L_0x017d
            goto L_0x0184
        L_0x017d:
            r0 = r2
            goto L_0x0184
        L_0x017f:
            r0 = r3
            goto L_0x0184
        L_0x0181:
            r0 = r4
            goto L_0x0184
        L_0x0183:
            r0 = r5
        L_0x0184:
            r6 = r0
        L_0x0185:
            r11.f = r6
            java.lang.Long r12 = r10.s0
            if (r12 == 0) goto L_0x0190
            long r12 = r12.longValue()
            goto L_0x0192
        L_0x0190:
            r12 = 0
        L_0x0192:
            r11.b = r12
            java.util.List r12 = r10.t0
            r11.e = r12
            if (r12 != 0) goto L_0x01a0
            java.util.List r12 = java.util.Collections.emptyList()
            r11.e = r12
        L_0x01a0:
            l10 r12 = new l10
            r12.<init>(r11)
            int r11 = defpackage.l20.A
            j10 r11 = new j10
            r11.<init>()
            java.util.UUID r13 = java.util.UUID.randomUUID()
            java.lang.String r13 = r13.toString()
            r11.l = r13
            g20 r13 = defpackage.g20.s0
            r11.a = r13
            r11.q = r12
            boolean r12 = r10.b
            r11.n = r12
            boolean r10 = r10.c
            r11.z = r10
            l20 r10 = r11.a()
            return r10
        L_0x01c9:
            wl r10 = (defpackage.wl) r10
            f10 r11 = new f10
            r11.<init>()
            long r12 = r10.o
            r11.a = r12
            java.lang.String r12 = r10.X
            r11.b = r12
            java.lang.String r12 = r10.Y
            r11.c = r12
            java.lang.String r12 = r10.Z
            r11.d = r12
            int r12 = r10.s0
            r11.e = r12
            long r12 = r10.t0
            r11.f = r12
            g10 r12 = new g10
            r12.<init>(r11)
            int r11 = defpackage.l20.A
            j10 r11 = new j10
            r11.<init>()
            java.util.UUID r13 = java.util.UUID.randomUUID()
            java.lang.String r13 = r13.toString()
            r11.l = r13
            g20 r13 = defpackage.g20.t0
            r11.a = r13
            boolean r13 = r10.b
            r11.n = r13
            boolean r10 = r10.c
            r11.z = r10
            r11.h = r12
            l20 r10 = r11.a()
            return r10
        L_0x0211:
            sjd r10 = (defpackage.sjd) r10
            int r12 = defpackage.c20.i
            b20 r12 = new b20
            r12.<init>()
            long r13 = r10.o
            r12.a = r13
            java.lang.String r13 = r10.Y
            if (r13 == 0) goto L_0x0224
            r12.c = r13
        L_0x0224:
            java.lang.String r14 = r10.X
            if (r14 == 0) goto L_0x022a
            r12.b = r14
        L_0x022a:
            if (r13 == 0) goto L_0x022e
            r12.c = r13
        L_0x022e:
            java.lang.String r13 = r10.Z
            if (r13 == 0) goto L_0x0234
            r12.d = r13
        L_0x0234:
            java.lang.String r13 = r10.s0
            if (r13 == 0) goto L_0x023a
            r12.e = r13
        L_0x023a:
            tva r13 = r10.t0
            if (r13 == 0) goto L_0x0246
            l20 r13 = x(r13, r11)
            x10 r13 = r13.b
            r12.f = r13
        L_0x0246:
            bz r0 = r10.u0
            if (r0 == 0) goto L_0x0255
            r2 = 0
            r4 = 0
            r1 = r11
            l20 r11 = e(r0, r1, r2, r4)
            r12.g = r11
        L_0x0255:
            boolean r11 = r10.b
            r12.h = r11
            int r13 = defpackage.l20.A
            j10 r13 = new j10
            r13.<init>()
            java.util.UUID r14 = java.util.UUID.randomUUID()
            java.lang.String r14 = r14.toString()
            r13.l = r14
            g20 r14 = defpackage.g20.Z
            r13.a = r14
            c20 r14 = new c20
            r14.<init>(r12)
            r13.g = r14
            r13.n = r11
            boolean r10 = r10.c
            r13.z = r10
            l20 r10 = r13.a()
            return r10
        L_0x0280:
            f2e r10 = (defpackage.f2e) r10
            f20 r11 = defpackage.f20.p
            e20 r11 = new e20
            r11.<init>()
            long r12 = r10.o
            r11.a = r12
            java.lang.String r12 = r10.Z
            r11.d = r12
            int r12 = r10.X
            r11.b = r12
            int r12 = r10.Y
            r11.c = r12
            long r12 = r10.s0
            r11.e = r12
            java.lang.String r12 = r10.t0
            boolean r13 = defpackage.oag.t(r12)
            if (r13 != 0) goto L_0x02a7
            r11.f = r12
        L_0x02a7:
            java.lang.String r12 = r10.u0
            boolean r13 = defpackage.oag.t(r12)
            if (r13 != 0) goto L_0x02b1
            r11.g = r12
        L_0x02b1:
            java.util.List r12 = r11.i
            if (r12 != 0) goto L_0x02bc
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r11.i = r12
        L_0x02bc:
            java.util.List r12 = r11.i
            java.util.List r13 = r10.v0
            r12.addAll(r13)
            java.lang.String r12 = r10.w0
            boolean r13 = defpackage.oag.t(r12)
            if (r13 != 0) goto L_0x02cd
            r11.h = r12
        L_0x02cd:
            int r12 = r10.x0
            if (r12 == 0) goto L_0x02e2
            int r12 = defpackage.au1.s(r12)
            if (r12 == r0) goto L_0x02df
            if (r12 == r5) goto L_0x02dd
            if (r12 == r4) goto L_0x02e0
            r3 = r0
            goto L_0x02e0
        L_0x02dd:
            r3 = r4
            goto L_0x02e0
        L_0x02df:
            r3 = r5
        L_0x02e0:
            r11.j = r3
        L_0x02e2:
            long r12 = r10.y0
            r11.k = r12
            java.lang.String r12 = r10.z0
            r11.l = r12
            boolean r12 = r10.A0
            r11.m = r12
            int r12 = r10.B0
            if (r12 == 0) goto L_0x0301
            int r12 = defpackage.au1.s(r12)
            if (r12 == r0) goto L_0x02fd
            if (r12 == r5) goto L_0x02fb
            goto L_0x02fe
        L_0x02fb:
            r0 = r4
            goto L_0x02fe
        L_0x02fd:
            r0 = r5
        L_0x02fe:
            r11.n = r0
            goto L_0x0303
        L_0x0301:
            r11.n = r0
        L_0x0303:
            java.lang.String r12 = r10.C0
            r11.o = r12
            int r12 = defpackage.l20.A
            j10 r12 = new j10
            r12.<init>()
            java.util.UUID r13 = java.util.UUID.randomUUID()
            java.lang.String r13 = r13.toString()
            r12.l = r13
            g20 r13 = defpackage.g20.Y
            r12.a = r13
            f20 r11 = r11.a()
            r12.f = r11
            boolean r11 = r10.b
            r12.n = r11
            boolean r10 = r10.c
            r12.z = r10
            l20 r10 = r12.a()
            return r10
        L_0x032f:
            v20 r10 = (defpackage.v20) r10
            i10 r11 = defpackage.i10.j
            h10 r11 = new h10
            r11.<init>()
            java.lang.Long r12 = r10.o
            if (r12 == 0) goto L_0x0342
            long r12 = r12.longValue()
            r11.a = r12
        L_0x0342:
            java.lang.Long r12 = r10.Y
            if (r12 == 0) goto L_0x034c
            long r12 = r12.longValue()
            r11.c = r12
        L_0x034c:
            java.lang.String r12 = r10.X
            if (r12 == 0) goto L_0x0352
            r11.b = r12
        L_0x0352:
            byte[] r12 = r10.Z
            if (r12 == 0) goto L_0x0358
            r11.d = r12
        L_0x0358:
            java.lang.String r12 = r10.t0
            if (r12 == 0) goto L_0x035e
            r11.f = r12
        L_0x035e:
            int r12 = r10.u0
            if (r12 == 0) goto L_0x0378
            int r12 = defpackage.au1.s(r12)
            if (r12 == r0) goto L_0x0375
            if (r12 == r5) goto L_0x0373
            if (r12 == r4) goto L_0x0371
            if (r12 == r3) goto L_0x036f
            goto L_0x0376
        L_0x036f:
            r0 = r2
            goto L_0x0376
        L_0x0371:
            r0 = r3
            goto L_0x0376
        L_0x0373:
            r0 = r4
            goto L_0x0376
        L_0x0375:
            r0 = r5
        L_0x0376:
            r11.i = r0
        L_0x0378:
            java.lang.String r12 = r10.s0
            r11.e = r12
            int r12 = defpackage.l20.A
            j10 r12 = new j10
            r12.<init>()
            java.util.UUID r13 = java.util.UUID.randomUUID()
            java.lang.String r13 = r13.toString()
            r12.l = r13
            g20 r13 = defpackage.g20.X
            r12.a = r13
            boolean r13 = r10.b
            r12.n = r13
            boolean r10 = r10.c
            r12.z = r10
            i10 r10 = new i10
            r10.<init>(r11)
            r12.e = r10
            l20 r10 = r12.a()
            return r10
        L_0x03a5:
            vcf r10 = (defpackage.vcf) r10
            k20 r12 = defpackage.k20.r
            h20 r12 = new h20
            r12.<init>()
            java.lang.Long r13 = r10.Y
            if (r13 == 0) goto L_0x03b8
            long r13 = r13.longValue()
            r12.b = r13
        L_0x03b8:
            java.lang.Integer r13 = r10.t0
            if (r13 == 0) goto L_0x03c2
            int r13 = r13.intValue()
            r12.e = r13
        L_0x03c2:
            java.lang.Integer r13 = r10.s0
            if (r13 == 0) goto L_0x03cc
            int r13 = r13.intValue()
            r12.d = r13
        L_0x03cc:
            byte[] r13 = r10.x0
            if (r13 == 0) goto L_0x03e0
            int r14 = r13.length
            if (r14 <= 0) goto L_0x03e0
            r11.getClass()     // Catch:{ all -> 0x03d9 }
            r12.i = r13     // Catch:{ all -> 0x03d9 }
            goto L_0x03e0
        L_0x03d9:
            r10 = move-exception
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            r11.<init>(r10)
            throw r11
        L_0x03e0:
            java.lang.String r11 = r10.Z
            if (r11 == 0) goto L_0x03e6
            r12.c = r11
        L_0x03e6:
            boolean r11 = r10.u0
            r12.f = r11
            java.lang.String r11 = r10.v0
            if (r11 == 0) goto L_0x03f0
            r12.g = r11
        L_0x03f0:
            java.lang.String r11 = r10.w0
            if (r11 == 0) goto L_0x03f6
            r12.h = r11
        L_0x03f6:
            java.lang.Long r11 = r10.o
            if (r11 == 0) goto L_0x0400
            long r13 = r11.longValue()
            r12.a = r13
        L_0x0400:
            java.lang.Integer r11 = r10.X
            if (r11 == 0) goto L_0x041d
            int r11 = r11.intValue()
            int[] r13 = defpackage.au1.v(r5)
            int r14 = r13.length
        L_0x040d:
            if (r6 >= r14) goto L_0x041b
            r15 = r13[r6]
            int r1 = defpackage.au1.s(r15)
            if (r1 != r11) goto L_0x0419
            r0 = r15
            goto L_0x041b
        L_0x0419:
            int r6 = r6 + r0
            goto L_0x040d
        L_0x041b:
            r12.q = r0
        L_0x041d:
            java.lang.Long r11 = r10.y0
            if (r11 == 0) goto L_0x0427
            long r13 = r11.longValue()
            r12.j = r13
        L_0x0427:
            java.lang.String r11 = r10.z0
            r12.l = r11
            wdf r11 = r10.A0
            if (r11 == 0) goto L_0x0441
            uy r13 = new uy
            int r3 = r11.o
            int r4 = r11.X
            java.lang.String r5 = r11.a
            int r1 = r11.b
            int r2 = r11.c
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r12.m = r13
        L_0x0441:
            int r11 = defpackage.l20.A
            j10 r11 = new j10
            r11.<init>()
            java.util.UUID r13 = java.util.UUID.randomUUID()
            java.lang.String r13 = r13.toString()
            r11.l = r13
            g20 r13 = defpackage.g20.o
            r11.a = r13
            boolean r13 = r10.b
            r11.n = r13
            boolean r10 = r10.c
            r11.z = r10
            k20 r10 = new k20
            r10.<init>(r12)
            r11.d = r10
            l20 r10 = r11.a()
            return r10
        L_0x046a:
            tva r10 = (defpackage.tva) r10
            l20 r10 = x(r10, r11)
            return r10
        L_0x0471:
            ju3 r10 = (defpackage.ju3) r10
            int r11 = defpackage.q10.p
            o10 r11 = new o10
            r11.<init>()
            int r0 = r10.o
            int r1 = defpackage.au1.s(r0)
            switch(r1) {
                case 0: goto L_0x04b6;
                case 1: goto L_0x04b1;
                case 2: goto L_0x04ac;
                case 3: goto L_0x04a7;
                case 4: goto L_0x04a2;
                case 5: goto L_0x049d;
                case 6: goto L_0x0498;
                case 7: goto L_0x0483;
                case 8: goto L_0x0493;
                case 9: goto L_0x048e;
                case 10: goto L_0x0489;
                case 11: goto L_0x0484;
                default: goto L_0x0483;
            }
        L_0x0483:
            goto L_0x04ba
        L_0x0484:
            p10 r1 = defpackage.p10.v0
            r11.a = r1
            goto L_0x04ba
        L_0x0489:
            p10 r1 = defpackage.p10.u0
            r11.a = r1
            goto L_0x04ba
        L_0x048e:
            p10 r1 = defpackage.p10.t0
            r11.a = r1
            goto L_0x04ba
        L_0x0493:
            p10 r1 = defpackage.p10.s0
            r11.a = r1
            goto L_0x04ba
        L_0x0498:
            p10 r1 = defpackage.p10.Z
            r11.a = r1
            goto L_0x04ba
        L_0x049d:
            p10 r1 = defpackage.p10.Y
            r11.a = r1
            goto L_0x04ba
        L_0x04a2:
            p10 r1 = defpackage.p10.X
            r11.a = r1
            goto L_0x04ba
        L_0x04a7:
            p10 r1 = defpackage.p10.o
            r11.a = r1
            goto L_0x04ba
        L_0x04ac:
            p10 r1 = defpackage.p10.c
            r11.a = r1
            goto L_0x04ba
        L_0x04b1:
            p10 r1 = defpackage.p10.b
            r11.a = r1
            goto L_0x04ba
        L_0x04b6:
            p10 r1 = defpackage.p10.a
            r11.a = r1
        L_0x04ba:
            java.lang.Long r1 = r10.X
            if (r1 == 0) goto L_0x04c4
            long r1 = r1.longValue()
            r11.b = r1
        L_0x04c4:
            java.util.List r1 = r10.Y
            if (r1 == 0) goto L_0x04de
            int r2 = r1.size()
            if (r2 <= 0) goto L_0x04de
            java.util.Collection r2 = r11.c
            if (r2 != 0) goto L_0x04d9
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r11.c = r2
        L_0x04d9:
            java.util.Collection r2 = r11.c
            r2.addAll(r1)
        L_0x04de:
            java.lang.String r1 = r10.Z
            if (r1 == 0) goto L_0x04e4
            r11.d = r1
        L_0x04e4:
            java.lang.String r1 = r10.s0
            if (r1 == 0) goto L_0x04ea
            r11.e = r1
        L_0x04ea:
            java.lang.String r1 = r10.t0
            if (r1 == 0) goto L_0x04f0
            r11.f = r1
        L_0x04f0:
            java.lang.String r1 = r10.u0
            if (r1 == 0) goto L_0x04f6
            r11.g = r1
        L_0x04f6:
            a20 r1 = r10.v0
            if (r1 == 0) goto L_0x050b
            a20 r8 = new a20
            float r3 = r1.b
            float r4 = r1.c
            float r5 = r1.d
            float r6 = r1.e
            r7 = 0
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            r11.h = r8
        L_0x050b:
            java.lang.String r1 = r10.w0
            if (r1 == 0) goto L_0x0511
            r11.i = r1
        L_0x0511:
            java.lang.String r1 = r10.x0
            if (r1 == 0) goto L_0x0517
            r11.j = r1
        L_0x0517:
            boolean r1 = r10.y0
            r11.k = r1
            int r1 = r10.z0
            if (r1 == 0) goto L_0x0521
            r11.l = r1
        L_0x0521:
            r1 = 11
            if (r0 != r1) goto L_0x0529
            r11.m = r12
            r11.n = r14
        L_0x0529:
            java.lang.String r12 = r10.B0
            r11.o = r12
            int r12 = defpackage.l20.A
            j10 r12 = new j10
            r12.<init>()
            java.util.UUID r13 = java.util.UUID.randomUUID()
            java.lang.String r13 = r13.toString()
            r12.l = r13
            g20 r13 = defpackage.g20.b
            r12.a = r13
            q10 r11 = r11.a()
            r12.c = r11
            boolean r11 = r10.b
            r12.n = r11
            boolean r10 = r10.c
            r12.z = r10
            l20 r10 = r12.a()
            return r10
        L_0x0555:
            k5g r10 = (defpackage.k5g) r10
            java.util.ArrayList r11 = new java.util.ArrayList
            java.util.List r12 = r10.o
            int r13 = r12.size()
            r11.<init>(r13)
        L_0x0562:
            int r13 = r12.size()
            if (r6 >= r13) goto L_0x060e
            java.lang.Object r13 = r12.get(r6)
            n5g r13 = (defpackage.n5g) r13
            m5g r14 = r13.a
            int r14 = r14.ordinal()
            switch(r14) {
                case 0: goto L_0x058f;
                case 1: goto L_0x058c;
                case 2: goto L_0x0589;
                case 3: goto L_0x0586;
                case 4: goto L_0x0583;
                case 5: goto L_0x0580;
                case 6: goto L_0x058f;
                case 7: goto L_0x057d;
                default: goto L_0x0577;
            }
        L_0x0577:
            java.lang.IncompatibleClassChangeError r10 = new java.lang.IncompatibleClassChangeError
            r10.<init>()
            throw r10
        L_0x057d:
            e5g r14 = defpackage.e5g.Y
            goto L_0x0590
        L_0x0580:
            e5g r14 = defpackage.e5g.X
            goto L_0x0590
        L_0x0583:
            e5g r14 = defpackage.e5g.o
            goto L_0x0590
        L_0x0586:
            e5g r14 = defpackage.e5g.c
            goto L_0x0590
        L_0x0589:
            e5g r14 = defpackage.e5g.b
            goto L_0x0590
        L_0x058c:
            e5g r14 = defpackage.e5g.a
            goto L_0x0590
        L_0x058f:
            r14 = r8
        L_0x0590:
            java.lang.String r15 = "iz7"
            m5g r1 = r13.a
            if (r14 != 0) goto L_0x05a1
            java.lang.Object[] r13 = new java.lang.Object[]{r1}
            java.lang.String r14 = "Can't map widget content because unsupported type, type: %s"
            defpackage.hm9.m(r15, r14, r13)
            goto L_0x060b
        L_0x05a1:
            int r1 = r1.ordinal()
            if (r1 == r0) goto L_0x05df
            if (r1 == r5) goto L_0x05df
            if (r1 == r4) goto L_0x05c9
            if (r1 == r3) goto L_0x05c9
            if (r1 == r2) goto L_0x05c9
            r7 = 7
            if (r1 == r7) goto L_0x05b3
            goto L_0x05c6
        L_0x05b3:
            bz r13 = r13.c
            if (r13 == 0) goto L_0x05c6
            b10 r1 = defpackage.b10.INLINE_KEYBOARD
            b10 r7 = r13.a
            if (r7 != r1) goto L_0x05c6
            a17 r13 = (defpackage.a17) r13
            z07 r13 = w(r13)
            r1 = r8
        L_0x05c4:
            r7 = r1
            goto L_0x05f3
        L_0x05c6:
            r13 = r8
            r1 = r13
            goto L_0x05c4
        L_0x05c9:
            d5g r13 = r13.b
            if (r13 == 0) goto L_0x05db
            d5g r1 = new d5g
            java.util.List r7 = r13.b
            java.util.ArrayList r7 = u(r7)
            java.lang.String r13 = r13.a
            r1.<init>(r13, r7)
            goto L_0x05dc
        L_0x05db:
            r1 = r8
        L_0x05dc:
            r13 = r8
            r7 = r13
            goto L_0x05f3
        L_0x05df:
            e r13 = r13.d
            if (r13 == 0) goto L_0x05ef
            e r1 = new e
            java.lang.String r7 = r13.c
            int r9 = r13.a
            int r13 = r13.b
            r1.<init>((java.lang.String) r7, (int) r9, (int) r13)
            goto L_0x05f0
        L_0x05ef:
            r1 = r8
        L_0x05f0:
            r7 = r1
            r13 = r8
            r1 = r13
        L_0x05f3:
            if (r1 != 0) goto L_0x0603
            if (r13 != 0) goto L_0x0603
            if (r7 != 0) goto L_0x0603
            java.lang.String r13 = "Can't map widget content because content is empty, type: %s"
            java.lang.Object[] r14 = new java.lang.Object[]{r14}
            defpackage.hm9.m(r15, r13, r14)
            goto L_0x060b
        L_0x0603:
            f5g r15 = new f5g
            r15.<init>(r14, r1, r13, r7)
            r11.add(r15)
        L_0x060b:
            int r6 = r6 + r0
            goto L_0x0562
        L_0x060e:
            j5g r12 = new j5g
            r12.<init>(r11)
            int r11 = defpackage.l20.A
            j10 r11 = new j10
            r11.<init>()
            java.util.UUID r13 = java.util.UUID.randomUUID()
            java.lang.String r13 = r13.toString()
            r11.l = r13
            g20 r13 = defpackage.g20.y0
            r11.a = r13
            r11.w = r12
            boolean r12 = r10.b
            r11.n = r12
            boolean r10 = r10.c
            r11.z = r10
            l20 r10 = r11.a()
            return r10
        L_0x0637:
            cr7 r10 = (defpackage.cr7) r10
            t10 r11 = new t10
            r11.<init>()
            er7 r12 = r10.o
            r11.a = r12
            long r12 = r10.X
            r11.b = r12
            long r12 = r10.Y
            r11.c = r12
            long r12 = r10.Z
            r11.d = r12
            java.util.List r12 = r10.s0
            if (r12 != 0) goto L_0x0657
            java.util.List r12 = java.util.Collections.emptyList()
            goto L_0x067e
        L_0x0657:
            java.util.ArrayList r13 = new java.util.ArrayList
            int r14 = r12.size()
            r13.<init>(r14)
            java.util.Iterator r12 = r12.iterator()
        L_0x0664:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x067d
            java.lang.Object r14 = r12.next()
            fr7 r14 = (defpackage.fr7) r14
            v10 r15 = new v10
            er7 r0 = r14.a
            long r1 = r14.b
            r15.<init>(r0, r1)
            r13.add(r15)
            goto L_0x0664
        L_0x067d:
            r12 = r13
        L_0x067e:
            r11.e = r12
            java.lang.String r12 = r10.t0
            r11.f = r12
            float r12 = r10.u0
            r11.g = r12
            boolean r12 = r10.v0
            r11.h = r12
            u10 r11 = r11.a()
            int r12 = defpackage.l20.A
            j10 r12 = new j10
            r12.<init>()
            java.util.UUID r13 = java.util.UUID.randomUUID()
            java.lang.String r13 = r13.toString()
            r12.l = r13
            g20 r13 = defpackage.g20.x0
            r12.a = r13
            r12.v = r11
            boolean r11 = r10.b
            r12.n = r11
            boolean r10 = r10.c
            r12.z = r10
            l20 r10 = r12.a()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iz7.e(bz, vxc, long, long):l20");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractCollection, wz, java.util.ArrayList] */
    public static wz f(k8g k8g) {
        int i;
        int i2;
        ev0 ev0;
        k8g k8g2 = k8g;
        if (k8g2 == null) {
            return null;
        }
        ? arrayList = new ArrayList();
        for (l20 d : (List) k8g2.a) {
            bz d2 = d(d);
            if (d2 != null) {
                arrayList.add(d2);
            }
        }
        z07 z07 = (z07) k8g2.b;
        if (z07 != null) {
            o9g o9g = new o9g(18, false);
            ArrayList arrayList2 = new ArrayList();
            for (lv0 it : z07.a) {
                ArrayList arrayList3 = new ArrayList();
                arrayList2.add(arrayList3);
                Iterator it2 = it.iterator();
                while (it2.hasNext()) {
                    fv0 fv0 = (fv0) it2.next();
                    String str = fv0.b.a;
                    ev0[] ev0Arr = ev0.c;
                    int length = ev0Arr.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            ev0 = ev0.UNKNOWN;
                            break;
                        }
                        ev0 = ev0Arr[i3];
                        if (ev0.a.equalsIgnoreCase(str)) {
                            break;
                        }
                        i3++;
                    }
                    dv0 dv0 = dv0.UNKNOWN;
                    int s = au1.s(fv0.c);
                    if (s == 0) {
                        dv0 = dv0.DEFAULT;
                    } else if (s == 1) {
                        dv0 = dv0.POSITIVE;
                    } else if (s == 2) {
                        dv0 = dv0.NEGATIVE;
                    }
                    wf wfVar = new wf();
                    wfVar.c = ev0;
                    wfVar.X = dv0;
                    wfVar.o = fv0.a;
                    wfVar.Y = fv0.o;
                    wfVar.Z = fv0.X;
                    wfVar.a = fv0.Y;
                    wfVar.b = fv0.Z;
                    arrayList3.add(new gv0(wfVar));
                }
            }
            o9g.b = arrayList2;
            arrayList.add(new a17(new jc7(o9g), z07.b, false, false));
        }
        wgc wgc = (wgc) k8g2.c;
        if (wgc != null) {
            ArrayList arrayList4 = new ArrayList();
            for (vgc it3 : wgc.a) {
                ArrayList arrayList5 = new ArrayList();
                arrayList4.add(arrayList5);
                Iterator it4 = it3.iterator();
                while (it4.hasNext()) {
                    tgc tgc = (tgc) it4.next();
                    String d3 = z7b.d(tgc.a);
                    int[] v = au1.v(5);
                    int length2 = v.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length2) {
                            i = 0;
                            break;
                        }
                        i = v[i4];
                        if (z7b.e(i).equals(d3)) {
                            break;
                        }
                        i4++;
                    }
                    int i5 = i == 0 ? 5 : i;
                    int s2 = au1.s(tgc.b);
                    if (s2 == 0) {
                        i2 = 1;
                    } else if (s2 != 1) {
                        i2 = s2 != 2 ? 4 : 3;
                    } else {
                        i2 = 2;
                    }
                    arrayList5.add(new ugc(i5, i2, tgc.c, y(tgc.d), (lna) null));
                }
            }
            arrayList.add(new ygc(wgc.b, new xgc(arrayList4), false, false));
        }
        return arrayList;
    }

    public static k8g g(wz wzVar, vxc vxc) {
        return h(wzVar, vxc, 0, 0, (sj3) null);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, m20] */
    public static k8g h(wz wzVar, vxc vxc, long j, long j2, sj3 sj3) {
        int i;
        int i2;
        long j3;
        sj3 sj32 = sj3;
        ? obj = new Object();
        if (wzVar == null) {
            return obj.c();
        }
        Iterator it = wzVar.iterator();
        while (it.hasNext()) {
            bz bzVar = (bz) it.next();
            int ordinal = bzVar.a.ordinal();
            if (ordinal == 12) {
                obj.b = w((a17) bzVar);
            } else if (ordinal != 14) {
                obj.a(e(bzVar, vxc, j, j2));
            } else {
                ygc ygc = (ygc) bzVar;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (List<ugc> it2 : ygc.X.a) {
                    vgc vgc = new vgc();
                    arrayList.add(vgc);
                    for (ugc ugc : it2) {
                        String e = z7b.e(ugc.a);
                        int[] v = au1.v(5);
                        int length = v.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                i = 0;
                                break;
                            }
                            int i4 = v[i3];
                            if (z7b.d(i4).equals(e)) {
                                i = i4;
                                break;
                            }
                            i3++;
                        }
                        int i5 = i == 0 ? 5 : i;
                        int s = au1.s(ugc.b);
                        if (s == 0) {
                            i2 = 1;
                        } else if (s != 1) {
                            i2 = s != 2 ? 4 : 3;
                        } else {
                            i2 = 2;
                        }
                        x10 x10 = null;
                        tva tva = ugc.o;
                        if (tva != null) {
                            x10 = x(tva, (vxc) null).b;
                        }
                        x10 x102 = x10;
                        lna lna = ugc.X;
                        if (lna != null) {
                            arrayList2.add(lna);
                            j3 = lna.a;
                        } else {
                            j3 = -1;
                        }
                        vgc.add(new tgc(i5, i2, ugc.c, x102, j3));
                    }
                }
                if (sj32 != null) {
                    sj32.accept(arrayList2);
                }
                obj.c = new wgc(arrayList, ygc.o);
            }
        }
        return obj.c();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, a92] */
    public static b92 i(xq2 xq2, b92 b92) {
        b92 b922 = b92.h;
        ? obj = new Object();
        obj.a = xq2.b;
        Long l = xq2.c;
        if (l != null) {
            obj.e = l.longValue();
        }
        ArrayList arrayList = new ArrayList();
        List<jm2> list = xq2.a;
        if (list != null) {
            for (jm2 ordinal : list) {
                int ordinal2 = ordinal.ordinal();
                if (ordinal2 == 0) {
                    arrayList.add(y82.a);
                } else if (ordinal2 == 1) {
                    arrayList.add(y82.b);
                } else if (ordinal2 == 2) {
                    arrayList.add(y82.c);
                }
            }
        }
        if (obj.b == null) {
            obj.b = new ArrayList();
        }
        obj.b.addAll(arrayList);
        obj.c = b92.c;
        obj.d = b92.d;
        obj.f = b92.f;
        obj.g = b92.g;
        return obj.b();
    }

    public static ArrayList j(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            op3 op3 = (op3) it.next();
            String str = op3.a;
            int ordinal = op3.b.ordinal();
            arrayList.add(new jl3(str, ordinal != 0 ? ordinal != 2 ? ordinal != 3 ? null : il3.o : il3.c : il3.a, op3.c));
        }
        return arrayList;
    }

    public static ArrayList k(List list) {
        ArrayList arrayList = new ArrayList();
        if (nd7.D(list)) {
            return arrayList;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g9c g9c = (g9c) it.next();
            if (g9c.b == f9c.EMOJI) {
                String str = g9c.c;
                if (oag.u(str)) {
                    arrayList.add(new by4(str));
                }
            }
            if (g9c.b == f9c.ANIMOJI) {
                long j = g9c.a;
                if (j != 0) {
                    arrayList.add(new oi(j));
                }
            }
        }
        return arrayList;
    }

    public static r7b l(s7b s7b) {
        if (s7b == null) {
            return r7b.c;
        }
        int s = au1.s(s7b.a);
        return new r7b(s != 1 ? s != 2 ? s != 3 ? s != 4 ? 0 : 40 : 30 : 20 : 10, s7b.b);
    }

    public static s7b m(r7b r7b) {
        int i = r7b.a;
        return new s7b(i != 10 ? i != 20 ? i != 30 ? i != 40 ? 1 : 5 : 4 : 3 : 2, r7b.b);
    }

    public static HashMap n(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put((Long) entry.getKey(), l((s7b) entry.getValue()));
        }
        return hashMap;
    }

    public static ArrayList o(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y82 y82 = (y82) it.next();
            if (y82 == y82.a) {
                arrayList.add(jm2.SOUND);
            } else if (y82 == y82.b) {
                arrayList.add(jm2.VIBRATION);
            } else if (y82 == y82.c) {
                arrayList.add(jm2.LED);
            }
        }
        return arrayList;
    }

    public static ArrayList p(List list, vxc vxc) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i9c i9c = (i9c) it.next();
            int s = au1.s(i9c.a);
            long j = i9c.b;
            if (s == 1) {
                arrayList.add(new j3e(i9c.c, j));
            } else if (s != 2) {
                Locale locale = Locale.ENGLISH;
                hm9.p("iz7", "Unknown RecentItem " + i9c, (Throwable) null);
            } else {
                arrayList.add(new vc6(x(i9c.d, vxc).b, j));
            }
        }
        return arrayList;
    }

    public static vx8 q(wx8 wx8) {
        int ordinal;
        vx8 vx8 = vx8.ACTIVE;
        return (wx8 == null || (ordinal = wx8.ordinal()) == 0) ? vx8 : ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? vx8 : vx8.DELAYED_FIRE_ERROR : vx8.DELETED : vx8.EDITED;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [e20, java.lang.Object] */
    public static d2e r(e2e e2e) {
        ? obj = new Object();
        obj.a = e2e.a;
        obj.b = e2e.b;
        obj.c = e2e.c;
        obj.d = e2e.d;
        obj.e = e2e.e;
        obj.f = e2e.f;
        obj.g = e2e.g;
        obj.h = e2e.h;
        obj.i = e2e.i;
        int s = au1.s(e2e.j);
        int i = 3;
        obj.j = s != 1 ? s != 2 ? s != 3 ? 1 : 4 : 3 : 2;
        obj.k = e2e.k;
        obj.l = e2e.l;
        obj.m = e2e.m;
        int s2 = au1.s(e2e.n);
        if (s2 == 1) {
            i = 2;
        } else if (s2 != 2) {
            i = 1;
        }
        obj.n = i;
        obj.o = e2e.o;
        return obj.b();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [e20, java.lang.Object] */
    public static f20 s(d2e d2e) {
        ? obj = new Object();
        obj.a = d2e.a;
        obj.d = d2e.o;
        obj.b = d2e.b;
        obj.c = d2e.c;
        obj.f = d2e.Y;
        obj.g = d2e.Z;
        obj.i = d2e.t0;
        obj.h = d2e.s0;
        obj.e = d2e.X;
        int s = au1.s(d2e.u0);
        int i = 3;
        obj.j = s != 1 ? s != 2 ? s != 3 ? 1 : 4 : 3 : 2;
        obj.k = d2e.v0;
        obj.l = d2e.w0;
        obj.m = d2e.x0;
        int s2 = au1.s(d2e.y0);
        if (s2 == 1) {
            i = 2;
        } else if (s2 != 2) {
            i = 1;
        }
        obj.n = i;
        obj.o = d2e.z0;
        return obj.a();
    }

    public static wm3 t(uj3 uj3) {
        pq3 pq3;
        int i;
        pq3 pq32;
        long n = uj3.n();
        ql3 ql3 = uj3.a;
        pl3 pl3 = ql3.c;
        long j = pl3.g;
        String str = pl3.c;
        String str2 = pl3.d;
        ArrayList arrayList = new ArrayList();
        for (jl3 jl3 : pl3.f) {
            String str3 = jl3.a;
            int ordinal = jl3.c.ordinal();
            np3 np3 = np3.c;
            np3 np32 = ordinal != 0 ? ordinal != 2 ? ordinal != 3 ? null : np3 : np3.b : np3.a;
            if (np32 != null) {
                np3 = np32;
            }
            arrayList.add(new op3(str3, np3, jl3.b));
        }
        pl3 pl32 = ql3.c;
        long j2 = pl32.e;
        nl3 nl3 = ql3.c.i;
        if (nl3 == null) {
            pq3 = null;
        } else {
            int ordinal2 = nl3.ordinal();
            if (ordinal2 == 0) {
                pq32 = pq3.BLOCKED;
            } else if (ordinal2 == 1) {
                pq32 = pq3.REMOVED;
            } else {
                throw new IllegalArgumentException("No such value for " + nl3 + " in ContactStatus");
            }
            pq3 = pq32;
        }
        int i2 = ql3.c.l;
        int s = au1.s(i2);
        if (s == 0) {
            i = 1;
        } else if (s == 1) {
            i = 2;
        } else if (s == 2) {
            i = 3;
        } else {
            StringBuilder sb = new StringBuilder("No such value for ");
            sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "FEMALE" : "MALE" : "UNKNOWN");
            sb.append(" in ContactInfo.Gender");
            throw new IllegalArgumentException(sb.toString());
        }
        List<ll3> list = pl32.n;
        ArrayList arrayList2 = new ArrayList();
        for (ll3 ordinal3 : list) {
            int ordinal4 = ordinal3.ordinal();
            if (ordinal4 == 0) {
                arrayList2.add(vm3.OFFICIAL);
            } else if (ordinal4 == 1) {
                arrayList2.add(vm3.BOT);
            } else if (ordinal4 == 2) {
                arrayList2.add(vm3.SERVICE_ACCOUNT);
            } else if (ordinal4 == 3) {
                arrayList2.add(vm3.HAS_WEBAPP);
            }
        }
        String str4 = pl32.o;
        kl3 kl3 = pl32.u;
        return new wm3(n, j, str, str2, arrayList, j2, pl32.h, pq3, i, arrayList2, str4, pl32.p, pl32.q, kl3 == null ? null : new jc7(kl3.a), pl32.v);
    }

    public static ArrayList u(List list) {
        mu8 mu8;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lu8 lu8 = (lu8) it.next();
            if (lu8 != null) {
                switch (lu8.c.ordinal()) {
                    case 1:
                        mu8 = mu8.a;
                        break;
                    case 2:
                        mu8 = mu8.b;
                        break;
                    case 3:
                        mu8 = mu8.c;
                        break;
                    case 4:
                        mu8 = mu8.o;
                        break;
                    case 5:
                        mu8 = mu8.X;
                        break;
                    case 6:
                        mu8 = mu8.Y;
                        break;
                    case 7:
                        mu8 = mu8.Z;
                        break;
                    case 8:
                        mu8 = mu8.t0;
                        break;
                    case 9:
                        mu8 = mu8.u0;
                        break;
                    case 10:
                        mu8 = mu8.s0;
                        break;
                    case 11:
                        mu8 = mu8.v0;
                        break;
                }
                mu8 mu82 = mu8;
                Map map = lu8.Y;
                arrayList.add(new nu8(lu8.a, lu8.b, mu82, lu8.o, lu8.X, map == null ? null : new HashMap(map)));
            }
        }
        return arrayList;
    }

    public static ArrayList v(List list) {
        pu8 pu8;
        HashMap hashMap;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nu8 nu8 = (nu8) it.next();
            switch (nu8.c.ordinal()) {
                case 0:
                    pu8 = pu8.b;
                    break;
                case 1:
                    pu8 = pu8.c;
                    break;
                case 2:
                    pu8 = pu8.o;
                    break;
                case 3:
                    pu8 = pu8.X;
                    break;
                case 4:
                    pu8 = pu8.Y;
                    break;
                case 5:
                    pu8 = pu8.Z;
                    break;
                case 6:
                    pu8 = pu8.s0;
                    break;
                case 7:
                    pu8 = pu8.v0;
                    break;
                case 8:
                    pu8 = pu8.t0;
                    break;
                case 9:
                    pu8 = pu8.u0;
                    break;
                case 10:
                    pu8 = pu8.w0;
                    break;
            }
            pu8 pu82 = pu8;
            short s = (short) nu8.d;
            short s2 = (short) nu8.e;
            Map map = nu8.f;
            if (map == null || map.size() == 0) {
                hashMap = Collections.emptyMap();
            } else {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (entry.getValue() instanceof Serializable) {
                        hashMap2.put((String) entry.getKey(), (Serializable) entry.getValue());
                    } else {
                        throw new IllegalStateException("attribute must be Serializable");
                    }
                }
                hashMap = hashMap2;
            }
            arrayList.add(new lu8(nu8.a, nu8.b, pu82, s, s2, hashMap));
        }
        return arrayList;
    }

    public static z07 w(a17 a17) {
        nv0 nv0;
        int i;
        int i2 = z07.c;
        y07 y07 = new y07();
        ArrayList arrayList = new ArrayList();
        for (List<gv0> it : (List) a17.o.a) {
            ArrayList arrayList2 = new ArrayList();
            arrayList.add(arrayList2);
            for (gv0 gv0 : it) {
                String str = gv0.a.a;
                nv0[] nv0Arr = nv0.u0;
                int length = nv0Arr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        nv0 = nv0.UNKNOWN;
                        break;
                    }
                    nv0 = nv0Arr[i3];
                    if (nv0.a.equalsIgnoreCase(str)) {
                        break;
                    }
                    i3++;
                }
                int ordinal = gv0.c.ordinal();
                if (ordinal != 0) {
                    i = 2;
                    if (ordinal != 1) {
                        i = ordinal != 2 ? 4 : 3;
                    }
                } else {
                    i = 1;
                }
                cv0 cv0 = new cv0(gv0.b, nv0, i);
                cv0.d = gv0.o;
                cv0.e = gv0.X;
                cv0.f = gv0.Y;
                cv0.h = gv0.Z;
                arrayList2.add(new fv0(cv0));
            }
        }
        y07.a = arrayList;
        y07.b = a17.X;
        return new z07(y07);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [w10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v3, types: [j10, java.lang.Object] */
    public static l20 x(tva tva, vxc vxc) {
        x10 x10 = x10.w0;
        ? obj = new Object();
        String str = tva.o;
        if (str != null) {
            obj.a = str;
        }
        String str2 = tva.X;
        if (str2 != null) {
            obj.b = str2;
        }
        Integer num = tva.Y;
        if (num != null) {
            obj.c = num.intValue();
        }
        Integer num2 = tva.Z;
        if (num2 != null) {
            obj.d = num2.intValue();
        }
        obj.e = tva.s0;
        byte[] bArr = tva.t0;
        if (bArr != null && bArr.length > 0) {
            try {
                vxc.getClass();
                obj.f = bArr;
            } catch (Throwable unused) {
                obj.f = bArr;
            }
        }
        Long l = tva.w0;
        if (l != null) {
            obj.h = l.longValue();
        }
        String str3 = tva.v0;
        if (str3 != null) {
            obj.i = str3;
        }
        String str4 = tva.u0;
        if (str4 != null) {
            obj.g = str4;
        }
        obj.k = tva.x0;
        x10 a2 = obj.a();
        int i = l20.A;
        ? obj2 = new Object();
        obj2.l = UUID.randomUUID().toString();
        obj2.a = g20.c;
        obj2.n = tva.b;
        obj2.z = tva.c;
        obj2.b = a2;
        return obj2.a();
    }

    public static tva y(x10 x10) {
        if (x10 == null) {
            return null;
        }
        String str = !oag.t(x10.a) ? x10.a : null;
        String str2 = x10.b;
        String str3 = !oag.t(str2) ? str2 : null;
        int i = x10.c;
        Integer valueOf = i > 0 ? Integer.valueOf(i) : null;
        int i2 = x10.o;
        Integer valueOf2 = i2 > 0 ? Integer.valueOf(i2) : null;
        byte[] bArr = x10.Y;
        byte[] bArr2 = (bArr == null || bArr.length <= 0) ? null : bArr;
        String str4 = x10.t0;
        String str5 = !oag.t(str4) ? str4 : null;
        String str6 = x10.Z;
        String str7 = !oag.t(str6) ? str6 : null;
        String str8 = x10.v0;
        return new tva(str, str3, valueOf, valueOf2, x10.X, bArr2, Long.valueOf(x10.s0), str5, str7, false, false, !oag.t(str8) ? str8 : null);
    }
}
