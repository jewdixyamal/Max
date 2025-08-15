package defpackage;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;

/* renamed from: b5a  reason: default package */
public final class b5a extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AtomicBoolean Y;
    public final /* synthetic */ Handler Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b5a(AtomicBoolean atomicBoolean, Handler handler, Continuation continuation) {
        super(2, continuation);
        this.Y = atomicBoolean;
        this.Z = handler;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b5a) n((gk) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        b5a b5a = new b5a(this.Y, this.Z, continuation);
        b5a.X = obj;
        return b5a;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        gk gkVar = (gk) this.X;
        boolean z = this.Y.get();
        e5f e5f = e5f.a;
        if (!z) {
            return e5f;
        }
        wva G = z7.G();
        gkVar.initCause((Throwable) G.c);
        hm9.l0("ANR", "detect " + gkVar, gkVar);
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.Y, "ANR-ThreadDump", G.toString(), (Throwable) null);
        }
        bcf.a.c().a((String) null, gkVar);
        if (this.Y.compareAndSet(true, false)) {
            this.Z.postAtFrontOfQueue(new nn6(22, this.Y));
        }
        return e5f;
    }
}
