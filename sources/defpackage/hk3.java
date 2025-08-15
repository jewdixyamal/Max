package defpackage;

import android.view.View;

/* renamed from: hk3  reason: default package */
public final /* synthetic */ class hk3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m56 b;

    public /* synthetic */ hk3(int i, m56 m56) {
        this.a = i;
        this.b = m56;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.invoke(Boolean.FALSE);
                return;
            case 1:
                this.b.invoke(Boolean.TRUE);
                return;
            case 2:
                this.b.invoke(Boolean.FALSE);
                return;
            default:
                this.b.invoke(Boolean.TRUE);
                return;
        }
    }
}
