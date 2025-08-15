package defpackage;

import androidx.recyclerview.widget.b;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: ck1  reason: default package */
public final /* synthetic */ class ck1 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ el1 b;

    public /* synthetic */ ck1(el1 el1, int i) {
        this.a = i;
        this.b = el1;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((se5) ((qe5) this.b.u0.getValue())).s());
            case 1:
                se5 se5 = (se5) ((qe5) this.b.u0.getValue());
                se5.getClass();
                return Boolean.valueOf(se5.n(PmsKey.gsse, false));
            case 2:
                se5 se52 = (se5) ((qe5) this.b.u0.getValue());
                se52.getClass();
                return Boolean.valueOf(se52.n(PmsKey.sse, false));
            case 3:
                se5 se53 = (se5) ((qe5) this.b.u0.getValue());
                se53.getClass();
                return Boolean.valueOf(se53.n(PmsKey.grse, false));
            default:
                int i = this.b.t0.e ? 6 : 8;
                b bVar = new b();
                bVar.setMaxRecycledViews(1, i);
                return bVar;
        }
    }
}
