package defpackage;

import android.view.View;
import java.util.List;

/* renamed from: s4d  reason: default package */
public final /* synthetic */ class s4d implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t4d b;

    public /* synthetic */ s4d(t4d t4d, int i) {
        this.a = i;
        this.b = t4d;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                t4d t4d = this.b;
                q4d q4d = t4d.I0;
                if (q4d != null) {
                    p58 p58 = t4d.F0;
                    p58.t0.n(new g48(q4d, ((List) p58.x0.getValue()).indexOf(q4d)));
                    return;
                }
                return;
            default:
                t4d t4d2 = this.b;
                q4d q4d2 = t4d2.I0;
                if (q4d2 != null) {
                    t4d2.F0.t0.n(new c48(q4d2));
                    return;
                }
                return;
        }
    }
}
