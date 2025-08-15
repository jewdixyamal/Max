package defpackage;

/* renamed from: jy  reason: default package */
public final class jy implements pob {
    public final int a;

    public jy(int i) {
        this.a = i;
    }

    public final Class annotationType() {
        return pob.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pob)) {
            return false;
        }
        jy jyVar = (jy) ((pob) obj);
        if (this.a == jyVar.a) {
            oob oob = oob.a;
            jyVar.getClass();
            if (oob.equals(oob)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a ^ 14552422) + (oob.a.hashCode() ^ 2041407134);
    }

    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + oob.a + ')';
    }
}
