package defpackage;

import java.util.List;

/* renamed from: ls  reason: default package */
public final class ls implements r6d {
    public final r6d a;
    public final int b = 1;

    public ls(r6d r6d) {
        this.a = r6d;
    }

    public final String a() {
        return "kotlin.collections.ArrayList";
    }

    public final boolean c() {
        return false;
    }

    public final int d(String str) {
        Integer e0 = dae.e0(str);
        if (e0 != null) {
            return e0.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid list index"));
    }

    public final pag e() {
        return nae.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls)) {
            return false;
        }
        ls lsVar = (ls) obj;
        return tpa.f(this.a, lsVar.a) && tpa.f(a(), lsVar.a());
    }

    public final int f() {
        return this.b;
    }

    public final String g(int i) {
        return String.valueOf(i);
    }

    public final List getAnnotations() {
        return nz4.a;
    }

    public final List h(int i) {
        if (i >= 0) {
            return nz4.a;
        }
        StringBuilder n = rh4.n(i, "Illegal index ", ", ");
        n.append(a());
        n.append(" expects only non-negative indices");
        throw new IllegalArgumentException(n.toString().toString());
    }

    public final int hashCode() {
        return a().hashCode() + (this.a.hashCode() * 31);
    }

    public final r6d i(int i) {
        if (i >= 0) {
            return this.a;
        }
        StringBuilder n = rh4.n(i, "Illegal index ", ", ");
        n.append(a());
        n.append(" expects only non-negative indices");
        throw new IllegalArgumentException(n.toString().toString());
    }

    public final boolean isInline() {
        return false;
    }

    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        StringBuilder n = rh4.n(i, "Illegal index ", ", ");
        n.append(a());
        n.append(" expects only non-negative indices");
        throw new IllegalArgumentException(n.toString().toString());
    }

    public final String toString() {
        return a() + '(' + this.a + ')';
    }
}
