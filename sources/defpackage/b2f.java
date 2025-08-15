package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: b2f  reason: default package */
public final class b2f implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public w1f a;
    public ViewGroup b;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: g2f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01ce A[EDGE_INSN: B:128:0x01ce->B:85:0x01ce ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onPreDraw() {
        /*
            r16 = this;
            r0 = r16
            android.view.ViewGroup r1 = r0.b
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()
            r2.removeOnPreDrawListener(r0)
            r1.removeOnAttachStateChangeListener(r0)
            java.util.ArrayList r1 = defpackage.c2f.c
            android.view.ViewGroup r3 = r0.b
            boolean r1 = r1.remove(r3)
            r8 = 1
            if (r1 != 0) goto L_0x001a
            return r8
        L_0x001a:
            us r1 = defpackage.c2f.c()
            java.lang.Object r2 = r1.get(r3)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            if (r2 != 0) goto L_0x0030
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.put(r3, r2)
        L_0x002e:
            r5 = 0
            goto L_0x003b
        L_0x0030:
            int r5 = r2.size()
            if (r5 <= 0) goto L_0x002e
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r2)
        L_0x003b:
            w1f r9 = r0.a
            r2.add(r9)
            a2f r2 = new a2f
            r2.<init>(r0, r1)
            r9.a(r2)
            r0 = 0
            r9.i(r3, r0)
            if (r5 == 0) goto L_0x0062
            java.util.Iterator r1 = r5.iterator()
        L_0x0052:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0062
            java.lang.Object r2 = r1.next()
            w1f r2 = (defpackage.w1f) r2
            r2.F(r3)
            goto L_0x0052
        L_0x0062:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r9.x0 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r9.y0 = r1
            a8g r1 = r9.t0
            a8g r2 = r9.u0
            us r5 = new us
            java.lang.Object r6 = r1.a
            us r6 = (defpackage.us) r6
            r5.<init>(r6)
            us r6 = new us
            java.lang.Object r7 = r2.a
            us r7 = (defpackage.us) r7
            r6.<init>(r7)
            r7 = r0
        L_0x0087:
            int[] r10 = r9.w0
            int r11 = r10.length
            if (r7 >= r11) goto L_0x01ce
            r10 = r10[r7]
            if (r10 == r8) goto L_0x0191
            r11 = 2
            if (r10 == r11) goto L_0x0141
            r11 = 3
            if (r10 == r11) goto L_0x00ee
            r11 = 4
            if (r10 == r11) goto L_0x009b
            goto L_0x01c8
        L_0x009b:
            java.lang.Object r10 = r1.c
            wv7 r10 = (defpackage.wv7) r10
            int r11 = r10.h()
            r12 = r0
        L_0x00a4:
            if (r12 >= r11) goto L_0x01c8
            java.lang.Object r13 = r10.i(r12)
            android.view.View r13 = (android.view.View) r13
            if (r13 == 0) goto L_0x00ea
            boolean r14 = r9.y(r13)
            if (r14 == 0) goto L_0x00ea
            long r14 = r10.e(r12)
            java.lang.Object r0 = r2.c
            wv7 r0 = (defpackage.wv7) r0
            java.lang.Object r0 = r0.c(r14)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x00ea
            boolean r14 = r9.y(r0)
            if (r14 == 0) goto L_0x00ea
            java.lang.Object r14 = r5.get(r13)
            g2f r14 = (defpackage.g2f) r14
            java.lang.Object r15 = r6.get(r0)
            g2f r15 = (defpackage.g2f) r15
            if (r14 == 0) goto L_0x00ea
            if (r15 == 0) goto L_0x00ea
            java.util.ArrayList r4 = r9.x0
            r4.add(r14)
            java.util.ArrayList r4 = r9.y0
            r4.add(r15)
            r5.remove(r13)
            r6.remove(r0)
        L_0x00ea:
            int r12 = r12 + 1
            r0 = 0
            goto L_0x00a4
        L_0x00ee:
            java.lang.Object r0 = r1.b
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            java.lang.Object r4 = r2.b
            android.util.SparseArray r4 = (android.util.SparseArray) r4
            int r10 = r0.size()
            r11 = 0
        L_0x00fb:
            if (r11 >= r10) goto L_0x01c8
            java.lang.Object r12 = r0.valueAt(r11)
            android.view.View r12 = (android.view.View) r12
            if (r12 == 0) goto L_0x013d
            boolean r13 = r9.y(r12)
            if (r13 == 0) goto L_0x013d
            int r13 = r0.keyAt(r11)
            java.lang.Object r13 = r4.get(r13)
            android.view.View r13 = (android.view.View) r13
            if (r13 == 0) goto L_0x013d
            boolean r14 = r9.y(r13)
            if (r14 == 0) goto L_0x013d
            java.lang.Object r14 = r5.get(r12)
            g2f r14 = (defpackage.g2f) r14
            java.lang.Object r15 = r6.get(r13)
            g2f r15 = (defpackage.g2f) r15
            if (r14 == 0) goto L_0x013d
            if (r15 == 0) goto L_0x013d
            java.util.ArrayList r8 = r9.x0
            r8.add(r14)
            java.util.ArrayList r8 = r9.y0
            r8.add(r15)
            r5.remove(r12)
            r6.remove(r13)
        L_0x013d:
            int r11 = r11 + 1
            r8 = 1
            goto L_0x00fb
        L_0x0141:
            java.lang.Object r0 = r1.o
            us r0 = (defpackage.us) r0
            int r4 = r0.c
            r8 = 0
        L_0x0148:
            if (r8 >= r4) goto L_0x01c8
            java.lang.Object r10 = r0.i(r8)
            android.view.View r10 = (android.view.View) r10
            if (r10 == 0) goto L_0x018e
            boolean r11 = r9.y(r10)
            if (r11 == 0) goto L_0x018e
            java.lang.Object r11 = r0.f(r8)
            java.lang.Object r12 = r2.o
            us r12 = (defpackage.us) r12
            java.lang.Object r11 = r12.get(r11)
            android.view.View r11 = (android.view.View) r11
            if (r11 == 0) goto L_0x018e
            boolean r12 = r9.y(r11)
            if (r12 == 0) goto L_0x018e
            java.lang.Object r12 = r5.get(r10)
            g2f r12 = (defpackage.g2f) r12
            java.lang.Object r13 = r6.get(r11)
            g2f r13 = (defpackage.g2f) r13
            if (r12 == 0) goto L_0x018e
            if (r13 == 0) goto L_0x018e
            java.util.ArrayList r14 = r9.x0
            r14.add(r12)
            java.util.ArrayList r12 = r9.y0
            r12.add(r13)
            r5.remove(r10)
            r6.remove(r11)
        L_0x018e:
            int r8 = r8 + 1
            goto L_0x0148
        L_0x0191:
            int r0 = r5.c
            r4 = 1
            int r0 = r0 - r4
        L_0x0195:
            if (r0 < 0) goto L_0x01c8
            java.lang.Object r4 = r5.f(r0)
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x01c5
            boolean r8 = r9.y(r4)
            if (r8 == 0) goto L_0x01c5
            java.lang.Object r4 = r6.remove(r4)
            g2f r4 = (defpackage.g2f) r4
            if (r4 == 0) goto L_0x01c5
            android.view.View r8 = r4.b
            boolean r8 = r9.y(r8)
            if (r8 == 0) goto L_0x01c5
            java.lang.Object r8 = r5.g(r0)
            g2f r8 = (defpackage.g2f) r8
            java.util.ArrayList r10 = r9.x0
            r10.add(r8)
            java.util.ArrayList r8 = r9.y0
            r8.add(r4)
        L_0x01c5:
            int r0 = r0 + -1
            goto L_0x0195
        L_0x01c8:
            int r7 = r7 + 1
            r0 = 0
            r8 = 1
            goto L_0x0087
        L_0x01ce:
            r0 = 0
        L_0x01cf:
            int r1 = r5.c
            if (r0 >= r1) goto L_0x01ef
            java.lang.Object r1 = r5.i(r0)
            g2f r1 = (defpackage.g2f) r1
            android.view.View r2 = r1.b
            boolean r2 = r9.y(r2)
            if (r2 == 0) goto L_0x01ec
            java.util.ArrayList r2 = r9.x0
            r2.add(r1)
            java.util.ArrayList r1 = r9.y0
            r2 = 0
            r1.add(r2)
        L_0x01ec:
            int r0 = r0 + 1
            goto L_0x01cf
        L_0x01ef:
            r0 = 0
        L_0x01f0:
            int r1 = r6.c
            if (r0 >= r1) goto L_0x0212
            java.lang.Object r1 = r6.i(r0)
            g2f r1 = (defpackage.g2f) r1
            android.view.View r2 = r1.b
            boolean r2 = r9.y(r2)
            if (r2 == 0) goto L_0x020e
            java.util.ArrayList r2 = r9.y0
            r2.add(r1)
            java.util.ArrayList r1 = r9.x0
            r2 = 0
            r1.add(r2)
            goto L_0x020f
        L_0x020e:
            r2 = 0
        L_0x020f:
            int r0 = r0 + 1
            goto L_0x01f0
        L_0x0212:
            us r0 = defpackage.w1f.t()
            int r1 = r0.c
            android.view.WindowId r2 = r3.getWindowId()
            r4 = 1
            int r1 = r1 - r4
        L_0x021e:
            if (r1 < 0) goto L_0x0282
            java.lang.Object r4 = r0.f(r1)
            android.animation.Animator r4 = (android.animation.Animator) r4
            if (r4 == 0) goto L_0x027f
            java.lang.Object r5 = r0.get(r4)
            s1f r5 = (defpackage.s1f) r5
            if (r5 == 0) goto L_0x027f
            android.view.View r6 = r5.a
            if (r6 == 0) goto L_0x027f
            android.view.WindowId r7 = r5.d
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto L_0x027f
            r7 = 1
            g2f r8 = r9.v(r6, r7)
            g2f r10 = r9.r(r6, r7)
            if (r8 != 0) goto L_0x0256
            if (r10 != 0) goto L_0x0256
            a8g r7 = r9.u0
            java.lang.Object r7 = r7.a
            us r7 = (defpackage.us) r7
            java.lang.Object r6 = r7.get(r6)
            r10 = r6
            g2f r10 = (defpackage.g2f) r10
        L_0x0256:
            if (r8 != 0) goto L_0x025a
            if (r10 == 0) goto L_0x027f
        L_0x025a:
            g2f r6 = r5.c
            w1f r5 = r5.e
            boolean r6 = r5.x(r6, r10)
            if (r6 == 0) goto L_0x027f
            w1f r5 = r5.s()
            r5.getClass()
            boolean r5 = r4.isRunning()
            if (r5 != 0) goto L_0x027c
            boolean r5 = r4.isStarted()
            if (r5 == 0) goto L_0x0278
            goto L_0x027c
        L_0x0278:
            r0.remove(r4)
            goto L_0x027f
        L_0x027c:
            r4.cancel()
        L_0x027f:
            int r1 = r1 + -1
            goto L_0x021e
        L_0x0282:
            a8g r4 = r9.t0
            a8g r5 = r9.u0
            java.util.ArrayList r6 = r9.x0
            java.util.ArrayList r7 = r9.y0
            r2 = r9
            r2.m(r3, r4, r5, r6, r7)
            r9.getClass()
            r9.G()
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b2f.onPreDraw():boolean");
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = c2f.c;
        ViewGroup viewGroup2 = this.b;
        arrayList.remove(viewGroup2);
        ArrayList arrayList2 = (ArrayList) c2f.c().get(viewGroup2);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((w1f) it.next()).F(viewGroup2);
            }
        }
        this.a.j(true);
    }
}
