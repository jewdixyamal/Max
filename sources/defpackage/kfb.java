package defpackage;

import android.content.Intent;

/* renamed from: kfb  reason: default package */
public final class kfb extends ka1 {
    public final Intent b;

    public kfb(Intent intent) {
        super(9);
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kfb) && tpa.f(this.b, ((kfb) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CropAvatar(intent=" + this.b + ")";
    }
}
