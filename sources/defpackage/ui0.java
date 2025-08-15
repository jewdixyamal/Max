package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.media.ImageWriter;
import android.text.Spannable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: ui0  reason: default package */
public final /* synthetic */ class ui0 implements grd, wu, qj3, m87, jm7, km7, u98, ri8, b66, ehe {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ ui0(int i, Object obj, Object obj2, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
        this.o = obj2;
    }

    public Object a() {
        ((t8f) this.c).d.a((hc0) this.o, this.b + 1, false);
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [qpd, java.util.Map] */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, s82] */
    public void accept(Object obj) {
        switch (this.a) {
            case 2:
                u82 u82 = (u82) obj;
                ((p82) this.c).getClass();
                ? qpd = new qpd(0);
                for (Long l : (List) this.o) {
                    ? obj2 = new Object();
                    obj2.b = l.longValue();
                    obj2.a = this.b;
                    qpd.put(l, new t82(obj2));
                }
                u82.R.putAll(qpd);
                return;
            case 3:
                u82 u822 = (u82) obj;
                w82 a2 = ((x82) this.c).a();
                a2.a = this.b;
                x82 a3 = a2.a();
                HashSet hashSet = b10.D0;
                Set set = (Set) this.o;
                if (tpa.f(hashSet, set)) {
                    u822.q = a3;
                    return;
                } else if (tpa.f(b10.E0, set)) {
                    u822.r = a3;
                    return;
                } else if (tpa.f(b10.F0, set)) {
                    u822.s = a3;
                    return;
                } else if (tpa.f(b10.G0, set)) {
                    u822.t = a3;
                    return;
                } else if (tpa.f(b10.H0, set)) {
                    u822.u = a3;
                    return;
                } else if (tpa.f(b10.I0, set)) {
                    u822.v = a3;
                    return;
                } else if (tpa.f(b10.J0, set)) {
                    u822.w = a3;
                    return;
                } else {
                    return;
                }
            default:
                yqe yqe = (yqe) obj;
                int ordinal = ((lk7) this.o).ordinal();
                Spannable spannable = (Spannable) this.c;
                int i = this.b;
                if (ordinal == 1) {
                    spannable.setSpan(new ti6(yqe.c, i), yqe.a, yqe.b, 33);
                    return;
                } else if (ordinal == 2) {
                    spannable.setSpan(new cq0(yqe.c, i), yqe.a, yqe.b, 33);
                    return;
                } else if (ordinal == 3) {
                    spannable.setSpan(new cmb(yqe.c, i), yqe.a, yqe.b, 33);
                    return;
                } else {
                    return;
                }
        }
    }

    public bm7 apply(Object obj) {
        ov6 ov6;
        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
        su1 su1 = (su1) this.c;
        su1.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((List) this.o).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            st1 st1 = su1.d;
            if (hasNext) {
                kz1 kz1 = (kz1) it.next();
                u40 u40 = new u40(kz1);
                pv1 pv1 = null;
                int i = kz1.c;
                if (i == 5) {
                    mag mag = st1.l;
                    if (!mag.d && !mag.c) {
                        try {
                            ov6 = (ov6) mag.b.d();
                        } catch (NoSuchElementException unused) {
                            ov6 = null;
                        }
                        if (ov6 != null) {
                            mag mag2 = st1.l;
                            mag2.getClass();
                            Image Z = ov6.Z();
                            ImageWriter imageWriter = mag2.j;
                            if (!(imageWriter == null || Z == null)) {
                                try {
                                    imageWriter.queueInputImage(Z);
                                    su6 imageInfo = ov6.getImageInfo();
                                    if (imageInfo instanceof qv1) {
                                        pv1 = ((qv1) imageInfo).a;
                                    }
                                } catch (IllegalStateException e) {
                                    e.getMessage();
                                }
                            }
                        }
                    }
                }
                if (pv1 != null) {
                    u40.h = pv1;
                } else {
                    int i2 = (su1.a != 3 || su1.f) ? (i == -1 || i == 5) ? 2 : -1 : 4;
                    if (i2 != -1) {
                        u40.c = i2;
                    }
                }
                oq0 oq0 = su1.e;
                if (oq0.b && this.b == 0 && oq0.a) {
                    mi9 b2 = mi9.b();
                    b2.j(cv1.v0(CaptureRequest.CONTROL_AE_MODE), 3);
                    u40.c(new re6(8, (Object) wma.a(b2)));
                }
                arrayList.add(f8.g(new f9(su1, 13, u40)));
                arrayList2.add(u40.d());
            } else {
                st1.z(arrayList2);
                return kq0.b(arrayList);
            }
        }
    }

    public void b(oh8 oh8) {
        si8 si8 = (si8) this.c;
        si8.getClass();
        ja8 ja8 = (ja8) this.o;
        if (TextUtils.isEmpty(ja8.a)) {
            z04.c0("onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        bm7 k = si8.f.k(oh8, zw6.n(gf7.h(ja8)));
        jn jnVar = new jn(si8, oh8, this.b);
        k.d(new h76(k, 0, jnVar), nk4.a);
    }

    public void c(qr6 qr6, int i) {
        switch (this.a) {
            case 7:
                w98 w98 = (w98) this.c;
                obd obd = w98.k;
                obd.getClass();
                int f = obd.a.f();
                int i2 = this.b;
                tb8 tb8 = (tb8) this.o;
                ga8 ga8 = w98.c;
                if (f >= 2) {
                    qr6.D0(ga8, i, i2, tb8.d(true));
                    return;
                }
                qr6.E(ga8, i, i2 + 1, tb8.d(true));
                qr6.L(ga8, i, i2);
                return;
            default:
                w98 w982 = (w98) this.c;
                w982.getClass();
                ww6 i3 = zw6.i();
                int i4 = 0;
                while (true) {
                    List list = (List) this.o;
                    if (i4 < list.size()) {
                        i3.a(((tb8) list.get(i4)).d(true));
                        i4++;
                    } else {
                        qr6.U(w982.c, i, this.b, new pu0(i3.j()));
                        return;
                    }
                }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0177 A[Catch:{ all -> 0x01dd, all -> 0x016e }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01b4 A[Catch:{ all -> 0x01dd, all -> 0x016e }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01b6 A[Catch:{ all -> 0x01dd, all -> 0x016e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(defpackage.g05 r21, int r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            if (r1 == 0) goto L_0x022e
            java.lang.Object r3 = r0.c
            j54 r3 = (defpackage.j54) r3
            eab r14 = r3.c
            r4 = r14
            oj0 r4 = (defpackage.oj0) r4
            wv6 r5 = r4.a
            r21.o0()
            ou6 r6 = r1.c
            java.lang.String r6 = r6.a
            java.lang.String r7 = "image_format"
            r4.putExtra(r7, r6)
            android.net.Uri r6 = r5.b
            r15 = 0
            if (r6 == 0) goto L_0x0029
            java.lang.String r6 = r6.toString()
            goto L_0x002a
        L_0x0029:
            r6 = r15
        L_0x002a:
            r1.v0 = r6
            java.lang.Object r6 = r0.o
            k54 r6 = (defpackage.k54) r6
            bp4 r7 = r5.t
            if (r7 != 0) goto L_0x0036
            bp4 r7 = r6.e
        L_0x0036:
            r8 = 16
            boolean r8 = defpackage.fi0.l(r2, r8)
            bp4 r9 = defpackage.bp4.a
            if (r7 == r9) goto L_0x0046
            bp4 r9 = defpackage.bp4.b
            if (r7 != r9) goto L_0x005e
            if (r8 != 0) goto L_0x005e
        L_0x0046:
            boolean r6 = r6.f
            if (r6 != 0) goto L_0x0052
            android.net.Uri r6 = r5.b
            boolean r6 = defpackage.e9f.e(r6)
            if (r6 != 0) goto L_0x005e
        L_0x0052:
            jic r6 = r5.i
            anc r5 = r5.j
            int r0 = r0.b
            int r0 = defpackage.mqd.g(r5, r6, r1, r0)
            r1.s0 = r0
        L_0x005e:
            kv6 r0 = r4.w0
            ho9 r0 = r0.v
            r0.getClass()
            int r0 = r3.h
            r21.o0()
            ou6 r5 = r1.c
            ou6 r6 = defpackage.qb4.a
            if (r5 == r6) goto L_0x0078
            boolean r5 = defpackage.fi0.b(r22)
            if (r5 == 0) goto L_0x0078
            goto L_0x022e
        L_0x0078:
            boolean r5 = r3.f
            if (r5 != 0) goto L_0x022e
            boolean r5 = defpackage.g05.m0(r21)
            if (r5 != 0) goto L_0x0084
            goto L_0x022e
        L_0x0084:
            r21.o0()
            ou6 r5 = r1.c
            ou6 r6 = defpackage.qb4.c
            boolean r5 = defpackage.tpa.f(r5, r6)
            java.lang.String r13 = "DecodeProducer"
            hab r12 = r3.d
            if (r5 == 0) goto L_0x00e2
            r21.o0()
            int r5 = r1.Y
            long r5 = (long) r5
            r21.o0()
            int r7 = r1.Z
            long r7 = (long) r7
            ju6 r9 = r3.e
            android.graphics.Bitmap$Config r10 = r9.a
            int r10 = defpackage.qo0.b(r10)
            long r5 = r5 * r7
            long r7 = (long) r10
            long r5 = r5 * r7
            r7 = 104857600(0x6400000, double:5.1806538E-316)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x00e2
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r21.o0()
            int r2 = r1.Y
            r21.o0()
            int r1 = r1.Z
            java.lang.String r4 = "Image is too big to attempt decoding: w = "
            java.lang.String r5 = ", h = "
            java.lang.String r6 = ", pixel config = "
            java.lang.StringBuilder r1 = defpackage.wg0.j(r4, r2, r5, r1, r6)
            android.graphics.Bitmap$Config r2 = r9.a
            r1.append(r2)
            java.lang.String r2 = ", max bitmap size = 104857600"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r12.d(r14, r13, r0, r15)
            r3.q(r0)
            goto L_0x022e
        L_0x00e2:
            r21.o0()
            ou6 r5 = r1.c
            java.lang.String r5 = r5.a
            java.lang.String r6 = "unknown"
            if (r5 != 0) goto L_0x00ef
            r10 = r6
            goto L_0x00f0
        L_0x00ef:
            r10 = r5
        L_0x00f0:
            r21.o0()
            int r5 = r1.Y
            r21.o0()
            int r7 = r1.Z
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            java.lang.String r5 = "x"
            r8.append(r5)
            r8.append(r7)
            java.lang.String r11 = r8.toString()
            int r7 = r1.s0
            java.lang.String r16 = java.lang.String.valueOf(r7)
            boolean r9 = defpackage.fi0.a(r22)
            if (r9 == 0) goto L_0x0124
            r8 = 8
            boolean r8 = defpackage.fi0.l(r2, r8)
            if (r8 != 0) goto L_0x0124
            r8 = 1
            goto L_0x0125
        L_0x0124:
            r8 = 0
        L_0x0125:
            r15 = 4
            boolean r15 = defpackage.fi0.l(r2, r15)
            wv6 r4 = r4.a
            jic r4 = r4.i
            if (r4 == 0) goto L_0x0149
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r7 = r4.a
            r6.append(r7)
            r6.append(r5)
            int r4 = r4.b
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r17 = r4
            goto L_0x014b
        L_0x0149:
            r17 = r6
        L_0x014b:
            n87 r4 = r3.g     // Catch:{ all -> 0x016e }
            monitor-enter(r4)     // Catch:{ all -> 0x016e }
            long r5 = r4.i     // Catch:{ all -> 0x0227 }
            r18 = r10
            r19 = r11
            long r10 = r4.h     // Catch:{ all -> 0x0227 }
            long r6 = r5 - r10
            monitor-exit(r4)     // Catch:{ all -> 0x016e }
            r4 = r14
            oj0 r4 = (defpackage.oj0) r4     // Catch:{ all -> 0x016e }
            wv6 r4 = r4.a     // Catch:{ all -> 0x016e }
            android.net.Uri r4 = r4.b     // Catch:{ all -> 0x016e }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x016e }
            if (r8 != 0) goto L_0x0171
            if (r15 == 0) goto L_0x0169
            goto L_0x0171
        L_0x0169:
            int r5 = r3.n(r1)     // Catch:{ all -> 0x016e }
            goto L_0x0175
        L_0x016e:
            r0 = move-exception
            goto L_0x022a
        L_0x0171:
            int r5 = r21.o()     // Catch:{ all -> 0x016e }
        L_0x0175:
            if (r8 != 0) goto L_0x017f
            if (r15 == 0) goto L_0x017a
            goto L_0x017f
        L_0x017a:
            hx6 r8 = r3.o()     // Catch:{ all -> 0x016e }
            goto L_0x0181
        L_0x017f:
            hx6 r8 = defpackage.hx6.d     // Catch:{ all -> 0x016e }
        L_0x0181:
            r12.j(r14, r13)     // Catch:{ all -> 0x016e }
            l43 r15 = r3.r(r1, r5, r8)     // Catch:{ DecodeException -> 0x01ee, Exception -> 0x01ea }
            int r4 = r1.s0     // Catch:{ Exception -> 0x01e6 }
            r5 = 1
            if (r4 == r5) goto L_0x018f
            r2 = r2 | 16
        L_0x018f:
            r4 = r3
            r5 = r15
            r10 = r18
            r11 = r19
            r20 = r2
            r2 = r12
            r12 = r17
            r1 = r13
            r13 = r16
            dx6 r4 = r4.m(r5, r6, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x01e2 }
            r2.a(r14, r1, r4)     // Catch:{ all -> 0x01e2 }
            r1 = r21
            r3.t(r1, r15, r0)     // Catch:{ all -> 0x016e }
            k54 r0 = r3.i     // Catch:{ all -> 0x016e }
            wd6 r0 = r0.j     // Catch:{ all -> 0x016e }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x016e }
            r10 = r0
            sy4 r10 = (defpackage.sy4) r10     // Catch:{ all -> 0x016e }
            if (r15 != 0) goto L_0x01b6
            r15 = 0
            goto L_0x01c8
        L_0x01b6:
            hx9 r9 = defpackage.o43.X     // Catch:{ all -> 0x016e }
            r10.f()     // Catch:{ all -> 0x016e }
            boolean r0 = r15 instanceof android.graphics.Bitmap     // Catch:{ all -> 0x016e }
            v84 r0 = new v84     // Catch:{ all -> 0x016e }
            r12 = 1
            r7 = r0
            r8 = r15
            r5 = 0
            r11 = r5
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x016e }
            r15 = r0
        L_0x01c8:
            boolean r0 = defpackage.fi0.a(r20)     // Catch:{ all -> 0x01dd }
            r3.s(r0)     // Catch:{ all -> 0x01dd }
            fi0 r0 = r3.b     // Catch:{ all -> 0x01dd }
            r2 = r20
            r0.g(r2, r15)     // Catch:{ all -> 0x01dd }
            defpackage.o43.S(r15)     // Catch:{ all -> 0x016e }
        L_0x01d9:
            defpackage.g05.d(r21)
            goto L_0x022e
        L_0x01dd:
            r0 = move-exception
            defpackage.o43.S(r15)     // Catch:{ all -> 0x016e }
            throw r0     // Catch:{ all -> 0x016e }
        L_0x01e2:
            r0 = move-exception
            r1 = r21
            goto L_0x022a
        L_0x01e6:
            r0 = move-exception
            r2 = r12
            r5 = r15
            goto L_0x0212
        L_0x01ea:
            r0 = move-exception
            r2 = r12
        L_0x01ec:
            r5 = 0
            goto L_0x0212
        L_0x01ee:
            r0 = move-exception
            r2 = r12
            r5 = 0
            r10 = r0
            g05 r0 = r10.a     // Catch:{ Exception -> 0x0210 }
            java.lang.String r11 = "ProgressiveDecoder"
            java.lang.String r12 = "%s, {uri: %s, firstEncodedBytes: %s, length: %d}"
            java.lang.String r15 = r10.getMessage()     // Catch:{ Exception -> 0x0210 }
            java.lang.String r5 = r0.m()     // Catch:{ Exception -> 0x0210 }
            int r0 = r0.o()     // Catch:{ Exception -> 0x0210 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0210 }
            java.lang.Object[] r0 = new java.lang.Object[]{r15, r4, r5, r0}     // Catch:{ Exception -> 0x0210 }
            defpackage.ta5.m(r11, r12, r0)     // Catch:{ Exception -> 0x0210 }
            throw r10     // Catch:{ Exception -> 0x0210 }
        L_0x0210:
            r0 = move-exception
            goto L_0x01ec
        L_0x0212:
            r4 = r3
            r10 = r18
            r11 = r19
            r12 = r17
            r15 = r13
            r13 = r16
            dx6 r4 = r4.m(r5, r6, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x016e }
            r2.d(r14, r15, r0, r4)     // Catch:{ all -> 0x016e }
            r3.q(r0)     // Catch:{ all -> 0x016e }
            goto L_0x01d9
        L_0x0227:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0227 }
            throw r0     // Catch:{ all -> 0x016e }
        L_0x022a:
            defpackage.g05.d(r21)
            throw r0
        L_0x022e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ui0.e(g05, int):void");
    }

    public void invoke(Object obj) {
        switch (this.a) {
            case 5:
                m3b m3b = (m3b) obj;
                m3b.getClass();
                m3b.C((o3b) this.c, (o3b) this.o, this.b);
                return;
            default:
                n3b n3b = (n3b) obj;
                int i = this.b;
                n3b.p(i);
                n3b.q((p3b) this.c, (p3b) this.o, i);
                return;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:38|(2:49|50)|51|52|53|54) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:39|40|41|42|43|44|45|46) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00ca */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00cd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00ed */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00f0 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:53:0x00f0=Splitter:B:53:0x00f0, B:43:0x00cd=Splitter:B:43:0x00cd} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(defpackage.nqd r8) {
        /*
            r7 = this;
            int r0 = r7.a
            switch(r0) {
                case 0: goto L_0x0099;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r7.c
            ede r0 = (defpackage.ede) r0
            java.util.ArrayList r1 = r0.p
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0075
            boolean r2 = r0.e()
            if (r2 == 0) goto L_0x0075
            e52 r2 = r0.n
            long r2 = r2.a
            dq0 r4 = r0.d
            r4.getClass()
            zi5 r4 = r4.a     // Catch:{ Exception -> 0x0031 }
            kk5 r4 = (defpackage.kk5) r4     // Catch:{ Exception -> 0x0031 }
            java.io.File r4 = r4.e(r2)     // Catch:{ Exception -> 0x0031 }
            java.lang.Object r4 = defpackage.pag.v(r4)     // Catch:{ Exception -> 0x0031 }
            if (r4 == 0) goto L_0x0045
            eq0 r4 = (defpackage.eq0) r4     // Catch:{ Exception -> 0x0031 }
            goto L_0x0046
        L_0x0031:
            r4 = move-exception
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = r4.getMessage()
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r3 = "dq0"
            java.lang.String r4 = "Failed to load botCommands, chatId = %d, exception message = %s"
            defpackage.hm9.m(r3, r4, r2)
        L_0x0045:
            r4 = 0
        L_0x0046:
            if (r4 != 0) goto L_0x0049
            goto L_0x0075
        L_0x0049:
            java.util.List r2 = r4.a
            java.util.Map r3 = r4.b
            y8 r4 = r0.f
            java.util.HashMap r3 = (java.util.HashMap) r3
            r4.getClass()
            if (r2 != 0) goto L_0x005b
            java.util.List r2 = java.util.Collections.emptyList()
            goto L_0x0065
        L_0x005b:
            f9 r5 = new f9
            r6 = 3
            r5.<init>(r4, r6, r3)
            java.util.ArrayList r2 = defpackage.nd7.F(r2, r5)
        L_0x0065:
            monitor-enter(r0)
            java.util.ArrayList r3 = r0.p     // Catch:{ all -> 0x0072 }
            r3.clear()     // Catch:{ all -> 0x0072 }
            java.util.ArrayList r3 = r0.p     // Catch:{ all -> 0x0072 }
            r3.addAll(r2)     // Catch:{ all -> 0x0072 }
            monitor-exit(r0)
            goto L_0x0075
        L_0x0072:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0072 }
            throw r7
        L_0x0075:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            dce r1 = r0.c()
            ece r0 = r0.e
            java.lang.Object r3 = r7.o
            java.lang.String r3 = (java.lang.String) r3
            int r7 = r7.b
            java.util.List r7 = r0.f(r3, r7, r2, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
            boolean r7 = r8.h()
            if (r7 != 0) goto L_0x0098
            r8.a(r0)
        L_0x0098:
            return
        L_0x0099:
            java.lang.Object r0 = r7.c
            qy7 r0 = (defpackage.qy7) r0
            c32 r0 = r0.i
            r0.getClass()
            java.lang.Object r0 = r7.o
            android.content.Context r0 = (android.content.Context) r0
            android.content.res.Resources r0 = r0.getResources()
            int r7 = r7.b
            java.io.InputStream r0 = r0.openRawResource(r7)
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x00e6 }
            r1.<init>()     // Catch:{ IOException -> 0x00e6 }
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r2]     // Catch:{ IOException -> 0x00e6 }
        L_0x00b9:
            r4 = 0
            int r5 = r0.read(r3, r4, r2)     // Catch:{ all -> 0x00c5 }
            r6 = -1
            if (r5 == r6) goto L_0x00c7
            r1.write(r3, r4, r5)     // Catch:{ all -> 0x00c5 }
            goto L_0x00b9
        L_0x00c5:
            r8 = move-exception
            goto L_0x00e8
        L_0x00c7:
            r0.close()     // Catch:{ IOException -> 0x00ca }
        L_0x00ca:
            r1.close()     // Catch:{ IOException -> 0x00cd }
        L_0x00cd:
            byte[] r0 = r1.toByteArray()     // Catch:{ IOException -> 0x00e6 }
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x00e6 }
            java.lang.String r2 = "UTF-8"
            r1.<init>(r0, r2)     // Catch:{ IOException -> 0x00e6 }
            wy7 r0 = new wy7     // Catch:{ IOException -> 0x00e6 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00e6 }
            xy7 r7 = new xy7
            r7.<init>(r0)
            r8.a(r7)
            return
        L_0x00e6:
            r8 = move-exception
            goto L_0x00f1
        L_0x00e8:
            if (r0 == 0) goto L_0x00ed
            r0.close()     // Catch:{ IOException -> 0x00ed }
        L_0x00ed:
            r1.close()     // Catch:{ IOException -> 0x00f0 }
        L_0x00f0:
            throw r8     // Catch:{ IOException -> 0x00e6 }
        L_0x00f1:
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            java.lang.String r8 = r8.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to read resource "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r7 = ": "
            r1.append(r7)
            r1.append(r8)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ui0.j(nqd):void");
    }

    public /* synthetic */ ui0(x82 x82, int i, jz2 jz2, Set set) {
        this.a = 3;
        this.c = x82;
        this.b = i;
        this.o = set;
    }

    public /* synthetic */ ui0(k9c k9c, List list) {
        this.a = 11;
        this.c = k9c;
        this.b = 10;
        this.o = list;
    }

    public /* synthetic */ ui0(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.o = obj2;
    }

    public /* synthetic */ ui0(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.o = obj2;
        this.b = i;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, o8f] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, o8f] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0098  */
    /* renamed from: apply  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m138apply(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            java.lang.Object r1 = r7.o
            int r2 = r7.b
            java.lang.Object r3 = r7.c
            r4 = 2
            r5 = 3
            int r7 = r7.a
            switch(r7) {
                case 11: goto L_0x00c1;
                default: goto L_0x000e;
            }
        L_0x000e:
            sq6 r8 = (defpackage.sq6) r8
            c7f r3 = (defpackage.c7f) r3
            r3.getClass()
            boolean r7 = r8.a
            r0 = 0
            v6f r1 = (defpackage.v6f) r1
            java.lang.String r3 = r8.b
            if (r7 == 0) goto L_0x0042
            if (r2 != r5) goto L_0x0021
            goto L_0x002a
        L_0x0021:
            boolean r4 = defpackage.h4f.a(r2)
            if (r4 != 0) goto L_0x002a
            r4 = 7
            if (r2 != r4) goto L_0x0042
        L_0x002a:
            java.lang.String r2 = defpackage.z7.v(r3)
            boolean r3 = defpackage.oag.t(r2)
            if (r3 != 0) goto L_0x0070
            o8f r0 = new o8f
            r0.<init>()
            r0.a = r2
            p8f r2 = new p8f
            r2.<init>(r0)
        L_0x0040:
            r0 = r2
            goto L_0x0070
        L_0x0042:
            if (r7 == 0) goto L_0x006e
            boolean r2 = defpackage.h4f.b(r2)
            if (r2 == 0) goto L_0x006e
            boolean r2 = defpackage.oag.t(r3)
            if (r2 == 0) goto L_0x0051
            goto L_0x0070
        L_0x0051:
            java.lang.String r2 = defpackage.z7.z(r3)
            boolean r4 = defpackage.oag.t(r2)
            if (r4 == 0) goto L_0x0061
            java.lang.String r2 = "c7f"
            defpackage.hm9.p(r2, r3, r0)
            goto L_0x0070
        L_0x0061:
            o8f r0 = new o8f
            r0.<init>()
            r0.a = r2
            p8f r2 = new p8f
            r2.<init>(r0)
            goto L_0x0040
        L_0x006e:
            p8f r0 = r1.h
        L_0x0070:
            if (r7 == 0) goto L_0x007d
            if (r0 == 0) goto L_0x0075
            goto L_0x007d
        L_0x0075:
            one.me.sdk.transfer.domain.UploadException r7 = new one.me.sdk.transfer.domain.UploadException
            java.lang.String r8 = "upload failed. no upload result on finished upload"
            r7.<init>(r8)
            throw r7
        L_0x007d:
            r2 = 0
            if (r7 == 0) goto L_0x0098
            java.lang.String r4 = r0.a
            boolean r4 = defpackage.oag.t(r4)
            if (r4 == 0) goto L_0x0098
            long r4 = r0.b
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0090
            goto L_0x0098
        L_0x0090:
            one.me.sdk.transfer.domain.UploadException r7 = new one.me.sdk.transfer.domain.UploadException
            java.lang.String r8 = "upload failed. token and attachId are empty"
            r7.<init>(r8)
            throw r7
        L_0x0098:
            long r4 = r8.d
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00b9
            u6f r1 = r1.b()
            r1.h = r0
            if (r7 == 0) goto L_0x00a9
            q8f r7 = defpackage.q8f.UPLOADED
            goto L_0x00ab
        L_0x00a9:
            q8f r7 = defpackage.q8f.UPLOADING
        L_0x00ab:
            r1.g = r7
            float r7 = r8.c
            r1.e = r7
            r1.f = r4
            v6f r7 = new v6f
            r7.<init>(r1)
            return r7
        L_0x00b9:
            one.me.sdk.transfer.domain.UploadException r7 = new one.me.sdk.transfer.domain.UploadException
            java.lang.String r8 = "upload failed. file has zero size"
            r7.<init>(r8)
            throw r7
        L_0x00c1:
            java.util.List r8 = (java.util.List) r8
            k9c r3 = (defpackage.k9c) r3
            r3.getClass()
            int r7 = r8.size()
            hb3 r8 = defpackage.qy9.j(r8)
            if (r7 != r2) goto L_0x00d3
            goto L_0x011b
        L_0x00d3:
            java.lang.String r7 = "k9c"
            java.lang.String r6 = "getRecentContactsOldWay"
            defpackage.hm9.m(r7, r6, new java.lang.Object[0])
            java.util.List r1 = (java.util.List) r1
            hb3 r7 = defpackage.qy9.j(r1)
            j9c r1 = new j9c
            r1.<init>(r3, r5)
            ty9 r3 = new ty9
            r3.<init>(r7, r1, r0)
            p4c r7 = new p4c
            r1 = 6
            r7.<init>(r1)
            r1 = 2147483647(0x7fffffff, float:NaN)
            qy9 r7 = r3.i(r7, r1)
            r1a[] r1 = new defpackage.r1a[r4]
            r3 = 0
            r1[r3] = r8
            r1[r0] = r7
            cz9 r7 = new cz9
            hb3 r8 = new hb3
            r8.<init>(r5, r1)
            qx7 r0 = defpackage.ft.b
            int r1 = defpackage.wq5.a
            r7.<init>((defpackage.qy9) r8, (defpackage.b66) r0, (int) r1, (int) r4)
            p4c r8 = new p4c
            r8.<init>(r4)
            xy9 r0 = new xy9
            r0.<init>(r7, r8)
            long r7 = (long) r2
            u1a r8 = r0.s(r7)
        L_0x011b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ui0.m138apply(java.lang.Object):java.lang.Object");
    }
}
