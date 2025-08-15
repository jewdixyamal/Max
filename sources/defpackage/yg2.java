package defpackage;

import android.content.Context;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: yg2  reason: default package */
public final class yg2 implements uu, pfc {
    public final long a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public yg2(je7 je7, je7 je72, je7 je73, je7 je74, eg2 eg2, long j, Set set, ad8 ad8) {
        this.b = eg2;
        this.a = j;
        this.c = set;
        this.d = ad8;
        this.e = yg2.class.getName();
        this.f = je7;
        this.g = je72;
        this.h = je73;
        this.i = je74;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(long r28, int r30, int r31, long r32, long r34, kotlin.coroutines.Continuation r36) {
        /*
            r27 = this;
            r0 = r27
            r1 = r36
            boolean r2 = r1 instanceof defpackage.tg2
            if (r2 == 0) goto L_0x0017
            r2 = r1
            tg2 r2 = (defpackage.tg2) r2
            int r3 = r2.w0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.w0 = r3
            goto L_0x001c
        L_0x0017:
            tg2 r2 = new tg2
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.u0
            tx3 r3 = defpackage.tx3.a
            int r4 = r2.w0
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0055
            if (r4 == r6) goto L_0x0049
            if (r4 != r5) goto L_0x0041
            int r0 = r2.t0
            int r3 = r2.s0
            long r4 = r2.Z
            cu8 r9 = r2.Y
            e52 r10 = r2.X
            yg2 r2 = r2.o
            defpackage.od2.a0(r1)
            r21 = r0
            r18 = r3
            r22 = r4
            goto L_0x0141
        L_0x0041:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0049:
            int r0 = r2.t0
            int r4 = r2.s0
            long r9 = r2.Z
            yg2 r11 = r2.o
            defpackage.od2.a0(r1)
            goto L_0x0080
        L_0x0055:
            defpackage.od2.a0(r1)
            java.lang.Object r1 = r0.f
            je7 r1 = (defpackage.je7) r1
            java.lang.Object r1 = r1.getValue()
            iy2 r1 = (defpackage.iy2) r1
            r2.o = r0
            r9 = r28
            r2.Z = r9
            r4 = r30
            r2.s0 = r4
            r11 = r31
            r2.t0 = r11
            r2.w0 = r6
            long r12 = r0.a
            java.lang.Object r1 = r1.d(r12, r2)
            if (r1 != r3) goto L_0x007b
            return r3
        L_0x007b:
            r26 = r11
            r11 = r0
            r0 = r26
        L_0x0080:
            e52 r1 = (defpackage.e52) r1
            java.lang.Object r12 = r11.d
            ad8 r12 = (defpackage.ad8) r12
            zc8 r12 = r12.d()
            java.lang.Object r13 = r11.g
            je7 r13 = (defpackage.je7) r13
            java.lang.Object r13 = r13.getValue()
            au8 r13 = (defpackage.au8) r13
            long r14 = r11.a
            cu8 r13 = r13.r(r14, r9)
            if (r13 == 0) goto L_0x009f
            long r5 = r13.c
            goto L_0x00a1
        L_0x009f:
            r5 = 0
        L_0x00a1:
            long r7 = r12.d
            int r7 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r7 != 0) goto L_0x00cb
            java.lang.Object r7 = r11.c
            java.util.Set r7 = (java.util.Set) r7
            java.util.Set r8 = r12.c
            boolean r7 = r8.containsAll(r7)
            if (r7 == 0) goto L_0x00cb
            if (r0 <= 0) goto L_0x00bf
            long r7 = r12.b
            r14 = 0
            int r16 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r16 == 0) goto L_0x00c1
            r5 = r7
            goto L_0x00c1
        L_0x00bf:
            r14 = 0
        L_0x00c1:
            if (r4 <= 0) goto L_0x00cd
            long r7 = r12.a
            int r12 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r12 == 0) goto L_0x00cd
            r5 = r7
            goto L_0x00cd
        L_0x00cb:
            r14 = 0
        L_0x00cd:
            int r7 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r7 != 0) goto L_0x00e1
            java.lang.String r0 = "Media loader. Don't request media if messageId == 0"
            java.lang.Object r1 = r11.e
            java.lang.String r1 = (java.lang.String) r1
            defpackage.hm9.m(r1, r0, new java.lang.Object[0])
            java.lang.Integer r0 = new java.lang.Integer
            r1 = -1
            r0.<init>(r1)
            return r0
        L_0x00e1:
            au r7 = new au
            k92 r8 = r1.b
            long r14 = r8.a
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r5)
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r0)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r4)
            java.lang.Object r12 = r11.c
            r20 = r12
            java.util.Set r20 = (java.util.Set) r20
            r16 = r7
            r17 = r14
            r19 = r8
            r21 = r5
            r22 = r6
            r16.<init>((long) r17, (java.lang.Long) r19, (java.util.Set) r20, (java.lang.Integer) r21, (java.lang.Integer) r22)
            ug2 r5 = new ug2
            r6 = 0
            r5.<init>(r11, r7, r6)
            mqc r7 = new mqc
            r7.<init>(r5)
            vg2 r5 = new vg2
            r8 = 0
            r5.<init>(r11, r6, r8)
            ac r6 = new ac
            r8 = 19
            r6.<init>(r7, r8, r5)
            r2.o = r11
            r2.X = r1
            r2.Y = r13
            r2.Z = r9
            r2.s0 = r4
            r2.t0 = r0
            r5 = 2
            r2.w0 = r5
            java.lang.Object r2 = defpackage.od2.A(r6, r2)
            if (r2 != r3) goto L_0x0137
            return r3
        L_0x0137:
            r21 = r0
            r18 = r4
            r22 = r9
            r9 = r13
            r10 = r1
            r1 = r2
            r2 = r11
        L_0x0141:
            de2 r1 = (defpackage.de2) r1
            java.util.List r0 = r1.c()
            boolean r0 = r0.isEmpty()
            r3 = 1
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x017a
            java.lang.Object r0 = r2.g
            je7 r0 = (defpackage.je7) r0
            java.lang.Object r0 = r0.getValue()
            au8 r0 = (defpackage.au8) r0
            long r3 = r10.a
            java.util.List r5 = r1.c()
            java.lang.Object r6 = r2.h
            je7 r6 = (defpackage.je7) r6
            java.lang.Object r6 = r6.getValue()
            q33 r6 = (defpackage.q33) r6
            hyc r6 = (defpackage.hyc) r6
            long r6 = r6.t()
            r27 = r0
            r28 = r3
            r30 = r6
            r32 = r5
            r27.g(r28, r30, r32)
        L_0x017a:
            java.lang.Object r0 = r2.f
            je7 r0 = (defpackage.je7) r0
            java.lang.Object r0 = r0.getValue()
            iy2 r0 = (defpackage.iy2) r0
            long r3 = r10.a
            if (r9 == 0) goto L_0x018d
            long r7 = r9.b
            r19 = r7
            goto L_0x018f
        L_0x018d:
            r19 = 0
        L_0x018f:
            jz2 r0 = (defpackage.jz2) r0
            p82 r0 = r0.l()
            r0.getClass()
            j82 r5 = new j82
            java.lang.Object r2 = r2.c
            r16 = r2
            java.util.Set r16 = (java.util.Set) r16
            r14 = r5
            r15 = r0
            r17 = r1
            r24 = r3
            r14.<init>(r15, r16, r17, r18, r19, r21, r22, r24)
            r2 = 0
            r0.h(r3, r2, r5)
            java.util.List r0 = r1.c()
            int r0 = r0.size()
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yg2.a(long, int, int, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0087 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0088 A[PHI: r0 
      PHI: (r0v2 java.lang.Object) = (r0v5 java.lang.Object), (r0v1 java.lang.Object) binds: [B:20:0x0085, B:11:0x002c] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(int r17, long r18, long r20, kotlin.coroutines.Continuation r22) {
        /*
            r16 = this;
            r10 = r16
            r0 = r22
            boolean r1 = r0 instanceof defpackage.xg2
            if (r1 == 0) goto L_0x0018
            r1 = r0
            xg2 r1 = (defpackage.xg2) r1
            int r2 = r1.u0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.u0 = r2
        L_0x0016:
            r11 = r1
            goto L_0x001e
        L_0x0018:
            xg2 r1 = new xg2
            r1.<init>(r10, r0)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r0 = r11.s0
            tx3 r12 = defpackage.tx3.a
            int r1 = r11.u0
            r13 = 2
            r2 = 1
            if (r1 == 0) goto L_0x0046
            if (r1 == r2) goto L_0x0038
            if (r1 != r13) goto L_0x0030
            defpackage.od2.a0(r0)
            goto L_0x0088
        L_0x0030:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0038:
            long r1 = r11.Y
            int r3 = r11.Z
            long r4 = r11.X
            yg2 r6 = r11.o
            defpackage.od2.a0(r0)
            r14 = r4
            r10 = r6
            goto L_0x006e
        L_0x0046:
            defpackage.od2.a0(r0)
            r11.o = r10
            r14 = r18
            r11.X = r14
            r9 = r17
            r11.Z = r9
            r7 = r20
            r11.Y = r7
            r11.u0 = r2
            r3 = 0
            r5 = 0
            r0 = r16
            r1 = r18
            r4 = r17
            r9 = r11
            java.lang.Object r0 = r0.a(r1, r3, r4, r5, r7, r9)
            if (r0 != r12) goto L_0x006a
            return r12
        L_0x006a:
            r3 = r17
            r1 = r20
        L_0x006e:
            java.lang.Object r0 = r10.b
            uu r0 = (defpackage.uu) r0
            r4 = 0
            r11.o = r4
            r11.u0 = r13
            r16 = r0
            r17 = r3
            r18 = r14
            r20 = r1
            r22 = r11
            java.lang.Object r0 = r16.b(r17, r18, r20, r22)
            if (r0 != r12) goto L_0x0088
            return r12
        L_0x0088:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yg2.b(int, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008f A[PHI: r0 
      PHI: (r0v2 java.lang.Object) = (r0v5 java.lang.Object), (r0v1 java.lang.Object) binds: [B:20:0x008c, B:11:0x002c] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(int r19, long r20, long r22, kotlin.coroutines.Continuation r24) {
        /*
            r18 = this;
            r10 = r18
            r0 = r24
            boolean r1 = r0 instanceof defpackage.wg2
            if (r1 == 0) goto L_0x0018
            r1 = r0
            wg2 r1 = (defpackage.wg2) r1
            int r2 = r1.u0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.u0 = r2
        L_0x0016:
            r11 = r1
            goto L_0x001e
        L_0x0018:
            wg2 r1 = new wg2
            r1.<init>(r10, r0)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r0 = r11.s0
            tx3 r12 = defpackage.tx3.a
            int r1 = r11.u0
            r13 = 2
            r2 = 1
            if (r1 == 0) goto L_0x0046
            if (r1 == r2) goto L_0x0038
            if (r1 != r13) goto L_0x0030
            defpackage.od2.a0(r0)
            goto L_0x008f
        L_0x0030:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0038:
            long r1 = r11.Y
            int r3 = r11.Z
            long r4 = r11.X
            yg2 r6 = r11.o
            defpackage.od2.a0(r0)
            r14 = r4
            r10 = r6
            goto L_0x0075
        L_0x0046:
            defpackage.od2.a0(r0)
            r11.o = r10
            r14 = r20
            r11.X = r14
            r9 = r19
            r11.Z = r9
            r7 = r22
            r11.Y = r7
            r11.u0 = r2
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4 = 0
            r0 = r18
            r1 = r20
            r3 = r19
            r5 = r22
            r7 = r16
            r9 = r11
            java.lang.Object r0 = r0.a(r1, r3, r4, r5, r7, r9)
            if (r0 != r12) goto L_0x0071
            return r12
        L_0x0071:
            r3 = r19
            r1 = r22
        L_0x0075:
            java.lang.Object r0 = r10.b
            uu r0 = (defpackage.uu) r0
            r4 = 0
            r11.o = r4
            r11.u0 = r13
            r18 = r0
            r19 = r3
            r20 = r14
            r22 = r1
            r24 = r11
            java.lang.Object r0 = r18.d(r19, r20, r22, r24)
            if (r0 != r12) goto L_0x008f
            return r12
        L_0x008f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yg2.d(int, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public fu1 e(String str) {
        if (((ArrayList) this.g).contains(str)) {
            iu1 f2 = f(str);
            w90 w90 = (w90) this.d;
            Executor executor = w90.a;
            return new fu1((Context) this.b, (dx1) this.f, str, f2, (l0f) this.c, (ux1) this.e, executor, w90.b, (ul4) this.h, this.a);
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    public iu1 f(String str) {
        HashMap hashMap = (HashMap) this.i;
        try {
            iu1 iu1 = (iu1) hashMap.get(str);
            if (iu1 != null) {
                return iu1;
            }
            iu1 iu12 = new iu1((dx1) this.f, str);
            hashMap.put(str, iu12);
            return iu12;
        } catch (CameraAccessExceptionCompat e2) {
            throw new Exception(e2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v16, types: [dle] */
    /* JADX WARNING: type inference failed for: r0v17, types: [dle] */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:18|19|20|21|(4:24|(2:26|56)(2:27|57)|54|22)|55|28|(2:31|29)|58) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0067 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076 A[Catch:{ CameraAccessException -> 0x00ff, CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0099 A[Catch:{ CameraAccessException -> 0x00ff, CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }, LOOP:2: B:29:0x0093->B:31:0x0099, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yg2(android.content.Context r5, defpackage.w90 r6, defpackage.px1 r7, long r8) {
        /*
            r4 = this;
            r4.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.i = r0
            r4.b = r5
            r4.d = r6
            dx1 r6 = new dx1
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            r2 = 0
            if (r0 < r1) goto L_0x001d
            fx1 r0 = new fx1
            r0.<init>((android.content.Context) r5, (defpackage.z7) r2)
            goto L_0x0022
        L_0x001d:
            ex1 r0 = new ex1
            r0.<init>((android.content.Context) r5, (defpackage.z7) r2)
        L_0x0022:
            r6.<init>(r0)
            r4.f = r6
            ul4 r5 = defpackage.ul4.b(r5)
            r4.h = r5
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            r5.<init>()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            dle r0 = r6.a     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            r0.getClass()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            java.lang.Object r0 = r0.b     // Catch:{ CameraAccessException -> 0x00ff }
            android.hardware.camera2.CameraManager r0 = (android.hardware.camera2.CameraManager) r0     // Catch:{ CameraAccessException -> 0x00ff }
            java.lang.String[] r0 = r0.getCameraIdList()     // Catch:{ CameraAccessException -> 0x00ff }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            if (r7 != 0) goto L_0x005f
            java.util.Iterator r6 = r0.iterator()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
        L_0x0049:
            boolean r7 = r6.hasNext()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            if (r7 == 0) goto L_0x00a9
            java.lang.Object r7 = r6.next()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            r5.add(r7)     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            goto L_0x0049
        L_0x0059:
            r4 = move-exception
            goto L_0x0106
        L_0x005c:
            r4 = move-exception
            goto L_0x010c
        L_0x005f:
            java.lang.Integer r1 = r7.b()     // Catch:{ IllegalStateException -> 0x0067 }
            java.lang.String r2 = defpackage.kq0.i(r6, r1, r0)     // Catch:{ IllegalStateException -> 0x0067 }
        L_0x0067:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            r6.<init>()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
        L_0x0070:
            boolean r1 = r0.hasNext()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            if (r1 == 0) goto L_0x008b
            java.lang.Object r1 = r0.next()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            boolean r3 = r1.equals(r2)     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            if (r3 == 0) goto L_0x0083
            goto L_0x0070
        L_0x0083:
            iu1 r1 = r4.f(r1)     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            r6.add(r1)     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            goto L_0x0070
        L_0x008b:
            java.util.List r6 = r7.a(r6)     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
        L_0x0093:
            boolean r7 = r6.hasNext()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            if (r7 == 0) goto L_0x00a9
            java.lang.Object r7 = r6.next()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            yw1 r7 = (defpackage.yw1) r7     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            yw1 r7 = (defpackage.yw1) r7     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            java.lang.String r7 = r7.d()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            r5.add(r7)     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            goto L_0x0093
        L_0x00a9:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x00b2:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x00e1
            java.lang.Object r7 = r5.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r0 = "0"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x00dd
            java.lang.String r0 = "1"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00cf
            goto L_0x00dd
        L_0x00cf:
            java.lang.Object r0 = r4.f
            dx1 r0 = (defpackage.dx1) r0
            boolean r0 = defpackage.ngg.z(r0, r7)
            if (r0 == 0) goto L_0x00b2
            r6.add(r7)
            goto L_0x00b2
        L_0x00dd:
            r6.add(r7)
            goto L_0x00b2
        L_0x00e1:
            r4.g = r6
            l0f r5 = new l0f
            java.lang.Object r6 = r4.f
            dx1 r6 = (defpackage.dx1) r6
            r5.<init>((defpackage.dx1) r6)
            r4.c = r5
            ux1 r6 = new ux1
            r6.<init>(r5)
            r4.e = r6
            java.lang.Object r5 = r5.o
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.add(r6)
            r4.a = r8
            return
        L_0x00ff:
            r4 = move-exception
            androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat r5 = new androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            r5.<init>(r4)     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            throw r5     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
        L_0x0106:
            androidx.camera.core.InitializationException r5 = new androidx.camera.core.InitializationException
            r5.<init>(r4)
            throw r5
        L_0x010c:
            androidx.camera.core.InitializationException r5 = new androidx.camera.core.InitializationException
            androidx.camera.core.CameraUnavailableException r6 = new androidx.camera.core.CameraUnavailableException
            r6.<init>(r4)
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yg2.<init>(android.content.Context, w90, px1, long):void");
    }
}
