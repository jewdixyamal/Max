package defpackage;

/* renamed from: qkf  reason: default package */
public final class qkf implements ooc {
    public final pkf a;

    public qkf(pkf pkf) {
        this.a = pkf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qkf) && tpa.f(this.a, ((qkf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VideoQualityUpdateNotification(videoQuality=" + this.a + ")";
    }
}
