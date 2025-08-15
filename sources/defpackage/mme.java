package defpackage;

/* renamed from: mme  reason: default package */
public final class mme {
    public final ol a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final int e;

    public mme(ol olVar, boolean z, boolean z2, long j, int i) {
        this.a = olVar;
        this.b = z;
        this.c = z2;
        this.d = j;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mme)) {
            return false;
        }
        mme mme = (mme) obj;
        return tpa.f(this.a, mme.a) && this.b == mme.b && this.c == mme.c && this.d == mme.d && this.e == mme.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + h4f.m(ms2.d(ms2.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task(apiTask=");
        sb.append(this.a);
        sb.append(", executeAndSave=");
        sb.append(this.b);
        sb.append(", retry=");
        sb.append(this.c);
        sb.append(", dependsRequestId=");
        sb.append(this.d);
        sb.append(", dependencyType=");
        return zr6.j(sb, this.e, ")");
    }
}
