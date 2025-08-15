package defpackage;

import android.util.Pair;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: nd3  reason: default package */
public final class nd3 extends hdc {
    public final od3 o;

    public nd3(hdc... hdcArr) {
        this(md3.c, hdcArr);
    }

    public final List C() {
        List list;
        ArrayList arrayList = this.o.d;
        if (arrayList.isEmpty()) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((cn9) it.next()).c);
            }
            list = arrayList2;
        }
        return Collections.unmodifiableList(list);
    }

    public final Pair D(int i) {
        od3 od3 = this.o;
        w f = od3.f(i);
        Pair pair = new Pair(((cn9) f.c).c, Integer.valueOf(f.a));
        f.b = false;
        f.c = null;
        f.a = -1;
        od3.h = f;
        return pair;
    }

    public final void E(hdc hdc) {
        od3 od3 = this.o;
        int i = od3.i(hdc);
        if (i != -1) {
            ArrayList arrayList = od3.d;
            cn9 cn9 = (cn9) arrayList.get(i);
            int d = od3.d(cn9);
            arrayList.remove(i);
            ((nd3) od3.e).a.f(d, cn9.e);
            Iterator it = od3.c.iterator();
            while (it.hasNext()) {
                RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
                if (recyclerView != null) {
                    hdc.u(recyclerView);
                }
            }
            cn9.c.B(cn9.f);
            cn9.a.dispose();
            od3.c();
        }
    }

    public final int i(hdc hdc, dec dec, int i) {
        od3 od3 = this.o;
        cn9 cn9 = (cn9) ((IdentityHashMap) od3.g).get(dec);
        if (cn9 == null) {
            return -1;
        }
        int d = i - od3.d(cn9);
        hdc hdc2 = cn9.c;
        int j = hdc2.j();
        if (d >= 0 && d < j) {
            return hdc2.i(hdc, dec, d);
        }
        StringBuilder j2 = wg0.j("Detected inconsistent adapter updates. The local position of the view holder maps to ", d, " which is out of bounds for the adapter with size ", j, ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
        j2.append(dec);
        j2.append("adapter:");
        j2.append(hdc);
        throw new IllegalStateException(j2.toString());
    }

    public final int j() {
        Iterator it = this.o.d.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((cn9) it.next()).e;
        }
        return i;
    }

    public final long k(int i) {
        od3 od3 = this.o;
        w f = od3.f(i);
        cn9 cn9 = (cn9) f.c;
        long j = cn9.b.j(cn9.c.k(f.a));
        f.b = false;
        f.c = null;
        f.a = -1;
        od3.h = f;
        return j;
    }

    public final int l(int i) {
        od3 od3 = this.o;
        w f = od3.f(i);
        cn9 cn9 = (cn9) f.c;
        int o2 = cn9.a.o(cn9.c.l(f.a));
        f.b = false;
        f.c = null;
        f.a = -1;
        od3.h = f;
        return o2;
    }

    public final void q(RecyclerView recyclerView) {
        od3 od3 = this.o;
        ArrayList arrayList = od3.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == recyclerView) {
                return;
            }
        }
        arrayList.add(new WeakReference(recyclerView));
        Iterator it2 = od3.d.iterator();
        while (it2.hasNext()) {
            ((cn9) it2.next()).c.q(recyclerView);
        }
    }

    public final void r(dec dec, int i) {
        od3 od3 = this.o;
        w f = od3.f(i);
        ((IdentityHashMap) od3.g).put(dec, (cn9) f.c);
        ((cn9) f.c).c.h(dec, f.a);
        f.b = false;
        f.c = null;
        f.a = -1;
        od3.h = f;
    }

    public final dec t(ViewGroup viewGroup, int i) {
        cn9 a = ((ipf) this.o.f).a(i);
        return a.c.t(viewGroup, a.a.n(i));
    }

    public final void u(RecyclerView recyclerView) {
        od3 od3 = this.o;
        ArrayList arrayList = od3.c;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            WeakReference weakReference = (WeakReference) arrayList.get(size);
            if (weakReference.get() == null) {
                arrayList.remove(size);
            } else if (weakReference.get() == recyclerView) {
                arrayList.remove(size);
                break;
            }
            size--;
        }
        Iterator it = od3.d.iterator();
        while (it.hasNext()) {
            ((cn9) it.next()).c.u(recyclerView);
        }
    }

    public final boolean v(dec dec) {
        od3 od3 = this.o;
        IdentityHashMap identityHashMap = (IdentityHashMap) od3.g;
        cn9 cn9 = (cn9) identityHashMap.get(dec);
        if (cn9 != null) {
            boolean v = cn9.c.v(dec);
            identityHashMap.remove(dec);
            return v;
        }
        throw new IllegalStateException("Cannot find wrapper for " + dec + ", seems like it is not bound by this adapter: " + od3);
    }

    public final void w(dec dec) {
        this.o.g(dec).c.w(dec);
    }

    public final void x(dec dec) {
        this.o.g(dec).c.x(dec);
    }

    public final void y(dec dec) {
        od3 od3 = this.o;
        IdentityHashMap identityHashMap = (IdentityHashMap) od3.g;
        cn9 cn9 = (cn9) identityHashMap.get(dec);
        if (cn9 != null) {
            cn9.c.y(dec);
            identityHashMap.remove(dec);
            return;
        }
        throw new IllegalStateException("Cannot find wrapper for " + dec + ", seems like it is not bound by this adapter: " + od3);
    }

    public nd3(md3 md3, hdc... hdcArr) {
        List<hdc> asList = Arrays.asList(hdcArr);
        this.o = new od3(this, md3);
        for (hdc a : asList) {
            od3 od3 = this.o;
            od3.a(od3.d.size(), a);
        }
        A(this.o.b == 1 ? false : true);
    }
}
