package defpackage;

/* renamed from: wh1  reason: default package */
public final class wh1 {
    public final fd7 a;
    public final fd7 b;
    public final fd7 c;
    public final fd7 d;
    public final fd7 e;
    public final fd7 f;

    public wh1(int i, int i2, int i3, int i4, int i5, int i6) {
        fd7 fd7 = new fd7(Integer.valueOf(i));
        fd7 fd72 = new fd7(Integer.valueOf(i2));
        fd7 fd73 = new fd7(Integer.valueOf(i3));
        fd7 fd74 = new fd7(Integer.valueOf(i4));
        fd7 fd75 = new fd7(Integer.valueOf(i5));
        fd7 fd76 = new fd7(Integer.valueOf(i6));
        this.a = fd7;
        this.b = fd72;
        this.c = fd73;
        this.d = fd74;
        this.e = fd75;
        this.f = fd76;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wh1)) {
            return false;
        }
        wh1 wh1 = (wh1) obj;
        return tpa.f(this.a, wh1.a) && tpa.f(this.b, wh1.b) && tpa.f(this.c, wh1.c) && tpa.f(this.d, wh1.d) && tpa.f(this.e, wh1.e) && tpa.f(this.f, wh1.f);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        int hashCode4 = this.e.hashCode();
        return this.f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SoundConfig(end=" + this.a + ", ringtone=" + this.b + ", beep=" + this.c + ", connecting=" + this.d + ", connected=" + this.e + ", busy=" + this.f + ")";
    }
}
