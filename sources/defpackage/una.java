package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;

/* renamed from: una  reason: default package */
public final class una {
    public final OutputConfiguration a;
    public long b = 1;

    public una(OutputConfiguration outputConfiguration) {
        this.a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof una)) {
            return false;
        }
        una una = (una) obj;
        return Objects.equals(this.a, una.a) && this.b == una.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 31;
        return Long.hashCode(this.b) ^ ((hashCode << 5) - hashCode);
    }
}
