package defpackage;

/* renamed from: lef  reason: default package */
public final class lef {
    public final String a;
    public final ref b;

    public lef(l7b l7b) {
        this.a = (String) l7b.b;
        this.b = (ref) l7b.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lef.class != obj.getClass()) {
            return false;
        }
        lef lef = (lef) obj;
        String str = lef.a;
        String str2 = this.a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        ref ref = lef.b;
        ref ref2 = this.b;
        return ref2 != null ? ref2.equals(ref) : ref == null;
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ref ref = this.b;
        if (ref != null) {
            i = ref.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "VideoConversionData{sourceUri='" + this.a + "', convertOptions=" + this.b + '}';
    }
}
