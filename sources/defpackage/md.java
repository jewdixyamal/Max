package defpackage;

import android.content.Context;
import android.location.Geocoder;
import android.util.Size;
import java.util.Locale;

/* renamed from: md  reason: default package */
public final /* synthetic */ class md implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ je7 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ md(je7 je7, Context context, int i) {
        this.a = i;
        this.b = je7;
        this.c = context;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new Geocoder(this.c, (Locale) this.b.getValue());
            case 1:
                ((ti4) this.b.getValue()).getClass();
                Size i = ti4.i(this.c);
                return Integer.valueOf(Math.max(i.getWidth(), i.getHeight()));
            case 2:
                ((ti4) this.b.getValue()).getClass();
                Size i2 = ti4.i(this.c);
                int min = (int) ((Math.min((double) i2.getWidth(), (double) i2.getHeight()) / ((double) 3.0f)) * ((double) 2.0f));
                if (min < 400) {
                    min = 400;
                }
                return Integer.valueOf(min);
            default:
                ((ti4) this.b.getValue()).getClass();
                Size i3 = ti4.i(this.c);
                return Integer.valueOf(Math.max(i3.getWidth(), i3.getHeight()));
        }
    }

    public /* synthetic */ md(Context context, khe khe) {
        this.a = 0;
        this.c = context;
        this.b = khe;
    }
}
