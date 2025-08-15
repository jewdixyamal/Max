package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* renamed from: ca8  reason: default package */
public final class ca8 {
    public final f98 a;
    public final i3b b;
    public final hd8 c;
    public final List d;
    public final CharSequence e;
    public final int f;
    public final int g;
    public final Bundle h;

    public ca8() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = Collections.emptyList();
        this.e = null;
        this.f = 0;
        this.g = 0;
        this.h = Bundle.EMPTY;
    }

    public ca8(f98 f98, i3b i3b, hd8 hd8, List list, CharSequence charSequence, int i, int i2, Bundle bundle) {
        this.a = f98;
        this.b = i3b;
        this.c = hd8;
        list.getClass();
        this.d = list;
        this.e = charSequence;
        this.f = i;
        this.g = i2;
        this.h = bundle == null ? Bundle.EMPTY : bundle;
    }

    public ca8(ca8 ca8) {
        this.a = ca8.a;
        this.b = ca8.b;
        this.c = ca8.c;
        this.d = ca8.d;
        this.e = ca8.e;
        this.f = ca8.f;
        this.g = ca8.g;
        this.h = ca8.h;
    }
}
