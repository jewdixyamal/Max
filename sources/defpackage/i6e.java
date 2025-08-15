package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: i6e  reason: default package */
public final class i6e extends hqd implements a1d {
    public y0d F0;

    public i6e(Context context) {
        super(new ufd(context, (AttributeSet) null));
    }

    public final void A(ol7 ol7) {
        if (ol7 instanceof x0d) {
            this.F0 = (y0d) ol7;
            ((ufd) this.a).setModelItem(((x0d) ol7).a);
        }
    }

    public final void b(m6e m6e) {
        View view = this.a;
        if (m6e != null) {
            tu0.K(view, 300, new v7d(this, 11, m6e));
        } else {
            ((ufd) view).setOnClickListener((View.OnClickListener) null);
        }
    }
}
