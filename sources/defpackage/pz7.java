package defpackage;

import android.view.ViewParent;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: pz7  reason: default package */
public final class pz7 implements fbb {
    public long a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public static ViewPager2 e(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            return (ViewPager2) parent;
        }
        throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005d A[Catch:{ all -> 0x002c }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f A[Catch:{ all -> 0x002c }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.ibb
            if (r0 == 0) goto L_0x0013
            r0 = r8
            ibb r0 = (defpackage.ibb) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            ibb r0 = new ibb
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            pz7 r7 = r0.X
            pz7 r0 = r0.o
            defpackage.od2.a0(r8)     // Catch:{ all -> 0x002c }
            goto L_0x0059
        L_0x002c:
            r7 = move-exception
            goto L_0x0086
        L_0x002e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0036:
            defpackage.od2.a0(r8)
            java.lang.Object r8 = r7.c     // Catch:{ all -> 0x0083 }
            je7 r8 = (defpackage.je7) r8     // Catch:{ all -> 0x0083 }
            java.lang.Object r8 = r8.getValue()     // Catch:{ all -> 0x0083 }
            iy2 r8 = (defpackage.iy2) r8     // Catch:{ all -> 0x0083 }
            long r5 = r7.a     // Catch:{ all -> 0x0083 }
            jz2 r8 = (defpackage.jz2) r8     // Catch:{ all -> 0x0083 }
            w7c r8 = r8.m(r5)     // Catch:{ all -> 0x0083 }
            r0.o = r7     // Catch:{ all -> 0x0083 }
            r0.X = r7     // Catch:{ all -> 0x0083 }
            r0.s0 = r3     // Catch:{ all -> 0x0083 }
            java.lang.Object r8 = defpackage.od2.A(r8, r0)     // Catch:{ all -> 0x0083 }
            if (r8 != r1) goto L_0x0058
            return r1
        L_0x0058:
            r0 = r7
        L_0x0059:
            e52 r8 = (defpackage.e52) r8     // Catch:{ all -> 0x002c }
            if (r8 != 0) goto L_0x005f
            r1 = r4
            goto L_0x008b
        L_0x005f:
            dbb r1 = new dbb     // Catch:{ all -> 0x002c }
            java.lang.String r2 = r8.q()     // Catch:{ all -> 0x002c }
            iqe r3 = new iqe     // Catch:{ all -> 0x002c }
            r3.<init>(r2)     // Catch:{ all -> 0x002c }
            r1.<init>(r3)     // Catch:{ all -> 0x002c }
            r7.f = r1     // Catch:{ all -> 0x002c }
            c6 r7 = new c6     // Catch:{ all -> 0x002c }
            r1 = 1
            r7.<init>(r8, r1)     // Catch:{ all -> 0x002c }
            kl7 r7 = defpackage.nu0.l(r7)     // Catch:{ all -> 0x002c }
            uab r1 = new uab     // Catch:{ all -> 0x002c }
            long r2 = r8.f()     // Catch:{ all -> 0x002c }
            r1.<init>(r2, r7)     // Catch:{ all -> 0x002c }
            goto L_0x008b
        L_0x0083:
            r8 = move-exception
            r0 = r7
            r7 = r8
        L_0x0086:
            njc r1 = new njc
            r1.<init>(r7)
        L_0x008b:
            java.lang.Object r7 = r0.d
            q0e r7 = (defpackage.q0e) r7
            boolean r8 = r1 instanceof defpackage.njc
            if (r8 == 0) goto L_0x0094
            r1 = r4
        L_0x0094:
            if (r1 == 0) goto L_0x009b
            java.util.List r8 = java.util.Collections.singletonList(r1)
            goto L_0x009d
        L_0x009b:
            nz4 r8 = defpackage.nz4.a
        L_0x009d:
            r7.m(r4, r8)
            e5f r7 = defpackage.e5f.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pz7.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(defpackage.xab r5, defpackage.uab r6, java.lang.String r7, boolean r8, defpackage.om8 r9, kotlin.coroutines.Continuation r10) {
        /*
            r4 = this;
            boolean r6 = r10 instanceof defpackage.hbb
            if (r6 == 0) goto L_0x0013
            r6 = r10
            hbb r6 = (defpackage.hbb) r6
            int r8 = r6.Z
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r8 & r0
            if (r1 == 0) goto L_0x0013
            int r8 = r8 - r0
            r6.Z = r8
            goto L_0x0018
        L_0x0013:
            hbb r6 = new hbb
            r6.<init>(r4, r10)
        L_0x0018:
            java.lang.Object r8 = r6.X
            tx3 r10 = defpackage.tx3.a
            int r0 = r6.Z
            e5f r1 = defpackage.e5f.a
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L_0x003a
            if (r0 == r3) goto L_0x0036
            if (r0 != r2) goto L_0x002e
            m56 r9 = r6.o
            defpackage.od2.a0(r8)
            goto L_0x0056
        L_0x002e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0036:
            defpackage.od2.a0(r8)
            goto L_0x0078
        L_0x003a:
            defpackage.od2.a0(r8)
            int r5 = r5.ordinal()
            r8 = 0
            java.lang.Object r4 = r4.b
            qrc r4 = (defpackage.qrc) r4
            if (r5 == 0) goto L_0x006f
            if (r5 == r3) goto L_0x004b
            goto L_0x0062
        L_0x004b:
            r6.o = r9
            r6.Z = r2
            java.lang.Object r8 = defpackage.qrc.c(r4, r7, r8, r6)
            if (r8 != r10) goto L_0x0056
            return r10
        L_0x0056:
            if (r8 == 0) goto L_0x0063
            android.net.Uri r8 = (android.net.Uri) r8
            abb r4 = new abb
            r4.<init>(r8)
            r9.invoke(r4)
        L_0x0062:
            return r1
        L_0x0063:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Required value was null."
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L_0x006f:
            r6.Z = r3
            java.lang.Object r4 = defpackage.qrc.c(r4, r7, r8, r6)
            if (r4 != r10) goto L_0x0078
            return r10
        L_0x0078:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pz7.b(xab, uab, java.lang.String, boolean, om8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public List c(boolean z) {
        return y53.M(xab.SAVE, xab.SHARE);
    }

    public w7c d() {
        return (w7c) this.e;
    }

    public void f(boolean z) {
        int currentItem;
        a aVar;
        vd8 vd8 = (vd8) this.f;
        if (!vd8.X.Q() && ((ViewPager2) this.e).getScrollState() == 0) {
            wv7 wv7 = vd8.Y;
            if (wv7.h() != 0) {
                List list = vd8.x0;
                if (list.size() != 0 && (currentItem = ((ViewPager2) this.e).getCurrentItem()) < list.size()) {
                    long j = (long) currentItem;
                    if ((j != this.a || z) && (aVar = (a) wv7.c(j)) != null && aVar.o0()) {
                        this.a = j;
                        c cVar = vd8.X;
                        cVar.getClass();
                        he0 he0 = new he0(cVar);
                        ArrayList arrayList = new ArrayList();
                        a aVar2 = null;
                        for (int i = 0; i < wv7.h(); i++) {
                            long e2 = wv7.e(i);
                            a aVar3 = (a) wv7.i(i);
                            if (aVar3.o0()) {
                                if (e2 != this.a) {
                                    he0.i(aVar3, fg7.o);
                                    o9g o9g = vd8.u0;
                                    o9g.getClass();
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it = ((CopyOnWriteArrayList) o9g.b).iterator();
                                    if (!it.hasNext()) {
                                        arrayList.add(arrayList2);
                                    } else {
                                        au1.r(it.next());
                                        throw null;
                                    }
                                } else {
                                    aVar2 = aVar3;
                                }
                                aVar3.Z0(e2 == this.a);
                            }
                        }
                        if (aVar2 != null) {
                            he0.i(aVar2, fg7.X);
                            o9g o9g2 = vd8.u0;
                            o9g2.getClass();
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it2 = ((CopyOnWriteArrayList) o9g2.b).iterator();
                            if (!it2.hasNext()) {
                                arrayList.add(arrayList3);
                            } else {
                                au1.r(it2.next());
                                throw null;
                            }
                        }
                        if (!he0.a.isEmpty()) {
                            he0.e();
                            Collections.reverse(arrayList);
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                vd8.u0.getClass();
                                o9g.u((List) it3.next());
                            }
                        }
                    }
                }
            }
        }
    }

    public ebb getTitle() {
        return (ebb) this.f;
    }
}
