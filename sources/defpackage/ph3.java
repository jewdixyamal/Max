package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ph3  reason: default package */
public final class ph3 extends n3 {
    public static final Parcelable.Creator<ph3> CREATOR = new ufg(0);
    public static final ph3 X = new ph3(0);
    public final int a;
    public final int b;
    public final PendingIntent c;
    public final String o;

    public ph3(int i, int i2, PendingIntent pendingIntent, String str) {
        this.a = i;
        this.b = i2;
        this.c = pendingIntent;
        this.o = str;
    }

    public static String b(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case Protos.Attaches.Attach.LOCATION /*14*/:
                        return "TIMEOUT";
                    case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case LangUtils.HASH_SEED /*17*/:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return wg0.g(i, "UNKNOWN_ERROR_CODE(", ")");
                }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.ph3) r5;
        r1 = r5.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.ph3
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            ph3 r5 = (defpackage.ph3) r5
            int r1 = r5.b
            int r3 = r4.b
            if (r3 != r1) goto L_0x0027
            android.app.PendingIntent r1 = r4.c
            android.app.PendingIntent r3 = r5.c
            boolean r1 = defpackage.s36.l(r1, r3)
            if (r1 == 0) goto L_0x0027
            java.lang.String r4 = r4.o
            java.lang.String r5 = r5.o
            boolean r4 = defpackage.s36.l(r4, r5)
            if (r4 == 0) goto L_0x0027
            return r0
        L_0x0027:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ph3.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.c, this.o});
    }

    public final String toString() {
        qz7 qz7 = new qz7((Object) this);
        qz7.h(b(this.b), "statusCode");
        qz7.h(this.c, "resolution");
        qz7.h(this.o, "message");
        return qz7.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int T = ay7.T(parcel, 20293);
        ay7.X(parcel, 1, 4);
        parcel.writeInt(this.a);
        ay7.X(parcel, 2, 4);
        parcel.writeInt(this.b);
        ay7.P(parcel, 3, this.c, i);
        ay7.Q(parcel, 4, this.o);
        ay7.W(parcel, T);
    }

    public ph3(int i) {
        this(1, i, (PendingIntent) null, (String) null);
    }

    public ph3(int i, PendingIntent pendingIntent) {
        this(1, i, pendingIntent, (String) null);
    }
}
