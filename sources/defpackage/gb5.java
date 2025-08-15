package defpackage;

import android.view.View;

/* renamed from: gb5  reason: default package */
public final /* synthetic */ class gb5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hb5 b;
    public final /* synthetic */ fb5 c;

    public /* synthetic */ gb5(hb5 hb5, fb5 fb5, int i) {
        this.a = i;
        this.b = hb5;
        this.c = fb5;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                m56 m56 = this.b.F0;
                if (m56 != null) {
                    m56.invoke(Long.valueOf(this.c.a));
                    return;
                }
                return;
            case 1:
                m56 m562 = this.b.G0;
                if (m562 != null) {
                    m562.invoke(Long.valueOf(this.c.a));
                    return;
                }
                return;
            case 2:
                m56 m563 = this.b.F0;
                if (m563 != null) {
                    m563.invoke(Long.valueOf(this.c.a));
                    return;
                }
                return;
            default:
                m56 m564 = this.b.G0;
                if (m564 != null) {
                    m564.invoke(Long.valueOf(this.c.a));
                    return;
                }
                return;
        }
    }
}
