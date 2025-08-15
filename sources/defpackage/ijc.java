package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ijc  reason: default package */
public abstract class ijc extends hjc implements n66 {
    public final int b;

    public ijc(int i, Continuation continuation) {
        super(continuation);
        this.b = i;
    }

    public final int getArity() {
        return this.b;
    }

    public final String toString() {
        if (this.a != null) {
            return super.toString();
        }
        nec.a.getClass();
        return oec.a(this);
    }
}
