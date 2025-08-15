package defpackage;

/* renamed from: t1d  reason: default package */
public final class t1d {
    public final z1d a;
    public final z1d b;

    public t1d(z1d z1d, z1d z1d2) {
        this.a = z1d;
        this.b = z1d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t1d.class != obj.getClass()) {
            return false;
        }
        t1d t1d = (t1d) obj;
        return this.a.equals(t1d.a) && this.b.equals(t1d.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        z1d z1d = this.a;
        sb.append(z1d);
        z1d z1d2 = this.b;
        if (z1d.equals(z1d2)) {
            str = "";
        } else {
            str = ", " + z1d2;
        }
        return zr6.l(sb, str, "]");
    }
}
