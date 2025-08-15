package defpackage;

import android.content.Context;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: v5d  reason: default package */
public final class v5d {
    public final Context a;
    public final je7 b;
    public final je7 c;
    public final khe d;
    public final je7 e;
    public final fic f;
    public final fic g;

    public v5d(Context context, je7 je7, je7 je72, je7 je73, kqe kqe, int i) {
        this.a = context;
        this.b = je7;
        this.c = je72;
        this.d = new khe(new b29(i, 1));
        this.e = je73;
        this.f = new fic(new lwa(24, this));
        this.g = new fic(new zja(kqe, 17, this));
    }

    public static /* synthetic */ Layout b(v5d v5d, String str, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        return v5d.a(0, str, z);
    }

    public final Layout a(int i, CharSequence charSequence, boolean z) {
        khe khe = this.d;
        Layout layout = (Layout) ((mw7) khe.getValue()).c(charSequence);
        if (layout != null) {
            return layout;
        }
        je7 je7 = this.c;
        je7 je72 = this.b;
        fic fic = this.g;
        if (!z) {
            Layout b2 = ((fe7) je72.getValue()).a(charSequence, (TextPaint) fic.getValue(), ((w6a) ((os0) je7.getValue())).a() - i, 1, false, TextUtils.TruncateAt.END);
            ((mw7) khe.getValue()).d(charSequence, b2);
            return b2;
        }
        w8c w8c = new w8c(6);
        Layout g2 = i24.g(this.a, (fe7) je72.getValue(), charSequence, ((w6a) ((os0) je7.getValue())).a() - i, (TextPaint) fic.getValue(), w8c);
        ((mw7) khe.getValue()).d(charSequence, g2);
        return g2;
    }

    public final void c() {
        khe khe = this.d;
        if (khe.a()) {
            ((mw7) khe.getValue()).j(-1);
            this.f.reset();
            this.g.reset();
        }
    }

    public v5d(Context context, je7 je7, je7 je72, je7 je73) {
        this(context, je7, je72, je73, os2.i, 200);
    }
}
