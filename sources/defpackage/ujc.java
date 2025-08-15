package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import java.lang.ref.WeakReference;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: ujc  reason: default package */
public final class ujc {
    public final hdc a;
    public int b = -1;
    public int c = 0;
    public final WeakReference d;
    public final gh7 e;
    public boolean f;
    public final sjc g;
    public final ck h;
    public final String i;

    public ujc(hdc hdc, EndlessRecyclerView2 endlessRecyclerView2) {
        eh7 eh7;
        this.a = hdc;
        this.d = new WeakReference(endlessRecyclerView2);
        this.g = new sjc(0, this);
        ck ckVar = new ck(8, this);
        this.h = ckVar;
        this.i = ujc.class.getName();
        endlessRecyclerView2.addOnAttachStateChangeListener(ckVar);
        Context context = endlessRecyclerView2.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                eh7 = null;
                break;
            } else if (context instanceof eh7) {
                eh7 = (eh7) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (eh7 == null) {
            String str = this.i;
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.X, str, "registerLifecycleObserver findLifecycleOwner() is null", (Throwable) null);
            }
        } else {
            gh7 Q = eh7.Q();
            this.e = Q;
            if (Q != null) {
                Q.a(this.g);
            }
            this.f = !eh7.Q().d.a(fg7.o);
        }
        this.h.onViewAttachedToWindow(endlessRecyclerView2);
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [androidx.recyclerview.widget.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(androidx.recyclerview.widget.RecyclerView r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.i
            ir6 r1 = defpackage.hm9.m
            r2 = 0
            if (r1 != 0) goto L_0x0008
            goto L_0x0015
        L_0x0008:
            boolean r3 = r1.c()
            if (r3 == 0) goto L_0x0015
            us7 r3 = defpackage.us7.X
            java.lang.String r4 = "attachAdapter"
            r1.d(r3, r0, r4, r2)
        L_0x0015:
            hdc r0 = r5.a
            androidx.recyclerview.widget.b r1 = r6.getRecycledViewPool()
            r6.setRecycledViewPool(r2)
            hdc r3 = r6.getAdapter()
            if (r3 == r0) goto L_0x0027
            r6.setAdapter(r0)
        L_0x0027:
            r6.setRecycledViewPool(r1)
            int r0 = r5.b
            r1 = -1
            if (r0 == r1) goto L_0x0043
            androidx.recyclerview.widget.a r6 = r6.getLayoutManager()
            boolean r0 = r6 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L_0x003a
            r2 = r6
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
        L_0x003a:
            if (r2 == 0) goto L_0x0043
            int r6 = r5.b
            int r5 = r5.c
            r2.n1(r6, r5)
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ujc.a(androidx.recyclerview.widget.RecyclerView):void");
    }

    public final void b(RecyclerView recyclerView) {
        String str = this.i;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str, "detachAdapter", (Throwable) null);
        }
        a layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            this.b = linearLayoutManager.W0();
            int i2 = 0;
            View childAt = recyclerView.getChildAt(0);
            if (childAt != null) {
                i2 = childAt.getTop();
            }
            this.c = i2;
        }
        b recycledViewPool = recyclerView.getRecycledViewPool();
        recyclerView.setRecycledViewPool((b) null);
        if (recyclerView.getAdapter() != null) {
            recyclerView.setAdapter((hdc) null);
        }
        recyclerView.setRecycledViewPool(recycledViewPool);
    }
}
