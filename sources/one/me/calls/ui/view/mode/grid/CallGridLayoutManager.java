package one.me.calls.ui.view.mode.grid;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lone/me/calls/ui/view/mode/grid/CallGridLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "e71", "sh0", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
public final class CallGridLayoutManager extends GridLayoutManager {
    public final Context M;
    public final int N;
    public final sh0 O;
    public e71 P = new gaa((Object) this);

    public CallGridLayoutManager(Context context, int i, sh0 sh0) {
        super(2);
        this.M = context;
        this.N = i;
        this.O = sh0;
    }

    public final void C1(jg6 jg6) {
        int c = this.P.c();
        sh0 sh0 = this.O;
        jg6.height = ((c - (sh0.j() * this.N)) + 1) / sh0.j();
    }

    public final boolean g(pdc pdc) {
        pdc s = s();
        return (pdc instanceof jg6) && s.width == pdc.width && s.height == pdc.height;
    }

    public final pdc s() {
        pdc s = super.s();
        C1((jg6) s);
        return s;
    }

    public final pdc t(Context context, AttributeSet attributeSet) {
        pdc t = super.t(context, attributeSet);
        C1((jg6) t);
        return t;
    }

    public final pdc u(ViewGroup.LayoutParams layoutParams) {
        pdc u = super.u(layoutParams);
        C1((jg6) u);
        return u;
    }
}
