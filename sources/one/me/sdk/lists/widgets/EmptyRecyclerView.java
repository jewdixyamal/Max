package one.me.sdk.lists.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R/\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e8B@BX\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0011¨\u0006\u0019"}, d2 = {"Lone/me/sdk/lists/widgets/EmptyRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lhdc;", "adapter", "Le5f;", "setAdapter", "(Lhdc;)V", "Landroid/view/View;", "emptyView", "setEmptyView", "(Landroid/view/View;)V", "<set-?>", "V1", "Ls7c;", "getMEmptyView", "()Landroid/view/View;", "setMEmptyView", "mEmptyView", "lists_release"}, k = 1, mv = {2, 0, 0})
public class EmptyRecyclerView extends RecyclerView {
    public static final /* synthetic */ bc7[] Y1;
    public final u2 V1 = new qz4(this, 0);
    public jdc W1;
    public final LinkedHashSet X1 = new LinkedHashSet();

    static {
        oi9 oi9 = new oi9(EmptyRecyclerView.class, "mEmptyView", "getMEmptyView()Landroid/view/View;");
        nec.a.getClass();
        Y1 = new bc7[]{oi9};
    }

    public EmptyRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static void K0(hdc hdc, jdc jdc) {
        if (jdc != null) {
            try {
                hdc.z(jdc);
            } catch (Exception e) {
                hm9.l0(hdc.getClass().getName(), "fail to unregister data observer", e);
            }
        }
    }

    public static void L0(hdc hdc, jdc jdc) {
        if (jdc != null) {
            try {
                hdc.B(jdc);
            } catch (Exception e) {
                hm9.l0(hdc.getClass().getName(), "fail to unregister data observer", e);
            }
        }
    }

    private final View getMEmptyView() {
        bc7 bc7 = Y1[0];
        return (View) this.V1.b;
    }

    private final void setMEmptyView(View view) {
        this.V1.o1(this, Y1[0], view);
    }

    public final void F0() {
        if (getMEmptyView() != null && getAdapter() != null) {
            hdc adapter = getAdapter();
            int i = 0;
            boolean z = adapter != null && adapter.j() == 0;
            View mEmptyView = getMEmptyView();
            if (mEmptyView != null) {
                mEmptyView.setVisibility(z ? 0 : 8);
            }
            if (z) {
                i = 8;
            }
            setVisibility(i);
        }
    }

    public void G0(hdc hdc) {
    }

    public void H0(hdc hdc) {
    }

    public void I0() {
    }

    public void J0() {
    }

    public final void M0(hdc hdc, boolean z) {
        hdc adapter = getAdapter();
        if (adapter != null) {
            L0(adapter, this.W1);
        }
        J0();
        hdc N0 = N0(hdc);
        setLayoutFrozen(false);
        y0(N0, true, z);
        k0(true);
        requestLayout();
        if (N0 != null) {
            K0(N0, this.W1);
        }
        H0(N0);
    }

    public hdc N0(hdc hdc) {
        return hdc;
    }

    public final void setAdapter(hdc hdc) {
        jdc jdc;
        hdc adapter = getAdapter();
        if (!(adapter == null || (jdc = this.W1) == null)) {
            L0(adapter, jdc);
            this.W1 = null;
        }
        hdc N0 = N0(hdc);
        I0();
        super.setAdapter(N0);
        if (!(N0 == null || getMEmptyView() == null)) {
            pz4 pz4 = new pz4(0, this);
            this.W1 = pz4;
            K0(N0, pz4);
        }
        G0(N0);
        F0();
    }

    public final void setEmptyView(View view) {
        if (!tpa.f(view, getMEmptyView())) {
            View mEmptyView = getMEmptyView();
            if (mEmptyView != null) {
                mEmptyView.setVisibility(8);
            }
            setMEmptyView(view);
            F0();
        }
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        Iterator it = this.X1.iterator();
        if (it.hasNext()) {
            au1.r(it.next());
            throw null;
        }
    }

    public EmptyRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
