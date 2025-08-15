package defpackage;

import java.util.Arrays;

/* renamed from: c92  reason: default package */
public final class c92 extends z7b {
    public final long[] a;

    public c92(long[] jArr) {
        this.a = jArr;
    }

    public final boolean equals(Object obj) {
        if (obj == null || c92.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(new Object[]{this.a}, new Object[]{((c92) obj).a});
    }

    public final int hashCode() {
        Object[] objArr = {this.a};
        return c92.class.hashCode() + (Arrays.hashCode(objArr) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.a};
        String[] split = "a".length() == 0 ? new String[0] : "a".split(";");
        StringBuilder sb = new StringBuilder();
        sb.append(c92.class.getSimpleName());
        sb.append("[");
        for (int i = 0; i < split.length; i++) {
            sb.append(split[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != split.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
