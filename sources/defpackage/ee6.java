package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.fragment.app.b;
import com.google.android.gms.common.SupportErrorDialogFragment;

/* renamed from: ee6  reason: default package */
public final class ee6 extends fe6 {
    public static final Object c = new Object();
    public static final ee6 d = new Object();

    public static AlertDialog d(Context context, int i, keg keg, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(pdg.c(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String b = pdg.b(context, i);
        if (b != null) {
            builder.setPositiveButton(b, keg);
        }
        String d2 = pdg.d(context, i);
        if (d2 != null) {
            builder.setTitle(d2);
        }
        new IllegalArgumentException();
        return builder.create();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [x25, android.app.DialogFragment] */
    public static void e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof b) {
                n16 S = ((b) activity).S();
                SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
                fp3.o(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
                alertDialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                supportErrorDialogFragment.B1 = alertDialog;
                if (onCancelListener != null) {
                    supportErrorDialogFragment.C1 = onCancelListener;
                }
                supportErrorDialogFragment.k1(S, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ? dialogFragment = new DialogFragment();
        fp3.o(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
        alertDialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
        dialogFragment.a = alertDialog;
        if (onCancelListener != null) {
            dialogFragment.b = onCancelListener;
        }
        dialogFragment.show(fragmentManager, str);
    }

    public final void c(Activity activity, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog d2 = d(activity, i, new zdg(activity, super.a(i, activity, "d")), onCancelListener);
        if (d2 != null) {
            e(activity, d2, "GooglePlayServicesErrorDialog", onCancelListener);
        }
    }

    public final void f(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        new IllegalArgumentException();
        if (i == 18) {
            new ceg(this, context).sendEmptyMessageDelayed(1, 120000);
        } else if (pendingIntent != null) {
            String f = i == 6 ? pdg.f(context, "common_google_play_services_resolution_required_title") : pdg.d(context, i);
            if (f == null) {
                f = context.getResources().getString(g2c.common_google_play_services_notification_ticker);
            }
            String e = (i == 6 || i == 19) ? pdg.e(context, "common_google_play_services_resolution_required_text", pdg.a(context)) : pdg.c(context, i);
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            fp3.n(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            bu9 bu9 = new bu9(context, (String) null);
            bu9.u = true;
            bu9.i(16, true);
            bu9.e = bu9.c(f);
            zt9 zt9 = new zt9(0);
            zt9.f = bu9.c(e);
            bu9.q(zt9);
            PackageManager packageManager = context.getPackageManager();
            if (np8.h == null) {
                np8.h = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            }
            if (np8.h.booleanValue()) {
                bu9.F.icon = context.getApplicationInfo().icon;
                bu9.k = 2;
                if (np8.A(context)) {
                    bu9.b.add(new nt9(xub.common_full_open_on_phone, resources.getString(g2c.common_open_on_phone), pendingIntent));
                } else {
                    bu9.g = pendingIntent;
                }
            } else {
                bu9.F.icon = 17301642;
                bu9.F.tickerText = bu9.c(resources.getString(g2c.common_google_play_services_notification_ticker));
                bu9.F.when = System.currentTimeMillis();
                bu9.g = pendingIntent;
                bu9.e(e);
            }
            synchronized (c) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(g2c.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            bu9.z = "com.google.android.gms.availability";
            Notification b = bu9.b();
            if (i == 1 || i == 2 || i == 3) {
                pe6.a.set(false);
                i2 = 10436;
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, b);
        }
    }

    public final void g(Activity activity, vg7 vg7, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog d2 = d(activity, i, new feg(super.a(i, activity, "d"), vg7), onCancelListener);
        if (d2 != null) {
            e(activity, d2, "GooglePlayServicesErrorDialog", onCancelListener);
        }
    }
}
