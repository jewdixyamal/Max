package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.futuremind.recyclerviewfastscroll.FastScroller;
import java.util.WeakHashMap;

/* renamed from: qw3  reason: default package */
public final class qw3 implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qw3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onChildViewAdded(View view, View view2) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = ((CoordinatorLayout) obj).D0;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewAdded(view, view2);
                    return;
                }
                return;
            case 1:
                int i = FastScroller.B0;
                ((FastScroller) obj).b();
                return;
            default:
                zaa zaa = (zaa) obj;
                zaa.getClass();
                boolean z = view2 instanceof TextView;
                WeakHashMap weakHashMap = zaa.b;
                j0e j0e = zaa.a;
                if (z) {
                    weakHashMap.put(view2, e5f.a);
                    TextView textView = (TextView) view2;
                    du4 du4 = (du4) j0e.getValue();
                    Object tag = textView.getTag(zfa.a);
                    kqe kqe = tag instanceof kqe ? (kqe) tag : null;
                    if (kqe != null) {
                        kqe.b(textView, du4);
                        return;
                    }
                    return;
                } else if (view2 instanceof kx5) {
                    weakHashMap.get(view2);
                    ((kx5) view2).a((du4) j0e.getValue());
                    return;
                } else {
                    return;
                }
        }
    }

    public final void onChildViewRemoved(View view, View view2) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                coordinatorLayout.o(2);
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.D0;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewRemoved(view, view2);
                    return;
                }
                return;
            case 1:
                int i = FastScroller.B0;
                ((FastScroller) obj).b();
                return;
            default:
                zaa zaa = (zaa) obj;
                zaa.getClass();
                if ((view2 instanceof TextView) || (view2 instanceof kx5)) {
                    zaa.b.remove(view2);
                    return;
                }
                return;
        }
    }
}
