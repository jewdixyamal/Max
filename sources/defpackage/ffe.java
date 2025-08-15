package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ffe  reason: default package */
public abstract class ffe extends hu3 implements n66 {
    public final int o;

    public ffe(int i, Continuation continuation) {
        super(continuation);
        this.o = i;
    }

    public final int getArity() {
        return this.o;
    }

    public final String toString() {
        if (this.a != null) {
            return super.toString();
        }
        nec.a.getClass();
        return oec.a(this);
    }
}
