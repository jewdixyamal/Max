package defpackage;

import java.nio.channels.AsynchronousFileChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* renamed from: sj5  reason: default package */
public final class sj5 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AtomicBoolean Y;
    public final /* synthetic */ yj5 Z;
    public final /* synthetic */ AsynchronousFileChannel s0;
    public final /* synthetic */ AtomicReference t0;
    public final /* synthetic */ iab u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sj5(AtomicBoolean atomicBoolean, yj5 yj5, AsynchronousFileChannel asynchronousFileChannel, AtomicReference atomicReference, iab iab, Continuation continuation) {
        super(2, continuation);
        this.Y = atomicBoolean;
        this.Z = yj5;
        this.s0 = asynchronousFileChannel;
        this.t0 = atomicReference;
        this.u0 = iab;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sj5) n((wve) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        sj5 sj5 = new sj5(this.Y, this.Z, this.s0, this.t0, this.u0, continuation);
        sj5.X = obj;
        return sj5;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wve wve = (wve) this.X;
        boolean z = this.Y.get();
        e5f e5f = e5f.a;
        if (!z) {
            return e5f;
        }
        yj5 yj5 = this.Z;
        j47.T(yj5.q, yj5.p, (vx3) null, new rj5(yj5, wve, this.s0, this.Y, this.t0, this.u0, (Continuation) null), 2);
        return e5f;
    }
}
