package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ada  reason: default package */
public final class ada extends cj0 {
    public static final /* synthetic */ int o = 0;
    public final o45 h;
    public final uuc i;
    public final kke j;
    public final khe k = new khe(new yca(this, 0));
    public final khe l;
    public final khe m;
    public final AtomicBoolean n;

    public ada(Context context, o45 o45, kk5 kk5, y7d y7d, f6a f6a, uuc uuc, kke kke) {
        super(context, kk5.b, kk5, y7d, f6a, o45);
        this.h = o45;
        this.i = uuc;
        this.j = kke;
        this.l = new khe(new zj7(18, y7d));
        this.m = new khe(new yca(this, 1));
        this.n = new AtomicBoolean();
    }

    public final boolean e(String str, String str2, float f, float f2, nqb nqb, boolean z, n2f n2f) {
        AtomicBoolean atomicBoolean = this.n;
        boolean z2 = true;
        atomicBoolean.set(true);
        CopyOnWriteArraySet copyOnWriteArraySet = this.g;
        boolean isEmpty = copyOnWriteArraySet.isEmpty();
        Handler handler = this.f;
        if (!isEmpty) {
            handler.post(new bj0(this, 1));
        }
        try {
            if (!((Boolean) ((gl8) this.l.getValue()).d.getValue()).booleanValue() || !g(str, str2, f, f2, nqb, z, n2f)) {
                z2 = xef.a(this.a, this.h, str, str2, f, f2, nqb, z, new rxd(24, n2f));
            }
            return z2;
        } finally {
            atomicBoolean.set(false);
            if (!copyOnWriteArraySet.isEmpty()) {
                handler.post(new bj0(this, 0));
            }
        }
    }

