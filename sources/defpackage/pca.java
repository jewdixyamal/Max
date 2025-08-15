package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: pca  reason: default package */
public final class pca {
    public final Collection a;
    public final je7 b;
    public final k56 c;
    public final k56 d;

    public pca(List list, je7 je7, ot2 ot2, ot2 ot22) {
        this.a = list;
        this.b = je7;
        this.c = ot2;
        this.d = ot22;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pca)) {
            return false;
        }
        pca pca = (pca) obj;
        return tpa.f(this.a, pca.a) && tpa.f(this.b, pca.b) && tpa.f(this.c, pca.c) && tpa.f(this.d, pca.d);
    }

    public final int hashCode() {
        int d2 = ms2.d(ms2.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, true), 31, false);
        return this.d.hashCode() + ((this.c.hashCode() + d2) * 31);
    }

    public final String toString() {
        return "Config(targets=" + this.a + ", fileSystem=" + this.b + ", isBuildObfuscated=true, isBuildDebugOrBeta=false, debugModeProvider=" + this.c + ", dispatcherProvider=" + this.d + ")";
    }
}
