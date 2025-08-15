package defpackage;

import android.net.Uri;

/* renamed from: hz8  reason: default package */
public final class hz8 implements kz8 {
    public final Uri a;

    public hz8(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hz8) && tpa.f(this.a, ((hz8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SendImage(mediaUri=" + this.a + ")";
    }
}
