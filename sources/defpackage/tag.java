package defpackage;

import android.os.SystemClock;
import java.util.Objects;

/* renamed from: tag  reason: default package */
public final class tag {
    public final z99 a;
    public final long b;
    public long c = SystemClock.elapsedRealtime();

    public tag(long j, z99 z99) {
        this.a = z99;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tag.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((tag) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
