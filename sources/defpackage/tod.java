package defpackage;

/* renamed from: tod  reason: default package */
public abstract class tod {
    public final boolean direct;
    public final String message;

    public tod(String str, boolean z) {
        this.message = str;
        this.direct = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        tod tod = (tod) obj;
        if (this.direct != tod.direct) {
            return false;
        }
        return this.message.equals(tod.message);
    }

    public int hashCode() {
        return (this.message.hashCode() * 31) + (this.direct ? 1 : 0);
    }
}
