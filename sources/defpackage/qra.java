package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: qra  reason: default package */
public final class qra {
    public static final String b;
    public final Context a;

    static {
        String str = File.separator;
        b = str + "copy" + str + "media";
    }

    public qra(Context context) {
        this.a = context;
    }
}
