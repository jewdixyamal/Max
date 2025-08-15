package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: bs7  reason: default package */
public final class bs7 extends ol implements lme {
    public final List X;
    public final boolean Y;
    public final String Z = bs7.class.getName();
    public final boolean o;

    public bs7(long j, List list, boolean z, boolean z2) {
        super(j);
        this.o = z;
        this.X = list;
        this.Y = z2;
    }

    public final void e(gle gle) {
        Object unused = j47.f0(hz4.a, new as7(this, (Continuation) null));
    }

    public final void g(pke pke) {
        Object unused = j47.f0(hz4.a, new zr7(this, (Continuation) null));
    }

    public final dle i() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        se5 se5 = (se5) ((qe5) plVar.V.getValue());
        se5.getClass();
        if (!se5.n(PmsKey.f4analyticsenabled, true)) {
            return null;
        }
        return (cs7) j47.f0(hz4.a, new yr7(this, (Continuation) null));
    }
}
