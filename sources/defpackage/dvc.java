package defpackage;

import java.util.Objects;

/* renamed from: dvc  reason: default package */
public final class dvc {
    public final cvc a;
    public final eu6 b;

    public dvc(cvc cvc, eu6 eu6) {
        this.a = cvc;
        this.b = eu6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvc)) {
            return false;
        }
        dvc dvc = (dvc) obj;
        return this.a == dvc.a && Objects.equals(this.b, dvc.b);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b});
    }
}
