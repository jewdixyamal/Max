package defpackage;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;

/* renamed from: wi8  reason: default package */
public final class wi8 {
    public yi8 a;

    public wi8(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        } else if (!TextUtils.isEmpty(str)) {
            yi8 yi8 = new yi8(str, i, i2);
            new MediaSessionManager.RemoteUserInfo(str, i, i2);
            this.a = yi8;
        } else {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi8)) {
            return false;
        }
        return this.a.equals(((wi8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
