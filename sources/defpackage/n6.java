package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: n6  reason: default package */
public final class n6 extends kgb {
    public n6(Context context) {
        super(new ufd(context, (AttributeSet) null));
    }

    public final void A(ol7 ol7) {
        ((ufd) this.a).setModelItem(((x6) ol7).b);
    }

    public final void D() {
        View view = this.a;
        ((ufd) view).setOnClickListener((View.OnClickListener) null);
        ((ufd) view).setOnSwitchListener((qfd) null);
    }
}
