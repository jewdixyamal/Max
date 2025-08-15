package defpackage;

import java.util.Arrays;

/* renamed from: cv  reason: default package */
public final class cv extends z7b implements bb3 {
    public final bb3 a;

    public cv(bb3 bb3) {
        this.a = bb3;
    }

    public final void b(ra3 ra3) {
        try {
            this.a.b(ra3);
        } catch (RuntimeException e) {
            if (!(e.getCause() instanceof InterruptedException)) {
                throw e;
            } else if (!ra3.h()) {
                Throwable cause = e.getCause();
                if (!ra3.a(cause)) {
                    j47.Z(cause);
                }
            } else {
                Thread.currentThread().interrupt();
            }
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || cv.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(new Object[]{this.a}, new Object[]{((cv) obj).a});
    }

    public final int hashCode() {
        Object[] objArr = {this.a};
        return cv.class.hashCode() + (Arrays.hashCode(objArr) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.a};
        String[] split = "a".length() == 0 ? new String[0] : "a".split(";");
        StringBuilder sb = new StringBuilder();
        sb.append(cv.class.getSimpleName());
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
