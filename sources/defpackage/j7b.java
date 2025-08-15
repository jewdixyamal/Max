package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import java.util.List;

/* renamed from: j7b  reason: default package */
public final class j7b extends tdc {
    public static final /* synthetic */ bc7[] m;
    public static final String n;
    public final k56 a;
    public final int b;
    public final boolean c;
    public final sj3 d;
    public final gi9 e = new gi9(10);
    public final gi9 f = new gi9(10);
    public boolean g;
    public int h = -1;
    public int i = -1;
    public int j;
    public final HashSet k;
    public final yj l;

    static {
        Class<j7b> cls = j7b.class;
        oi9 oi9 = new oi9(cls, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;");
        nec.a.getClass();
        m = new bc7[]{oi9};
        n = cls.getName();
    }

    public j7b(p59 p59, int i2, boolean z, sj3 sj3) {
        this.a = p59;
        this.b = i2;
        this.c = z;
        this.d = sj3;
        this.k = new HashSet(i2);
        this.l = new yj(21, this);
    }

    public final void a(RecyclerView recyclerView, int i2) {
        this.l.o1(this, m[0], recyclerView);
    }

    public final void b(RecyclerView recyclerView, int i2, int i3) {
        this.l.o1(this, m[0], recyclerView);
        if (this.c && this.g && this.d != null) {
            HashSet hashSet = this.k;
            try {
                hashSet.clear();
                c();
                hashSet.clear();
            } catch (Throwable th) {
                hm9.p(n, "tryToPrefetch failure!", th);
            }
        }
    }

    public final void c() {
        hdc adapter;
        sj3 sj3;
        int h2;
        boolean z = false;
        bc7 bc7 = m[0];
        RecyclerView recyclerView = (RecyclerView) this.l.b;
        if (recyclerView != null) {
            boolean z2 = false;
            int i2 = 0;
            int i3 = -1;
            int i4 = -1;
            while (true) {
                boolean z3 = i2 < recyclerView.getChildCount();
                HashSet hashSet = this.k;
                gi9 gi9 = this.f;
                if (z3) {
                    int i5 = i2 + 1;
                    View childAt = recyclerView.getChildAt(i2);
                    if (childAt != null) {
                        try {
                            dec T = recyclerView.T(childAt);
                            bv8 bv8 = T instanceof bv8 ? (bv8) T : null;
                            if (bv8 != null) {
                                ht8 ht8 = (ht8) bv8;
                                if (ht8.O0) {
                                    long j2 = ht8.P0;
                                    boolean a2 = gi9.a(j2);
                                    if (a2) {
                                        hashSet.add(Long.valueOf(j2));
                                    }
                                    z2 = z2 || a2;
                                    if (z2 && (h2 = ((dec) bv8).h()) != -1) {
                                        i3 = Math.min(i3, h2);
                                        i4 = Math.max(i4, h2);
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        i2 = i5;
                    } else {
                        throw new IndexOutOfBoundsException();
                    }
                } else {
                    gi9 gi92 = this.e;
                    if (gi92.j() && !tpa.f(gi9, gi92)) {
                        z = true;
                    }
                    this.g = z;
                    if (z2 && (adapter = recyclerView.getAdapter()) != null) {
                        int size = hashSet.size();
                        if (size > 0) {
                            int i6 = this.b;
                            if (((float) size) < ((float) i6) * 0.8f) {
                                if (this.j != adapter.j()) {
                                    this.j = adapter.j();
                                    this.h = -1;
                                    this.i = -1;
                                }
                                int i7 = (i6 - size) / 2;
                                if (i7 != 0) {
                                    List list = (List) this.a.invoke();
                                    if (this.h != i3) {
                                        this.h = i3;
                                        for (Number longValue : mqd.F(list, i3, -i7)) {
                                            long longValue2 = longValue.longValue();
                                            if (gi9.a(longValue2)) {
                                                hashSet.add(Long.valueOf(longValue2));
                                            }
                                        }
                                    }
                                    if (this.i != i4) {
                                        this.i = i4;
                                        for (Number longValue3 : mqd.F(list, i4, i7)) {
                                            long longValue4 = longValue3.longValue();
                                            if (gi9.a(longValue4)) {
                                                hashSet.add(Long.valueOf(longValue4));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if ((!hashSet.isEmpty()) && (sj3 = this.d) != null) {
                            sj3.accept(x53.D0(hashSet));
                        }
                        if (!this.g) {
                            hm9.m(n, "clear", new Object[0]);
                            hashSet.clear();
                            gi9.c();
                            gi92.c();
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }
}
