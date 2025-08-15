package ru.ok.onechat.reactions;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\rJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ok/onechat/reactions/ReactionsViewModel;", "Lqnf;", "Ltc2;", "event", "Le5f;", "onEvent", "(Ltc2;)V", "Lxp9;", "onNewReactionEvent", "(Lxp9;)V", "Lre9;", "onMessageDeleteEvent", "(Lre9;)V", "g7c", "reactions_release"}, k = 1, mv = {2, 0, 0})
public final class ReactionsViewModel extends qnf {
    public final long b;
    public final iy2 c;
    public final y7d d;
    public final av0 e;
    public final l6c f;
    public final csc g = null;
    public final je7 h;
    public final je7 i;
    public final je7 j;
    public final je7 k;
    public final je7 l;
    public final je7 m;
    public final khe n;
    public final khe o;
    public final khe p;
    public final khe q;
    public final fic r;
    public final HashSet s;
    public final khe t;
    public final kld u;
    public final v7c v;
    public final q0e w;
    public final int x;

    public ReactionsViewModel(long j2, iy2 iy2, y7d y7d, av0 av0, l6c l6c, khe khe, je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76, je7 je77, je7 je78) {
        y7d y7d2 = y7d;
        av0 av02 = av0;
        this.b = j2;
        this.c = iy2;
        this.d = y7d2;
        this.e = av02;
        this.f = l6c;
        this.h = je73;
        this.i = je74;
        this.j = je75;
        this.k = je7;
        this.l = je77;
        this.m = je78;
        this.x = 1;
        this.n = new khe(new b7c(this, 0));
        this.o = new khe(new zja(je76, 11, this));
        this.p = new khe(new b7c(this, 1));
        new HashMap();
        this.q = new khe(new b7c(this, 2));
        this.r = new fic(new lab(26));
        this.s = new HashSet();
        this.t = new khe(new a81(this, khe, je72, 8));
        kld b2 = lld.b(0, Integer.MAX_VALUE, 0, 4);
        this.u = b2;
        this.v = new v7c(b2);
        q0e a = r0e.a((Object) null);
        this.w = a;
        j47.T(f46.R(this), ((p94) je7.getValue()).a, (vx3) null, new e7c(this, (Continuation) null), 2);
        av02.d(this);
        t03 t03 = new t03(a, 11);
        int i2 = ft4.o;
        od2.L(od2.F(new zn5(new m58(m6d.O(t03, z7.S(300, kt4.MILLISECONDS)), 26), new f7c(this, (Continuation) null), 5), ((p94) je7.getValue()).a), f46.R(this));
        ((qyc) y7d2).l.add(new c7c(new WeakReference(this)));
        r0e.a(Boolean.FALSE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: java.lang.Long} */
    /* JADX WARNING: type inference failed for: r11v1, types: [e47, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v2, types: [e47, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x027c, code lost:
        if (r0.a(r8, r3) != r2) goto L_0x0280;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object e(ru.ok.onechat.reactions.ReactionsViewModel r27, defpackage.g7c r28, kotlin.coroutines.Continuation r29) {
        /*
            r0 = r27
            r1 = r28
            r2 = r29
            r27.getClass()
            boolean r3 = r2 instanceof defpackage.k7c
            if (r3 == 0) goto L_0x001c
            r3 = r2
            k7c r3 = (defpackage.k7c) r3
            int r4 = r3.v0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001c
            int r4 = r4 - r5
            r3.v0 = r4
            goto L_0x0021
        L_0x001c:
            k7c r3 = new k7c
            r3.<init>(r0, r2)
        L_0x0021:
            java.lang.Object r2 = r3.t0
            tx3 r15 = defpackage.tx3.a
            int r4 = r3.v0
            e5f r16 = defpackage.e5f.a
            java.lang.String r14 = "is_dialog="
            java.lang.String r13 = "param1"
            java.lang.String r11 = "value"
            java.lang.String r12 = "ACTION"
            r9 = 4
            r5 = 3
            r6 = 2
            r17 = 0
            r10 = 1
            r7 = 0
            if (r4 == 0) goto L_0x0098
            if (r4 == r10) goto L_0x007d
            if (r4 == r6) goto L_0x006b
            if (r4 == r5) goto L_0x004f
            if (r4 != r9) goto L_0x0047
            defpackage.od2.a0(r2)
            goto L_0x0280
        L_0x0047:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004f:
            v5c r0 = r3.Z
            ix8 r1 = r3.Y
            java.lang.Object r4 = r3.X
            g7c r4 = (defpackage.g7c) r4
            ru.ok.onechat.reactions.ReactionsViewModel r5 = r3.o
            defpackage.od2.a0(r2)
            r6 = r4
            r7 = r5
            r19 = r10
            r18 = r13
            r23 = r14
            r2 = r15
            r4 = r0
            r5 = r1
            r1 = r11
            r0 = r12
            goto L_0x01d9
        L_0x006b:
            java.lang.Object r0 = r3.X
            c6c r0 = (defpackage.c6c) r0
            ru.ok.onechat.reactions.ReactionsViewModel r1 = r3.o
            defpackage.od2.a0(r2)
            r3 = r0
            r4 = r1
            r1 = r11
            r0 = r12
            r24 = r13
            r2 = r14
            goto L_0x0127
        L_0x007d:
            c6c r0 = r3.s0
            v5c r1 = r3.Z
            ix8 r4 = r3.Y
            java.lang.Object r8 = r3.X
            g7c r8 = (defpackage.g7c) r8
            ru.ok.onechat.reactions.ReactionsViewModel r9 = r3.o
            defpackage.od2.a0(r2)
            r18 = r11
            r11 = r1
            r1 = r8
            r26 = r2
            r2 = r0
            r0 = r9
            r9 = r4
            r4 = r26
            goto L_0x00da
        L_0x0098:
            defpackage.od2.a0(r2)
            ix8 r2 = r1.d
            if (r2 == 0) goto L_0x00a2
            c6c r4 = r2.c
            goto L_0x00a3
        L_0x00a2:
            r4 = r7
        L_0x00a3:
            r3.o = r0
            r3.X = r1
            r3.Y = r2
            v5c r8 = r1.a
            r3.Z = r8
            r3.s0 = r4
            r3.v0 = r10
            iy2 r9 = r0.c
            jz2 r9 = (defpackage.jz2) r9
            r18 = r11
            long r10 = r0.b
            w7c r9 = r9.m(r10)
            j0e r9 = r9.a
            java.lang.Object r9 = r9.getValue()
            e52 r9 = (defpackage.e52) r9
            if (r9 == 0) goto L_0x00d1
            k92 r9 = r9.b
            long r9 = r9.a
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r9)
            goto L_0x00d2
        L_0x00d1:
            r11 = r7
        L_0x00d2:
            if (r11 != r15) goto L_0x00d6
            goto L_0x0282
        L_0x00d6:
            r9 = r2
            r2 = r4
            r4 = r11
            r11 = r8
        L_0x00da:
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L_0x0280
            long r20 = r4.longValue()
            if (r9 == 0) goto L_0x017f
            if (r2 == 0) goto L_0x017f
            v5c r4 = r2.b
            boolean r4 = defpackage.tpa.f(r4, r11)
            if (r4 == 0) goto L_0x017f
            je7 r4 = r0.h
            java.lang.Object r4 = r4.getValue()
            ky1 r4 = (defpackage.ky1) r4
            long r8 = r1.b
            r3.o = r0
            r3.X = r2
            r3.Y = r7
            r3.Z = r7
            r3.s0 = r7
            r3.v0 = r6
            long r5 = r0.b
            long r10 = r1.c
            r7 = r8
            r22 = r10
            r9 = r20
            r1 = r18
            r18 = r0
            r0 = r12
            r11 = r22
            r24 = r13
            r13 = r2
            r27 = r2
            r2 = r14
            r14 = r3
            java.lang.Object r3 = r4.a(r5, r7, r9, r11, r13, r14)
            if (r3 != r15) goto L_0x0123
            goto L_0x0282
        L_0x0123:
            r3 = r27
            r4 = r18
        L_0x0127:
            je7 r5 = r4.j
            java.lang.Object r5 = r5.getValue()
            gme r5 = (defpackage.gme) r5
            v5c r3 = r3.b
            java.lang.CharSequence r3 = r3.a
            java.lang.String r3 = r3.toString()
            e52 r6 = r4.i()
            if (r6 == 0) goto L_0x0141
            boolean r17 = r6.M()
        L_0x0141:
            r6 = r17
            r5.getClass()
            e47 r7 = new e47
            r7.<init>()
            r7.c = r0
            java.lang.String r0 = "reaction_canceled"
            r7.o = r0
            int r0 = r4.x
            java.lang.String r0 = defpackage.z7b.c(r0)
            r7.a(r0, r1)
            r14 = r24
            r7.a(r3, r14)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r7.a(r0, r14)
            ms7 r0 = r7.c()
            je7 r1 = r5.a
            java.lang.Object r1 = r1.getValue()
            ad r1 = (defpackage.ad) r1
            r1.j(r0)
            goto L_0x0280
        L_0x017f:
            r2 = r14
            r14 = r13
            r13 = r18
            r18 = r0
            r0 = r12
            r12 = r18
            je7 r4 = r12.i
            java.lang.Object r4 = r4.getValue()
            r5d r4 = (defpackage.r5d) r4
            long r5 = r1.b
            gx8 r18 = defpackage.gx8.EMOJI
            r3.o = r12
            r3.X = r1
            r3.Y = r9
            r3.Z = r11
            r3.s0 = r7
            r8 = 3
            r3.v0 = r8
            long r7 = r12.b
            r22 = r11
            r23 = r12
            long r11 = r1.c
            r24 = r5
            r5 = r7
            r10 = 0
            r7 = r24
            r24 = r1
            r25 = r9
            r1 = r10
            r19 = 1
            r9 = r20
            r20 = r22
            r21 = r23
            r1 = r13
            r13 = r20
            r23 = r2
            r2 = r14
            r14 = r18
            r18 = r2
            r2 = r15
            r15 = r3
            java.lang.Object r4 = r4.a(r5, r7, r9, r11, r13, r14, r15)
            if (r4 != r2) goto L_0x01d1
        L_0x01ce:
            r15 = r2
            goto L_0x0282
        L_0x01d1:
            r4 = r20
            r7 = r21
            r6 = r24
            r5 = r25
        L_0x01d9:
            je7 r8 = r7.j
            java.lang.Object r8 = r8.getValue()
            gme r8 = (defpackage.gme) r8
            java.lang.CharSequence r9 = r4.a
            java.lang.String r9 = r9.toString()
            e52 r10 = r7.i()
            if (r10 == 0) goto L_0x01f2
            boolean r10 = r10.M()
            goto L_0x01f4
        L_0x01f2:
            r10 = r17
        L_0x01f4:
            if (r5 == 0) goto L_0x01f9
            c6c r5 = r5.c
            goto L_0x01fa
        L_0x01f9:
            r5 = 0
        L_0x01fa:
            if (r5 == 0) goto L_0x01ff
            r5 = r19
            goto L_0x0201
        L_0x01ff:
            r5 = r17
        L_0x0201:
            r8.getClass()
            e47 r11 = new e47
            r11.<init>()
            r11.c = r0
            java.lang.String r0 = "reaction_sent"
            r11.o = r0
            int r0 = r7.x
            java.lang.String r0 = defpackage.z7b.c(r0)
            r11.a(r0, r1)
            r0 = r18
            r11.a(r9, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r9 = r23
            r1.<init>(r9)
            r1.append(r10)
            java.lang.String r9 = ";is_changed="
            r1.append(r9)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r11.a(r1, r0)
            ms7 r0 = r11.c()
            je7 r1 = r8.a
            java.lang.Object r1 = r1.getValue()
            ad r1 = (defpackage.ad) r1
            r1.j(r0)
            je7 r0 = r7.m
            java.lang.Object r0 = r0.getValue()
            gj r0 = (defpackage.gj) r0
            java.lang.CharSequence r1 = r4.a
            java.lang.String r1 = r1.toString()
            ph r0 = r0.g(r1)
            if (r0 == 0) goto L_0x0280
            java.lang.String r14 = r0.d
            if (r14 == 0) goto L_0x0280
            kld r0 = r7.u
            v5c r9 = r6.a
            s6c r1 = new s6c
            long r10 = r6.b
            r12 = 0
            r15 = 0
            r8 = r1
            r8.<init>(r9, r10, r12, r14, r15)
            r4 = 0
            r3.o = r4
            r3.X = r4
            r3.Y = r4
            r3.Z = r4
            r4 = 4
            r3.v0 = r4
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r2) goto L_0x0280
            goto L_0x01ce
        L_0x0280:
            r15 = r16
        L_0x0282:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.onechat.reactions.ReactionsViewModel.e(ru.ok.onechat.reactions.ReactionsViewModel, g7c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable g(defpackage.v5c r4) {
        /*
            java.lang.CharSequence r4 = r4.a
            int r0 = r4.length()
            r1 = 0
            boolean r2 = r4 instanceof android.text.Spanned     // Catch:{ all -> 0x0019 }
            if (r2 == 0) goto L_0x000e
            android.text.Spanned r4 = (android.text.Spanned) r4     // Catch:{ all -> 0x0019 }
            goto L_0x000f
        L_0x000e:
            r4 = r1
        L_0x000f:
            if (r4 == 0) goto L_0x0019
            java.lang.Class<dvd> r2 = defpackage.dvd.class
            r3 = 0
            java.lang.Object[] r4 = r4.getSpans(r3, r0, r2)     // Catch:{ all -> 0x0019 }
            goto L_0x001a
        L_0x0019:
            r4 = r1
        L_0x001a:
            dvd[] r4 = (defpackage.dvd[]) r4
            if (r4 == 0) goto L_0x002a
            java.lang.Object r4 = defpackage.ys.e0(r4)
            dvd r4 = (defpackage.dvd) r4
            if (r4 == 0) goto L_0x002a
            android.graphics.drawable.Drawable r1 = r4.b()
        L_0x002a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.onechat.reactions.ReactionsViewModel.g(v5c):android.graphics.drawable.Drawable");
    }

    public final void d() {
        hm9.m("ru.ok.onechat.reactions.ReactionsViewModel", "onCleared", new Object[0]);
        try {
            this.e.f(this);
        } catch (Throwable unused) {
        }
        f();
    }

    public final void f() {
        hm9.m("ru.ok.onechat.reactions.ReactionsViewModel", "cancelChatSubscribeNotifObserving", new Object[0]);
        j47.T(f46.R(this), xq9.a.plus(((p94) this.k.getValue()).a), (vx3) null, new h7c(this, (Continuation) null), 2);
    }

    public final boolean h() {
        return ((Boolean) this.p.getValue()).booleanValue();
    }

    public final e52 i() {
        return (e52) ((jz2) this.c).m(this.b).a.getValue();
    }

    public final kl7 j(ix8 ix8, boolean z) {
        c6c c6c;
        Object obj;
        ix8 ix82 = ix8;
        kl7 l2 = j1e.l();
        khe khe = this.q;
        int i2 = 0;
        if (ix82 != null) {
            List list = ix82.a;
            if (list.size() >= 8) {
                int size = list.size();
                int i3 = 0;
                while (i2 < size) {
                    hx8 hx8 = (hx8) list.get(i2);
                    Iterator it = ((List) khe.getValue()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (tpa.f(((j6c) obj).b, hx8.a.b)) {
                            break;
                        }
                    }
                    j6c j6c = (j6c) obj;
                    c6c c6c2 = ix82.c;
                    if (j6c == null) {
                        v5c v5c = hx8.a.b;
                        l2.add(new j6c(((long) i3) - Long.MIN_VALUE, v5c, g(v5c), v5c.equals(c6c2 != null ? c6c2.b : null)));
                        i3++;
                    } else {
                        if (tpa.f(j6c.b, c6c2 != null ? c6c2.b : null)) {
                            v5c v5c2 = c6c2 != null ? c6c2.b : null;
                            v5c v5c3 = j6c.b;
                            l2.add(new j6c(j6c.a, v5c3, j6c.c, tpa.f(v5c3, v5c2)));
                        } else {
                            l2.add(j6c);
                        }
                    }
                    i2++;
                }
                return j1e.d(l2);
            }
        }
        int size2 = ((List) khe.getValue()).size();
        while (true) {
            if (i2 >= size2) {
                break;
            }
            j6c j6c2 = (j6c) ((List) khe.getValue()).get(i2);
            if (i2 == 7 && ((List) khe.getValue()).size() > 8 && z) {
                l2.add(i6c.a);
                break;
            }
            if (tpa.f(j6c2.b, (ix82 == null || (c6c = ix82.c) == null) ? null : c6c.b)) {
                c6c c6c3 = ix82.c;
                v5c v5c4 = c6c3 != null ? c6c3.b : null;
                v5c v5c5 = j6c2.b;
                l2.add(new j6c(j6c2.a, v5c5, j6c2.c, tpa.f(v5c5, v5c4)));
            } else {
                l2.add(j6c2);
            }
            i2++;
        }
        return j1e.d(l2);
    }

    public final boolean k() {
        e52 i2;
        if (h() && (i2 = i()) != null) {
            return (i2.C() || i2.R()) && !i2.F() && !i2.Q();
        }
        return false;
    }

    public final void l(g7c g7c) {
        if (h() && k()) {
            v5c v5c = g7c.a;
            if (w9e.C0(v5c)) {
                hm9.m0("ru.ok.onechat.reactions.ReactionsViewModel", "updateSelfReaction: reaction is blank!", new Object[0]);
            } else if (!this.s.contains(Long.valueOf(g7c.c))) {
                hm9.m("ru.ok.onechat.reactions.ReactionsViewModel", "updateSelfReaction: %s for %d", v5c, Long.valueOf(g7c.b));
                this.w.m((Object) null, new p35(g7c));
            }
        }
    }

    @uae
    public final void onEvent(tc2 tc2) {
        long j2 = this.b;
        Long valueOf = Long.valueOf(j2);
        Long l2 = tc2.c;
        hm9.m("ru.ok.onechat.reactions.ReactionsViewModel", "onEvent: ChatLastReactionUpdatedEvent: chat.id = %d, event.lastReactedMessageId = %d", valueOf, l2);
        if (j2 == tc2.b && l2 != null) {
            long longValue = l2.longValue();
            csc csc = this.g;
            if (csc != null) {
                csc.b(Long.valueOf(longValue), "lastReactedMessageId");
            }
        }
    }

    @uae
    public final void onMessageDeleteEvent(re9 re9) {
        if (re9.b == this.b) {
            this.s.addAll(re9.X);
        }
    }

    @uae
    public final void onNewReactionEvent(xp9 xp9) {
        ph g2;
        String str;
        if (this.b == xp9.b) {
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                us7 us7 = us7.X;
                ir6.d(us7, "ru.ok.onechat.reactions.ReactionsViewModel", "onNewReactionEvent=" + xp9, (Throwable) null);
            }
            v5c v5c = (v5c) x53.h0(xp9.Y);
            if (v5c != null && (g2 = ((gj) this.m.getValue()).g(v5c.a.toString())) != null && (str = g2.d) != null) {
                this.u.g(new s6c(v5c, xp9.o, xp9.X, str, !xp9.c));
            }
        }
    }
}
