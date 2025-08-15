package defpackage;

import android.view.View;

/* renamed from: e44  reason: default package */
public final class e44 extends p44 implements View.OnClickListener {
    public final View.OnClickListener o;

    public /* synthetic */ e44(View.OnClickListener onClickListener, int i) {
        this(300, onClickListener);
    }

    public final void onClick(View view) {
        if (this.b) {
            this.b = false;
            this.o.onClick(view);
            view.postDelayed(new re(12, (es3) this.c), this.a);
        }
    }

    public e44(long j, View.OnClickListener onClickListener) {
        super(j);
        this.o = onClickListener;
    }
}
