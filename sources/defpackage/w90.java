package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: w90  reason: default package */
public final class w90 {
    public final Executor a;
    public final Handler b;

    public w90(Executor executor, Handler handler) {
        if (executor != null) {
            this.a = executor;
            if (handler != null) {
                this.b = handler;
                return;
            }
            throw new NullPointerException("Null schedulerHandler");
        }
        throw new NullPointerException("Null cameraExecutor");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w90)) {
            return false;
        }
        w90 w90 = (w90) obj;
        return this.a.equals(w90.a) && this.b.equals(w90.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.a + ", schedulerHandler=" + this.b + "}";
    }
}
