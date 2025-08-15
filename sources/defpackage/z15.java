package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import one.me.sdk.lists.widgets.EmptyRecyclerView;

/* renamed from: z15  reason: default package */
public class z15 extends EmptyRecyclerView {
    public final LinkedHashSet Z1 = new LinkedHashSet();
    public final LinkedHashSet a2 = new LinkedHashSet();
    public r15 b2;
    public p15 c2;
    public boolean d2;
    public boolean e2;
    public int f2 = 1;
    public Integer g2;
    public tj3 h2;
    public boolean i2;

    public z15(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        super.setOnScrollListener(new s15(0, this));
    }

    /* access modifiers changed from: private */
    public static final void setRefreshingNext$lambda$3(z15 z15) {
        p15 p15 = z15.c2;
        if (p15 != null) {
            if (z15.d2) {
                p15.a.e(p15.j() - 1, 1);
                return;
            }
            p15.m();
        }
    }

    public final void G0(hdc hdc) {
        this.c2 = hdc instanceof p15 ? (p15) hdc : null;
        F0();
    }

    public final hdc N0(hdc hdc) {
        if (hdc instanceof p15) {
            return hdc;
        }
        if (hdc != null) {
            return new p15(this, hdc);
        }
        return null;
    }

    public final void P0(int i) {
        if (Z()) {
            if (i <= 5) {
                post(new l40(i, 9, this));
            }
        } else if (this.e2) {
            p15 p15 = this.c2;
            if (p15 != null) {
                p15.a.e(0, 1);
            }
        } else {
            p15 p152 = this.c2;
            if (p152 != null) {
                p152.a.f(0, 1);
            }
        }
    }

    public hdc getAdapter() {
        return this.c2;
    }

    public final boolean getIgnoreRefreshingFlagsForScrollEvent() {
        return this.i2;
    }

    public final LinearLayoutManager getLinearLayoutManager() {
        a layoutManager = super.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return (LinearLayoutManager) layoutManager;
        }
        return null;
    }

    public final pec getRefreshingNextDelegate() {
        return null;
    }

    public final void h0() {
        Iterator it = this.a2.iterator();
        if (it.hasNext()) {
            au1.r(it.next());
            throw null;
        }
    }

    public final void m(tdc tdc) {
        this.Z1.add(tdc);
    }

    public void onLayout(boolean z, int i, int i3, int i4, int i5) {
        try {
            super.onLayout(z, i, i3, i4, i5);
        } catch (Exception e) {
            hm9.p("EndlessRecyclerView", "onLayout", e);
        }
        r15 r15 = this.b2;
        if (r15 != null) {
            r15.b(this, 0, 0);
        }
    }

    public final void s0(tdc tdc) {
        this.Z1.remove(tdc);
    }

    public final void setIgnoreRefreshingFlagsForScrollEvent(boolean z) {
        this.i2 = z;
    }

    public void setLayoutManager(a aVar) {
        if ((aVar instanceof LinearLayoutManager) || (aVar instanceof StaggeredGridLayoutManager)) {
            super.setLayoutManager(aVar);
            return;
        }
        throw new IllegalArgumentException("layout manager must be an instance of LinearLayoutManager or StaggeredGridLayoutManager");
    }

    public void setOnScrollListener(tdc tdc) {
        throw new UnsupportedOperationException("use addOnScrollListener(OnScrollListener) and removeOnScrollListener(OnScrollListener) instead");
    }

    public final void setPager(t15 t15) {
        if (t15 != null) {
            r15 r15 = new r15(this, t15);
            int i = this.f2;
            if (i > 0) {
                r15.b = i;
                m(r15);
                this.b2 = r15;
                return;
            }
            throw new IllegalArgumentException(zr6.h(i, "illegal threshold: ").toString());
        }
        r15 r152 = this.b2;
        if (r152 != null) {
            s0(r152);
            this.b2 = null;
        }
    }

    public final void setProgressView(int i) {
        this.g2 = Integer.valueOf(i);
        this.h2 = null;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setRefreshingNext(boolean z) {
        if (this.d2 != z) {
            if (z && this.g2 == null) {
                z = false;
            }
            this.d2 = z;
            kp.x(this, new dd4(16, this));
        }
    }

    public final void setRefreshingNextDelegate(pec pec) {
    }

    public final void setRefreshingPrev(boolean z) {
        if (this.e2 != z) {
            if (!z || this.g2 != null) {
                this.e2 = z;
            } else {
                this.e2 = false;
            }
            P0(0);
        }
    }

    public final void setThreshold(int i) {
        this.f2 = i;
        r15 r15 = this.b2;
        if (r15 == null) {
            return;
        }
        if (i > 0) {
            r15.b = i;
            return;
        }
        throw new IllegalArgumentException(zr6.h(i, "illegal threshold: ").toString());
    }
}
