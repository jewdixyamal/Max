package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: vk8  reason: default package */
public final class vk8 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public boolean g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public Object l;
    public Object m;

    public vk8(a4c a4c, aab aab, gy0 gy0, gy0 gy02, xx0 xx0, wte wte) {
        this.a = 3;
        this.h = a4c;
        this.b = aab;
        this.c = gy0;
        this.e = gy02;
        this.i = xx0;
        this.j = wte;
        this.k = new Handler(Looper.getMainLooper());
        this.f = new LinkedHashSet();
        this.d = new HashMap();
        this.m = new i0e(this);
    }

    public lue a(int i2, List list, cod cod) {
        if (!list.isEmpty()) {
            this.l = cod;
            for (int i3 = i2; i3 < list.size() + i2; i3++) {
                sk8 sk8 = (sk8) list.get(i3 - i2);
                ArrayList arrayList = (ArrayList) this.b;
                if (i3 > 0) {
                    sk8 sk82 = (sk8) arrayList.get(i3 - 1);
                    sk8.d = sk82.a.o.b.p() + sk82.d;
                    sk8.e = false;
                    sk8.c.clear();
                } else {
                    sk8.d = 0;
                    sk8.e = false;
                    sk8.c.clear();
                }
                int p = sk8.a.o.b.p();
                for (int i4 = i3; i4 < arrayList.size(); i4++) {
                    ((sk8) arrayList.get(i4)).d += p;
                }
                arrayList.add(i3, sk8);
                ((HashMap) this.d).put(sk8.b, sk8);
                if (this.g) {
                    k(sk8);
                    if (((IdentityHashMap) this.c).isEmpty()) {
                        ((HashSet) this.f).add(sk8);
                    } else {
                        qk8 qk8 = (qk8) ((HashMap) this.e).get(sk8);
                        if (qk8 != null) {
                            qk8.a.b(qk8.b);
                        }
                    }
                }
            }
        }
        return e();
    }

    public mue b(int i2, List list, dod dod) {
        if (!list.isEmpty()) {
            this.l = dod;
            for (int i3 = i2; i3 < list.size() + i2; i3++) {
                tk8 tk8 = (tk8) list.get(i3 - i2);
                ArrayList arrayList = (ArrayList) this.b;
                if (i3 > 0) {
                    tk8 tk82 = (tk8) arrayList.get(i3 - 1);
                    tk8.d = tk82.a.o.e.p() + tk82.d;
                    tk8.e = false;
                    tk8.c.clear();
                } else {
                    tk8.d = 0;
                    tk8.e = false;
                    tk8.c.clear();
                }
                int p = tk8.a.o.e.p();
                for (int i4 = i3; i4 < arrayList.size(); i4++) {
                    ((tk8) arrayList.get(i4)).d += p;
                }
                arrayList.add(i3, tk8);
                ((HashMap) this.d).put(tk8.b, tk8);
                if (this.g) {
                    l(tk8);
                    if (((IdentityHashMap) this.c).isEmpty()) {
                        ((HashSet) this.f).add(tk8);
                    } else {
                        rk8 rk8 = (rk8) ((HashMap) this.e).get(tk8);
                        if (rk8 != null) {
                            rk8.a.d(rk8.b);
                        }
                    }
                }
            }
        }
        return f();
    }

    public void c(m1e m1e, long j2, TimeUnit timeUnit) {
        ((HashMap) this.d).put(m1e, new bbg(j2, timeUnit));
    }

    public void d(gjd gjd, float f2, RectF rectF, ey1 ey1, Path path) {
        int i2;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        pjd[] pjdArr;
        Path path2;
        Path path3;
        vk8 vk8 = this;
        gjd gjd2 = gjd;
        float f3 = f2;
        RectF rectF2 = rectF;
        ey1 ey12 = ey1;
        Path path4 = path;
        path.rewind();
        Path path5 = (Path) vk8.e;
        path5.rewind();
        Path path6 = (Path) vk8.i;
        path6.rewind();
        path6.addRect(rectF2, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            i2 = 4;
            matrixArr = (Matrix[]) vk8.c;
            fArr = (float[]) vk8.k;
            matrixArr2 = (Matrix[]) vk8.b;
            pjdArr = (pjd[]) vk8.h;
            if (i3 >= 4) {
                break;
            }
            hx3 hx3 = i3 != 1 ? i3 != 2 ? i3 != 3 ? gjd2.f : gjd2.e : gjd2.h : gjd2.g;
            hm9 hm9 = i3 != 1 ? i3 != 2 ? i3 != 3 ? gjd2.b : gjd2.a : gjd2.d : gjd2.c;
            pjd pjd = pjdArr[i3];
            hm9.getClass();
            hm9.B(pjd, f3, hx3.a(rectF2));
            int i4 = i3 + 1;
            float f4 = (float) ((i4 % 4) * 90);
            matrixArr2[i3].reset();
            PointF pointF = (PointF) vk8.d;
            int i5 = i4;
            if (i3 == 1) {
                path3 = path5;
                pointF.set(rectF2.right, rectF2.bottom);
            } else if (i3 == 2) {
                path3 = path5;
                pointF.set(rectF2.left, rectF2.bottom);
            } else if (i3 != 3) {
                path3 = path5;
                pointF.set(rectF2.right, rectF2.top);
            } else {
                path3 = path5;
                pointF.set(rectF2.left, rectF2.top);
            }
            matrixArr2[i3].setTranslate(pointF.x, pointF.y);
            matrixArr2[i3].preRotate(f4);
            pjd pjd2 = pjdArr[i3];
            fArr[0] = pjd2.c;
            fArr[1] = pjd2.d;
            matrixArr2[i3].mapPoints(fArr);
            matrixArr[i3].reset();
            matrixArr[i3].setTranslate(fArr[0], fArr[1]);
            matrixArr[i3].preRotate(f4);
            i3 = i5;
            path5 = path3;
        }
        Path path7 = path5;
        int i6 = 0;
        while (i6 < i2) {
            pjd pjd3 = pjdArr[i6];
            fArr[0] = pjd3.a;
            fArr[1] = pjd3.b;
            matrixArr2[i6].mapPoints(fArr);
            if (i6 == 0) {
                path4.moveTo(fArr[0], fArr[1]);
            } else {
                path4.lineTo(fArr[0], fArr[1]);
            }
            pjdArr[i6].b(matrixArr2[i6], path4);
            if (ey12 != null) {
                pjd pjd4 = pjdArr[i6];
                Matrix matrix = matrixArr2[i6];
                q18 q18 = (q18) ey12.b;
                BitSet bitSet = q18.o;
                pjd4.getClass();
                bitSet.set(i6, false);
                pjd4.a(pjd4.f);
                q18.b[i6] = new ijd(new ArrayList(pjd4.h), new Matrix(matrix));
            }
            int i7 = i6 + 1;
            int i8 = i7 % 4;
            pjd pjd5 = pjdArr[i6];
            fArr[0] = pjd5.c;
            fArr[1] = pjd5.d;
            matrixArr2[i6].mapPoints(fArr);
            pjd pjd6 = pjdArr[i8];
            float f5 = pjd6.a;
            float[] fArr2 = (float[]) vk8.f;
            fArr2[0] = f5;
            fArr2[1] = pjd6.b;
            matrixArr2[i8].mapPoints(fArr2);
            int i9 = i7;
            float max = Math.max(((float) Math.hypot((double) (fArr[0] - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
            pjd pjd7 = pjdArr[i6];
            fArr[0] = pjd7.c;
            fArr[1] = pjd7.d;
            matrixArr2[i6].mapPoints(fArr);
            float abs = (i6 == 1 || i6 == 3) ? Math.abs(rectF.centerX() - fArr[0]) : Math.abs(rectF.centerY() - fArr[1]);
            pjd pjd8 = (pjd) vk8.j;
            pjd8.d(0.0f, 0.0f, 270.0f, 0.0f);
            vu4 vu4 = i6 != 1 ? i6 != 2 ? i6 != 3 ? gjd2.j : gjd2.i : gjd2.l : gjd2.k;
            vu4.p(max, abs, f3, pjd8);
            Path path8 = (Path) vk8.l;
            path8.reset();
            pjd8.b(matrixArr[i6], path8);
            if (!vk8.g || (!vu4.n() && !vk8.j(path8, i6) && !vk8.j(path8, i8))) {
                path2 = path7;
                pjd8.b(matrixArr[i6], path4);
            } else {
                path8.op(path8, path6, Path.Op.DIFFERENCE);
                fArr[0] = pjd8.a;
                fArr[1] = pjd8.b;
                matrixArr[i6].mapPoints(fArr);
                path2 = path7;
                path2.moveTo(fArr[0], fArr[1]);
                pjd8.b(matrixArr[i6], path2);
            }
            ey1 ey13 = ey1;
            if (ey13 != null) {
                Matrix matrix2 = matrixArr[i6];
                q18 q182 = (q18) ey13.b;
                q182.o.set(i6 + 4, false);
                pjd8.a(pjd8.f);
                q182.c[i6] = new ijd(new ArrayList(pjd8.h), new Matrix(matrix2));
            }
            vk8 = this;
            gjd2 = gjd;
            ey12 = ey13;
            path7 = path2;
            i6 = i9;
            i2 = 4;
            RectF rectF3 = rectF;
        }
        Path path9 = path7;
        path.close();
        path9.close();
        if (!path9.isEmpty()) {
            path4.op(path9, Path.Op.UNION);
        }
    }

    public lue e() {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty()) {
            return lue.a;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            sk8 sk8 = (sk8) arrayList.get(i3);
            sk8.d = i2;
            i2 += sk8.a.o.b.p();
        }
        return new a5b(arrayList, (cod) this.l);
    }

    public mue f() {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty()) {
            return mue.a;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            tk8 tk8 = (tk8) arrayList.get(i3);
            tk8.d = i2;
            i2 += tk8.a.o.e.p();
        }
        return new b5b(arrayList, (dod) this.l);
    }

    public void g() {
        switch (this.a) {
            case 0:
                Iterator it = ((HashSet) this.f).iterator();
                while (it.hasNext()) {
                    sk8 sk8 = (sk8) it.next();
                    if (sk8.c.isEmpty()) {
                        qk8 qk8 = (qk8) ((HashMap) this.e).get(sk8);
                        if (qk8 != null) {
                            qk8.a.b(qk8.b);
                        }
                        it.remove();
                    }
                }
                return;
            default:
                Iterator it2 = ((HashSet) this.f).iterator();
                while (it2.hasNext()) {
                    tk8 tk8 = (tk8) it2.next();
                    if (tk8.c.isEmpty()) {
                        rk8 rk8 = (rk8) ((HashMap) this.e).get(tk8);
                        if (rk8 != null) {
                            rk8.a.d(rk8.b);
                        }
                        it2.remove();
                    }
                }
                return;
        }
    }

    public void h(sk8 sk8) {
        if (sk8.e && sk8.c.isEmpty()) {
            qk8 qk8 = (qk8) ((HashMap) this.e).remove(sk8);
            qk8.getClass();
            dj0 dj0 = qk8.a;
            dj0.l(qk8.b);
            a8g a8g = qk8.c;
            dj0.o(a8g);
            dj0.n(a8g);
            ((HashSet) this.f).remove(sk8);
        }
    }

    public void i(tk8 tk8) {
        if (tk8.e && tk8.c.isEmpty()) {
            rk8 rk8 = (rk8) ((HashMap) this.e).remove(tk8);
            rk8.getClass();
            ej0 ej0 = rk8.a;
            ej0.p(rk8.b);
            imc imc = rk8.c;
            ej0.s(imc);
            ej0.r(imc);
            ((HashSet) this.f).remove(tk8);
        }
    }

    public boolean j(Path path, int i2) {
        Path path2 = (Path) this.m;
        path2.reset();
        ((pjd[]) this.h)[i2].b(((Matrix[]) this.b)[i2], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [a8g, hk8, java.lang.Object, mr4] */
    /* JADX WARNING: type inference failed for: r5v0, types: [ek8, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, ir4] */
    public void k(sk8 sk8) {
        p08 p08 = sk8.a;
        lk8 lk8 = new lk8(this);
        ? obj = new Object();
        obj.o = this;
        obj.b = (gk8) this.j;
        obj.c = (kr4) this.k;
        obj.a = sk8;
        ((HashMap) this.e).put(sk8, new qk8(p08, lk8, obj));
        int i2 = maf.a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, (Handler.Callback) null);
        p08.getClass();
        gk8 gk8 = p08.c;
        gk8.getClass();
        ? obj2 = new Object();
        obj2.a = handler;
        obj2.b = obj;
        ((CopyOnWriteArrayList) gk8.d).add(obj2);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, (Handler.Callback) null);
        kr4 kr4 = p08.d;
        kr4.getClass();
        ? obj3 = new Object();
        obj3.a = handler2;
        obj3.b = obj;
        kr4.c.add(obj3);
        p08.h(lk8, (y0f) this.m, (i4b) this.h);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [fk8, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, jr4] */
    public void l(tk8 tk8) {
        q08 q08 = tk8.a;
        mk8 mk8 = new mk8(this);
        imc imc = new imc((Object) this, 25, (Object) tk8);
        ((HashMap) this.e).put(tk8, new rk8(q08, mk8, imc));
        Handler p = oaf.p((hl4) null);
        q08.getClass();
        jn jnVar = q08.c;
        jnVar.getClass();
        ? obj = new Object();
        obj.a = p;
        obj.b = imc;
        ((CopyOnWriteArrayList) jnVar.o).add(obj);
        Handler p2 = oaf.p((hl4) null);
        lr4 lr4 = q08.d;
        lr4.getClass();
        ? obj2 = new Object();
        obj2.a = p2;
        obj2.b = imc;
        lr4.c.add(obj2);
        q08.l(mk8, (z0f) this.m, (j4b) this.h);
    }

    public void m(zbg zbg) {
        Handler handler = (Handler) this.k;
        if (!tpa.f(handler.getLooper().getThread(), Thread.currentThread())) {
            handler.post(new f0e(this, zbg, 0));
        } else if (!this.g) {
            ((LinkedHashSet) this.f).add(zbg);
        }
    }

    public void n(yd8 yd8) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.c;
        sk8 sk8 = (sk8) identityHashMap.remove(yd8);
        sk8.getClass();
        sk8.a.k(yd8);
        sk8.c.remove(((j08) yd8).a);
        if (!identityHashMap.isEmpty()) {
            g();
        }
        h(sk8);
    }

    public void o(zd8 zd8) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.c;
        tk8 tk8 = (tk8) identityHashMap.remove(zd8);
        tk8.getClass();
        tk8.a.o(zd8);
        tk8.c.remove(((k08) zd8).a);
        if (!identityHashMap.isEmpty()) {
            g();
        }
        i(tk8);
    }

    public void p(int i2, int i3) {
        switch (this.a) {
            case 0:
                for (int i4 = i3 - 1; i4 >= i2; i4--) {
                    ArrayList arrayList = (ArrayList) this.b;
                    sk8 sk8 = (sk8) arrayList.remove(i4);
                    ((HashMap) this.d).remove(sk8.b);
                    int i5 = -sk8.a.o.b.p();
                    for (int i6 = i4; i6 < arrayList.size(); i6++) {
                        ((sk8) arrayList.get(i6)).d += i5;
                    }
                    sk8.e = true;
                    if (this.g) {
                        h(sk8);
                    }
                }
                return;
            default:
                for (int i7 = i3 - 1; i7 >= i2; i7--) {
                    ArrayList arrayList2 = (ArrayList) this.b;
                    tk8 tk8 = (tk8) arrayList2.remove(i7);
                    ((HashMap) this.d).remove(tk8.b);
                    int i8 = -tk8.a.o.e.p();
                    for (int i9 = i7; i9 < arrayList2.size(); i9++) {
                        ((tk8) arrayList2.get(i9)).d += i8;
                    }
                    tk8.e = true;
                    if (this.g) {
                        i(tk8);
                    }
                }
                return;
        }
    }

    public vk8() {
        this.a = 2;
        this.h = new pjd[4];
        this.b = new Matrix[4];
        this.c = new Matrix[4];
        this.d = new PointF();
        this.e = new Path();
        this.i = new Path();
        this.j = new pjd();
        this.k = new float[2];
        this.f = new float[2];
        this.l = new Path();
        this.m = new Path();
        this.g = true;
        for (int i2 = 0; i2 < 4; i2++) {
            ((pjd[]) this.h)[i2] = new pjd();
            ((Matrix[]) this.b)[i2] = new Matrix();
            ((Matrix[]) this.c)[i2] = new Matrix();
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [ek8, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, ir4] */
    public vk8(f85 f85, h74 h74, Handler handler, i4b i4b) {
        this.a = 0;
        this.h = i4b;
        this.i = f85;
        this.l = new cod();
        this.c = new IdentityHashMap();
        this.d = new HashMap();
        this.b = new ArrayList();
        gk8 gk8 = new gk8();
        this.j = gk8;
        kr4 kr4 = new kr4();
        this.k = kr4;
        this.e = new HashMap();
        this.f = new HashSet();
        h74.getClass();
        ? obj = new Object();
        obj.a = handler;
        obj.b = h74;
        ((CopyOnWriteArrayList) gk8.d).add(obj);
        ? obj2 = new Object();
        obj2.a = handler;
        obj2.b = h74;
        kr4.c.add(obj2);
    }

    public vk8(uk8 uk8, i74 i74, bie bie, j4b j4b) {
        this.a = 1;
        this.h = j4b;
        this.i = uk8;
        this.l = new dod();
        this.c = new IdentityHashMap();
        this.d = new HashMap();
        this.b = new ArrayList();
        this.j = i74;
        this.k = bie;
        this.e = new HashMap();
        this.f = new HashSet();
    }
}
