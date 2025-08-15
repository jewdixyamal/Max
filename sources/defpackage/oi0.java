package defpackage;

/* renamed from: oi0  reason: default package */
public class oi0 extends pi0 {
    public final pke b;

    public oi0(pke pke) {
        this(Long.MIN_VALUE, pke);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BaseErrorEvent{error=");
        sb.append(this.b);
        sb.append(", requestId=");
        return z7b.i(sb, this.a, '}');
    }

    public oi0(long j, pke pke) {
        super(j);
        this.b = pke;
    }
}
