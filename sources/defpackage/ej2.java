package defpackage;

/* renamed from: ej2  reason: default package */
public final class ej2 {
    public final sb8 a;
    public final gef b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ej2(qb8 qb8, int i) {
        this((sb8) (i & 1) != 0 ? null : qb8, (gef) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej2)) {
            return false;
        }
        ej2 ej2 = (ej2) obj;
        return tpa.f(this.a, ej2.a) && tpa.f(this.b, ej2.b);
    }

    public final int hashCode() {
        int i = 0;
        sb8 sb8 = this.a;
        int hashCode = (sb8 == null ? 0 : sb8.hashCode()) * 31;
        gef gef = this.b;
        if (gef != null) {
            i = gef.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "VideoPageState(mediaItem=" + this.a + ", videoContent=" + this.b + ")";
    }

    public ej2(sb8 sb8, gef gef) {
        this.a = sb8;
        this.b = gef;
    }
}
