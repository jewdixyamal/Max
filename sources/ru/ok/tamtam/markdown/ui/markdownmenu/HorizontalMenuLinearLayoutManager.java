package ru.ok.tamtam.markdown.ui.markdownmenu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ok/tamtam/markdown/ui/markdownmenu/HorizontalMenuLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "markdown-ui_release"}, k = 1, mv = {2, 0, 0})
public final class HorizontalMenuLinearLayoutManager extends LinearLayoutManager {
    public final boolean e() {
        return false;
    }

    public final boolean f() {
        return false;
    }

    public final boolean g(pdc pdc) {
        return pdc != null;
    }

    public final pdc s() {
        pdc s = super.s();
        t1(s);
        return s;
    }

    public final pdc t(Context context, AttributeSet attributeSet) {
        pdc pdc = new pdc(context, attributeSet);
        t1(pdc);
        return pdc;
    }

    public final void t1(pdc pdc) {
        pdc.width = tu0.F(((double) ((this.n - K()) - J())) / ((double) G()));
    }

    public final pdc u(ViewGroup.LayoutParams layoutParams) {
        pdc u = super.u(layoutParams);
        t1(u);
        return u;
    }
}
