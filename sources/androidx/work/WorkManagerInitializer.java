package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;

public final class WorkManagerInitializer implements x07 {
    public static final String a = a14.O("WrkMgrInitializer");

    public final List a() {
        return Collections.emptyList();
    }

    public final Object b(Context context) {
        a14.u().n(a, "Initializing WorkManager with default configuration.");
        s7g.e(context, new me3(new ho9()));
        return s7g.d(context);
    }
}
