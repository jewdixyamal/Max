package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: gh7  reason: default package */
public final class gh7 {
    public AtomicReference a = new AtomicReference((Object) null);
    public final boolean b = true;
    public xb5 c = new xb5();
    public fg7 d;
    public final WeakReference e;
    public int f;
    public boolean g;
    public boolean h;
    public final ArrayList i;
    public final q0e j;

    public gh7(eh7 eh7) {
        fg7 fg7 = fg7.b;
        this.d = fg7;
        this.i = new ArrayList();
        this.e = new WeakReference(eh7);
        this.j = r0e.a(fg7);
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [fh7, java.lang.Object] */
    public final void a(ah7 ah7) {
        ug7 ug7;
        eh7 eh7;
        ArrayList arrayList = this.i;
        boolean z = false;
        c("addObserver");
        fg7 fg7 = this.d;
        fg7 fg72 = fg7.a;
        if (fg7 != fg72) {
            fg72 = fg7.b;
        }
        ? obj = new Object();
        HashMap hashMap = ih7.a;
        boolean z2 = ah7 instanceof ug7;
        boolean z3 = ah7 instanceof zb4;
        if (z2 && z3) {
            ug7 = new bc4((zb4) ah7, 0, (ug7) ah7);
        } else if (z3) {
            ug7 = new bc4((zb4) ah7, 0, (Object) null);
        } else if (z2) {
            ug7 = (ug7) ah7;
        } else {
            Class<?> cls = ah7.getClass();
            if (ih7.b(cls) == 2) {
                List list = (List) ih7.b.get(cls);
                if (list.size() != 1) {
                    int size = list.size();
                    fa6[] fa6Arr = new fa6[size];
                    if (size <= 0) {
                        ug7 = new fdc(2, fa6Arr);
                    } else {
                        ih7.a((Constructor) list.get(0), ah7);
                        throw null;
                    }
                } else {
                    ih7.a((Constructor) list.get(0), ah7);
                    throw null;
                }
            } else {
                ug7 = new bc4(ah7);
            }
        }
        obj.b = ug7;
        obj.a = fg72;
        if (((fh7) this.c.b(ah7, obj)) == null && (eh7 = (eh7) this.e.get()) != null) {
            if (this.f != 0 || this.g) {
                z = true;
            }
            fg7 b2 = b(ah7);
            this.f++;
            while (obj.a.compareTo(b2) < 0 && this.c.X.containsKey(ah7)) {
                arrayList.add(obj.a);
                cg7 cg7 = eg7.Companion;
                fg7 fg73 = obj.a;
                cg7.getClass();
                int ordinal = fg73.ordinal();
                eg7 eg7 = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : eg7.ON_RESUME : eg7.ON_START : eg7.ON_CREATE;
                if (eg7 != null) {
                    obj.a(eh7, eg7);
                    arrayList.remove(arrayList.size() - 1);
                    b2 = b(ah7);
                } else {
                    throw new IllegalStateException("no event up from " + obj.a);
                }
            }
            if (!z) {
                g();
            }
            this.f--;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: fg7} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.fg7 b(defpackage.ah7 r5) {
        /*
            r4 = this;
            xb5 r0 = r4.c
            java.util.HashMap r0 = r0.X
            boolean r1 = r0.containsKey(r5)
            r2 = 0
            if (r1 == 0) goto L_0x0014
            java.lang.Object r5 = r0.get(r5)
            oqc r5 = (defpackage.oqc) r5
            oqc r5 = r5.o
            goto L_0x0015
        L_0x0014:
            r5 = r2
        L_0x0015:
            if (r5 == 0) goto L_0x0020
            java.lang.Object r5 = r5.b
            fh7 r5 = (defpackage.fh7) r5
            if (r5 == 0) goto L_0x0020
            fg7 r5 = r5.a
            goto L_0x0021
        L_0x0020:
            r5 = r2
        L_0x0021:
            java.util.ArrayList r0 = r4.i
            boolean r1 = r0.isEmpty()
            r3 = 1
            r1 = r1 ^ r3
            if (r1 == 0) goto L_0x0032
            java.lang.Object r0 = defpackage.wg0.f(r0, r3)
            r2 = r0
            fg7 r2 = (defpackage.fg7) r2
        L_0x0032:
            fg7 r4 = r4.d
            if (r5 == 0) goto L_0x003d
            int r0 = r5.compareTo(r4)
            if (r0 >= 0) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r5 = r4
        L_0x003e:
            if (r2 == 0) goto L_0x0047
            int r4 = r2.compareTo(r5)
            if (r4 >= 0) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r2 = r5
        L_0x0048:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh7.b(ah7):fg7");
    }

    public final void c(String str) {
        if (this.b) {
            ds.g0().d.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(zr6.i("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(eg7 eg7) {
        c("handleLifecycleEvent");
        e(eg7.a());
    }

    public final void e(fg7 fg7) {
        fg7 fg72 = this.d;
        if (fg72 != fg7) {
            fg7 fg73 = fg7.b;
            fg7 fg74 = fg7.a;
            if (fg72 == fg73 && fg7 == fg74) {
                throw new IllegalStateException(("State must be at least CREATED to move to " + fg7 + ", but was " + this.d + " in component " + this.e.get()).toString());
            }
            this.d = fg7;
            if (this.g || this.f != 0) {
                this.h = true;
                return;
            }
            this.g = true;
            g();
            this.g = false;
            if (this.d == fg74) {
                this.c = new xb5();
            }
        }
    }

    public final void f(ah7 ah7) {
        c("removeObserver");
        this.c.c(ah7);
    }

    public final void g() {
        fg7 fg7;
        fg7 fg72;
        eh7 eh7 = (eh7) this.e.get();
        if (eh7 != null) {
            while (true) {
                xb5 xb5 = this.c;
                if (!(xb5.o == 0 || ((fg7 = ((fh7) xb5.a.b).a) == (fg72 = ((fh7) xb5.b.b).a) && this.d == fg72))) {
                    this.h = false;
                    if (this.d.compareTo(fg7) < 0) {
                        xb5 xb52 = this.c;
                        nqc nqc = new nqc(xb52.b, xb52.a, 1);
                        xb52.c.put(nqc, Boolean.FALSE);
                        while (nqc.hasNext() && !this.h) {
                            Map.Entry entry = (Map.Entry) nqc.next();
                            ah7 ah7 = (ah7) entry.getKey();
                            fh7 fh7 = (fh7) entry.getValue();
                            while (fh7.a.compareTo(this.d) > 0 && !this.h && this.c.X.containsKey(ah7)) {
                                cg7 cg7 = eg7.Companion;
                                fg7 fg73 = fh7.a;
                                cg7.getClass();
                                int ordinal = fg73.ordinal();
                                eg7 eg7 = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : eg7.ON_PAUSE : eg7.ON_STOP : eg7.ON_DESTROY;
                                if (eg7 != null) {
                                    this.i.add(eg7.a());
                                    fh7.a(eh7, eg7);
                                    ArrayList arrayList = this.i;
                                    arrayList.remove(arrayList.size() - 1);
                                } else {
                                    throw new IllegalStateException("no event down from " + fh7.a);
                                }
                            }
                        }
                    }
                    oqc oqc = this.c.b;
                    if (!this.h && oqc != null && this.d.compareTo(((fh7) oqc.b).a) > 0) {
                        xb5 xb53 = this.c;
                        xb53.getClass();
                        pqc pqc = new pqc(xb53);
                        xb53.c.put(pqc, Boolean.FALSE);
                        while (pqc.hasNext() && !this.h) {
                            Map.Entry entry2 = (Map.Entry) pqc.next();
                            ah7 ah72 = (ah7) entry2.getKey();
                            fh7 fh72 = (fh7) entry2.getValue();
                            while (fh72.a.compareTo(this.d) < 0 && !this.h && this.c.X.containsKey(ah72)) {
                                this.i.add(fh72.a);
                                cg7 cg72 = eg7.Companion;
                                fg7 fg74 = fh72.a;
                                cg72.getClass();
                                int ordinal2 = fg74.ordinal();
                                eg7 eg72 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : eg7.ON_RESUME : eg7.ON_START : eg7.ON_CREATE;
                                if (eg72 != null) {
                                    fh72.a(eh7, eg72);
                                    ArrayList arrayList2 = this.i;
                                    arrayList2.remove(arrayList2.size() - 1);
                                } else {
                                    throw new IllegalStateException("no event up from " + fh72.a);
                                }
                            }
                        }
                    }
                }
            }
            this.h = false;
            this.j.setValue(this.d);
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }
}
