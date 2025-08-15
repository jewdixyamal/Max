package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: xx7  reason: default package */
public final class xx7 extends z7b {
    public final wx7 a;
    public final List b;

    public xx7(wx7 wx7, List list) {
        this.a = wx7;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (obj == null || xx7.class != obj.getClass()) {
            return false;
        }
        xx7 xx7 = (xx7) obj;
        return Arrays.equals(new Object[]{this.a, this.b}, new Object[]{xx7.a, xx7.b});
    }

    public final int hashCode() {
        Object[] objArr = {this.a, this.b};
        return xx7.class.hashCode() + (Arrays.hashCode(objArr) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.a, this.b};
        String[] split = "a;b".length() == 0 ? new String[0] : "a;b".split(";");
        StringBuilder sb = new StringBuilder();
        sb.append(xx7.class.getSimpleName());
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
