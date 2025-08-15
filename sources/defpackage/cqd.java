package defpackage;

import javax.inject.Provider;

/* renamed from: cqd  reason: default package */
public final class cqd implements Provider {
    public final Object a;

    public cqd(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cqd) && tpa.f(this.a, ((cqd) obj).a);
    }

    public final Object get() {
        return this.a;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "SimpleProvider(value=" + this.a + ')';
    }
}
