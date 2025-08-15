package defpackage;

/* renamed from: bhe  reason: default package */
public final class bhe {
    public final ta3 a;

    public bhe(ua3 ua3) {
        this.a = ua3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bhe) && tpa.f(this.a, ((bhe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SyncFlushSignal(completableDeferred=" + this.a + ")";
    }
}
