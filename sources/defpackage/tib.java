package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: tib  reason: default package */
public final class tib extends vib {
    public final int a;

    public tib(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tib) && lz7.i(this.a, ((tib) obj).a);
    }

    public final long getItemId() {
        return (long) LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final int l() {
        return this.a;
    }

    public final String toString() {
        return zr6.i("Loading(itemViewType=", lz7.U(this.a), ")");
    }
}
