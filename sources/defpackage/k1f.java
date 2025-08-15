package defpackage;

import android.util.SparseArray;
import androidx.media3.transformer.ExportException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: k1f  reason: default package */
public final class k1f implements wt {
    public final int a;
    public final lv4 b;
    public final dd3 c;
    public final f1f d;
    public final yb9 e;
    public final zff f;
    public final x99 g;
    public final xw0 h;
    public long i;
    public final /* synthetic */ l1f j;

    public k1f(l1f l1f, int i2, dd3 dd3, f1f f1f, yb9 yb9, zff zff, x99 x99, xw0 xw0) {
        this.j = l1f;
        this.a = i2;
        this.b = (lv4) ((mv4) dd3.a.get(i2)).a.get(0);
        this.c = dd3;
        this.d = f1f;
        this.e = yb9;
        this.f = zff;
        this.g = x99;
        this.h = xw0;
    }

    public final void a(qy5 qy5) {
        qy5 qy52;
        boolean z;
        qy5 qy53 = qy5;
        int w = np8.w(qy53.n);
        l1f l1f = this.j;
        boolean z2 = true;
        fm9.k(((yqc) ((SparseArray) l1f.m.b).get(w)) == null);
        die die = l1f.m;
        SparseArray sparseArray = ((i1f) ((ArrayList) die.a).get(this.a)).a;
        fm9.k(oaf.l(sparseArray, w));
        qy5 qy54 = (qy5) sparseArray.get(w);
        String str = qy53.n;
        boolean h2 = ia9.h(str);
        dd3 dd3 = this.c;
        if (h2) {
            die.J(1, new z60(qy54, qy5, this.d, this.b, dd3.c.a, this.e, l1f.d, l1f.o, this.g));
            return;
        }
        if (ia9.k(str)) {
            boolean z3 = this.d.d == 1;
            i63 i63 = qy54.A;
            if (i63 == null || !i63.e()) {
                i63 = i63.h;
            }
            if (z3 && i63.g(i63)) {
                i63 = i63.h;
            }
            ny5 a2 = qy54.a();
            a2.z = i63;
            qy52 = new qy5(a2);
        } else if (ia9.i(str)) {
            ny5 a3 = qy5.a();
            i63 i632 = qy53.A;
            if (i632 == null || !i632.e()) {
                i632 = i63.h;
            }
            a3.z = i632;
            qy52 = new qy5(a3);
        } else {
            throw ExportException.e(new IllegalArgumentException("assetLoaderOutputFormat has to have a audio, video or image mimetype."));
        }
        qy5 qy55 = qy52;
        crd crd = dd3.b;
        zw6 zw6 = dd3.c.b;
        gte gte = new gte(3, (Object) this);
        ArrayList arrayList = (ArrayList) die.a;
        if (arrayList.size() < 2) {
            z = false;
        } else {
            int i2 = 0;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (oaf.l(((i1f) arrayList.get(i3)).a, 2)) {
                    i2++;
                }
            }
            if (i2 <= 1) {
                z2 = false;
            }
            z = z2;
        }
        die.J(2, new flf(l1f.a, qy55, this.d, crd, zw6, this.f, l1f.d, l1f.o, gte, this.g, this.h, l1f.h, z));
    }

    public final void b(int i2) {
        if (i2 <= 0) {
            d(ExportException.a(new IllegalStateException("AssetLoader instances must provide at least 1 track."), MultiFileUploader.MSG_TRY_UPLOAD_NEXT));
            return;
        }
        synchronized (this.j.l) {
            die die = this.j.m;
            ((i1f) ((ArrayList) die.a).get(this.a)).b = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0124, code lost:
        return r10;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b4 A[Catch:{ all -> 0x0012 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b6 A[Catch:{ all -> 0x0012 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cf A[Catch:{ all -> 0x0012 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f0 A[Catch:{ all -> 0x0012 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0113 A[Catch:{ all -> 0x0012 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0103 A[EDGE_INSN: B:56:0x0103->B:47:0x0103 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.wqc c(defpackage.qy5 r10) {
        /*
            r9 = this;
            l1f r0 = r9.j
            java.lang.Object r0 = r0.l
            monitor-enter(r0)
            l1f r1 = r9.j     // Catch:{ all -> 0x0012 }
            die r1 = r1.m     // Catch:{ all -> 0x0012 }
            boolean r1 = r1.z()     // Catch:{ all -> 0x0012 }
            r2 = 0
            if (r1 != 0) goto L_0x0015
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            return r2
        L_0x0012:
            r9 = move-exception
            goto L_0x0125
        L_0x0015:
            java.lang.String r1 = r10.n     // Catch:{ all -> 0x0012 }
            int r1 = defpackage.np8.w(r1)     // Catch:{ all -> 0x0012 }
            l1f r3 = r9.j     // Catch:{ all -> 0x0012 }
            die r3 = r3.m     // Catch:{ all -> 0x0012 }
            java.lang.Object r3 = r3.c     // Catch:{ all -> 0x0012 }
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch:{ all -> 0x0012 }
            boolean r4 = defpackage.oaf.l(r3, r1)     // Catch:{ all -> 0x0012 }
            defpackage.fm9.k(r4)     // Catch:{ all -> 0x0012 }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x0012 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0012 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0012 }
            r4 = 0
            if (r3 == 0) goto L_0x006a
            l1f r3 = r9.j     // Catch:{ all -> 0x0012 }
            die r3 = r3.m     // Catch:{ all -> 0x0012 }
            boolean r5 = r3.z()     // Catch:{ all -> 0x0012 }
            java.lang.String r6 = "Primary track can only be queried after all tracks are added."
            defpackage.fm9.j(r6, r5)     // Catch:{ all -> 0x0012 }
            r5 = r4
        L_0x0045:
            java.lang.Object r6 = r3.a     // Catch:{ all -> 0x0012 }
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ all -> 0x0012 }
            int r7 = r6.size()     // Catch:{ all -> 0x0012 }
            if (r5 >= r7) goto L_0x0061
            java.lang.Object r6 = r6.get(r5)     // Catch:{ all -> 0x0012 }
            i1f r6 = (defpackage.i1f) r6     // Catch:{ all -> 0x0012 }
            android.util.SparseArray r6 = r6.a     // Catch:{ all -> 0x0012 }
            boolean r6 = defpackage.oaf.l(r6, r1)     // Catch:{ all -> 0x0012 }
            if (r6 == 0) goto L_0x005e
            goto L_0x0062
        L_0x005e:
            int r5 = r5 + 1
            goto L_0x0045
        L_0x0061:
            r5 = -1
        L_0x0062:
            int r3 = r9.a     // Catch:{ all -> 0x0012 }
            if (r5 != r3) goto L_0x006d
            r9.a(r10)     // Catch:{ all -> 0x0012 }
            goto L_0x006d
        L_0x006a:
            r9.e(r1)     // Catch:{ all -> 0x0012 }
        L_0x006d:
            l1f r3 = r9.j     // Catch:{ all -> 0x0012 }
            die r3 = r3.m     // Catch:{ all -> 0x0012 }
            java.lang.Object r3 = r3.b     // Catch:{ all -> 0x0012 }
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch:{ all -> 0x0012 }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x0012 }
            yqc r3 = (defpackage.yqc) r3     // Catch:{ all -> 0x0012 }
            if (r3 != 0) goto L_0x007f
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            return r2
        L_0x007f:
            lv4 r2 = r9.b     // Catch:{ all -> 0x0012 }
            int r5 = r9.a     // Catch:{ all -> 0x0012 }
            sf6 r10 = r3.j(r2, r10, r5)     // Catch:{ all -> 0x0012 }
            j1f r2 = new j1f     // Catch:{ all -> 0x0012 }
            r2.<init>(r9, r1, r10)     // Catch:{ all -> 0x0012 }
            l1f r5 = r9.j     // Catch:{ all -> 0x0012 }
            java.util.ArrayList r5 = r5.k     // Catch:{ all -> 0x0012 }
            int r6 = r9.a     // Catch:{ all -> 0x0012 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x0012 }
            e6d r5 = (defpackage.e6d) r5     // Catch:{ all -> 0x0012 }
            r5.getClass()     // Catch:{ all -> 0x0012 }
            r6 = 1
            r7 = 2
            if (r1 == r6) goto L_0x00a4
            if (r1 != r7) goto L_0x00a2
            goto L_0x00a4
        L_0x00a2:
            r8 = r4
            goto L_0x00a5
        L_0x00a4:
            r8 = r6
        L_0x00a5:
            defpackage.fm9.f(r8)     // Catch:{ all -> 0x0012 }
            java.util.HashMap r5 = r5.i     // Catch:{ all -> 0x0012 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0012 }
            java.lang.Object r8 = r5.get(r8)     // Catch:{ all -> 0x0012 }
            if (r8 != 0) goto L_0x00b6
            r8 = r6
            goto L_0x00b7
        L_0x00b6:
            r8 = r4
        L_0x00b7:
            defpackage.fm9.f(r8)     // Catch:{ all -> 0x0012 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0012 }
            r5.put(r8, r2)     // Catch:{ all -> 0x0012 }
            l1f r2 = r9.j     // Catch:{ all -> 0x0012 }
            die r2 = r2.m     // Catch:{ all -> 0x0012 }
            java.lang.Object r2 = r2.o     // Catch:{ all -> 0x0012 }
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch:{ all -> 0x0012 }
            boolean r5 = defpackage.oaf.l(r2, r1)     // Catch:{ all -> 0x0012 }
            if (r5 == 0) goto L_0x00da
            java.lang.Object r5 = r2.get(r1)     // Catch:{ all -> 0x0012 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x0012 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x0012 }
            int r6 = r6 + r5
        L_0x00da:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0012 }
            r2.put(r1, r5)     // Catch:{ all -> 0x0012 }
            l1f r2 = r9.j     // Catch:{ all -> 0x0012 }
            die r2 = r2.m     // Catch:{ all -> 0x0012 }
            r5 = r4
        L_0x00e6:
            java.lang.Object r6 = r2.a     // Catch:{ all -> 0x0012 }
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ all -> 0x0012 }
            int r8 = r6.size()     // Catch:{ all -> 0x0012 }
            if (r4 >= r8) goto L_0x0103
            java.lang.Object r6 = r6.get(r4)     // Catch:{ all -> 0x0012 }
            i1f r6 = (defpackage.i1f) r6     // Catch:{ all -> 0x0012 }
            android.util.SparseArray r6 = r6.a     // Catch:{ all -> 0x0012 }
            boolean r6 = defpackage.oaf.l(r6, r1)     // Catch:{ all -> 0x0012 }
            if (r6 == 0) goto L_0x0100
            int r5 = r5 + 1
        L_0x0100:
            int r4 = r4 + 1
            goto L_0x00e6
        L_0x0103:
            java.lang.Object r2 = r2.o     // Catch:{ all -> 0x0012 }
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch:{ all -> 0x0012 }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ all -> 0x0012 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0012 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0012 }
            if (r1 != r5) goto L_0x0123
            l1f r1 = r9.j     // Catch:{ all -> 0x0012 }
            r1.g()     // Catch:{ all -> 0x0012 }
            l1f r9 = r9.j     // Catch:{ all -> 0x0012 }
            bie r9 = r9.j     // Catch:{ all -> 0x0012 }
            zhe r9 = r9.a(r7, r3)     // Catch:{ all -> 0x0012 }
            r9.b()     // Catch:{ all -> 0x0012 }
        L_0x0123:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            return r10
        L_0x0125:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k1f.c(qy5):wqc");
    }

    public final void d(ExportException exportException) {
        l1f l1f = this.j;
        l1f.g();
        l1f.j.b(exportException, 4, 2, 0).b();
    }

    public final void e(int i2) {
        l1f l1f = this.j;
        fm9.k(((yqc) ((SparseArray) l1f.m.b).get(i2)) == null);
        die die = l1f.m;
        SparseArray sparseArray = ((i1f) ((ArrayList) die.a).get(this.a)).a;
        fm9.k(oaf.l(sparseArray, i2));
        die.J(i2, new j05((qy5) sparseArray.get(i2), this.d, l1f.o, this.g, l1f.h));
    }

    public final void f(long j2) {
    }

    public final boolean g(int i2, qy5 qy5) {
        boolean h2;
        int w = np8.w(qy5.n);
        synchronized (this.j.l) {
            try {
                die die = this.j.m;
                int i3 = this.a;
                die.getClass();
                int w2 = np8.w(qy5.n);
                SparseArray sparseArray = ((i1f) ((ArrayList) die.a).get(i3)).a;
                boolean z = true;
                fm9.k(!oaf.l(sparseArray, w2));
                sparseArray.put(w2, qy5);
                if (this.j.m.z()) {
                    die die2 = this.j.m;
                    int i4 = 0;
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        ArrayList arrayList = (ArrayList) die2.a;
                        if (i4 >= arrayList.size()) {
                            break;
                        }
                        SparseArray sparseArray2 = ((i1f) arrayList.get(i4)).a;
                        if (oaf.l(sparseArray2, 1)) {
                            i5 = 1;
                        }
                        if (sparseArray2.indexOfKey(2) >= 0) {
                            i6 = 1;
                        }
                        i4++;
                    }
                    int i7 = i5 + i6;
                    hj9 hj9 = this.j.o;
                    if (hj9.r != 2) {
                        fm9.j("The track count cannot be changed after adding track formats.", hj9.e.size() == 0);
                        hj9.w = i7;
                    }
                    ((AtomicInteger) this.g.X).set(i7);
                }
                h2 = h(i2, qy5);
                if (!h2 && np8.w(qy5.n) == 2) {
                    np8.C(this.j.o, this.b.g.b, qy5);
                }
                SparseArray sparseArray3 = (SparseArray) this.j.m.c;
                if (oaf.l(sparseArray3, w)) {
                    if (h2 != ((Boolean) sparseArray3.get(w)).booleanValue()) {
                        z = false;
                    }
                    fm9.k(z);
                } else {
                    sparseArray3.put(w, Boolean.valueOf(h2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h2;
    }

    public final boolean h(int i2, qy5 qy5) {
        boolean z = (i2 & 1) != 0;
        int w = np8.w(qy5.n);
        if (!z) {
            return true;
        }
        l1f l1f = this.j;
        if (w == 1) {
            return np8.H(qy5, this.c, this.a, this.d, l1f.d, l1f.o);
        }
        if (w == 2) {
            if (np8.I(qy5, this.c, this.a, this.d, l1f.d, l1f.o)) {
                return true;
            }
            db8 db8 = this.b.a.e;
            if (db8.a > 0 && !db8.g) {
                return true;
            }
        }
        return false;
    }
}
