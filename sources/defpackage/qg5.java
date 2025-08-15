package defpackage;

import android.system.ErrnoException;
import android.system.OsConstants;

/* renamed from: qg5  reason: default package */
public abstract class qg5 {
    /* access modifiers changed from: private */
    public static boolean b(Throwable th) {
        return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
    }
}
