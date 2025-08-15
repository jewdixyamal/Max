package defpackage;

import android.content.Intent;
import android.net.Uri;

/* renamed from: ama  reason: default package */
public final class ama extends cma {
    public final Intent a;
    public final Uri b;

    public ama(Intent intent, Uri uri) {
        this.a = intent;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ama)) {
            return false;
        }
        ama ama = (ama) obj;
        return tpa.f(this.a, ama.a) && tpa.f(this.b, ama.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenFile(intent=" + this.a + ", uri=" + this.b + ")";
    }
}
