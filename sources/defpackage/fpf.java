package defpackage;

import android.view.View;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: fpf  reason: default package */
public final class fpf implements View.OnAttachStateChangeListener {
    public vxd a;
    public final /* synthetic */ c66 b;
    public final /* synthetic */ View c;

    public fpf(c66 c66, View view) {
        this.b = c66;
        this.c = view;
    }

    public final void onViewAttachedToWindow(View view) {
        vxd vxd = this.a;
        if (vxd == null || !vxd.isActive()) {
            c66 c66 = this.b;
            View view2 = this.c;
            this.a = od2.L(new zn5(new zn5((w7c) qp4.u0.b(view.getContext()).t0, new dpf(c66, view2, view, (Continuation) null)), new epf(c66, view2, (Continuation) null), 5), lnf.b(view));
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        vxd vxd = this.a;
        if (vxd != null) {
            vxd.cancel((CancellationException) null);
        }
        this.a = null;
    }
}
