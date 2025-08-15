package defpackage;

/* renamed from: kgc  reason: default package */
public final class kgc {
    public static final kgc b = new kgc(false);
    public final boolean a;

    public kgc(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kgc.class != obj.getClass()) {
            return false;
        }
        return this.a == ((kgc) obj).a;
    }

    public final int hashCode() {
        return this.a ^ true ? 1 : 0;
    }
}
