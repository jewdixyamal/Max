package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class EmojiCompatInitializer implements x07 {
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    public final /* bridge */ /* synthetic */ Object b(Context context) {
        c(context);
        return Boolean.TRUE;
    }

    public final void c(Context context) {
        Object obj;
        mx5 mx5 = new mx5(new p9g(context, 1));
        mx5.g = 1;
        vw4.c(mx5);
        jo7 i = jo7.i(context);
        Class<ProcessLifecycleInitializer> cls = ProcessLifecycleInitializer.class;
        i.getClass();
        synchronized (jo7.s0) {
            try {
                obj = ((HashMap) i.a).get(cls);
                if (obj == null) {
                    obj = i.g(cls, new HashSet());
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        gh7 Q = ((eh7) obj).Q();
        Q.a(new xw4(this, Q));
    }
}
