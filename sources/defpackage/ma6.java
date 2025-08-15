package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import java.util.List;
import org.apache.http.HttpStatus;

/* renamed from: ma6  reason: default package */
public final class ma6 {
    public static final ssc q = ssc.m;
    public static final ssc r = ssc.l;
    public final Resources a;
    public int b = HttpStatus.SC_MULTIPLE_CHOICES;
    public float c = 0.0f;
    public Drawable d = null;
    public rsc e;
    public Drawable f;
    public rsc g;
    public Drawable h;
    public rsc i;
    public Drawable j;
    public rsc k;
    public rsc l;
    public Drawable m;
    public List n;
    public StateListDrawable o;
    public wnc p;

    public ma6(Resources resources) {
        this.a = resources;
        ssc ssc = q;
        this.e = ssc;
        this.f = null;
        this.g = ssc;
        this.h = null;
        this.i = ssc;
        this.j = null;
        this.k = ssc;
        this.l = r;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
    }

    public final la6 a() {
        List<Drawable> list = this.n;
        if (list != null) {
            for (Drawable drawable : list) {
                drawable.getClass();
            }
        }
        return new la6(this);
    }
}
