package defpackage;

/* renamed from: gic  reason: default package */
public final class gic implements eic {
    public k56 a;
    public Object b;

    public final boolean a() {
        return this.b != c32.Y;
    }

    public final Object getValue() {
        if (this.b == c32.Y) {
            this.b = this.a.invoke();
        }
        return this.b;
    }

    public final void reset() {
        this.b = c32.Y;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
