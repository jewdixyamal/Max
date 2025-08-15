package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import ru.ok.android.externcalls.BuildConfig;

/* renamed from: jye  reason: default package */
public final class jye extends rd7 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jye(Context context, int i) {
        super(0);
        this.a = i;
        this.b = context;
    }

    public final Object invoke() {
        String str;
        switch (this.a) {
            case 0:
                String q = c37.q();
                Context context = this.b;
                if (q.equals(context.getPackageName())) {
                    str = "tracer";
                } else {
                    str = "tracer-" + Uri.encode(q.replace(':', '-'));
                }
                File file = new File(context.getCacheDir(), str);
                m6d.y(file);
                return lk5.J(file, "settings.data");
            default:
                Context applicationContext = this.b.getApplicationContext();
                uye uye = new uye();
                uye.b = new cqd("xrRYkU895jUPp2YZo1sxmtFadnlX1oHyouadIxpNzAp");
                wye wye = new wye(applicationContext, BuildConfig.LIBRARY_PACKAGE_NAME, new l7b(uye));
                wye.b("calls-sdk-version", "125.1.0.48.3");
                return wye;
        }
    }
}
