package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.UUID;

/* renamed from: n7g  reason: default package */
public final class n7g {
    public final UUID a;
    public final m7g b;
    public final d24 c;
    public final HashSet d;
    public final d24 e;
    public final int f;
    public final int g;

    public n7g(UUID uuid, m7g m7g, d24 d24, ArrayList arrayList, d24 d242, int i, int i2) {
        this.a = uuid;
        this.b = m7g;
        this.c = d24;
        this.d = new HashSet(arrayList);
        this.e = d242;
        this.f = i;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n7g.class != obj.getClass()) {
            return false;
        }
        n7g n7g = (n7g) obj;
        if (this.f == n7g.f && this.g == n7g.g && this.a.equals(n7g.a) && this.b == n7g.b && this.c.equals(n7g.c) && this.d.equals(n7g.d)) {
            return this.e.equals(n7g.e);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        return ((((this.e.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f) * 31) + this.g;
    }

    public final String toString() {
        return "WorkInfo{mId='" + this.a + "', mState=" + this.b + ", mOutputData=" + this.c + ", mTags=" + this.d + ", mProgress=" + this.e + '}';
    }
}
