package defpackage;

import android.content.Context;
import android.util.TypedValue;

/* renamed from: w6a  reason: default package */
public final class w6a implements os0 {
    public final Context a;
    public final je7 b;
    public final khe c = new khe(new v6a(this, 0));
    public final fic d = new fic(new v6a(this, 1));

    public w6a(oe3 oe3, Context context, je7 je7) {
        this.a = context;
        this.b = je7;
        oe3.a(oe3.c | oe3.d, new c29(1, this));
    }

    public final int a() {
        return this.a.getResources().getConfiguration().orientation == 1 ? b() : b();
    }

    public final int b() {
        return wg0.m((float) 10, fk4.d().getDisplayMetrics().density, 2, ((Number) this.d.getValue()).intValue());
    }

    public final float c() {
        return TypedValue.applyDimension(2, ((Number) ((t4f) this.c.getValue()).a.getValue()).floatValue(), fk4.d().getDisplayMetrics()) + ck4.c(os2.e.g((du4) ((zaa) this.b.getValue()).a.getValue()), this.a);
    }
}
