package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: had  reason: default package */
public final class had {
    public final gad a;

    public had(int i, ArrayList arrayList, Executor executor, rv1 rv1) {
        this.a = new gad(i, arrayList, executor, rv1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof had)) {
            return false;
        }
        return this.a.equals(((had) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
