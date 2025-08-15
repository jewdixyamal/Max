package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Size;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: qp4  reason: default package */
public final class qp4 implements s24, Provider {
    public static final pq9 u0 = new Object();
    public static volatile qp4 v0;
    public Object X;
    public Object Y;
    public Object Z;
    public Object a;
    public Object b;
    public Object c;
    public Object o;
    public Object s0 = r0e.a(0);
    public Object t0;

    /* JADX WARNING: type inference failed for: r6v1, types: [java.lang.Object, adb] */
    public qp4(Context context) {
        khe khe = new khe(new a5(context, 27));
        this.b = new h7b(context, 2);
        this.c = new wva(context);
        this.o = new td(context);
        ? obj = new Object();
        obj.a = bcd.a0(sba.d, sba.e, sba.f, sba.g);
        obj.b = khe;
        obj.c = tu0.r(3, new zj7(22, obj));
        this.X = obj;
        this.Y = new pl8(khe);
        q0e a2 = r0e.a(i());
        this.Z = a2;
        this.t0 = new w7c(a2);
        this.a = "Chroma";
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.qp4 r6, long r7, defpackage.uaa r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof defpackage.op4
            if (r0 == 0) goto L_0x0013
            r0 = r10
            op4 r0 = (defpackage.op4) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.t0 = r1
            goto L_0x0018
        L_0x0013:
            op4 r0 = new op4
            r0.<init>(r6, r10)
        L_0x0018:
            java.lang.Object r10 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            long r7 = r0.Y
            uaa r9 = r0.X
            qp4 r6 = r0.o
            defpackage.od2.a0(r10)
        L_0x002c:
            r3 = r7
            r5 = r9
            goto L_0x004d
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            defpackage.od2.a0(r10)
            r0.o = r6
            r0.X = r9
            r0.Y = r7
            r0.t0 = r3
            java.lang.Object r10 = r6.c
            w23 r10 = (defpackage.w23) r10
            java.lang.Object r10 = r10.a(r7, r0)
            if (r10 != r1) goto L_0x002c
            goto L_0x0077
        L_0x004d:
            java.lang.Object r6 = r6.Z
            je7 r6 = (defpackage.je7) r6
            java.lang.Object r6 = r6.getValue()
            pk r6 = (defpackage.pk) r6
            k4a r6 = (defpackage.k4a) r6
            boolean r7 = r6.o(r3)
            if (r7 != 0) goto L_0x0060
            goto L_0x0075
        L_0x0060:
            hp4 r7 = new hp4
            m7b r8 = r6.y()
            p7b r8 = (defpackage.p7b) r8
            t33 r8 = r8.a
            long r1 = r8.o()
            r0 = r7
            r0.<init>(r1, r3, r5)
            defpackage.k4a.w(r6, r7)
        L_0x0075:
            e5f r1 = defpackage.e5f.a
        L_0x0077:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qp4.a(qp4, long, uaa, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static void c(ViewGroup viewGroup, fka fka) {
        l6d.X(l6d.f0(v3c.F(new at(7, viewGroup), new k8(0), new l8(0, fka)), new l8(1, fka)));
    }

    public static /* synthetic */ void d(qp4 qp4, ViewGroup viewGroup) {
        fka i = qp4.i();
        qp4.getClass();
        c(viewGroup, i);
    }

    public ic0 b() {
        String str = ((String) this.a) == null ? " mimeType" : "";
        if (((Integer) this.b) == null) {
            str = str.concat(" profile");
        }
        if (((bue) this.c) == null) {
            str = au1.g(str, " inputTimebase");
        }
        if (((Size) this.o) == null) {
            str = au1.g(str, " resolution");
        }
        if (((Integer) this.X) == null) {
            str = au1.g(str, " colorFormat");
        }
        if (((jc0) this.Y) == null) {
            str = au1.g(str, " dataSpace");
        }
        if (((Integer) this.Z) == null) {
            str = au1.g(str, " frameRate");
        }
        if (((Integer) this.s0) == null) {
            str = au1.g(str, " IFrameInterval");
        }
        if (((Integer) this.t0) == null) {
            str = au1.g(str, " bitrate");
        }
        if (str.isEmpty()) {
            return new ic0((String) this.a, ((Integer) this.b).intValue(), (bue) this.c, (Size) this.o, ((Integer) this.X).intValue(), (jc0) this.Y, ((Integer) this.Z).intValue(), ((Integer) this.s0).intValue(), ((Integer) this.t0).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public va8 e() {
        return (va8) this.t0;
    }

    public List f(long j, vk6 vk6, int i, int i2, long j2, long j3) {
        vk6 vk62 = vk6;
        int i3 = i;
        int i4 = i2;
        if (!(vk62 instanceof es8)) {
            hm9.p("qp4", "item must be instanceof Message", (Throwable) null);
            return Collections.emptyList();
        }
        es8 es8 = (es8) vk62;
        if (i4 > 0) {
            h(es8, i2, 0);
        }
        if (i3 > 0) {
            h(es8, 0, i);
        }
        return ((s24) this.b).f(j, vk6, i, i2, j2, j3);
    }

    public sba g() {
        sba sba = sba.d;
        sba f = ((adb) this.X).f(((SharedPreferences) ((je7) ((pl8) this.Y).c).getValue()).getString("themename", sba.a));
        return f == null ? sba : f;
    }

    public Object get() {
        return new t8f((Context) ((Provider) this.b).get(), (g99) ((Provider) this.c).get(), (h45) ((Provider) this.a).get(), (z77) ((Provider) this.o).get(), (Executor) ((Provider) this.X).get(), (fhe) ((Provider) this.Y).get(), (d9f) ((Provider) this.Z).get(), (d9f) ((Provider) this.s0).get(), (l33) ((Provider) this.t0).get());
    }

    public void h(es8 es8, int i, int i2) {
        es8 es82 = es8;
        zc8 d = ((ad8) this.t0).d();
        cu8 cu8 = es82.a;
        long j = cu8.c;
        if (d.d == cu8.t0) {
            if (d.c.containsAll((Set) this.s0)) {
                if (i > 0) {
                    long j2 = d.b;
                    if (j2 != 0) {
                        j = j2;
                    }
                }
                if (i2 > 0) {
                    long j3 = d.a;
                    if (j3 != 0) {
                        j = j3;
                    }
                }
            }
        }
        e52 e52 = (e52) this.Z;
        drd K = ((k4a) ((pk) this.X)).K(new au(e52.b.a, Long.valueOf(j), (Set) this.s0, Integer.valueOf(i), Integer.valueOf(i2)), muc.d);
        fme fme = (fme) this.Y;
        fme.getClass();
        de2 de2 = (de2) K.j(new dme(fme, 2, 0)).e();
        List c2 = de2.c();
        ((au8) this.a).g(e52.a, ((p7b) ((m7b) this.o)).a.t(), c2);
        p82 p82 = (p82) this.c;
        p82.getClass();
        cu8 cu82 = es82.a;
        long j4 = cu82.b;
        long j5 = cu82.o;
        long j6 = e52.a;
        p82.h(j6, false, new j82(p82, (Set) this.s0, de2, i2, j4, i, j5, j6));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0022, code lost:
        r0 = r0.a(j());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.fka i() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.Y
            pl8 r0 = (defpackage.pl8) r0
            java.lang.Object r0 = r0.c
            je7 r0 = (defpackage.je7) r0
            java.lang.Object r0 = r0.getValue()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            sba r1 = defpackage.sba.d
            java.lang.String r2 = r1.a
            java.lang.String r3 = "themename"
            java.lang.String r0 = r0.getString(r3, r2)
            java.lang.Object r2 = r4.X
            adb r2 = (defpackage.adb) r2
            sba r0 = r2.f(r0)
            if (r0 == 0) goto L_0x002c
            boolean r2 = r4.j()
            fka r0 = r0.a(r2)
            if (r0 != 0) goto L_0x0034
        L_0x002c:
            boolean r4 = r4.j()
            fka r0 = r1.a(r4)
        L_0x0034:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qp4.i():fka");
    }

    public boolean j() {
        gq9 y = ((pl8) this.Y).y();
        if (y instanceof bq9) {
            if (((int) ((Math.log10((double) ote.d(((Number) ((q0e) ((td) this.o).c).getValue()).floatValue(), 0.0f, 10000.0f)) / ((double) 4)) * ((double) 100))) > ((bq9) y).b) {
                return false;
            }
        } else if (y instanceof eq9) {
            return ((eq9) y).b();
        } else {
            if (y.equals(fq9.b)) {
                if (((l63) ((q0e) ((wva) this.c).b).getValue()) != l63.b) {
                    return false;
                }
            } else if (!y.equals(dq9.b)) {
                if (y.equals(cq9.b)) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }

    public void k(gq9 gq9) {
        pl8 pl8 = (pl8) this.Y;
        SharedPreferences.Editor edit = ((SharedPreferences) ((je7) pl8.c).getValue()).edit();
        gq9.a.getClass();
        edit.putString("nightmode", yb9.g(gq9));
        edit.apply();
        ((kld) pl8.b).g("nightmode");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        r0 = (defpackage.adb) r4.X;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l(java.lang.String r5, boolean r6) {
        /*
            r4 = this;
            fka r0 = r4.i()
            java.lang.String r0 = r0.getName()
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000f
            return
        L_0x000f:
            java.lang.Object r0 = r4.X
            adb r0 = (defpackage.adb) r0
            sba r5 = r0.f(r5)
            if (r5 == 0) goto L_0x00a1
            java.lang.Object r1 = r4.Z
            q0e r1 = (defpackage.q0e) r1
            if (r6 == 0) goto L_0x0096
            java.lang.Object r6 = r0.c
            je7 r6 = (defpackage.je7) r6
            java.lang.Object r6 = r6.getValue()
            java.util.concurrent.ConcurrentHashMap r6 = (java.util.concurrent.ConcurrentHashMap) r6
            java.lang.String r2 = r5.a
            r6.put(r2, r5)
            java.lang.Object r6 = r0.a
            java.util.Set r6 = (java.util.Set) r6
            boolean r3 = r6 instanceof java.util.Collection
            if (r3 == 0) goto L_0x003c
            boolean r3 = r6.isEmpty()
            if (r3 != 0) goto L_0x0081
        L_0x003c:
            java.util.Iterator r6 = r6.iterator()
        L_0x0040:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x0081
            java.lang.Object r3 = r6.next()
            sba r3 = (defpackage.sba) r3
            java.lang.String r3 = r3.a
            boolean r3 = defpackage.tpa.f(r3, r2)
            if (r3 == 0) goto L_0x0040
            java.lang.Object r6 = r4.Y
            pl8 r6 = (defpackage.pl8) r6
            java.lang.Object r0 = r6.c
            je7 r0 = (defpackage.je7) r0
            java.lang.Object r0 = r0.getValue()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r3 = "themename"
            r0.putString(r3, r2)
            r0.apply()
            java.lang.Object r6 = r6.b
            kld r6 = (defpackage.kld) r6
            r6.g(r3)
            boolean r4 = r4.j()
            fka r4 = r5.a(r4)
            r1.setValue(r4)
            goto L_0x00a1
        L_0x0081:
            java.lang.Object r4 = r0.b
            je7 r4 = (defpackage.je7) r4
            java.lang.Object r4 = r4.getValue()
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4
            r4.edit()
            jr9 r4 = new jr9
            java.lang.String r5 = "An operation is not implemented: ONEME-18754 Добавить поддержку кастомных тем"
            r4.<init>(r5)
            throw r4
        L_0x0096:
            boolean r4 = r4.j()
            fka r4 = r5.a(r4)
            r1.setValue(r4)
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qp4.l(java.lang.String, boolean):void");
    }
}
