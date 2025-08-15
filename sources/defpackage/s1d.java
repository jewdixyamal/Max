package defpackage;

/* renamed from: s1d  reason: default package */
public final class s1d {
    public final y1d a;
    public final y1d b;

    public s1d(y1d y1d, y1d y1d2) {
        this.a = y1d;
        this.b = y1d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s1d.class != obj.getClass()) {
            return false;
        }
        s1d s1d = (s1d) obj;
        return this.a.equals(s1d.a) && this.b.equals(s1d.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        y1d y1d = this.a;
        String valueOf = String.valueOf(y1d);
        y1d y1d2 = this.b;
        if (y1d.equals(y1d2)) {
            str = "";
        } else {
            String valueOf2 = String.valueOf(y1d2);
            StringBuilder sb = new StringBuilder(valueOf2.length() + 2);
            sb.append(", ");
            sb.append(valueOf2);
            str = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder(rh4.e(valueOf.length() + 2, str));
        sb2.append("[");
        sb2.append(valueOf);
        sb2.append(str);
        sb2.append("]");
        return sb2.toString();
    }
}
