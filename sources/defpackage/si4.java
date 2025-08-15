package defpackage;

/* renamed from: si4  reason: default package */
public final class si4 implements su0 {
    public final int a;
    public final int b;
    public final int c;

    public si4(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si4)) {
            return false;
        }
        si4 si4 = (si4) obj;
        return this.a == si4.a && this.b == si4.b && this.c == si4.c;
    }

    public final int hashCode() {
        return ((((527 + this.a) * 31) + this.b) * 31) + this.c;
    }
}