    public final void f(String str, boolean z) {
        if (z) {
            s36.o().g(wv6.b(str));
        } else {
            s36.o().f(wv6.b(str), (t68) null);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v16, types: [java.lang.RuntimeException] */
    /* JADX WARNING: type inference failed for: r1v38, types: [one.me.sdk.media.transformer.MediaTransformException, java.lang.RuntimeException] */
    /* JADX WARNING: type inference failed for: r8v12, types: [il8] */
    /* JADX WARNING: type inference failed for: r17v6, types: [jl8] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02c4 A[Catch:{ MediaTransformException -> 0x02ca, all -> 0x02c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0304 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0364  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0374  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0397  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x03e1 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(java.lang.String r42, java.lang.String r43, float r44, float r45, defpackage.nqb r46, boolean r47, defpackage.n2f r48) {
        /*
            r41 = this;
            r1 = r41
            r0 = r44
            r2 = r45
            r3 = r46
            ir6 r6 = defpackage.hm9.m
            r7 = 0
            if (r6 != 0) goto L_0x000e
            goto L_0x001d
        L_0x000e:
            boolean r8 = r6.c()
            if (r8 == 0) goto L_0x001d
            us7 r8 = defpackage.us7.X
            java.lang.String r9 = "ada"
            java.lang.String r10 = "transformMedia"
            r6.d(r8, r9, r10, r7)
        L_0x001d:
            java.io.File r6 = new java.io.File
            r8 = r42
            r6.<init>(r8)
            android.net.Uri r6 = android.net.Uri.fromFile(r6)
            android.content.Context r8 = r1.a
            int r9 = r3.b
            int r10 = r3.c
            int r3 = r3.d
            khe r11 = r1.l
            java.lang.Object r11 = r11.getValue()
            gl8 r11 = (defpackage.gl8) r11
            khe r11 = r11.e
            java.lang.Object r11 = r11.getValue()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            khe r12 = r1.l
            java.lang.Object r12 = r12.getValue()
            gl8 r12 = (defpackage.gl8) r12
            khe r12 = r12.f
            java.lang.Object r12 = r12.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            wz7 r13 = new wz7
            r14 = 12
            r15 = r48
            r13.<init>(r14, r15)
            if (r43 == 0) goto L_0x006c
            java.lang.CharSequence r14 = defpackage.w9e.b1(r43)
            java.lang.String r14 = r14.toString()
            goto L_0x006d
        L_0x006c:
            r14 = r7
        L_0x006d:
            if (r6 == 0) goto L_0x0439
            if (r14 == 0) goto L_0x0439
            int r15 = r14.length()
            if (r15 == 0) goto L_0x0439
            r15 = 0
            int r15 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r15 < 0) goto L_0x0418
            r15 = 1065353216(0x3f800000, float:1.0)
            int r15 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r15 <= 0) goto L_0x0418
            int r15 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r15 <= 0) goto L_0x0418
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = (double) r2
            int r4 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x0418
            if (r9 <= 0) goto L_0x040a
            if (r10 <= 0) goto L_0x040a
            pl8 r4 = new pl8
            el8 r5 = new el8
            r5.<init>(r8)
            r5.b = r6
            r5.c = r14
            r5.d = r9
            r5.e = r10
            r5.f = r3
            r3 = r47
            r5.i = r3
            r5.h = r2
            r5.g = r0
            r5.j = r12
            r5.k = r11
            r5.l = r13
            r4.<init>((defpackage.el8) r5)
            java.lang.String r2 = "execute, failed to transform media"
            ml8 r3 = new ml8
            r3.<init>(r5)
            va8 r6 = new va8
            java.lang.Object r0 = r4.o
            android.content.Context r0 = (android.content.Context) r0
            r8 = 0
            r6.<init>((android.content.Context) r0, (int) r8)
            android.net.Uri r5 = r5.b
            java.lang.String r0 = "Failed to find a suitable extractor for "
            ta8 r10 = r6.t(r5)     // Catch:{ all -> 0x0138 }
            if (r10 == 0) goto L_0x0141
            kxf r0 = new kxf     // Catch:{ all -> 0x00ed }
            r0.<init>(r10)     // Catch:{ all -> 0x00ed }
            java.lang.Object r11 = r0.a     // Catch:{ all -> 0x00ed }
            java.util.ArrayList r11 = (java.util.ArrayList) r11     // Catch:{ all -> 0x00ed }
            qy5[] r11 = defpackage.nd7.G(r11)     // Catch:{ all -> 0x00ed }
            int r12 = r11.length     // Catch:{ all -> 0x00ed }
            r13 = 0
        L_0x00dd:
            if (r13 >= r12) goto L_0x00f0
            r14 = r11[r13]     // Catch:{ all -> 0x00ed }
            i63 r15 = r14.A     // Catch:{ all -> 0x00ed }
            boolean r15 = defpackage.i63.g(r15)     // Catch:{ all -> 0x00ed }
            if (r15 == 0) goto L_0x00ea
            goto L_0x00f1
        L_0x00ea:
            r14 = 1
            int r13 = r13 + r14
            goto L_0x00dd
        L_0x00ed:
            r0 = move-exception
            r11 = r0
            goto L_0x013a
        L_0x00f0:
            r14 = r7
        L_0x00f1:
            ra8 r12 = new ra8     // Catch:{ all -> 0x00ed }
            java.lang.Object r13 = r0.X     // Catch:{ all -> 0x00ed }
            v1d r13 = (defpackage.v1d) r13     // Catch:{ all -> 0x00ed }
            if (r13 == 0) goto L_0x0102
            long r15 = r13.f()     // Catch:{ all -> 0x00ed }
            java.lang.Long r13 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x00ed }
            goto L_0x0103
        L_0x0102:
            r13 = r7
        L_0x0103:
            if (r13 == 0) goto L_0x010a
            long r15 = r13.longValue()     // Catch:{ all -> 0x00ed }
            goto L_0x010f
        L_0x010a:
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x010f:
            if (r14 == 0) goto L_0x0113
            r13 = 1
            goto L_0x0114
        L_0x0113:
            r13 = 0
        L_0x0114:
            java.lang.Object r14 = r0.c     // Catch:{ all -> 0x00ed }
            java.util.ArrayList r14 = (java.util.ArrayList) r14     // Catch:{ all -> 0x00ed }
            qy5[] r14 = defpackage.nd7.G(r14)     // Catch:{ all -> 0x00ed }
            java.lang.Object r0 = r0.o     // Catch:{ all -> 0x00ed }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x00ed }
            qy5[] r0 = defpackage.nd7.G(r0)     // Catch:{ all -> 0x00ed }
            r42 = r12
            r43 = r15
            r45 = r13
            r46 = r11
            r47 = r14
            r48 = r0
            r42.<init>(r43, r45, r46, r47, r48)     // Catch:{ all -> 0x00ed }
            defpackage.v3c.i(r10, r7)     // Catch:{ all -> 0x0138 }
            goto L_0x026f
        L_0x0138:
            r0 = move-exception
            goto L_0x0153
        L_0x013a:
            throw r11     // Catch:{ all -> 0x013b }
        L_0x013b:
            r0 = move-exception
            r12 = r0
            defpackage.v3c.i(r10, r11)     // Catch:{ all -> 0x0138 }
            throw r12     // Catch:{ all -> 0x0138 }
        L_0x0141:
            one.me.sdk.media.transformer.impl.MediaInfoRetriever$DexiExtractorNotFoundException r10 = new one.me.sdk.media.transformer.impl.MediaInfoRetriever$DexiExtractorNotFoundException     // Catch:{ all -> 0x0138 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0138 }
            r11.<init>(r0)     // Catch:{ all -> 0x0138 }
            r11.append(r5)     // Catch:{ all -> 0x0138 }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x0138 }
            r10.<init>(r0)     // Catch:{ all -> 0x0138 }
            throw r10     // Catch:{ all -> 0x0138 }
        L_0x0153:
            java.lang.Object r10 = r6.c
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r11 = "Failed to retrieve media info"
            defpackage.hm9.p(r10, r11, r0)
            java.lang.String r0 = "mime"
            java.lang.String r11 = "durationUs"
            android.media.MediaExtractor r12 = new android.media.MediaExtractor     // Catch:{ all -> 0x0262 }
            r12.<init>()     // Catch:{ all -> 0x0262 }
            java.lang.Object r6 = r6.b     // Catch:{ all -> 0x0260 }
            android.content.Context r6 = (android.content.Context) r6     // Catch:{ all -> 0x0260 }
            r12.setDataSource(r6, r5, r7)     // Catch:{ all -> 0x0260 }
            int r5 = r12.getTrackCount()     // Catch:{ all -> 0x0260 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x019a }
            r6.<init>()     // Catch:{ all -> 0x019a }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x019a }
            r13.<init>()     // Catch:{ all -> 0x019a }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x019a }
            r14.<init>()     // Catch:{ all -> 0x019a }
            r16 = r7
            r15 = 0
        L_0x0182:
            if (r15 >= r5) goto L_0x01da
            android.media.MediaFormat r8 = r12.getTrackFormat(r15)     // Catch:{ all -> 0x01d1 }
            qy5 r9 = defpackage.j47.t(r8)     // Catch:{ all -> 0x019a }
            java.lang.String r17 = r8.getString(r0)     // Catch:{ all -> 0x019a }
            boolean r17 = defpackage.ia9.k(r17)     // Catch:{ all -> 0x019a }
            if (r17 == 0) goto L_0x019d
            r6.add(r9)     // Catch:{ all -> 0x019a }
            goto L_0x01ae
        L_0x019a:
            r0 = move-exception
            goto L_0x0250
        L_0x019d:
            java.lang.String r17 = r8.getString(r0)     // Catch:{ all -> 0x019a }
            boolean r17 = defpackage.ia9.h(r17)     // Catch:{ all -> 0x019a }
            if (r17 == 0) goto L_0x01ab
            r13.add(r9)     // Catch:{ all -> 0x019a }
            goto L_0x01ae
        L_0x01ab:
            r14.add(r9)     // Catch:{ all -> 0x019a }
        L_0x01ae:
            boolean r9 = r8.containsKey(r11)     // Catch:{ all -> 0x019a }
            if (r9 == 0) goto L_0x01d1
            if (r16 == 0) goto L_0x01c5
            r44 = r0
            long r0 = r16.longValue()     // Catch:{ all -> 0x019a }
            long r8 = r8.getLong(r11)     // Catch:{ all -> 0x019a }
            long r0 = java.lang.Math.max(r0, r8)     // Catch:{ all -> 0x019a }
            goto L_0x01cb
        L_0x01c5:
            r44 = r0
            long r0 = r8.getLong(r11)     // Catch:{ all -> 0x019a }
        L_0x01cb:
            java.lang.Long r16 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x019a }
        L_0x01cf:
            r1 = 1
            goto L_0x01d4
        L_0x01d1:
            r44 = r0
            goto L_0x01cf
        L_0x01d4:
            int r15 = r15 + r1
            r1 = r41
            r0 = r44
            goto L_0x0182
        L_0x01da:
            r1 = 1
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x019a }
            r0 = r0 ^ r1
            if (r0 != 0) goto L_0x01f3
            boolean r0 = r13.isEmpty()     // Catch:{ all -> 0x019a }
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x01f1
            boolean r0 = r14.isEmpty()     // Catch:{ all -> 0x019a }
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x01f1
            goto L_0x01f3
        L_0x01f1:
            r0 = r7
            goto L_0x024c
        L_0x01f3:
            java.util.Iterator r0 = r6.iterator()     // Catch:{ all -> 0x019a }
        L_0x01f7:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x019a }
            if (r1 == 0) goto L_0x020d
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x019a }
            r5 = r1
            qy5 r5 = (defpackage.qy5) r5     // Catch:{ all -> 0x019a }
            i63 r5 = r5.A     // Catch:{ all -> 0x019a }
            boolean r5 = defpackage.i63.g(r5)     // Catch:{ all -> 0x019a }
            if (r5 == 0) goto L_0x01f7
            goto L_0x020e
        L_0x020d:
            r1 = r7
        L_0x020e:
            qy5 r1 = (defpackage.qy5) r1     // Catch:{ all -> 0x019a }
            ra8 r0 = new ra8     // Catch:{ all -> 0x019a }
            if (r16 == 0) goto L_0x021b
            long r8 = r16.longValue()     // Catch:{ all -> 0x019a }
            r18 = r8
            goto L_0x0220
        L_0x021b:
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0220:
            if (r1 == 0) goto L_0x0226
            r1 = 0
            r20 = 1
            goto L_0x0229
        L_0x0226:
            r1 = 0
            r20 = 0
        L_0x0229:
            qy5[] r5 = new defpackage.qy5[r1]     // Catch:{ all -> 0x019a }
            java.lang.Object[] r5 = r6.toArray(r5)     // Catch:{ all -> 0x019a }
            r21 = r5
            qy5[] r21 = (defpackage.qy5[]) r21     // Catch:{ all -> 0x019a }
            qy5[] r5 = new defpackage.qy5[r1]     // Catch:{ all -> 0x019a }
            java.lang.Object[] r5 = r13.toArray(r5)     // Catch:{ all -> 0x019a }
            r22 = r5
            qy5[] r22 = (defpackage.qy5[]) r22     // Catch:{ all -> 0x019a }
            qy5[] r5 = new defpackage.qy5[r1]     // Catch:{ all -> 0x019a }
            java.lang.Object[] r1 = r14.toArray(r5)     // Catch:{ all -> 0x019a }
            r23 = r1
            qy5[] r23 = (defpackage.qy5[]) r23     // Catch:{ all -> 0x019a }
            r17 = r0
            r17.<init>(r18, r20, r21, r22, r23)     // Catch:{ all -> 0x019a }
        L_0x024c:
            r12.release()
            goto L_0x0259
        L_0x0250:
            java.lang.String r1 = "Failed to extract media"
            defpackage.hm9.p(r10, r1, r0)     // Catch:{ all -> 0x025b }
            r12.release()
            r0 = r7
        L_0x0259:
            r12 = r0
            goto L_0x026f
        L_0x025b:
            r0 = move-exception
            r12.release()
            throw r0
        L_0x0260:
            r0 = move-exception
            goto L_0x0264
        L_0x0262:
            r0 = move-exception
            r12 = r7
        L_0x0264:
            java.lang.String r1 = "Failed to open media extractor"
            defpackage.hm9.p(r10, r1, r0)
            if (r12 == 0) goto L_0x026e
            r12.release()
        L_0x026e:
            r12 = r7
        L_0x026f:
            if (r12 == 0) goto L_0x0280
            ll8 r0 = r3.c
            long r5 = java.lang.System.currentTimeMillis()
            r0.a = r5
            ll8 r0 = r3.c
            java.util.concurrent.atomic.AtomicReference r0 = r0.b
            r0.set(r12)
        L_0x0280:
            java.lang.Object r0 = r4.b
            java.lang.String r0 = (java.lang.String) r0
            ir6 r1 = defpackage.hm9.m
            if (r1 != 0) goto L_0x0289
            goto L_0x02a2
        L_0x0289:
            boolean r5 = r1.c()
            if (r5 == 0) goto L_0x02a2
            us7 r5 = defpackage.us7.X
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "execute, "
            r6.<init>(r8)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            r1.d(r5, r0, r6, r7)
        L_0x02a2:
            tb8 r0 = r4.t(r12)     // Catch:{ MediaTransformException -> 0x02cf, all -> 0x02cc }
            lv4 r0 = r4.q(r0)     // Catch:{ MediaTransformException -> 0x02cf, all -> 0x02cc }
            mv4 r1 = new mv4     // Catch:{ MediaTransformException -> 0x02cf, all -> 0x02cc }
            r5 = 0
            lv4[] r6 = new defpackage.lv4[r5]     // Catch:{ MediaTransformException -> 0x02ca, all -> 0x02c8 }
            r1.<init>(r0, r6)     // Catch:{ MediaTransformException -> 0x02ca, all -> 0x02c8 }
            dd3 r0 = r4.p(r3, r1)     // Catch:{ MediaTransformException -> 0x02ca, all -> 0x02c8 }
            khe r1 = defpackage.bi4.c     // Catch:{ MediaTransformException -> 0x02ca, all -> 0x02c8 }
            lr1 r1 = new lr1     // Catch:{ MediaTransformException -> 0x02ca, all -> 0x02c8 }
            r6 = 5
            r1.<init>(r4, r3, r0, r6)     // Catch:{ MediaTransformException -> 0x02ca, all -> 0x02c8 }
            boolean r1 = defpackage.br7.b0(r1)     // Catch:{ MediaTransformException -> 0x02ca, all -> 0x02c8 }
            if (r1 != 0) goto L_0x02ee
            r4.w(r3, r0)     // Catch:{ MediaTransformException -> 0x02ca, all -> 0x02c8 }
            goto L_0x02ee
        L_0x02c8:
            r0 = move-exception
            goto L_0x02d2
        L_0x02ca:
            r0 = move-exception
            goto L_0x02e4
        L_0x02cc:
            r0 = move-exception
            r5 = 0
            goto L_0x02d2
        L_0x02cf:
            r0 = move-exception
            r5 = 0
            goto L_0x02e4
        L_0x02d2:
            java.lang.Object r1 = r4.b
            java.lang.String r1 = (java.lang.String) r1
            defpackage.hm9.p(r1, r2, r0)
            one.me.sdk.media.transformer.MediaTransformException r1 = new one.me.sdk.media.transformer.MediaTransformException
            java.lang.String r2 = "Failed to transform media"
            r1.<init>(r2, r0)
            r3.a(r1)
            goto L_0x02ee
        L_0x02e4:
            java.lang.Object r1 = r4.b
            java.lang.String r1 = (java.lang.String) r1
            defpackage.hm9.p(r1, r2, r0)
            r3.a(r0)
        L_0x02ee:
            long r11 = java.lang.System.currentTimeMillis()
            java.util.concurrent.atomic.AtomicReference r0 = r3.f
            java.lang.Object r0 = r0.get()
            v85 r0 = (defpackage.v85) r0
            java.util.concurrent.atomic.AtomicReference r1 = r3.g
            java.lang.Object r1 = r1.get()
            one.me.sdk.media.transformer.MediaTransformException r1 = (one.me.sdk.media.transformer.MediaTransformException) r1
            if (r0 == 0) goto L_0x035a
            if (r1 != 0) goto L_0x035a
            long r1 = r3.b
            r18 = r1
            el8 r1 = r3.a
            r22 = r1
            ll8 r1 = r3.c
            r23 = r1
            long r1 = r0.a
            r24 = r1
            long r1 = r0.b
            r26 = r1
            int r1 = r0.o
            r28 = r1
            java.lang.String r1 = r0.f
            r29 = r1
            int r1 = r0.d
            r30 = r1
            int r1 = r0.e
            r31 = r1
            int r1 = r0.c
            r32 = r1
            java.lang.String r1 = r0.m
            r33 = r1
            int r1 = r0.k
            r34 = r1
            int r1 = r0.j
            r35 = r1
            int r1 = r0.h
            r36 = r1
            int r1 = r3.e
            r39 = r1
            int r1 = r3.d
            r37 = r1
            int r1 = r0.l
            r38 = r1
            i63 r0 = r0.i
            boolean r40 = defpackage.i63.g(r0)
            jl8 r0 = new jl8
            r17 = r0
            r20 = r11
            r17.<init>(r18, r20, r22, r23, r24, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            goto L_0x0370
        L_0x035a:
            il8 r0 = new il8
            long r9 = r3.b
            el8 r13 = r3.a
            ll8 r14 = r3.c
            if (r1 != 0) goto L_0x036b
            one.me.sdk.media.transformer.MediaTransformException r1 = new one.me.sdk.media.transformer.MediaTransformException
            java.lang.String r2 = "Unknown media transform error occured"
            r1.<init>(r2, r7)
        L_0x036b:
            r15 = r1
            r8 = r0
            r8.<init>(r9, r11, r13, r14, r15)
        L_0x0370:
            boolean r1 = r0 instanceof defpackage.jl8
            if (r1 == 0) goto L_0x0397
            java.lang.Object r2 = r4.b
            java.lang.String r2 = (java.lang.String) r2
            ir6 r3 = defpackage.hm9.m
            if (r3 != 0) goto L_0x037d
            goto L_0x03df
        L_0x037d:
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x03df
            us7 r4 = defpackage.us7.X
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "execute, completed with "
            r6.<init>(r8)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r3.d(r4, r2, r6, r7)
            goto L_0x03df
        L_0x0397:
            boolean r2 = r0 instanceof defpackage.il8
            if (r2 == 0) goto L_0x0404
            java.lang.Object r2 = r4.b
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "execute, failed with "
            r3.<init>(r6)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r6 = r0
            il8 r6 = (defpackage.il8) r6
            one.me.sdk.media.transformer.MediaTransformException r6 = r6.e
            defpackage.hm9.p(r2, r3, r6)
            java.lang.Object r2 = r4.b
            java.lang.String r2 = (java.lang.String) r2
            ir6 r3 = defpackage.hm9.m
            if (r3 != 0) goto L_0x03be
            goto L_0x03cb
        L_0x03be:
            boolean r6 = r3.c()
            if (r6 == 0) goto L_0x03cb
            us7 r6 = defpackage.us7.X
            java.lang.String r8 = "cleanup"
            r3.d(r6, r2, r8, r7)
        L_0x03cb:
            java.io.File r2 = new java.io.File
            java.lang.Object r3 = r4.c
            el8 r3 = (defpackage.el8) r3
            java.lang.String r3 = r3.c
            r2.<init>(r3)
            boolean r3 = r2.isFile()
            if (r3 == 0) goto L_0x03df
            r2.delete()
        L_0x03df:
            if (r1 == 0) goto L_0x03e3
            r4 = 1
            goto L_0x03fd
        L_0x03e3:
            boolean r1 = r0 instanceof defpackage.il8
            if (r1 == 0) goto L_0x03fe
            r1 = r41
            o45 r1 = r1.h
            ru.ok.tamtam.ExceptionHandler$HandledException r2 = new ru.ok.tamtam.ExceptionHandler$HandledException
            il8 r0 = (defpackage.il8) r0
            one.me.sdk.media.transformer.MediaTransformException r0 = r0.e
            java.lang.String r3 = "ONEME-9916"
            r4 = 1
            r2.<init>(r7, r0, r4, r3)
            cba r1 = (defpackage.cba) r1
            r1.c(r2, r4)
            r4 = r5
        L_0x03fd:
            return r4
        L_0x03fe:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0404:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x040a:
            one.me.sdk.media.transformer.impl.IllegalMediaTransformException r0 = new one.me.sdk.media.transformer.impl.IllegalMediaTransformException
            java.lang.String r1 = "Illegal requested size="
            java.lang.String r2 = "x"
            java.lang.String r1 = defpackage.rh4.h(r1, r9, r10, r2)
            r0.<init>(r1, r7)
            throw r0
        L_0x0418:
            one.me.sdk.media.transformer.impl.IllegalMediaTransformException r1 = new one.me.sdk.media.transformer.impl.IllegalMediaTransformException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Illegal requested position range=["
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = ", "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = "]"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0, r7)
            throw r1
        L_0x0439:
            one.me.sdk.media.transformer.impl.IllegalMediaTransformException r0 = new one.me.sdk.media.transformer.impl.IllegalMediaTransformException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Illegal input/output="
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r2 = "/"
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ada.g(java.lang.String, java.lang.String, float, float, nqb, boolean, n2f):boolean");
    }
}
