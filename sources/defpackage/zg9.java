package defpackage;

/* renamed from: zg9  reason: default package */
public final class zg9 extends ju0 {
    public final long d;

    public zg9(long j) {
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zg9) && this.d == ((zg9) obj).d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("AudioRecord(recordAudioId="), this.d, ")");
    }
}
