package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: vs1  reason: default package */
public final class vs1 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final khe e;
    public final je7 f;
    public final je7 g;
    public final je7 h;
    public final je7 i;
    public final je7 j = tu0.r(3, new dk1(22));
    public final je7 k = tu0.r(3, new dk1(23));

    public vs1(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75) {
        this.a = je74;
        this.b = je75;
        this.c = je73;
        this.d = je72;
        this.e = new khe(new z30(3, je72));
        this.f = tu0.r(3, new z30(4, je7));
        this.g = tu0.r(3, new z30(5, je7));
        this.h = tu0.r(3, new z30(6, je7));
        this.i = tu0.r(3, new z30(7, je7));
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [kua, java.lang.Object] */
    public static kua b(String str, String str2, Bitmap bitmap) {
        IconCompat iconCompat;
        if (!(!w9e.C0(str))) {
            str = w9e.C0(str2) ^ true ? str2 : "...";
        }
        if (bitmap != null) {
            iconCompat = new IconCompat(5);
            iconCompat.b = bitmap;
        } else {
            iconCompat = null;
        }
        ? obj = new Object();
        obj.a = str;
        obj.b = iconCompat;
        obj.c = null;
        obj.d = null;
        obj.e = false;
        obj.f = true;
        return obj;
    }

    public final void a() {
        hm9.m("CallsNotification", "cancel call notification", new Object[0]);
        e().b.cancel((String) null, 239);
        e().b.cancel((String) null, 240);
    }

    public final Notification c(Context context, y21 y21, boolean z, boolean z2) {
        hm9.m("CallsNotification", "createTempNotification", new Object[0]);
        CharSequence charSequence = y21.c;
        if (charSequence == null) {
            charSequence = (String) this.f.getValue();
        }
        String str = !z2 ? (String) this.i.getValue() : z ? (String) this.h.getValue() : (String) this.g.getValue();
        int intValue = z ? ((Number) this.k.getValue()).intValue() : ((Number) this.j.getValue()).intValue();
        ((bea) this.d.getValue()).m();
        ((p84) this.c.getValue()).getClass();
        bu9 bu9 = new bu9(context, "ru.oneme.app.new.activeCalls");
        bu9.k = -1;
        bu9.v = "call";
        bu9.F.icon = intValue;
        bu9.e = bu9.c(charSequence);
        bu9.f = bu9.c(str);
        return bu9.b();
    }

    public final ya1 d() {
        return (ya1) this.b.getValue();
    }

    public final pv9 e() {
        return (pv9) this.e.getValue();
    }
}
