package defpackage;

import android.view.View;

/* renamed from: y8c  reason: default package */
public final class y8c extends hqd {
    /* renamed from: E */
    public final void A(v8c v8c) {
        boolean z = v8c.Z;
        View view = this.a;
        if (z) {
            ((x8c) view).setAvatarShape(l5a.a);
        }
        ((x8c) view).setAvatar(v8c.c);
        ((x8c) view).setAbbreviation(oag.a(v8c.o, Long.valueOf(this.X)));
        ((x8c) view).setName(v8c.b);
        ((x8c) view).setVerified(v8c.Y);
        ((x8c) view).setOnline(v8c.X);
    }
}
