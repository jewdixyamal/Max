package defpackage;

/* renamed from: qke  reason: default package */
public final class qke extends pke {
    public final String Y;
    public final String Z;

    public qke(String str, String str2, String str3, String str4, String str5) {
        super(str, str2, str3);
        this.Y = str4;
        this.Z = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qke) || !super.equals(obj)) {
            return false;
        }
        qke qke = (qke) obj;
        return tpa.f(this.Y, qke.Y) && tpa.f(this.Z, qke.Z);
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        int i = 0;
        String str = this.Y;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        String str2 = this.Z;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder o = rh4.o(qke.class.getSimpleName(), "{error='");
        o.append(this.b);
        o.append("', message='");
        o.append(this.c);
        o.append("', title='");
        o.append(this.Y);
        o.append("', description='");
        o.append(this.Z);
        o.append("', localizedMessage='");
        return zr6.l(o, this.o, "'}");
    }
}
