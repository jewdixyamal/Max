package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* renamed from: c8f  reason: default package */
public final class c8f implements on5 {
    public final /* synthetic */ UploadFileAttachWorker a;
    public final /* synthetic */ lec b;

    public c8f(UploadFileAttachWorker uploadFileAttachWorker, lec lec) {
        this.a = uploadFileAttachWorker;
        this.b = lec;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj, Continuation continuation) {
        ly8 ly8 = (ly8) obj;
        return b(continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(kotlin.coroutines.Continuation r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof defpackage.b8f
            if (r0 == 0) goto L_0x0013
            r0 = r14
            b8f r0 = (defpackage.b8f) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            b8f r0 = new b8f
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            e5f r3 = defpackage.e5f.a
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r7) goto L_0x0042
            if (r2 == r6) goto L_0x0039
            if (r2 != r5) goto L_0x0031
            defpackage.od2.a0(r14)
            goto L_0x00fc
        L_0x0031:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0039:
            java.lang.Object r13 = r0.o
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r13 = (ru.ok.tamtam.upload.workers.UploadFileAttachWorker) r13
            defpackage.od2.a0(r14)
            goto L_0x00ef
        L_0x0042:
            lec r13 = r0.X
            java.lang.Object r2 = r0.o
            c8f r2 = (defpackage.c8f) r2
            defpackage.od2.a0(r14)
            goto L_0x00b3
        L_0x004c:
            defpackage.od2.a0(r14)
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r14 = r13.a
            ir6 r2 = defpackage.hm9.m
            if (r2 != 0) goto L_0x0056
            goto L_0x0073
        L_0x0056:
            boolean r8 = r2.c()
            if (r8 == 0) goto L_0x0073
            us7 r8 = defpackage.us7.X
            float r14 = r14.B0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "File upload: progress="
            r9.<init>(r10)
            r9.append(r14)
            java.lang.String r14 = r9.toString()
            java.lang.String r9 = "UploadFileAttachWorker"
            r2.d(r8, r9, r14, r4)
        L_0x0073:
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r14 = r13.a
            float r2 = r14.B0
            boolean r14 = r14.needToShowNotification(r2)
            if (r14 != 0) goto L_0x0083
            int r14 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            if (r14 < r2) goto L_0x00fc
        L_0x0083:
            lec r14 = r13.b
            long r8 = r14.a
            r10 = -1
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x00bc
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r2 = r13.a
            r0.o = r13
            r0.X = r14
            r0.s0 = r7
            khe r7 = r2.x0
            java.lang.Object r7 = r7.getValue()
            kke r7 = (defpackage.kke) r7
            w9a r7 = (defpackage.w9a) r7
            nx3 r7 = r7.b()
            w7f r8 = new w7f
            r8.<init>(r2, r4)
            java.lang.Object r2 = defpackage.j47.t0(r7, r8, r0)
            if (r2 != r1) goto L_0x00af
            return r1
        L_0x00af:
            r12 = r2
            r2 = r13
            r13 = r14
            r14 = r12
        L_0x00b3:
            java.lang.Number r14 = (java.lang.Number) r14
            long r7 = r14.longValue()
            r13.a = r7
            r13 = r2
        L_0x00bc:
            lec r14 = r13.b
            long r7 = r14.a
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r14 = r13.a
            khe r14 = r14.w0
            java.lang.Object r14 = r14.getValue()
            m7b r14 = (defpackage.m7b) r14
            p7b r14 = (defpackage.p7b) r14
            z7d r14 = r14.b
            r14.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r2 = ru.ok.tamtam.android.prefs.PmsKey.f67maxdownloadedsizefornotifykb
            r9 = 1024(0x400, float:1.435E-42)
            long r9 = (long) r9
            long r9 = r14.q(r2, r9)
            int r14 = (int) r9
            long r9 = (long) r14
            int r14 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r14 <= 0) goto L_0x00fc
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r13 = r13.a
            r0.o = r13
            r0.X = r4
            r0.s0 = r6
            java.lang.Object r14 = r13.getForegroundInfo(r0)
            if (r14 != r1) goto L_0x00ef
            return r1
        L_0x00ef:
            ay5 r14 = (defpackage.ay5) r14
            r0.o = r4
            r0.s0 = r5
            java.lang.Object r13 = r13.setForeground(r14, r0)
            if (r13 != r1) goto L_0x00fc
            return r1
        L_0x00fc:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c8f.b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
