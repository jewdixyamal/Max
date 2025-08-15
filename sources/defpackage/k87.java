package defpackage;

import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* renamed from: k87  reason: default package */
public abstract class k87 extends LockFreeLinkedListNode implements cm4, nz6 {
    public z87 a;

    public final tq9 b() {
        return null;
    }

    public abstract boolean c();

    public abstract void d(Throwable th);

    public final void dispose() {
        z87 z87 = this.a;
        if (z87 == null) {
            z87 = null;
        }
        z87.removeNode$kotlinx_coroutines_core(this);
    }

    public final boolean isActive() {
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(c54.u(this));
        sb.append("[job@");
        z87 z87 = this.a;
        if (z87 == null) {
            z87 = null;
        }
        sb.append(c54.u(z87));
        sb.append(']');
        return sb.toString();
    }
}
