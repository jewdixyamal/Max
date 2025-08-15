package defpackage;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;

/* renamed from: ur4  reason: default package */
public abstract class ur4 {
    public static boolean a(Throwable th) {
        return th instanceof DeniedByServerException;
    }

    public static boolean b(Throwable th) {
        return th instanceof NotProvisionedException;
    }
}
