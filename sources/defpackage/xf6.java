package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* renamed from: xf6  reason: default package */
public final class xf6 extends ote {
    public final /* synthetic */ ote X;
    public final /* synthetic */ ote o;

    public xf6(ote ote, ote ote2) {
        super(10);
        this.o = ote;
        this.X = ote2;
    }

    public final int l(View view, int i, int i2) {
        WeakHashMap weakHashMap = zmf.a;
        return (view.getLayoutDirection() == 1 ? this.X : this.o).l(view, i, i2);
    }

    public final String p() {
        return "SWITCHING[L:" + this.o.p() + ", R:" + this.X.p() + "]";
    }

    public final int r(View view, int i) {
        WeakHashMap weakHashMap = zmf.a;
        return (view.getLayoutDirection() == 1 ? this.X : this.o).r(view, i);
    }
}
