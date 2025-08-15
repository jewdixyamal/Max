package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.onechat.reactions.ReactionsViewModel;

/* renamed from: n7c  reason: default package */
public final class n7c extends pnf {
    public final long b;
    public final khe c = new khe(new lwa(11, this));

    public n7c(long j) {
        this.b = j;
        o19 o19 = o19.a;
        od2.L(od2.F(new zn5(new t03(((jz2) ((iy2) o19.getAccessor().c(iy2.class))).m(j), 11), new m7c(this, (Continuation) null), 5), ((w9a) o19.getDispatchers()).a()), this.a);
    }

    public final ReactionsViewModel q() {
        return (ReactionsViewModel) this.c.getValue();
    }
}
