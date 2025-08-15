package defpackage;

import java.util.List;

/* renamed from: y8b  reason: default package */
public final class y8b implements r6d {
    public final String a;
    public final x8b b;

    public y8b(String str, x8b x8b) {
        this.a = str;
        this.b = x8b;
    }

    public final String a() {
        return this.a;
    }

    public final boolean c() {
        return false;
    }

    public final int d(String str) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final pag e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8b)) {
            return false;
        }
        y8b y8b = (y8b) obj;
        if (tpa.f(this.a, y8b.a)) {
            if (tpa.f(this.b, y8b.b)) {
                return true;
            }
        }
        return false;
    }

    public final int f() {
        return 0;
    }

    public final String g(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final List getAnnotations() {
        return nz4.a;
    }

    public final List h(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final r6d i(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final boolean isInline() {
        return false;
    }

    public final boolean j(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString() {
        return rh4.m(new StringBuilder("PrimitiveDescriptor("), this.a, ')');
    }
}
