package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* renamed from: sxe  reason: default package */
public final class sxe {
    public static WeakReference c;
    public o23 a;
    public final Executor b;

    public sxe(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.b = scheduledThreadPoolExecutor;
    }

    public final synchronized rxe a() {
        String str;
        rxe rxe;
        o23 o23 = this.a;
        synchronized (((ArrayDeque) o23.o)) {
            str = (String) ((ArrayDeque) o23.o).peek();
        }
        Pattern pattern = rxe.d;
        rxe = null;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("!", -1);
            if (split.length == 2) {
                rxe = new rxe(split[0], split[1]);
            }
        }
        return rxe;
    }
}
