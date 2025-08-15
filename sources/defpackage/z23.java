package defpackage;

import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.coroutines.Continuation;

/* renamed from: z23  reason: default package */
public final class z23 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public z23(Looper looper, rhe rhe, lm7 lm7) {
        this(new CopyOnWriteArraySet(), looper, rhe, lm7);
    }

    public static xj8 d(u2 u2Var, zw6 zw6, xj8 xj8, gue gue) {
        lue O1 = u2Var.O1();
        int B = u2Var.B();
        Object m = O1.q() ? null : O1.m(B);
        int b2 = (u2Var.n() || O1.q()) ? -1 : O1.f(B, gue).b(maf.D(u2Var.k()) - gue.f());
        for (int i = 0; i < zw6.size(); i++) {
            xj8 xj82 = (xj8) zw6.get(i);
            if (g(xj82, m, u2Var.n(), u2Var.o0(), u2Var.O(), b2)) {
                return xj82;
            }
        }
        if (zw6.isEmpty() && xj8 != null) {
            if (g(xj8, m, u2Var.n(), u2Var.o0(), u2Var.O(), b2)) {
                return xj8;
            }
        }
        return null;
    }

    public static boolean g(xj8 xj8, Object obj, boolean z, int i, int i2, int i3) {
        if (!xj8.a.equals(obj)) {
            return false;
        }
        int i4 = xj8.b;
        return (z && i4 == i && xj8.c == i2) || (!z && i4 == -1 && xj8.e == i3);
    }

    public void a(jn jnVar, xj8 xj8, lue lue) {
        if (xj8 != null) {
            if (lue.b(xj8.a) != -1) {
                jnVar.I(xj8, lue);
                return;
            }
            lue lue2 = (lue) ((cx6) this.c).get(xj8);
            if (lue2 != null) {
                jnVar.I(xj8, lue2);
            }
        }
    }

    public m90 b() {
        String str = ((String) this.a) == null ? " mimeType" : "";
        if (((Integer) this.b) == null) {
            str = str.concat(" profile");
        }
        if (((bue) this.c) == null) {
            str = au1.g(str, " inputTimebase");
        }
        if (((Integer) this.d) == null) {
            str = au1.g(str, " bitrate");
        }
        if (((Integer) this.e) == null) {
            str = au1.g(str, " sampleRate");
        }
        if (((Integer) this.f) == null) {
            str = au1.g(str, " channelCount");
        }
        if (str.isEmpty()) {
            String str2 = (String) this.a;
            int intValue = ((Integer) this.b).intValue();
            m90 m90 = new m90(str2, intValue, (bue) this.c, ((Integer) this.d).intValue(), ((Integer) this.e).intValue(), ((Integer) this.f).intValue());
            if (!Objects.equals(str2, "audio/mp4a-latm") || intValue != -1) {
                return m90;
            }
            throw new IllegalArgumentException("Encoder mime set to AAC, but no AAC profile was provided.");
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(long r11, defpackage.uaa r13, kotlin.coroutines.Continuation r14) {
        /*
            r10 = this;
            boolean r5 = r14 instanceof defpackage.x23
            if (r5 == 0) goto L_0x0013
            r5 = r14
            x23 r5 = (defpackage.x23) r5
            int r6 = r5.t0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x0013
            int r6 = r6 - r7
            r5.t0 = r6
            goto L_0x0018
        L_0x0013:
            x23 r5 = new x23
            r5.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r4 = r5.Z
            tx3 r6 = defpackage.tx3.a
            int r7 = r5.t0
            e5f r8 = defpackage.e5f.a
            r9 = 1
            if (r7 == 0) goto L_0x0039
            if (r7 != r9) goto L_0x0031
            long r0 = r5.Y
            java.lang.Long r2 = r5.X
            z23 r3 = r5.o
            defpackage.od2.a0(r4)
            r4 = r0
            r0 = r3
            goto L_0x0092
        L_0x0031:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0039:
            defpackage.od2.a0(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "dropServerDraft "
            r4.<init>(r7)
            r4.append(r11)
            java.lang.String r4 = r4.toString()
            java.lang.Object r7 = r10.a
            java.lang.String r7 = (java.lang.String) r7
            defpackage.hm9.m(r7, r4, new java.lang.Object[0])
            java.lang.Object r4 = r10.f
            je7 r4 = (defpackage.je7) r4
            java.lang.Object r4 = r4.getValue()
            y7d r4 = (defpackage.y7d) r4
            qyc r4 = (defpackage.qyc) r4
            boolean r4 = r4.u()
            if (r4 != 0) goto L_0x0069
            java.lang.String r0 = "Drafts sync NOT enabled. Not discard to server"
            defpackage.hm9.m(r7, r0, new java.lang.Object[0])
            return r8
        L_0x0069:
            if (r13 == 0) goto L_0x006e
            java.lang.Long r3 = r13.e
            goto L_0x006f
        L_0x006e:
            r3 = 0
        L_0x006f:
            if (r3 != 0) goto L_0x0077
            java.lang.String r0 = "Drafts sync enabled. No old draft. Not discard to server"
            defpackage.hm9.m(r7, r0, new java.lang.Object[0])
            return r8
        L_0x0077:
            java.lang.String r4 = "Drafts sync enabled. Discard to server"
            defpackage.hm9.m(r7, r4, new java.lang.Object[0])
            r5.o = r10
            r5.X = r3
            r5.Y = r11
            r5.t0 = r9
            java.lang.Object r4 = r10.b
            w23 r4 = (defpackage.w23) r4
            java.lang.Object r4 = r4.a(r11, r5)
            if (r4 != r6) goto L_0x008f
            return r6
        L_0x008f:
            r0 = r10
            r4 = r11
            r2 = r3
        L_0x0092:
            java.lang.Object r0 = r0.e
            je7 r0 = (defpackage.je7) r0
            java.lang.Object r0 = r0.getValue()
            pk r0 = (defpackage.pk) r0
            long r6 = r2.longValue()
            k4a r0 = (defpackage.k4a) r0
            boolean r1 = r0.o(r4)
            if (r1 == 0) goto L_0x00c4
            r1 = 0
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x00af
            goto L_0x00c4
        L_0x00af:
            dp4 r9 = new dp4
            m7b r1 = r0.y()
            p7b r1 = (defpackage.p7b) r1
            t33 r1 = r1.a
            long r2 = r1.o()
            r1 = r9
            r1.<init>(r2, r4, r6)
            defpackage.k4a.w(r0, r9)
        L_0x00c4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z23.c(long, uaa, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void e() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f;
        if (!arrayDeque.isEmpty()) {
            aie aie = (aie) this.a;
            if (!aie.a.hasMessages(0)) {
                aie.getClass();
                yhe b2 = aie.b();
                b2.a = aie.a.obtainMessage(0);
                aie.getClass();
                Message message = b2.a;
                message.getClass();
                aie.a.sendMessageAtFrontOfQueue(message);
                b2.a();
            }
            ArrayDeque arrayDeque2 = (ArrayDeque) this.e;
            boolean z = !arrayDeque2.isEmpty();
            arrayDeque2.addAll(arrayDeque);
            arrayDeque.clear();
            if (!z) {
                while (!arrayDeque2.isEmpty()) {
                    ((Runnable) arrayDeque2.peekFirst()).run();
                    arrayDeque2.removeFirst();
                }
            }
        }
    }

    public Object f(long j, Continuation continuation) {
        Object t0 = j47.t0(((w9a) ((kke) ((je7) this.d).getValue())).b(), new y23(this, j, (Continuation) null), continuation);
        return t0 == tx3.a ? t0 : e5f.a;
    }

    public void h(int i, jm7 jm7) {
        ((ArrayDeque) this.f).add(new si1((Object) new CopyOnWriteArraySet((CopyOnWriteArraySet) this.d), i, (Object) jm7, 11));
    }

    public void i(int i, jm7 jm7) {
        h(i, jm7);
        e();
    }

    public void j(lue lue) {
        jn a2 = cx6.a();
        if (((zw6) this.a).isEmpty()) {
            a(a2, (xj8) this.e, lue);
            if (!f46.B((xj8) this.f, (xj8) this.e)) {
                a(a2, (xj8) this.f, lue);
            }
            if (!f46.B((xj8) this.d, (xj8) this.e) && !f46.B((xj8) this.d, (xj8) this.f)) {
                a(a2, (xj8) this.d, lue);
            }
        } else {
            for (int i = 0; i < ((zw6) this.a).size(); i++) {
                a(a2, (xj8) ((zw6) this.a).get(i), lue);
            }
            if (!((zw6) this.a).contains((xj8) this.d)) {
                a(a2, (xj8) this.d, lue);
            }
        }
        this.c = a2.j();
    }

    public z23(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, rhe rhe, lm7 lm7) {
        this.b = rhe;
        this.d = copyOnWriteArraySet;
        this.c = lm7;
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.a = rhe.a(looper, new hl4(3, this));
    }
}
