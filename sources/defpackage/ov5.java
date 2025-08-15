package defpackage;

/* renamed from: ov5  reason: default package */
public final class ov5 implements ol7 {
    public final String X;
    public final nv5 Y;
    public final int Z;
    public final long a;
    public final CharSequence b;
    public final int c;
    public final CharSequence o;
    public final long s0;

    public ov5(long j, CharSequence charSequence, int i, CharSequence charSequence2, String str, nv5 nv5, int i2) {
        this.a = j;
        this.b = charSequence;
        this.c = i;
        this.o = charSequence2;
        this.X = str;
        this.Y = nv5;
        this.Z = i2;
        this.s0 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov5)) {
            return false;
        }
        ov5 ov5 = (ov5) obj;
        return this.a == ov5.a && tpa.f(this.b, ov5.b) && this.c == ov5.c && tpa.f(this.o, ov5.o) && tpa.f(this.X, ov5.X) && tpa.f(this.Y, ov5.Y) && this.Z == ov5.Z;
    }

    public final long getItemId() {
        return this.s0;
    }

    public final int hashCode() {
        int e = k7d.e(this.c, rh4.f(this.b, Long.hashCode(this.a) * 31, 31), 31);
        int i = 0;
        CharSequence charSequence = this.o;
        int hashCode = (e + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str = this.X;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        nv5 nv5 = this.Y;
        if (nv5 != null) {
            i = nv5.hashCode();
        }
        return Integer.hashCode(this.Z) + ((hashCode2 + i) * 31);
    }

    public final int l() {
        return this.Z;
    }

    public final String toString() {
        return "FolderWidgetItem(id=" + this.a + ", name=" + this.b + ", backgroundColor=" + this.c + ", description=" + this.o + ", iconUrl=" + this.X + ", clickAction=" + this.Y + ", viewType=" + this.Z + ")";
    }
}
