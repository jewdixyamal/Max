package defpackage;

/* renamed from: ok0  reason: default package */
public abstract class ok0 implements fef {
    public final long a;
    public final long b;
    public final boolean c;
    public final String d;
    public final long e;
    public final uy f;
    public final boolean g;
    public final int h;
    public final int i;

    public ok0(int i2, int i3, long j, long j2, long j3, uy uyVar, String str, boolean z, boolean z2) {
        this.d = str;
        this.a = j;
        this.b = j2;
        this.c = z;
        this.e = j3;
        this.f = uyVar;
        this.g = z2;
        this.h = i2;
        this.i = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ok0 ok0 = (ok0) obj;
        if (this.a != ok0.a || this.b != ok0.b || this.c != ok0.c || this.e != ok0.e || this.g != ok0.g || this.h != ok0.h || this.i != ok0.i) {
            return false;
        }
        String str = ok0.d;
        String str2 = this.d;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        uy uyVar = ok0.f;
        uy uyVar2 = this.f;
        return uyVar2 != null ? uyVar2.equals(uyVar) : uyVar == null;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i2 = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.c ? 1 : 0)) * 31;
        int i3 = 0;
        String str = this.d;
        int hashCode = str != null ? str.hashCode() : 0;
        long j3 = this.e;
        int i4 = (((i2 + hashCode) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        uy uyVar = this.f;
        if (uyVar != null) {
            i3 = uyVar.hashCode();
        }
        return ((((((i4 + i3) * 31) + (this.g ? 1 : 0)) * 31) + this.h) * 31) + this.i;
    }

    public long k() {
        return this.a;
    }

    public long m() {
        return 0;
    }
}
