package defpackage;

import android.view.View;
import one.me.sdk.lists.widgets.EmptyRecyclerView;

/* renamed from: qz4  reason: default package */
public final class qz4 extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ EmptyRecyclerView o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qz4(EmptyRecyclerView emptyRecyclerView, int i) {
        super(9, (Object) null);
        this.c = i;
        this.o = emptyRecyclerView;
    }

    public final void L1(Object obj, Object obj2) {
        EmptyRecyclerView emptyRecyclerView = this.o;
        switch (this.c) {
            case 0:
                View view = (View) obj;
                if (((View) obj2) != null) {
                    bc7[] bc7Arr = EmptyRecyclerView.Y1;
                    emptyRecyclerView.getClass();
                    emptyRecyclerView.W1 = new pz4(0, emptyRecyclerView);
                    hdc adapter = emptyRecyclerView.getAdapter();
                    if (adapter != null) {
                        EmptyRecyclerView.K0(adapter, emptyRecyclerView.W1);
                        return;
                    }
                    return;
                } else if (emptyRecyclerView.getAdapter() != null && emptyRecyclerView.W1 != null) {
                    hdc adapter2 = emptyRecyclerView.getAdapter();
                    if (adapter2 != null) {
                        EmptyRecyclerView.L0(adapter2, emptyRecyclerView.W1);
                    }
                    emptyRecyclerView.W1 = null;
                    return;
                } else {
                    return;
                }
            default:
                View view2 = (View) obj;
                if (((View) obj2) != null) {
                    bc7[] bc7Arr2 = EmptyRecyclerView.Y1;
                    emptyRecyclerView.getClass();
                    emptyRecyclerView.W1 = new pz4(0, emptyRecyclerView);
                    hdc adapter3 = emptyRecyclerView.getAdapter();
                    if (adapter3 != null) {
                        EmptyRecyclerView.K0(adapter3, emptyRecyclerView.W1);
                        return;
                    }
                    return;
                } else if (emptyRecyclerView.getAdapter() != null && emptyRecyclerView.W1 != null) {
                    hdc adapter4 = emptyRecyclerView.getAdapter();
                    if (adapter4 != null) {
                        EmptyRecyclerView.L0(adapter4, emptyRecyclerView.W1);
                    }
                    emptyRecyclerView.W1 = null;
                    return;
                } else {
                    return;
                }
        }
    }
}
