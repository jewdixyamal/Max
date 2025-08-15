package defpackage;

import android.os.Bundle;

/* renamed from: vec  reason: default package */
public final class vec {
    public final /* synthetic */ wec a;

    public vec(wec wec) {
        this.a = wec;
    }

    public final void a(Bundle bundle) {
        String string = bundle.getString("groupableTitle");
        wec wec = this.a;
        wec.g = string;
        wec.h = bundle.getString("transferableTitle");
    }
}
