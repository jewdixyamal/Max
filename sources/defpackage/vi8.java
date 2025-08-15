package defpackage;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;

/* renamed from: vi8  reason: default package */
public final class vi8 {
    public final ti8 a;

    public vi8(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        } else if (!TextUtils.isEmpty(str)) {
            ti8 ti8 = new ti8(str, i, i2);
            new MediaSessionManager.RemoteUserInfo(str, i, i2);
            this.a = ti8;
        } else {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vi8)) {
            return false;
        }
        return this.a.equals(((vi8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public vi8(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String packageName = remoteUserInfo.getPackageName();
        if (packageName == null) {
            throw new NullPointerException("package shouldn't be null");
        } else if (!TextUtils.isEmpty(packageName)) {
            this.a = new ti8(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
        } else {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
    }
}
