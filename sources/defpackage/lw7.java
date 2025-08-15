package defpackage;

import android.graphics.Bitmap;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.LinkedList;

/* renamed from: lw7  reason: default package */
public final class lw7 implements go0 {
    public int X;
    public final h7b a = new h7b(6);
    public final int b = 0;
    public final int c;
    public final o5b o;

    public lw7(int i, rq9 rq9) {
        this.c = i;
        this.o = rq9;
    }

    public final synchronized void a() {
        while (true) {
            if (this.X <= 0) {
                break;
            }
            Bitmap bitmap = (Bitmap) this.a.u();
            if (bitmap == null) {
                break;
            }
            this.a.getClass();
            this.X -= qo0.d(bitmap);
            this.o.getClass();
        }
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [java.lang.Object, qs0] */
    public final void e(Object obj) {
        boolean add;
        Bitmap bitmap = (Bitmap) obj;
        this.a.getClass();
        int d = qo0.d(bitmap);
        if (d <= this.c) {
            this.o.getClass();
            h7b h7b = this.a;
            h7b.getClass();
            if (h7b.r(bitmap)) {
                synchronized (h7b) {
                    add = ((HashSet) h7b.b).add(bitmap);
                }
                if (add) {
                    bkb bkb = (bkb) h7b.c;
                    int d2 = qo0.d(bitmap);
                    synchronized (bkb) {
                        try {
                            qs0 qs0 = (qs0) ((SparseArray) bkb.a).get(d2);
                            qs0 qs02 = qs0;
                            if (qs0 == null) {
                                LinkedList linkedList = new LinkedList();
                                ? obj2 = new Object();
                                obj2.a = null;
                                obj2.b = d2;
                                obj2.c = linkedList;
                                obj2.d = null;
                                ((SparseArray) bkb.a).put(d2, obj2);
                                qs02 = obj2;
                            }
                            qs02.c.addLast(bitmap);
                            if (((qs0) bkb.b) != qs02) {
                                bkb.t(qs02);
                                qs0 qs03 = (qs0) bkb.b;
                                if (qs03 == null) {
                                    bkb.b = qs02;
                                    bkb.c = qs02;
                                } else {
                                    qs02.d = qs03;
                                    qs03.a = qs02;
                                    bkb.b = qs02;
                                }
                            }
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                            }
                        }
                    }
                }
            }
            synchronized (this) {
                this.X += d;
            }
        }
    }

    public final Object get(int i) {
        Bitmap g;
        synchronized (this) {
            try {
                if (this.X > this.b) {
                    a();
                }
                g = this.a.g(i);
                if (g != null) {
                    this.a.getClass();
                    this.X -= qo0.d(g);
                    this.o.getClass();
                } else {
                    this.o.getClass();
                    g = Bitmap.createBitmap(1, i, Bitmap.Config.ALPHA_8);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return g;
    }
}
