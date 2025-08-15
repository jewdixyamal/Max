package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: qu9  reason: default package */
public abstract class qu9 {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, Bundle bundle) {
        return builder.addExtras(bundle);
    }

    public static Notification.Action.Builder b(Notification.Action.Builder builder, RemoteInput remoteInput) {
        return builder.addRemoteInput(remoteInput);
    }

    public static Notification.Action c(Notification.Action.Builder builder) {
        return builder.build();
    }

    public static Notification.Action.Builder d(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(i, charSequence, pendingIntent);
    }

    public static nt9 e(ArrayList<Parcelable> arrayList, int i) {
        vfc[] vfcArr;
        int i2;
        IconCompat iconCompat = null;
        Notification.Action action = (Notification.Action) arrayList.get(i);
        RemoteInput[] g = ot9.g(action);
        boolean z = false;
        if (g == null) {
            vfcArr = null;
        } else {
            vfc[] vfcArr2 = new vfc[g.length];
            for (int i3 = 0; i3 < g.length; i3++) {
                RemoteInput remoteInput = g[i3];
                vfcArr2[i3] = new vfc(ot9.h(remoteInput), ot9.f(remoteInput), ot9.b(remoteInput), ot9.a(remoteInput), tt9.c(remoteInput), ot9.d(remoteInput), (HashSet) null);
            }
            vfcArr = vfcArr2;
        }
        int i4 = Build.VERSION.SDK_INT;
        boolean z2 = ot9.c(action).getBoolean("android.support.allowGeneratedReplies") || rt9.a(action);
        boolean z3 = ot9.c(action).getBoolean("android.support.action.showsUserInterface", true);
        int a = st9.a(action);
        boolean e = tt9.e(action);
        if (i4 >= 31) {
            z = ut9.a(action);
        }
        boolean z4 = z;
        if (qt9.a(action) != null || (i2 = action.icon) == 0) {
            if (qt9.a(action) != null) {
                Icon a2 = qt9.a(action);
                PorterDuff.Mode mode = IconCompat.k;
                if (!(es6.c(a2) == 2 && es6.a(a2) == 0)) {
                    iconCompat = cs6.a(a2);
                }
            }
            return new nt9(iconCompat, action.title, action.actionIntent, ot9.c(action), vfcArr, (vfc[]) null, z2, a, z3, e, z4);
        }
        CharSequence charSequence = action.title;
        PendingIntent pendingIntent = action.actionIntent;
        Bundle c = ot9.c(action);
        if (i2 != 0) {
            iconCompat = IconCompat.d((Resources) null, "", i2);
        }
        return new nt9(iconCompat, charSequence, pendingIntent, c, vfcArr, (vfc[]) null, z2, a, z3, e, z4);
    }
}
