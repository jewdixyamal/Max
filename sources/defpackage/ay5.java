package defpackage;

import android.app.Notification;

/* renamed from: ay5  reason: default package */
public final class ay5 {
    public final int a;
    public final int b;
    public final Notification c;

    public ay5(int i, Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ay5.class != obj.getClass()) {
            return false;
        }
        ay5 ay5 = (ay5) obj;
        if (this.a == ay5.a && this.b == ay5.b) {
            return this.c.equals(ay5.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
