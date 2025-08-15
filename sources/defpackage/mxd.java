package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mxd  reason: default package */
public final class mxd implements Continuation, ux3 {
    public final Continuation a;
    public final lx3 b;

    public mxd(lx3 lx3, Continuation continuation) {
        this.a = continuation;
        this.b = lx3;
    }

    public final ux3 getCallerFrame() {
        Continuation continuation = this.a;
        if (continuation instanceof ux3) {
            return (ux3) continuation;
        }
        return null;
    }

    public final lx3 getContext() {
        return this.b;
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
