package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.futuremind.recyclerviewfastscroll.FastScroller;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: r15  reason: default package */
public final class r15 extends tdc {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;
    public final Object d;

    public r15(z15 z15, t15 t15) {
        this.a = 0;
        this.d = z15;
        this.c = t15;
        this.b = 1;
    }

    public void a(RecyclerView recyclerView, int i) {
        switch (this.a) {
            case 1:
                FastScroller fastScroller = (FastScroller) this.c;
                if (i == 0 && this.b != 0) {
                    gxc viewProvider = fastScroller.getViewProvider();
                    viewProvider.getClass();
                    if (viewProvider.a() != null) {
                        viewProvider.a().getClass();
                    }
                } else if (i != 0 && this.b == 0) {
                    gxc viewProvider2 = fastScroller.getViewProvider();
                    viewProvider2.getClass();
                    if (viewProvider2.a() != null) {
                        viewProvider2.a().getClass();
                    }
                }
                this.b = i;
                return;
            default:
                return;
        }
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        switch (this.a) {
            case 0:
                z15 z15 = (z15) this.d;
                z15.post(new q15(i, i2, this, z15));
                return;
            default:
                FastScroller fastScroller = (FastScroller) this.c;
                if (fastScroller.o != null && !fastScroller.z0 && fastScroller.b.getChildCount() > 0) {
                    c(recyclerView);
                    return;
                }
                return;
        }
    }

    public void c(RecyclerView recyclerView) {
        int computeHorizontalScrollOffset;
        int computeHorizontalScrollExtent;
        int computeHorizontalScrollRange;
        FastScroller fastScroller = (FastScroller) this.c;
        if (fastScroller.c()) {
            computeHorizontalScrollOffset = recyclerView.computeVerticalScrollOffset();
            computeHorizontalScrollExtent = recyclerView.computeVerticalScrollExtent();
            computeHorizontalScrollRange = recyclerView.computeVerticalScrollRange();
        } else {
            computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            computeHorizontalScrollExtent = recyclerView.computeHorizontalScrollExtent();
            computeHorizontalScrollRange = recyclerView.computeHorizontalScrollRange();
        }
        fastScroller.setScrollerPosition(((float) computeHorizontalScrollOffset) / ((float) (computeHorizontalScrollRange - computeHorizontalScrollExtent)));
        Iterator it = ((ArrayList) this.d).iterator();
        if (it.hasNext()) {
            au1.r(it.next());
            throw null;
        }
    }

    public r15(FastScroller fastScroller) {
        this.a = 1;
        this.d = new ArrayList();
        this.b = 0;
        this.c = fastScroller;
    }
}
