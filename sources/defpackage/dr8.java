package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: dr8  reason: default package */
public final class dr8 extends FrameLayout implements r53 {
    public final CollapsibleActionView a;

    public dr8(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }

    public final void onActionViewCollapsed() {
        this.a.onActionViewCollapsed();
    }

    public final void onActionViewExpanded() {
        this.a.onActionViewExpanded();
    }
}
