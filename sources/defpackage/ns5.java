package defpackage;

/* renamed from: ns5  reason: default package */
public abstract class ns5 implements Iterable {
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        for (Object append : this) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(append);
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }
}
