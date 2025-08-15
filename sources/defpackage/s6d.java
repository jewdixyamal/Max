package defpackage;

import java.util.List;
import java.util.Set;

/* renamed from: s6d  reason: default package */
public final class s6d implements r6d, px0 {
    public final r6d a;
    public final String b;
    public final Set c;

    public s6d(r6d r6d) {
        this.a = r6d;
        this.b = r6d.a() + '?';
        this.c = j1e.e(r6d);
    }

    public final String a() {
        return this.b;
    }

    public final Set b() {
        return this.c;
    }

    public final boolean c() {
        return true;
    }

    public final int d(String str) {
        return this.a.d(str);
    }

    public final pag e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6d)) {
            return false;
        }
        return tpa.f(this.a, ((s6d) obj).a);
    }

    public final int f() {
        return this.a.f();
    }

    public final String g(int i) {
        return this.a.g(i);
    }

    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    public final List h(int i) {
        return this.a.h(i);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final r6d i(int i) {
        return this.a.i(i);
    }

    public final boolean isInline() {
        return this.a.isInline();
    }

    public final boolean j(int i) {
        return this.a.j(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }
}
