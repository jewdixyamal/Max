package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: m89  reason: default package */
public final class m89 {
    public final RecyclerView a;
    public final v69 b;
    public final wwc c;
    public final m29 d;
    public final g39 e;
    public final String f = m89.class.getName();

    public m89(EndlessRecyclerView2 endlessRecyclerView2, v69 v69, wwc wwc, m29 m29, g39 g39) {
        this.a = endlessRecyclerView2;
        this.b = v69;
        this.c = wwc;
        this.d = m29;
        this.e = g39;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        r3 = r3.L(r0.X0());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(long r4) {
        /*
            r3 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r3.a
            androidx.recyclerview.widget.LinearLayoutManager r0 = defpackage.z7.t(r0)
            if (r0 == 0) goto L_0x002d
            int r1 = r0.T0()
            m29 r3 = r3.d
            one.me.messages.list.loader.MessageModel r1 = r3.L(r1)
            r2 = 0
            if (r1 == 0) goto L_0x002c
            int r0 = r0.X0()
            one.me.messages.list.loader.MessageModel r3 = r3.L(r0)
            if (r3 == 0) goto L_0x002c
            long r0 = r1.c
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x002c
            long r0 = r3.c
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 > 0) goto L_0x002c
            r2 = 1
        L_0x002c:
            return r2
        L_0x002d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Only linear layout is supported"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m89.a(long):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: java.lang.Number} */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00aa, code lost:
        if ((r11 != null ? r11.f : -1) > 0) goto L_0x01d1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b() {
        /*
            r17 = this;
            r0 = r17
            wwc r1 = r0.c
            java.lang.Object r1 = r1.b
            ti9 r1 = (defpackage.ti9) r1
            java.lang.Object r1 = r1.getValue()
            twc r1 = (defpackage.twc) r1
            if (r1 == 0) goto L_0x0013
            long r4 = r1.a
            goto L_0x0015
        L_0x0013:
            r4 = 0
        L_0x0015:
            wwc r1 = r0.c
            java.lang.Object r1 = r1.b
            ti9 r1 = (defpackage.ti9) r1
            java.lang.Object r1 = r1.getValue()
            twc r1 = (defpackage.twc) r1
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L_0x002b
            boolean r1 = r1.d
            if (r1 != r6) goto L_0x002b
            r1 = r6
            goto L_0x002c
        L_0x002b:
            r1 = r7
        L_0x002c:
            m29 r8 = r0.d
            int r8 = r8.f(r4)
            r9 = 0
            if (r1 == 0) goto L_0x0093
            m29 r10 = r0.d
            int r11 = r8 + 1
            one.me.messages.list.loader.MessageModel r10 = r10.L(r11)
            if (r10 == 0) goto L_0x0093
            long r12 = r10.c
            int r10 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r10 != 0) goto L_0x0093
            m29 r10 = r0.d
            int r10 = r10.j()
            j37 r10 = defpackage.ote.Y(r11, r10)
            java.util.Iterator r10 = r10.iterator()
            r11 = r7
            r12 = r9
        L_0x0055:
            r13 = r10
            i37 r13 = (defpackage.i37) r13
            boolean r14 = r13.c
            if (r14 == 0) goto L_0x0078
            java.lang.Object r13 = r13.next()
            r14 = r13
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            m29 r15 = r0.d
            one.me.messages.list.loader.MessageModel r14 = r15.L(r14)
            if (r14 == 0) goto L_0x0055
            long r14 = r14.c
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 != 0) goto L_0x0055
            r11 = r6
            r12 = r13
            goto L_0x0055
        L_0x0078:
            if (r11 == 0) goto L_0x008b
            java.lang.Number r12 = (java.lang.Number) r12
            int r10 = r12.intValue()
            if (r10 == r8) goto L_0x0084
            r8 = r6
            goto L_0x0085
        L_0x0084:
            r8 = r7
        L_0x0085:
            r16 = r10
            r10 = r8
            r8 = r16
            goto L_0x0094
        L_0x008b:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "Collection contains no element matching the predicate."
            r0.<init>(r1)
            throw r0
        L_0x0093:
            r10 = r7
        L_0x0094:
            if (r8 < 0) goto L_0x01d1
            if (r8 != 0) goto L_0x00ae
            wwc r11 = r0.c
            java.lang.Object r11 = r11.b
            ti9 r11 = (defpackage.ti9) r11
            java.lang.Object r11 = r11.getValue()
            twc r11 = (defpackage.twc) r11
            if (r11 == 0) goto L_0x00a9
            int r11 = r11.f
            goto L_0x00aa
        L_0x00a9:
            r11 = -1
        L_0x00aa:
            if (r11 <= 0) goto L_0x00ae
            goto L_0x01d1
        L_0x00ae:
            wwc r7 = r0.c
            java.lang.Object r7 = r7.b
            ti9 r7 = (defpackage.ti9) r7
            java.lang.Object r11 = r7.getValue()
            twc r11 = (defpackage.twc) r11
            if (r11 == 0) goto L_0x00c0
            r7.setValue(r9)
            goto L_0x00c1
        L_0x00c0:
            r11 = r9
        L_0x00c1:
            java.lang.String r7 = r0.f
            ir6 r12 = defpackage.hm9.m
            if (r12 != 0) goto L_0x00c8
            goto L_0x00f7
        L_0x00c8:
            boolean r13 = r12.c()
            if (r13 == 0) goto L_0x00f7
            us7 r13 = defpackage.us7.X
            androidx.recyclerview.widget.RecyclerView r14 = r0.a
            dec r14 = r14.M(r8)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r2 = "Scroll: vh for pos #"
            r15.<init>(r2)
            r15.append(r8)
            java.lang.String r2 = "="
            r15.append(r2)
            r15.append(r14)
            java.lang.String r2 = ", event="
            r15.append(r2)
            r15.append(r11)
            java.lang.String r2 = r15.toString()
            r12.d(r13, r7, r2, r9)
        L_0x00f7:
            if (r11 != 0) goto L_0x0101
            java.lang.String r0 = r0.f
            java.lang.String r1 = "Scroll: No events for scrolling, skip event"
            defpackage.hm9.m0(r0, r1, new java.lang.Object[0])
            return r6
        L_0x0101:
            androidx.recyclerview.widget.RecyclerView r2 = r0.a
            androidx.recyclerview.widget.LinearLayoutManager r2 = defpackage.z7.t(r2)
            boolean r3 = r2 instanceof one.me.messages.list.ui.recycler.MessagesLayoutManager
            if (r3 == 0) goto L_0x010e
            one.me.messages.list.ui.recycler.MessagesLayoutManager r2 = (one.me.messages.list.ui.recycler.MessagesLayoutManager) r2
            goto L_0x010f
        L_0x010e:
            r2 = r9
        L_0x010f:
            if (r2 == 0) goto L_0x0113
            r2.G = r1
        L_0x0113:
            boolean r1 = r11.e
            if (r1 == 0) goto L_0x017e
            v69 r1 = r0.b
            long r2 = r1.c
            r12 = 0
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x017e
            java.util.List r2 = r1.d
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r6
            if (r2 != 0) goto L_0x012e
            boolean r1 = r1.e
            if (r1 == 0) goto L_0x017e
        L_0x012e:
            androidx.recyclerview.widget.RecyclerView r1 = r0.a
            boolean r2 = r1.isLaidOut()
            if (r2 == 0) goto L_0x0175
            boolean r2 = r1.isLayoutRequested()
            if (r2 != 0) goto L_0x0175
            java.lang.String r1 = r0.f
            ir6 r2 = defpackage.hm9.m
            if (r2 != 0) goto L_0x0143
            goto L_0x0158
        L_0x0143:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x0158
            us7 r3 = defpackage.us7.X
            v69 r7 = r0.b
            long r12 = r7.c
            java.lang.String r7 = "Scroll: Highlighted from args message with id="
            java.lang.String r7 = defpackage.ey8.h(r12, r7)
            r2.d(r3, r1, r7, r9)
        L_0x0158:
            g39 r1 = r0.e
            v69 r2 = r0.b
            long r12 = r2.c
            java.util.List r2 = r2.d
            q0e r3 = r1.o
        L_0x0162:
            java.lang.Object r1 = r3.getValue()
            r7 = r1
            jk6 r7 = (defpackage.jk6) r7
            jk6 r7 = new jk6
            r7.<init>(r12, r2)
            boolean r1 = r3.c(r1, r7)
            if (r1 == 0) goto L_0x0162
            goto L_0x017e
        L_0x0175:
            qq0 r2 = new qq0
            r3 = 6
            r2.<init>(r3, r0)
            r1.addOnLayoutChangeListener(r2)
        L_0x017e:
            boolean r1 = r0.a(r4)
            if (r1 == 0) goto L_0x019b
            if (r10 != 0) goto L_0x019b
            java.lang.String r0 = r0.f
            ir6 r1 = defpackage.hm9.m
            if (r1 != 0) goto L_0x018d
            goto L_0x019a
        L_0x018d:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x019a
            us7 r2 = defpackage.us7.X
            java.lang.String r3 = "Scroll: vh is already visible on screen, skip event"
            r1.d(r2, r0, r3, r9)
        L_0x019a:
            return r6
        L_0x019b:
            boolean r1 = r11.c
            if (r1 == 0) goto L_0x01a5
            androidx.recyclerview.widget.RecyclerView r1 = r0.a
            r1.B0(r8)
            goto L_0x01aa
        L_0x01a5:
            androidx.recyclerview.widget.RecyclerView r1 = r0.a
            r1.x0(r8)
        L_0x01aa:
            java.lang.String r1 = r0.f
            ir6 r2 = defpackage.hm9.m
            if (r2 != 0) goto L_0x01b1
            goto L_0x01d0
        L_0x01b1:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x01d0
            us7 r3 = defpackage.us7.X
            m29 r0 = r0.d
            one.me.messages.list.loader.MessageModel r0 = r0.L(r8)
            if (r0 == 0) goto L_0x01c6
            java.lang.String r0 = r0.m()
            goto L_0x01c7
        L_0x01c6:
            r0 = r9
        L_0x01c7:
            java.lang.String r4 = "Scroll: Scrolled to message="
            java.lang.String r0 = defpackage.wg0.i(r4, r0)
            r2.d(r3, r1, r0, r9)
        L_0x01d0:
            return r6
        L_0x01d1:
            java.lang.String r0 = r0.f
            ir6 r1 = defpackage.hm9.m
            if (r1 != 0) goto L_0x01d8
            goto L_0x01e9
        L_0x01d8:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x01e9
            us7 r2 = defpackage.us7.Z
            java.lang.String r3 = "Scroll: Got non-existing pos="
            java.lang.String r3 = defpackage.zr6.h(r8, r3)
            r1.d(r2, r0, r3, r9)
        L_0x01e9:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m89.b():boolean");
    }
}
