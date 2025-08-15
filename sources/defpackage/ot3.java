package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: ot3  reason: default package */
public abstract class ot3 {
    public static Executor a(Context context) {
        return context.getMainExecutor();
    }
}
