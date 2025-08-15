package defpackage;

/* renamed from: wa0  reason: default package */
public final class wa0 {
    public final eh7 a;
    public final x90 b;

    public wa0(eh7 eh7, x90 x90) {
        if (eh7 != null) {
            this.a = eh7;
            if (x90 != null) {
                this.b = x90;
                return;
            }
            throw new NullPointerException("Null cameraId");
        }
        throw new NullPointerException("Null lifecycleOwner");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wa0)) {
            return false;
        }
        wa0 wa0 = (wa0) obj;
        return this.a.equals(wa0.a) && this.b.equals(wa0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Key{lifecycleOwner=" + this.a + ", cameraId=" + this.b + "}";
    }
}
