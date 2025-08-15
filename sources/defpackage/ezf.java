package defpackage;

/* renamed from: ezf  reason: default package */
public final class ezf implements kzf {
    public final String a;

    public ezf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ezf) && tpa.f(this.a, ((ezf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("ShowCloseDialog(appName="), this.a, ")");
    }
}
