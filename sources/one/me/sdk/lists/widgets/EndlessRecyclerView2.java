package one.me.sdk.lists.widgets;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u00070J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010 \u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u0011R\u001b\u0010&\u001a\u00020!8BX\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0002¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010*R\u0011\u0010/\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", "Lone/me/sdk/lists/widgets/EmptyRecyclerView;", "Lpec;", "delegate", "Le5f;", "setRefreshingNextDelegate", "(Lpec;)V", "Lv15;", "setDelegate", "(Lv15;)V", "Landroidx/recyclerview/widget/a;", "layout", "setLayoutManager", "(Landroidx/recyclerview/widget/a;)V", "", "value", "setRefreshingNext", "(Z)V", "setRefreshingPrev", "Lt15;", "pager", "setPager", "(Lt15;)V", "", "threshold", "setThreshold", "(I)V", "d2", "Z", "getIgnoreRefreshingFlagsForScrollEvent", "()Z", "setIgnoreRefreshingFlagsForScrollEvent", "ignoreRefreshingFlagsForScrollEvent", "", "g2", "Lje7;", "getFrameIntervalNanos", "()J", "frameIntervalNanos", "", "h2", "getTag", "()Ljava/lang/String;", "tag", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLinearLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "linearLayoutManager", "x15", "lists_release"}, k = 1, mv = {2, 0, 0})
public final class EndlessRecyclerView2 extends EmptyRecyclerView {
    public static final /* synthetic */ int i2 = 0;
    public x15 Z1;
    public int a2;
    public boolean b2;
    public boolean c2;
    public boolean d2;
    public v15 e2;
    public final y15 f2;
    public final je7 g2;
    public final je7 h2;

    public EndlessRecyclerView2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final long getFrameIntervalNanos() {
        return ((Number) this.g2.getValue()).longValue();
    }

    private final String getTag() {
        return (String) this.h2.getValue();
    }

    public final void G0(hdc hdc) {
        if (hdc != null) {
            EmptyRecyclerView.K0(hdc, this.f2);
        }
    }

    public final void H0(hdc hdc) {
        if (hdc != null) {
            EmptyRecyclerView.K0(hdc, this.f2);
        }
    }

    public final void I0() {
        hdc adapter = getAdapter();
        if (adapter != null) {
            EmptyRecyclerView.L0(adapter, this.f2);
        }
    }

    public final void J0() {
        hdc adapter = getAdapter();
        if (adapter != null) {
            EmptyRecyclerView.L0(adapter, this.f2);
        }
    }

    public final boolean O0() {
        return getChildCount() != 0 && getChildAt(0).getTop() <= getTop() && getChildAt(getChildCount() - 1).getBottom() >= getBottom();
    }

    public final boolean getIgnoreRefreshingFlagsForScrollEvent() {
        return this.d2;
    }

    public final LinearLayoutManager getLinearLayoutManager() {
        return (LinearLayoutManager) getLayoutManager();
    }

    public final void onLayout(boolean z, int i, int i3, int i4, int i5) {
        try {
            super.onLayout(z, i, i3, i4, i5);
        } catch (Exception e) {
            hm9.p("EndlessRecyclerView2", "onLayout", e);
        }
        x15 x15 = this.Z1;
        if (x15 != null) {
            x15.b(this, 0, 0);
        }
    }

    public final void setDelegate(v15 v15) {
        this.e2 = v15;
    }

    public final void setIgnoreRefreshingFlagsForScrollEvent(boolean z) {
        this.d2 = z;
    }

    public void setLayoutManager(a aVar) {
        if (aVar instanceof LinearLayoutManager) {
            super.setLayoutManager(aVar);
            return;
        }
        throw new IllegalArgumentException("layout manager must be an instance of LinearLayoutManager or StaggeredGridLayoutManager");
    }

    public final void setPager(t15 t15) {
        if (t15 != null) {
            x15 x15 = new x15(this, t15);
            int i = this.a2;
            if (i > 0) {
                x15.b = i;
            }
            m(x15);
            this.Z1 = x15;
            return;
        }
        x15 x152 = this.Z1;
        if (x152 != null) {
            s0(x152);
            this.Z1 = null;
        }
    }

    public final void setRefreshingNext(boolean z) {
        if (this.b2 != z) {
            if (z) {
                v15 v15 = this.e2;
                if (v15 != null) {
                    v15.e();
                }
            } else {
                v15 v152 = this.e2;
                if (v152 != null) {
                    v152.g();
                }
            }
            this.b2 = z;
        }
    }

    public final void setRefreshingNextDelegate(pec pec) {
    }

    public final void setRefreshingPrev(boolean z) {
        if (this.c2 != z) {
            this.c2 = z;
        }
    }

    public final void setThreshold(int i) {
        this.a2 = i;
        x15 x15 = this.Z1;
        if (x15 != null && i > 0) {
            x15.b = i;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EndlessRecyclerView2(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.a2 = 1;
        this.f2 = new y15(this);
        this.g2 = tu0.r(3, new hy4(context, 2));
        this.h2 = tu0.r(3, new u15(this, 0));
    }
}
